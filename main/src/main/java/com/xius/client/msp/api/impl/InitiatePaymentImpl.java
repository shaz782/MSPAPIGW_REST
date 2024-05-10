package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stripe.exception.StripeException;
import com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsRequest;
import com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse;
import com.xius.client.invoker.SMFManagementInvoker;
import com.xius.msp.api.messages.InitiatePaymentRequest;
import com.xius.msp.api.messages.InitiatePaymentResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 17th April,2020 Description : From Here we will invoke the
 *        InfinetBilling APIs Services.
 */
@Component
public class InitiatePaymentImpl {

	private static final Logger LOGGER = LogManager.getLogger(InitiatePaymentImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SMFManagementInvoker smfIvoker;

	@Autowired(required = true)
	public Utility utility;
	
	@Autowired(required = true)
	public StripeImpl stripeImpl;
	

	InitiatePaymentResponse response = null;

	PaymentTransDtlsRequest smfRequest = null;
	PaymentTransDtlsResponse smfResponse = null;

	String transId = null;

	public InitiatePaymentResponse paymentTransDtls(InitiatePaymentRequest request) throws MSPAPIGWExceptions {

		smfRequest = getSmfAgentRequest(request);
	
		String key=null;
		try {
			String Currency = utility.getProperty("STRIPE_CURRENCY_TYPE");
			String AmountAppend = utility.getProperty("STRIPE_AMOUNT_APPEND");
			  key=stripeImpl.getClientKey(Currency, Long.parseLong(request.getDenomination()+AmountAppend));
		} catch (NumberFormatException | StripeException e) {
			if (LOGGER.isErrorEnabled()) {
			LOGGER.error("InitiatePaymentImpl-InitiatePayment StripeException "+e.getMessage());
			LOGGER.error("InitiatePaymentImpl-InitiatePayment StripeException "+e.getCause());
			LOGGER.error("InitiatePaymentImpl-InitiatePayment StripeException "+e);
			}
			e.printStackTrace();
		}
		
		if(key!=null) {
			smfRequest.setInternalTransId(key);
		}
		 else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("InitiatePaymentImpl-InitiatePayment  Stripe key is Null");
			}
		if (smfRequest != null) {
			smfResponse = smfIvoker.paymentTransDtls(smfRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("InitiatePaymentImpl-InitiatePayment request of paymentTransDtls is Null");
		}
		if (smfResponse != null) {

			response = setAgentResponse(key);

		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("InitiatePaymentImpl-InitiatePayment response of paymentTransDtls is Null");
		}
		return response;
	}

	private PaymentTransDtlsRequest getSmfAgentRequest(InitiatePaymentRequest request) {
		if (request != null) {
			smfRequest = new PaymentTransDtlsRequest();

			smfRequest.setMSISDN(request.getMsisdn());
			smfRequest.setChannel(request.getChannel());
			String Currency = utility.getProperty("STRIPE_CURRENCY_TYPE");
			smfRequest.setCurrency(Currency);
			String AmountAppend = utility.getProperty("STRIPE_AMOUNT_APPEND");
			smfRequest.setDenomination(request.getDenomination()+AmountAppend);
			smfRequest.setExternalTransId(request.getExternalTransId());
			smfRequest.setFlag("INSERT");
			if (request.getCarrierID() != null)
				headers.setCarrierID(request.getCarrierID());

			if (request.getUserName() != null)
				headers.setUserName(request.getUserName());

			if (request.getUserPassword() != null)
				headers.setUserPassword(request.getUserPassword());

		}
		return smfRequest;
	}

	private InitiatePaymentResponse setAgentResponse(String key) {

		response = new InitiatePaymentResponse();
		
		if (key != null) {
			response.setInternalTransId(key);
		}

		return response;
	}

}
