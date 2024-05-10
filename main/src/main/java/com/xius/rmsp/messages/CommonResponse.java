package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({"responseStatus","responseCode","responseMessage"})
public class CommonResponse {
	
	@JsonProperty(value ="responseStatus",required = true)
	private String responseStatus;
	@JsonProperty(value ="responseCode",required = true)
	private String responseCode;
	@JsonProperty(value ="responseMessage",required = true)
	private String responseMessage;
	
	/**
	 * @return the responseStatus
	 */
	public String getResponseStatus() {
		return responseStatus;
	}
	/**
	 * @param responseStatus the responseStatus to set
	 */
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommonResponse [responseStatus=" + responseStatus + ", responseCode=" + responseCode
				+ ", responseMessage=" + responseMessage + "]";
	}
	
	
	
	
	
}
