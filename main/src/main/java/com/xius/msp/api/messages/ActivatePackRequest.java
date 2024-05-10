package com.xius.msp.api.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivatePackRequest extends CommonRequest {

	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	@JsonProperty(value = "MSISDN", required = true)
	private String msisdn;
	@JsonProperty(value = "publicityID", required = true)
	private String publicityID;
	@JsonProperty(value = "transRefNo", required = true)
	private String transRefNo;
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
	@JsonProperty(value = "accountID", required = true)
	private String accountId;
	// authorizationID added for YF Syeystem CreditCard Payment InvoiceID
	@JsonProperty(value = "authorizationID", required = true)
	private String authorizationID;

	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}

	/**
	 * @param msisdn
	 *            the msisdn to set
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
	 * @param publicityID
	 *            the publicityID to set
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
	 * @param transRefNo
	 *            the transRefNo to set
	 */
	public void setTransRefNo(String transRefNo) {
		this.transRefNo = transRefNo;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the authorizationID
	 */
	public String getAuthorizationID() {
		return authorizationID;
	}

	/**
	 * @param authorizationID
	 *            the authorizationID to set
	 */
	public void setAuthorizationID(String authorizationID) {
		this.authorizationID = authorizationID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ActivatePackRequest [msisdn=" + msisdn + ", publicityID=" + publicityID + ", transRefNo=" + transRefNo
				+ ", accountId=" + accountId + ", authorizationID=" + authorizationID + "]";
	}

}