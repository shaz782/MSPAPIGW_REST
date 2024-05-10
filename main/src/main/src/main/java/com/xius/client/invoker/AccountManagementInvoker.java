package com.xius.client.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.accountManagement.AccountManagementBindingStub;
import com.xius.msp.billing.client.accountManagement.AccountServiceLocator;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdRequest;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdResponse;
import com.xius.msp.billing.messages.accountManagement.UpdateActStatusRequest;
import com.xius.msp.billing.messages.accountManagement.UpdateActStatusResponse;
import com.xius.msp.billing.messages.common.ErrorDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 7th Aug,2019 Description : From Here we will invoke the InfinetBilling
 *        Services.
 */
@Component
public class AccountManagementInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(AccountManagementInvoker.class);

	@Autowired(required = true)
	public Utility utility;

	public MDNBasedGetNwIdResponse mdnBasedGetNwId(MDNBasedGetNwIdRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("AccountManagementInvoker - mdnBasedGetNwId called");
		}
		MDNBasedGetNwIdResponse agentResponse = null;
		AccountManagementBindingStub bindingStub = null;

		try {
			bindingStub = new AccountManagementBindingStub(new URL(getAccMgmtURL()),
					new AccountServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.MDNbasedGetNwId(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("AccountManagementInvoker - mdnBasedGetNwId-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("AccountManagementInvoker - mdnBasedGetNwId-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	public UpdateActStatusResponse updateActStatus(UpdateActStatusRequest agentRequest, CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("AccountManagementInvoker - updateActStatus called");
		}
		UpdateActStatusResponse agentResponse = null;
		AccountManagementBindingStub bindingStub = null;

		try {
			bindingStub = new AccountManagementBindingStub(new URL(getAccMgmtURL()),
					new AccountServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.updateActStatus(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("AccountManagementInvoker - updateActStatus-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("AccountManagementInvoker - updateActStatus-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}


	private String getAccMgmtURL() {

		String url = utility.getProperty("iba.AccountManagement");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("AccountManagementInvoker-iba.AccountManagement-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("iba.AccountManagement-URL ::" + url);
		}
		return url;
	}
	
}
