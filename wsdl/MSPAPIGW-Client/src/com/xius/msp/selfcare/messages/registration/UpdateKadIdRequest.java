/**
 * UpdateKadIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class UpdateKadIdRequest  implements java.io.Serializable {
    private java.lang.String sim;

    private java.lang.String dummyID;

    private java.lang.String IDType;

    private java.lang.String actualID;

    public UpdateKadIdRequest() {
    }

    public UpdateKadIdRequest(
           java.lang.String sim,
           java.lang.String dummyID,
           java.lang.String IDType,
           java.lang.String actualID) {
           this.sim = sim;
           this.dummyID = dummyID;
           this.IDType = IDType;
           this.actualID = actualID;
    }


    /**
     * Gets the sim value for this UpdateKadIdRequest.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this UpdateKadIdRequest.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the dummyID value for this UpdateKadIdRequest.
     * 
     * @return dummyID
     */
    public java.lang.String getDummyID() {
        return dummyID;
    }


    /**
     * Sets the dummyID value for this UpdateKadIdRequest.
     * 
     * @param dummyID
     */
    public void setDummyID(java.lang.String dummyID) {
        this.dummyID = dummyID;
    }


    /**
     * Gets the IDType value for this UpdateKadIdRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this UpdateKadIdRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the actualID value for this UpdateKadIdRequest.
     * 
     * @return actualID
     */
    public java.lang.String getActualID() {
        return actualID;
    }


    /**
     * Sets the actualID value for this UpdateKadIdRequest.
     * 
     * @param actualID
     */
    public void setActualID(java.lang.String actualID) {
        this.actualID = actualID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateKadIdRequest)) return false;
        UpdateKadIdRequest other = (UpdateKadIdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.dummyID==null && other.getDummyID()==null) || 
             (this.dummyID!=null &&
              this.dummyID.equals(other.getDummyID()))) &&
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
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
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getDummyID() != null) {
            _hashCode += getDummyID().hashCode();
        }
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getActualID() != null) {
            _hashCode += getActualID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateKadIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "UpdateKadIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dummyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "dummyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "actualID"));
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
