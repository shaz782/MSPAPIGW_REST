package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAccountDetailsResponse extends CommonResponse {

	@JsonProperty(value = "ICCID")
	private String iccid;
	@JsonProperty(value = "MSISDN")
	private String msisdn;
	@JsonProperty(value = "IMSI")
	private String imsi;
	@JsonProperty(value = "IDValue")
	private String idValue;
	private String SellerCode;
	private String AccountStatus;
	private String ActivationDate;
	private String accountValidity;
	private String accountBalance;
	private String accountType;
	@JsonProperty(value ="accountID")
	private String accountId;
	private String tariffPackName;
	private String tariffPackValidity;
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getIdValue() {
		return idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
	public String getSellerCode() {
		return SellerCode;
	}
	public void setSellerCode(String sellerCode) {
		SellerCode = sellerCode;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}
	public String getActivationDate() {
		return ActivationDate;
	}
	public void setActivationDate(String activationDate) {
		ActivationDate = activationDate;
	}
	public String getAccountValidity() {
		return accountValidity;
	}
	public void setAccountValidity(String accountValidity) {
		this.accountValidity = accountValidity;
	}
	public String getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getTariffPackName() {
		return tariffPackName;
	}
	public void setTariffPackName(String tariffPackName) {
		this.tariffPackName = tariffPackName;
	}
	public String getTariffPackValidity() {
		return tariffPackValidity;
	}
	public void setTariffPackValidity(String tariffPackValidity) {
		this.tariffPackValidity = tariffPackValidity;
	}
	@Override
	public String toString() {
		return "GetAccountDetailsResponse [iccid=" + iccid + ", msisdn=" + msisdn + ", imsi=" + imsi + ", idValue="
				+ idValue + ", SellerCode=" + SellerCode + ", AccountStatus=" + AccountStatus + ", ActivationDate="
				+ ActivationDate + ", accountValidity=" + accountValidity + ", accountBalance=" + accountBalance
				+ ", accountType=" + accountType + ", accountId=" + accountId + ", tariffPackName=" + tariffPackName
				+ ", tariffPackValidity=" + tariffPackValidity + "]";
	}
	
	
	
}