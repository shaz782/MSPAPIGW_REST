package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class SuspendAccountRequest extends CommonRequest{

	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid msisdnNo")
	@JsonProperty(value ="msisdnNo",required = true)
	private String msisdnNo;
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
	@JsonProperty(value ="accountID",required = true)
	private String accountId;
	@JsonProperty(value ="reason",required = true)
	private String reason;
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid tarnsationID")
	@JsonProperty(value ="tarnsationID")
	private String tarnsationID;
	/**
	 * @return the msisdnNo
	 */
	public String getMsisdnNo() {
		return msisdnNo;
	}
	/**
	 * @param msisdnNo the msisdnNo to set
	 */
	public void setMsisdnNo(String msisdnNo) {
		this.msisdnNo = msisdnNo;
	}
	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
	 * @return the tarnsationID
	 */
	public String getTarnsationID() {
		return tarnsationID;
	}
	/**
	 * @param tarnsationID the tarnsationID to set
	 */
	public void setTarnsationID(String tarnsationID) {
		this.tarnsationID = tarnsationID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SuspendAccountRequest [msisdnNo=" + msisdnNo + ", accountId=" + accountId + ", reason=" + reason
				+ ", tarnsationID=" + tarnsationID + "]";
	}
	
	
	
}