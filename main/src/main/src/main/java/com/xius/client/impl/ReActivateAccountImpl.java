package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerRequest;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateRequest;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse;
import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.invoker.SMFManagementInvoker;
import com.xius.msp.billing.messages.accountManagement.AccountType;
import com.xius.msp.billing.messages.accountManagement.OperationType;
import com.xius.msp.billing.messages.accountManagement.UpdateActStatusRequest;
import com.xius.msp.billing.messages.accountManagement.UpdateActStatusResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.ReActivateAccountRequest;
import com.xius.rmsp.messages.ReActivateAccountResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 17th April,2020 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class ReActivateAccountImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(ReActivateAccountImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private AccountManagementInvoker invoker;
	
	@Autowired(required = true)
	private SMFManagementInvoker smfIvoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	ReActivateAccountResponse response = null;
	
	UpdateActStatusRequest agentRequest = null;
	UpdateActStatusResponse agentResponse = null;
	
	TransactionTrackerRequest smfRequest = null;
	TransactionTrackerResponse smfResponse = null;
	
	TransactionTrackerUpdateRequest trackUpdateRequest = null;
	TransactionTrackerUpdateResponse trackerUpdateResponse = null;
	
	
	String transId = null;

	public ReActivateAccountResponse reActivateAccount(ReActivateAccountRequest request) throws MSPAPIGWExceptions {
		
		agentRequest = getAgentRequest(request, headers);
		smfRequest = getSmfAgentRequest(request);
		if (smfRequest != null) {
			smfResponse = smfIvoker.transactionTracker(smfRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ReActivateAccountImpl-reActivateAccount of TransactionTrackerRequest is Null");
		}
		if(smfResponse!=null && smfResponse.getTransId()!=null) {
			if (agentRequest != null) {
				try {
					agentResponse = invoker.updateActStatus(agentRequest, headers);
					if(agentResponse!=null && agentResponse.getRefTransId()!=null) {
						
						trackUpdateRequest = new TransactionTrackerUpdateRequest();
						
						trackUpdateRequest.setActivityType(smfRequest.getActivityType());
						trackUpdateRequest.setStatus(MSPAPIGWConstants.SUCCESS);
						trackUpdateRequest.setTransactionId(smfResponse.getTransId());
						trackUpdateRequest.setRemarks(MSPAPIGWConstants.SUCCESS);	
						
						trackerUpdateResponse = smfIvoker.trackUpdate(trackUpdateRequest, headers);
						if (trackerUpdateResponse == null) {
							LOGGER.error("ReActivateAccountImpl-reActivateAccount-SUCCESS- of TransactionTrackerUpdateResponse is Null");
						}
						response = setAgentResponse(agentResponse);
						
					}
				}catch (MSPAPIGWExceptions e) {
					
					trackUpdateRequest = new TransactionTrackerUpdateRequest();
					
					trackUpdateRequest.setActivityType(smfRequest.getActivityType());
					trackUpdateRequest.setStatus(MSPAPIGWConstants.FAILURE);
					trackUpdateRequest.setTransactionId(smfResponse.getTransId());
					trackUpdateRequest.setRemarks(e.getErrorCode()+"::"+e.getErrorMessage());	
					
					trackerUpdateResponse = smfIvoker.trackUpdate(trackUpdateRequest, headers);
					if (trackerUpdateResponse == null) {
							LOGGER.error("ReActivateAccountImpl-reActivateAccount-FAILURE- of TransactionTrackerUpdateResponse is Null");
					}
					throw new MSPAPIGWExceptions(e.getErrorCode(),e.getErrorMessage());
					
				}
			} else {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("ReActivateAccountImpl-reActivateAccount of UpdateActStatusRequest is Null");
			}
			}else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("ReActivateAccountImpl-reActivateAccount of TransactionTrackerResponse is Null");
	
			}
		return response;
	}

	private TransactionTrackerRequest getSmfAgentRequest(ReActivateAccountRequest request) {
		if (request != null) {
			smfRequest = new TransactionTrackerRequest();
			
			smfRequest.setMSISDN(request.getMsisdnNo());
			smfRequest.setAccountId(request.getAccountId());
			smfRequest.setActivityType("134"); // 134 --- ReActivate ACCOUNT
			smfRequest.setTransRefNumber(request.getTarnsationID());
			
			smfRequest.setChannelId(utility.getProperty("channel"));
			
			smfRequest.setReason(request.getReason());
			
			if (request.getCarrierID() != null) 
				headers.setCarrierID(request.getCarrierID());
			
			if (request.getUserName() != null) 
				headers.setUserName(request.getUserName());
			
			if (request.getUserPassword() != null) 
				headers.setUserPassword(request.getUserPassword());
			
		}
		return smfRequest;
	}
	
	private ReActivateAccountResponse setAgentResponse(UpdateActStatusResponse agentResponse) {
		
		response = new ReActivateAccountResponse();
		
		if(agentResponse.getRefTransId()!=null) {
			response.setTarnsationRefNo(agentResponse.getRefTransId());
		}
		if(agentResponse.getRefTransId()!=null) {
			response.setTarnsationRefNo(agentResponse.getRefTransId());
		}
		
		if(transId!=null) {
			response.setTarnsationID(transId);
		}
		return response;
	}

	private UpdateActStatusRequest getAgentRequest(ReActivateAccountRequest request, CommonHeaders headers) throws  MSPAPIGWExceptions {
		
		if (request != null) {
			agentRequest = new UpdateActStatusRequest();
			
			AccountType accountType=new AccountType();
			accountType.setMSISDN(request.getMsisdnNo());
			agentRequest.setAccount(accountType);
			agentRequest.setOperationType(OperationType.REACTIVATE);
			transId=request.getTarnsationID();
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
