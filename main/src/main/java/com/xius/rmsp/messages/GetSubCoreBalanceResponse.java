package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetSubCoreBalanceResponse extends CommonResponse{
	
	@JsonProperty(value ="MSISDN")
	private String msisdn;	
	private String AccountStatus;	
	private String AccountBalance;	
	private String AccountValidity;
	@JsonProperty(value ="accountID")
	private String accountId;
	
	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	/**
	 * @return the accountStatus
	 */
	public String getAccountStatus() {
		return AccountStatus;
	}
	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	/**
	 * @return the accountBalance
	 */
	public String getAccountBalance() {
		return AccountBalance;
	}
	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(String accountBalance) {
		AccountBalance = accountBalance;
	}
	/**
	 * @return the accountValidty
	 */
	public String getAccountValidity() {
		return AccountValidity;
	}
	/**
	 * @param accountValidty the accountValidty to set
	 */
	public void setAccountValidity(String accountValidity) {
		AccountValidity = accountValidity;
	}
	@Override
	public String toString() {
		return "GetSubCoreBalanceResponse [msisdn=" + msisdn + ", AccountStatus=" + AccountStatus + ", AccountBalance="
				+ AccountBalance + ", AccountValidity=" + AccountValidity + ", accountId=" + accountId + "]";
	}
	
	
}