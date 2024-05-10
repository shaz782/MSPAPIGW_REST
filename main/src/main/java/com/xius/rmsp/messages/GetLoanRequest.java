package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetLoanRequest extends CommonRequest{
	
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value ="MSISDN",required = true)
	private String msisdn;
	@JsonProperty(value ="amount",required = true)
	private String amount;
	@JsonProperty(value ="reason",required = true)
	private String reason;
	@JsonProperty(value ="transRefNo",required = true)
	
	private String transRefNo;
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
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the transRefNo
	 */
	public String getTransRefNo() {
		return transRefNo;
	}
	/**
	 * @param transRefNo the transRefNo to set
	 */
	public void setTransRefNo(String transRefNo) {
		this.transRefNo = transRefNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DebitAccountRequest [msisdn=" + msisdn + ", amount=" + amount + ", reason=" + reason + ", transRefNo="
				+ transRefNo + "]";
	}
	
	
	
	
}
