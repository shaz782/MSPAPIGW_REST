package com.xius.msp.api.messages;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivateTPRequest extends CommonRequest {

	@JsonProperty(value = "MSISDN")
	@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
	private String msisdn;

	@NotNull(message = "Kindly provide idType")
	private String idType;
	@NotNull(message = "Kindly provide idValue")
	private String idValue;
	@NotNull(message = "Kindly provide lastName")
	private String lastName;

	private String channel;

	public String getIdType() {
		return idType;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

}