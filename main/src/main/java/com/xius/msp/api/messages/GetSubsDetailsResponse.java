package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSubsDetailsResponse extends CommonResponse {
	
	private String MSISDN;
	private String operatorName;
	private String operatorId;
	private String subscriberState;
	private String accountType;
	@JsonProperty(value ="transID")
	private String transId;

	public String getMsisdn() {
		return MSISDN;
	}
	public void setMsisdn(String msisdn) {
		this.MSISDN = msisdn;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getSubscriberState() {
		return subscriberState;
	}
	public void setSubscriberState(String subscriberState) {
		this.subscriberState = subscriberState;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	
	
	
	}

