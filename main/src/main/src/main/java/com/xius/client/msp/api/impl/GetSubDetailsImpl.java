package com.xius.client.msp.api.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.SelfcareSubMgmtInvoker;
import com.xius.msp.api.messages.GetSubDemographicDetailsRequest;
import com.xius.msp.api.messages.GetSubDemographicDetailsResponse;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 30th Dec,2021 Description : From Here we will invoke the
 *        Selfcare APIs Services.
 */
@Component
public class GetSubDetailsImpl {

	private static final Logger LOGGER = LogManager.getLogger(GetSubDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SelfcareSubMgmtInvoker invoker;

	@Autowired(required = true)
	public Utility utility;

	String accountStatus = null;

	GetSubDemographicDetailsResponse response = null;
	GetSubDetailsRequest agentRequest = null;
	GetSubDetailsResponse agentResponse = null;

	public GetSubDemographicDetailsResponse getSubDemographicDetails(GetSubDemographicDetailsRequest request)
			throws MSPAPIGWExceptions {


		agentRequest = getAgentRequest(request, headers);

		if (agentRequest != null) {
			agentResponse = invoker.getSubDetails(agentRequest, headers);
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

	private GetSubDemographicDetailsResponse setAgentResponse(GetSubDetailsResponse agentResponse) {

		response = new GetSubDemographicDetailsResponse();

		if (agentResponse.getMessage() != null) {
			response.setResponseMessage(agentResponse.getMessage());
		}

		if (agentResponse.getSubscriberDetails() != null) {

			GetSubDetCursorType[] cursor = agentResponse.getSubscriberDetails();
			for (int i = 0; i < cursor.length; i++) {

				if (cursor[i].getIDType() != null) {
					response.setIdType(cursor[i].getIDType());
				}
				if (cursor[i].getIDNo() != null) {
					response.setIdValue(cursor[i].getIDNo());
				}
				if (cursor[i].getICCNo() != null) {
					response.setICCNo(cursor[i].getICCNo());
				}
				if (cursor[i].getFirstName() != null) {
					response.setFirstName(cursor[i].getFirstName());
				}
				if (cursor[i].getLastName() != null) {
					response.setLastName(cursor[i].getLastName());
				}
				if (cursor[i].getGender() != null) {
					response.setGender(cursor[i].getGender());
				}
				if (cursor[i].getDateOfBirth() != null) {
					response.setDateOfBirth(cursor[i].getDateOfBirth().toString());
				}
				
				if (cursor[i].getDateOfBirth() != null) {
					
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
					Date date = cursor[i].getDateOfBirth() ;  
					String strDate = dateFormat.format(date);  
					
					response.setDateOfBirth(strDate);
				}
				
				
				if (cursor[i].getEmail() != null) {
					response.setEmail(cursor[i].getEmail());
				}
				if (cursor[i].getHomePhone() != null) {
					response.setHomePhone(cursor[i].getHomePhone());
				}
				if (cursor[i].getOfficePhone() != null) {
					response.setOfficePhone(cursor[i].getOfficePhone());
				}
				if (cursor[i].getAddress1() != null) {
					response.setAddress1(cursor[i].getAddress1());
				}
				if (cursor[i].getAddress2() != null) {
					response.setAddress2(cursor[i].getAddress2());
				}
				if (cursor[i].getAnnualIncome() != null) {
					response.setAnnualIncome(cursor[i].getAnnualIncome());
				}
				if (cursor[i].getPostalCode() != null) {
					response.setPostalCode(cursor[i].getPostalCode());
				}
				if (cursor[i].getCity() != null) {
					response.setCity(cursor[i].getCity());
				}
				if (cursor[i].getState() != null) {
					response.setState(cursor[i].getState());
				}
				if (cursor[i].getCountry() != null) {
					response.setCountry(cursor[i].getCountry());
				}
				if (cursor[i].getOccupation() != null) {
					response.setOccupation(cursor[i].getOccupation());
				}
				if (cursor[i].getIndustry() != null) {
					response.setIndustry(cursor[i].getIndustry());
				}
				if (cursor[i].getSourceOfInfo() != null) {
					response.setSourceOfInfo(cursor[i].getSourceOfInfo());
				}
				if (cursor[i].getMSISDN() != null) {
					response.setMSISDN(cursor[i].getMSISDN());
				}
				if (cursor[i].getUserID() != null) {
					response.setUserID(cursor[i].getUserID());
				}
				if (cursor[i].getAddress3() != null) {
					response.setAddress3(cursor[i].getAddress3());
				}
				if (cursor[i].getGmpc() != null) {
					response.setGmpc(cursor[i].getGmpc());
				}
				if (cursor[i].getEthnic() != null) {
					response.setEthnic(cursor[i].getEthnic());
				}
				if (cursor[i].getAlternateContactNo() != null) {
					response.setAlternateContactNo(cursor[i].getAlternateContactNo());
				}
				if (cursor[i].getStateCode() != null) {
					response.setStateCode(cursor[i].getStateCode());
				}
				if (cursor[i].getCountryCode() != null) {
					response.setCountryCode(cursor[i].getCountryCode());
				}
				if (cursor[i].getSurName() != null) {
					response.setSurName(cursor[i].getSurName());
				}
				if (cursor[i].getExternalNumber() != null) {
					response.setExternalNumber(cursor[i].getExternalNumber());
				}
				if (cursor[i].getInternalNumber() != null) {
					response.setInternalNumber(cursor[i].getInternalNumber());
				}
				if (cursor[i].getStreetLimits() != null) {
					response.setStreetLimits(cursor[i].getStreetLimits());
				}
				if (cursor[i].getMunicipality() != null) {
					response.setMunicipality(cursor[i].getMunicipality());
				}
				if (cursor[i].getPleaseSpecify() != null) {
					if(cursor[i].getPleaseSpecify().equalsIgnoreCase("0")) {
						response.setUserConsent(Boolean.TRUE.toString());
					}else {
						response.setUserConsent(Boolean.FALSE.toString());
					}
				}
				else {
					response.setUserConsent(Boolean.FALSE.toString());
				}

			}
			
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE); 
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE); 
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS); 
			
		} else {
			if (LOGGER.isInfoEnabled())
				LOGGER.info("GetSubDemographicDetailsImpl-setAgentResponse of SubscriberDetails is Null");
			
			response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.FAILURE); 
		}
		
		
		return response;
	}

	private GetSubDetailsRequest getAgentRequest(GetSubDemographicDetailsRequest request, CommonHeaders headers) {

		if (request != null) {

			agentRequest = new GetSubDetailsRequest();
			if (request.getIdValue() != null)
				agentRequest.setIDNo(request.getIdValue());

			if (request.getIdType() != null)
				agentRequest.setIDType(request.getIdType());

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
