package com.xius.msp.api.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.msp.api.impl.ChangePasswordImpl;
import com.xius.client.msp.api.impl.GetSubDetailsImpl;
import com.xius.client.msp.api.impl.LogInDetailsImpl;
import com.xius.client.msp.api.impl.LogInv1DetailsImpl;
import com.xius.client.msp.api.impl.UpdateDetailsImpl;
import com.xius.msp.api.messages.ChangePasswordRequest;
import com.xius.msp.api.messages.ChangePasswordResponse;
import com.xius.msp.api.messages.GetSubDemographicDetailsRequest;
import com.xius.msp.api.messages.GetSubDemographicDetailsResponse;
import com.xius.msp.api.messages.LoginRequest;
import com.xius.msp.api.messages.LoginResponse;
import com.xius.msp.api.messages.Loginv1Request;
import com.xius.msp.api.messages.Loginv1Response;
import com.xius.msp.api.messages.UpdateDemographicDetailsRequest;
import com.xius.msp.api.messages.UpdateDemographicDetailsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;

@Service
public class SelfcareAgentServices {

	private static final Logger LOGGER = LogManager.getLogger(SelfcareAgentServices.class);

	@Autowired(required = true)
	private GetSubDetailsImpl getSubDetailsImpl;

	@Autowired(required = true)
	private UpdateDetailsImpl updateDetailsImpl;

	@Autowired(required = true)
	private LogInDetailsImpl logInDetailsImpl;
	
	@Autowired(required = true)
	private LogInv1DetailsImpl logInDetailsImplv1;
	
	@Autowired(required = true)
	private ChangePasswordImpl changePasswordImpl;

	public GetSubDemographicDetailsResponse getSubDemographicDetails(
			GetSubDemographicDetailsRequest getSubDemographicDetailsRequest) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("SelfcareServices-getSubDemographicDetails called");

		GetSubDemographicDetailsResponse getSubDemographicDetailsResponse = null;

		getSubDemographicDetailsResponse = getSubDetailsImpl.getSubDemographicDetails(getSubDemographicDetailsRequest);
		if (getSubDemographicDetailsResponse != null)
			return getSubDemographicDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- getSubsDetailsbyState of GetSubDemographicDetailsResponse is Null");
			return getSubDemographicDetailsResponse;
		}
	}

	public UpdateDemographicDetailsResponse updateDemographicDetails(
			UpdateDemographicDetailsRequest updateDemographicDetailsRequest) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("SelfcareServices-updateDemographicDetails called");

		UpdateDemographicDetailsResponse updateDemographicDetailsResponse = null;

		updateDemographicDetailsResponse = updateDetailsImpl.updateDemographicDetails(updateDemographicDetailsRequest);
		if (updateDemographicDetailsResponse != null)
			return updateDemographicDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- updateDemographicDetails of UpdateDemographicDetailsResponse is Null");
			return updateDemographicDetailsResponse;
		}
	}

	public LoginResponse logIn(LoginRequest loginRequest) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("SelfcareServices-logIn called");

		LoginResponse loginResponse = null;
		loginResponse = logInDetailsImpl.logIn(loginRequest);
		if (loginResponse != null)
			return loginResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- logIn of loginResponse is Null");
			return loginResponse;
		}
	}
	
	public Loginv1Response logInv1(Loginv1Request loginv1Request) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("SelfcareServices-logIn called");

		Loginv1Response loginv1Response = null;
		loginv1Response = logInDetailsImplv1.logInv1(loginv1Request);
		if (loginv1Response != null)
			return loginv1Response;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- logIn of loginResponse is Null");
			return loginv1Response;
		}
	}

	public ChangePasswordResponse changePassword(ChangePasswordRequest changePasswordRequest) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("SelfcareServices-changePassword called");

		ChangePasswordResponse changePasswordResponse = null;
		changePasswordResponse = changePasswordImpl.changePassword(changePasswordRequest);
		if (changePasswordResponse != null)
			return changePasswordResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- ChangePassword of ChangePasswordResponse is Null");
			return changePasswordResponse;
		}
	}
	
	


}
