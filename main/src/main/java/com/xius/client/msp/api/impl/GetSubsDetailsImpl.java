package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xius.client.msp.api.invoker.BalanceManagementAgentInvoker;
import com.xius.msp.api.messages.GetSubsDetailsRequest;
import com.xius.msp.api.messages.GetSubsDetailsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;

@Component
public class GetSubsDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetAvailableDenomsImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private BalanceManagementAgentInvoker invoker;
	
	GetSubsDetailsResponse response = null;
	
	com.xius.msp.billing.messages.balanceManagement.GetSubsDetailsResponse agentResponse = null;
	com.xius.msp.billing.messages.balanceManagement.GetSubsDetailsRequest agentRequest = null;
	
	public GetSubsDetailsResponse getSubMsisdnDetails(GetSubsDetailsRequest getSubMsisdnDetailsRequest) throws MSPAPIGWExceptions {
	
		agentRequest = new com.xius.msp.billing.messages.balanceManagement.GetSubsDetailsRequest();
		
		agentRequest = getAgentRequest(getSubMsisdnDetailsRequest, headers);
		
		if (agentRequest != null) {
			agentResponse = invoker.getSubsDetails(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.info("GetSubMsisdnDetailsImpl-getSubMsisdnDetails of GetSubsDetailsRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.info("GetSubMsisdnDetailsImpl-getSubMsisdnDetails of GetSubsDetailsResponse is Null");
		}
		
		return response;
		
	}

	public GetSubsDetailsResponse setAgentResponse(com.xius.msp.billing.messages.balanceManagement.GetSubsDetailsResponse agentResponse) {
		
		response = new GetSubsDetailsResponse();
		
		
		
		if(agentResponse.getSubscriberState()!=null&&agentResponse.getSubscriberState().equalsIgnoreCase("AC")) {
			
			if(agentResponse.getMSISDN()!=null) {
				response.setMsisdn(agentResponse.getMSISDN());
			}
			if(agentResponse.getOperatorID()!=null) {
				response.setOperatorId(String.valueOf(agentResponse.getOperatorID()));
			}
			if(agentResponse.getSubscriberState()!=null) {
				response.setSubscriberState(agentResponse.getSubscriberState());
			}
			
			if(agentResponse.getOperatorName()!=null) {
				response.setOperatorName(agentResponse.getOperatorName());
			}
			if(agentResponse.getAccountType()!=null) {
				response.setAccountType(agentResponse.getAccountType());
			}
			if(agentResponse.getTransId()!=null) {
				response.setTransId(agentResponse.getTransId());
			}
			response.setResponseCode("0");
			response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
			response.setResponseStatus(MSPAPIGWConstants.SUCCESS);
			
		}else {
			response.setResponseCode("1");
			response.setResponseMessage("SubscriberState Not In AC");
			response.setResponseStatus(MSPAPIGWConstants.FAILURE);
		}
		
		return response;
		
	}
	
	public com.xius.msp.billing.messages.balanceManagement.GetSubsDetailsRequest getAgentRequest(GetSubsDetailsRequest request, 
			CommonHeaders headers){
		
			agentRequest = new com.xius.msp.billing.messages.balanceManagement.GetSubsDetailsRequest();
			
			if (request.getCarrierID() != null)
				headers.setCarrierID(request.getCarrierID());

			if (request.getUserName() != null)
				headers.setUserName(request.getUserName());

			if (request.getUserPassword() != null)
				headers.setUserPassword(request.getUserPassword());
						
			if (request.getMsisdn() != null) {
				agentRequest.setMSISDN(request.getMsisdn()) ;
			}
			if(request.getPrice()!=null) {
				agentRequest.setPrice(String.valueOf(request.getPrice()));
			}
			
		return agentRequest;
	}
	
}
