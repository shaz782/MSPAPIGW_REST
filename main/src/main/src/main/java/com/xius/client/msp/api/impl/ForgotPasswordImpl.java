package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.msp.api.invoker.SelfcareSubMgmtInvoker;
import com.xius.client.msp.api.invoker.XBusSubscriberInvoker;
import com.xius.msp.api.messages.ForgotPasswordRequest;
import com.xius.msp.api.messages.ForgotPasswordResponse;
import com.xius.msp.api.messages.GetSubDemographicDetailsRequest;
import com.xius.msp.api.messages.LoginRequest;
import com.xius.msp.api.messages.LoginResponse;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdRequest;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdResponse;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoRequest;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

import net.bcgi.si.messages.mvnoapi.common.ErrorData;
import net.bcgi.si.messages.mvnoapi.common.PersonalIdentityType;
import net.bcgi.si.messages.mvnoapi.subscriber.UserIdentificationData;

@Component
public class ForgotPasswordImpl {

	private static final Logger LOGGER = LogManager.getLogger(ForgotPasswordImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private XBusSubscriberInvoker invoker;

	@Autowired(required = true)
	public Utility utility;
	
	ForgotPasswordResponse response = null;

	net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordRequest xBusRequest = null;
	net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse xBusResponse = null;

	String transId = null;

	@Autowired(required = true)
	public AccountManagementInvoker ibaInvoker;

	@Autowired(required = true)
	private SelfcareSubMgmtInvoker selfcareinvoker;
	
	MDNBasedGetNwIdRequest ibaRequest = null;
	MDNBasedGetNwIdResponse ibaResponse = null;
	
	GetSubscriberProfileInfoRequest selfcareagentRequest = null;
	GetSubscriberProfileInfoResponse selfcareagentResponse = null;
	
	public ForgotPasswordResponse forgotPassword(ForgotPasswordRequest forgotPasswordRequest)
			throws MSPAPIGWExceptions {
		
		ibaRequest = getIBARequest(forgotPasswordRequest, headers);
		
		if (ibaRequest != null) {
			ibaResponse = ibaInvoker.mdnBasedGetNwId(ibaRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LogInDetailsImpl-logIn of MDNBasedGetNwIdRequest is Null");
		}
		if (ibaResponse != null && ibaResponse.getIdValue() != null) {
			
			selfcareagentRequest =  getselfcareAgentRequest(forgotPasswordRequest, headers,ibaResponse.getIdValue());
		
			selfcareagentResponse = selfcareinvoker.getSubProfileInfoDetails(selfcareagentRequest, headers);
		String IdType=null;
			if(selfcareagentResponse.getSubscriberDetails()!=null) {
				GetSubDetCursorType[] getSubDetCursorTypeArr =selfcareagentResponse.getSubscriberDetails();
				for(int i=0;i<getSubDetCursorTypeArr.length;i++) {
					GetSubDetCursorType getSubDetCursorType=getSubDetCursorTypeArr[i];
					IdType=getSubDetCursorType.getIDType();
				}
				
			}
			xBusRequest = getAgentRequest(forgotPasswordRequest, headers,ibaResponse.getIdValue(),IdType);
		if (xBusRequest != null) {
			xBusResponse = invoker.ForgotPassword(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("forgotPasswordImpl-forgotPassword of xBus ForgotPasswordRequest is Null");
		}
		}
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("forgotPasswordImpl-forgotPassword of IBA MDNBasedGetNwIdResponse is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("forgotPasswordImpl-forgotPassword of xBus ForgotPasswordResponse is Null");
		}

		return response;
	}

	private GetSubscriberProfileInfoRequest getselfcareAgentRequest(ForgotPasswordRequest request, CommonHeaders headers,String Idvalue) {

		if (request != null) {

			selfcareagentRequest = new GetSubscriberProfileInfoRequest();
			if (Idvalue != null)
				selfcareagentRequest.setIDNo(Idvalue);

			 

			if (request.getCarrierID() != null)
				headers.setCarrierID(request.getCarrierID());

			if (request.getUserName() != null)
				headers.setUserName(request.getUserName());

			if (request.getUserPassword() != null)
				headers.setUserPassword(request.getUserPassword());

		}

		return selfcareagentRequest;
	}
	
	private ForgotPasswordResponse setAgentResponse(
			net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse xBusResponse) throws MSPAPIGWExceptions {

		if (xBusResponse != null) {
			response = new ForgotPasswordResponse();

			if (xBusResponse.getStatusCode() != null
					&& (xBusResponse.getStatusCode().getValue().equalsIgnoreCase("success")
							|| xBusResponse.getStatusCode().getValue().equalsIgnoreCase("WARNING"))) {
				if (LOGGER.isInfoEnabled())
					LOGGER.info("ForgotPasswordInvoker  ForgotPasswordResponse Status Code:"
							+ xBusResponse.getStatusCode().getValue());
				if (xBusResponse.getStatusCode().getValue() != null) {
					response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
					response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				}

				return response;
			}
			// If ERROR from xbus then transaction id

			if (xBusResponse.getStatusCode().getValue().equalsIgnoreCase("ERROR")) {

				String errorCode = null;
				String errorMessage = null;

				ErrorData[] errors = xBusResponse.getErrors();
				for (int i = 0; i < errors.length; i++) {

					errorCode = errors[i].getErrorCode();
					errorMessage = errors[i].getErrorMessage();
				}

				if (LOGGER.isInfoEnabled())
					LOGGER.info("ForgotPasswordInvoker  ForgotPasswordResponse Error Code :" + errorCode);
				if (LOGGER.isInfoEnabled())
					LOGGER.info("ForgotPasswordInvoker  ForgotPasswordResponse Error Msg :" + errorMessage);

				if (xBusResponse.getStatusCode().getValue() != null) {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("Exception ::" + errorCode + "#" + errorMessage);

					throw new MSPAPIGWExceptions(errorCode, errorMessage);

				}
				if (errorCode != null && (errorCode.equals("29055") || errorCode.equals("10017"))) {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("we get \"29055\" error code when xml engine is down");
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
							MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
				} else {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("Exception ::" + errorCode + "#" + errorMessage);
					throw new MSPAPIGWExceptions(errorCode, errorMessage);
				}
			}
		}
		return response;
	}

	private net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordRequest getAgentRequest(ForgotPasswordRequest request,
			CommonHeaders headers,String IdValue,String IdType) throws MSPAPIGWExceptions {

		if (request.getMsisdn() == null) {
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "MSISDN Number Can't be Null");
		}

		xBusRequest = new net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordRequest();
		UserIdentificationData idendata = new UserIdentificationData();
		idendata.setPersonalIdentityType(PersonalIdentityType.MYKAD_ID);
		if (request.getMsisdn() != null) {
			idendata.setMDN(request.getMsisdn());
		} else {
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "MSISDN Number Can't be Null");
		}
		
		if (utility.getProperty("selfcare.networkName") != null) {
			xBusRequest.setCarrierName(utility.getProperty("selfcare.networkName"));
		} else {
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "MSISDN Number Can't be Null");
		}

		if (IdType != null) {
			idendata.setPersonalIdType(IdType);
		} else {
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "No DATA FOUND");
		}

		if (IdValue != null) {
			idendata.setPersonalIdentificationNumber(IdValue);
		} else {
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "No DATA FOUND");
		}
		xBusRequest.setUserIdentificationData(idendata);

		if (request.getCarrierID() != null) {
			headers.setCarrierID(request.getCarrierID());
		}
		if (request.getUserName() != null) {
			headers.setUserName(request.getUserName());
		}
		if (request.getUserPassword() != null) {
			headers.setUserPassword(request.getUserPassword());
		}

		return xBusRequest;
	}
	private MDNBasedGetNwIdRequest getIBARequest(ForgotPasswordRequest request, CommonHeaders headers) {

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
