package com.xius.rmsp.messages;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class LoanDetails {
	
	private String accountID;
	private String loanAmount;
	private String issueDate;
	
	@JsonProperty(value ="MSISDN")
	private String msisdn;

	/**
	 * @return the accountID
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	/**
	 * @return the loanAmount
	 */
	public String getLoanAmount() {
		return loanAmount;
	}

	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * @return the issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoanDetails [accountID=" + accountID + ", loanAmount=" + loanAmount + ", issueDate=" + issueDate
				+ ", msisdn=" + msisdn + "]";
	}
	
	
	
	
	
	
}