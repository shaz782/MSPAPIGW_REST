package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnRecoveredLoanDetailsRequest extends CommonRequest{
	
	
	@JsonProperty(required = true)
	private String fromDate;
	@JsonProperty(required = true)
	private String toDate;
	/**
	 * @return the fromDate
	 */
	public String getFromDate() {
		return fromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	/**
	 * @return the toDate
	 */
	public String getToDate() {
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UnRecoveredLoanDetailsRequest [fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	
	
	
}