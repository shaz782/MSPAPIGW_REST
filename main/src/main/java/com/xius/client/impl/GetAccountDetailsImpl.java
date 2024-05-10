package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.BillingSubMgmtV1Invoker;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetAccountDetailsRequest;
import com.xius.rmsp.messages.GetAccountDetailsResponse;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetAccountDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetAccountDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BillingSubMgmtV1Invoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	String accountStatus =null;

	GetAccountDetailsResponse response = null;
	GetAcctDetailsRequest agentRequest = null;
	GetAcctDetailsResponse agentResponse = null;

	public GetAccountDetailsResponse getAccountDetails(GetAccountDetailsRequest request) throws MSPAPIGWExceptions  {

		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getAccountDetails(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetAccountDetailsImpl-getAccountDetails of GetAcctDetailsRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetAccountDetailsImpl-getAccountDetails of GetAcctDetailsResponse is Null");
		}
		return response;
	}

	private GetAccountDetailsResponse setAgentResponse(GetAcctDetailsResponse agentResponse) {
		
		response = new GetAccountDetailsResponse();
		
		if (agentResponse.getSIMNo() != null) {
			response.setIccid(agentResponse.getSIMNo());
		}
		if (agentResponse.getMSISDN() != null) {
			response.setMsisdn(agentResponse.getMSISDN());
		}
		if (agentResponse.getIMSINo() != null) {
			response.setImsi(agentResponse.getIMSINo());
		}
		
		if (agentResponse.getAcctID() != null) {
			response.setAccountId(String.valueOf(agentResponse.getAcctID()));
		}
		if (agentResponse.getIdValue() != null) {
			response.setIdValue(agentResponse.getIdValue());
		}
		if (agentResponse.getAccountBalance() != null) {
			response.setAccountBalance(String.valueOf(agentResponse.getAccountBalance()));
		}
		if (agentResponse.getAccountStatus() != null) {
			response.setAccountStatus(agentResponse.getAccountStatus());
		}
		if (agentResponse.getAccountType() != null) {
			response.setAccountType(agentResponse.getAccountType());
		}
		if (agentResponse.getAccountValidity() != null) {
			response.setAccountValidity(agentResponse.getAccountValidity());
		}
		if (agentResponse.getActivationDate() != null) {
			response.setActivationDate(agentResponse.getActivationDate());
		}
		if (agentResponse.getTariffPackName() != null) {
			response.setTariffPackName(agentResponse.getTariffPackName());
		}
		if (agentResponse.getTariffPackValidity() != null) {
			response.setTariffPackValidity(agentResponse.getTariffPackValidity());
		}
		if (agentResponse.getSellerCode() != null) {
			response.setSellerCode(agentResponse.getSellerCode());
		}
		return response;
	}

	private GetAcctDetailsRequest getAgentRequest(GetAccountDetailsRequest request, CommonHeaders headers) {
		
		if (request != null) {
			agentRequest = new GetAcctDetailsRequest();
			if (request.getIccid() != null) 
				agentRequest.setSIMNo(request.getIccid());
			if (request.getMsisdn() != null) 
				agentRequest.setMSISDN(request.getMsisdn());
			
			if (request.getAccountId() != null) 
				agentRequest.setAcctID(Long.valueOf(request.getAccountId()));
			
			accountStatus = utility.getProperty("account.status");
			
				if(accountStatus!=null && accountStatus.length()>0) {
					agentRequest.setStatus(accountStatus);
				}else {
					if(LOGGER.isInfoEnabled())
						LOGGER.info("account_status is Null/Not Configured in Properties");
				}
			
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
