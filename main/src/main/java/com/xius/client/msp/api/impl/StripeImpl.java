package com.xius.client.msp.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import com.xius.rmsp.utilities.Utility;

@Component
public class StripeImpl {

	@Autowired(required = true)
	public Utility utility;

	public String getClientKey(String currency, long amount) throws StripeException {
		String ClientKey = null;
		Stripe.apiKey = utility.getProperty("STRIPE_SECRET_KEY");

		PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
				.setAutomaticPaymentMethods(
						PaymentIntentCreateParams.AutomaticPaymentMethods.builder().setEnabled(true).build())
				.setCurrency(currency).setAmount(amount).build();

		PaymentIntent Intent = PaymentIntent.create(params);

		ClientKey = Intent.getClientSecret();

		return ClientKey;
	}

	public String getPublishableKey() throws StripeException {
		String PublishableKey = utility.getProperty("STRIPE_PUBLISHABLE_KEY");
		return PublishableKey;
	}

}