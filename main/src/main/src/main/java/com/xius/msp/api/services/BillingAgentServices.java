package com.xius.msp.api.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.msp.api.impl.GetAvailableServiceDetailsImpl;
import com.xius.client.msp.api.impl.GetAvailableDenomsImpl;
import com.xius.client.msp.api.impl.GetServiceDetailsImpl;
import com.xius.client.msp.api.impl.GetSubAccountDetailsImpl;
import com.xius.client.msp.api.impl.RechargeDataImpl;
import com.xius.msp.api.messages.GetAccountDetailsRequest;
import com.xius.msp.api.messages.GetAccountDetailsResponse;
import com.xius.msp.api.messages.GetAvailableServiceDetailsRequest;
import com.xius.msp.api.messages.GetAvailableServiceDetailsResponse;
import com.xius.msp.api.messages.GetDenominationDetailsRequest;
import com.xius.msp.api.messages.GetDenominationDetailsResponse;
import com.xius.msp.api.messages.GetServiceDetailsRequest;
import com.xius.msp.api.messages.GetServiceDetailsResponse;
import com.xius.msp.api.messages.RechargeHistoryRequest;
import com.xius.msp.api.messages.RechargeHistoryResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;

@Service
public class BillingAgentServices {

	private static final Logger LOGGER = LogManager.getLogger(BillingAgentServices.class);

	@Autowired(required = true)
	private RechargeDataImpl rechargeDataImpl;
	
	@Autowired(required = true)
	private GetSubAccountDetailsImpl getSubAccountDetailsImpl;
	
	@Autowired(required = true)
	private GetServiceDetailsImpl getServiceDetailsImpl;
	
	@Autowired(required = true)
	private GetAvailableServiceDetailsImpl getAvailableServiceDetailsImpl;
	
	@Autowired(required = true)
	private GetAvailableDenomsImpl getAvailableDenomsImpl;
	
	


	public RechargeHistoryResponse rechargeHistory(RechargeHistoryRequest RechargeHistoryRequest)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-RechargeHistory called");

		RechargeHistoryResponse RechargeHistoryResponse = null;

		RechargeHistoryResponse = rechargeDataImpl.rechargeDataImpl(RechargeHistoryRequest);
		if (RechargeHistoryResponse != null)
			return RechargeHistoryResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- rechargeDataImpl of rechargeDataResponse is Null");
			return RechargeHistoryResponse;
		}
	}

	public GetAccountDetailsResponse getAccountDetails(GetAccountDetailsRequest getAccountDetailsRequest)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-GetAccountDetails called");

		GetAccountDetailsResponse GetAccountDetailsResponse = null;

		GetAccountDetailsResponse = getSubAccountDetailsImpl.getAccountDetails(getAccountDetailsRequest);
		if (GetAccountDetailsResponse != null)
			return GetAccountDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- GetAccountDetails of GetAccountDetailsResponse is Null");
			return GetAccountDetailsResponse;
		}
	}

	public GetServiceDetailsResponse getServiceDetails(GetServiceDetailsRequest getServiceDetailsRequest)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-GetServiceDetails called");

		GetServiceDetailsResponse GetServiceDetailsResponse = null;

		GetServiceDetailsResponse = getServiceDetailsImpl.getServiceDetails(getServiceDetailsRequest);
		if (GetServiceDetailsResponse != null)
			return GetServiceDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- GetServiceDetails of GetServiceDetailsResponse is Null");
			return GetServiceDetailsResponse;
		
	}
	}
	public GetAvailableServiceDetailsResponse getAvailableServiceDetails(GetAvailableServiceDetailsRequest getAvailableServiceDetailsRequest)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-GettAvailableServiceDetails called");

		GetAvailableServiceDetailsResponse GetAvailableServiceDetailsResponse = null;

		GetAvailableServiceDetailsResponse = getAvailableServiceDetailsImpl.getAvailableServiceDetails(getAvailableServiceDetailsRequest);
		if (GetAvailableServiceDetailsResponse != null)
			return GetAvailableServiceDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- GettAvailableServiceDetails of GettAvailableServiceDetailsResponse is Null");
			return GetAvailableServiceDetailsResponse;
		
	}
	}
	
	public GetDenominationDetailsResponse getDenominationDetails(GetDenominationDetailsRequest GetDenominationDetailsRequest)
			throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-GettAvailableServiceDetails called");

		GetDenominationDetailsResponse GetDenominationDetailsResponse = null;

		GetDenominationDetailsResponse = getAvailableDenomsImpl.getAvailableDenomsImpl(GetDenominationDetailsRequest);
		if (GetDenominationDetailsResponse != null)
			return GetDenominationDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- GetDenominationDetails of GetDenominationDetailsResponse is Null");
			return GetDenominationDetailsResponse;
		
	}
	}

}
