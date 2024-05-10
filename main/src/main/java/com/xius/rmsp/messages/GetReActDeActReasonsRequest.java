package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetReActDeActReasonsRequest extends CommonRequest{

	@JsonProperty(value ="reasonCategory",required = true)
	private String reasonCategory;

	/**
	 * @return the reasonCategory
	 */
	public String getReasonCategory() {
		return reasonCategory;
	}

	/**
	 * @param reasonCategory the reasonCategory to set
	 */
	public void setReasonCategory(String reasonCategory) {
		this.reasonCategory = reasonCategory;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetReActDeActReasonsRequest [reasonCategory=" + reasonCategory + "]";
	}
	
		
	
}