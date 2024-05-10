package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateDemographicDetailsRequest extends CommonRequest{
	
	@JsonProperty(value ="IDType",required=true)
	private String  idType;
	@JsonProperty(value ="IDValue",required=true)
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
    private String  alternateContactNo;
    private String  surName;
    private String  nationality;
    private String  securityQuestion;
    private String  securityAnswer;
    @JsonProperty(value ="NIT")
    private String  nit;
    @JsonProperty(value ="transRefNo",required = true)
	private String transRefNo;
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
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}
	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the securityQuestion
	 */
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	/**
	 * @param securityQuestion the securityQuestion to set
	 */
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	/**
	 * @return the securityAnswer
	 */
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	/**
	 * @param securityAnswer the securityAnswer to set
	 */
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	/**
	 * @return the nit
	 */
	public String getNit() {
		return nit;
	}
	/**
	 * @param nit the nit to set
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}
	/**
	 * @return the transRefNo
	 */
	public String getTransRefNo() {
		return transRefNo;
	}
	/**
	 * @param transRefNo the transRefNo to set
	 */
	public void setTransRefNo(String transRefNo) {
		this.transRefNo = transRefNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UpdateDemographicDetailsRequest [idType=" + idType + ", idValue=" + idValue + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", homePhone=" + homePhone + ", officePhone=" + officePhone + ", address1=" + address1 + ", address2="
				+ address2 + ", address3=" + address3 + ", annualIncome=" + annualIncome + ", postalCode=" + postalCode
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", occupation=" + occupation
				+ ", industry=" + industry + ", ethnic=" + ethnic + ", alternateContactNo=" + alternateContactNo
				+ ", surName=" + surName + ", nationality=" + nationality + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + ", nit=" + nit + ", transRefNo=" + transRefNo + "]";
	}
    
    
}