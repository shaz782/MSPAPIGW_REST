package com.xius.client.msp.api.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

import net.bcgi.si.messages.mvnoapi.common.ServiceContext;
import net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordRequest;
import net.bcgi.si.messages.mvnoapi.subscriber.ForgotPasswordResponse;
import net.bcgi.si.messages.mvnoapi.subscriber.UserType;
import soap_binding.servicemix.ISubscriberAppLocator;
import soap_binding.servicemix.ISubscriberAppPortType;

/**
 * 
 * @author shashidhar.p
 * @since 29th Aug,2019 Description : From Here we will invoke the Selfcare
 *        Services.
 */
@Component
public class XBusSubscriberInvoker {

	private static final Logger LOGGER = LogManager.getLogger(XBusSubscriberInvoker.class);

	@Autowired(required = true)
	public Utility utility;

	public ForgotPasswordResponse ForgotPassword(ForgotPasswordRequest xBusRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("XBusSubscriberInvoker - ForgotPassword called");
		}

		xBusRequest.setMessageID("1");

		net.bcgi.si.messages.mvnoapi.common.SecurityId securityId = new net.bcgi.si.messages.mvnoapi.common.SecurityId();
		securityId.setUserAccountName(headers.getUserName());
		securityId.setUserAccountPassword(headers.getUserPassword());
		xBusRequest.setSecurityId(securityId);

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headers.getCarrierID()));
		xBusRequest.setVersion("1");
		xBusRequest.setUserType(UserType.SUBSCRIBER);
		xBusRequest.setServiceContext(serviceContext);
		ForgotPasswordResponse response = null;

		try {
			ISubscriberAppLocator subLoc = null;
			ISubscriberAppPortType porttype = null;
			String url = getURL();
			subLoc = new ISubscriberAppLocator();

			porttype = subLoc.getSubscriberApp(new URL(url));

			response = porttype.forgotPassword(xBusRequest);

		} catch (AxisFault e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ForgotPassword - AxisFault :" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		} catch (RemoteException e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ForgotPassword - RemoteException:" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		} catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ForgotPassword - MalformedURLException :" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		} catch (ServiceException e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ForgotPassword - ServiceException :" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}

	private String getURL() {
		String url = utility.getProperty("xBus.Subscriber");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("xBus.Subscriber-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("xBus.Subscriber-URL ::" + url);
		}
		return url;
	}

}
