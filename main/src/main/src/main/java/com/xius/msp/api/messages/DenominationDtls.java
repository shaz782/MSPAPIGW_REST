package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DenominationDtls {

	private String denomination;
	private String talkTime;
	private String validityPeriod;
	private String description;
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getTalkTime() {
		return talkTime;
	}
	public void setTalkTime(String talkTime) {
		this.talkTime = talkTime;
	}
	public String getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "DenominationDtls [denomination=" + denomination + ", talkTime=" + talkTime + ", validityPeriod="
				+ validityPeriod + ", description=" + description + "]";
	}
	
 
	
}