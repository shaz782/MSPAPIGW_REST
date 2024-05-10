package com.xius.msp.api.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetServiceDetailsRequest extends CommonRequest {

	@JsonProperty(value = "MSISDN")
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	private String msisdn;
	 

	 
	public String getMsisdn() {
		return msisdn;
	}

	/**
	 * @param msisdn
	 *            the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	@Override
	public String toString() {
		return "GetServiceDetailsRequest [msisdn=" + msisdn + "]";
	}

	 
}