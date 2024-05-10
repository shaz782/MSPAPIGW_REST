package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.DeactivatePackImpl;
import com.xius.client.impl.PurchasePackageImpl;
import com.xius.client.impl.PurchasePackageWithCCImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.DeactivatePackRequest;
import com.xius.rmsp.messages.DeactivatePackResponse;
import com.xius.rmsp.messages.PurchaseATPCCRequest;
import com.xius.rmsp.messages.PurchaseATPCCResponse;
import com.xius.rmsp.messages.PurchaseATPRequest;
import com.xius.rmsp.messages.PurchaseATPResponse;

@Service
public class XBusTariffServices {

	private static final Logger LOGGER = LogManager.getLogger(XBusTariffServices.class);

	@Autowired(required = true)
	private PurchasePackageImpl purchasePackageImpl;
	
	@Autowired(required = true)
	private PurchasePackageWithCCImpl purchasePackageWithCCImpl;
	
	@Autowired(required = true)
	private DeactivatePackImpl deactivatePackImpl;
	
	public PurchaseATPResponse purchasePack(PurchaseATPRequest purchaseATPRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusTariffServices-purchasePack called");

		PurchaseATPResponse purchaseATPResponse = null;

		purchaseATPResponse = purchasePackageImpl
				.purchasePackage(purchaseATPRequest);
		if (purchaseATPResponse != null)
			return purchaseATPResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusTariffServices- purchasePack of PurchaseATPResponse is Null");
			return purchaseATPResponse;
		}
	}
	
	public PurchaseATPCCResponse purchasePackWithCc(PurchaseATPCCRequest purchaseATPCCRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusTariffServices-purchasePackWithCc called");

		PurchaseATPCCResponse purchaseATPCCResponse = null;

		purchaseATPCCResponse = purchasePackageWithCCImpl
				.purchasePackageWithOutCc(purchaseATPCCRequest);
		if (purchaseATPCCResponse != null)
			return purchaseATPCCResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusTariffServices- purchasePackWithCc of PurchaseATPCCResponse is Null");
			return purchaseATPCCResponse;
		}
	}
	
	public DeactivatePackResponse deactivatePack(DeactivatePackRequest deactivatePackRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusTariffServices-deactivatePack called");

		DeactivatePackResponse deactivatePackResponse = null;

		deactivatePackResponse = deactivatePackImpl
				.deactivatePack(deactivatePackRequest);
		if (deactivatePackResponse != null)
			return deactivatePackResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusTariffServices- purchasePack of PurchaseATPResponse is Null");
			return deactivatePackResponse;
		}
	}

}
