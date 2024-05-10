package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.SelfcareSubMgmtV1Invoker;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetSubDemographicDetailsRequest;
import com.xius.rmsp.messages.GetSubDemographicDetailsResponse;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class GetSubDemographicDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GetSubDemographicDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SelfcareSubMgmtV1Invoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	String accountStatus =null;

	GetSubDemographicDetailsResponse response = null;
	GetdemographicdtlsRequest agentRequest = null;
	GetdemographicdtlsResponse agentResponse = null;
	
	
	public GetSubDemographicDetailsResponse getSubDemographicDetails(
			GetSubDemographicDetailsRequest request) throws MSPAPIGWExceptions {
		
		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getSubDemographicDetails(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetSubDemographicDetailsImpl-getSubDemographicDetails of GetAcctDetailsRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetAccountDetailsImpl-getAccountDetails of GetAcctDetailsResponse is Null");
		}
		return response;
	}

	private GetSubDemographicDetailsResponse setAgentResponse(GetdemographicdtlsResponse agentResponse) {

		response = new GetSubDemographicDetailsResponse();
		
		if (agentResponse.getMessage() != null) {
			response.setResponseMessage(agentResponse.getMessage());
		}
		
	  if(agentResponse.getSubscriberDetails()!=null) {
		if (agentResponse.getSubscriberDetails().getIDType() != null) {
			response.setIdType(agentResponse.getSubscriberDetails().getIDType());
		}
		if (agentResponse.getSubscriberDetails().getIDNo() != null) {
			response.setIdValue(agentResponse.getSubscriberDetails().getIDNo());
		}
		if (agentResponse.getSubscriberDetails().getFirstName() != null) {
			response.setFirstName(agentResponse.getSubscriberDetails().getFirstName());
		}
		if (agentResponse.getSubscriberDetails().getSurname() != null) {
			response.setSurName(agentResponse.getSubscriberDetails().getSurname());
		}
		if (agentResponse.getSubscriberDetails().getLastname() != null) {
			response.setLastName(agentResponse.getSubscriberDetails().getLastname());
		}
		if (agentResponse.getSubscriberDetails().getGender() != null) {
			response.setGender(agentResponse.getSubscriberDetails().getGender());
		}
		if (agentResponse.getSubscriberDetails().getDateOfBirth() != null) {
			response.setDateOfBirth(agentResponse.getSubscriberDetails().getDateOfBirth().toString());
		}
		if (agentResponse.getSubscriberDetails().getEmail() != null) {
			response.setEmail(agentResponse.getSubscriberDetails().getEmail());
		}
		if (agentResponse.getSubscriberDetails().getHomePhone() != null) {
			response.setHomePhone(agentResponse.getSubscriberDetails().getHomePhone());
		}
		if (agentResponse.getSubscriberDetails().getOfficePhone() != null) {
			response.setOfficePhone(agentResponse.getSubscriberDetails().getOfficePhone());
		}
		if (agentResponse.getSubscriberDetails().getAddress1() != null) {
			response.setAddress1(agentResponse.getSubscriberDetails().getAddress1());
		}
		if (agentResponse.getSubscriberDetails().getAddress2() != null) {
			response.setAddress2(agentResponse.getSubscriberDetails().getAddress2());
		}
		if (agentResponse.getSubscriberDetails().getAddress3() != null) {
			response.setAddress3(agentResponse.getSubscriberDetails().getAddress3());
		}
		if (agentResponse.getSubscriberDetails().getAnnualIncome() != null) {
			response.setAnnualIncome(agentResponse.getSubscriberDetails().getAnnualIncome());
		}
		if (agentResponse.getSubscriberDetails().getCity() != null) {
			response.setCity(agentResponse.getSubscriberDetails().getCity());
		}
		if (agentResponse.getSubscriberDetails().getState() != null) {
			response.setState(agentResponse.getSubscriberDetails().getState());
		}
		if (agentResponse.getSubscriberDetails().getCountry() != null) {
			response.setCountry(agentResponse.getSubscriberDetails().getCountry());
		}
		if (agentResponse.getSubscriberDetails().getOccupation() != null) {
			response.setOccupation(agentResponse.getSubscriberDetails().getOccupation());
		}
		if (agentResponse.getSubscriberDetails().getIndustry() != null) {
			response.setIndustry(agentResponse.getSubscriberDetails().getIndustry());
		}
		if (agentResponse.getSubscriberDetails().getEthnic() != null) {
			response.setEthnic(agentResponse.getSubscriberDetails().getEthnic());
		}
		if (agentResponse.getSubscriberDetails().getAlternateContactNo() != null) {
			response.setAlternateContactNo(agentResponse.getSubscriberDetails().getAlternateContactNo());
		}
		if (agentResponse.getSubscriberDetails().getExternalNumber() != null) {
			response.setExternalNumber(agentResponse.getSubscriberDetails().getExternalNumber());
		}
		if (agentResponse.getSubscriberDetails().getInternalNumber() != null) {
			response.setInternalNumber(agentResponse.getSubscriberDetails().getInternalNumber());
		}
		if (agentResponse.getSubscriberDetails().getNationality() != null) {
			response.setNationality(agentResponse.getSubscriberDetails().getNationality());
		}
		if (agentResponse.getSubscriberDetails().getPostalCode() != null) {
			response.setPostalCode(agentResponse.getSubscriberDetails().getPostalCode());
		}
		if (agentResponse.getSubscriberDetails().getPleaseSpecify() != null) {
			response.setPleaseSpecify(agentResponse.getSubscriberDetails().getPleaseSpecify());
		}
		if (agentResponse.getSubscriberDetails().getNit() != null) {
			response.setNit(agentResponse.getSubscriberDetails().getNit());
		}
	  }else {
		  if(LOGGER.isInfoEnabled())
			  LOGGER.info("GetSubDemographicDetailsImpl-setAgentResponse of SubscriberDetails is Null");
	  }
		return response;
	}

	private GetdemographicdtlsRequest getAgentRequest(GetSubDemographicDetailsRequest request, CommonHeaders headers) {
		
		if (request != null) {
			agentRequest = new GetdemographicdtlsRequest();
			if (request.getIdValue() != null) 
				agentRequest.setIDNo(request.getIdValue());
			
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
