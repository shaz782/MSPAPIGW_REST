package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoRechargeResponse extends CommonResponse {
	
	private String MSISDN;
	private String transStatus;
	private String TransactionID;
	public String getMsisdn() {
		return MSISDN;
	}
	public void setMsisdn(String msisdn) {
		this.MSISDN = msisdn;
	}
	public String getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}

	

}
