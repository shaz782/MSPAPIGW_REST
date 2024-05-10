/**
 * SubscriberInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class SubscriberInfoType  implements java.io.Serializable {
    private com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType IDInfo;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private com.xius.msp.selfcare.messages.SubscriberManagement.MSISDNInfoType[] msisdnsList;

    public SubscriberInfoType() {
    }

    public SubscriberInfoType(
           com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType IDInfo,
           java.lang.String firstName,
           java.lang.String lastName,
           com.xius.msp.selfcare.messages.SubscriberManagement.MSISDNInfoType[] msisdnsList) {
           this.IDInfo = IDInfo;
           this.firstName = firstName;
           this.lastName = lastName;
           this.msisdnsList = msisdnsList;
    }


    /**
     * Gets the IDInfo value for this SubscriberInfoType.
     * 
     * @return IDInfo
     */
    public com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType getIDInfo() {
        return IDInfo;
    }


    /**
     * Sets the IDInfo value for this SubscriberInfoType.
     * 
     * @param IDInfo
     */
    public void setIDInfo(com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType IDInfo) {
        this.IDInfo = IDInfo;
    }


    /**
     * Gets the firstName value for this SubscriberInfoType.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SubscriberInfoType.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this SubscriberInfoType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SubscriberInfoType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the msisdnsList value for this SubscriberInfoType.
     * 
     * @return msisdnsList
     */
    public com.xius.msp.selfcare.messages.SubscriberManagement.MSISDNInfoType[] getMsisdnsList() {
        return msisdnsList;
    }


    /**
     * Sets the msisdnsList value for this SubscriberInfoType.
     * 
     * @param msisdnsList
     */
    public void setMsisdnsList(com.xius.msp.selfcare.messages.SubscriberManagement.MSISDNInfoType[] msisdnsList) {
        this.msisdnsList = msisdnsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberInfoType)) return false;
        SubscriberInfoType other = (SubscriberInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDInfo==null && other.getIDInfo()==null) || 
             (this.IDInfo!=null &&
              this.IDInfo.equals(other.getIDInfo()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.msisdnsList==null && other.getMsisdnsList()==null) || 
             (this.msisdnsList!=null &&
              java.util.Arrays.equals(this.msisdnsList, other.getMsisdnsList())));
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
        if (getIDInfo() != null) {
            _hashCode += getIDInfo().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMsisdnsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdnsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdnsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SubscriberInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "msisdnsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "MSISDNInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "msisdnInfo"));
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
