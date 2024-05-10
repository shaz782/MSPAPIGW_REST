package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetActivePackDetailsRequest extends CommonRequest{
	
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value ="MSISDN",required = true)
	private String msisdn;
	
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
	@JsonProperty(value ="accountID")
	private String accountId;
	

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}

	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	@Override
	public String toString() {
		return "GetActivePackDetailsRequest [msisdn=" + msisdn + ", accountId=" + accountId + "]";
	}
	
	
}
