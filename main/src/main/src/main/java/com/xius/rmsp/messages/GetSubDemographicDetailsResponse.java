package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetSubDemographicDetailsResponse extends CommonResponse{
	
		@JsonProperty(value ="IDType")
		private String  idType;
		@JsonProperty(value ="IDValue")
	    private String  idValue;
	    private String  firstName;
	    private String  lastName;
	    private String  gender;
	    private String  dateOfBirth;
	    private String  email;
	    private String  homePhone;
	    private String  officePhone;
	    private String  address1;
	    private String  address2;
	    private String  address3;
	    private String  annualIncome;
	    private String  postalCode;
	    private String  city;
	    private String  state;
	    private String  country;
	    private String  occupation;
	    private String  industry;
	    private String  ethnic;
	    private String  pleaseSpecify;
	    private String  alternateContactNo;
	    private String  surName;
	    private String  externalNumber;
	    private String  internalNumber;
	    private String  nationality;
	    // Order Details commented as per Manager Discussion. Order Details comes at MSISDN Blocking Case Only
	   // private String  orderBooking;
	  //  private String  orderDate;
	  //  private String  orderExpiryDate;
	  //  private String  orderStatus;
	   @JsonProperty(value ="NIT")
	    private String  nit;
		public String getIdType() {
			return idType;
		}
		public void setIdType(String idType) {
			this.idType = idType;
		}
		public String getIdValue() {
			return idValue;
		}
		public void setIdValue(String idValue) {
			this.idValue = idValue;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getHomePhone() {
			return homePhone;
		}
		public void setHomePhone(String homePhone) {
			this.homePhone = homePhone;
		}
		public String getOfficePhone() {
			return officePhone;
		}
		public void setOfficePhone(String officePhone) {
			this.officePhone = officePhone;
		}
		public String getAddress1() {
			return address1;
		}
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		public String getAddress2() {
			return address2;
		}
		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		public String getAddress3() {
			return address3;
		}
		public void setAddress3(String address3) {
			this.address3 = address3;
		}
		public String getAnnualIncome() {
			return annualIncome;
		}
		public void setAnnualIncome(String annualIncome) {
			this.annualIncome = annualIncome;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getOccupation() {
			return occupation;
		}
		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}
		public String getIndustry() {
			return industry;
		}
		public void setIndustry(String industry) {
			this.industry = industry;
		}
		public String getEthnic() {
			return ethnic;
		}
		public void setEthnic(String ethnic) {
			this.ethnic = ethnic;
		}
		public String getPleaseSpecify() {
			return pleaseSpecify;
		}
		public void setPleaseSpecify(String pleaseSpecify) {
			this.pleaseSpecify = pleaseSpecify;
		}
		public String getAlternateContactNo() {
			return alternateContactNo;
		}
		public void setAlternateContactNo(String alternateContactNo) {
			this.alternateContactNo = alternateContactNo;
		}
		public String getSurName() {
			return surName;
		}
		public void setSurName(String surName) {
			this.surName = surName;
		}
		public String getExternalNumber() {
			return externalNumber;
		}
		public void setExternalNumber(String externalNumber) {
			this.externalNumber = externalNumber;
		}
		public String getInternalNumber() {
			return internalNumber;
		}
		public void setInternalNumber(String internalNumber) {
			this.internalNumber = internalNumber;
		}
		public String getNationality() {
			return nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getNit() {
			return nit;
		}
		public void setNit(String nit) {
			this.nit = nit;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "GetSubDemographicDetailsResponse [idType=" + idType + ", idValue=" + idValue + ", firstName="
					+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
					+ ", email=" + email + ", homePhone=" + homePhone + ", officePhone=" + officePhone + ", address1="
					+ address1 + ", address2=" + address2 + ", address3=" + address3 + ", annualIncome=" + annualIncome
					+ ", postalCode=" + postalCode + ", city=" + city + ", state=" + state + ", country=" + country
					+ ", occupation=" + occupation + ", industry=" + industry + ", ethnic=" + ethnic
					+ ", pleaseSpecify=" + pleaseSpecify + ", alternateContactNo=" + alternateContactNo + ", surName="
					+ surName + ", externalNumber=" + externalNumber + ", internalNumber=" + internalNumber
					+ ", nationality=" + nationality + ", nit=" + nit + "]";
		}
		
		
	    
	    
}