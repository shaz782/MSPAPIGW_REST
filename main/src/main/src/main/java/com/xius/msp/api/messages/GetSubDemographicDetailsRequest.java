package com.xius.msp.api.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

public class GetSubDemographicDetailsRequest extends CommonRequest {

	@JsonProperty(value = "IDType", required = true)
	private String idType;
	@JsonProperty(value = "IDValue", required = true)
	private String idValue;
	@JsonProperty(value = "MSISDN")
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	private String msisdn;

	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * @param idType
	 *            the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}

	/**
	 * @return the idValue
	 */
	public String getIdValue() {
		return idValue;
	}

	/**
	 * @param idValue
	 *            the idValue to set
	 */
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}

	/**
	 * @param msisdn
	 *            the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetSubDemographicDetailsRequest [idType=" + idType + ", idValue=" + idValue + ", msisdn=" + msisdn
				+ "]";
	}

}
