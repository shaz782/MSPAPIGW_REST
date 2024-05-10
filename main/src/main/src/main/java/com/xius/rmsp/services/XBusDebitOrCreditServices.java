package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.ActivateRcProductImpl;
import com.xius.client.impl.AdjustBalanceImpl;
import com.xius.client.impl.RechargeWithCCImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.DebitAccountRequest;
import com.xius.rmsp.messages.DebitAccountResponse;
import com.xius.rmsp.messages.RechargeWithCCRequest;
import com.xius.rmsp.messages.RechargeWithCCResponse;

@Service
public class XBusDebitOrCreditServices {

	private static final Logger LOGGER = LogManager.getLogger(XBusDebitOrCreditServices.class);

	@Autowired(required = true)
	private RechargeWithCCImpl rechargeWithCCImpl;
	
	@Autowired(required = true)
	private ActivateRcProductImpl activateRcProductImpl;
	
	@Autowired(required = true)
	private AdjustBalanceImpl adjustBalanceImpl;
	
	public RechargeWithCCResponse rechargeWithCC(RechargeWithCCRequest rechargeWithCCRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusDebitOrCreditServices-RechargeWithCC called");

		RechargeWithCCResponse rechargeWithCCResponse = null;

		rechargeWithCCResponse = rechargeWithCCImpl.rechargeWithCC(rechargeWithCCRequest);
		if (rechargeWithCCResponse != null)
			return rechargeWithCCResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDebitOrCreditServices- RechargeWithCC of RechargeWithCCResponse is Null");
			return rechargeWithCCResponse;
		}
	}
	
	public RechargeWithCCResponse activateRcProduct(RechargeWithCCRequest rechargeWithCCRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusDebitOrCreditServices-activateRcProduct called");

		RechargeWithCCResponse rechargeWithCCResponse = null;

		rechargeWithCCResponse = activateRcProductImpl.activateRcProduct(rechargeWithCCRequest);
		if (rechargeWithCCResponse != null)
			return rechargeWithCCResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDebitOrCreditServices- activateRcProduct of RechargeWithCCResponse is Null");
			return rechargeWithCCResponse;
		}
	}
	
	public DebitAccountResponse adjustBalance(DebitAccountRequest debitAccountRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("XBusDebitOrCreditServices-adjustBalance called");

		DebitAccountResponse debitAccountResponse = null;

		debitAccountResponse = adjustBalanceImpl.adjustBalance(debitAccountRequest);
		if (debitAccountResponse != null)
			return debitAccountResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("XBusDebitOrCreditServices- adjustBalance of DebitAccountResponse is Null");
			return debitAccountResponse;
		}
	}
}
