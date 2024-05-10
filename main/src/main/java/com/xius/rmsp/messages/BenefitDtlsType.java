package com.xius.rmsp.messages;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class BenefitDtlsType {
	
	private String publicityID;
	private List<VoiceDetails> voiceDetails;
	private List<SMSDetails> smsDetails;
	private List<DATADetails> dataDetails;
	private List<GLOBALDetails> globalDetails;
	
	public String getPublicityID() {
		return publicityID;
	}
	public void setPublicityID(String publicityID) {
		this.publicityID = publicityID;
	}
	
	public List<VoiceDetails> getVoiceDetails() {
		return voiceDetails;
	}
	public void setVoiceDetails(List<VoiceDetails> voiceDetails) {
		this.voiceDetails = voiceDetails;
	}
	public List<SMSDetails> getSmsDetails() {
		return smsDetails;
	}
	public void setSmsDetails(List<SMSDetails> smsDetails) {
		this.smsDetails = smsDetails;
	}
	public List<DATADetails> getDataDetails() {
		return dataDetails;
	}
	public void setDataDetails(List<DATADetails> dataDetails) {
		this.dataDetails = dataDetails;
	}
	public List<GLOBALDetails> getGlobalDetails() {
		return globalDetails;
	}
	public void setGlobalDetails(List<GLOBALDetails> globalDetails) {
		this.globalDetails = globalDetails;
	}
	@Override
	public String toString() {
		return "BenefitDtlsType [publicityID="+publicityID+"voiceDetails=" + voiceDetails + ", smsDetails=" + smsDetails + ", dataDetails="
				+ dataDetails + ", globalDetails=" + globalDetails + "]";
	}
	
	
}