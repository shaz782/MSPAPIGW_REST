package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class PackPurchaseResponse extends CommonResponse{

	private String transRefNo;
	private String transID;
	private String accountId;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
	/**
	 * @return the transID
	 */
	public String getTransID() {
		return transID;
	}
	/**
	 * @param transID the transID to set
	 */
	public void setTransID(String transID) {
		this.transID = transID;
	}
	@Override
	public String toString() {
		return "PurchaseATPResponse [transRefNo=" + transRefNo + ", transID=" + transID + ", accountId=" + accountId
				+ "]";
	}
	
	
	
	
}
