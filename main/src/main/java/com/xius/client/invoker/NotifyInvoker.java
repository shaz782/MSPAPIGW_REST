package com.xius.client.invoker;

import java.net.URL;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.messages.common.ErrorDetailsType;
import com.xius.msp.mq.client.notification.NotificationManagementBindingStub;
import com.xius.msp.mq.client.notification.NotificationManagementServiceLocator;
import com.xius.msp.mq.messages.notification.NotifyMessageRequest;
import com.xius.msp.mq.messages.notification.NotifyMessageResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 4th Oct,2019 Description : From Here we will invoke the Notification
 *        Services.
 */
@Component
public class NotifyInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(NotifyInvoker.class);

	@Autowired(required = true)
	public Utility utility;

	public NotifyMessageResponse notify(NotifyMessageRequest agentRequest, CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("NotifyInvoker - notify called");
		}
		NotifyMessageResponse agentResponse = null;
		NotificationManagementBindingStub bindingStub = null;

		try {
			bindingStub = new NotificationManagementBindingStub(new URL(getNotifyURL()),
					new NotificationManagementServiceLocator());
			bindingStub.setHeader(getHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(getTimeOut()));
			agentResponse = bindingStub.notifyMessage(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("NotifyInvoker-notify-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("NotifyInvoker-notify-Exception" + e.getStackTrace());
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	
	

	private String getTimeOut() {

		String timeOut = utility.getProperty("notify.timeOut");

		if (timeOut == null || timeOut.equals("")) {
			LOGGER.error("NotifyInvoker-notify-timeOut is Null");
		}

		return timeOut;
	}

	private String getNotifyURL() {

		String url = utility.getProperty("notify.url");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("NotifyInvoker-iba.notify-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("notify-URL ::" + url);
		}
		return url;
	}

	private SOAPHeaderElement getHeader(CommonHeaders headers) {
		SOAPHeaderElement header = null;
		try {

			header = new SOAPHeaderElement("http://ne.xius.com/common/header/HeaderDetails.xsd", "messageHeader");
			header.setActor(null);
			header.setActor(null);
			header.setPrefix("head");
			SOAPElement cNode;
			
			SOAPElement node1;
			SOAPElement node2;
			
			cNode = header.addChildElement("trackingMessageHeader");
			node1 = cNode.addChildElement("messageId");
			node1.addTextNode("1234"); 
			node2 = cNode.addChildElement("carrierId");
			node2.addTextNode(headers.getCarrierID()); 
			node2 = cNode.addChildElement("userId");
			node2.addTextNode(headers.getUserName());
			
		} catch (SOAPException se) {
			LOGGER.error("NotifyInvoker-getHeader-SOAPException" + se.fillInStackTrace().toString());
		}
		return header;
	}

}
