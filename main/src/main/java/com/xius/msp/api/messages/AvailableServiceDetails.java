package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AvailableServiceDetails {

	private String units_type;
	private String units_remaining;
	private String units_credited;
	
	
	public String getUnits_credited() {
		return units_credited;
	}
	public void setUnits_credited(String units_credited) {
		this.units_credited = units_credited;
	}
	public String getUnits_type() {
		return units_type;
	}
	public void setUnits_type(String units_type) {
		this.units_type = units_type;
	}
	public String getUnits_remaining() {
		return units_remaining;
	}
	public void setUnits_remaining(String units_remaining) {
		this.units_remaining = units_remaining;
	}
	@Override
	public String toString() {
		return "AvailableServiceDetails [units_type=" + units_type + ", units_remaining=" + units_remaining
				+ ", units_credited=" + units_credited + "]";
	}
	 
	
	 
 
	
}