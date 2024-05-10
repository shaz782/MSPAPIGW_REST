package com.xius.client.msp.api.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.selfcare.client.SubscriberManagement.SubscriberManagementServicesBindingStub;
import com.xius.msp.selfcare.client.SubscriberManagement.SubscriberManagementServicesLocator;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoRequest;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse;
import com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse;
import com.xius.msp.selfcare.messages.common.ErrorDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 29th Aug,2019 Description : From Here we will invoke the Selfcare
 *        Services.
 */
@Component
public class SelfcareSubMgmtInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(SelfcareSubMgmtInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public GetSubDetailsResponse getSubDetails(GetSubDetailsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareSubMgmtInvoker - getSubSubDetails called");
		}
		GetSubDetailsResponse agentResponse = null;
		SubscriberManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementServicesBindingStub(new URL(getSubMgmtURL()),
					new SubscriberManagementServicesLocator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.getSubDetails(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-getSubSubDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-getSubSubDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	
	public UpdateSubDetailsResponse updateSubDetails(UpdateSubDetailsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareSubMgmtInvoker - updateSubDetails called");
		}
		UpdateSubDetailsResponse agentResponse = null;
		SubscriberManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementServicesBindingStub(new URL(getSubMgmtURL()),
					new SubscriberManagementServicesLocator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.updateSubDetails(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-updateSubDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		}  catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-updateSubDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	public GetSubscriberProfileInfoResponse getSubProfileInfoDetails(GetSubscriberProfileInfoRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareSubMgmtInvoker - GetSubscriberProfileInfo called");
		}
		GetSubscriberProfileInfoResponse agentResponse = null;
		SubscriberManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementServicesBindingStub(new URL(getSubMgmtURL()),
					new SubscriberManagementServicesLocator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.getSubscriberProfileInfo(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-GetSubscriberProfileInfo-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		}  catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-GetSubscriberProfileInfo-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

	return agentResponse;
}
	
	public GetIDvalueBylastDigitsResponse  getIDvalueBylastDigits(GetIDvalueBylastDigitsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareSubMgmtInvoker - getIDvalueBylastDigits called");
		}
		GetIDvalueBylastDigitsResponse agentResponse = null;
		SubscriberManagementServicesBindingStub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementServicesBindingStub(new URL(getSubMgmtURL()),
					new SubscriberManagementServicesLocator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.getIDvalueBylastDigits(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-getAccountDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-getIDvalueBylastDigits-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	private String getSubMgmtURL() {

		String url = utility.getProperty("selfcare.subscriberManagement.url");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtInvoker-selfcare.subscriberManagement-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("selfcare.subscriberManagement-URL ::" + url);
		}
		return url;
	}

}
