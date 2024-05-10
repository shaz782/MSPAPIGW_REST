package com.xius.rmsp.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GetActivePackDetailsResponse extends CommonResponse{
	
	@JsonProperty(value ="accountID")
	private String accountId;
	private List<PackDetails> packDetails;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public List<PackDetails> getPackDetails() {
		return packDetails;
	}
	public void setPackDetails(List<PackDetails> packDetails) {
		this.packDetails = packDetails;
	}
	@Override
	public String toString() {
		return "GetActivePackDetailsResponse [accountId=" + accountId + ", packDetails=" + packDetails + "]";
	}
	
	
	
}