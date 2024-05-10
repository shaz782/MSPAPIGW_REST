package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GLOBALDetails {

	private String bucketName	;
  	private String bucketType	;
  	private String bucketRemainingUnits;
  	private String unitsAllocated;
	/**
	 * @return the bucketName
	 */
	public String getBucketName() {
		return bucketName;
	}
	/**
	 * @param bucketName the bucketName to set
	 */
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	/**
	 * @return the bucketType
	 */
	public String getBucketType() {
		return bucketType;
	}
	/**
	 * @param bucketType the bucketType to set
	 */
	public void setBucketType(String bucketType) {
		this.bucketType = bucketType;
	}
	/**
	 * @return the bucketRemainingUnits
	 */
	public String getBucketRemainingUnits() {
		return bucketRemainingUnits;
	}
	/**
	 * @param bucketRemainingUnits the bucketRemainingUnits to set
	 */
	public void setBucketRemainingUnits(String bucketRemainingUnits) {
		this.bucketRemainingUnits = bucketRemainingUnits;
	}
	/**
	 * @return the unitsAllocated
	 */
	public String getUnitsAllocated() {
		return unitsAllocated;
	}
	/**
	 * @param unitsAllocated the unitsAllocated to set
	 */
	public void setUnitsAllocated(String unitsAllocated) {
		this.unitsAllocated = unitsAllocated;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GLOBALDetails [bucketName=" + bucketName + ", bucketType=" + bucketType + ", bucketRemainingUnits="
				+ bucketRemainingUnits + ", unitsAllocated=" + unitsAllocated + "]";
	}
  	
  	
	
}