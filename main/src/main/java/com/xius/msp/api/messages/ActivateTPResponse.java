package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivateTPResponse extends  CommonResponse  {


	@JsonProperty(value = "IDType")
	private String idType;
	
	@JsonProperty(value = "IDValue")
	private String idValue;

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
	
 
}