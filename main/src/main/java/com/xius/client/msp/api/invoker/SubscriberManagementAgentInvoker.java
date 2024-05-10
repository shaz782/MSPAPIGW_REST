package com.xius.client.msp.api.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementBindingStub;
import com.xius.msp.billing.client.SubscriberManagement.SubscriberServiceLocator;
import com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPRequest;
import com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse;
import com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagRequest;
import com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse;
import com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsRequest;
import com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse;
import com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsRequest;
import com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse;
import com.xius.msp.billing.messages.SubscriberManagement.GetSubDataRequest;
import com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse;
import com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataRequest;
import com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse;
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
public class SubscriberManagementAgentInvoker {

	private static final Logger LOGGER = LogManager.getLogger(SubscriberManagementAgentInvoker.class);

	@Autowired(required = true)
	public Utility utility;

	public GetSubViewDataResponse getSubViewData(GetSubViewDataRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BillingSubMgmtInvoker - getSubViewData called");
		}
		GetSubViewDataResponse agentResponse = null;
		SubscriberManagementBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(getSubMgmtURL()), new SubscriberServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getSubViewData(agentRequest);

		} catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-getSubViewData-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(), e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-getSubViewData-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public GetMsisdnbasedATPDtlsResponse getMsisdnbasedATPDtls(GetMsisdnbasedATPDtlsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BillingSubMgmtInvoker - getMsisdnbasedATPDtls called");
		}
		GetMsisdnbasedATPDtlsResponse agentResponse = null;
		SubscriberManagementBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(getSubMgmtURL()), new SubscriberServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getMsisdnbasedATPDtls(agentRequest);

		} catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-getMsisdnbasedATPDtls-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(), e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-getMsisdnbasedATPDtls-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public GetMsisdnAttachedATPDtlsResponse getMsisdnAttachedATPDtls(GetMsisdnAttachedATPDtlsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BillingSubMgmtInvoker - GetMsisdnAttachedATPDtls called");
		}
		GetMsisdnAttachedATPDtlsResponse agentResponse = null;
		SubscriberManagementBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(getSubMgmtURL()), new SubscriberServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getMsisdnAttachedATPDtls(agentRequest);

		} catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-GetMsisdnAttachedATPDtls-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(), e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-GetMsisdnAttachedATPDtls-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public CheckCommercialTPResponse checkCommercialTP(CheckCommercialTPRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BillingSubMgmtInvoker - CheckCommercialTP called");
		}
		CheckCommercialTPResponse agentResponse = null;
		SubscriberManagementBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(getSubMgmtURL()), new SubscriberServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.checkCommercialTP(agentRequest);

		} catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-CheckCommercialTP-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(), e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-CheckCommercialTP-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public GetCommercialSimFlagResponse checkCommercialSIM(GetCommercialSimFlagRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SubscriberManagementAgentInvoker - checkCommercialSIM called");
		}
		GetCommercialSimFlagResponse agentResponse = null;
		SubscriberManagementBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(getSubMgmtURL()), new SubscriberServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getCommercialSimFlag(agentRequest);

		} catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SubscriberManagementAgentInvoker-checkCommercialSIM-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(), e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SubscriberManagementAgentInvoker-checkCommercialSIM-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public GetSubDataResponse getMsisdnDetails(GetSubDataRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SubscriberManagementAgentInvoker - getMsisdnDetails called");
		}
		GetSubDataResponse agentResponse = null;
		SubscriberManagementBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingStub(new URL(getSubMgmtURL()), new SubscriberServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getSubData(agentRequest);

		} catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SubscriberManagementAgentInvoker-getMsisdnDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(), e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SubscriberManagementAgentInvoker-getMsisdnDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	private String getSubMgmtURL() {

		String url = utility.getProperty("iba.subscriberManagement");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtInvoker-iba.subscriberManagement-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("iba.subscriberManagement-URL ::" + url);
		}
		return url;
	}

}
