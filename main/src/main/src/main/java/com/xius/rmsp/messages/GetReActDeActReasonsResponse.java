package com.xius.rmsp.messages;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetReActDeActReasonsResponse extends CommonResponse{
	
	private java.lang.String[] reasons;

	/**
	 * @return the reasons
	 */
	public java.lang.String[] getReasons() {
		return reasons;
	}

	/**
	 * @param reasons the reasons to set
	 */
	public void setReasons(java.lang.String[] reasons) {
		this.reasons = reasons;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetReActDeActReasonsResponse [reasons=" + Arrays.toString(reasons) + "]";
	}
	
}