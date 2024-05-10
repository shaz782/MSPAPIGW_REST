package com.xius.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.messages.provisioning.device.ActivateTPtoSubscriberRequest;
import com.xius.xbus.messages.provisioning.device.ActivateTPtoSubscriberResponse;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRequest;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceResponse;
import com.xius.xbus.services.provisioning.device.DeviceServiceBindingStub;
import com.xius.xbus.services.provisioning.device.DeviceServiceLocator;

/**
 * 
 * @author shashidhar.p
 * @since 15th April,2020 Description : From Here we will invoke the
 *        xBusDeviceServices.
 */
@Component
public class XBusDeviceServiceInvoker {

	private static final Logger LOGGER = LogManager.getLogger(XBusDeviceServiceInvoker.class);

	@Autowired(required = true)
	public Utility utility;

	public ChangeDeviceResponse simswap(ChangeDeviceRequest xBusRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("XBusDeviceServiceInvoker - simswap called");
		}

		xBusRequest.setMessageID("1");

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName(headers.getUserName());
		securityId.setUserAccountPassword(headers.getUserPassword());
		xBusRequest.setSecurityId(securityId);

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headers.getCarrierID()));
		xBusRequest.setVersion("1");
		xBusRequest.setServiceContext(serviceContext);

		ChangeDeviceResponse response = null;
		DeviceServiceBindingStub stub = null;

		try {
			stub = new DeviceServiceBindingStub(new URL(getURL()), new DeviceServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));

			response = stub.changeDevice(xBusRequest);

		} catch (AxisFault e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServiceInvoker - changeDevice - AxisFault :" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		} catch (RemoteException e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServiceInvoker - changeDevice - RemoteException:" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		} catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServiceInvoker - changeDevice - MalformedURLException :" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}

	public ActivateTPtoSubscriberResponse activateTPtoSubscriber(ActivateTPtoSubscriberRequest xBusRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("XBusDeviceServiceInvoker - activateTPtoSubscriber called");
		}

		xBusRequest.setMessageID("1");

		SecurityId securityId = new SecurityId();
		securityId.setUserAccountName(headers.getUserName());
		securityId.setUserAccountPassword(headers.getUserPassword());
		xBusRequest.setSecurityId(securityId);

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headers.getCarrierID()));
		xBusRequest.setVersion("1");
		xBusRequest.setServiceContext(serviceContext);

		ActivateTPtoSubscriberResponse response = null;
		DeviceServiceBindingStub stub = null;

		try {
			stub = new DeviceServiceBindingStub(new URL(getURL()), new DeviceServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));

			response = stub.activateTPtoSubscriber(xBusRequest);

		} catch (AxisFault e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServiceInvoker - activateTPtoSubscriber - AxisFault :" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		} catch (RemoteException e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServiceInvoker - activateTPtoSubscriber - RemoteException:" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		} catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServiceInvoker - activateTPtoSubscriber - MalformedURLException :" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}

	private String getURL() {
		String url = utility.getProperty("xBus.DeviceServices");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDeviceServiceInvoker-xBus.DeviceServices-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("xBus.DeviceServices-URL ::" + url);
		}
		return url;
	}

}
