package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Loginv1Response extends CommonResponse {

	 
	@JsonProperty(value = "IDType", required = true)
	private String idType;
	@JsonProperty(value = "IDValue", required = true)
	private String idValue;
	private String carrierID;
	private String firstName;
	private String lastLoginTime;
	private String Version;
	
	
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}
	/**
	 * @param idType the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}
	/**
	 * @return the idValue
	 */
	public String getIdValue() {
		return idValue;
	}
	/**
	 * @param idValue the idValue to set
	 */
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}
	/**
	 * @return the carrierID
	 */
	public String getCarrierID() {
		return carrierID;
	}
	/**
	 * @param carrierID the carrierID to set
	 */
	public void setCarrierID(String carrierID) {
		this.carrierID = carrierID;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastLoginTime
	 */
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginResponse [idType=" + idType + ", idValue=" + idValue + ", carrierID=" + carrierID + ", firstName="
				+ firstName + ", lastLoginTime=" + lastLoginTime + ", Version=" + Version + ", getVersion()="
				+ getVersion() + ", getIdType()=" + getIdType() + ", getIdValue()=" + getIdValue() + ", getCarrierID()="
				+ getCarrierID() + ", getFirstName()=" + getFirstName() + ", getLastLoginTime()=" + getLastLoginTime()
				+ "]";
	}
	 
	
	
	
}