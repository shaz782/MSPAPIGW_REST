/**
 * SpecialTopUpRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class SpecialTopUpRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private double amountToCredit;

    private java.lang.String newValidityDate;

    private java.lang.String newGracePeriodEndDate;

    private java.lang.String newExpiryDate;

    private java.lang.String reason;

    private java.lang.String transactionId;

    public SpecialTopUpRequest() {
    }

    public SpecialTopUpRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String msisdn,
           double amountToCredit,
           java.lang.String newValidityDate,
           java.lang.String newGracePeriodEndDate,
           java.lang.String newExpiryDate,
           java.lang.String reason,
           java.lang.String transactionId) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.msisdn = msisdn;
        this.amountToCredit = amountToCredit;
        this.newValidityDate = newValidityDate;
        this.newGracePeriodEndDate = newGracePeriodEndDate;
        this.newExpiryDate = newExpiryDate;
        this.reason = reason;
        this.transactionId = transactionId;
    }


    /**
     * Gets the msisdn value for this SpecialTopUpRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SpecialTopUpRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the amountToCredit value for this SpecialTopUpRequest.
     * 
     * @return amountToCredit
     */
    public double getAmountToCredit() {
        return amountToCredit;
    }


    /**
     * Sets the amountToCredit value for this SpecialTopUpRequest.
     * 
     * @param amountToCredit
     */
    public void setAmountToCredit(double amountToCredit) {
        this.amountToCredit = amountToCredit;
    }


    /**
     * Gets the newValidityDate value for this SpecialTopUpRequest.
     * 
     * @return newValidityDate
     */
    public java.lang.String getNewValidityDate() {
        return newValidityDate;
    }


    /**
     * Sets the newValidityDate value for this SpecialTopUpRequest.
     * 
     * @param newValidityDate
     */
    public void setNewValidityDate(java.lang.String newValidityDate) {
        this.newValidityDate = newValidityDate;
    }


    /**
     * Gets the newGracePeriodEndDate value for this SpecialTopUpRequest.
     * 
     * @return newGracePeriodEndDate
     */
    public java.lang.String getNewGracePeriodEndDate() {
        return newGracePeriodEndDate;
    }


    /**
     * Sets the newGracePeriodEndDate value for this SpecialTopUpRequest.
     * 
     * @param newGracePeriodEndDate
     */
    public void setNewGracePeriodEndDate(java.lang.String newGracePeriodEndDate) {
        this.newGracePeriodEndDate = newGracePeriodEndDate;
    }


    /**
     * Gets the newExpiryDate value for this SpecialTopUpRequest.
     * 
     * @return newExpiryDate
     */
    public java.lang.String getNewExpiryDate() {
        return newExpiryDate;
    }


    /**
     * Sets the newExpiryDate value for this SpecialTopUpRequest.
     * 
     * @param newExpiryDate
     */
    public void setNewExpiryDate(java.lang.String newExpiryDate) {
        this.newExpiryDate = newExpiryDate;
    }


    /**
     * Gets the reason value for this SpecialTopUpRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this SpecialTopUpRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the transactionId value for this SpecialTopUpRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this SpecialTopUpRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpecialTopUpRequest)) return false;
        SpecialTopUpRequest other = (SpecialTopUpRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            this.amountToCredit == other.getAmountToCredit() &&
            ((this.newValidityDate==null && other.getNewValidityDate()==null) || 
             (this.newValidityDate!=null &&
              this.newValidityDate.equals(other.getNewValidityDate()))) &&
            ((this.newGracePeriodEndDate==null && other.getNewGracePeriodEndDate()==null) || 
             (this.newGracePeriodEndDate!=null &&
              this.newGracePeriodEndDate.equals(other.getNewGracePeriodEndDate()))) &&
            ((this.newExpiryDate==null && other.getNewExpiryDate()==null) || 
             (this.newExpiryDate!=null &&
              this.newExpiryDate.equals(other.getNewExpiryDate()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        _hashCode += new Double(getAmountToCredit()).hashCode();
        if (getNewValidityDate() != null) {
            _hashCode += getNewValidityDate().hashCode();
        }
        if (getNewGracePeriodEndDate() != null) {
            _hashCode += getNewGracePeriodEndDate().hashCode();
        }
        if (getNewExpiryDate() != null) {
            _hashCode += getNewExpiryDate().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpecialTopUpRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">specialTopUpRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountToCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "amountToCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "newValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGracePeriodEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "newGracePeriodEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "newExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "transactionId"));
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
