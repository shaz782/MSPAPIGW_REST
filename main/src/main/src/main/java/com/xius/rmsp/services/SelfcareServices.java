package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.GetSubDemographicDetailsImpl;
import com.xius.client.impl.UpdateDemographicDetailsImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.GetSubDemographicDetailsRequest;
import com.xius.rmsp.messages.GetSubDemographicDetailsResponse;
import com.xius.rmsp.messages.UpdateDemographicDetailsRequest;
import com.xius.rmsp.messages.UpdateDemographicDetailsResponse;

@Service
public class SelfcareServices {

	private static final Logger LOGGER = LogManager.getLogger(SelfcareServices.class);

	@Autowired(required = true)
	private GetSubDemographicDetailsImpl getSubDemographicDetailsImpl;
	
	@Autowired(required = true)
	private UpdateDemographicDetailsImpl updateDemographicDetailsImpl;

	public GetSubDemographicDetailsResponse getSubDemographicDetails(
			GetSubDemographicDetailsRequest getSubDemographicDetailsRequest) throws MSPAPIGWExceptions{
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getAccountDetails called");

		GetSubDemographicDetailsResponse getSubDemographicDetailsResponse = null;

		getSubDemographicDetailsResponse = getSubDemographicDetailsImpl
				.getSubDemographicDetails(getSubDemographicDetailsRequest);
		if (getSubDemographicDetailsResponse != null)
			return getSubDemographicDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- getSubsDetailsbyState of GetSubDemographicDetailsResponse is Null");
			return getSubDemographicDetailsResponse;
		}
	}

	public UpdateDemographicDetailsResponse updateDemographicDetails(UpdateDemographicDetailsRequest updateDemographicDetailsRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getAccountDetails called");

		UpdateDemographicDetailsResponse updateDemographicDetailsResponse = null;

		updateDemographicDetailsResponse = updateDemographicDetailsImpl
				.updateDemographicDetails(updateDemographicDetailsRequest);
		if (updateDemographicDetailsResponse != null)
			return updateDemographicDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- updateDemographicDetails of UpdateDemographicDetailsResponse is Null");
			return updateDemographicDetailsResponse;
		}
	}

}
