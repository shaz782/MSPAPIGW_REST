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
import com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest;
import com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse;
import com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceRequest;
import com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse;
import com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcRequest;
import com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse;
import com.xius.xbus.messages.common.SecurityId;
import com.xius.xbus.messages.common.ServiceContext;
import com.xius.xbus.services.billing.debitorcredit.DebitOrCreditBindingStub;
import com.xius.xbus.services.billing.debitorcredit.DebitOrCreditServiceLocator;

/**
 * 
 * @author shashidhar.p
 * @since 14th Nov,2019 Description : From Here we will invoke the Selfcare
 *        Services.
 */
@Component
public class XBusDebitOrCreditInvoker {
	
	private static final Logger LOGGER = LogManager.getLogger(XBusDebitOrCreditInvoker.class);

	@Autowired(required = true)
	public Utility utility;
	
	public RechargeWithCcResponse rechargeWithCC(RechargeWithCcRequest xBusRequest, CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("xBusDebitOrCreditInvoker - rechargeWithCC called");
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
		xBusRequest.setChannel(utility.getProperty("RC_Channel"));
		RechargeWithCcResponse response=null;
		DebitOrCreditBindingStub stub = null;
		try{
			stub = new DebitOrCreditBindingStub(new URL(getURL()),new DebitOrCreditServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.rechargeWithCc(xBusRequest);
			
		}
		catch (AxisFault e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("RechargeWithCC - AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("RechargeWithCC - RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error( "RechargeWithCC - MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}
	
	
	public ActivateRcProductResponse activateRcProduct(ActivateRcProductRequest xBusRequest, CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("xBusDebitOrCreditInvoker - ActivateRcProduct called");
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
		xBusRequest.setChannel(utility.getProperty("RC_Channel"));
		ActivateRcProductResponse response=null;
		DebitOrCreditBindingStub stub = null;
		try{
			stub = new DebitOrCreditBindingStub(new URL(getURL()),new DebitOrCreditServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.activateRcProduct(xBusRequest);
			
		}
		catch (AxisFault e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ActivateRcProduct - AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("ActivateRcProduct - RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error( "ActivateRcProduct - MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}
	
	
	public AdjustBalanceResponse adjustBalance(AdjustBalanceRequest xBusRequest, CommonHeaders headers) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("xBusDebitOrCreditInvoker - adjustBalance called");
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
		
		AdjustBalanceResponse response=null;
		DebitOrCreditBindingStub stub = null;
		try{
			stub = new DebitOrCreditBindingStub(new URL(getURL()),new DebitOrCreditServiceLocator());
			stub.setTimeout(Integer.parseInt(utility.getxBusTimeOut()));
			
			response=stub.adjustBalance(xBusRequest);
			
		}
		catch (AxisFault e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("adjustBalance - AxisFault :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (RemoteException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("adjustBalance - RemoteException:"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		catch (MalformedURLException e) {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error( "adjustBalance - MalformedURLException :"+e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
		}
		return response;
	}

	private String getURL() {
		String url = utility.getProperty("xBus.DebitOrCreditServices");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("xBusDebitOrCreditInvoker-xBus.DebitOrCreditServices-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("xBus.DebitOrCreditServices-URL ::" + url);
		}
		return url;
	}


}
