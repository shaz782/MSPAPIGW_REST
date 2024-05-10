/**
 * RechargeHistoryRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class RechargeHistoryRecord  implements java.io.Serializable {
    private java.lang.String topUpTimeStamp;

    private java.lang.String voucherNumber;

    private java.lang.String voucherAmount;

    private java.lang.String rechargeAmount;

    private java.lang.String adminAmount;

    private java.lang.String rentalAmount;

    private java.lang.String serviceTaxAmount;

    private java.lang.String creditAmount;

    private java.lang.String previousTariffId;

    private java.lang.String previousBalance;

    private java.lang.String creditPromoAmountSeconds;

    private java.lang.String promoType;

    private java.lang.String oldPromoAmountSeconds;

    private java.lang.String oldPromoValidityDate;

    private java.lang.String userId;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public RechargeHistoryRecord() {
    }

    public RechargeHistoryRecord(
           java.lang.String topUpTimeStamp,
           java.lang.String voucherNumber,
           java.lang.String voucherAmount,
           java.lang.String rechargeAmount,
           java.lang.String adminAmount,
           java.lang.String rentalAmount,
           java.lang.String serviceTaxAmount,
           java.lang.String creditAmount,
           java.lang.String previousTariffId,
           java.lang.String previousBalance,
           java.lang.String creditPromoAmountSeconds,
           java.lang.String promoType,
           java.lang.String oldPromoAmountSeconds,
           java.lang.String oldPromoValidityDate,
           java.lang.String userId,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.topUpTimeStamp = topUpTimeStamp;
           this.voucherNumber = voucherNumber;
           this.voucherAmount = voucherAmount;
           this.rechargeAmount = rechargeAmount;
           this.adminAmount = adminAmount;
           this.rentalAmount = rentalAmount;
           this.serviceTaxAmount = serviceTaxAmount;
           this.creditAmount = creditAmount;
           this.previousTariffId = previousTariffId;
           this.previousBalance = previousBalance;
           this.creditPromoAmountSeconds = creditPromoAmountSeconds;
           this.promoType = promoType;
           this.oldPromoAmountSeconds = oldPromoAmountSeconds;
           this.oldPromoValidityDate = oldPromoValidityDate;
           this.userId = userId;
           this.taxType = taxType;
    }


    /**
     * Gets the topUpTimeStamp value for this RechargeHistoryRecord.
     * 
     * @return topUpTimeStamp
     */
    public java.lang.String getTopUpTimeStamp() {
        return topUpTimeStamp;
    }


    /**
     * Sets the topUpTimeStamp value for this RechargeHistoryRecord.
     * 
     * @param topUpTimeStamp
     */
    public void setTopUpTimeStamp(java.lang.String topUpTimeStamp) {
        this.topUpTimeStamp = topUpTimeStamp;
    }


    /**
     * Gets the voucherNumber value for this RechargeHistoryRecord.
     * 
     * @return voucherNumber
     */
    public java.lang.String getVoucherNumber() {
        return voucherNumber;
    }


    /**
     * Sets the voucherNumber value for this RechargeHistoryRecord.
     * 
     * @param voucherNumber
     */
    public void setVoucherNumber(java.lang.String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }


    /**
     * Gets the voucherAmount value for this RechargeHistoryRecord.
     * 
     * @return voucherAmount
     */
    public java.lang.String getVoucherAmount() {
        return voucherAmount;
    }


    /**
     * Sets the voucherAmount value for this RechargeHistoryRecord.
     * 
     * @param voucherAmount
     */
    public void setVoucherAmount(java.lang.String voucherAmount) {
        this.voucherAmount = voucherAmount;
    }


    /**
     * Gets the rechargeAmount value for this RechargeHistoryRecord.
     * 
     * @return rechargeAmount
     */
    public java.lang.String getRechargeAmount() {
        return rechargeAmount;
    }


    /**
     * Sets the rechargeAmount value for this RechargeHistoryRecord.
     * 
     * @param rechargeAmount
     */
    public void setRechargeAmount(java.lang.String rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }


    /**
     * Gets the adminAmount value for this RechargeHistoryRecord.
     * 
     * @return adminAmount
     */
    public java.lang.String getAdminAmount() {
        return adminAmount;
    }


    /**
     * Sets the adminAmount value for this RechargeHistoryRecord.
     * 
     * @param adminAmount
     */
    public void setAdminAmount(java.lang.String adminAmount) {
        this.adminAmount = adminAmount;
    }


    /**
     * Gets the rentalAmount value for this RechargeHistoryRecord.
     * 
     * @return rentalAmount
     */
    public java.lang.String getRentalAmount() {
        return rentalAmount;
    }


    /**
     * Sets the rentalAmount value for this RechargeHistoryRecord.
     * 
     * @param rentalAmount
     */
    public void setRentalAmount(java.lang.String rentalAmount) {
        this.rentalAmount = rentalAmount;
    }


    /**
     * Gets the serviceTaxAmount value for this RechargeHistoryRecord.
     * 
     * @return serviceTaxAmount
     */
    public java.lang.String getServiceTaxAmount() {
        return serviceTaxAmount;
    }


    /**
     * Sets the serviceTaxAmount value for this RechargeHistoryRecord.
     * 
     * @param serviceTaxAmount
     */
    public void setServiceTaxAmount(java.lang.String serviceTaxAmount) {
        this.serviceTaxAmount = serviceTaxAmount;
    }


    /**
     * Gets the creditAmount value for this RechargeHistoryRecord.
     * 
     * @return creditAmount
     */
    public java.lang.String getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this RechargeHistoryRecord.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(java.lang.String creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the previousTariffId value for this RechargeHistoryRecord.
     * 
     * @return previousTariffId
     */
    public java.lang.String getPreviousTariffId() {
        return previousTariffId;
    }


    /**
     * Sets the previousTariffId value for this RechargeHistoryRecord.
     * 
     * @param previousTariffId
     */
    public void setPreviousTariffId(java.lang.String previousTariffId) {
        this.previousTariffId = previousTariffId;
    }


    /**
     * Gets the previousBalance value for this RechargeHistoryRecord.
     * 
     * @return previousBalance
     */
    public java.lang.String getPreviousBalance() {
        return previousBalance;
    }


    /**
     * Sets the previousBalance value for this RechargeHistoryRecord.
     * 
     * @param previousBalance
     */
    public void setPreviousBalance(java.lang.String previousBalance) {
        this.previousBalance = previousBalance;
    }


    /**
     * Gets the creditPromoAmountSeconds value for this RechargeHistoryRecord.
     * 
     * @return creditPromoAmountSeconds
     */
    public java.lang.String getCreditPromoAmountSeconds() {
        return creditPromoAmountSeconds;
    }


    /**
     * Sets the creditPromoAmountSeconds value for this RechargeHistoryRecord.
     * 
     * @param creditPromoAmountSeconds
     */
    public void setCreditPromoAmountSeconds(java.lang.String creditPromoAmountSeconds) {
        this.creditPromoAmountSeconds = creditPromoAmountSeconds;
    }


    /**
     * Gets the promoType value for this RechargeHistoryRecord.
     * 
     * @return promoType
     */
    public java.lang.String getPromoType() {
        return promoType;
    }


    /**
     * Sets the promoType value for this RechargeHistoryRecord.
     * 
     * @param promoType
     */
    public void setPromoType(java.lang.String promoType) {
        this.promoType = promoType;
    }


    /**
     * Gets the oldPromoAmountSeconds value for this RechargeHistoryRecord.
     * 
     * @return oldPromoAmountSeconds
     */
    public java.lang.String getOldPromoAmountSeconds() {
        return oldPromoAmountSeconds;
    }


    /**
     * Sets the oldPromoAmountSeconds value for this RechargeHistoryRecord.
     * 
     * @param oldPromoAmountSeconds
     */
    public void setOldPromoAmountSeconds(java.lang.String oldPromoAmountSeconds) {
        this.oldPromoAmountSeconds = oldPromoAmountSeconds;
    }


    /**
     * Gets the oldPromoValidityDate value for this RechargeHistoryRecord.
     * 
     * @return oldPromoValidityDate
     */
    public java.lang.String getOldPromoValidityDate() {
        return oldPromoValidityDate;
    }


    /**
     * Sets the oldPromoValidityDate value for this RechargeHistoryRecord.
     * 
     * @param oldPromoValidityDate
     */
    public void setOldPromoValidityDate(java.lang.String oldPromoValidityDate) {
        this.oldPromoValidityDate = oldPromoValidityDate;
    }


    /**
     * Gets the userId value for this RechargeHistoryRecord.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this RechargeHistoryRecord.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the taxType value for this RechargeHistoryRecord.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this RechargeHistoryRecord.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeHistoryRecord)) return false;
        RechargeHistoryRecord other = (RechargeHistoryRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.topUpTimeStamp==null && other.getTopUpTimeStamp()==null) || 
             (this.topUpTimeStamp!=null &&
              this.topUpTimeStamp.equals(other.getTopUpTimeStamp()))) &&
            ((this.voucherNumber==null && other.getVoucherNumber()==null) || 
             (this.voucherNumber!=null &&
              this.voucherNumber.equals(other.getVoucherNumber()))) &&
            ((this.voucherAmount==null && other.getVoucherAmount()==null) || 
             (this.voucherAmount!=null &&
              this.voucherAmount.equals(other.getVoucherAmount()))) &&
            ((this.rechargeAmount==null && other.getRechargeAmount()==null) || 
             (this.rechargeAmount!=null &&
              this.rechargeAmount.equals(other.getRechargeAmount()))) &&
            ((this.adminAmount==null && other.getAdminAmount()==null) || 
             (this.adminAmount!=null &&
              this.adminAmount.equals(other.getAdminAmount()))) &&
            ((this.rentalAmount==null && other.getRentalAmount()==null) || 
             (this.rentalAmount!=null &&
              this.rentalAmount.equals(other.getRentalAmount()))) &&
            ((this.serviceTaxAmount==null && other.getServiceTaxAmount()==null) || 
             (this.serviceTaxAmount!=null &&
              this.serviceTaxAmount.equals(other.getServiceTaxAmount()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              this.creditAmount.equals(other.getCreditAmount()))) &&
            ((this.previousTariffId==null && other.getPreviousTariffId()==null) || 
             (this.previousTariffId!=null &&
              this.previousTariffId.equals(other.getPreviousTariffId()))) &&
            ((this.previousBalance==null && other.getPreviousBalance()==null) || 
             (this.previousBalance!=null &&
              this.previousBalance.equals(other.getPreviousBalance()))) &&
            ((this.creditPromoAmountSeconds==null && other.getCreditPromoAmountSeconds()==null) || 
             (this.creditPromoAmountSeconds!=null &&
              this.creditPromoAmountSeconds.equals(other.getCreditPromoAmountSeconds()))) &&
            ((this.promoType==null && other.getPromoType()==null) || 
             (this.promoType!=null &&
              this.promoType.equals(other.getPromoType()))) &&
            ((this.oldPromoAmountSeconds==null && other.getOldPromoAmountSeconds()==null) || 
             (this.oldPromoAmountSeconds!=null &&
              this.oldPromoAmountSeconds.equals(other.getOldPromoAmountSeconds()))) &&
            ((this.oldPromoValidityDate==null && other.getOldPromoValidityDate()==null) || 
             (this.oldPromoValidityDate!=null &&
              this.oldPromoValidityDate.equals(other.getOldPromoValidityDate()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
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
        if (getTopUpTimeStamp() != null) {
            _hashCode += getTopUpTimeStamp().hashCode();
        }
        if (getVoucherNumber() != null) {
            _hashCode += getVoucherNumber().hashCode();
        }
        if (getVoucherAmount() != null) {
            _hashCode += getVoucherAmount().hashCode();
        }
        if (getRechargeAmount() != null) {
            _hashCode += getRechargeAmount().hashCode();
        }
        if (getAdminAmount() != null) {
            _hashCode += getAdminAmount().hashCode();
        }
        if (getRentalAmount() != null) {
            _hashCode += getRentalAmount().hashCode();
        }
        if (getServiceTaxAmount() != null) {
            _hashCode += getServiceTaxAmount().hashCode();
        }
        if (getCreditAmount() != null) {
            _hashCode += getCreditAmount().hashCode();
        }
        if (getPreviousTariffId() != null) {
            _hashCode += getPreviousTariffId().hashCode();
        }
        if (getPreviousBalance() != null) {
            _hashCode += getPreviousBalance().hashCode();
        }
        if (getCreditPromoAmountSeconds() != null) {
            _hashCode += getCreditPromoAmountSeconds().hashCode();
        }
        if (getPromoType() != null) {
            _hashCode += getPromoType().hashCode();
        }
        if (getOldPromoAmountSeconds() != null) {
            _hashCode += getOldPromoAmountSeconds().hashCode();
        }
        if (getOldPromoValidityDate() != null) {
            _hashCode += getOldPromoValidityDate().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeHistoryRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "topUpTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rechargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "adminAmount"));
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
        elemField.setFieldName("serviceTaxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "serviceTaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousTariffId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "previousTariffId"));
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
        elemField.setFieldName("creditPromoAmountSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditPromoAmountSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "promoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPromoAmountSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldPromoAmountSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPromoValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldPromoValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userId"));
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
