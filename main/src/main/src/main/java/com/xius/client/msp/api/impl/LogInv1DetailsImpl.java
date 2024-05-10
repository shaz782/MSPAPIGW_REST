package com.xius.client.msp.api.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.msp.api.invoker.SelfcareRegMgmtInvoker;
import com.xius.msp.api.messages.Loginv1Request;
import com.xius.msp.api.messages.Loginv1Response;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdRequest;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdResponse;
import com.xius.msp.selfcare.messages.registration.UserType;
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
public class LogInv1DetailsImpl {

	private static final Logger LOGGER = LogManager.getLogger(LogInDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SelfcareRegMgmtInvoker selfInvoker;

	@Autowired(required = true)
	public Utility utility;

	@Autowired(required = true)
	public AccountManagementInvoker ibaInvoker;

	String accountStatus = null;

	Loginv1Response response = null;
	MDNBasedGetNwIdRequest ibaRequest = null;
	MDNBasedGetNwIdResponse ibaResponse = null;
	com.xius.msp.selfcare.messages.registration.LoginResponse selfResponse = null;
	com.xius.msp.selfcare.messages.registration.LoginRequest selfRequest = null;

	public Loginv1Response logInv1(Loginv1Request request) throws MSPAPIGWExceptions {

		ibaRequest = getIBARequest(request, headers);

		if (ibaRequest != null) {
			ibaResponse = ibaInvoker.mdnBasedGetNwId(ibaRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LogInDetailsImpl-logIn of MDNBasedGetNwIdRequest is Null");
		}
		if (ibaResponse != null && ibaResponse.getIdValue() != null) {
			selfRequest = getSelfcareRequest(request, ibaResponse.getIdValue(), headers);
			if (selfRequest != null) {
				headers.setCarrierID(ibaResponse.getNetworkId()+"");
				selfResponse = selfInvoker.logIn(selfRequest, headers);
				if (selfResponse != null) {
					response = setAgentResponse(selfResponse,ibaResponse.getIdValue());
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
	private Loginv1Response setAgentResponse(com.xius.msp.selfcare.messages.registration.LoginResponse selfResponse,String IdValue) {

		response = new Loginv1Response();

		if (selfResponse.getNetWorkID() != null) {
			response.setCarrierID(String.valueOf(selfResponse.getNetWorkID()));
		}
		if (selfResponse.getFirstName() != null) {
			response.setFirstName(selfResponse.getFirstName());
		}
		if (selfResponse.getIDType() != null) {
			response.setIdType(selfResponse.getIDType());
		}
			response.setIdValue(IdValue);
			
		if (selfResponse.getLastLoginTime() != null) {
			Calendar cal = Calendar.getInstance();
			cal.add((selfResponse.getLastLoginTime()).DATE, 1);
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
			String formatted = format1.format(cal.getTime());
			response.setLastLoginTime(formatted);
		}
		String version = utility.getProperty("MSPAPI_Version");
		 if(version!=null) {
		response.setVersion(version);
		 }
		response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
		response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
		response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

		return response;
	}

	private com.xius.msp.selfcare.messages.registration.LoginRequest getSelfcareRequest(Loginv1Request request,
			String idValue, CommonHeaders headers) {

		selfRequest = new com.xius.msp.selfcare.messages.registration.LoginRequest();

		selfRequest.setUserType(UserType.value1);
		selfRequest.setPassword(headers.getUserPassword());
		selfRequest.setUserID(idValue);
		selfRequest.setNetworkName(request.getNetworkName());

		return selfRequest;
	}

	private MDNBasedGetNwIdRequest getIBARequest(Loginv1Request request, CommonHeaders headers) {

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

}
