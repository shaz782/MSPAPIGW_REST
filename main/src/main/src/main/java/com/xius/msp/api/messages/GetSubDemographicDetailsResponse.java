package com.xius.msp.api.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSubDemographicDetailsResponse extends CommonResponse {

	@JsonProperty(value = "IDType", required = true)
	private String idType;
	@JsonProperty(value = "IDValue", required = true)
	private String idValue;
	private String ICCNo;
	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String homePhone;
	private String officePhone;
	private String address1;
	private String address2;
	private String annualIncome;
	private String postalCode;
	private String city;
	private String state;
	private String country;
	private String occupation;
	private String industry;
	private String sourceOfInfo;
	private String MSISDN;
	private String userID;
	private String address3;
	private String gmpc;
	private String ethnic;
	private String alternateContactNo;
	private String stateCode;
	private String countryCode;
	private String SurName;
	private String externalNumber;
	private String internalNumber;
	private String StreetLimits;
	private String Municipality;
	 private String   userConsent;
	 
	 
	public String getUserConsent() {
		return userConsent;
	}
	public void setUserConsent(String userConsent) {
		this.userConsent = userConsent;
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
	 * @return the iCCNo
	 */
	public String getICCNo() {
		return ICCNo;
	}
	/**
	 * @param iCCNo the iCCNo to set
	 */
	public void setICCNo(String iCCNo) {
		ICCNo = iCCNo;
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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}
	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	/**
	 * @return the officePhone
	 */
	public String getOfficePhone() {
		return officePhone;
	}
	/**
	 * @param officePhone the officePhone to set
	 */
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the annualIncome
	 */
	public String getAnnualIncome() {
		return annualIncome;
	}
	/**
	 * @param annualIncome the annualIncome to set
	 */
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}
	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	/**
	 * @return the sourceOfInfo
	 */
	public String getSourceOfInfo() {
		return sourceOfInfo;
	}
	/**
	 * @param sourceOfInfo the sourceOfInfo to set
	 */
	public void setSourceOfInfo(String sourceOfInfo) {
		this.sourceOfInfo = sourceOfInfo;
	}
	/**
	 * @return the mSISDN
	 */
	public String getMSISDN() {
		return MSISDN;
	}
	/**
	 * @param mSISDN the mSISDN to set
	 */
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}
	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	/**
	 * @return the gmpc
	 */
	public String getGmpc() {
		return gmpc;
	}
	/**
	 * @param gmpc the gmpc to set
	 */
	public void setGmpc(String gmpc) {
		this.gmpc = gmpc;
	}
	/**
	 * @return the ethnic
	 */
	public String getEthnic() {
		return ethnic;
	}
	/**
	 * @param ethnic the ethnic to set
	 */
	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}
	/**
	 * @return the alternateContactNo
	 */
	public String getAlternateContactNo() {
		return alternateContactNo;
	}
	/**
	 * @param alternateContactNo the alternateContactNo to set
	 */
	public void setAlternateContactNo(String alternateContactNo) {
		this.alternateContactNo = alternateContactNo;
	}
	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}
	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the surName
	 */
	public String getSurName() {
		return SurName;
	}
	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		SurName = surName;
	}
	/**
	 * @return the externalNumber
	 */
	public String getExternalNumber() {
		return externalNumber;
	}
	/**
	 * @param externalNumber the externalNumber to set
	 */
	public void setExternalNumber(String externalNumber) {
		this.externalNumber = externalNumber;
	}
	/**
	 * @return the internalNumber
	 */
	public String getInternalNumber() {
		return internalNumber;
	}
	/**
	 * @param internalNumber the internalNumber to set
	 */
	public void setInternalNumber(String internalNumber) {
		this.internalNumber = internalNumber;
	}
	/**
	 * @return the streetLimits
	 */
	public String getStreetLimits() {
		return StreetLimits;
	}
	/**
	 * @param streetLimits the streetLimits to set
	 */
	public void setStreetLimits(String streetLimits) {
		StreetLimits = streetLimits;
	}
	/**
	 * @return the municipality
	 */
	public String getMunicipality() {
		return Municipality;
	}
	/**
	 * @param municipality the municipality to set
	 */
	public void setMunicipality(String municipality) {
		Municipality = municipality;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetSubDemographicDetailsResponse [idType=" + idType + ", idValue=" + idValue + ", ICCNo=" + ICCNo
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", homePhone=" + homePhone + ", officePhone=" + officePhone
				+ ", address1=" + address1 + ", address2=" + address2 + ", annualIncome=" + annualIncome
				+ ", postalCode=" + postalCode + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", occupation=" + occupation + ", industry=" + industry + ", sourceOfInfo=" + sourceOfInfo
				+ ", MSISDN=" + MSISDN + ", userID=" + userID + ", address3=" + address3 + ", gmpc=" + gmpc
				+ ", ethnic=" + ethnic + ", alternateContactNo=" + alternateContactNo + ", stateCode=" + stateCode
				+ ", countryCode=" + countryCode + ", SurName=" + SurName + ", externalNumber=" + externalNumber
				+ ", internalNumber=" + internalNumber + ", StreetLimits=" + StreetLimits + ", Municipality="
				+ Municipality + "]";
	}
	
	
	
}