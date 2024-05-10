package com.xius.client.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.accountManagement.AccountServiceLocator;
import com.xius.msp.billing.client.loginServices.LoginServicesBindingStub;
import com.xius.msp.billing.messages.common.ErrorDetailsType;
import com.xius.msp.billing.messages.loginServices.AuthenticateApiRequest;
import com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse;

//import com.xius.msp.billing.messages.common.ErrorDetailsType;

import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

@Component
@Configurable
public class AuthenticationAPIInvoker {
	@Autowired
	public Utility utility;

	private static final Logger logger = LogManager.getLogger(AuthenticationAPIInvoker.class);
 
	public AuthenticateApiResponse authenticationAPI(AuthenticateApiRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions {

		if (logger.isInfoEnabled()) {
			logger.info("AuthenticationAPIInvoker - authenticateApi called");
		}
		AuthenticateApiResponse agentResponse = new AuthenticateApiResponse();
		LoginServicesBindingStub bindingStub = null;

		try {
			bindingStub = new LoginServicesBindingStub(new URL(getURL()), new AccountServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.authenticateApi(agentRequest);

		} catch (ErrorDetailsType e) {
			if (logger.isErrorEnabled())
				logger.error("AuthenticationAPIInvoker - authenticateApi-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(), e.getErrorMessage());
		} catch (Exception e) {
			if (logger.isErrorEnabled())
				logger.error("AuthenticationAPIInvoker - authenticateApi-Exception" + e);

			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	private String getURL() {
		String url = utility.getProperty("iba.loginManagement");
		if (url == null || url.equals("")) {
			if (logger.isErrorEnabled())
				logger.error("AuthenticationAPIInvoker-iba.loginServices-URL is Null");
		} else {
			if (logger.isDebugEnabled())
				logger.info("iba.AccountManagement-URL ::" + url);
		}
		return url;
	}

}
