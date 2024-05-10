package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class ChangePasswordRequest extends CommonRequest{
	
	@JsonProperty(value = "IDType", required = true)
	private String idType;
	
	@JsonProperty(value = "IDValue", required = true)
	private String idValue;
	
	private String newPassword;
	private String channel;
	
	
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdValue() {
		return idValue;
	}
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	@Override
	public String toString() {
		return "ChangePasswordRequest [idType=" + idType + ", idValue=" + idValue + ", newPassword=" + newPassword
				+ ", channel=" + channel + "]";
	}

	
	
	 
}