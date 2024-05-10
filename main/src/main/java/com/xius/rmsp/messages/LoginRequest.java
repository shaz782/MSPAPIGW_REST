package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class LoginRequest extends CommonRequest{
	
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid ICCID")
	@JsonProperty(value ="ICCID")
	private String iccid;
	@JsonProperty(value ="MSISDN")
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	private String msisdn;
	@JsonProperty(value ="accountID")
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
	private String accountId;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the iccid
	 */
	public String getIccid() {
		return iccid;
	}
	/**
	 * @param iccid the iccid to set
	 */
	public void setIccid(String iccid) {
		this.iccid = iccid;
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
		return "GetAccountDetailsRequest [iccid=" + iccid + ", msisdn=" + msisdn + ", accountId=" + accountId + "]";
	}

	
}