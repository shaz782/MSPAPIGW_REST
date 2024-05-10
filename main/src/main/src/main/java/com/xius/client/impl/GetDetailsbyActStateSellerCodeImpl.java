package com.xius.client.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.BillingSubMgmtV1Invoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetSubsDetailsbyStateRequest;
import com.xius.rmsp.messages.GetSubsDetailsbyStateResponse;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetDetailsbyActStateSellerCodeImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetDetailsbyActStateSellerCodeImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BillingSubMgmtV1Invoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	String formate="dd/MM/yyyy";

	GetSubsDetailsbyStateResponse response = null;
	com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest agentRequest = null;
	com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse agentResponse = null;

	public GetSubsDetailsbyStateResponse getSubsDetailsbyState(GetSubsDetailsbyStateRequest getSubsDetailsbyStateRequest) throws MSPAPIGWExceptions{

		agentRequest = getAgentRequest(getSubsDetailsbyStateRequest, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getDetailsbyActStateSellerCode(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetDetailsbyActStateSellerCodeImpl-getSubsDetailsbyState of GetSubsDetailsbyStateRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetDetailsbyActStateSellerCodeImpl-getSubsDetailsbyState of GetDetailsbyActStateSellerCodeResponse is Null");
		}
		return response;
	}

	private GetSubsDetailsbyStateResponse setAgentResponse(com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse agentResponse) {

		response = new GetSubsDetailsbyStateResponse();
		
		if (agentResponse.getMSISDNSNo() != null) {
			List<String> msisdns=Arrays.asList(agentResponse.getMSISDNSNo()) ;
			response.setMsisdns(msisdns);
		}
		
		return response;
	}

	private com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest getAgentRequest(GetSubsDetailsbyStateRequest request, CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest();
			if (request.getExpEndDate() != null) {
				agentRequest.setExpEndDate(request.getExpEndDate());
			}
			if (request.getExpStartDate() != null) {
				agentRequest.setExpStartDate(request.getExpStartDate());
			}
			
			
			String betweenDays=utility.getProperty("Display_Days_For_Status");
			
			if(request.getExpEndDate()!= null && request.getExpStartDate()!=null ) {
				utility.dateComparision(request.getExpStartDate(),request.getExpEndDate(),formate);
			}
			
			String days=String.valueOf(utility.getDifferenceDays(utility.stringToDate(request.getExpStartDate(),formate), utility.stringToDate(request.getExpEndDate(),formate)));
			
			if(betweenDays !=null && Integer.parseInt(betweenDays)>0 && days !=null && Integer.parseInt(betweenDays) <= Integer.parseInt(days)) {
				throw new MSPAPIGWExceptions("96411", "please provide duration as LessThen or Equal of "+betweenDays+" days");
			}
			
			
			if (request.getSellerCode() != null) {
				agentRequest.setSellerCode(request.getSellerCode());
			}
			if (request.getSubState() != null) {
				agentRequest.setSubStatus(request.getSubState());
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
