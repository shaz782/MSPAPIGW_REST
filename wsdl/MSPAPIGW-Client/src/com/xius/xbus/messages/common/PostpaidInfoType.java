/**
 * PostpaidInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class PostpaidInfoType  implements java.io.Serializable {
    private java.lang.String creditLimit;

    private java.lang.String availableCreditLimit;

    private java.lang.String billingType;

    private java.lang.String billingFrequency;

    private java.lang.String billingDate;

    public PostpaidInfoType() {
    }

    public PostpaidInfoType(
           java.lang.String creditLimit,
           java.lang.String availableCreditLimit,
           java.lang.String billingType,
           java.lang.String billingFrequency,
           java.lang.String billingDate) {
           this.creditLimit = creditLimit;
           this.availableCreditLimit = availableCreditLimit;
           this.billingType = billingType;
           this.billingFrequency = billingFrequency;
           this.billingDate = billingDate;
    }


    /**
     * Gets the creditLimit value for this PostpaidInfoType.
     * 
     * @return creditLimit
     */
    public java.lang.String getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this PostpaidInfoType.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.String creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the availableCreditLimit value for this PostpaidInfoType.
     * 
     * @return availableCreditLimit
     */
    public java.lang.String getAvailableCreditLimit() {
        return availableCreditLimit;
    }


    /**
     * Sets the availableCreditLimit value for this PostpaidInfoType.
     * 
     * @param availableCreditLimit
     */
    public void setAvailableCreditLimit(java.lang.String availableCreditLimit) {
        this.availableCreditLimit = availableCreditLimit;
    }


    /**
     * Gets the billingType value for this PostpaidInfoType.
     * 
     * @return billingType
     */
    public java.lang.String getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this PostpaidInfoType.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.String billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the billingFrequency value for this PostpaidInfoType.
     * 
     * @return billingFrequency
     */
    public java.lang.String getBillingFrequency() {
        return billingFrequency;
    }


    /**
     * Sets the billingFrequency value for this PostpaidInfoType.
     * 
     * @param billingFrequency
     */
    public void setBillingFrequency(java.lang.String billingFrequency) {
        this.billingFrequency = billingFrequency;
    }


    /**
     * Gets the billingDate value for this PostpaidInfoType.
     * 
     * @return billingDate
     */
    public java.lang.String getBillingDate() {
        return billingDate;
    }


    /**
     * Sets the billingDate value for this PostpaidInfoType.
     * 
     * @param billingDate
     */
    public void setBillingDate(java.lang.String billingDate) {
        this.billingDate = billingDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostpaidInfoType)) return false;
        PostpaidInfoType other = (PostpaidInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.availableCreditLimit==null && other.getAvailableCreditLimit()==null) || 
             (this.availableCreditLimit!=null &&
              this.availableCreditLimit.equals(other.getAvailableCreditLimit()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.billingFrequency==null && other.getBillingFrequency()==null) || 
             (this.billingFrequency!=null &&
              this.billingFrequency.equals(other.getBillingFrequency()))) &&
            ((this.billingDate==null && other.getBillingDate()==null) || 
             (this.billingDate!=null &&
              this.billingDate.equals(other.getBillingDate())));
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
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getAvailableCreditLimit() != null) {
            _hashCode += getAvailableCreditLimit().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getBillingFrequency() != null) {
            _hashCode += getBillingFrequency().hashCode();
        }
        if (getBillingDate() != null) {
            _hashCode += getBillingDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostpaidInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PostpaidInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCreditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "availableCreditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "billingFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "billingDate"));
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
