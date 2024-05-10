package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSubDemographicDetailsRequest extends CommonRequest{

	@JsonProperty(value="IDValue",required=true)
	private String idValue;

	/**
	 * @return the idValue
	 */
	public String getIdValue() {
		return idValue;
	}

	/**
	 * @param idValue the idValue to set
	 */
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetSubDemographicDetailsRequest [idValue=" + idValue + "]";
	}
	
	
}
