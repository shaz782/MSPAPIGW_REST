package com.xius.msp.api.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoRechargeRequest extends CommonRequest {
	
	@Pattern(regexp = "^(\\d{10}|\\d{12})$", message = "invalid MSISDN / MSISDNMSISDN length should be 10 or 12 digits")
	@JsonProperty(value = "MSISDN", required = true)
	private String msisdn;
	@JsonProperty(value = "transID", required = true)
	private String transId;
	private String remarks;
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

	
}
