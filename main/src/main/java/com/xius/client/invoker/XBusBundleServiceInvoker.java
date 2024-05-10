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
import com.xius.xbus.messages.billing.bundle.GiftBundlesRequest;
import com.xius.xbus.messages.billing.bundle.GiftBundlesResponse;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.services.billing.bundle.BundleBindingStub;
import com.xius.xbus.services.billing.bundle.BundleServiceLocator;

/**
 * 
 * @author shashidhar.p
 * @since 24th Jan,2020 Description : From Here we will invoke the xBus BundleService.
 */
@Component
public class XBusBundleServiceInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(XBusBundleServiceInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public GiftBundlesResponse giftBundle(GiftBundlesRequest xBusRequest, CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("XBusBundleServiceInvoker - giftBundle called");
		}
		
		xBusRequest.setMessageID("1");
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headers.getUserName());
		securityId.setUserAccountPassword(headers.getUserPassword());
		xBusRequest.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headers.getCarrierID()));
		xBusRequest.setVersion("1");
		xBusRequest.setServiceContext(serviceContext);
		xBusRequest.setChannel(utility.getProperty("channel"));
		GiftBundlesResponse response=null;
		BundleBindingStub stub = null;
		
		try{
			stub = new BundleBindingStub(new URL(getURL()),new BundleServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.giftBundles(xBusRequest);
			
		}
		catch (AxisFault e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("giftBundle - AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("giftBundle - RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error( "giftBundle - MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}
	
	

	private String getURL() {
		String url = utility.getProperty("xBus.BundleServices");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("xBusBundleServicesInvoker-xBus.BundleServices-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("xBus.BundleServices-URL ::" + url);
		}
		return url;
	}

}
