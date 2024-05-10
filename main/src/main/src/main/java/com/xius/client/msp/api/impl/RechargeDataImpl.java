package com.xius.client.msp.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.BalanceManagementAgentInvoker;
import com.xius.msp.api.messages.RechargeHistoryRequest;
import com.xius.msp.api.messages.RechargeHistoryResponse;
import com.xius.msp.api.messages.RechargeHstyDetails;
import com.xius.msp.billing.messages.balanceManagement.RechargeDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class RechargeDataImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(RechargeDataImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BalanceManagementAgentInvoker invoker;

	RechargeHistoryResponse response = null;
	com.xius.msp.billing.messages.balanceManagement.RechargeDetailsRequest agentRequest = null;
	com.xius.msp.billing.messages.balanceManagement.RechargeDetailsResponse agentResponse = null;

	public RechargeHistoryResponse rechargeDataImpl(RechargeHistoryRequest RechargeHistoryRequest) throws MSPAPIGWExceptions{

		agentRequest = getAgentRequest(RechargeHistoryRequest, headers);
		if (agentRequest != null) {
			agentResponse = invoker.rechargeData(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("rechargeDataImpl-getActivePacks of GetActivePacksRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("rechargeDataImpl-getActivePacks of GetActivePacksResponse is Null");
		}
		return response;
	}

	private RechargeHistoryResponse setAgentResponse(com.xius.msp.billing.messages.balanceManagement.RechargeDetailsResponse agentResponse) {

		response = new RechargeHistoryResponse();
		
		List<RechargeHstyDetails> rechargeHstyDetailsList =  new ArrayList<>();
		
		if (agentResponse.getRechargeDetails() != null) {
			for (int i=0;i<agentResponse.getRechargeDetails().length;i++) {
			
				RechargeDetailsType rechargeDetailsType=new RechargeDetailsType();
				
				rechargeDetailsType=agentResponse.getRechargeDetails(i);
				
				RechargeHstyDetails rechargeHstyDetails=new RechargeHstyDetails();
				
				if(rechargeDetailsType.getDenomination()!=null) {
					rechargeHstyDetails.setAmount(rechargeDetailsType.getDenomination());
				}
				if(rechargeDetailsType.getRemarks()!=null && !(rechargeDetailsType.getRemarks().equalsIgnoreCase("null"))) {
					rechargeHstyDetails.setRemarks(rechargeDetailsType.getRemarks());
				}
				if(rechargeDetailsType.getTransaction_date()!=null) {
					rechargeHstyDetails.setDate(rechargeDetailsType.getTransaction_date());
				}
				if(rechargeDetailsType.getUser_id()!=null) {
					rechargeHstyDetails.setUserName(rechargeDetailsType.getUser_id());
				}
				if(rechargeDetailsType.getStatus()!=null) {
					rechargeHstyDetails.setStatus(rechargeDetailsType.getStatus());
				}
				
				rechargeHstyDetailsList.add(rechargeHstyDetails);
				
				 
			 
			}
			response.setRechargeDetails(rechargeHstyDetailsList);
		}else {
			response.setRechargeDetails(rechargeHstyDetailsList);
		}
		
		return response;
	}

	private com.xius.msp.billing.messages.balanceManagement.RechargeDetailsRequest getAgentRequest(RechargeHistoryRequest request, CommonHeaders headers) {
		
		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.balanceManagement.RechargeDetailsRequest();
			if (request.getMsisdn() != null) {
				agentRequest.setMsisdn(request.getMsisdn());
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
