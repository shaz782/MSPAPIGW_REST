package com.xius.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.BillingSubMgmtV1Invoker;
import com.xius.msp.billing.messages.SubscriberManagementV1.PackDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetActivePackDetailsRequest;
import com.xius.rmsp.messages.GetActivePackDetailsResponse;
import com.xius.rmsp.messages.PackDetails;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetActivePackDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetActivePackDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BillingSubMgmtV1Invoker invoker;

	GetActivePackDetailsResponse response = null;
	com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest agentRequest = null;
	com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse agentResponse = null;

	public GetActivePackDetailsResponse getActivePacks(GetActivePackDetailsRequest getActivePackDetailsRequest) throws MSPAPIGWExceptions{

		agentRequest = getAgentRequest(getActivePackDetailsRequest, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getActivePacks(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetActivePackDetailsImpl-getActivePacks of GetActivePacksRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetActivePackDetailsImpl-getActivePacks of GetActivePacksResponse is Null");
		}
		return response;
	}

	private GetActivePackDetailsResponse setAgentResponse(com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse agentResponse) {

		response = new GetActivePackDetailsResponse();
		PackDetails packDetails=null;
		List<PackDetails> packDetailsList =  new ArrayList<>();
		if (agentResponse.getPackDetailslist() != null) {
			for (PackDetailsType packDetailsLT : agentResponse.getPackDetailslist()) {
				packDetails=new PackDetails();
				if(packDetailsLT.getPackName()!=null)
					packDetails.setPackName(packDetailsLT.getPackName());
				if(packDetailsLT.getPublicityId()!=null)
					packDetails.setPublicityID(packDetailsLT.getPublicityId());
				if(packDetailsLT.getPackType()!=null)
					packDetails.setPackType(packDetailsLT.getPackType());
				if(packDetailsLT.getPackExpDate()!=null)
					packDetails.setPackExpDate(packDetailsLT.getPackExpDate());
				packDetailsList.add(packDetails);
			}
			response.setPackDetails(packDetailsList);
		}else {
			response.setPackDetails(packDetailsList);
		}
		
		return response;
	}

	private com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest getAgentRequest(GetActivePackDetailsRequest request, CommonHeaders headers) {
		
		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest();
			if (request.getMsisdn() != null) {
				agentRequest.setMSISDN(request.getMsisdn());
			}
			if (request.getAccountId() != null) {
				agentRequest.setAcctID(Long.valueOf(request.getAccountId()));
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
