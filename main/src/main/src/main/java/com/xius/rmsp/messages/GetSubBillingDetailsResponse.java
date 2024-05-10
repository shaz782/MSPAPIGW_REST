package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetSubBillingDetailsResponse extends CommonResponse{
	
	@JsonProperty(value ="MSISDN")
	private String msisdn;
	@JsonProperty(value ="ICCID")
	private String iccid;
	@JsonProperty(value ="IDValue")
	private String idValue;
	private String AccountStatus;
	private String AccountBalance;
	private String AccountValidity;
	private String packName;
	private String publicityID;
	private String packExpDate;
	private String AccountExpDate;
	@JsonProperty(value ="accountID")
	private String accountId;
	
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getIdValue() {
		return idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	public String getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		AccountBalance = accountBalance;
	}
	public String getAccountValidity() {
		return AccountValidity;
	}
	public void setAccountValidity(String accountValidity) {
		AccountValidity = accountValidity;
	}
	public String getPackName() {
		return packName;
	}
	public void setPackName(String packName) {
		this.packName = packName;
	}
	public String getPublicityID() {
		return publicityID;
	}
	public void setPublicityID(String publicityID) {
		this.publicityID = publicityID;
	}
	public String getPackExpDate() {
		return packExpDate;
	}
	public void setPackExpDate(String packExpDate) {
		this.packExpDate = packExpDate;
	}
	public String getAccountExpDate() {
		return AccountExpDate;
	}
	public void setAccountExpDate(String accountExpDate) {
		AccountExpDate = accountExpDate;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "GetSubBillingDetailsResponse [msisdn=" + msisdn + ", iccid=" + iccid + ", idValue=" + idValue
				+ ", AccountStatus=" + AccountStatus + ", AccountBalance=" + AccountBalance + ", AccountValidity="
				+ AccountValidity + ", packName=" + packName + ", publicityID=" + publicityID + ", packExpDate="
				+ packExpDate + ", AccountExpDate=" + AccountExpDate + ", accountId=" + accountId + "]";
	}
	
	
}