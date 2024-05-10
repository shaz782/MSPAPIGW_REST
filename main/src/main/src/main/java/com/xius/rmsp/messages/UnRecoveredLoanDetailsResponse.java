package com.xius.rmsp.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class UnRecoveredLoanDetailsResponse extends CommonResponse{
	
	private List<LoanDetails> loanDetails;

	/**
	 * @return the loanDetails
	 */
	public List<LoanDetails> getLoanDetails() {
		return loanDetails;
	}

	/**
	 * @param loanDetails the loanDetails to set
	 */
	public void setLoanDetails(List<LoanDetails> loanDetails) {
		this.loanDetails = loanDetails;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoanEnquiryDetailsResponse [loanDetails=" + loanDetails + "]";
	}
	
	
	
	
}