package com.xius.msp.api.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.DoRechargeImpl;
import com.xius.client.msp.api.impl.GetAvailableDenomsImpl;
import com.xius.client.msp.api.impl.GetAvailableServiceDetailsImpl;
import com.xius.client.msp.api.impl.GetMsisdnDetailsImpl;
import com.xius.client.msp.api.impl.GetServiceDetailsImpl;
import com.xius.client.msp.api.impl.GetSubAccountDetailsImpl;
import com.xius.client.msp.api.impl.GetSubsDetailsImpl;
import com.xius.client.msp.api.impl.RechargeDataImpl;
import com.xius.msp.api.messages.DoRechargeRequest;
import com.xius.msp.api.messages.DoRechargeResponse;
import com.xius.msp.api.messages.GetAccountDetailsRequest;
import com.xius.msp.api.messages.GetAccountDetailsResponse;
import com.xius.msp.api.messages.GetAvailableServiceDetailsRequest;
import com.xius.msp.api.messages.GetAvailableServiceDetailsResponse;
import com.xius.msp.api.messages.GetDenominationDetailsRequest;
import com.xius.msp.api.messages.GetDenominationDetailsResponse;
import com.xius.msp.api.messages.GetMsisdnDetailsRequest;
import com.xius.msp.api.messages.GetMsisdnDetailsResponse;
import com.xius.msp.api.messages.GetServiceDetailsRequest;
import com.xius.msp.api.messages.GetServiceDetailsResponse;
import com.xius.msp.api.messages.GetSubsDetailsRequest;
import com.xius.msp.api.messages.GetSubsDetailsResponse;
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
	
	@Autowired(required = true)
	private GetMsisdnDetailsImpl getMsisdnDetailsImpl;
	
	
	@Autowired(required = true)
	private GetSubsDetailsImpl getSubMsisdnDetailsImpl;
	
	@Autowired(required = true)
	private DoRechargeImpl doRechargeImpl;
	

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

	public GetAvailableServiceDetailsResponse getAvailableServiceDetails(
			GetAvailableServiceDetailsRequest getAvailableServiceDetailsRequest) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-GettAvailableServiceDetails called");

		GetAvailableServiceDetailsResponse GetAvailableServiceDetailsResponse = null;

		GetAvailableServiceDetailsResponse = getAvailableServiceDetailsImpl
				.getAvailableServiceDetails(getAvailableServiceDetailsRequest);
		if (GetAvailableServiceDetailsResponse != null)
			return GetAvailableServiceDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error(
						"BillingServices- GettAvailableServiceDetails of GettAvailableServiceDetailsResponse is Null");
			return GetAvailableServiceDetailsResponse;

		}
	}

	public GetDenominationDetailsResponse getDenominationDetails(
			GetDenominationDetailsRequest GetDenominationDetailsRequest) throws MSPAPIGWExceptions {
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

	public GetMsisdnDetailsResponse getMsisdnDetails(GetMsisdnDetailsRequest request) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getMsisdnDetails called");

		GetMsisdnDetailsResponse getMsisdnDetailsResponse = null;

		getMsisdnDetailsResponse = getMsisdnDetailsImpl.getMsisdnDetails(request);
		if (getMsisdnDetailsResponse != null)
			return getMsisdnDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- GetMsisdnDetailsResponse of GetMsisdnDetailsResponse is Null");
			return getMsisdnDetailsResponse;

		}
	}

public GetSubsDetailsResponse getSubsDetails(GetSubsDetailsRequest getSubMsisdnDetailsRequest) throws MSPAPIGWExceptions{
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getMsisdnDetails called");
		
		GetSubsDetailsResponse getSubMsisdnDetailsResponse = null;
		
		getSubMsisdnDetailsResponse = getSubMsisdnDetailsImpl.getSubMsisdnDetails(getSubMsisdnDetailsRequest);
		
		if(getSubMsisdnDetailsResponse!=null) {
			return getSubMsisdnDetailsResponse;
		}else {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("BillingServices- getMsisdnDetails of GetSubMsisdnDetailsResponse is Null");
			return getSubMsisdnDetailsResponse;
		}
		
	}
	
	public DoRechargeResponse doRechargeCheck(DoRechargeRequest doRechargeCheckRequest) throws MSPAPIGWExceptions {
		
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-doRechargeCheck called");
		
		DoRechargeResponse response = new DoRechargeResponse();

		response = doRechargeImpl.recharge(doRechargeCheckRequest);
		
		if(response!=null) {
			return response;
		}else {
			if (LOGGER.isErrorEnabled()) 
				LOGGER.error("BillingServices- doRechargeCheck of DoRechargeCheckResponse is Null");
			return response;
		}
	}
	
}
