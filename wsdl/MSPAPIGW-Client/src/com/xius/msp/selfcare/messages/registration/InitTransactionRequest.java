/**
 * InitTransactionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class InitTransactionRequest  implements java.io.Serializable {
    private java.lang.String txNumber;

    private com.xius.msp.selfcare.messages.registration.InitTxFlagType initFor;

    public InitTransactionRequest() {
    }

    public InitTransactionRequest(
           java.lang.String txNumber,
           com.xius.msp.selfcare.messages.registration.InitTxFlagType initFor) {
           this.txNumber = txNumber;
           this.initFor = initFor;
    }


    /**
     * Gets the txNumber value for this InitTransactionRequest.
     * 
     * @return txNumber
     */
    public java.lang.String getTxNumber() {
        return txNumber;
    }


    /**
     * Sets the txNumber value for this InitTransactionRequest.
     * 
     * @param txNumber
     */
    public void setTxNumber(java.lang.String txNumber) {
        this.txNumber = txNumber;
    }


    /**
     * Gets the initFor value for this InitTransactionRequest.
     * 
     * @return initFor
     */
    public com.xius.msp.selfcare.messages.registration.InitTxFlagType getInitFor() {
        return initFor;
    }


    /**
     * Sets the initFor value for this InitTransactionRequest.
     * 
     * @param initFor
     */
    public void setInitFor(com.xius.msp.selfcare.messages.registration.InitTxFlagType initFor) {
        this.initFor = initFor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitTransactionRequest)) return false;
        InitTransactionRequest other = (InitTransactionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.txNumber==null && other.getTxNumber()==null) || 
             (this.txNumber!=null &&
              this.txNumber.equals(other.getTxNumber()))) &&
            ((this.initFor==null && other.getInitFor()==null) || 
             (this.initFor!=null &&
              this.initFor.equals(other.getInitFor())));
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
        if (getTxNumber() != null) {
            _hashCode += getTxNumber().hashCode();
        }
        if (getInitFor() != null) {
            _hashCode += getInitFor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitTransactionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "InitTransactionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "txNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initFor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "initFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "InitTxFlagType"));
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
