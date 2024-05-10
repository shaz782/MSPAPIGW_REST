/**
 * CreditProfileDtlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class CreditProfileDtlType  implements java.io.Serializable {
    private java.lang.String creditProfileId;

    private java.lang.String creditProfileName;

    private java.lang.String creditLimit;

    private java.lang.String maxCreditLimit;

    public CreditProfileDtlType() {
    }

    public CreditProfileDtlType(
           java.lang.String creditProfileId,
           java.lang.String creditProfileName,
           java.lang.String creditLimit,
           java.lang.String maxCreditLimit) {
           this.creditProfileId = creditProfileId;
           this.creditProfileName = creditProfileName;
           this.creditLimit = creditLimit;
           this.maxCreditLimit = maxCreditLimit;
    }


    /**
     * Gets the creditProfileId value for this CreditProfileDtlType.
     * 
     * @return creditProfileId
     */
    public java.lang.String getCreditProfileId() {
        return creditProfileId;
    }


    /**
     * Sets the creditProfileId value for this CreditProfileDtlType.
     * 
     * @param creditProfileId
     */
    public void setCreditProfileId(java.lang.String creditProfileId) {
        this.creditProfileId = creditProfileId;
    }


    /**
     * Gets the creditProfileName value for this CreditProfileDtlType.
     * 
     * @return creditProfileName
     */
    public java.lang.String getCreditProfileName() {
        return creditProfileName;
    }


    /**
     * Sets the creditProfileName value for this CreditProfileDtlType.
     * 
     * @param creditProfileName
     */
    public void setCreditProfileName(java.lang.String creditProfileName) {
        this.creditProfileName = creditProfileName;
    }


    /**
     * Gets the creditLimit value for this CreditProfileDtlType.
     * 
     * @return creditLimit
     */
    public java.lang.String getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this CreditProfileDtlType.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.String creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the maxCreditLimit value for this CreditProfileDtlType.
     * 
     * @return maxCreditLimit
     */
    public java.lang.String getMaxCreditLimit() {
        return maxCreditLimit;
    }


    /**
     * Sets the maxCreditLimit value for this CreditProfileDtlType.
     * 
     * @param maxCreditLimit
     */
    public void setMaxCreditLimit(java.lang.String maxCreditLimit) {
        this.maxCreditLimit = maxCreditLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditProfileDtlType)) return false;
        CreditProfileDtlType other = (CreditProfileDtlType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditProfileId==null && other.getCreditProfileId()==null) || 
             (this.creditProfileId!=null &&
              this.creditProfileId.equals(other.getCreditProfileId()))) &&
            ((this.creditProfileName==null && other.getCreditProfileName()==null) || 
             (this.creditProfileName!=null &&
              this.creditProfileName.equals(other.getCreditProfileName()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.maxCreditLimit==null && other.getMaxCreditLimit()==null) || 
             (this.maxCreditLimit!=null &&
              this.maxCreditLimit.equals(other.getMaxCreditLimit())));
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
        if (getCreditProfileId() != null) {
            _hashCode += getCreditProfileId().hashCode();
        }
        if (getCreditProfileName() != null) {
            _hashCode += getCreditProfileName().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getMaxCreditLimit() != null) {
            _hashCode += getMaxCreditLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditProfileDtlType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "creditProfileDtlType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "CreditProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditProfileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "CreditProfileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "CreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCreditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MaxCreditLimit"));
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
