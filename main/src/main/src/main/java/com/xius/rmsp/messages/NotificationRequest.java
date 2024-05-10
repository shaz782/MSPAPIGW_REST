package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({"Message","MSISDN","apikey"})
public class NotificationRequest {

	@JsonProperty(value ="Message",required = true)
	private String Message;
	@JsonProperty(value ="MSISDN",required = true)
	private String MSISDN;
	@JsonProperty(value ="apikey",required = true)
	private String apikey;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return Message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		Message = message;
	}
	/**
	 * @return the mSISDN
	 */
	public String getMSISDN() {
		return MSISDN;
	}
	/**
	 * @param mSISDN the mSISDN to set
	 */
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	/**
	 * @return the apikey
	 */
	public String getApikey() {
		return apikey;
	}
	/**
	 * @param apikey the apikey to set
	 */
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	
	
	
}
