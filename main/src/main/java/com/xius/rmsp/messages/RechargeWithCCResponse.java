package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class RechargeWithCCResponse extends CommonResponse{

	private String transId;
	private String transRefNum;
	/**
	 * @return the transId
	 */
	public String getTransId() {
		return transId;
	}
	/**
	 * @param transId the transId to set
	 */
	public void setTransId(String transId) {
		this.transId = transId;
	}
	/**
	 * @return the transRefNum
	 */
	public String getTransRefNum() {
		return transRefNum;
	}
	/**
	 * @param transRefNum the transRefNum to set
	 */
	public void setTransRefNum(String transRefNum) {
		this.transRefNum = transRefNum;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RechargeWithCCResponse [transId=" + transId + ", transRefNum=" + transRefNum + "]";
	}
    
	
}
