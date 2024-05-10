package com.xius.msp.api.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentConfirmationRequest extends CommonRequest {

	@JsonProperty(value = "MSISDN")
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	private String msisdn;
	private String externalTransId;
	private String internalTransId;
	private String status;
	private String paymentTransId;
	private String denomination;
	
	
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getExternalTransId() {
		return externalTransId;
	}
	public void setExternalTransId(String externalTransId) {
		this.externalTransId = externalTransId;
	}
	public String getInternalTransId() {
		return internalTransId;
	}
	public void setInternalTransId(String internalTransId) {
		this.internalTransId = internalTransId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentTransId() {
		return paymentTransId;
	}
	public void setPaymentTransId(String paymentTransId) {
		this.paymentTransId = paymentTransId;
	}
	
 
}