/**
 * CallDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class CallDetailsType  implements java.io.Serializable {
    private java.lang.String calledCountry;

    private java.lang.String numberOrAPN;

    private java.lang.String category;

    private java.lang.String trafficDirection;

    private java.lang.String date;

    private java.lang.String time;

    private java.lang.String consumption;

    private java.lang.String cost;

    private java.lang.String cbsFlag;

    private java.lang.String msisdn;

    private java.lang.String dateofchange;

    private java.lang.String newfnfnumber;

    private java.lang.String oldfnfnumber;

    private java.lang.String charge;

    private java.lang.String action;

    private java.lang.String bucketId;

    private java.lang.String bucketType;

    private java.lang.String bucketUnitValue;

    private java.lang.Integer rowNum;

    private java.lang.String callDate;

    private java.lang.String usageType;

    private java.lang.String locationName;

    private java.lang.String phoneNumber;

    private java.lang.String callDuration;

    private java.lang.Long airtimeAMNT;

    private java.lang.Long PSTNAMNT;

    private java.lang.Long totalCharges;

    private java.lang.String caUnitType;

    private java.lang.String caUnitValue;

    private java.lang.String caChannelType;

    private java.lang.Long airtimeBtu;

    private java.lang.Long pstnBtu;

    private java.lang.String debitCreditFlag;

    private java.lang.String callType;

    private java.lang.String callCategory;

    private java.lang.String currentBalance;

    private java.lang.String previousBalance;

    private java.lang.String parentUnitType;

    private java.lang.String parentUnitValue;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public CallDetailsType() {
    }

    public CallDetailsType(
           java.lang.String calledCountry,
           java.lang.String numberOrAPN,
           java.lang.String category,
           java.lang.String trafficDirection,
           java.lang.String date,
           java.lang.String time,
           java.lang.String consumption,
           java.lang.String cost,
           java.lang.String cbsFlag,
           java.lang.String msisdn,
           java.lang.String dateofchange,
           java.lang.String newfnfnumber,
           java.lang.String oldfnfnumber,
           java.lang.String charge,
           java.lang.String action,
           java.lang.String bucketId,
           java.lang.String bucketType,
           java.lang.String bucketUnitValue,
           java.lang.Integer rowNum,
           java.lang.String callDate,
           java.lang.String usageType,
           java.lang.String locationName,
           java.lang.String phoneNumber,
           java.lang.String callDuration,
           java.lang.Long airtimeAMNT,
           java.lang.Long PSTNAMNT,
           java.lang.Long totalCharges,
           java.lang.String caUnitType,
           java.lang.String caUnitValue,
           java.lang.String caChannelType,
           java.lang.Long airtimeBtu,
           java.lang.Long pstnBtu,
           java.lang.String debitCreditFlag,
           java.lang.String callType,
           java.lang.String callCategory,
           java.lang.String currentBalance,
           java.lang.String previousBalance,
           java.lang.String parentUnitType,
           java.lang.String parentUnitValue,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.calledCountry = calledCountry;
           this.numberOrAPN = numberOrAPN;
           this.category = category;
           this.trafficDirection = trafficDirection;
           this.date = date;
           this.time = time;
           this.consumption = consumption;
           this.cost = cost;
           this.cbsFlag = cbsFlag;
           this.msisdn = msisdn;
           this.dateofchange = dateofchange;
           this.newfnfnumber = newfnfnumber;
           this.oldfnfnumber = oldfnfnumber;
           this.charge = charge;
           this.action = action;
           this.bucketId = bucketId;
           this.bucketType = bucketType;
           this.bucketUnitValue = bucketUnitValue;
           this.rowNum = rowNum;
           this.callDate = callDate;
           this.usageType = usageType;
           this.locationName = locationName;
           this.phoneNumber = phoneNumber;
           this.callDuration = callDuration;
           this.airtimeAMNT = airtimeAMNT;
           this.PSTNAMNT = PSTNAMNT;
           this.totalCharges = totalCharges;
           this.caUnitType = caUnitType;
           this.caUnitValue = caUnitValue;
           this.caChannelType = caChannelType;
           this.airtimeBtu = airtimeBtu;
           this.pstnBtu = pstnBtu;
           this.debitCreditFlag = debitCreditFlag;
           this.callType = callType;
           this.callCategory = callCategory;
           this.currentBalance = currentBalance;
           this.previousBalance = previousBalance;
           this.parentUnitType = parentUnitType;
           this.parentUnitValue = parentUnitValue;
           this.taxType = taxType;
    }


    /**
     * Gets the calledCountry value for this CallDetailsType.
     * 
     * @return calledCountry
     */
    public java.lang.String getCalledCountry() {
        return calledCountry;
    }


    /**
     * Sets the calledCountry value for this CallDetailsType.
     * 
     * @param calledCountry
     */
    public void setCalledCountry(java.lang.String calledCountry) {
        this.calledCountry = calledCountry;
    }


    /**
     * Gets the numberOrAPN value for this CallDetailsType.
     * 
     * @return numberOrAPN
     */
    public java.lang.String getNumberOrAPN() {
        return numberOrAPN;
    }


    /**
     * Sets the numberOrAPN value for this CallDetailsType.
     * 
     * @param numberOrAPN
     */
    public void setNumberOrAPN(java.lang.String numberOrAPN) {
        this.numberOrAPN = numberOrAPN;
    }


    /**
     * Gets the category value for this CallDetailsType.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CallDetailsType.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the trafficDirection value for this CallDetailsType.
     * 
     * @return trafficDirection
     */
    public java.lang.String getTrafficDirection() {
        return trafficDirection;
    }


    /**
     * Sets the trafficDirection value for this CallDetailsType.
     * 
     * @param trafficDirection
     */
    public void setTrafficDirection(java.lang.String trafficDirection) {
        this.trafficDirection = trafficDirection;
    }


    /**
     * Gets the date value for this CallDetailsType.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this CallDetailsType.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the time value for this CallDetailsType.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this CallDetailsType.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the consumption value for this CallDetailsType.
     * 
     * @return consumption
     */
    public java.lang.String getConsumption() {
        return consumption;
    }


    /**
     * Sets the consumption value for this CallDetailsType.
     * 
     * @param consumption
     */
    public void setConsumption(java.lang.String consumption) {
        this.consumption = consumption;
    }


    /**
     * Gets the cost value for this CallDetailsType.
     * 
     * @return cost
     */
    public java.lang.String getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this CallDetailsType.
     * 
     * @param cost
     */
    public void setCost(java.lang.String cost) {
        this.cost = cost;
    }


    /**
     * Gets the cbsFlag value for this CallDetailsType.
     * 
     * @return cbsFlag
     */
    public java.lang.String getCbsFlag() {
        return cbsFlag;
    }


    /**
     * Sets the cbsFlag value for this CallDetailsType.
     * 
     * @param cbsFlag
     */
    public void setCbsFlag(java.lang.String cbsFlag) {
        this.cbsFlag = cbsFlag;
    }


    /**
     * Gets the msisdn value for this CallDetailsType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this CallDetailsType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the dateofchange value for this CallDetailsType.
     * 
     * @return dateofchange
     */
    public java.lang.String getDateofchange() {
        return dateofchange;
    }


    /**
     * Sets the dateofchange value for this CallDetailsType.
     * 
     * @param dateofchange
     */
    public void setDateofchange(java.lang.String dateofchange) {
        this.dateofchange = dateofchange;
    }


    /**
     * Gets the newfnfnumber value for this CallDetailsType.
     * 
     * @return newfnfnumber
     */
    public java.lang.String getNewfnfnumber() {
        return newfnfnumber;
    }


    /**
     * Sets the newfnfnumber value for this CallDetailsType.
     * 
     * @param newfnfnumber
     */
    public void setNewfnfnumber(java.lang.String newfnfnumber) {
        this.newfnfnumber = newfnfnumber;
    }


    /**
     * Gets the oldfnfnumber value for this CallDetailsType.
     * 
     * @return oldfnfnumber
     */
    public java.lang.String getOldfnfnumber() {
        return oldfnfnumber;
    }


    /**
     * Sets the oldfnfnumber value for this CallDetailsType.
     * 
     * @param oldfnfnumber
     */
    public void setOldfnfnumber(java.lang.String oldfnfnumber) {
        this.oldfnfnumber = oldfnfnumber;
    }


    /**
     * Gets the charge value for this CallDetailsType.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this CallDetailsType.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the action value for this CallDetailsType.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CallDetailsType.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the bucketId value for this CallDetailsType.
     * 
     * @return bucketId
     */
    public java.lang.String getBucketId() {
        return bucketId;
    }


    /**
     * Sets the bucketId value for this CallDetailsType.
     * 
     * @param bucketId
     */
    public void setBucketId(java.lang.String bucketId) {
        this.bucketId = bucketId;
    }


    /**
     * Gets the bucketType value for this CallDetailsType.
     * 
     * @return bucketType
     */
    public java.lang.String getBucketType() {
        return bucketType;
    }


    /**
     * Sets the bucketType value for this CallDetailsType.
     * 
     * @param bucketType
     */
    public void setBucketType(java.lang.String bucketType) {
        this.bucketType = bucketType;
    }


    /**
     * Gets the bucketUnitValue value for this CallDetailsType.
     * 
     * @return bucketUnitValue
     */
    public java.lang.String getBucketUnitValue() {
        return bucketUnitValue;
    }


    /**
     * Sets the bucketUnitValue value for this CallDetailsType.
     * 
     * @param bucketUnitValue
     */
    public void setBucketUnitValue(java.lang.String bucketUnitValue) {
        this.bucketUnitValue = bucketUnitValue;
    }


    /**
     * Gets the rowNum value for this CallDetailsType.
     * 
     * @return rowNum
     */
    public java.lang.Integer getRowNum() {
        return rowNum;
    }


    /**
     * Sets the rowNum value for this CallDetailsType.
     * 
     * @param rowNum
     */
    public void setRowNum(java.lang.Integer rowNum) {
        this.rowNum = rowNum;
    }


    /**
     * Gets the callDate value for this CallDetailsType.
     * 
     * @return callDate
     */
    public java.lang.String getCallDate() {
        return callDate;
    }


    /**
     * Sets the callDate value for this CallDetailsType.
     * 
     * @param callDate
     */
    public void setCallDate(java.lang.String callDate) {
        this.callDate = callDate;
    }


    /**
     * Gets the usageType value for this CallDetailsType.
     * 
     * @return usageType
     */
    public java.lang.String getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this CallDetailsType.
     * 
     * @param usageType
     */
    public void setUsageType(java.lang.String usageType) {
        this.usageType = usageType;
    }


    /**
     * Gets the locationName value for this CallDetailsType.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this CallDetailsType.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the phoneNumber value for this CallDetailsType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CallDetailsType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the callDuration value for this CallDetailsType.
     * 
     * @return callDuration
     */
    public java.lang.String getCallDuration() {
        return callDuration;
    }


    /**
     * Sets the callDuration value for this CallDetailsType.
     * 
     * @param callDuration
     */
    public void setCallDuration(java.lang.String callDuration) {
        this.callDuration = callDuration;
    }


    /**
     * Gets the airtimeAMNT value for this CallDetailsType.
     * 
     * @return airtimeAMNT
     */
    public java.lang.Long getAirtimeAMNT() {
        return airtimeAMNT;
    }


    /**
     * Sets the airtimeAMNT value for this CallDetailsType.
     * 
     * @param airtimeAMNT
     */
    public void setAirtimeAMNT(java.lang.Long airtimeAMNT) {
        this.airtimeAMNT = airtimeAMNT;
    }


    /**
     * Gets the PSTNAMNT value for this CallDetailsType.
     * 
     * @return PSTNAMNT
     */
    public java.lang.Long getPSTNAMNT() {
        return PSTNAMNT;
    }


    /**
     * Sets the PSTNAMNT value for this CallDetailsType.
     * 
     * @param PSTNAMNT
     */
    public void setPSTNAMNT(java.lang.Long PSTNAMNT) {
        this.PSTNAMNT = PSTNAMNT;
    }


    /**
     * Gets the totalCharges value for this CallDetailsType.
     * 
     * @return totalCharges
     */
    public java.lang.Long getTotalCharges() {
        return totalCharges;
    }


    /**
     * Sets the totalCharges value for this CallDetailsType.
     * 
     * @param totalCharges
     */
    public void setTotalCharges(java.lang.Long totalCharges) {
        this.totalCharges = totalCharges;
    }


    /**
     * Gets the caUnitType value for this CallDetailsType.
     * 
     * @return caUnitType
     */
    public java.lang.String getCaUnitType() {
        return caUnitType;
    }


    /**
     * Sets the caUnitType value for this CallDetailsType.
     * 
     * @param caUnitType
     */
    public void setCaUnitType(java.lang.String caUnitType) {
        this.caUnitType = caUnitType;
    }


    /**
     * Gets the caUnitValue value for this CallDetailsType.
     * 
     * @return caUnitValue
     */
    public java.lang.String getCaUnitValue() {
        return caUnitValue;
    }


    /**
     * Sets the caUnitValue value for this CallDetailsType.
     * 
     * @param caUnitValue
     */
    public void setCaUnitValue(java.lang.String caUnitValue) {
        this.caUnitValue = caUnitValue;
    }


    /**
     * Gets the caChannelType value for this CallDetailsType.
     * 
     * @return caChannelType
     */
    public java.lang.String getCaChannelType() {
        return caChannelType;
    }


    /**
     * Sets the caChannelType value for this CallDetailsType.
     * 
     * @param caChannelType
     */
    public void setCaChannelType(java.lang.String caChannelType) {
        this.caChannelType = caChannelType;
    }


    /**
     * Gets the airtimeBtu value for this CallDetailsType.
     * 
     * @return airtimeBtu
     */
    public java.lang.Long getAirtimeBtu() {
        return airtimeBtu;
    }


    /**
     * Sets the airtimeBtu value for this CallDetailsType.
     * 
     * @param airtimeBtu
     */
    public void setAirtimeBtu(java.lang.Long airtimeBtu) {
        this.airtimeBtu = airtimeBtu;
    }


    /**
     * Gets the pstnBtu value for this CallDetailsType.
     * 
     * @return pstnBtu
     */
    public java.lang.Long getPstnBtu() {
        return pstnBtu;
    }


    /**
     * Sets the pstnBtu value for this CallDetailsType.
     * 
     * @param pstnBtu
     */
    public void setPstnBtu(java.lang.Long pstnBtu) {
        this.pstnBtu = pstnBtu;
    }


    /**
     * Gets the debitCreditFlag value for this CallDetailsType.
     * 
     * @return debitCreditFlag
     */
    public java.lang.String getDebitCreditFlag() {
        return debitCreditFlag;
    }


    /**
     * Sets the debitCreditFlag value for this CallDetailsType.
     * 
     * @param debitCreditFlag
     */
    public void setDebitCreditFlag(java.lang.String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }


    /**
     * Gets the callType value for this CallDetailsType.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this CallDetailsType.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the callCategory value for this CallDetailsType.
     * 
     * @return callCategory
     */
    public java.lang.String getCallCategory() {
        return callCategory;
    }


    /**
     * Sets the callCategory value for this CallDetailsType.
     * 
     * @param callCategory
     */
    public void setCallCategory(java.lang.String callCategory) {
        this.callCategory = callCategory;
    }


    /**
     * Gets the currentBalance value for this CallDetailsType.
     * 
     * @return currentBalance
     */
    public java.lang.String getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this CallDetailsType.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.lang.String currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the previousBalance value for this CallDetailsType.
     * 
     * @return previousBalance
     */
    public java.lang.String getPreviousBalance() {
        return previousBalance;
    }


    /**
     * Sets the previousBalance value for this CallDetailsType.
     * 
     * @param previousBalance
     */
    public void setPreviousBalance(java.lang.String previousBalance) {
        this.previousBalance = previousBalance;
    }


    /**
     * Gets the parentUnitType value for this CallDetailsType.
     * 
     * @return parentUnitType
     */
    public java.lang.String getParentUnitType() {
        return parentUnitType;
    }


    /**
     * Sets the parentUnitType value for this CallDetailsType.
     * 
     * @param parentUnitType
     */
    public void setParentUnitType(java.lang.String parentUnitType) {
        this.parentUnitType = parentUnitType;
    }


    /**
     * Gets the parentUnitValue value for this CallDetailsType.
     * 
     * @return parentUnitValue
     */
    public java.lang.String getParentUnitValue() {
        return parentUnitValue;
    }


    /**
     * Sets the parentUnitValue value for this CallDetailsType.
     * 
     * @param parentUnitValue
     */
    public void setParentUnitValue(java.lang.String parentUnitValue) {
        this.parentUnitValue = parentUnitValue;
    }


    /**
     * Gets the taxType value for this CallDetailsType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this CallDetailsType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetailsType)) return false;
        CallDetailsType other = (CallDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calledCountry==null && other.getCalledCountry()==null) || 
             (this.calledCountry!=null &&
              this.calledCountry.equals(other.getCalledCountry()))) &&
            ((this.numberOrAPN==null && other.getNumberOrAPN()==null) || 
             (this.numberOrAPN!=null &&
              this.numberOrAPN.equals(other.getNumberOrAPN()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.trafficDirection==null && other.getTrafficDirection()==null) || 
             (this.trafficDirection!=null &&
              this.trafficDirection.equals(other.getTrafficDirection()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.consumption==null && other.getConsumption()==null) || 
             (this.consumption!=null &&
              this.consumption.equals(other.getConsumption()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.cbsFlag==null && other.getCbsFlag()==null) || 
             (this.cbsFlag!=null &&
              this.cbsFlag.equals(other.getCbsFlag()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.dateofchange==null && other.getDateofchange()==null) || 
             (this.dateofchange!=null &&
              this.dateofchange.equals(other.getDateofchange()))) &&
            ((this.newfnfnumber==null && other.getNewfnfnumber()==null) || 
             (this.newfnfnumber!=null &&
              this.newfnfnumber.equals(other.getNewfnfnumber()))) &&
            ((this.oldfnfnumber==null && other.getOldfnfnumber()==null) || 
             (this.oldfnfnumber!=null &&
              this.oldfnfnumber.equals(other.getOldfnfnumber()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.bucketId==null && other.getBucketId()==null) || 
             (this.bucketId!=null &&
              this.bucketId.equals(other.getBucketId()))) &&
            ((this.bucketType==null && other.getBucketType()==null) || 
             (this.bucketType!=null &&
              this.bucketType.equals(other.getBucketType()))) &&
            ((this.bucketUnitValue==null && other.getBucketUnitValue()==null) || 
             (this.bucketUnitValue!=null &&
              this.bucketUnitValue.equals(other.getBucketUnitValue()))) &&
            ((this.rowNum==null && other.getRowNum()==null) || 
             (this.rowNum!=null &&
              this.rowNum.equals(other.getRowNum()))) &&
            ((this.callDate==null && other.getCallDate()==null) || 
             (this.callDate!=null &&
              this.callDate.equals(other.getCallDate()))) &&
            ((this.usageType==null && other.getUsageType()==null) || 
             (this.usageType!=null &&
              this.usageType.equals(other.getUsageType()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.callDuration==null && other.getCallDuration()==null) || 
             (this.callDuration!=null &&
              this.callDuration.equals(other.getCallDuration()))) &&
            ((this.airtimeAMNT==null && other.getAirtimeAMNT()==null) || 
             (this.airtimeAMNT!=null &&
              this.airtimeAMNT.equals(other.getAirtimeAMNT()))) &&
            ((this.PSTNAMNT==null && other.getPSTNAMNT()==null) || 
             (this.PSTNAMNT!=null &&
              this.PSTNAMNT.equals(other.getPSTNAMNT()))) &&
            ((this.totalCharges==null && other.getTotalCharges()==null) || 
             (this.totalCharges!=null &&
              this.totalCharges.equals(other.getTotalCharges()))) &&
            ((this.caUnitType==null && other.getCaUnitType()==null) || 
             (this.caUnitType!=null &&
              this.caUnitType.equals(other.getCaUnitType()))) &&
            ((this.caUnitValue==null && other.getCaUnitValue()==null) || 
             (this.caUnitValue!=null &&
              this.caUnitValue.equals(other.getCaUnitValue()))) &&
            ((this.caChannelType==null && other.getCaChannelType()==null) || 
             (this.caChannelType!=null &&
              this.caChannelType.equals(other.getCaChannelType()))) &&
            ((this.airtimeBtu==null && other.getAirtimeBtu()==null) || 
             (this.airtimeBtu!=null &&
              this.airtimeBtu.equals(other.getAirtimeBtu()))) &&
            ((this.pstnBtu==null && other.getPstnBtu()==null) || 
             (this.pstnBtu!=null &&
              this.pstnBtu.equals(other.getPstnBtu()))) &&
            ((this.debitCreditFlag==null && other.getDebitCreditFlag()==null) || 
             (this.debitCreditFlag!=null &&
              this.debitCreditFlag.equals(other.getDebitCreditFlag()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.callCategory==null && other.getCallCategory()==null) || 
             (this.callCategory!=null &&
              this.callCategory.equals(other.getCallCategory()))) &&
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.previousBalance==null && other.getPreviousBalance()==null) || 
             (this.previousBalance!=null &&
              this.previousBalance.equals(other.getPreviousBalance()))) &&
            ((this.parentUnitType==null && other.getParentUnitType()==null) || 
             (this.parentUnitType!=null &&
              this.parentUnitType.equals(other.getParentUnitType()))) &&
            ((this.parentUnitValue==null && other.getParentUnitValue()==null) || 
             (this.parentUnitValue!=null &&
              this.parentUnitValue.equals(other.getParentUnitValue()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType())));
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
        if (getCalledCountry() != null) {
            _hashCode += getCalledCountry().hashCode();
        }
        if (getNumberOrAPN() != null) {
            _hashCode += getNumberOrAPN().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getTrafficDirection() != null) {
            _hashCode += getTrafficDirection().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getConsumption() != null) {
            _hashCode += getConsumption().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCbsFlag() != null) {
            _hashCode += getCbsFlag().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getDateofchange() != null) {
            _hashCode += getDateofchange().hashCode();
        }
        if (getNewfnfnumber() != null) {
            _hashCode += getNewfnfnumber().hashCode();
        }
        if (getOldfnfnumber() != null) {
            _hashCode += getOldfnfnumber().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getBucketId() != null) {
            _hashCode += getBucketId().hashCode();
        }
        if (getBucketType() != null) {
            _hashCode += getBucketType().hashCode();
        }
        if (getBucketUnitValue() != null) {
            _hashCode += getBucketUnitValue().hashCode();
        }
        if (getRowNum() != null) {
            _hashCode += getRowNum().hashCode();
        }
        if (getCallDate() != null) {
            _hashCode += getCallDate().hashCode();
        }
        if (getUsageType() != null) {
            _hashCode += getUsageType().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getCallDuration() != null) {
            _hashCode += getCallDuration().hashCode();
        }
        if (getAirtimeAMNT() != null) {
            _hashCode += getAirtimeAMNT().hashCode();
        }
        if (getPSTNAMNT() != null) {
            _hashCode += getPSTNAMNT().hashCode();
        }
        if (getTotalCharges() != null) {
            _hashCode += getTotalCharges().hashCode();
        }
        if (getCaUnitType() != null) {
            _hashCode += getCaUnitType().hashCode();
        }
        if (getCaUnitValue() != null) {
            _hashCode += getCaUnitValue().hashCode();
        }
        if (getCaChannelType() != null) {
            _hashCode += getCaChannelType().hashCode();
        }
        if (getAirtimeBtu() != null) {
            _hashCode += getAirtimeBtu().hashCode();
        }
        if (getPstnBtu() != null) {
            _hashCode += getPstnBtu().hashCode();
        }
        if (getDebitCreditFlag() != null) {
            _hashCode += getDebitCreditFlag().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getCallCategory() != null) {
            _hashCode += getCallCategory().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getPreviousBalance() != null) {
            _hashCode += getPreviousBalance().hashCode();
        }
        if (getParentUnitType() != null) {
            _hashCode += getParentUnitType().hashCode();
        }
        if (getParentUnitValue() != null) {
            _hashCode += getParentUnitValue().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CallDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "calledCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOrAPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "numberOrAPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "trafficDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "consumption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbsFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "cbsFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateofchange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dateofchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newfnfnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newfnfnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldfnfnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldfnfnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bucketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bucketType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketUnitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bucketUnitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "locationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeAMNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AirtimeAMNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTNAMNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PSTNAMNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "caUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caUnitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "caUnitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caChannelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "caChannelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeBtu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "airtimeBtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstnBtu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "pstnBtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitCreditFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "debitCreditFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "previousBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "parentUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentUnitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "parentUnitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
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
