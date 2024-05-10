package com.xius.client.invoker;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.impl.ActivatePackageImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.services.billing.tariff.TariffServiceBindingStub;
import com.xius.xbus.services.billing.tariff.TariffServiceLocator;


@Component
public class ATPSubscriptionInvoker {

	@Autowired(required = true)
	public Utility utility;
	
	private static final Logger logger = LogManager.getLogger(ActivatePackageImpl.class);
	public com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse atpSubscription(
			ATPSubscriptionRequest aTPSubscriptionRequest,CommonHeaders headerDetails) throws MSPAPIGWExceptions {
		
		logger.info("The call reached ATPSubscriptionInvoker ");
		
		aTPSubscriptionRequest.setMessageID("1");
		
		SecurityId securityId=new SecurityId();
		securityId.setUserAccountName(headerDetails.getUserName());
		securityId.setUserAccountPassword("11111111");
		aTPSubscriptionRequest.setSecurityId(securityId);
		
		ServiceContext serviceContext=new ServiceContext();
		serviceContext.setCarrierId(String.valueOf(headerDetails.getCarrierID()));
		aTPSubscriptionRequest.setVersion("1");
		aTPSubscriptionRequest.setServiceContext(serviceContext);
		
		String url =utility.getProperty("xbus.url.cxf.tariffservice");;
		
		if(logger.isInfoEnabled()){
			logger.info("The  Url for calling xbus invoker"+url);
		}
		
		ATPSubscriptionResponse response=null;
		TariffServiceBindingStub stub = null;
		
		try{
			stub = new TariffServiceBindingStub(new URL(url),new TariffServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.ATPSubscription(aTPSubscriptionRequest);
			
		}
		catch (AxisFault e) {
			if (logger.isErrorEnabled()) 
				logger.error("RechargeWithCC - AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (logger.isErrorEnabled()) 
				logger.error("RechargeWithCC - RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (logger.isErrorEnabled()) 
				logger.error( "RechargeWithCC - MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}
	

}
