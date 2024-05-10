package com.xius.msp.api.messages;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ModuleDtlsType {
	
	private List<ModuleDetails> voiceDetails;
	private List<ModuleDetails> smsDetails;
	private List<ModuleDetails> dataDetails;
	
 
	public List<ModuleDetails> getVoiceDetails() {
		return voiceDetails;
	}
	public void setVoiceDetails(List<ModuleDetails> voiceDetails) {
		this.voiceDetails = voiceDetails;
	}
	public List<ModuleDetails> getSmsDetails() {
		return smsDetails;
	}
	public void setSmsDetails(List<ModuleDetails> smsDetails) {
		this.smsDetails = smsDetails;
	}
	public List<ModuleDetails> getDataDetails() {
		return dataDetails;
	}
	public void setDataDetails(List<ModuleDetails> dataDetails) {
		this.dataDetails = dataDetails;
	}
 
	@Override
	public String toString() {
		return "ModuleDetails [voiceDetails=" + voiceDetails + ", smsDetails=" + smsDetails + ", dataDetails="
				+ dataDetails  + "]";
	}
	
	
}