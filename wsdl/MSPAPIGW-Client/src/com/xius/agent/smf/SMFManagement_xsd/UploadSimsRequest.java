/**
 * UploadSimsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class UploadSimsRequest  implements java.io.Serializable {
    private java.lang.String[] SIM;

    private long[] idType;

    private java.lang.String[] idNo;

    private java.lang.String[] firstName;

    private java.lang.String[] lastName;

    private java.lang.String[] surName;

    private java.lang.String[] dateofBirth;

    private java.lang.String[] accountType;

    private long[] billcycleday;

    private java.math.BigDecimal[] creditLimit;

    private java.lang.String[] municipoality;

    private java.lang.String[] streetLimits;

    private java.lang.String[] gender;

    private java.lang.String[] street;

    private java.lang.String[] colony;

    private java.lang.String[] city;

    private java.lang.String[] state;

    private java.lang.String[] country;

    private long[] postalCode;

    private java.lang.String[] emailID;

    private long[] alternateContactNo;

    private java.lang.String[] trafficpack;

    private long[] trafficpackId;

    private java.lang.String[] internalNumber;

    private java.lang.String[] externalNumber;

    private java.lang.String[] billType;

    private java.lang.String[] billFrequency;

    private java.lang.String[] userInputField1;

    private java.lang.String[] userInputField2;

    private java.lang.String[] userInputField3;

    private java.lang.String[] userInputField4;

    private java.lang.String[] userInputField5;

    private java.lang.String[] dealerId;

    private long[] locationcode;

    private java.lang.String[] personalInfoFlag;

    private java.lang.String channel;

    private java.lang.String officeCode;

    private java.lang.String isCorp;

    public UploadSimsRequest() {
    }

    public UploadSimsRequest(
           java.lang.String[] SIM,
           long[] idType,
           java.lang.String[] idNo,
           java.lang.String[] firstName,
           java.lang.String[] lastName,
           java.lang.String[] surName,
           java.lang.String[] dateofBirth,
           java.lang.String[] accountType,
           long[] billcycleday,
           java.math.BigDecimal[] creditLimit,
           java.lang.String[] municipoality,
           java.lang.String[] streetLimits,
           java.lang.String[] gender,
           java.lang.String[] street,
           java.lang.String[] colony,
           java.lang.String[] city,
           java.lang.String[] state,
           java.lang.String[] country,
           long[] postalCode,
           java.lang.String[] emailID,
           long[] alternateContactNo,
           java.lang.String[] trafficpack,
           long[] trafficpackId,
           java.lang.String[] internalNumber,
           java.lang.String[] externalNumber,
           java.lang.String[] billType,
           java.lang.String[] billFrequency,
           java.lang.String[] userInputField1,
           java.lang.String[] userInputField2,
           java.lang.String[] userInputField3,
           java.lang.String[] userInputField4,
           java.lang.String[] userInputField5,
           java.lang.String[] dealerId,
           long[] locationcode,
           java.lang.String[] personalInfoFlag,
           java.lang.String channel,
           java.lang.String officeCode,
           java.lang.String isCorp) {
           this.SIM = SIM;
           this.idType = idType;
           this.idNo = idNo;
           this.firstName = firstName;
           this.lastName = lastName;
           this.surName = surName;
           this.dateofBirth = dateofBirth;
           this.accountType = accountType;
           this.billcycleday = billcycleday;
           this.creditLimit = creditLimit;
           this.municipoality = municipoality;
           this.streetLimits = streetLimits;
           this.gender = gender;
           this.street = street;
           this.colony = colony;
           this.city = city;
           this.state = state;
           this.country = country;
           this.postalCode = postalCode;
           this.emailID = emailID;
           this.alternateContactNo = alternateContactNo;
           this.trafficpack = trafficpack;
           this.trafficpackId = trafficpackId;
           this.internalNumber = internalNumber;
           this.externalNumber = externalNumber;
           this.billType = billType;
           this.billFrequency = billFrequency;
           this.userInputField1 = userInputField1;
           this.userInputField2 = userInputField2;
           this.userInputField3 = userInputField3;
           this.userInputField4 = userInputField4;
           this.userInputField5 = userInputField5;
           this.dealerId = dealerId;
           this.locationcode = locationcode;
           this.personalInfoFlag = personalInfoFlag;
           this.channel = channel;
           this.officeCode = officeCode;
           this.isCorp = isCorp;
    }


    /**
     * Gets the SIM value for this UploadSimsRequest.
     * 
     * @return SIM
     */
    public java.lang.String[] getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this UploadSimsRequest.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String[] SIM) {
        this.SIM = SIM;
    }

    public java.lang.String getSIM(int i) {
        return this.SIM[i];
    }

    public void setSIM(int i, java.lang.String _value) {
        this.SIM[i] = _value;
    }


    /**
     * Gets the idType value for this UploadSimsRequest.
     * 
     * @return idType
     */
    public long[] getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this UploadSimsRequest.
     * 
     * @param idType
     */
    public void setIdType(long[] idType) {
        this.idType = idType;
    }

    public long getIdType(int i) {
        return this.idType[i];
    }

    public void setIdType(int i, long _value) {
        this.idType[i] = _value;
    }


    /**
     * Gets the idNo value for this UploadSimsRequest.
     * 
     * @return idNo
     */
    public java.lang.String[] getIdNo() {
        return idNo;
    }


    /**
     * Sets the idNo value for this UploadSimsRequest.
     * 
     * @param idNo
     */
    public void setIdNo(java.lang.String[] idNo) {
        this.idNo = idNo;
    }

    public java.lang.String getIdNo(int i) {
        return this.idNo[i];
    }

    public void setIdNo(int i, java.lang.String _value) {
        this.idNo[i] = _value;
    }


    /**
     * Gets the firstName value for this UploadSimsRequest.
     * 
     * @return firstName
     */
    public java.lang.String[] getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UploadSimsRequest.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String[] firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getFirstName(int i) {
        return this.firstName[i];
    }

    public void setFirstName(int i, java.lang.String _value) {
        this.firstName[i] = _value;
    }


    /**
     * Gets the lastName value for this UploadSimsRequest.
     * 
     * @return lastName
     */
    public java.lang.String[] getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UploadSimsRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String[] lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getLastName(int i) {
        return this.lastName[i];
    }

    public void setLastName(int i, java.lang.String _value) {
        this.lastName[i] = _value;
    }


    /**
     * Gets the surName value for this UploadSimsRequest.
     * 
     * @return surName
     */
    public java.lang.String[] getSurName() {
        return surName;
    }


    /**
     * Sets the surName value for this UploadSimsRequest.
     * 
     * @param surName
     */
    public void setSurName(java.lang.String[] surName) {
        this.surName = surName;
    }

    public java.lang.String getSurName(int i) {
        return this.surName[i];
    }

    public void setSurName(int i, java.lang.String _value) {
        this.surName[i] = _value;
    }


    /**
     * Gets the dateofBirth value for this UploadSimsRequest.
     * 
     * @return dateofBirth
     */
    public java.lang.String[] getDateofBirth() {
        return dateofBirth;
    }


    /**
     * Sets the dateofBirth value for this UploadSimsRequest.
     * 
     * @param dateofBirth
     */
    public void setDateofBirth(java.lang.String[] dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public java.lang.String getDateofBirth(int i) {
        return this.dateofBirth[i];
    }

    public void setDateofBirth(int i, java.lang.String _value) {
        this.dateofBirth[i] = _value;
    }


    /**
     * Gets the accountType value for this UploadSimsRequest.
     * 
     * @return accountType
     */
    public java.lang.String[] getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this UploadSimsRequest.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String[] accountType) {
        this.accountType = accountType;
    }

    public java.lang.String getAccountType(int i) {
        return this.accountType[i];
    }

    public void setAccountType(int i, java.lang.String _value) {
        this.accountType[i] = _value;
    }


    /**
     * Gets the billcycleday value for this UploadSimsRequest.
     * 
     * @return billcycleday
     */
    public long[] getBillcycleday() {
        return billcycleday;
    }


    /**
     * Sets the billcycleday value for this UploadSimsRequest.
     * 
     * @param billcycleday
     */
    public void setBillcycleday(long[] billcycleday) {
        this.billcycleday = billcycleday;
    }

    public long getBillcycleday(int i) {
        return this.billcycleday[i];
    }

    public void setBillcycleday(int i, long _value) {
        this.billcycleday[i] = _value;
    }


    /**
     * Gets the creditLimit value for this UploadSimsRequest.
     * 
     * @return creditLimit
     */
    public java.math.BigDecimal[] getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this UploadSimsRequest.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.math.BigDecimal[] creditLimit) {
        this.creditLimit = creditLimit;
    }

    public java.math.BigDecimal getCreditLimit(int i) {
        return this.creditLimit[i];
    }

    public void setCreditLimit(int i, java.math.BigDecimal _value) {
        this.creditLimit[i] = _value;
    }


    /**
     * Gets the municipoality value for this UploadSimsRequest.
     * 
     * @return municipoality
     */
    public java.lang.String[] getMunicipoality() {
        return municipoality;
    }


    /**
     * Sets the municipoality value for this UploadSimsRequest.
     * 
     * @param municipoality
     */
    public void setMunicipoality(java.lang.String[] municipoality) {
        this.municipoality = municipoality;
    }

    public java.lang.String getMunicipoality(int i) {
        return this.municipoality[i];
    }

    public void setMunicipoality(int i, java.lang.String _value) {
        this.municipoality[i] = _value;
    }


    /**
     * Gets the streetLimits value for this UploadSimsRequest.
     * 
     * @return streetLimits
     */
    public java.lang.String[] getStreetLimits() {
        return streetLimits;
    }


    /**
     * Sets the streetLimits value for this UploadSimsRequest.
     * 
     * @param streetLimits
     */
    public void setStreetLimits(java.lang.String[] streetLimits) {
        this.streetLimits = streetLimits;
    }

    public java.lang.String getStreetLimits(int i) {
        return this.streetLimits[i];
    }

    public void setStreetLimits(int i, java.lang.String _value) {
        this.streetLimits[i] = _value;
    }


    /**
     * Gets the gender value for this UploadSimsRequest.
     * 
     * @return gender
     */
    public java.lang.String[] getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this UploadSimsRequest.
     * 
     * @param gender
     */
    public void setGender(java.lang.String[] gender) {
        this.gender = gender;
    }

    public java.lang.String getGender(int i) {
        return this.gender[i];
    }

    public void setGender(int i, java.lang.String _value) {
        this.gender[i] = _value;
    }


    /**
     * Gets the street value for this UploadSimsRequest.
     * 
     * @return street
     */
    public java.lang.String[] getStreet() {
        return street;
    }


    /**
     * Sets the street value for this UploadSimsRequest.
     * 
     * @param street
     */
    public void setStreet(java.lang.String[] street) {
        this.street = street;
    }

    public java.lang.String getStreet(int i) {
        return this.street[i];
    }

    public void setStreet(int i, java.lang.String _value) {
        this.street[i] = _value;
    }


    /**
     * Gets the colony value for this UploadSimsRequest.
     * 
     * @return colony
     */
    public java.lang.String[] getColony() {
        return colony;
    }


    /**
     * Sets the colony value for this UploadSimsRequest.
     * 
     * @param colony
     */
    public void setColony(java.lang.String[] colony) {
        this.colony = colony;
    }

    public java.lang.String getColony(int i) {
        return this.colony[i];
    }

    public void setColony(int i, java.lang.String _value) {
        this.colony[i] = _value;
    }


    /**
     * Gets the city value for this UploadSimsRequest.
     * 
     * @return city
     */
    public java.lang.String[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this UploadSimsRequest.
     * 
     * @param city
     */
    public void setCity(java.lang.String[] city) {
        this.city = city;
    }

    public java.lang.String getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, java.lang.String _value) {
        this.city[i] = _value;
    }


    /**
     * Gets the state value for this UploadSimsRequest.
     * 
     * @return state
     */
    public java.lang.String[] getState() {
        return state;
    }


    /**
     * Sets the state value for this UploadSimsRequest.
     * 
     * @param state
     */
    public void setState(java.lang.String[] state) {
        this.state = state;
    }

    public java.lang.String getState(int i) {
        return this.state[i];
    }

    public void setState(int i, java.lang.String _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the country value for this UploadSimsRequest.
     * 
     * @return country
     */
    public java.lang.String[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UploadSimsRequest.
     * 
     * @param country
     */
    public void setCountry(java.lang.String[] country) {
        this.country = country;
    }

    public java.lang.String getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, java.lang.String _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the postalCode value for this UploadSimsRequest.
     * 
     * @return postalCode
     */
    public long[] getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this UploadSimsRequest.
     * 
     * @param postalCode
     */
    public void setPostalCode(long[] postalCode) {
        this.postalCode = postalCode;
    }

    public long getPostalCode(int i) {
        return this.postalCode[i];
    }

    public void setPostalCode(int i, long _value) {
        this.postalCode[i] = _value;
    }


    /**
     * Gets the emailID value for this UploadSimsRequest.
     * 
     * @return emailID
     */
    public java.lang.String[] getEmailID() {
        return emailID;
    }


    /**
     * Sets the emailID value for this UploadSimsRequest.
     * 
     * @param emailID
     */
    public void setEmailID(java.lang.String[] emailID) {
        this.emailID = emailID;
    }

    public java.lang.String getEmailID(int i) {
        return this.emailID[i];
    }

    public void setEmailID(int i, java.lang.String _value) {
        this.emailID[i] = _value;
    }


    /**
     * Gets the alternateContactNo value for this UploadSimsRequest.
     * 
     * @return alternateContactNo
     */
    public long[] getAlternateContactNo() {
        return alternateContactNo;
    }


    /**
     * Sets the alternateContactNo value for this UploadSimsRequest.
     * 
     * @param alternateContactNo
     */
    public void setAlternateContactNo(long[] alternateContactNo) {
        this.alternateContactNo = alternateContactNo;
    }

    public long getAlternateContactNo(int i) {
        return this.alternateContactNo[i];
    }

    public void setAlternateContactNo(int i, long _value) {
        this.alternateContactNo[i] = _value;
    }


    /**
     * Gets the trafficpack value for this UploadSimsRequest.
     * 
     * @return trafficpack
     */
    public java.lang.String[] getTrafficpack() {
        return trafficpack;
    }


    /**
     * Sets the trafficpack value for this UploadSimsRequest.
     * 
     * @param trafficpack
     */
    public void setTrafficpack(java.lang.String[] trafficpack) {
        this.trafficpack = trafficpack;
    }

    public java.lang.String getTrafficpack(int i) {
        return this.trafficpack[i];
    }

    public void setTrafficpack(int i, java.lang.String _value) {
        this.trafficpack[i] = _value;
    }


    /**
     * Gets the trafficpackId value for this UploadSimsRequest.
     * 
     * @return trafficpackId
     */
    public long[] getTrafficpackId() {
        return trafficpackId;
    }


    /**
     * Sets the trafficpackId value for this UploadSimsRequest.
     * 
     * @param trafficpackId
     */
    public void setTrafficpackId(long[] trafficpackId) {
        this.trafficpackId = trafficpackId;
    }

    public long getTrafficpackId(int i) {
        return this.trafficpackId[i];
    }

    public void setTrafficpackId(int i, long _value) {
        this.trafficpackId[i] = _value;
    }


    /**
     * Gets the internalNumber value for this UploadSimsRequest.
     * 
     * @return internalNumber
     */
    public java.lang.String[] getInternalNumber() {
        return internalNumber;
    }


    /**
     * Sets the internalNumber value for this UploadSimsRequest.
     * 
     * @param internalNumber
     */
    public void setInternalNumber(java.lang.String[] internalNumber) {
        this.internalNumber = internalNumber;
    }

    public java.lang.String getInternalNumber(int i) {
        return this.internalNumber[i];
    }

    public void setInternalNumber(int i, java.lang.String _value) {
        this.internalNumber[i] = _value;
    }


    /**
     * Gets the externalNumber value for this UploadSimsRequest.
     * 
     * @return externalNumber
     */
    public java.lang.String[] getExternalNumber() {
        return externalNumber;
    }


    /**
     * Sets the externalNumber value for this UploadSimsRequest.
     * 
     * @param externalNumber
     */
    public void setExternalNumber(java.lang.String[] externalNumber) {
        this.externalNumber = externalNumber;
    }

    public java.lang.String getExternalNumber(int i) {
        return this.externalNumber[i];
    }

    public void setExternalNumber(int i, java.lang.String _value) {
        this.externalNumber[i] = _value;
    }


    /**
     * Gets the billType value for this UploadSimsRequest.
     * 
     * @return billType
     */
    public java.lang.String[] getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this UploadSimsRequest.
     * 
     * @param billType
     */
    public void setBillType(java.lang.String[] billType) {
        this.billType = billType;
    }

    public java.lang.String getBillType(int i) {
        return this.billType[i];
    }

    public void setBillType(int i, java.lang.String _value) {
        this.billType[i] = _value;
    }


    /**
     * Gets the billFrequency value for this UploadSimsRequest.
     * 
     * @return billFrequency
     */
    public java.lang.String[] getBillFrequency() {
        return billFrequency;
    }


    /**
     * Sets the billFrequency value for this UploadSimsRequest.
     * 
     * @param billFrequency
     */
    public void setBillFrequency(java.lang.String[] billFrequency) {
        this.billFrequency = billFrequency;
    }

    public java.lang.String getBillFrequency(int i) {
        return this.billFrequency[i];
    }

    public void setBillFrequency(int i, java.lang.String _value) {
        this.billFrequency[i] = _value;
    }


    /**
     * Gets the userInputField1 value for this UploadSimsRequest.
     * 
     * @return userInputField1
     */
    public java.lang.String[] getUserInputField1() {
        return userInputField1;
    }


    /**
     * Sets the userInputField1 value for this UploadSimsRequest.
     * 
     * @param userInputField1
     */
    public void setUserInputField1(java.lang.String[] userInputField1) {
        this.userInputField1 = userInputField1;
    }

    public java.lang.String getUserInputField1(int i) {
        return this.userInputField1[i];
    }

    public void setUserInputField1(int i, java.lang.String _value) {
        this.userInputField1[i] = _value;
    }


    /**
     * Gets the userInputField2 value for this UploadSimsRequest.
     * 
     * @return userInputField2
     */
    public java.lang.String[] getUserInputField2() {
        return userInputField2;
    }


    /**
     * Sets the userInputField2 value for this UploadSimsRequest.
     * 
     * @param userInputField2
     */
    public void setUserInputField2(java.lang.String[] userInputField2) {
        this.userInputField2 = userInputField2;
    }

    public java.lang.String getUserInputField2(int i) {
        return this.userInputField2[i];
    }

    public void setUserInputField2(int i, java.lang.String _value) {
        this.userInputField2[i] = _value;
    }


    /**
     * Gets the userInputField3 value for this UploadSimsRequest.
     * 
     * @return userInputField3
     */
    public java.lang.String[] getUserInputField3() {
        return userInputField3;
    }


    /**
     * Sets the userInputField3 value for this UploadSimsRequest.
     * 
     * @param userInputField3
     */
    public void setUserInputField3(java.lang.String[] userInputField3) {
        this.userInputField3 = userInputField3;
    }

    public java.lang.String getUserInputField3(int i) {
        return this.userInputField3[i];
    }

    public void setUserInputField3(int i, java.lang.String _value) {
        this.userInputField3[i] = _value;
    }


    /**
     * Gets the userInputField4 value for this UploadSimsRequest.
     * 
     * @return userInputField4
     */
    public java.lang.String[] getUserInputField4() {
        return userInputField4;
    }


    /**
     * Sets the userInputField4 value for this UploadSimsRequest.
     * 
     * @param userInputField4
     */
    public void setUserInputField4(java.lang.String[] userInputField4) {
        this.userInputField4 = userInputField4;
    }

    public java.lang.String getUserInputField4(int i) {
        return this.userInputField4[i];
    }

    public void setUserInputField4(int i, java.lang.String _value) {
        this.userInputField4[i] = _value;
    }


    /**
     * Gets the userInputField5 value for this UploadSimsRequest.
     * 
     * @return userInputField5
     */
    public java.lang.String[] getUserInputField5() {
        return userInputField5;
    }


    /**
     * Sets the userInputField5 value for this UploadSimsRequest.
     * 
     * @param userInputField5
     */
    public void setUserInputField5(java.lang.String[] userInputField5) {
        this.userInputField5 = userInputField5;
    }

    public java.lang.String getUserInputField5(int i) {
        return this.userInputField5[i];
    }

    public void setUserInputField5(int i, java.lang.String _value) {
        this.userInputField5[i] = _value;
    }


    /**
     * Gets the dealerId value for this UploadSimsRequest.
     * 
     * @return dealerId
     */
    public java.lang.String[] getDealerId() {
        return dealerId;
    }


    /**
     * Sets the dealerId value for this UploadSimsRequest.
     * 
     * @param dealerId
     */
    public void setDealerId(java.lang.String[] dealerId) {
        this.dealerId = dealerId;
    }

    public java.lang.String getDealerId(int i) {
        return this.dealerId[i];
    }

    public void setDealerId(int i, java.lang.String _value) {
        this.dealerId[i] = _value;
    }


    /**
     * Gets the locationcode value for this UploadSimsRequest.
     * 
     * @return locationcode
     */
    public long[] getLocationcode() {
        return locationcode;
    }


    /**
     * Sets the locationcode value for this UploadSimsRequest.
     * 
     * @param locationcode
     */
    public void setLocationcode(long[] locationcode) {
        this.locationcode = locationcode;
    }

    public long getLocationcode(int i) {
        return this.locationcode[i];
    }

    public void setLocationcode(int i, long _value) {
        this.locationcode[i] = _value;
    }


    /**
     * Gets the personalInfoFlag value for this UploadSimsRequest.
     * 
     * @return personalInfoFlag
     */
    public java.lang.String[] getPersonalInfoFlag() {
        return personalInfoFlag;
    }


    /**
     * Sets the personalInfoFlag value for this UploadSimsRequest.
     * 
     * @param personalInfoFlag
     */
    public void setPersonalInfoFlag(java.lang.String[] personalInfoFlag) {
        this.personalInfoFlag = personalInfoFlag;
    }

    public java.lang.String getPersonalInfoFlag(int i) {
        return this.personalInfoFlag[i];
    }

    public void setPersonalInfoFlag(int i, java.lang.String _value) {
        this.personalInfoFlag[i] = _value;
    }


    /**
     * Gets the channel value for this UploadSimsRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this UploadSimsRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the officeCode value for this UploadSimsRequest.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this UploadSimsRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the isCorp value for this UploadSimsRequest.
     * 
     * @return isCorp
     */
    public java.lang.String getIsCorp() {
        return isCorp;
    }


    /**
     * Sets the isCorp value for this UploadSimsRequest.
     * 
     * @param isCorp
     */
    public void setIsCorp(java.lang.String isCorp) {
        this.isCorp = isCorp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadSimsRequest)) return false;
        UploadSimsRequest other = (UploadSimsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              java.util.Arrays.equals(this.SIM, other.getSIM()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              java.util.Arrays.equals(this.idType, other.getIdType()))) &&
            ((this.idNo==null && other.getIdNo()==null) || 
             (this.idNo!=null &&
              java.util.Arrays.equals(this.idNo, other.getIdNo()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              java.util.Arrays.equals(this.firstName, other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              java.util.Arrays.equals(this.lastName, other.getLastName()))) &&
            ((this.surName==null && other.getSurName()==null) || 
             (this.surName!=null &&
              java.util.Arrays.equals(this.surName, other.getSurName()))) &&
            ((this.dateofBirth==null && other.getDateofBirth()==null) || 
             (this.dateofBirth!=null &&
              java.util.Arrays.equals(this.dateofBirth, other.getDateofBirth()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              java.util.Arrays.equals(this.accountType, other.getAccountType()))) &&
            ((this.billcycleday==null && other.getBillcycleday()==null) || 
             (this.billcycleday!=null &&
              java.util.Arrays.equals(this.billcycleday, other.getBillcycleday()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              java.util.Arrays.equals(this.creditLimit, other.getCreditLimit()))) &&
            ((this.municipoality==null && other.getMunicipoality()==null) || 
             (this.municipoality!=null &&
              java.util.Arrays.equals(this.municipoality, other.getMunicipoality()))) &&
            ((this.streetLimits==null && other.getStreetLimits()==null) || 
             (this.streetLimits!=null &&
              java.util.Arrays.equals(this.streetLimits, other.getStreetLimits()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              java.util.Arrays.equals(this.gender, other.getGender()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              java.util.Arrays.equals(this.street, other.getStreet()))) &&
            ((this.colony==null && other.getColony()==null) || 
             (this.colony!=null &&
              java.util.Arrays.equals(this.colony, other.getColony()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              java.util.Arrays.equals(this.postalCode, other.getPostalCode()))) &&
            ((this.emailID==null && other.getEmailID()==null) || 
             (this.emailID!=null &&
              java.util.Arrays.equals(this.emailID, other.getEmailID()))) &&
            ((this.alternateContactNo==null && other.getAlternateContactNo()==null) || 
             (this.alternateContactNo!=null &&
              java.util.Arrays.equals(this.alternateContactNo, other.getAlternateContactNo()))) &&
            ((this.trafficpack==null && other.getTrafficpack()==null) || 
             (this.trafficpack!=null &&
              java.util.Arrays.equals(this.trafficpack, other.getTrafficpack()))) &&
            ((this.trafficpackId==null && other.getTrafficpackId()==null) || 
             (this.trafficpackId!=null &&
              java.util.Arrays.equals(this.trafficpackId, other.getTrafficpackId()))) &&
            ((this.internalNumber==null && other.getInternalNumber()==null) || 
             (this.internalNumber!=null &&
              java.util.Arrays.equals(this.internalNumber, other.getInternalNumber()))) &&
            ((this.externalNumber==null && other.getExternalNumber()==null) || 
             (this.externalNumber!=null &&
              java.util.Arrays.equals(this.externalNumber, other.getExternalNumber()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              java.util.Arrays.equals(this.billType, other.getBillType()))) &&
            ((this.billFrequency==null && other.getBillFrequency()==null) || 
             (this.billFrequency!=null &&
              java.util.Arrays.equals(this.billFrequency, other.getBillFrequency()))) &&
            ((this.userInputField1==null && other.getUserInputField1()==null) || 
             (this.userInputField1!=null &&
              java.util.Arrays.equals(this.userInputField1, other.getUserInputField1()))) &&
            ((this.userInputField2==null && other.getUserInputField2()==null) || 
             (this.userInputField2!=null &&
              java.util.Arrays.equals(this.userInputField2, other.getUserInputField2()))) &&
            ((this.userInputField3==null && other.getUserInputField3()==null) || 
             (this.userInputField3!=null &&
              java.util.Arrays.equals(this.userInputField3, other.getUserInputField3()))) &&
            ((this.userInputField4==null && other.getUserInputField4()==null) || 
             (this.userInputField4!=null &&
              java.util.Arrays.equals(this.userInputField4, other.getUserInputField4()))) &&
            ((this.userInputField5==null && other.getUserInputField5()==null) || 
             (this.userInputField5!=null &&
              java.util.Arrays.equals(this.userInputField5, other.getUserInputField5()))) &&
            ((this.dealerId==null && other.getDealerId()==null) || 
             (this.dealerId!=null &&
              java.util.Arrays.equals(this.dealerId, other.getDealerId()))) &&
            ((this.locationcode==null && other.getLocationcode()==null) || 
             (this.locationcode!=null &&
              java.util.Arrays.equals(this.locationcode, other.getLocationcode()))) &&
            ((this.personalInfoFlag==null && other.getPersonalInfoFlag()==null) || 
             (this.personalInfoFlag!=null &&
              java.util.Arrays.equals(this.personalInfoFlag, other.getPersonalInfoFlag()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
            ((this.isCorp==null && other.getIsCorp()==null) || 
             (this.isCorp!=null &&
              this.isCorp.equals(other.getIsCorp())));
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
        if (getSIM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSIM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSIM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdNo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateofBirth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateofBirth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateofBirth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillcycleday() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillcycleday());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillcycleday(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMunicipoality() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMunicipoality());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMunicipoality(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStreetLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStreetLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStreetLimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGender() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGender());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGender(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStreet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStreet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStreet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColony() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColony());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColony(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostalCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostalCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostalCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlternateContactNo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateContactNo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateContactNo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpackId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpackId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpackId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillFrequency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillFrequency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillFrequency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserInputField1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInputField1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInputField1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserInputField2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInputField2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInputField2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserInputField3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInputField3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInputField3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserInputField4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInputField4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInputField4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserInputField5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInputField5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserInputField5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDealerId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDealerId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDealerId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationcode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationcode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationcode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersonalInfoFlag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersonalInfoFlag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersonalInfoFlag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getIsCorp() != null) {
            _hashCode += getIsCorp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadSimsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "idNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SurName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateofBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DateofBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billcycleday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Billcycleday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "CreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipoality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "municipoality "));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "StreetLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colony");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Colony"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "emailID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateContactNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "AlternateContactNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpack");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Trafficpack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpackId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TrafficpackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "InternalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ExternalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BillType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BillFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInputField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UserInputField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInputField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UserInputField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInputField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UserInputField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInputField4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UserInputField4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInputField5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UserInputField5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DealerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Locationcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalInfoFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersonalInfoFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "OfficeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCorp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "isCorp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
