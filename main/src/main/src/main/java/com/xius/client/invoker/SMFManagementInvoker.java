package com.xius.client.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.SMFManagement_wsdl.SMFManagementServicesBindingStub;
import com.xius.agent.smf.SMFManagement_wsdl.SMFManagementServicesLocator;
import com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingRequest;
import com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse;
import com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsRequest;
import com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerRequest;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateRequest;
import com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse;
import com.xius.msp.billing.messages.common.ErrorDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 17th April,2020 Description : From Here we will invoke the SMF
 *        Services.
 */
@Component
public class SMFManagementInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(SMFManagementInvoker.class);

	@Autowired(required = true)
	public Utility utility;

	public PaymentTransDtlsResponse paymentTransDtls(PaymentTransDtlsRequest agentRequest, CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SMFManagementInvoker - PaymentTransDtls called");
		}
		PaymentTransDtlsResponse agentResponse = null;
		SMFManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SMFManagementServicesBindingStub(new URL(getSMFMgmtURL()),
					new SMFManagementServicesLocator());
			bindingStub.setHeader(utility.getSMFHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSMFTimeOut()));
			agentResponse = bindingStub.paymentTransDtls(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - PaymentTransDtls-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - PaymentTransDtls-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	public TransactionTrackerResponse transactionTracker(TransactionTrackerRequest agentRequest, CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SMFManagementInvoker - transactionTracker called");
		}
		TransactionTrackerResponse agentResponse = null;
		SMFManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SMFManagementServicesBindingStub(new URL(getSMFMgmtURL()),
					new SMFManagementServicesLocator());
			bindingStub.setHeader(utility.getSMFHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSMFTimeOut()));
			agentResponse = bindingStub.transactionTracker(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - transactionTracker-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - transactionTracker-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	
	public TransactionTrackerUpdateResponse trackUpdate(TransactionTrackerUpdateRequest trackUpdateRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SMFManagementInvoker - trackUpdate called");
		}
		TransactionTrackerUpdateResponse agentResponse = null;
		SMFManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SMFManagementServicesBindingStub(new URL(getSMFMgmtURL()),
					new SMFManagementServicesLocator());
			bindingStub.setHeader(utility.getSMFHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSMFTimeOut()));
			agentResponse = bindingStub.transactionTrackerUpdate(trackUpdateRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - trackUpdate-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - trackUpdate-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;

	}
	
	
	public ActivateTPTrackingResponse activateTPTracking(ActivateTPTrackingRequest trackUpdateRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SMFManagementInvoker - activateTPTracking called");
		}
		ActivateTPTrackingResponse agentResponse = null;
		SMFManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SMFManagementServicesBindingStub(new URL(getSMFMgmtURL()),
					new SMFManagementServicesLocator());
			bindingStub.setHeader(utility.getSMFHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSMFTimeOut()));
			agentResponse = bindingStub.activateTPTracking(trackUpdateRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - activateTPTracking-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker - activateTPTracking-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;

	}
	
	
	private String getSMFMgmtURL() {

		String url = utility.getProperty("smf.ManagementServices");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SMFManagementInvoker-smf.ManagementServices-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("smf.ManagementServices-URL ::" + url);
		}
		return url;
	}

	
	
}
