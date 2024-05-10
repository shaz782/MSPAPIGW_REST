package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InitiatePaymentResponse extends CommonResponse {

	private String internalTransId;
	private String externalTransId;
	public String getInternalTransId() {
		return internalTransId;
	}
	public void setInternalTransId(String internalTransId) {
		this.internalTransId = internalTransId;
	}
	public String getExternalTransId() {
		return externalTransId;
	}
	public void setExternalTransId(String externalTransId) {
		this.externalTransId = externalTransId;
	}

	 

}