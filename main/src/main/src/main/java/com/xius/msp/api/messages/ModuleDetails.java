package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ModuleDetails {

	private String publicityId;
	private String charge;
	private String planDescription;
	private String category;
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the publicityId
	 */
	public String getPublicityId() {
		return publicityId;
	}
	/**
	 * @param publicityId the publicityId to set
	 */
	public void setPublicityId(String publicityId) {
		this.publicityId = publicityId;
	}
	/**
	 * @return the charge
	 */
	public String getCharge() {
		return charge;
	}
	/**
	 * @param charge the charge to set
	 */
	public void setCharge(String charge) {
		this.charge = charge;
	}
	/**
	 * @return the planDescription
	 */
	public String getPlanDescription() {
		return planDescription;
	}
	/**
	 * @param planDescription the planDescription to set
	 */
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ModuleDetails [publicityId=" + publicityId + ", charge=" + charge + ", planDescription="
				+ planDescription + ", category=" + category + "]";
	}
	 
	
}