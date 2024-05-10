package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.GiftPackImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.GiftPackRequest;
import com.xius.rmsp.messages.GiftPackResponse;

@Service
public class XBusBundleServices {

	private static final Logger LOGGER = LogManager.getLogger(XBusBundleServices.class);
	
	@Autowired(required = true)
	private GiftPackImpl giftPackImpl;
	
	public GiftPackResponse giftPack(GiftPackRequest giftPackRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusBundleServices-giftPack called");

		GiftPackResponse giftPackResponse = null;

		giftPackResponse = giftPackImpl.giftPack(giftPackRequest);
		if (giftPackResponse != null)
			return giftPackResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusBundleServices- giftPack of GiftPackResponse is Null");
			return giftPackResponse;
		}
	}

}
