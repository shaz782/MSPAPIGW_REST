package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetSubsDetailsbyStateRequest extends CommonRequest{

	
	@JsonProperty(value ="sellerCode",required = true)
	private String sellerCode;
	@JsonProperty(value ="subState",required = true)
	private String subState;
	@JsonProperty(value ="ExpStartDate",required = true)
	private String expStartDate;
	@JsonProperty(value ="ExpEndDate",required = true)
	private String expEndDate ;
	public String getSellerCode() {
		return sellerCode;
	}
	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}
	public String getSubState() {
		return subState;
	}
	public void setSubState(String subState) {
		this.subState = subState;
	}
	public String getExpStartDate() {
		return expStartDate;
	}
	public void setExpStartDate(String expStartDate) {
		this.expStartDate = expStartDate;
	}
	public String getExpEndDate() {
		return expEndDate;
	}
	public void setExpEndDate(String expEndDate) {
		this.expEndDate = expEndDate;
	}
	@Override
	public String toString() {
		return "GetSubsDetailsbyStateRequest [sellerCode=" + sellerCode + ", subState=" + subState + ", expStartDate="
				+ expStartDate + ", expEndDate=" + expEndDate + "]";
	}
	
	
}