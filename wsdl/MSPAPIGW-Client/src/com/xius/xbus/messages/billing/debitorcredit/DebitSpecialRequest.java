/**
 * DebitSpecialRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class DebitSpecialRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private double amountToDebit;

    private java.lang.String newValidityDate;

    private java.lang.String newGracePeriodIEndDate;

    private java.lang.String newExpiryDate;

    private java.lang.String reason;

    public DebitSpecialRequest() {
    }

    public DebitSpecialRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String msisdn,
           double amountToDebit,
           java.lang.String newValidityDate,
           java.lang.String newGracePeriodIEndDate,
           java.lang.String newExpiryDate,
           java.lang.String reason) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.msisdn = msisdn;
        this.amountToDebit = amountToDebit;
        this.newValidityDate = newValidityDate;
        this.newGracePeriodIEndDate = newGracePeriodIEndDate;
        this.newExpiryDate = newExpiryDate;
        this.reason = reason;
    }


    /**
     * Gets the msisdn value for this DebitSpecialRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this DebitSpecialRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the amountToDebit value for this DebitSpecialRequest.
     * 
     * @return amountToDebit
     */
    public double getAmountToDebit() {
        return amountToDebit;
    }


    /**
     * Sets the amountToDebit value for this DebitSpecialRequest.
     * 
     * @param amountToDebit
     */
    public void setAmountToDebit(double amountToDebit) {
        this.amountToDebit = amountToDebit;
    }


    /**
     * Gets the newValidityDate value for this DebitSpecialRequest.
     * 
     * @return newValidityDate
     */
    public java.lang.String getNewValidityDate() {
        return newValidityDate;
    }


    /**
     * Sets the newValidityDate value for this DebitSpecialRequest.
     * 
     * @param newValidityDate
     */
    public void setNewValidityDate(java.lang.String newValidityDate) {
        this.newValidityDate = newValidityDate;
    }


    /**
     * Gets the newGracePeriodIEndDate value for this DebitSpecialRequest.
     * 
     * @return newGracePeriodIEndDate
     */
    public java.lang.String getNewGracePeriodIEndDate() {
        return newGracePeriodIEndDate;
    }


    /**
     * Sets the newGracePeriodIEndDate value for this DebitSpecialRequest.
     * 
     * @param newGracePeriodIEndDate
     */
    public void setNewGracePeriodIEndDate(java.lang.String newGracePeriodIEndDate) {
        this.newGracePeriodIEndDate = newGracePeriodIEndDate;
    }


    /**
     * Gets the newExpiryDate value for this DebitSpecialRequest.
     * 
     * @return newExpiryDate
     */
    public java.lang.String getNewExpiryDate() {
        return newExpiryDate;
    }


    /**
     * Sets the newExpiryDate value for this DebitSpecialRequest.
     * 
     * @param newExpiryDate
     */
    public void setNewExpiryDate(java.lang.String newExpiryDate) {
        this.newExpiryDate = newExpiryDate;
    }


    /**
     * Gets the reason value for this DebitSpecialRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this DebitSpecialRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitSpecialRequest)) return false;
        DebitSpecialRequest other = (DebitSpecialRequest) obj;
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
            this.amountToDebit == other.getAmountToDebit() &&
            ((this.newValidityDate==null && other.getNewValidityDate()==null) || 
             (this.newValidityDate!=null &&
              this.newValidityDate.equals(other.getNewValidityDate()))) &&
            ((this.newGracePeriodIEndDate==null && other.getNewGracePeriodIEndDate()==null) || 
             (this.newGracePeriodIEndDate!=null &&
              this.newGracePeriodIEndDate.equals(other.getNewGracePeriodIEndDate()))) &&
            ((this.newExpiryDate==null && other.getNewExpiryDate()==null) || 
             (this.newExpiryDate!=null &&
              this.newExpiryDate.equals(other.getNewExpiryDate()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        _hashCode += new Double(getAmountToDebit()).hashCode();
        if (getNewValidityDate() != null) {
            _hashCode += getNewValidityDate().hashCode();
        }
        if (getNewGracePeriodIEndDate() != null) {
            _hashCode += getNewGracePeriodIEndDate().hashCode();
        }
        if (getNewExpiryDate() != null) {
            _hashCode += getNewExpiryDate().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitSpecialRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">debitSpecialRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountToDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "amountToDebit"));
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
        elemField.setFieldName("newGracePeriodIEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "newGracePeriodIEndDate"));
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
