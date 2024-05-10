package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.ChangeDeviceImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.SIMSwapRequest;
import com.xius.rmsp.messages.SIMSwapResponse;

@Service
public class XBusDeviceServices {

	private static final Logger LOGGER = LogManager.getLogger(XBusDeviceServices.class);

	@Autowired(required = true)
	private ChangeDeviceImpl changeDeviceImpl;
	
	public SIMSwapResponse simSwap(SIMSwapRequest simSwapRequest)throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusDeviceServices-simSwap called");

		SIMSwapResponse simSwapResponse = null;

		simSwapResponse = changeDeviceImpl.simSwap(simSwapRequest);
		if (simSwapResponse != null)
			return simSwapResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServices- simswap of SIMSwapResponse is Null");
			return simSwapResponse;
		}
	}
	
}
