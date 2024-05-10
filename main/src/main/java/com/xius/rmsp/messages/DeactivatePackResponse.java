package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class DeactivatePackResponse extends CommonResponse{

	private String transRefNo;
	private String transID;
	
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
		return "PurchaseATPResponse [transRefNo=" + transRefNo + ", transID=" + transID + "]";
	}
	
	
	
	
}
