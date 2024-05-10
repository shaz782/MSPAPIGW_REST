package com.xius.msp.api.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAvailableServiceDetailsResponse extends CommonResponse {

	private List<AvailableModuleDetails> availablemoduledleDtlsType;

	public List<AvailableModuleDetails> getModuledleDtlsType() {
		return availablemoduledleDtlsType;
	}

	public void setModuledleDtlsType(List<AvailableModuleDetails> availablemoduledleDtlsType) {
		this.availablemoduledleDtlsType = availablemoduledleDtlsType;
	}

	@Override
	public String toString() {
		return "GetServiceDetailsResponse [moduledleDtlsType=" + availablemoduledleDtlsType + ", getModuledleDtlsType()="
				+ getModuledleDtlsType() + "]";
	}

	 
}