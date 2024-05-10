package com.xius.msp.api.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForgotPasswordRequest extends CommonRequest {

	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value = "MSISDN", required = true)
	private String msisdn;

	 
	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	 

}