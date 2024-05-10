package com.xius.msp.api.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.msp.api.impl.ActivateTPImpl;
import com.xius.client.msp.api.impl.ForgotPasswordImpl;
import com.xius.client.msp.api.impl.PackPurchaseImpl;
import com.xius.msp.api.messages.ActivateTPRequest;
import com.xius.msp.api.messages.ActivateTPResponse;
import com.xius.msp.api.messages.ForgotPasswordRequest;
import com.xius.msp.api.messages.ForgotPasswordResponse;
import com.xius.msp.api.messages.PackPurchaseRequest;
import com.xius.msp.api.messages.PackPurchaseResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;

@Service
public class XBusServices {

	private static final Logger LOGGER = LogManager.getLogger(XBusServices.class);

	@Autowired(required = true)
	private PackPurchaseImpl PackPurchaseImpl;

	@Autowired(required = true)
	private ForgotPasswordImpl forgotPasswordImpl;

	@Autowired(required = true)
	ActivateTPImpl  activateTPImpl;
	
	public PackPurchaseResponse purchasePack(PackPurchaseRequest PackPurchaseRequest) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusTariffServices-purchasePack called");

		PackPurchaseResponse PackPurchaseResponse = null;

		PackPurchaseResponse = PackPurchaseImpl.purchasePackage(PackPurchaseRequest);
		if (PackPurchaseResponse != null)
			return PackPurchaseResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusTariffServices- purchasePack of PackPurchaseResponse is Null");
			return PackPurchaseResponse;
		}
	}

	public ForgotPasswordResponse forgotPassword(ForgotPasswordRequest forgotPasswordRequest)
			throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusTariffServices-forgotPassword called");

		ForgotPasswordResponse forgotPasswordResponse = null;

		forgotPasswordResponse = forgotPasswordImpl.forgotPassword(forgotPasswordRequest);
		if (forgotPasswordResponse != null)
			return forgotPasswordResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusTariffServices- forgotPassword of forgotPasswordResponse is Null");
			return forgotPasswordResponse;
		}
	}

	public ActivateTPResponse activateTP(ActivateTPRequest activateTPRequest) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusDeviceServices-activateTP called");

		ActivateTPResponse activateTPResponse = null;

		activateTPResponse = activateTPImpl.activateTP(activateTPRequest);

		if (activateTPResponse != null)
			return activateTPResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusServices- activateTP of activateTPResponse is Null");
			return activateTPResponse;
		}
	}

}
