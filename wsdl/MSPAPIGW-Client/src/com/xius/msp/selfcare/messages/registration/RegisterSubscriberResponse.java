/**
 * RegisterSubscriberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class RegisterSubscriberResponse  implements java.io.Serializable {
    private java.lang.String ICCnumber;

    private java.lang.String password;

    private java.lang.String IMSI;

    private java.lang.String transId;

    public RegisterSubscriberResponse() {
    }

    public RegisterSubscriberResponse(
           java.lang.String ICCnumber,
           java.lang.String password,
           java.lang.String IMSI,
           java.lang.String transId) {
           this.ICCnumber = ICCnumber;
           this.password = password;
           this.IMSI = IMSI;
           this.transId = transId;
    }


    /**
     * Gets the ICCnumber value for this RegisterSubscriberResponse.
     * 
     * @return ICCnumber
     */
    public java.lang.String getICCnumber() {
        return ICCnumber;
    }


    /**
     * Sets the ICCnumber value for this RegisterSubscriberResponse.
     * 
     * @param ICCnumber
     */
    public void setICCnumber(java.lang.String ICCnumber) {
        this.ICCnumber = ICCnumber;
    }


    /**
     * Gets the password value for this RegisterSubscriberResponse.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this RegisterSubscriberResponse.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the IMSI value for this RegisterSubscriberResponse.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this RegisterSubscriberResponse.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the transId value for this RegisterSubscriberResponse.
     * 
     * @return transId
     */
    public java.lang.String getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this RegisterSubscriberResponse.
     * 
     * @param transId
     */
    public void setTransId(java.lang.String transId) {
        this.transId = transId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterSubscriberResponse)) return false;
        RegisterSubscriberResponse other = (RegisterSubscriberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ICCnumber==null && other.getICCnumber()==null) || 
             (this.ICCnumber!=null &&
              this.ICCnumber.equals(other.getICCnumber()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId())));
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
        if (getICCnumber() != null) {
            _hashCode += getICCnumber().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterSubscriberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "RegisterSubscriberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "ICCnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "transId"));
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
