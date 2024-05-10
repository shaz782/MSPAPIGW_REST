package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class SIMSwapResponse extends CommonResponse{
	
	private java.lang.String oldSIM;

    private java.lang.String newSIM;

	/**
	 * @return the oldSIM
	 */
	public java.lang.String getOldSIM() {
		return oldSIM;
	}

	/**
	 * @param oldSIM the oldSIM to set
	 */
	public void setOldSIM(java.lang.String oldSIM) {
		this.oldSIM = oldSIM;
	}

	/**
	 * @return the newSIM
	 */
	public java.lang.String getNewSIM() {
		return newSIM;
	}

	/**
	 * @param newSIM the newSIM to set
	 */
	public void setNewSIM(java.lang.String newSIM) {
		this.newSIM = newSIM;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SIMSwapResponse [oldSIM=" + oldSIM + ", newSIM=" + newSIM + "]";
	}
    
    

}