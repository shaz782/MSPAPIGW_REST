package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetSubDataRequest extends CommonRequest{

	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid msisdnNo")
	@JsonProperty(value ="msisdnNo",required = true)
	private String msisdnNo;
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
	@JsonProperty(value ="accountID")
	private String accountId;
	public String getMsisdnNo() {
		return msisdnNo;
	}
	public void setMsisdnNo(String msisdnNo) {
		this.msisdnNo = msisdnNo;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "GetSubDataRequest [msisdnNo=" + msisdnNo + ", accountId=" + accountId + "]";
	}

	
	
}