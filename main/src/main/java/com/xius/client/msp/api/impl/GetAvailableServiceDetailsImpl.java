package com.xius.client.msp.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.SubscriberManagementAgentInvoker;
import com.xius.msp.api.messages.AvailableModuleDetails;
import com.xius.msp.api.messages.AvailableServiceDetails;
import com.xius.msp.api.messages.GetAvailableServiceDetailsRequest;
import com.xius.msp.api.messages.GetAvailableServiceDetailsResponse;
import com.xius.msp.billing.messages.SubscriberManagement.AttachedatpDtlsType;
import com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the
 *        InfinetBilling APIs AvailableServices.
 */
@Component
public class GetAvailableServiceDetailsImpl {

	private static final Logger LOGGER = LogManager.getLogger(GetAvailableServiceDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SubscriberManagementAgentInvoker invoker;

	@Autowired(required = true)
	public Utility utility;

	GetAvailableServiceDetailsResponse response = null;
	com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsRequest  agentRequest = null;
	com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse agentResponse = null;

	public GetAvailableServiceDetailsResponse getAvailableServiceDetails(GetAvailableServiceDetailsRequest getAvailableServiceDetailsRequest)
			throws MSPAPIGWExceptions {

		agentRequest = getAgentRequest(getAvailableServiceDetailsRequest, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getMsisdnAttachedATPDtls(agentRequest, headers);
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

	private GetAvailableServiceDetailsResponse setAgentResponse(
			com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse agentResponse) {

		// charge#planDescription#publicityId

		if (agentResponse != null) {
			response=new GetAvailableServiceDetailsResponse();
			List<AvailableModuleDetails> availablemoduledleDtlsType=new ArrayList<AvailableModuleDetails>();
			if(agentResponse.getAtpDtls()!=null) { 
			
			
			for(int i=0;i<agentResponse.getAtpDtls().length;i++) {
				
				AvailableModuleDetails availableModuleDetails=new AvailableModuleDetails();
				
				AttachedatpDtlsType attachedatpDtlsType=agentResponse.getAtpDtls()[i];
				
				
				if(attachedatpDtlsType.getCategory()!=null) {
					availableModuleDetails.setCategory(attachedatpDtlsType.getCategory());
				}
				if(attachedatpDtlsType.getCharge()!=null) {
					availableModuleDetails.setCharge(attachedatpDtlsType.getCharge());
				}
				if(attachedatpDtlsType.getEndDate()!=null) {
					availableModuleDetails.setEndDate(attachedatpDtlsType.getEndDate());
				}
				if(attachedatpDtlsType.getPublicityId()!=null) {
					availableModuleDetails.setPublicityId(attachedatpDtlsType.getPublicityId());
				}
				if(attachedatpDtlsType.getServicePackageDesc()!=null) {
					availableModuleDetails.setPlanDescription(attachedatpDtlsType.getServicePackageDesc());
				}
				if(attachedatpDtlsType.getStartDate()!=null) {
					availableModuleDetails.setStartDate(attachedatpDtlsType.getStartDate());
				}
				
				if(attachedatpDtlsType.getBktDtls()!=null) {
					
				 
					List<AvailableServiceDetails> services=new ArrayList<AvailableServiceDetails>() ;
					
					for(int j=0;j<attachedatpDtlsType.getBktDtls().length;j++) {
						AvailableServiceDetails availableServiceDetails=new AvailableServiceDetails();
						BktDtlsType bktDtlsType=attachedatpDtlsType.getBktDtls()[j];
					if(bktDtlsType.getBucket_available_unit()!=null) {
						availableServiceDetails.setUnits_remaining(bktDtlsType.getBucket_available_unit());
					}
					if(bktDtlsType.getBucket_category()!=null) {
						availableServiceDetails.setUnits_type(bktDtlsType.getBucket_category());
					}
					if(bktDtlsType.getBucket_credited_unit()!=null) {
						availableServiceDetails.setUnits_credited(bktDtlsType.getBucket_credited_unit());
					}
					services.add(availableServiceDetails);
					}
					availableModuleDetails.setServices(services);
					 
					
				}
				
				
				availablemoduledleDtlsType.add(availableModuleDetails);
			}
			
			}
				response.setModuledleDtlsType(availablemoduledleDtlsType);
				
		} else {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error("getAccountDetails-getActivePacks of agentResponse is Null");
			}
		}
		return response;
	}

	private com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsRequest getAgentRequest(
			GetAvailableServiceDetailsRequest request, CommonHeaders headers) {

		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsRequest();
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
