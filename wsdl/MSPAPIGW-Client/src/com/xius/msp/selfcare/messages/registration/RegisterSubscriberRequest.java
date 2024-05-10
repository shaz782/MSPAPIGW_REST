/**
 * RegisterSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class RegisterSubscriberRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String surName;

    private java.lang.String IDType;

    private java.lang.String IDNo;

    private java.lang.String gender;

    private java.util.Date dateOfBirth;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String homePhone;

    private java.lang.String officePhone;

    private java.lang.String externalNumber;

    private java.lang.String internalNumber;

    private java.lang.String postalCode;

    private java.lang.String streetLimits;

    private java.lang.String municipality;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String country;

    private java.lang.String email;

    private java.lang.String occupation;

    private java.lang.String industry;

    private java.lang.String annualIncome;

    private java.lang.String sourceOfInfo;

    private java.lang.String userId;

    private java.lang.String subscriberStatus;

    private java.lang.String address3;

    private java.lang.String orderBooking;

    private java.lang.String oldIC;

    private java.lang.String gmpc;

    private java.lang.String networkName;

    private java.lang.String ethnic;

    private java.lang.String pleaseSpecify;

    private java.lang.String transReffNumber;

    private java.lang.String password;

    private java.lang.String securityQuestion;

    private java.lang.String securityAnswer;

    private com.xius.msp.selfcare.messages.registration.RegisterSubscriberRequestRegisterType registerType;

    public RegisterSubscriberRequest() {
    }

    public RegisterSubscriberRequest(
           java.lang.String MSISDN,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String surName,
           java.lang.String IDType,
           java.lang.String IDNo,
           java.lang.String gender,
           java.util.Date dateOfBirth,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String homePhone,
           java.lang.String officePhone,
           java.lang.String externalNumber,
           java.lang.String internalNumber,
           java.lang.String postalCode,
           java.lang.String streetLimits,
           java.lang.String municipality,
           java.lang.String city,
           java.lang.String state,
           java.lang.String country,
           java.lang.String email,
           java.lang.String occupation,
           java.lang.String industry,
           java.lang.String annualIncome,
           java.lang.String sourceOfInfo,
           java.lang.String userId,
           java.lang.String subscriberStatus,
           java.lang.String address3,
           java.lang.String orderBooking,
           java.lang.String oldIC,
           java.lang.String gmpc,
           java.lang.String networkName,
           java.lang.String ethnic,
           java.lang.String pleaseSpecify,
           java.lang.String transReffNumber,
           java.lang.String password,
           java.lang.String securityQuestion,
           java.lang.String securityAnswer,
           com.xius.msp.selfcare.messages.registration.RegisterSubscriberRequestRegisterType registerType) {
           this.MSISDN = MSISDN;
           this.firstName = firstName;
           this.lastName = lastName;
           this.surName = surName;
           this.IDType = IDType;
           this.IDNo = IDNo;
           this.gender = gender;
           this.dateOfBirth = dateOfBirth;
           this.address1 = address1;
           this.address2 = address2;
           this.homePhone = homePhone;
           this.officePhone = officePhone;
           this.externalNumber = externalNumber;
           this.internalNumber = internalNumber;
           this.postalCode = postalCode;
           this.streetLimits = streetLimits;
           this.municipality = municipality;
           this.city = city;
           this.state = state;
           this.country = country;
           this.email = email;
           this.occupation = occupation;
           this.industry = industry;
           this.annualIncome = annualIncome;
           this.sourceOfInfo = sourceOfInfo;
           this.userId = userId;
           this.subscriberStatus = subscriberStatus;
           this.address3 = address3;
           this.orderBooking = orderBooking;
           this.oldIC = oldIC;
           this.gmpc = gmpc;
           this.networkName = networkName;
           this.ethnic = ethnic;
           this.pleaseSpecify = pleaseSpecify;
           this.transReffNumber = transReffNumber;
           this.password = password;
           this.securityQuestion = securityQuestion;
           this.securityAnswer = securityAnswer;
           this.registerType = registerType;
    }


    /**
     * Gets the MSISDN value for this RegisterSubscriberRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this RegisterSubscriberRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the firstName value for this RegisterSubscriberRequest.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this RegisterSubscriberRequest.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this RegisterSubscriberRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this RegisterSubscriberRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the surName value for this RegisterSubscriberRequest.
     * 
     * @return surName
     */
    public java.lang.String getSurName() {
        return surName;
    }


    /**
     * Sets the surName value for this RegisterSubscriberRequest.
     * 
     * @param surName
     */
    public void setSurName(java.lang.String surName) {
        this.surName = surName;
    }


    /**
     * Gets the IDType value for this RegisterSubscriberRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this RegisterSubscriberRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the IDNo value for this RegisterSubscriberRequest.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this RegisterSubscriberRequest.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the gender value for this RegisterSubscriberRequest.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this RegisterSubscriberRequest.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the dateOfBirth value for this RegisterSubscriberRequest.
     * 
     * @return dateOfBirth
     */
    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this RegisterSubscriberRequest.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the address1 value for this RegisterSubscriberRequest.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this RegisterSubscriberRequest.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this RegisterSubscriberRequest.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this RegisterSubscriberRequest.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the homePhone value for this RegisterSubscriberRequest.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this RegisterSubscriberRequest.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the officePhone value for this RegisterSubscriberRequest.
     * 
     * @return officePhone
     */
    public java.lang.String getOfficePhone() {
        return officePhone;
    }


    /**
     * Sets the officePhone value for this RegisterSubscriberRequest.
     * 
     * @param officePhone
     */
    public void setOfficePhone(java.lang.String officePhone) {
        this.officePhone = officePhone;
    }


    /**
     * Gets the externalNumber value for this RegisterSubscriberRequest.
     * 
     * @return externalNumber
     */
    public java.lang.String getExternalNumber() {
        return externalNumber;
    }


    /**
     * Sets the externalNumber value for this RegisterSubscriberRequest.
     * 
     * @param externalNumber
     */
    public void setExternalNumber(java.lang.String externalNumber) {
        this.externalNumber = externalNumber;
    }


    /**
     * Gets the internalNumber value for this RegisterSubscriberRequest.
     * 
     * @return internalNumber
     */
    public java.lang.String getInternalNumber() {
        return internalNumber;
    }


    /**
     * Sets the internalNumber value for this RegisterSubscriberRequest.
     * 
     * @param internalNumber
     */
    public void setInternalNumber(java.lang.String internalNumber) {
        this.internalNumber = internalNumber;
    }


    /**
     * Gets the postalCode value for this RegisterSubscriberRequest.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this RegisterSubscriberRequest.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the streetLimits value for this RegisterSubscriberRequest.
     * 
     * @return streetLimits
     */
    public java.lang.String getStreetLimits() {
        return streetLimits;
    }


    /**
     * Sets the streetLimits value for this RegisterSubscriberRequest.
     * 
     * @param streetLimits
     */
    public void setStreetLimits(java.lang.String streetLimits) {
        this.streetLimits = streetLimits;
    }


    /**
     * Gets the municipality value for this RegisterSubscriberRequest.
     * 
     * @return municipality
     */
    public java.lang.String getMunicipality() {
        return municipality;
    }


    /**
     * Sets the municipality value for this RegisterSubscriberRequest.
     * 
     * @param municipality
     */
    public void setMunicipality(java.lang.String municipality) {
        this.municipality = municipality;
    }


    /**
     * Gets the city value for this RegisterSubscriberRequest.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this RegisterSubscriberRequest.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this RegisterSubscriberRequest.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this RegisterSubscriberRequest.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this RegisterSubscriberRequest.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this RegisterSubscriberRequest.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the email value for this RegisterSubscriberRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this RegisterSubscriberRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the occupation value for this RegisterSubscriberRequest.
     * 
     * @return occupation
     */
    public java.lang.String getOccupation() {
        return occupation;
    }


    /**
     * Sets the occupation value for this RegisterSubscriberRequest.
     * 
     * @param occupation
     */
    public void setOccupation(java.lang.String occupation) {
        this.occupation = occupation;
    }


    /**
     * Gets the industry value for this RegisterSubscriberRequest.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this RegisterSubscriberRequest.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the annualIncome value for this RegisterSubscriberRequest.
     * 
     * @return annualIncome
     */
    public java.lang.String getAnnualIncome() {
        return annualIncome;
    }


    /**
     * Sets the annualIncome value for this RegisterSubscriberRequest.
     * 
     * @param annualIncome
     */
    public void setAnnualIncome(java.lang.String annualIncome) {
        this.annualIncome = annualIncome;
    }


    /**
     * Gets the sourceOfInfo value for this RegisterSubscriberRequest.
     * 
     * @return sourceOfInfo
     */
    public java.lang.String getSourceOfInfo() {
        return sourceOfInfo;
    }


    /**
     * Sets the sourceOfInfo value for this RegisterSubscriberRequest.
     * 
     * @param sourceOfInfo
     */
    public void setSourceOfInfo(java.lang.String sourceOfInfo) {
        this.sourceOfInfo = sourceOfInfo;
    }


    /**
     * Gets the userId value for this RegisterSubscriberRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this RegisterSubscriberRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the subscriberStatus value for this RegisterSubscriberRequest.
     * 
     * @return subscriberStatus
     */
    public java.lang.String getSubscriberStatus() {
        return subscriberStatus;
    }


    /**
     * Sets the subscriberStatus value for this RegisterSubscriberRequest.
     * 
     * @param subscriberStatus
     */
    public void setSubscriberStatus(java.lang.String subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }


    /**
     * Gets the address3 value for this RegisterSubscriberRequest.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this RegisterSubscriberRequest.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the orderBooking value for this RegisterSubscriberRequest.
     * 
     * @return orderBooking
     */
    public java.lang.String getOrderBooking() {
        return orderBooking;
    }


    /**
     * Sets the orderBooking value for this RegisterSubscriberRequest.
     * 
     * @param orderBooking
     */
    public void setOrderBooking(java.lang.String orderBooking) {
        this.orderBooking = orderBooking;
    }


    /**
     * Gets the oldIC value for this RegisterSubscriberRequest.
     * 
     * @return oldIC
     */
    public java.lang.String getOldIC() {
        return oldIC;
    }


    /**
     * Sets the oldIC value for this RegisterSubscriberRequest.
     * 
     * @param oldIC
     */
    public void setOldIC(java.lang.String oldIC) {
        this.oldIC = oldIC;
    }


    /**
     * Gets the gmpc value for this RegisterSubscriberRequest.
     * 
     * @return gmpc
     */
    public java.lang.String getGmpc() {
        return gmpc;
    }


    /**
     * Sets the gmpc value for this RegisterSubscriberRequest.
     * 
     * @param gmpc
     */
    public void setGmpc(java.lang.String gmpc) {
        this.gmpc = gmpc;
    }


    /**
     * Gets the networkName value for this RegisterSubscriberRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this RegisterSubscriberRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the ethnic value for this RegisterSubscriberRequest.
     * 
     * @return ethnic
     */
    public java.lang.String getEthnic() {
        return ethnic;
    }


    /**
     * Sets the ethnic value for this RegisterSubscriberRequest.
     * 
     * @param ethnic
     */
    public void setEthnic(java.lang.String ethnic) {
        this.ethnic = ethnic;
    }


    /**
     * Gets the pleaseSpecify value for this RegisterSubscriberRequest.
     * 
     * @return pleaseSpecify
     */
    public java.lang.String getPleaseSpecify() {
        return pleaseSpecify;
    }


    /**
     * Sets the pleaseSpecify value for this RegisterSubscriberRequest.
     * 
     * @param pleaseSpecify
     */
    public void setPleaseSpecify(java.lang.String pleaseSpecify) {
        this.pleaseSpecify = pleaseSpecify;
    }


    /**
     * Gets the transReffNumber value for this RegisterSubscriberRequest.
     * 
     * @return transReffNumber
     */
    public java.lang.String getTransReffNumber() {
        return transReffNumber;
    }


    /**
     * Sets the transReffNumber value for this RegisterSubscriberRequest.
     * 
     * @param transReffNumber
     */
    public void setTransReffNumber(java.lang.String transReffNumber) {
        this.transReffNumber = transReffNumber;
    }


    /**
     * Gets the password value for this RegisterSubscriberRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this RegisterSubscriberRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the securityQuestion value for this RegisterSubscriberRequest.
     * 
     * @return securityQuestion
     */
    public java.lang.String getSecurityQuestion() {
        return securityQuestion;
    }


    /**
     * Sets the securityQuestion value for this RegisterSubscriberRequest.
     * 
     * @param securityQuestion
     */
    public void setSecurityQuestion(java.lang.String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }


    /**
     * Gets the securityAnswer value for this RegisterSubscriberRequest.
     * 
     * @return securityAnswer
     */
    public java.lang.String getSecurityAnswer() {
        return securityAnswer;
    }


    /**
     * Sets the securityAnswer value for this RegisterSubscriberRequest.
     * 
     * @param securityAnswer
     */
    public void setSecurityAnswer(java.lang.String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }


    /**
     * Gets the registerType value for this RegisterSubscriberRequest.
     * 
     * @return registerType
     */
    public com.xius.msp.selfcare.messages.registration.RegisterSubscriberRequestRegisterType getRegisterType() {
        return registerType;
    }


    /**
     * Sets the registerType value for this RegisterSubscriberRequest.
     * 
     * @param registerType
     */
    public void setRegisterType(com.xius.msp.selfcare.messages.registration.RegisterSubscriberRequestRegisterType registerType) {
        this.registerType = registerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterSubscriberRequest)) return false;
        RegisterSubscriberRequest other = (RegisterSubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.surName==null && other.getSurName()==null) || 
             (this.surName!=null &&
              this.surName.equals(other.getSurName()))) &&
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.officePhone==null && other.getOfficePhone()==null) || 
             (this.officePhone!=null &&
              this.officePhone.equals(other.getOfficePhone()))) &&
            ((this.externalNumber==null && other.getExternalNumber()==null) || 
             (this.externalNumber!=null &&
              this.externalNumber.equals(other.getExternalNumber()))) &&
            ((this.internalNumber==null && other.getInternalNumber()==null) || 
             (this.internalNumber!=null &&
              this.internalNumber.equals(other.getInternalNumber()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.streetLimits==null && other.getStreetLimits()==null) || 
             (this.streetLimits!=null &&
              this.streetLimits.equals(other.getStreetLimits()))) &&
            ((this.municipality==null && other.getMunicipality()==null) || 
             (this.municipality!=null &&
              this.municipality.equals(other.getMunicipality()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.occupation==null && other.getOccupation()==null) || 
             (this.occupation!=null &&
              this.occupation.equals(other.getOccupation()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.annualIncome==null && other.getAnnualIncome()==null) || 
             (this.annualIncome!=null &&
              this.annualIncome.equals(other.getAnnualIncome()))) &&
            ((this.sourceOfInfo==null && other.getSourceOfInfo()==null) || 
             (this.sourceOfInfo!=null &&
              this.sourceOfInfo.equals(other.getSourceOfInfo()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.subscriberStatus==null && other.getSubscriberStatus()==null) || 
             (this.subscriberStatus!=null &&
              this.subscriberStatus.equals(other.getSubscriberStatus()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
            ((this.orderBooking==null && other.getOrderBooking()==null) || 
             (this.orderBooking!=null &&
              this.orderBooking.equals(other.getOrderBooking()))) &&
            ((this.oldIC==null && other.getOldIC()==null) || 
             (this.oldIC!=null &&
              this.oldIC.equals(other.getOldIC()))) &&
            ((this.gmpc==null && other.getGmpc()==null) || 
             (this.gmpc!=null &&
              this.gmpc.equals(other.getGmpc()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.ethnic==null && other.getEthnic()==null) || 
             (this.ethnic!=null &&
              this.ethnic.equals(other.getEthnic()))) &&
            ((this.pleaseSpecify==null && other.getPleaseSpecify()==null) || 
             (this.pleaseSpecify!=null &&
              this.pleaseSpecify.equals(other.getPleaseSpecify()))) &&
            ((this.transReffNumber==null && other.getTransReffNumber()==null) || 
             (this.transReffNumber!=null &&
              this.transReffNumber.equals(other.getTransReffNumber()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.securityQuestion==null && other.getSecurityQuestion()==null) || 
             (this.securityQuestion!=null &&
              this.securityQuestion.equals(other.getSecurityQuestion()))) &&
            ((this.securityAnswer==null && other.getSecurityAnswer()==null) || 
             (this.securityAnswer!=null &&
              this.securityAnswer.equals(other.getSecurityAnswer()))) &&
            ((this.registerType==null && other.getRegisterType()==null) || 
             (this.registerType!=null &&
              this.registerType.equals(other.getRegisterType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getSurName() != null) {
            _hashCode += getSurName().hashCode();
        }
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getOfficePhone() != null) {
            _hashCode += getOfficePhone().hashCode();
        }
        if (getExternalNumber() != null) {
            _hashCode += getExternalNumber().hashCode();
        }
        if (getInternalNumber() != null) {
            _hashCode += getInternalNumber().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getStreetLimits() != null) {
            _hashCode += getStreetLimits().hashCode();
        }
        if (getMunicipality() != null) {
            _hashCode += getMunicipality().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getOccupation() != null) {
            _hashCode += getOccupation().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getAnnualIncome() != null) {
            _hashCode += getAnnualIncome().hashCode();
        }
        if (getSourceOfInfo() != null) {
            _hashCode += getSourceOfInfo().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getSubscriberStatus() != null) {
            _hashCode += getSubscriberStatus().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
        }
        if (getOrderBooking() != null) {
            _hashCode += getOrderBooking().hashCode();
        }
        if (getOldIC() != null) {
            _hashCode += getOldIC().hashCode();
        }
        if (getGmpc() != null) {
            _hashCode += getGmpc().hashCode();
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getEthnic() != null) {
            _hashCode += getEthnic().hashCode();
        }
        if (getPleaseSpecify() != null) {
            _hashCode += getPleaseSpecify().hashCode();
        }
        if (getTransReffNumber() != null) {
            _hashCode += getTransReffNumber().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSecurityQuestion() != null) {
            _hashCode += getSecurityQuestion().hashCode();
        }
        if (getSecurityAnswer() != null) {
            _hashCode += getSecurityAnswer().hashCode();
        }
        if (getRegisterType() != null) {
            _hashCode += getRegisterType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "RegisterSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "SurName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "officePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "ExternalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "InternalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "StreetLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "Municipality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "occupation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "industry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "annualIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceOfInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "sourceOfInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "subscriberStatus "));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBooking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "orderBooking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "oldIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gmpc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "gmpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "ethnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pleaseSpecify");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "pleaseSpecify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transReffNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "transReffNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "securityQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityAnswer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "securityAnswer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "registerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", ">RegisterSubscriberRequest>registerType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
