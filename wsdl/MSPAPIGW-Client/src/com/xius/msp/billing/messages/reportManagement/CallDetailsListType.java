/**
 * CallDetailsListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class CallDetailsListType  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String CDRId;

    private java.lang.String callDate;

    private java.lang.String callDuration;

    private java.lang.String airTimeAmount;

    private java.lang.String pstnAmount;

    private java.lang.String APartyNo;

    private java.lang.String BPartyNo;

    private java.lang.String callTerminating;

    private java.lang.String DATA;

    private java.lang.String roaming;

    private java.lang.String connectCharge;

    private java.lang.String smsCharge;

    private java.lang.String APartyCellId;

    private java.lang.String visitNetworkName;

    private java.lang.String locationName;

    private java.lang.String promoAirtimeCharge;

    private java.lang.String promoPSTNCharge;

    private java.lang.String promoTotalDuration;

    private java.lang.String promoVolume;

    private java.lang.String rentalDate;

    private java.lang.String rentalPeriod;

    private java.lang.String rentalAmount;

    private java.lang.String slabName;

    private java.lang.String pulseSecs;

    private java.lang.String pulseAmount;

    private java.lang.String airtimeBTU;

    private java.lang.String PSTNBTU;

    private java.lang.String CBSFlag;

    private java.lang.String serviceName;

    private java.lang.String serviceTax;

    private java.lang.String bucketName;

    private java.lang.String bucketId;

    private java.lang.String bucketType;

    private java.lang.String bucketUnitValue;

    private java.lang.String homeZoneLocation;

    private java.lang.String fnf;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public CallDetailsListType() {
    }

    public CallDetailsListType(
           java.lang.String MSISDN,
           java.lang.String CDRId,
           java.lang.String callDate,
           java.lang.String callDuration,
           java.lang.String airTimeAmount,
           java.lang.String pstnAmount,
           java.lang.String APartyNo,
           java.lang.String BPartyNo,
           java.lang.String callTerminating,
           java.lang.String DATA,
           java.lang.String roaming,
           java.lang.String connectCharge,
           java.lang.String smsCharge,
           java.lang.String APartyCellId,
           java.lang.String visitNetworkName,
           java.lang.String locationName,
           java.lang.String promoAirtimeCharge,
           java.lang.String promoPSTNCharge,
           java.lang.String promoTotalDuration,
           java.lang.String promoVolume,
           java.lang.String rentalDate,
           java.lang.String rentalPeriod,
           java.lang.String rentalAmount,
           java.lang.String slabName,
           java.lang.String pulseSecs,
           java.lang.String pulseAmount,
           java.lang.String airtimeBTU,
           java.lang.String PSTNBTU,
           java.lang.String CBSFlag,
           java.lang.String serviceName,
           java.lang.String serviceTax,
           java.lang.String bucketName,
           java.lang.String bucketId,
           java.lang.String bucketType,
           java.lang.String bucketUnitValue,
           java.lang.String homeZoneLocation,
           java.lang.String fnf,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.MSISDN = MSISDN;
           this.CDRId = CDRId;
           this.callDate = callDate;
           this.callDuration = callDuration;
           this.airTimeAmount = airTimeAmount;
           this.pstnAmount = pstnAmount;
           this.APartyNo = APartyNo;
           this.BPartyNo = BPartyNo;
           this.callTerminating = callTerminating;
           this.DATA = DATA;
           this.roaming = roaming;
           this.connectCharge = connectCharge;
           this.smsCharge = smsCharge;
           this.APartyCellId = APartyCellId;
           this.visitNetworkName = visitNetworkName;
           this.locationName = locationName;
           this.promoAirtimeCharge = promoAirtimeCharge;
           this.promoPSTNCharge = promoPSTNCharge;
           this.promoTotalDuration = promoTotalDuration;
           this.promoVolume = promoVolume;
           this.rentalDate = rentalDate;
           this.rentalPeriod = rentalPeriod;
           this.rentalAmount = rentalAmount;
           this.slabName = slabName;
           this.pulseSecs = pulseSecs;
           this.pulseAmount = pulseAmount;
           this.airtimeBTU = airtimeBTU;
           this.PSTNBTU = PSTNBTU;
           this.CBSFlag = CBSFlag;
           this.serviceName = serviceName;
           this.serviceTax = serviceTax;
           this.bucketName = bucketName;
           this.bucketId = bucketId;
           this.bucketType = bucketType;
           this.bucketUnitValue = bucketUnitValue;
           this.homeZoneLocation = homeZoneLocation;
           this.fnf = fnf;
           this.taxType = taxType;
    }


    /**
     * Gets the MSISDN value for this CallDetailsListType.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this CallDetailsListType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the CDRId value for this CallDetailsListType.
     * 
     * @return CDRId
     */
    public java.lang.String getCDRId() {
        return CDRId;
    }


    /**
     * Sets the CDRId value for this CallDetailsListType.
     * 
     * @param CDRId
     */
    public void setCDRId(java.lang.String CDRId) {
        this.CDRId = CDRId;
    }


    /**
     * Gets the callDate value for this CallDetailsListType.
     * 
     * @return callDate
     */
    public java.lang.String getCallDate() {
        return callDate;
    }


    /**
     * Sets the callDate value for this CallDetailsListType.
     * 
     * @param callDate
     */
    public void setCallDate(java.lang.String callDate) {
        this.callDate = callDate;
    }


    /**
     * Gets the callDuration value for this CallDetailsListType.
     * 
     * @return callDuration
     */
    public java.lang.String getCallDuration() {
        return callDuration;
    }


    /**
     * Sets the callDuration value for this CallDetailsListType.
     * 
     * @param callDuration
     */
    public void setCallDuration(java.lang.String callDuration) {
        this.callDuration = callDuration;
    }


    /**
     * Gets the airTimeAmount value for this CallDetailsListType.
     * 
     * @return airTimeAmount
     */
    public java.lang.String getAirTimeAmount() {
        return airTimeAmount;
    }


    /**
     * Sets the airTimeAmount value for this CallDetailsListType.
     * 
     * @param airTimeAmount
     */
    public void setAirTimeAmount(java.lang.String airTimeAmount) {
        this.airTimeAmount = airTimeAmount;
    }


    /**
     * Gets the pstnAmount value for this CallDetailsListType.
     * 
     * @return pstnAmount
     */
    public java.lang.String getPstnAmount() {
        return pstnAmount;
    }


    /**
     * Sets the pstnAmount value for this CallDetailsListType.
     * 
     * @param pstnAmount
     */
    public void setPstnAmount(java.lang.String pstnAmount) {
        this.pstnAmount = pstnAmount;
    }


    /**
     * Gets the APartyNo value for this CallDetailsListType.
     * 
     * @return APartyNo
     */
    public java.lang.String getAPartyNo() {
        return APartyNo;
    }


    /**
     * Sets the APartyNo value for this CallDetailsListType.
     * 
     * @param APartyNo
     */
    public void setAPartyNo(java.lang.String APartyNo) {
        this.APartyNo = APartyNo;
    }


    /**
     * Gets the BPartyNo value for this CallDetailsListType.
     * 
     * @return BPartyNo
     */
    public java.lang.String getBPartyNo() {
        return BPartyNo;
    }


    /**
     * Sets the BPartyNo value for this CallDetailsListType.
     * 
     * @param BPartyNo
     */
    public void setBPartyNo(java.lang.String BPartyNo) {
        this.BPartyNo = BPartyNo;
    }


    /**
     * Gets the callTerminating value for this CallDetailsListType.
     * 
     * @return callTerminating
     */
    public java.lang.String getCallTerminating() {
        return callTerminating;
    }


    /**
     * Sets the callTerminating value for this CallDetailsListType.
     * 
     * @param callTerminating
     */
    public void setCallTerminating(java.lang.String callTerminating) {
        this.callTerminating = callTerminating;
    }


    /**
     * Gets the DATA value for this CallDetailsListType.
     * 
     * @return DATA
     */
    public java.lang.String getDATA() {
        return DATA;
    }


    /**
     * Sets the DATA value for this CallDetailsListType.
     * 
     * @param DATA
     */
    public void setDATA(java.lang.String DATA) {
        this.DATA = DATA;
    }


    /**
     * Gets the roaming value for this CallDetailsListType.
     * 
     * @return roaming
     */
    public java.lang.String getRoaming() {
        return roaming;
    }


    /**
     * Sets the roaming value for this CallDetailsListType.
     * 
     * @param roaming
     */
    public void setRoaming(java.lang.String roaming) {
        this.roaming = roaming;
    }


    /**
     * Gets the connectCharge value for this CallDetailsListType.
     * 
     * @return connectCharge
     */
    public java.lang.String getConnectCharge() {
        return connectCharge;
    }


    /**
     * Sets the connectCharge value for this CallDetailsListType.
     * 
     * @param connectCharge
     */
    public void setConnectCharge(java.lang.String connectCharge) {
        this.connectCharge = connectCharge;
    }


    /**
     * Gets the smsCharge value for this CallDetailsListType.
     * 
     * @return smsCharge
     */
    public java.lang.String getSmsCharge() {
        return smsCharge;
    }


    /**
     * Sets the smsCharge value for this CallDetailsListType.
     * 
     * @param smsCharge
     */
    public void setSmsCharge(java.lang.String smsCharge) {
        this.smsCharge = smsCharge;
    }


    /**
     * Gets the APartyCellId value for this CallDetailsListType.
     * 
     * @return APartyCellId
     */
    public java.lang.String getAPartyCellId() {
        return APartyCellId;
    }


    /**
     * Sets the APartyCellId value for this CallDetailsListType.
     * 
     * @param APartyCellId
     */
    public void setAPartyCellId(java.lang.String APartyCellId) {
        this.APartyCellId = APartyCellId;
    }


    /**
     * Gets the visitNetworkName value for this CallDetailsListType.
     * 
     * @return visitNetworkName
     */
    public java.lang.String getVisitNetworkName() {
        return visitNetworkName;
    }


    /**
     * Sets the visitNetworkName value for this CallDetailsListType.
     * 
     * @param visitNetworkName
     */
    public void setVisitNetworkName(java.lang.String visitNetworkName) {
        this.visitNetworkName = visitNetworkName;
    }


    /**
     * Gets the locationName value for this CallDetailsListType.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this CallDetailsListType.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the promoAirtimeCharge value for this CallDetailsListType.
     * 
     * @return promoAirtimeCharge
     */
    public java.lang.String getPromoAirtimeCharge() {
        return promoAirtimeCharge;
    }


    /**
     * Sets the promoAirtimeCharge value for this CallDetailsListType.
     * 
     * @param promoAirtimeCharge
     */
    public void setPromoAirtimeCharge(java.lang.String promoAirtimeCharge) {
        this.promoAirtimeCharge = promoAirtimeCharge;
    }


    /**
     * Gets the promoPSTNCharge value for this CallDetailsListType.
     * 
     * @return promoPSTNCharge
     */
    public java.lang.String getPromoPSTNCharge() {
        return promoPSTNCharge;
    }


    /**
     * Sets the promoPSTNCharge value for this CallDetailsListType.
     * 
     * @param promoPSTNCharge
     */
    public void setPromoPSTNCharge(java.lang.String promoPSTNCharge) {
        this.promoPSTNCharge = promoPSTNCharge;
    }


    /**
     * Gets the promoTotalDuration value for this CallDetailsListType.
     * 
     * @return promoTotalDuration
     */
    public java.lang.String getPromoTotalDuration() {
        return promoTotalDuration;
    }


    /**
     * Sets the promoTotalDuration value for this CallDetailsListType.
     * 
     * @param promoTotalDuration
     */
    public void setPromoTotalDuration(java.lang.String promoTotalDuration) {
        this.promoTotalDuration = promoTotalDuration;
    }


    /**
     * Gets the promoVolume value for this CallDetailsListType.
     * 
     * @return promoVolume
     */
    public java.lang.String getPromoVolume() {
        return promoVolume;
    }


    /**
     * Sets the promoVolume value for this CallDetailsListType.
     * 
     * @param promoVolume
     */
    public void setPromoVolume(java.lang.String promoVolume) {
        this.promoVolume = promoVolume;
    }


    /**
     * Gets the rentalDate value for this CallDetailsListType.
     * 
     * @return rentalDate
     */
    public java.lang.String getRentalDate() {
        return rentalDate;
    }


    /**
     * Sets the rentalDate value for this CallDetailsListType.
     * 
     * @param rentalDate
     */
    public void setRentalDate(java.lang.String rentalDate) {
        this.rentalDate = rentalDate;
    }


    /**
     * Gets the rentalPeriod value for this CallDetailsListType.
     * 
     * @return rentalPeriod
     */
    public java.lang.String getRentalPeriod() {
        return rentalPeriod;
    }


    /**
     * Sets the rentalPeriod value for this CallDetailsListType.
     * 
     * @param rentalPeriod
     */
    public void setRentalPeriod(java.lang.String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }


    /**
     * Gets the rentalAmount value for this CallDetailsListType.
     * 
     * @return rentalAmount
     */
    public java.lang.String getRentalAmount() {
        return rentalAmount;
    }


    /**
     * Sets the rentalAmount value for this CallDetailsListType.
     * 
     * @param rentalAmount
     */
    public void setRentalAmount(java.lang.String rentalAmount) {
        this.rentalAmount = rentalAmount;
    }


    /**
     * Gets the slabName value for this CallDetailsListType.
     * 
     * @return slabName
     */
    public java.lang.String getSlabName() {
        return slabName;
    }


    /**
     * Sets the slabName value for this CallDetailsListType.
     * 
     * @param slabName
     */
    public void setSlabName(java.lang.String slabName) {
        this.slabName = slabName;
    }


    /**
     * Gets the pulseSecs value for this CallDetailsListType.
     * 
     * @return pulseSecs
     */
    public java.lang.String getPulseSecs() {
        return pulseSecs;
    }


    /**
     * Sets the pulseSecs value for this CallDetailsListType.
     * 
     * @param pulseSecs
     */
    public void setPulseSecs(java.lang.String pulseSecs) {
        this.pulseSecs = pulseSecs;
    }


    /**
     * Gets the pulseAmount value for this CallDetailsListType.
     * 
     * @return pulseAmount
     */
    public java.lang.String getPulseAmount() {
        return pulseAmount;
    }


    /**
     * Sets the pulseAmount value for this CallDetailsListType.
     * 
     * @param pulseAmount
     */
    public void setPulseAmount(java.lang.String pulseAmount) {
        this.pulseAmount = pulseAmount;
    }


    /**
     * Gets the airtimeBTU value for this CallDetailsListType.
     * 
     * @return airtimeBTU
     */
    public java.lang.String getAirtimeBTU() {
        return airtimeBTU;
    }


    /**
     * Sets the airtimeBTU value for this CallDetailsListType.
     * 
     * @param airtimeBTU
     */
    public void setAirtimeBTU(java.lang.String airtimeBTU) {
        this.airtimeBTU = airtimeBTU;
    }


    /**
     * Gets the PSTNBTU value for this CallDetailsListType.
     * 
     * @return PSTNBTU
     */
    public java.lang.String getPSTNBTU() {
        return PSTNBTU;
    }


    /**
     * Sets the PSTNBTU value for this CallDetailsListType.
     * 
     * @param PSTNBTU
     */
    public void setPSTNBTU(java.lang.String PSTNBTU) {
        this.PSTNBTU = PSTNBTU;
    }


    /**
     * Gets the CBSFlag value for this CallDetailsListType.
     * 
     * @return CBSFlag
     */
    public java.lang.String getCBSFlag() {
        return CBSFlag;
    }


    /**
     * Sets the CBSFlag value for this CallDetailsListType.
     * 
     * @param CBSFlag
     */
    public void setCBSFlag(java.lang.String CBSFlag) {
        this.CBSFlag = CBSFlag;
    }


    /**
     * Gets the serviceName value for this CallDetailsListType.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this CallDetailsListType.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the serviceTax value for this CallDetailsListType.
     * 
     * @return serviceTax
     */
    public java.lang.String getServiceTax() {
        return serviceTax;
    }


    /**
     * Sets the serviceTax value for this CallDetailsListType.
     * 
     * @param serviceTax
     */
    public void setServiceTax(java.lang.String serviceTax) {
        this.serviceTax = serviceTax;
    }


    /**
     * Gets the bucketName value for this CallDetailsListType.
     * 
     * @return bucketName
     */
    public java.lang.String getBucketName() {
        return bucketName;
    }


    /**
     * Sets the bucketName value for this CallDetailsListType.
     * 
     * @param bucketName
     */
    public void setBucketName(java.lang.String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * Gets the bucketId value for this CallDetailsListType.
     * 
     * @return bucketId
     */
    public java.lang.String getBucketId() {
        return bucketId;
    }


    /**
     * Sets the bucketId value for this CallDetailsListType.
     * 
     * @param bucketId
     */
    public void setBucketId(java.lang.String bucketId) {
        this.bucketId = bucketId;
    }


    /**
     * Gets the bucketType value for this CallDetailsListType.
     * 
     * @return bucketType
     */
    public java.lang.String getBucketType() {
        return bucketType;
    }


    /**
     * Sets the bucketType value for this CallDetailsListType.
     * 
     * @param bucketType
     */
    public void setBucketType(java.lang.String bucketType) {
        this.bucketType = bucketType;
    }


    /**
     * Gets the bucketUnitValue value for this CallDetailsListType.
     * 
     * @return bucketUnitValue
     */
    public java.lang.String getBucketUnitValue() {
        return bucketUnitValue;
    }


    /**
     * Sets the bucketUnitValue value for this CallDetailsListType.
     * 
     * @param bucketUnitValue
     */
    public void setBucketUnitValue(java.lang.String bucketUnitValue) {
        this.bucketUnitValue = bucketUnitValue;
    }


    /**
     * Gets the homeZoneLocation value for this CallDetailsListType.
     * 
     * @return homeZoneLocation
     */
    public java.lang.String getHomeZoneLocation() {
        return homeZoneLocation;
    }


    /**
     * Sets the homeZoneLocation value for this CallDetailsListType.
     * 
     * @param homeZoneLocation
     */
    public void setHomeZoneLocation(java.lang.String homeZoneLocation) {
        this.homeZoneLocation = homeZoneLocation;
    }


    /**
     * Gets the fnf value for this CallDetailsListType.
     * 
     * @return fnf
     */
    public java.lang.String getFnf() {
        return fnf;
    }


    /**
     * Sets the fnf value for this CallDetailsListType.
     * 
     * @param fnf
     */
    public void setFnf(java.lang.String fnf) {
        this.fnf = fnf;
    }


    /**
     * Gets the taxType value for this CallDetailsListType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this CallDetailsListType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetailsListType)) return false;
        CallDetailsListType other = (CallDetailsListType) obj;
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
            ((this.CDRId==null && other.getCDRId()==null) || 
             (this.CDRId!=null &&
              this.CDRId.equals(other.getCDRId()))) &&
            ((this.callDate==null && other.getCallDate()==null) || 
             (this.callDate!=null &&
              this.callDate.equals(other.getCallDate()))) &&
            ((this.callDuration==null && other.getCallDuration()==null) || 
             (this.callDuration!=null &&
              this.callDuration.equals(other.getCallDuration()))) &&
            ((this.airTimeAmount==null && other.getAirTimeAmount()==null) || 
             (this.airTimeAmount!=null &&
              this.airTimeAmount.equals(other.getAirTimeAmount()))) &&
            ((this.pstnAmount==null && other.getPstnAmount()==null) || 
             (this.pstnAmount!=null &&
              this.pstnAmount.equals(other.getPstnAmount()))) &&
            ((this.APartyNo==null && other.getAPartyNo()==null) || 
             (this.APartyNo!=null &&
              this.APartyNo.equals(other.getAPartyNo()))) &&
            ((this.BPartyNo==null && other.getBPartyNo()==null) || 
             (this.BPartyNo!=null &&
              this.BPartyNo.equals(other.getBPartyNo()))) &&
            ((this.callTerminating==null && other.getCallTerminating()==null) || 
             (this.callTerminating!=null &&
              this.callTerminating.equals(other.getCallTerminating()))) &&
            ((this.DATA==null && other.getDATA()==null) || 
             (this.DATA!=null &&
              this.DATA.equals(other.getDATA()))) &&
            ((this.roaming==null && other.getRoaming()==null) || 
             (this.roaming!=null &&
              this.roaming.equals(other.getRoaming()))) &&
            ((this.connectCharge==null && other.getConnectCharge()==null) || 
             (this.connectCharge!=null &&
              this.connectCharge.equals(other.getConnectCharge()))) &&
            ((this.smsCharge==null && other.getSmsCharge()==null) || 
             (this.smsCharge!=null &&
              this.smsCharge.equals(other.getSmsCharge()))) &&
            ((this.APartyCellId==null && other.getAPartyCellId()==null) || 
             (this.APartyCellId!=null &&
              this.APartyCellId.equals(other.getAPartyCellId()))) &&
            ((this.visitNetworkName==null && other.getVisitNetworkName()==null) || 
             (this.visitNetworkName!=null &&
              this.visitNetworkName.equals(other.getVisitNetworkName()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.promoAirtimeCharge==null && other.getPromoAirtimeCharge()==null) || 
             (this.promoAirtimeCharge!=null &&
              this.promoAirtimeCharge.equals(other.getPromoAirtimeCharge()))) &&
            ((this.promoPSTNCharge==null && other.getPromoPSTNCharge()==null) || 
             (this.promoPSTNCharge!=null &&
              this.promoPSTNCharge.equals(other.getPromoPSTNCharge()))) &&
            ((this.promoTotalDuration==null && other.getPromoTotalDuration()==null) || 
             (this.promoTotalDuration!=null &&
              this.promoTotalDuration.equals(other.getPromoTotalDuration()))) &&
            ((this.promoVolume==null && other.getPromoVolume()==null) || 
             (this.promoVolume!=null &&
              this.promoVolume.equals(other.getPromoVolume()))) &&
            ((this.rentalDate==null && other.getRentalDate()==null) || 
             (this.rentalDate!=null &&
              this.rentalDate.equals(other.getRentalDate()))) &&
            ((this.rentalPeriod==null && other.getRentalPeriod()==null) || 
             (this.rentalPeriod!=null &&
              this.rentalPeriod.equals(other.getRentalPeriod()))) &&
            ((this.rentalAmount==null && other.getRentalAmount()==null) || 
             (this.rentalAmount!=null &&
              this.rentalAmount.equals(other.getRentalAmount()))) &&
            ((this.slabName==null && other.getSlabName()==null) || 
             (this.slabName!=null &&
              this.slabName.equals(other.getSlabName()))) &&
            ((this.pulseSecs==null && other.getPulseSecs()==null) || 
             (this.pulseSecs!=null &&
              this.pulseSecs.equals(other.getPulseSecs()))) &&
            ((this.pulseAmount==null && other.getPulseAmount()==null) || 
             (this.pulseAmount!=null &&
              this.pulseAmount.equals(other.getPulseAmount()))) &&
            ((this.airtimeBTU==null && other.getAirtimeBTU()==null) || 
             (this.airtimeBTU!=null &&
              this.airtimeBTU.equals(other.getAirtimeBTU()))) &&
            ((this.PSTNBTU==null && other.getPSTNBTU()==null) || 
             (this.PSTNBTU!=null &&
              this.PSTNBTU.equals(other.getPSTNBTU()))) &&
            ((this.CBSFlag==null && other.getCBSFlag()==null) || 
             (this.CBSFlag!=null &&
              this.CBSFlag.equals(other.getCBSFlag()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.serviceTax==null && other.getServiceTax()==null) || 
             (this.serviceTax!=null &&
              this.serviceTax.equals(other.getServiceTax()))) &&
            ((this.bucketName==null && other.getBucketName()==null) || 
             (this.bucketName!=null &&
              this.bucketName.equals(other.getBucketName()))) &&
            ((this.bucketId==null && other.getBucketId()==null) || 
             (this.bucketId!=null &&
              this.bucketId.equals(other.getBucketId()))) &&
            ((this.bucketType==null && other.getBucketType()==null) || 
             (this.bucketType!=null &&
              this.bucketType.equals(other.getBucketType()))) &&
            ((this.bucketUnitValue==null && other.getBucketUnitValue()==null) || 
             (this.bucketUnitValue!=null &&
              this.bucketUnitValue.equals(other.getBucketUnitValue()))) &&
            ((this.homeZoneLocation==null && other.getHomeZoneLocation()==null) || 
             (this.homeZoneLocation!=null &&
              this.homeZoneLocation.equals(other.getHomeZoneLocation()))) &&
            ((this.fnf==null && other.getFnf()==null) || 
             (this.fnf!=null &&
              this.fnf.equals(other.getFnf()))) &&
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getCDRId() != null) {
            _hashCode += getCDRId().hashCode();
        }
        if (getCallDate() != null) {
            _hashCode += getCallDate().hashCode();
        }
        if (getCallDuration() != null) {
            _hashCode += getCallDuration().hashCode();
        }
        if (getAirTimeAmount() != null) {
            _hashCode += getAirTimeAmount().hashCode();
        }
        if (getPstnAmount() != null) {
            _hashCode += getPstnAmount().hashCode();
        }
        if (getAPartyNo() != null) {
            _hashCode += getAPartyNo().hashCode();
        }
        if (getBPartyNo() != null) {
            _hashCode += getBPartyNo().hashCode();
        }
        if (getCallTerminating() != null) {
            _hashCode += getCallTerminating().hashCode();
        }
        if (getDATA() != null) {
            _hashCode += getDATA().hashCode();
        }
        if (getRoaming() != null) {
            _hashCode += getRoaming().hashCode();
        }
        if (getConnectCharge() != null) {
            _hashCode += getConnectCharge().hashCode();
        }
        if (getSmsCharge() != null) {
            _hashCode += getSmsCharge().hashCode();
        }
        if (getAPartyCellId() != null) {
            _hashCode += getAPartyCellId().hashCode();
        }
        if (getVisitNetworkName() != null) {
            _hashCode += getVisitNetworkName().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getPromoAirtimeCharge() != null) {
            _hashCode += getPromoAirtimeCharge().hashCode();
        }
        if (getPromoPSTNCharge() != null) {
            _hashCode += getPromoPSTNCharge().hashCode();
        }
        if (getPromoTotalDuration() != null) {
            _hashCode += getPromoTotalDuration().hashCode();
        }
        if (getPromoVolume() != null) {
            _hashCode += getPromoVolume().hashCode();
        }
        if (getRentalDate() != null) {
            _hashCode += getRentalDate().hashCode();
        }
        if (getRentalPeriod() != null) {
            _hashCode += getRentalPeriod().hashCode();
        }
        if (getRentalAmount() != null) {
            _hashCode += getRentalAmount().hashCode();
        }
        if (getSlabName() != null) {
            _hashCode += getSlabName().hashCode();
        }
        if (getPulseSecs() != null) {
            _hashCode += getPulseSecs().hashCode();
        }
        if (getPulseAmount() != null) {
            _hashCode += getPulseAmount().hashCode();
        }
        if (getAirtimeBTU() != null) {
            _hashCode += getAirtimeBTU().hashCode();
        }
        if (getPSTNBTU() != null) {
            _hashCode += getPSTNBTU().hashCode();
        }
        if (getCBSFlag() != null) {
            _hashCode += getCBSFlag().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getServiceTax() != null) {
            _hashCode += getServiceTax().hashCode();
        }
        if (getBucketName() != null) {
            _hashCode += getBucketName().hashCode();
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
        if (getHomeZoneLocation() != null) {
            _hashCode += getHomeZoneLocation().hashCode();
        }
        if (getFnf() != null) {
            _hashCode += getFnf().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetailsListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CallDetailsListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDRId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CDRId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("callDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTimeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "airTimeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstnAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "pstnAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APartyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "APartyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BPartyNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "BPartyNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callTerminating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callTerminating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roaming");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "roaming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "connectCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "smsCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APartyCellId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "APartyCellId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitNetworkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "visitNetworkName"));
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
        elemField.setFieldName("promoAirtimeCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "promoAirtimeCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoPSTNCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "promoPSTNCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoTotalDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "promoTotalDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "promoVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rentalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rentalPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rentalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rentalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slabName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "slabName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pulseSecs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "pulseSecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pulseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "pulseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeBTU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "airtimeBTU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTNBTU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PSTNBTU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CBSFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CBSFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "serviceTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bucketName"));
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
        elemField.setFieldName("homeZoneLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "homeZoneLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fnf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "fnf"));
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
