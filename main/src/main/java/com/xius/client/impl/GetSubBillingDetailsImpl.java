package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.BillingSubMgmtV1Invoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetSubBillingDetailsRequest;
import com.xius.rmsp.messages.GetSubBillingDetailsResponse;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetSubBillingDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetSubBillingDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BillingSubMgmtV1Invoker invoker;

	GetSubBillingDetailsResponse response = null;
	com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest agentRequest = null;
	com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse agentResponse = null;

	public GetSubBillingDetailsResponse getSubBillingDetails(GetSubBillingDetailsRequest getSubBillingDetailsRequest) throws MSPAPIGWExceptions{

		agentRequest = getAgentRequest(getSubBillingDetailsRequest, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getSubBillingDetails(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetSubBillingDetailsImpl-getSubBillingDetails of GetSubBillingDetailsRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetSubBillingDetailsImpl-getSubBillingDetails of GetSubBillingDetailsResponse is Null");
		}
		return response;
	}

	private GetSubBillingDetailsResponse setAgentResponse(com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse agentResponse) {

		response = new GetSubBillingDetailsResponse();
		
		if (agentResponse.getMSISDN() != null) {
			response.setMsisdn(agentResponse.getMSISDN());
		}
		if (agentResponse.getAcctID() != null) {
			response.setAccountId(String.valueOf(agentResponse.getAcctID()));
		}
		if (agentResponse.getICCID() != null) {
			response.setIccid(agentResponse.getICCID());
		}
		if (agentResponse.getIdValue() != null) {
			response.setIdValue(agentResponse.getIdValue());
		}
		if (agentResponse.getAccountBalance() != null) {
			response.setAccountBalance(agentResponse.getAccountBalance().toString());
		}
		if (agentResponse.getAccountStatus() != null) {
			response.setAccountStatus(agentResponse.getAccountStatus());
		}
		if (agentResponse.getAccountValidity() != null) {
			response.setAccountValidity(agentResponse.getAccountValidity());
		}
		if (agentResponse.getAccountExpDate() != null) {
			response.setAccountExpDate(agentResponse.getAccountExpDate());
		}
		if (agentResponse.getTariffPackName() != null) {
			response.setPackName(agentResponse.getTariffPackName());
		}
		if (agentResponse.getTariffPackValidity() != null) {
			response.setPackExpDate(agentResponse.getTariffPackValidity());
		}
		
		return response;
	}

	private com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest getAgentRequest(GetSubBillingDetailsRequest request, CommonHeaders headers) {
		
		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest();
			if (request.getMsisdn() != null) {
				agentRequest.setMSISDN(request.getMsisdn());
			}
			if (request.getAccountId() != null) {
				agentRequest.setAcctID(Long.valueOf(request.getAccountId()));
			}
			if (request.getSellerCode() != null) {
				agentRequest.setSellerCode(request.getSellerCode());
			}
			if (request.getCarrierID() != null) {
				headers.setCarrierID(request.getCarrierID());
			}
			if (request.getUserName() != null) {
				headers.setUserName(request.getUserName());
			}
			if (request.getUserPassword() != null) {
				headers.setUserPassword(request.getUserPassword());
			}
		}

		return agentRequest;
	}
}
