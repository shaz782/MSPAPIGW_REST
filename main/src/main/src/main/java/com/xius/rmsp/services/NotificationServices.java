package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.NotifyImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.notify.messages.NotifyMessageRequest;
import com.xius.rmsp.notify.messages.NotifyMessageResponse;

@Service
public class NotificationServices {

	private static final Logger LOGGER = LogManager.getLogger(NotificationServices.class);
	
	@Autowired(required=true)
	private NotifyImpl notifyImpl;
	
	public NotifyMessageResponse notify(NotifyMessageRequest request) throws MSPAPIGWExceptions{

		if(LOGGER.isInfoEnabled())
			LOGGER.info("NotificationServices-notify called");
		NotifyMessageResponse notifyMessageResponse=null;
		
		notifyMessageResponse = notifyImpl.notify(request);

		return notifyMessageResponse;
	}
}
