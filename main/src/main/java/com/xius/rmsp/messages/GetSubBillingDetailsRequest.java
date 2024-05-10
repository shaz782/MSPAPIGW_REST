package com.xius.rmsp.messages;


import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"carrierId","userName","userPassword","MSISDN","sellerCode"})
public class GetSubBillingDetailsRequest extends CommonRequest{

	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value ="MSISDN",required = true)
	private String msisdn;
	private String sellerCode;
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
	/**
	 * @return the sellerCode
	 */
	public String getSellerCode() {
		return sellerCode;
	}
	/**
	 * @param sellerCode the sellerCode to set
	 */
	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}
	@Override
	public String toString() {
		return "GetSubBillingDetailsRequest [msisdn=" + msisdn + ", sellerCode=" + sellerCode + ", accountId="
				+ accountId + "]";
	}
	
	
	

	
}