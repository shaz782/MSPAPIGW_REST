package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAccountDetailsResponse extends CommonResponse {

	private String accountStatus;
	private String validityDate;
	private String gp1;
	private String gp2;
	private String expDate;
	private String coreBalance;
	private String accountType;

 

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}

	public String getGp1() {
		return gp1;
	}

	public void setGp1(String gp1) {
		this.gp1 = gp1;
	}

	public String getGp2() {
		return gp2;
	}

	public void setGp2(String gp2) {
		this.gp2 = gp2;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCoreBalance() {
		return coreBalance;
	}

	public void setCoreBalance(String coreBalance) {
		this.coreBalance = coreBalance;
	}

	@Override
	public String toString() {
		return "GetAccountDetailsResponse [accountStatus=" + accountStatus + ", validityDate=" + validityDate + ", gp1="
				+ gp1 + ", gp2=" + gp2 + ", expDate=" + expDate + ", coreBalance=" + coreBalance + ", accountType="
				+ accountType + "]";
	}

 

}