package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSubCoreBalanceRequest extends CommonRequest {
	
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value ="MSISDN",required = true)
	private String msisdn;
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
	@JsonProperty(value ="accountID")
	private String accountId;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "GetSubCoreBalanceRequest [msisdn=" + msisdn + ", accountId=" + accountId + "]";
	}
	
	

}
