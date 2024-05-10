/**
 * UsageDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class UsageDetailsType  implements java.io.Serializable {
    private java.lang.String callDate;

    private java.lang.String usageType;

    private java.lang.String locationName;

    private java.lang.String MSISDN;

    private java.lang.String callDuration;

    private java.lang.String airtimeAMNT;

    private java.lang.String pstnAMNT;

    private java.lang.String totalCharges;

    private java.lang.String CAUnitType;

    private java.lang.String CAUnitValue;

    private java.lang.String CAChannelType;

    private java.lang.String airtimeBTU;

    private java.lang.String pstnBTU;

    private java.lang.String cbsFlag;

    private java.lang.String bucketUsage;

    private java.lang.String debitCreditFlag;

    private java.lang.String callType;

    private java.lang.String payAsGoPlan;

    private java.lang.String volumePlan;

    private java.lang.String serviceChargeAMNT;

    private java.lang.String tax2AMNT;

    public UsageDetailsType() {
    }

    public UsageDetailsType(
           java.lang.String callDate,
           java.lang.String usageType,
           java.lang.String locationName,
           java.lang.String MSISDN,
           java.lang.String callDuration,
           java.lang.String airtimeAMNT,
           java.lang.String pstnAMNT,
           java.lang.String totalCharges,
           java.lang.String CAUnitType,
           java.lang.String CAUnitValue,
           java.lang.String CAChannelType,
           java.lang.String airtimeBTU,
           java.lang.String pstnBTU,
           java.lang.String cbsFlag,
           java.lang.String bucketUsage,
           java.lang.String debitCreditFlag,
           java.lang.String callType,
           java.lang.String payAsGoPlan,
           java.lang.String volumePlan,
           java.lang.String serviceChargeAMNT,
           java.lang.String tax2AMNT) {
           this.callDate = callDate;
           this.usageType = usageType;
           this.locationName = locationName;
           this.MSISDN = MSISDN;
           this.callDuration = callDuration;
           this.airtimeAMNT = airtimeAMNT;
           this.pstnAMNT = pstnAMNT;
           this.totalCharges = totalCharges;
           this.CAUnitType = CAUnitType;
           this.CAUnitValue = CAUnitValue;
           this.CAChannelType = CAChannelType;
           this.airtimeBTU = airtimeBTU;
           this.pstnBTU = pstnBTU;
           this.cbsFlag = cbsFlag;
           this.bucketUsage = bucketUsage;
           this.debitCreditFlag = debitCreditFlag;
           this.callType = callType;
           this.payAsGoPlan = payAsGoPlan;
           this.volumePlan = volumePlan;
           this.serviceChargeAMNT = serviceChargeAMNT;
           this.tax2AMNT = tax2AMNT;
    }


    /**
     * Gets the callDate value for this UsageDetailsType.
     * 
     * @return callDate
     */
    public java.lang.String getCallDate() {
        return callDate;
    }


    /**
     * Sets the callDate value for this UsageDetailsType.
     * 
     * @param callDate
     */
    public void setCallDate(java.lang.String callDate) {
        this.callDate = callDate;
    }


    /**
     * Gets the usageType value for this UsageDetailsType.
     * 
     * @return usageType
     */
    public java.lang.String getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this UsageDetailsType.
     * 
     * @param usageType
     */
    public void setUsageType(java.lang.String usageType) {
        this.usageType = usageType;
    }


    /**
     * Gets the locationName value for this UsageDetailsType.
     * 
     * @return locationName
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this UsageDetailsType.
     * 
     * @param locationName
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the MSISDN value for this UsageDetailsType.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this UsageDetailsType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the callDuration value for this UsageDetailsType.
     * 
     * @return callDuration
     */
    public java.lang.String getCallDuration() {
        return callDuration;
    }


    /**
     * Sets the callDuration value for this UsageDetailsType.
     * 
     * @param callDuration
     */
    public void setCallDuration(java.lang.String callDuration) {
        this.callDuration = callDuration;
    }


    /**
     * Gets the airtimeAMNT value for this UsageDetailsType.
     * 
     * @return airtimeAMNT
     */
    public java.lang.String getAirtimeAMNT() {
        return airtimeAMNT;
    }


    /**
     * Sets the airtimeAMNT value for this UsageDetailsType.
     * 
     * @param airtimeAMNT
     */
    public void setAirtimeAMNT(java.lang.String airtimeAMNT) {
        this.airtimeAMNT = airtimeAMNT;
    }


    /**
     * Gets the pstnAMNT value for this UsageDetailsType.
     * 
     * @return pstnAMNT
     */
    public java.lang.String getPstnAMNT() {
        return pstnAMNT;
    }


    /**
     * Sets the pstnAMNT value for this UsageDetailsType.
     * 
     * @param pstnAMNT
     */
    public void setPstnAMNT(java.lang.String pstnAMNT) {
        this.pstnAMNT = pstnAMNT;
    }


    /**
     * Gets the totalCharges value for this UsageDetailsType.
     * 
     * @return totalCharges
     */
    public java.lang.String getTotalCharges() {
        return totalCharges;
    }


    /**
     * Sets the totalCharges value for this UsageDetailsType.
     * 
     * @param totalCharges
     */
    public void setTotalCharges(java.lang.String totalCharges) {
        this.totalCharges = totalCharges;
    }


    /**
     * Gets the CAUnitType value for this UsageDetailsType.
     * 
     * @return CAUnitType
     */
    public java.lang.String getCAUnitType() {
        return CAUnitType;
    }


    /**
     * Sets the CAUnitType value for this UsageDetailsType.
     * 
     * @param CAUnitType
     */
    public void setCAUnitType(java.lang.String CAUnitType) {
        this.CAUnitType = CAUnitType;
    }


    /**
     * Gets the CAUnitValue value for this UsageDetailsType.
     * 
     * @return CAUnitValue
     */
    public java.lang.String getCAUnitValue() {
        return CAUnitValue;
    }


    /**
     * Sets the CAUnitValue value for this UsageDetailsType.
     * 
     * @param CAUnitValue
     */
    public void setCAUnitValue(java.lang.String CAUnitValue) {
        this.CAUnitValue = CAUnitValue;
    }


    /**
     * Gets the CAChannelType value for this UsageDetailsType.
     * 
     * @return CAChannelType
     */
    public java.lang.String getCAChannelType() {
        return CAChannelType;
    }


    /**
     * Sets the CAChannelType value for this UsageDetailsType.
     * 
     * @param CAChannelType
     */
    public void setCAChannelType(java.lang.String CAChannelType) {
        this.CAChannelType = CAChannelType;
    }


    /**
     * Gets the airtimeBTU value for this UsageDetailsType.
     * 
     * @return airtimeBTU
     */
    public java.lang.String getAirtimeBTU() {
        return airtimeBTU;
    }


    /**
     * Sets the airtimeBTU value for this UsageDetailsType.
     * 
     * @param airtimeBTU
     */
    public void setAirtimeBTU(java.lang.String airtimeBTU) {
        this.airtimeBTU = airtimeBTU;
    }


    /**
     * Gets the pstnBTU value for this UsageDetailsType.
     * 
     * @return pstnBTU
     */
    public java.lang.String getPstnBTU() {
        return pstnBTU;
    }


    /**
     * Sets the pstnBTU value for this UsageDetailsType.
     * 
     * @param pstnBTU
     */
    public void setPstnBTU(java.lang.String pstnBTU) {
        this.pstnBTU = pstnBTU;
    }


    /**
     * Gets the cbsFlag value for this UsageDetailsType.
     * 
     * @return cbsFlag
     */
    public java.lang.String getCbsFlag() {
        return cbsFlag;
    }


    /**
     * Sets the cbsFlag value for this UsageDetailsType.
     * 
     * @param cbsFlag
     */
    public void setCbsFlag(java.lang.String cbsFlag) {
        this.cbsFlag = cbsFlag;
    }


    /**
     * Gets the bucketUsage value for this UsageDetailsType.
     * 
     * @return bucketUsage
     */
    public java.lang.String getBucketUsage() {
        return bucketUsage;
    }


    /**
     * Sets the bucketUsage value for this UsageDetailsType.
     * 
     * @param bucketUsage
     */
    public void setBucketUsage(java.lang.String bucketUsage) {
        this.bucketUsage = bucketUsage;
    }


    /**
     * Gets the debitCreditFlag value for this UsageDetailsType.
     * 
     * @return debitCreditFlag
     */
    public java.lang.String getDebitCreditFlag() {
        return debitCreditFlag;
    }


    /**
     * Sets the debitCreditFlag value for this UsageDetailsType.
     * 
     * @param debitCreditFlag
     */
    public void setDebitCreditFlag(java.lang.String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }


    /**
     * Gets the callType value for this UsageDetailsType.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this UsageDetailsType.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the payAsGoPlan value for this UsageDetailsType.
     * 
     * @return payAsGoPlan
     */
    public java.lang.String getPayAsGoPlan() {
        return payAsGoPlan;
    }


    /**
     * Sets the payAsGoPlan value for this UsageDetailsType.
     * 
     * @param payAsGoPlan
     */
    public void setPayAsGoPlan(java.lang.String payAsGoPlan) {
        this.payAsGoPlan = payAsGoPlan;
    }


    /**
     * Gets the volumePlan value for this UsageDetailsType.
     * 
     * @return volumePlan
     */
    public java.lang.String getVolumePlan() {
        return volumePlan;
    }


    /**
     * Sets the volumePlan value for this UsageDetailsType.
     * 
     * @param volumePlan
     */
    public void setVolumePlan(java.lang.String volumePlan) {
        this.volumePlan = volumePlan;
    }


    /**
     * Gets the serviceChargeAMNT value for this UsageDetailsType.
     * 
     * @return serviceChargeAMNT
     */
    public java.lang.String getServiceChargeAMNT() {
        return serviceChargeAMNT;
    }


    /**
     * Sets the serviceChargeAMNT value for this UsageDetailsType.
     * 
     * @param serviceChargeAMNT
     */
    public void setServiceChargeAMNT(java.lang.String serviceChargeAMNT) {
        this.serviceChargeAMNT = serviceChargeAMNT;
    }


    /**
     * Gets the tax2AMNT value for this UsageDetailsType.
     * 
     * @return tax2AMNT
     */
    public java.lang.String getTax2AMNT() {
        return tax2AMNT;
    }


    /**
     * Sets the tax2AMNT value for this UsageDetailsType.
     * 
     * @param tax2AMNT
     */
    public void setTax2AMNT(java.lang.String tax2AMNT) {
        this.tax2AMNT = tax2AMNT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageDetailsType)) return false;
        UsageDetailsType other = (UsageDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.callDate==null && other.getCallDate()==null) || 
             (this.callDate!=null &&
              this.callDate.equals(other.getCallDate()))) &&
            ((this.usageType==null && other.getUsageType()==null) || 
             (this.usageType!=null &&
              this.usageType.equals(other.getUsageType()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.callDuration==null && other.getCallDuration()==null) || 
             (this.callDuration!=null &&
              this.callDuration.equals(other.getCallDuration()))) &&
            ((this.airtimeAMNT==null && other.getAirtimeAMNT()==null) || 
             (this.airtimeAMNT!=null &&
              this.airtimeAMNT.equals(other.getAirtimeAMNT()))) &&
            ((this.pstnAMNT==null && other.getPstnAMNT()==null) || 
             (this.pstnAMNT!=null &&
              this.pstnAMNT.equals(other.getPstnAMNT()))) &&
            ((this.totalCharges==null && other.getTotalCharges()==null) || 
             (this.totalCharges!=null &&
              this.totalCharges.equals(other.getTotalCharges()))) &&
            ((this.CAUnitType==null && other.getCAUnitType()==null) || 
             (this.CAUnitType!=null &&
              this.CAUnitType.equals(other.getCAUnitType()))) &&
            ((this.CAUnitValue==null && other.getCAUnitValue()==null) || 
             (this.CAUnitValue!=null &&
              this.CAUnitValue.equals(other.getCAUnitValue()))) &&
            ((this.CAChannelType==null && other.getCAChannelType()==null) || 
             (this.CAChannelType!=null &&
              this.CAChannelType.equals(other.getCAChannelType()))) &&
            ((this.airtimeBTU==null && other.getAirtimeBTU()==null) || 
             (this.airtimeBTU!=null &&
              this.airtimeBTU.equals(other.getAirtimeBTU()))) &&
            ((this.pstnBTU==null && other.getPstnBTU()==null) || 
             (this.pstnBTU!=null &&
              this.pstnBTU.equals(other.getPstnBTU()))) &&
            ((this.cbsFlag==null && other.getCbsFlag()==null) || 
             (this.cbsFlag!=null &&
              this.cbsFlag.equals(other.getCbsFlag()))) &&
            ((this.bucketUsage==null && other.getBucketUsage()==null) || 
             (this.bucketUsage!=null &&
              this.bucketUsage.equals(other.getBucketUsage()))) &&
            ((this.debitCreditFlag==null && other.getDebitCreditFlag()==null) || 
             (this.debitCreditFlag!=null &&
              this.debitCreditFlag.equals(other.getDebitCreditFlag()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.payAsGoPlan==null && other.getPayAsGoPlan()==null) || 
             (this.payAsGoPlan!=null &&
              this.payAsGoPlan.equals(other.getPayAsGoPlan()))) &&
            ((this.volumePlan==null && other.getVolumePlan()==null) || 
             (this.volumePlan!=null &&
              this.volumePlan.equals(other.getVolumePlan()))) &&
            ((this.serviceChargeAMNT==null && other.getServiceChargeAMNT()==null) || 
             (this.serviceChargeAMNT!=null &&
              this.serviceChargeAMNT.equals(other.getServiceChargeAMNT()))) &&
            ((this.tax2AMNT==null && other.getTax2AMNT()==null) || 
             (this.tax2AMNT!=null &&
              this.tax2AMNT.equals(other.getTax2AMNT())));
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
        if (getCallDate() != null) {
            _hashCode += getCallDate().hashCode();
        }
        if (getUsageType() != null) {
            _hashCode += getUsageType().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getCallDuration() != null) {
            _hashCode += getCallDuration().hashCode();
        }
        if (getAirtimeAMNT() != null) {
            _hashCode += getAirtimeAMNT().hashCode();
        }
        if (getPstnAMNT() != null) {
            _hashCode += getPstnAMNT().hashCode();
        }
        if (getTotalCharges() != null) {
            _hashCode += getTotalCharges().hashCode();
        }
        if (getCAUnitType() != null) {
            _hashCode += getCAUnitType().hashCode();
        }
        if (getCAUnitValue() != null) {
            _hashCode += getCAUnitValue().hashCode();
        }
        if (getCAChannelType() != null) {
            _hashCode += getCAChannelType().hashCode();
        }
        if (getAirtimeBTU() != null) {
            _hashCode += getAirtimeBTU().hashCode();
        }
        if (getPstnBTU() != null) {
            _hashCode += getPstnBTU().hashCode();
        }
        if (getCbsFlag() != null) {
            _hashCode += getCbsFlag().hashCode();
        }
        if (getBucketUsage() != null) {
            _hashCode += getBucketUsage().hashCode();
        }
        if (getDebitCreditFlag() != null) {
            _hashCode += getDebitCreditFlag().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getPayAsGoPlan() != null) {
            _hashCode += getPayAsGoPlan().hashCode();
        }
        if (getVolumePlan() != null) {
            _hashCode += getVolumePlan().hashCode();
        }
        if (getServiceChargeAMNT() != null) {
            _hashCode += getServiceChargeAMNT().hashCode();
        }
        if (getTax2AMNT() != null) {
            _hashCode += getTax2AMNT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MSISDN"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "airtimeAMNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstnAMNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "pstnAMNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CAUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAUnitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CAUnitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAChannelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CAChannelType"));
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
        elemField.setFieldName("pstnBTU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "pstnBTU"));
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
        elemField.setFieldName("bucketUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bucketUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("payAsGoPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "payAsGoPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "volumePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceChargeAMNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "serviceChargeAMNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2AMNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tax2AMNT"));
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
