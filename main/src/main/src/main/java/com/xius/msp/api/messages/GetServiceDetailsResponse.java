package com.xius.msp.api.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetServiceDetailsResponse extends CommonResponse {

	private List<ModuleDetails> moduledleDtlsType;

	public List<ModuleDetails> getModuledleDtlsType() {
		return moduledleDtlsType;
	}

	public void setModuledleDtlsType(List<ModuleDetails> moduledleDtlsType) {
		this.moduledleDtlsType = moduledleDtlsType;
	}

	@Override
	public String toString() {
		return "GetServiceDetailsResponse [moduledleDtlsType=" + moduledleDtlsType + ", getModuledleDtlsType()="
				+ getModuledleDtlsType() + "]";
	}

	 
}