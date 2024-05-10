package com.xius.client.invoker;

import java.net.URL;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.loginServices.LoginServicesBindingStub;
import com.xius.msp.billing.client.loginServices.LoginServicesLocator;
import com.xius.msp.billing.messages.loginServices.GetIdTypesRequest;
import com.xius.msp.billing.messages.loginServices.GetIdTypesResponse;
import com.xius.msp.selfcare.messages.common.ErrorDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;
/**
 * 
 * @author shabbeer.shaik
 * @since 7th Mar,2024 Description : From Here we will invoke the InfinetBilling
 *        Services.
 */

@Component
public class LoginServicesInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(LoginServicesInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public GetIdTypesResponse getIdTypes(GetIdTypesRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("LoginServicesInvoker - getIdTypes called");
		}
		GetIdTypesResponse agentResponse = null;
		LoginServicesBindingStub bindingStub = null;

		try {
			bindingStub = new LoginServicesBindingStub(new URL(getLoginURL()),
					new LoginServicesLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getIdTypes(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LoginServicesInvoker-getIdTypes-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LoginServicesInvoker-getIdTypes-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	private String getLoginURL() {

		String url = utility.getProperty("iba.loginManagement");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("LoginServicesInvoker-iba.LoginServices-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("iba.LoginServices-URL ::" + url);
		}
		return url;
	}

}
