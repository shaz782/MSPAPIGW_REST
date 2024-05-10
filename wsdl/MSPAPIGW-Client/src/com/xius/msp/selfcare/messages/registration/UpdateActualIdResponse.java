/**
 * UpdateActualIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class UpdateActualIdResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String msisdn;

    private java.lang.String msisdnType;

    private java.lang.String imsiNo;

    private java.lang.String oldID;

    private java.lang.String actualID;

    public UpdateActualIdResponse() {
    }

    public UpdateActualIdResponse(
           java.lang.String message,
           java.lang.String msisdn,
           java.lang.String msisdnType,
           java.lang.String imsiNo,
           java.lang.String oldID,
           java.lang.String actualID) {
           this.message = message;
           this.msisdn = msisdn;
           this.msisdnType = msisdnType;
           this.imsiNo = imsiNo;
           this.oldID = oldID;
           this.actualID = actualID;
    }


    /**
     * Gets the message value for this UpdateActualIdResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this UpdateActualIdResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the msisdn value for this UpdateActualIdResponse.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this UpdateActualIdResponse.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the msisdnType value for this UpdateActualIdResponse.
     * 
     * @return msisdnType
     */
    public java.lang.String getMsisdnType() {
        return msisdnType;
    }


    /**
     * Sets the msisdnType value for this UpdateActualIdResponse.
     * 
     * @param msisdnType
     */
    public void setMsisdnType(java.lang.String msisdnType) {
        this.msisdnType = msisdnType;
    }


    /**
     * Gets the imsiNo value for this UpdateActualIdResponse.
     * 
     * @return imsiNo
     */
    public java.lang.String getImsiNo() {
        return imsiNo;
    }


    /**
     * Sets the imsiNo value for this UpdateActualIdResponse.
     * 
     * @param imsiNo
     */
    public void setImsiNo(java.lang.String imsiNo) {
        this.imsiNo = imsiNo;
    }


    /**
     * Gets the oldID value for this UpdateActualIdResponse.
     * 
     * @return oldID
     */
    public java.lang.String getOldID() {
        return oldID;
    }


    /**
     * Sets the oldID value for this UpdateActualIdResponse.
     * 
     * @param oldID
     */
    public void setOldID(java.lang.String oldID) {
        this.oldID = oldID;
    }


    /**
     * Gets the actualID value for this UpdateActualIdResponse.
     * 
     * @return actualID
     */
    public java.lang.String getActualID() {
        return actualID;
    }


    /**
     * Sets the actualID value for this UpdateActualIdResponse.
     * 
     * @param actualID
     */
    public void setActualID(java.lang.String actualID) {
        this.actualID = actualID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateActualIdResponse)) return false;
        UpdateActualIdResponse other = (UpdateActualIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.msisdnType==null && other.getMsisdnType()==null) || 
             (this.msisdnType!=null &&
              this.msisdnType.equals(other.getMsisdnType()))) &&
            ((this.imsiNo==null && other.getImsiNo()==null) || 
             (this.imsiNo!=null &&
              this.imsiNo.equals(other.getImsiNo()))) &&
            ((this.oldID==null && other.getOldID()==null) || 
             (this.oldID!=null &&
              this.oldID.equals(other.getOldID()))) &&
            ((this.actualID==null && other.getActualID()==null) || 
             (this.actualID!=null &&
              this.actualID.equals(other.getActualID())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getMsisdnType() != null) {
            _hashCode += getMsisdnType().hashCode();
        }
        if (getImsiNo() != null) {
            _hashCode += getImsiNo().hashCode();
        }
        if (getOldID() != null) {
            _hashCode += getOldID().hashCode();
        }
        if (getActualID() != null) {
            _hashCode += getActualID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateActualIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "UpdateActualIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "msisdnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsiNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "imsiNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "oldID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "actualID"));
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
