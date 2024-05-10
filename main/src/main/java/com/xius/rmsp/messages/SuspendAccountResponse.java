package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class SuspendAccountResponse extends CommonResponse{
	
	private java.lang.String tarnsationID;

    private java.lang.String tarnsationRefNo;

	/**
	 * @return the tarnsationID
	 */
	public java.lang.String getTarnsationID() {
		return tarnsationID;
	}

	/**
	 * @param tarnsationID the tarnsationID to set
	 */
	public void setTarnsationID(java.lang.String tarnsationID) {
		this.tarnsationID = tarnsationID;
	}

	/**
	 * @return the tarnsationRefNo
	 */
	public java.lang.String getTarnsationRefNo() {
		return tarnsationRefNo;
	}

	/**
	 * @param tarnsationRefNo the tarnsationRefNo to set
	 */
	public void setTarnsationRefNo(java.lang.String tarnsationRefNo) {
		this.tarnsationRefNo = tarnsationRefNo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SuspendAccountResponse [tarnsationID=" + tarnsationID + ", tarnsationRefNo=" + tarnsationRefNo + "]";
	}
    
    

}