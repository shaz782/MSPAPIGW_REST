package com.xius.msp.api.messages;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetIDTypesResponse extends CommonResponse {

	private ArrayList<IDTypes> idTypes;

	public ArrayList<IDTypes> getIdTypes() {
		return idTypes;
	}

	public void setIdTypes(ArrayList<IDTypes> idTypes) {
		this.idTypes = idTypes;
	}



	

}