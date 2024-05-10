/**
 * GetSubByNameIDRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetSubByNameIDRequest  implements java.io.Serializable {
    private java.lang.String lastName;

    private com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType IDInfo;

    private java.lang.Long maxRecords;

    private java.lang.Long rowCount;

    public GetSubByNameIDRequest() {
    }

    public GetSubByNameIDRequest(
           java.lang.String lastName,
           com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType IDInfo,
           java.lang.Long maxRecords,
           java.lang.Long rowCount) {
           this.lastName = lastName;
           this.IDInfo = IDInfo;
           this.maxRecords = maxRecords;
           this.rowCount = rowCount;
    }


    /**
     * Gets the lastName value for this GetSubByNameIDRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this GetSubByNameIDRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the IDInfo value for this GetSubByNameIDRequest.
     * 
     * @return IDInfo
     */
    public com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType getIDInfo() {
        return IDInfo;
    }


    /**
     * Sets the IDInfo value for this GetSubByNameIDRequest.
     * 
     * @param IDInfo
     */
    public void setIDInfo(com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType IDInfo) {
        this.IDInfo = IDInfo;
    }


    /**
     * Gets the maxRecords value for this GetSubByNameIDRequest.
     * 
     * @return maxRecords
     */
    public java.lang.Long getMaxRecords() {
        return maxRecords;
    }


    /**
     * Sets the maxRecords value for this GetSubByNameIDRequest.
     * 
     * @param maxRecords
     */
    public void setMaxRecords(java.lang.Long maxRecords) {
        this.maxRecords = maxRecords;
    }


    /**
     * Gets the rowCount value for this GetSubByNameIDRequest.
     * 
     * @return rowCount
     */
    public java.lang.Long getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this GetSubByNameIDRequest.
     * 
     * @param rowCount
     */
    public void setRowCount(java.lang.Long rowCount) {
        this.rowCount = rowCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubByNameIDRequest)) return false;
        GetSubByNameIDRequest other = (GetSubByNameIDRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.IDInfo==null && other.getIDInfo()==null) || 
             (this.IDInfo!=null &&
              this.IDInfo.equals(other.getIDInfo()))) &&
            ((this.maxRecords==null && other.getMaxRecords()==null) || 
             (this.maxRecords!=null &&
              this.maxRecords.equals(other.getMaxRecords()))) &&
            ((this.rowCount==null && other.getRowCount()==null) || 
             (this.rowCount!=null &&
              this.rowCount.equals(other.getRowCount())));
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getIDInfo() != null) {
            _hashCode += getIDInfo().hashCode();
        }
        if (getMaxRecords() != null) {
            _hashCode += getMaxRecords().hashCode();
        }
        if (getRowCount() != null) {
            _hashCode += getRowCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubByNameIDRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubByNameIDRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "maxRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "rowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
