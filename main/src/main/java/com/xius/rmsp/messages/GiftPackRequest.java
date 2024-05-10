package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GiftPackRequest extends CommonRequest{
	
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid srcMSISDN")
	@JsonProperty(value ="srcMSISDN",required = true)
	private String srcMsisdn;
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid destMSISDN")
	@JsonProperty(value ="destMSISDN",required = true)
	private String destMsisdn;
	@JsonProperty(value ="publicityID",required = true)
	private String publicityID;
	@JsonProperty(value ="transRefNo",required = true)
	private String transRefNo;
	/**
	 * @return the srcMsisdn
	 */
	public String getSrcMsisdn() {
		return srcMsisdn;
	}
	/**
	 * @param srcMsisdn the srcMsisdn to set
	 */
	public void setSrcMsisdn(String srcMsisdn) {
		this.srcMsisdn = srcMsisdn;
	}
	/**
	 * @return the destMsisdn
	 */
	public String getDestMsisdn() {
		return destMsisdn;
	}
	/**
	 * @param destMsisdn the destMsisdn to set
	 */
	public void setDestMsisdn(String destMsisdn) {
		this.destMsisdn = destMsisdn;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GiftPackRequest [srcMsisdn=" + srcMsisdn + ", destMsisdn=" + destMsisdn + ", publicityID=" + publicityID
				+ ", transRefNo=" + transRefNo + "]";
	}
	
	
	
	
}
