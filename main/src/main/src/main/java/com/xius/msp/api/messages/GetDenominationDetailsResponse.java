package com.xius.msp.api.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDenominationDetailsResponse extends CommonResponse {

	private List<DenominationDtls> denominationDtlsType;

	public List<DenominationDtls> getDenominationDtlsType() {
		return denominationDtlsType;
	}

	public void setDenominationDtlsType(List<DenominationDtls> denominationDtlsType) {
		this.denominationDtlsType = denominationDtlsType;
	}

	@Override
	public String toString() {
		return "GetDenominationDetailsResponse [denominationDtlsType=" + denominationDtlsType + "]";
	}

}