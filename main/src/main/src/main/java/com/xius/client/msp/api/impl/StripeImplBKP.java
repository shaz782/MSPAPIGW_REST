package com.xius.client.msp.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Product;
import com.stripe.param.ProductCreateParams;
import com.xius.rmsp.utilities.Utility;
import com.stripe.param.PaymentIntentCreateParams;
import com.stripe.param.PriceCreateParams;
import com.stripe.model.Price;
import com.stripe.model.Customer;
import com.stripe.model.PaymentIntent;

@Component
public class StripeImplBKP {

	
    public static void main(String[] args) throws StripeException {
    	
    	
        Stripe.apiKey = "sk_test_51LFWMOSDHGCuLcmZGxK69Nt1cmbTsptVtSDOne8H0fgL5qKJ3stnN6V2lHsCPvvJfxlghUjfXBEOnAbQ0d4ob0yr00dqPWumYf";

        ProductCreateParams productParams =
            ProductCreateParams.builder()
                .setName("Starter Subscription")
                .setDescription("$12/Month subscription")
                .build();
        Product product = Product.create(productParams);
        System.out.println("Success! Here is your starter subscription product id: " + product.getId());

        PriceCreateParams params =
            PriceCreateParams
                .builder()
                .setProduct(product.getId())
                .setCurrency("usd")
                .setUnitAmount(12000L)
                .setRecurring(
                    PriceCreateParams.Recurring
                        .builder()
                        .setInterval(PriceCreateParams.Recurring.Interval.MONTH)
                        .build())
                .build();
        Price price = Price.create(params);
        System.out.println("Success! Here is your starter subscription price id: " + price.getId());
        
        
        //payment intent
        
        Stripe.apiKey = "sk_test_51LFWMOSDHGCuLcmZGxK69Nt1cmbTsptVtSDOne8H0fgL5qKJ3stnN6V2lHsCPvvJfxlghUjfXBEOnAbQ0d4ob0yr00dqPWumYf";

        PaymentIntentCreateParams pymtintentparams =
          PaymentIntentCreateParams.builder()
            .setAmount(1099L)
            .setCurrency("inr")
            .addPaymentMethodType("card")
            .build();

        PaymentIntent paymentIntent = PaymentIntent.create(pymtintentparams);
        String ClientSecret=paymentIntent.getClientSecret();
        System.out.println("ClientSecret>>"+ClientSecret);
        
        
        
        //https://dashboard.stripe.com/apikeys
        
     // Set your secret key. Remember to switch to your live secret key in production.
     // See your keys here: https://dashboard.stripe.com/apikeys
     Stripe.apiKey = "sk_test_51LFWMOSDHGCuLcmZGxK69Nt1cmbTsptVtSDOne8H0fgL5qKJ3stnN6V2lHsCPvvJfxlghUjfXBEOnAbQ0d4ob0yr00dqPWumYf";

     PaymentIntentCreateParams paramsintent =
       PaymentIntentCreateParams.builder()
         .setAmount(1099L)
         .setCurrency("inr")
         .setSetupFutureUsage(PaymentIntentCreateParams.SetupFutureUsage.OFF_SESSION)
         .build();

     PaymentIntent Intent = PaymentIntent.create(paramsintent);
        
    }
}