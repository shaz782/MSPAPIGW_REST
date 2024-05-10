package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.invoker.SelfcareSubMgmtV1Invoker;
import com.xius.msp.api.messages.LoginRequest;
import com.xius.msp.api.messages.LoginResponse;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdRequest;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdResponse;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 30th Dec,2021 Description : From Here we will invoke the Selfcare APIs
 *        Services.
 */
@Component
public class LogInDetailsImpl {

	private static final Logger LOGGER = LogManager.getLogger(LogInDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SelfcareSubMgmtV1Invoker selfInvoker;

	@Autowired(required = true)
	public Utility utility;

	@Autowired(required = true)
	public AccountManagementInvoker ibaInvoker;

	String accountStatus = null;

	GetdemographicdtlsRequest agentRequest = null;
	LoginResponse response = null;
	MDNBasedGetNwIdRequest ibaRequest = null;
	MDNBasedGetNwIdResponse ibaResponse = null;

	GetdemographicdtlsResponse selfResponse = null;
	GetdemographicdtlsRequest selfRequest = null;

	public LoginResponse logIn(LoginRequest request) throws MSPAPIGWExceptions {

		ibaRequest = getIBARequest(request, headers);

		if (ibaRequest != null) {
			ibaResponse = ibaInvoker.mdnBasedGetNwId(ibaRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LogInDetailsImpl-logIn of MDNBasedGetNwIdRequest is Null");
		}
		if (ibaResponse != null && ibaResponse.getIdValue() != null) {
			
			selfRequest = getAgentRequest(request, headers, ibaResponse.getIdValue());

			if (selfRequest != null) {
				headers.setCarrierID(ibaResponse.getNetworkId() + "");
				selfResponse = selfInvoker.getSubDemographicDetails(selfRequest, headers);
				if (selfResponse != null) {
					response = setAgentResponse(selfResponse,ibaResponse.getIdValue());
					if (ibaResponse.getNetworkId() != null) {
						response.setCarrierID(ibaResponse.getNetworkId() + "");
					}
				} else {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("LogInDetailsImpl-logIn of Selfcare LoginResponse is Null");
				}
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("LogInDetailsImpl-logIn of Selfcare LoginRequest is Null");
			}
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LogInDetailsImpl-logIn of MDNBasedGetNwIdResponse is Null");
		}
		return response;
	}

	@SuppressWarnings("static-access")
	private LoginResponse setAgentResponse(GetdemographicdtlsResponse selfResponse,String IdValue) {

		response = new LoginResponse();

		if (selfResponse.getSubscriberDetails() != null) {

			if (selfResponse.getSubscriberDetails().getFirstName() != null) {
				response.setFirstName(selfResponse.getSubscriberDetails().getFirstName());
			}

			if (selfResponse.getSubscriberDetails().getIDType() != null) {
				response.setIdType(selfResponse.getSubscriberDetails().getIDType());
			}
			if (selfResponse.getSubscriberDetails().getIDNo() != null) {
				response.setIdValue(selfResponse.getSubscriberDetails().getIDNo());
			}
			response.setIdValue(IdValue);
		}
		String version = utility.getProperty("MSPAPI_Version");
		if (version != null) {
			response.setVersion(version);
		}
		response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
		response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
		response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

		return response;
	}

	private MDNBasedGetNwIdRequest getIBARequest(LoginRequest request, CommonHeaders headers) {

		if (request != null) {

			ibaRequest = new MDNBasedGetNwIdRequest();
			if (request.getMsisdn() != null)
				ibaRequest.setMSISDN(request.getMsisdn());

			if (request.getCarrierID() != null)
				headers.setCarrierID(request.getCarrierID());

			if (request.getUserName() != null)
				headers.setUserName(request.getUserName());

			if (request.getUserPassword() != null)
				headers.setUserPassword(request.getUserPassword());

		}

		return ibaRequest;
	}

	private GetdemographicdtlsRequest getAgentRequest(LoginRequest request, CommonHeaders headers, String IdValue) {

		if (request != null) {
			agentRequest = new GetdemographicdtlsRequest();
			if (IdValue != null)
				agentRequest.setIDNo(IdValue);

			if (request.getCarrierID() != null)
				headers.setCarrierID(request.getCarrierID());

			if (request.getUserName() != null)
				headers.setUserName(request.getUserName());

			if (request.getUserPassword() != null)
				headers.setUserPassword(request.getUserPassword());

		}

		return agentRequest;
	}

}
