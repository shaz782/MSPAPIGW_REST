package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentPublishableKeyResponse extends CommonResponse {

	private String publishableKey;

	public String getPublishableKey() {
		return publishableKey;
	}

	public void setPublishableKey(String publishableKey) {
		this.publishableKey = publishableKey;
	}
	
	
}