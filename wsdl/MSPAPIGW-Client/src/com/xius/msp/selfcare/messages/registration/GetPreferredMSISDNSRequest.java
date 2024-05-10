/**
 * GetPreferredMSISDNSRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class GetPreferredMSISDNSRequest  implements java.io.Serializable {
    private java.lang.String blockedMSISDN;

    private com.xius.msp.selfcare.messages.registration.NonBlockedMSISDNType nonBlockedMSISDN;

    private java.lang.String IDNo;

    private java.lang.String preferFourDigits;

    public GetPreferredMSISDNSRequest() {
    }

    public GetPreferredMSISDNSRequest(
           java.lang.String blockedMSISDN,
           com.xius.msp.selfcare.messages.registration.NonBlockedMSISDNType nonBlockedMSISDN,
           java.lang.String IDNo,
           java.lang.String preferFourDigits) {
           this.blockedMSISDN = blockedMSISDN;
           this.nonBlockedMSISDN = nonBlockedMSISDN;
           this.IDNo = IDNo;
           this.preferFourDigits = preferFourDigits;
    }


    /**
     * Gets the blockedMSISDN value for this GetPreferredMSISDNSRequest.
     * 
     * @return blockedMSISDN
     */
    public java.lang.String getBlockedMSISDN() {
        return blockedMSISDN;
    }


    /**
     * Sets the blockedMSISDN value for this GetPreferredMSISDNSRequest.
     * 
     * @param blockedMSISDN
     */
    public void setBlockedMSISDN(java.lang.String blockedMSISDN) {
        this.blockedMSISDN = blockedMSISDN;
    }


    /**
     * Gets the nonBlockedMSISDN value for this GetPreferredMSISDNSRequest.
     * 
     * @return nonBlockedMSISDN
     */
    public com.xius.msp.selfcare.messages.registration.NonBlockedMSISDNType getNonBlockedMSISDN() {
        return nonBlockedMSISDN;
    }


    /**
     * Sets the nonBlockedMSISDN value for this GetPreferredMSISDNSRequest.
     * 
     * @param nonBlockedMSISDN
     */
    public void setNonBlockedMSISDN(com.xius.msp.selfcare.messages.registration.NonBlockedMSISDNType nonBlockedMSISDN) {
        this.nonBlockedMSISDN = nonBlockedMSISDN;
    }


    /**
     * Gets the IDNo value for this GetPreferredMSISDNSRequest.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this GetPreferredMSISDNSRequest.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the preferFourDigits value for this GetPreferredMSISDNSRequest.
     * 
     * @return preferFourDigits
     */
    public java.lang.String getPreferFourDigits() {
        return preferFourDigits;
    }


    /**
     * Sets the preferFourDigits value for this GetPreferredMSISDNSRequest.
     * 
     * @param preferFourDigits
     */
    public void setPreferFourDigits(java.lang.String preferFourDigits) {
        this.preferFourDigits = preferFourDigits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPreferredMSISDNSRequest)) return false;
        GetPreferredMSISDNSRequest other = (GetPreferredMSISDNSRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blockedMSISDN==null && other.getBlockedMSISDN()==null) || 
             (this.blockedMSISDN!=null &&
              this.blockedMSISDN.equals(other.getBlockedMSISDN()))) &&
            ((this.nonBlockedMSISDN==null && other.getNonBlockedMSISDN()==null) || 
             (this.nonBlockedMSISDN!=null &&
              this.nonBlockedMSISDN.equals(other.getNonBlockedMSISDN()))) &&
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.preferFourDigits==null && other.getPreferFourDigits()==null) || 
             (this.preferFourDigits!=null &&
              this.preferFourDigits.equals(other.getPreferFourDigits())));
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
        if (getBlockedMSISDN() != null) {
            _hashCode += getBlockedMSISDN().hashCode();
        }
        if (getNonBlockedMSISDN() != null) {
            _hashCode += getNonBlockedMSISDN().hashCode();
        }
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getPreferFourDigits() != null) {
            _hashCode += getPreferFourDigits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPreferredMSISDNSRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "GetPreferredMSISDNSRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "blockedMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonBlockedMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "nonBlockedMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "NonBlockedMSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferFourDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "preferFourDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
