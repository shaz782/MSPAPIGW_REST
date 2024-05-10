package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.ReportManagementInvoker;
import com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsRequest;
import com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetReActDeActReasonsRequest;
import com.xius.rmsp.messages.GetReActDeActReasonsResponse;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 15th April,2020 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetReActDeActReasonsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetReActDeActReasonsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private ReportManagementInvoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	GetReActDeActReasonsResponse response = null;
	GetDeactiveReasonsRequest agentRequest = null;
	GetDeactiveReasonsResponse agentResponse = null;

	public GetReActDeActReasonsResponse getReActDeActReasons(GetReActDeActReasonsRequest request) throws MSPAPIGWExceptions {
		
		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getDeactiveReasons(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetReActDeActReasonsImpl-getReActDeActReasons of GetDeactiveReasonsRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetReActDeActReasonsImpl-getReActDeActReasons of GetDeactiveReasonsResponse is Null");
		}
		return response;
	}

	private GetReActDeActReasonsResponse setAgentResponse(GetDeactiveReasonsResponse agentResponse) {
		
		response = new GetReActDeActReasonsResponse();
		
		if(agentResponse.getReasons()!=null && agentResponse.getReasons().length>0) {
			response.setReasons(agentResponse.getReasons());
		}
		return response;
	}

	private GetDeactiveReasonsRequest getAgentRequest(GetReActDeActReasonsRequest request, CommonHeaders headers) throws  MSPAPIGWExceptions {
		
		if (request != null) {
			agentRequest = new GetDeactiveReasonsRequest();
			
			if(request.getReasonCategory()!=null) {
				agentRequest.setReasonCategory(request.getReasonCategory());
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
