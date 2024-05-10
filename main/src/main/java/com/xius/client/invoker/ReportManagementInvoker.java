package com.xius.client.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.reportManagement.ReportManagementBindingStub;
import com.xius.msp.billing.client.reportManagement.ReportServiceLocator;
import com.xius.msp.billing.messages.common.ErrorDetailsType;
import com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsRequest;
import com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 15th April,2020 Description : From Here we will invoke the InfinetBilling
 *        Services.
 */
@Component
public class ReportManagementInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(ReportManagementInvoker.class);

	@Autowired(required = true)
	public Utility utility;

	public GetDeactiveReasonsResponse getDeactiveReasons(GetDeactiveReasonsRequest agentRequest,CommonHeaders headers) throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("ReportManagementInvoker - getDeactiveReasons called");
		}
		GetDeactiveReasonsResponse agentResponse = null;
		ReportManagementBindingStub bindingStub = null;

		try {
			bindingStub = new ReportManagementBindingStub(new URL(getReportMgmtURL()),
					new ReportServiceLocator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getDeactiveReasons(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ReportManagementInvoker - getDeactiveReasons-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ReportManagementInvoker - getDeactiveReasons-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	private String getReportMgmtURL() {

		String url = utility.getProperty("iba.reportManagement");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-iba.reportManagement-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("iba.reportManagement-URL ::" + url);
		}
		return url;
	}

}
