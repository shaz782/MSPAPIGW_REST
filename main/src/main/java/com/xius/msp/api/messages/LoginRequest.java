package com.xius.msp.api.messages;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class LoginRequest extends CommonRequest{
	
	private String NetworkName;
	
	@JsonProperty(value ="MSISDN")
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	private String msisdn;

	/**
	 * @return the networkName
	 */
	public String getNetworkName() {
		return NetworkName;
	}

	/**
	 * @param networkName the networkName to set
	 */
	public void setNetworkName(String networkName) {
		NetworkName = networkName;
	}

	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}

	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginRequest [NetworkName=" + NetworkName + ", msisdn=" + msisdn + "]";
	}
	
	
	 
}