package com.xius.client.msp.api.impl;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerRequest;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateRequest;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse;
import com.xius.client.invoker.SMFManagementInvoker;
import com.xius.client.msp.api.invoker.SelfcareRegMgmtInvoker;
import com.xius.msp.api.messages.ChangePasswordRequest;
import com.xius.msp.api.messages.ChangePasswordResponse;
import com.xius.msp.selfcare.messages.registration.OperationType;
import com.xius.msp.selfcare.messages.registration.UserType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 23rd Jan,2022 Description : From Here we will invoke the Selfcare APIs
 *        Services.
 */
@Component
public class ChangePasswordImpl {

	private static final Logger LOGGER = LogManager.getLogger(ChangePasswordImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SelfcareRegMgmtInvoker selfInvoker;
	
	@Autowired(required = true)
	private SMFManagementInvoker smfIvoker;

	@Autowired(required = true)
	public Utility utility;
	
	TransactionTrackerRequest smfRequest = null;
	TransactionTrackerResponse smfResponse = null;
	
	TransactionTrackerUpdateRequest trackUpdateRequest = null;
	TransactionTrackerUpdateResponse trackerUpdateResponse = null;

	ChangePasswordResponse response = null;
	com.xius.msp.selfcare.messages.registration.ResetUserCredentialsResponse selfResponse = null;
	com.xius.msp.selfcare.messages.registration.ResetUserCredentialsRequest selfRequest = null;

	public ChangePasswordResponse changePassword(ChangePasswordRequest request) throws MSPAPIGWExceptions {
		
		smfRequest = getSmfAgentRequest(request);
		if (smfRequest != null) {
			smfResponse = smfIvoker.transactionTracker(smfRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ChangePasswordImpl-changePassword of TransactionTrackerRequest is Null");
		}
		
		selfRequest = getSelfcareRequest(request, headers);
		
		if (smfResponse!=null && smfResponse.getTransId()!=null ) {
			selfResponse = selfInvoker.resetUserCredentials(selfRequest, headers);
			if (selfResponse != null) {
					
					trackUpdateRequest = new TransactionTrackerUpdateRequest();
					
					trackUpdateRequest.setActivityType(smfRequest.getActivityType());
					trackUpdateRequest.setStatus(MSPAPIGWConstants.SUCCESS);
					trackUpdateRequest.setTransactionId(smfResponse.getTransId());
					trackUpdateRequest.setRemarks(MSPAPIGWConstants.SUCCESS);	
					
					trackerUpdateResponse = smfIvoker.trackUpdate(trackUpdateRequest, headers);
					if (trackerUpdateResponse == null) {
						LOGGER.error("ChangePasswordImpl-changePassword of TransactionTrackerUpdateResponse is Null");
					}
				response = setAgentResponse(selfResponse,request);
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("ChangePasswordImpl-changePassword of Selfcare ResetUserCredentialsResponse is Null");
			}
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ChangePasswordImpl-changePassword of Selfcare TransactionTrackerResponse is Null");
		}
		return response;
	}

	private ChangePasswordResponse setAgentResponse(com.xius.msp.selfcare.messages.registration.ResetUserCredentialsResponse selfResponse, ChangePasswordRequest request) {

		response = new ChangePasswordResponse();

		if (selfResponse.getMessage()!=null && selfResponse.getMessage().equalsIgnoreCase(MSPAPIGWConstants.SUCCESS)) {
			response.setOldPassword(request.getUserPassword());
			response.setNewPassword(request.getNewPassword());
			
			response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
			response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
		}else {
		
		response.setResponseCode(MSPAPIGWConstants.INTERNAL_SERVER_ERROR);
		response.setResponseStatus(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		response.setResponseMessage(MSPAPIGWConstants.FAILURE);
		}
		return response;
	}

	private com.xius.msp.selfcare.messages.registration.ResetUserCredentialsRequest 
	                     getSelfcareRequest(ChangePasswordRequest request,CommonHeaders headers) {

		selfRequest = new com.xius.msp.selfcare.messages.registration.ResetUserCredentialsRequest();
		selfRequest.setUserType(UserType.value1);
		selfRequest.setIDType(request.getIdType());
		selfRequest.setUserID(request.getIdValue());
		selfRequest.setIDNo(request.getIdValue());
		selfRequest.setMSISDN(request.getUserName());
		selfRequest.setNewPassword(request.getNewPassword());
		selfRequest.setOldPassword(headers.getUserPassword());
		selfRequest.setOperationType(OperationType.CHANGE_PWD);

		return selfRequest;
	}
	
	private TransactionTrackerRequest getSmfAgentRequest(ChangePasswordRequest request) {
		if (request != null) {
			smfRequest = new TransactionTrackerRequest();
			
			smfRequest.setIDvalue(request.getIdValue());
			smfRequest.setActivityType("130"); // 130 --- RESET PASSWORD
			Random random = new Random();
			int randomWithNextInt = random.nextInt();
			smfRequest.setTransRefNumber(String.valueOf(System.currentTimeMillis()+randomWithNextInt));
			smfRequest.setUserId(request.getIdValue());
			if(request.getChannel()!=null) {
				smfRequest.setChannelId(request.getChannel());
			}else {
			smfRequest.setChannelId(utility.getProperty("channel"));
			}
			smfRequest.setMSISDN(request.getUserName());
			smfRequest.setReason("Change Password");
			
			if (request.getCarrierID() != null) 
				headers.setCarrierID(request.getCarrierID());
			
			if (request.getUserName() != null) 
				headers.setUserName(request.getUserName());
			
			if (request.getUserPassword() != null) 
				headers.setUserPassword(request.getUserPassword());
			
		}
		return smfRequest;
	}
	

}
