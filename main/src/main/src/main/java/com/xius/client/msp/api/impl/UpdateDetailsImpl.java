package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.SelfcareSubMgmtInvoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.msp.api.messages.UpdateDemographicDetailsRequest;
import com.xius.msp.api.messages.UpdateDemographicDetailsResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 30th Dec,2021 Description : From Here we will invoke the
 *        Selfcare APIs Services.
 */
@Component
public class UpdateDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(UpdateDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SelfcareSubMgmtInvoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	String accountStatus =null;

	UpdateDemographicDetailsResponse response = null;
	com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest agentRequest = null;
	com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse agentResponse = null;
	
	
	public UpdateDemographicDetailsResponse updateDemographicDetails(
			UpdateDemographicDetailsRequest request) throws MSPAPIGWExceptions {
		
		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.updateSubDetails(agentRequest, headers);
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

	private UpdateDemographicDetailsResponse setAgentResponse(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse agentResponse) {

		response = new UpdateDemographicDetailsResponse();
		
		
		if(agentResponse.getMessage().equalsIgnoreCase("SUCCESS")) {
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE); 
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE); 
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS); 
		}
		else {
			response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.FAILURE); 
		}
		
		return response;
	}

	private com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest getAgentRequest(UpdateDemographicDetailsRequest request, CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (request != null) {
			agentRequest = new com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest();
			
			 
			
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
			
			if (request.getAddress1() != null) {
				agentRequest.setAddress1(request.getAddress1());
			}
			if (request.getAddress2() != null) {
				agentRequest.setAddress2(request.getAddress2());
			}
			if (request.getHomePhone() != null) {
				agentRequest.setHomePhone(request.getHomePhone());
			}
			if (request.getOfficePhone() != null) {
				agentRequest.setOfficePhone(request.getOfficePhone());
			}
			if (request.getEmail() != null) {
				if(request.getEmail().contains("@")) {
					agentRequest.setEmail(request.getEmail());
				}else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"Please Provide Proper EMail");
				}
			}
			if (request.getPostalCode() != null) {
				agentRequest.setPostalCode(request.getPostalCode());
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
			if (request.getAnnualIncome() != null) {
				agentRequest.setAnnualIncome(request.getAnnualIncome());
			}
			if (request.getAddress3() != null) {
				agentRequest.setAddress3(request.getAddress3());
			}
			if (request.getFirstName() != null) {
				agentRequest.setFirstName(request.getFirstName());
			}
			if (request.getDateOfBirth() != null) {
				agentRequest.setDateOfBirth(utility.stringToDate(request.getDateOfBirth(),"yyyy-MM-dd"));
			}
			if (request.getEthnic() != null) {
				agentRequest.setEthnic(request.getEthnic());
			}
			if (request.getGender() != null) {
				agentRequest.setGender(request.getGender());
			}
			if (request.getLastName() != null) {
				agentRequest.setLastName(request.getLastName());
			}
			if (request.getTransReffNum() != null) {
				agentRequest.setTransReffNum(request.getTransReffNum());
			}
			agentRequest.setSecurityQuestion("USERCONSENT");
			if (request.getUserConsent() != null) {
				agentRequest.setSecurityAnswer(request.getUserConsent());
			}
			else {
				agentRequest.setSecurityAnswer("1");
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
