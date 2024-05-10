package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingRequest;
import com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse;
import com.xius.client.invoker.SMFManagementInvoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;

@Component
public class ActivateTPTrackingImpl {
	private static final Logger LOGGER = LogManager.getLogger(ActivateTPTrackingImpl.class);

	@Autowired(required = true)
	SMFManagementInvoker invoker;

	ActivateTPTrackingResponse activateTPTracking(ActivateTPTrackingRequest request, CommonHeaders headers)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("ActivateTPTrackingImpl - activateTPTracking called");
		}
		ActivateTPTrackingResponse response = new ActivateTPTrackingResponse();
		response = invoker.activateTPTracking(request, headers);

		if (response == null) {

			LOGGER.info("ActivateTPTrackingImpl -ActivateTPTrackingResponse Null");

		}

		return response;
	}

}
