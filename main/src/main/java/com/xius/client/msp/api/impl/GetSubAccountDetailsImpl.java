package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.SubscriberManagementAgentInvoker;
import com.xius.msp.api.messages.GetAccountDetailsRequest;
import com.xius.msp.api.messages.GetAccountDetailsResponse;
import com.xius.msp.billing.messages.SubscriberManagement.AccountType;
import com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPRequest;
import com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;

/**
 * 
 * @author Ashsih.B
 * @since 4th Jan,2022 Description : From Here we will invoke the InfinetBilling
 *        APIs Services.
 */
@Component
public class GetSubAccountDetailsImpl {

	private static final Logger LOGGER = LogManager.getLogger(GetSubAccountDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SubscriberManagementAgentInvoker invoker;

	GetAccountDetailsResponse response = null;
	com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataRequest agentRequest = null;
	com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse agentResponse = null;

	public GetAccountDetailsResponse getAccountDetails(GetAccountDetailsRequest GetAccountDetailsRequest)
			throws MSPAPIGWExceptions {

		agentRequest = getAgentRequest(GetAccountDetailsRequest, headers);
		
		CheckCommercialTPRequest checkCommercialagentRequest=getCommercialAgentRequest(GetAccountDetailsRequest, headers);
		
		
		if (agentRequest != null) {
			agentResponse = invoker.getSubViewData(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("getAccountDetails-getActivePacks of GetActivePacksRequest is Null");
		}
		if (agentResponse != null) {
			CheckCommercialTPResponse	checkCommercialagentResponse=null;
				if(checkCommercialagentRequest!=null) {
					checkCommercialagentResponse = invoker.checkCommercialTP(checkCommercialagentRequest, headers);
			}

			response = setAgentResponse(agentResponse);
			
			if(checkCommercialagentResponse!=null) {
				if(checkCommercialagentResponse.getTpCategory().equalsIgnoreCase("Y")) {
					response.setAccountType("C");
				}
				else {
					response.setAccountType("N");
				}
			}
			
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("getAccountDetails-getActivePacks of GetActivePacksResponse is Null");
		}
		return response;
	}

	private GetAccountDetailsResponse setAgentResponse(
			com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse agentResponse) {

		response = new GetAccountDetailsResponse();

		if (agentResponse != null) {

			if (agentResponse.getAccountStatus() != null) {
				response.setAccountStatus(agentResponse.getAccountStatus());
			}
			if (agentResponse.getValidityDate() != null) {
				response.setValidityDate(agentResponse.getValidityDate());
			}
			if (agentResponse.getGraceperiod1() != null) {
				response.setGp1(agentResponse.getGraceperiod1());
			}
			if (agentResponse.getGraceperiod2() != null) {
				response.setGp2(agentResponse.getGraceperiod2());
			}
			if (agentResponse.getExpirationDate() != null) {
				response.setExpDate(agentResponse.getExpirationDate());
			}
			if (agentResponse.getPrepaidAccountBalance() != null) {
				response.setCoreBalance(agentResponse.getPrepaidAccountBalance());
			}

		}

		return response;
	}

	private com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataRequest getAgentRequest(
			GetAccountDetailsRequest request, CommonHeaders headers) {

		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataRequest();
			if (request.getMsisdn() != null) {
				AccountType account = new AccountType();
				account.setMSISDN(request.getMsisdn());
				agentRequest.setAccount(account);
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
	
	private  CheckCommercialTPRequest getCommercialAgentRequest(
			GetAccountDetailsRequest request, CommonHeaders headers) {
		CheckCommercialTPRequest aRequest = new  CheckCommercialTPRequest();
		if (request != null) {
			
			if (request.getMsisdn() != null) {
				aRequest.setMSISDN(request.getMsisdn()) ;
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

		return aRequest;
	}
}
