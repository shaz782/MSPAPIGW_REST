package com.xius.client.impl;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.BalanceManagementInvoker;
import com.xius.msp.billing.messages.balanceManagement.IssueLoanRequest;
import com.xius.msp.billing.messages.balanceManagement.IssueLoanResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetLoanRequest;
import com.xius.rmsp.messages.GetLoanResponse;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetLoanImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetLoanImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BalanceManagementInvoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	String accountStatus =null;

	GetLoanResponse response = null;
	IssueLoanRequest agentRequest = null;
	IssueLoanResponse agentResponse = null;

	public GetLoanResponse getLoan(GetLoanRequest request) throws MSPAPIGWExceptions  {

		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.issueLoan(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetLoanImpl-getLoan of IssueLoanRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetLoanImpl-getLoan of IssueLoanResponse is Null");
		}
		return response;
	}

	private GetLoanResponse setAgentResponse(IssueLoanResponse agentResponse) {
		
		response = new GetLoanResponse();
		
		if (agentResponse.getAmount() != null) {
			response.setLoanAmount(agentResponse.getAmount().toString());
		}
		return response;
	}

	private IssueLoanRequest getAgentRequest(GetLoanRequest request, CommonHeaders headers) {
		
		if (request != null) {
			agentRequest = new IssueLoanRequest();
			
			if (request.getMsisdn() != null) 
				agentRequest.setMSISDN(request.getMsisdn());
			
			if (request.getAmount() != null) 
				agentRequest.setAmount(new BigDecimal(request.getAmount()));
			if (request.getTransRefNo() != null) 
				agentRequest.setExternalTransID(request.getTransRefNo());
			
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
