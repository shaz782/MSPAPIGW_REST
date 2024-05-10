package com.xius.client.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.balanceManagement.BalanceManagementBindingStub;
import com.xius.msp.billing.client.balanceManagement.BalanceServiceLocator;
import com.xius.msp.billing.messages.balanceManagement.IssueLoanRequest;
import com.xius.msp.billing.messages.balanceManagement.IssueLoanResponse;
import com.xius.msp.billing.messages.common.ErrorDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 17th jan,2020 Description : From Here we will invoke the InfinetBilling
 *        Services.
 */
@Component
public class BalanceManagementInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(BalanceManagementInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public IssueLoanResponse issueLoan(IssueLoanRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BalanceManagementInvoker - issueLoan called");
		}
		IssueLoanResponse agentResponse = null;
		BalanceManagementBindingStub bindingStub = null;

		try {
			bindingStub = new BalanceManagementBindingStub(new URL(getBalMgmtURL()),
					new BalanceServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.issueLoan(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - issueLoan-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - issueLoan-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	
	private String getBalMgmtURL() {

		String url = utility.getProperty("iba.BalanceManagement");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker-iba.BalanceManagement-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("iba.BalanceManagement-URL ::" + url);
		}
		return url;
	}

}
