package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetLoanResponse extends CommonResponse{

	private String loanAmount;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetLoanResponse [loanAmount=" + loanAmount + "]";
	}

	
}
