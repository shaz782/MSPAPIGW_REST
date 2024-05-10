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
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse;
import com.xius.xbus.messages.billing.tariff.ActivateBulkATPRequest;
import com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.services.billing.tariff.TariffServiceBindingStub;
import com.xius.xbus.services.billing.tariff.TariffServiceLocator;

/**
 * 
 * @author shashidhar.p
 * @since 29th Aug,2019 Description : From Here we will invoke the Selfcare
 *        Services.
 */
@Component
public class XBusTariffServiceInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(XBusTariffServiceInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public ATPSubscriptionResponse atpSubscription(ATPSubscriptionRequest xBusRequest, CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("xBusTariffServiceInvoker - atpSubscription called");
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
		ATPSubscriptionResponse response=null;
		TariffServiceBindingStub stub = null;
		
		try{
			stub = new TariffServiceBindingStub(new URL(getURL()),new TariffServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.ATPSubscription(xBusRequest);
			
		}
		catch (AxisFault e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ATPSubscription - AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ATPSubscription - RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error( "ATPSubscription - MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}
	
	
	public ATPSubscriptionWithCCResponse atpSubscriptionWithCC(ATPSubscriptionWithCCRequest xBusRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("xBusTariffServiceInvoker - atpSubscriptionWithCC called");
		}
		
		xBusRequest.setMessageID("1");
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headers.getUserName());
		securityId.setUserAccountPassword(headers.getUserPassword());
		xBusRequest.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headers.getCarrierID()));
		xBusRequest.setVersion("192");
		xBusRequest.setServiceContext(serviceContext);
		xBusRequest.setServiceFlag("SUBSCRIBED");
		xBusRequest.setChannel(utility.getProperty("channel"));
		ATPSubscriptionWithCCResponse response=null;
		TariffServiceBindingStub stub = null;
		
		try{
			stub = new TariffServiceBindingStub(new URL(getURL()),new TariffServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.ATPSubscriptionWithCC(xBusRequest);
			
		}
		catch (AxisFault e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ATPSubscription-atpSubscriptionWithCC- AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ATPSubscription-atpSubscriptionWithCC- RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error( "ATPSubscription-atpSubscriptionWithCC- MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}
	
	
	public ActivateBulkATPResponse activateBulkAtpsub(ActivateBulkATPRequest xBusRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("xBusTariffServiceInvoker - activateBulkAtpsub called");
		}
		
		xBusRequest.setMessageID("1");
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headers.getUserName());
		securityId.setUserAccountPassword(headers.getUserPassword());
		xBusRequest.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headers.getCarrierID()));
		xBusRequest.setVersion("192");
		xBusRequest.setServiceContext(serviceContext);
		xBusRequest.setServiceFlag("SUBSCRIBED");
		xBusRequest.setChannel(utility.getProperty("channel"));
		ActivateBulkATPResponse response=null;
		TariffServiceBindingStub stub = null;
		
		try{
			stub = new TariffServiceBindingStub(new URL(getURL()),new TariffServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.activateBulkATPSub(xBusRequest);
			
		}
		catch (AxisFault e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ATPSubscription-activateBulkAtpsub- AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ATPSubscription-activateBulkAtpsub- RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error( "ATPSubscription-activateBulkAtpsub- MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}
	

	private String getURL() {
		String url = utility.getProperty("xBus.TariffServices");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("xBusTariffServiceInvoker-xBus.TariffServices-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("xBus.TariffServices-URL ::" + url);
		}
		return url;
	}

}
