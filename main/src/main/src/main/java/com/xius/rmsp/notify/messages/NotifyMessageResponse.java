package com.xius.rmsp.notify.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class NotifyMessageResponse extends CommonResponse{
	
	 private java.lang.Long transID;

	/**
	 * @return the transID
	 */
	public java.lang.Long getTransID() {
		return transID;
	}

	/**
	 * @param transID the transID to set
	 */
	public void setTransID(java.lang.Long transID) {
		this.transID = transID;
	}
	
	
}
