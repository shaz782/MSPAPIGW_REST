package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.GetIDTypesImpl;
import com.xius.client.msp.api.impl.ValidateTPImpl;
import com.xius.msp.api.messages.GetIDTypesRequest;
import com.xius.msp.api.messages.GetIDTypesResponse;
import com.xius.msp.api.messages.ValidateTPRequest;
import com.xius.msp.api.messages.ValidateTPResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;

@Service
public class LoginServices {
	private static final Logger LOGGER = LogManager.getLogger(LoginServices.class);

	@Autowired(required = true)
	private GetIDTypesImpl getIDTypesImpl;
	
	@Autowired(required = true)
	private ValidateTPImpl validateTPImpl;

	public GetIDTypesResponse getIDTypes(GetIDTypesRequest getIDTypesRequest) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("LoginServices-GetIDTypes called");

		GetIDTypesResponse getIDTypesResponse = null;

		getIDTypesResponse = getIDTypesImpl.getIDTypes(getIDTypesRequest);
		if (getIDTypesResponse != null)
			return getIDTypesResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LoginServices- GetIDTypes of GetIDTypesResponse is Null");
			return getIDTypesResponse;
		}
	}

	public ValidateTPResponse validateTP(ValidateTPRequest request) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("LoginServices-validateTP called");

		ValidateTPResponse validateTPResponse = null;

		validateTPResponse = validateTPImpl.validateTP(request);
		if (validateTPResponse != null)
			return validateTPResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LoginServices- validateTP of ValidateTPResponse is Null");
			return validateTPResponse;
		}
	}

}
