package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeactivatePackRequest extends CommonRequest{
	
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value ="MSISDN",required = true)
	private String msisdn;
	@JsonProperty(value ="publicityID",required = true)
	private String publicityID;
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
	 * @return the publicityID
	 */
	public String getPublicityID() {
		return publicityID;
	}
	/**
	 * @param publicityID the publicityID to set
	 */
	public void setPublicityID(String publicityID) {
		this.publicityID = publicityID;
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
	@Override
	public String toString() {
		return "PurchaseATPRequest [msisdn=" + msisdn + ", publicityID=" + publicityID + ", transRefNo=" + transRefNo
				+ "]";
	}
	
	
}
