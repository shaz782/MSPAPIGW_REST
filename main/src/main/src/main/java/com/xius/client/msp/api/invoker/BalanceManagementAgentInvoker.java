package com.xius.client.msp.api.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.balanceManagement.BalanceManagementBindingStub;
import com.xius.msp.billing.client.balanceManagement.BalanceServiceLocator;
import com.xius.msp.billing.messages.balanceManagement.GetAvailableDenomsRequest;
import com.xius.msp.billing.messages.balanceManagement.GetAvailableDenomsResponse;
import com.xius.msp.billing.messages.balanceManagement.RechargeDetailsRequest;
import com.xius.msp.billing.messages.balanceManagement.RechargeDetailsResponse;
import com.xius.msp.billing.messages.balanceManagement.RechargeRequest;
import com.xius.msp.billing.messages.balanceManagement.RechargeResponse;
import com.xius.msp.billing.messages.balanceManagement.GetMDNRcProductRequest;
import com.xius.msp.billing.messages.balanceManagement.GetMDNRcProductResponse;
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
public class BalanceManagementAgentInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(BalanceManagementAgentInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public GetAvailableDenomsResponse getAvailableDenoms(GetAvailableDenomsRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BalanceManagementInvoker - GetAvailableDenoms called");
		}
		GetAvailableDenomsResponse agentResponse = null;
		BalanceManagementBindingStub bindingStub = null;

		try {
			bindingStub = new BalanceManagementBindingStub(new URL(getBalMgmtURL()),
					new BalanceServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getAvailableDenoms(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - GetAvailableDenoms-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - GetAvailableDenoms-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	public RechargeDetailsResponse rechargeData(RechargeDetailsRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BalanceManagementInvoker - rechargeData called");
		}
		RechargeDetailsResponse agentResponse = null;
		BalanceManagementBindingStub bindingStub = null;

		try {
			bindingStub = new BalanceManagementBindingStub(new URL(getBalMgmtURL()),
					new BalanceServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.rechargeDetails(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - rechargeData-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - rechargeData-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	public RechargeResponse recharge(RechargeRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BalanceManagementInvoker - recharge called");
		}
		RechargeResponse agentResponse = null;
		BalanceManagementBindingStub bindingStub = null;

		try {
			bindingStub = new BalanceManagementBindingStub(new URL(getBalMgmtURL()),
					new BalanceServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.recharge(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - recharge-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementInvoker - recharge-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	public GetMDNRcProductResponse getMDNRcProduct(GetMDNRcProductRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BalanceManagementAgentInvoker - getMDNRcProduct called");
		}
		GetMDNRcProductResponse agentResponse = null;
		BalanceManagementBindingStub bindingStub = null;

		try {
			bindingStub = new BalanceManagementBindingStub(new URL(getBalMgmtURL()),
					new BalanceServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getMDNRcProduct(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementAgentInvoker - getMDNRcProduct-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BalanceManagementAgentInvoker - getMDNRcProduct-Exception" + e);
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
