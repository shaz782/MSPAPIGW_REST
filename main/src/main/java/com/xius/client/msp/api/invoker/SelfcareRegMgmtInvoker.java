package com.xius.client.msp.api.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.selfcare.client.registration.RegistrationManagementServicesBindingStub;
import com.xius.msp.selfcare.client.registration.RegistrationManagementServicesLocator;
import com.xius.msp.selfcare.messages.common.ErrorDetailsType;
import com.xius.msp.selfcare.messages.registration.LoginRequest;
import com.xius.msp.selfcare.messages.registration.LoginResponse;
import com.xius.msp.selfcare.messages.registration.ResetUserCredentialsRequest;
import com.xius.msp.selfcare.messages.registration.ResetUserCredentialsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 31th Dec,2021 Description : From Here we will invoke the Selfcare
 *        Services.
 */
@Component
public class SelfcareRegMgmtInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(SelfcareRegMgmtInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public LoginResponse logIn(LoginRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareRegMgmtInvoker - logIn called");
		}
		LoginResponse agentResponse = null;
		RegistrationManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new RegistrationManagementServicesBindingStub(new URL(getSubRegMgmtURL()),
					new RegistrationManagementServicesLocator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.login(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareRegMgmtInvoker-logIn-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareRegMgmtInvoker-logIn-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	public ResetUserCredentialsResponse resetUserCredentials(ResetUserCredentialsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareRegMgmtInvoker - resetUserCredentials called");
		}
		ResetUserCredentialsResponse agentResponse = null;
		RegistrationManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new RegistrationManagementServicesBindingStub(new URL(getSubRegMgmtURL()),
					new RegistrationManagementServicesLocator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.resetUserCredentials(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareRegMgmtInvoker-resetUserCredentials-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareRegMgmtInvoker-resetUserCredentials-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	
	private String getSubRegMgmtURL() {

		String url = utility.getProperty("selfcare.registrationManagement.url");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareRegMgmtInvoker-selfcare.registrationManagement-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("selfcare.registrationManagement-URL ::" + url);
		}
		return url;
	}

}
