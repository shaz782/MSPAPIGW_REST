package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.SelfcareSubMgmtV1Invoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.UpdateDemographicDetailsRequest;
import com.xius.rmsp.messages.UpdateDemographicDetailsResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the SubscriberManagementV1 APIs
 *        Services.
 */
@Component
public class UpdateDemographicDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(UpdateDemographicDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SelfcareSubMgmtV1Invoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	String accountStatus =null;

	UpdateDemographicDetailsResponse response = null;
	com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsRequest agentRequest = null;
	com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsResponse agentResponse = null;
	
	
	public UpdateDemographicDetailsResponse updateDemographicDetails(
			UpdateDemographicDetailsRequest request) throws MSPAPIGWExceptions {
		
		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.updateDemographicDetails(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("UpdateDemographicDetailsImpl-updateDemographicDetails of GetAcctDetailsRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("UpdateDemographicDetailsImpl-updateDemographicDetails of GetAcctDetailsResponse is Null");
		}
		return response;
	}

	private UpdateDemographicDetailsResponse setAgentResponse(com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsResponse agentResponse) {

		response = new UpdateDemographicDetailsResponse();
		
		if (agentResponse.getTransID() != null) {
			response.setTransID(agentResponse.getTransID());
		}
		
		if (agentResponse.getTransRefNo() != null) {
			response.setTransRefNo(agentResponse.getTransRefNo());
		}
		
		return response;
	}

	private com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsRequest getAgentRequest(UpdateDemographicDetailsRequest request, CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (request != null) {
			agentRequest = new com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsRequest();
			
			if (request.getTransRefNo() != null) 
				agentRequest.setTransRefNo(request.getTransRefNo());
			
			if (request.getIdType() != null) {
				agentRequest.setIDType(request.getIdType());
			}else {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"ID Type Can't be Null");
			}
			if (request.getIdValue() != null) {
				agentRequest.setIDNo(request.getIdValue());
			}else {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"ID Value Can't be Null");
			}
			if (request.getFirstName() != null) {
				agentRequest.setFirstName(request.getFirstName());
			}
			if (request.getSurName() != null) {
				agentRequest.setSurName(request.getSurName());
			}
			if (request.getLastName() != null) {
				agentRequest.setLast_name(request.getLastName());
			}
			if (request.getGender() != null) {
				agentRequest.setGender(request.getGender());
			}
			if (request.getDateOfBirth() != null) {
				agentRequest.setDateOfBirth(utility.stringToDate(request.getDateOfBirth(),"yyyy-MM-dd"));
			}
			if (request.getEmail() != null) {
				if(request.getEmail().contains("@")) {
					agentRequest.setEmail(request.getEmail());
				}else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"Please Provide Proper EMail");
				}
			}
			if (request.getHomePhone() != null) {
				agentRequest.setHomePhone(request.getHomePhone());
			}
			if (request.getOfficePhone() != null) {
				agentRequest.setOfficePhone(request.getOfficePhone());
			}
			if (request.getAddress1() != null) {
				agentRequest.setAddress1(request.getAddress1());
			}
			if (request.getAddress2() != null) {
				agentRequest.setAddress2(request.getAddress2());
			}
			if (request.getAddress3() != null) {
				agentRequest.setAddress3(request.getAddress3());
			}
			if (request.getAnnualIncome() != null) {
				agentRequest.setAnnualIncome(request.getAnnualIncome());
			}
			if (request.getCity() != null) {
				agentRequest.setCity(request.getCity());
			}
			if (request.getState() != null) {
				agentRequest.setState(request.getState());
			}
			if (request.getCountry() != null) {
				agentRequest.setCountry(request.getCountry());
			}
			if (request.getOccupation() != null) {
				agentRequest.setOccupation(request.getOccupation());
			}
			if (request.getIndustry() != null) {
				agentRequest.setIndustry(request.getIndustry());
			}
			if (request.getEthnic() != null) {
				agentRequest.setEthnic(request.getEthnic());
			}
			if (request.getAlternateContactNo() != null) {
				agentRequest.setAlternateContactNo(request.getAlternateContactNo());
			}
			if (request.getNationality() != null) {
				agentRequest.setNationality(request.getNationality());
			}
			if (request.getPostalCode() != null) {
				agentRequest.setPostalCode(request.getPostalCode());
			}
			if (request.getNit() != null) {
				agentRequest.setNit(request.getNit());
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
