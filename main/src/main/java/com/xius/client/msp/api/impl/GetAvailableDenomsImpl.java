package com.xius.client.msp.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.BalanceManagementAgentInvoker;
import com.xius.msp.api.messages.DenominationDtls;
import com.xius.msp.api.messages.GetDenominationDetailsRequest;
import com.xius.msp.api.messages.GetDenominationDetailsResponse;
import com.xius.msp.billing.messages.balanceManagement.DenominationType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetAvailableDenomsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetAvailableDenomsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BalanceManagementAgentInvoker invoker;

	GetDenominationDetailsResponse response = null;
	com.xius.msp.billing.messages.balanceManagement.GetAvailableDenomsRequest agentRequest = null;
	com.xius.msp.billing.messages.balanceManagement.GetAvailableDenomsResponse agentResponse = null;

	public GetDenominationDetailsResponse getAvailableDenomsImpl(GetDenominationDetailsRequest GetDenominationDetailsRequest) throws MSPAPIGWExceptions{

		agentRequest = getAgentRequest(GetDenominationDetailsRequest, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getAvailableDenoms(agentRequest, headers);
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

	private GetDenominationDetailsResponse setAgentResponse(com.xius.msp.billing.messages.balanceManagement.GetAvailableDenomsResponse agentResponse) {

		response = new GetDenominationDetailsResponse();
		
		List<DenominationDtls> DenominationDtlsList =  new ArrayList<>();
		
		if (agentResponse.getDenominationList() != null) {
			for (int i=0;i<agentResponse.getDenominationList().length;i++) {
			
				DenominationType denominationType=new DenominationType();
				
				denominationType=agentResponse.getDenominationList(i);
				
				DenominationDtls DenominationDtls=new DenominationDtls();
				
				if(denominationType.getDenomination()!=null) {
					DenominationDtls.setDenomination(denominationType.getDenomination());
				}
				if(denominationType.getDenominationDesc()!=null  ) {
					DenominationDtls.setDescription(denominationType.getDenominationDesc());
				}
				if(denominationType.getTalkValue()!=null) {
					DenominationDtls.setTalkTime(denominationType.getTalkValue());
				}
				if(denominationType.getValidityPeriod()!=null) {
					DenominationDtls.setValidityPeriod(denominationType.getValidityPeriod());
				}
				 
				DenominationDtlsList.add(DenominationDtls);
				
				 
			 
			}
			response.setDenominationDtlsType(DenominationDtlsList);
		}else {
			response.setDenominationDtlsType(DenominationDtlsList);
		}
		
		return response;
	}

	private com.xius.msp.billing.messages.balanceManagement.GetAvailableDenomsRequest getAgentRequest(GetDenominationDetailsRequest request, CommonHeaders headers) {
		
		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.balanceManagement.GetAvailableDenomsRequest();
			
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
