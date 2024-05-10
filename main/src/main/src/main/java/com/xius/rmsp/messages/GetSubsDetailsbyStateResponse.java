package com.xius.rmsp.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetSubsDetailsbyStateResponse extends CommonResponse{
	
	@JsonProperty(value="MSISDNS")
	private List<String> msisdns;

	/**
	 * @return the msisdns
	 */
	public List<String> getMsisdns() {
		return msisdns;
	}

	/**
	 * @param msisdns the msisdns to set
	 */
	public void setMsisdns(List<String> msisdns) {
		this.msisdns = msisdns;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetSubsDetailsbyStateResponse [msisdns=" + msisdns + "]";
	}

	
}