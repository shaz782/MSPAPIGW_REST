package com.xius.msp.api.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.msp.api.impl.InitiatePaymentImpl;
import com.xius.client.msp.api.impl.PaymentConfirmationImpl;
import com.xius.msp.api.messages.InitiatePaymentRequest;
import com.xius.msp.api.messages.InitiatePaymentResponse;
import com.xius.msp.api.messages.PaymentConfirmationRequest;
import com.xius.msp.api.messages.PaymentConfirmationResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;

@Service
public class SmfAgentServices {

	private static final Logger LOGGER = LogManager.getLogger(SmfAgentServices.class);

	@Autowired(required = true)
	private InitiatePaymentImpl initiatePaymentImpl;
	
	@Autowired(required = true)
	private PaymentConfirmationImpl paymentConfirmationImpl;
 

	public PaymentConfirmationResponse paymentConfirmation(
			PaymentConfirmationRequest PaymentConfirmationRequest) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("SelfcareServices-PaymentConfirmation called");

		PaymentConfirmationResponse paymentConfirmationResponse = null;

		paymentConfirmationResponse = paymentConfirmationImpl.paymentTransDtls(PaymentConfirmationRequest);
		if (paymentConfirmationResponse != null)
			return paymentConfirmationResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- SMFAGENTSERVICES of PaymentConfirmationResponse is Null");
			return paymentConfirmationResponse;
		}
	}
	
	public InitiatePaymentResponse initiatePayment(
			InitiatePaymentRequest InitiatePaymentRequest) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("SelfcareServices-InitiatePayment called");

		InitiatePaymentResponse InitiatePaymentResponse = null;

		InitiatePaymentResponse = initiatePaymentImpl.paymentTransDtls(InitiatePaymentRequest);
		if (InitiatePaymentResponse != null)
			return InitiatePaymentResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("SelfcareServices- SMFAGENTSERVICES of InitiatePaymentResponse is Null");
			return InitiatePaymentResponse;
		}
	}

	 
	


}
