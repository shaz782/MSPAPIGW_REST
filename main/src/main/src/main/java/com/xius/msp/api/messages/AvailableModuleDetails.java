package com.xius.msp.api.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AvailableModuleDetails {

	private String publicityId;
	private String charge;
	private String planDescription;
	private String category;
	private String StartDate;
	private String EndDate;
	private List<AvailableServiceDetails> services;
	public String getPublicityId() {
		return publicityId;
	}
	public void setPublicityId(String publicityId) {
		this.publicityId = publicityId;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public List<AvailableServiceDetails> getServices() {
		return services;
	}
	public void setServices(List<AvailableServiceDetails> services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return "AvailableModuleDetails [publicityId=" + publicityId + ", charge=" + charge + ", planDescription="
				+ planDescription + ", category=" + category + ", StartDate=" + StartDate + ", EndDate=" + EndDate
				+ ", services=" + services + "]";
	}
	
	 
	 
	
}