package com.xius.client.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementServicesBindingV1Stub;
import com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementServicesV1Locator;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsResponse;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsResponse;
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
public class SelfcareSubMgmtV1Invoker {
	
	private static final Logger LOGGER = LogManager.getLogger(SelfcareSubMgmtV1Invoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public GetdemographicdtlsResponse getSubDemographicDetails(GetdemographicdtlsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareSubMgmtV1Invoker - getSubDemographicDetails called");
		}
		GetdemographicdtlsResponse agentResponse = null;
		SubscriberManagementServicesBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementServicesBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberManagementServicesV1Locator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.getdemographicdtls(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtV1Invoker-getAccountDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtV1Invoker-getSubDemographicDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	
	public UpdateDemographicDetailsResponse updateDemographicDetails(UpdateDemographicDetailsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("SelfcareSubMgmtV1Invoker - updateDemographicDetails called");
		}
		UpdateDemographicDetailsResponse agentResponse = null;
		SubscriberManagementServicesBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementServicesBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberManagementServicesV1Locator());
			bindingStub.setHeader(utility.getSelfcareHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getSelfcareTimeOut()));
			agentResponse = bindingStub.updateDemographicDetails(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtV1Invoker-getAccountDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		}  catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtV1Invoker-updateDemographicDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	private String getSubMgmtV1URL() {

		String url = utility.getProperty("selfcare.subscriberManagementV1");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareSubMgmtV1Invoker-selfcare.subscriberManagementV1-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("selfcare.subscriberManagementV1-URL ::" + url);
		}
		return url;
	}

}
