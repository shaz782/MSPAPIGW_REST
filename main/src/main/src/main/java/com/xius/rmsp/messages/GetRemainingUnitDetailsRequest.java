package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRemainingUnitDetailsRequest extends CommonRequest{

	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value ="MSISDN",required = true)
	private String msisdn;
	@JsonProperty(required = true)
	private String publicityID;
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
	@JsonProperty(value ="accountID")
	private String accountId;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getPublicityID() {
		return publicityID;
	}
	public void setPublicityID(String publicityID) {
		this.publicityID = publicityID;
	}
	@Override
	public String toString() {
		return "GetRemainingUnitDetailsRequest [msisdn=" + msisdn + ", publicityID=" + publicityID + ", accountId="
				+ accountId + "]";
	}
	
	
}