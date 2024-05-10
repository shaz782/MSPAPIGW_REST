package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMsisdnDetailsResponse extends CommonResponse {

	private java.lang.String accountStatus;
	private java.lang.String MSISDN;
	private java.lang.String networkId;
	
	public java.lang.String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(java.lang.String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public java.lang.String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(java.lang.String mSISDN) {
		MSISDN = mSISDN;
	}
	public java.lang.String getNetworkId() {
		return networkId;
	}
	public void setNetworkId(java.lang.String networkId) {
		this.networkId = networkId;
	}
} 
