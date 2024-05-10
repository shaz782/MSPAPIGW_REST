/**
 * UpdateSubIDValueRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class UpdateSubIDValueRequest  implements java.io.Serializable {
    private java.lang.String newIDValue;

    private java.lang.String newIDType;

    private java.lang.String oldIDValue;

    private java.lang.String sellerCode;

    public UpdateSubIDValueRequest() {
    }

    public UpdateSubIDValueRequest(
           java.lang.String newIDValue,
           java.lang.String newIDType,
           java.lang.String oldIDValue,
           java.lang.String sellerCode) {
           this.newIDValue = newIDValue;
           this.newIDType = newIDType;
           this.oldIDValue = oldIDValue;
           this.sellerCode = sellerCode;
    }


    /**
     * Gets the newIDValue value for this UpdateSubIDValueRequest.
     * 
     * @return newIDValue
     */
    public java.lang.String getNewIDValue() {
        return newIDValue;
    }


    /**
     * Sets the newIDValue value for this UpdateSubIDValueRequest.
     * 
     * @param newIDValue
     */
    public void setNewIDValue(java.lang.String newIDValue) {
        this.newIDValue = newIDValue;
    }


    /**
     * Gets the newIDType value for this UpdateSubIDValueRequest.
     * 
     * @return newIDType
     */
    public java.lang.String getNewIDType() {
        return newIDType;
    }


    /**
     * Sets the newIDType value for this UpdateSubIDValueRequest.
     * 
     * @param newIDType
     */
    public void setNewIDType(java.lang.String newIDType) {
        this.newIDType = newIDType;
    }


    /**
     * Gets the oldIDValue value for this UpdateSubIDValueRequest.
     * 
     * @return oldIDValue
     */
    public java.lang.String getOldIDValue() {
        return oldIDValue;
    }


    /**
     * Sets the oldIDValue value for this UpdateSubIDValueRequest.
     * 
     * @param oldIDValue
     */
    public void setOldIDValue(java.lang.String oldIDValue) {
        this.oldIDValue = oldIDValue;
    }


    /**
     * Gets the sellerCode value for this UpdateSubIDValueRequest.
     * 
     * @return sellerCode
     */
    public java.lang.String getSellerCode() {
        return sellerCode;
    }


    /**
     * Sets the sellerCode value for this UpdateSubIDValueRequest.
     * 
     * @param sellerCode
     */
    public void setSellerCode(java.lang.String sellerCode) {
        this.sellerCode = sellerCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSubIDValueRequest)) return false;
        UpdateSubIDValueRequest other = (UpdateSubIDValueRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newIDValue==null && other.getNewIDValue()==null) || 
             (this.newIDValue!=null &&
              this.newIDValue.equals(other.getNewIDValue()))) &&
            ((this.newIDType==null && other.getNewIDType()==null) || 
             (this.newIDType!=null &&
              this.newIDType.equals(other.getNewIDType()))) &&
            ((this.oldIDValue==null && other.getOldIDValue()==null) || 
             (this.oldIDValue!=null &&
              this.oldIDValue.equals(other.getOldIDValue()))) &&
            ((this.sellerCode==null && other.getSellerCode()==null) || 
             (this.sellerCode!=null &&
              this.sellerCode.equals(other.getSellerCode())));
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
        if (getNewIDValue() != null) {
            _hashCode += getNewIDValue().hashCode();
        }
        if (getNewIDType() != null) {
            _hashCode += getNewIDType().hashCode();
        }
        if (getOldIDValue() != null) {
            _hashCode += getOldIDValue().hashCode();
        }
        if (getSellerCode() != null) {
            _hashCode += getSellerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSubIDValueRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubIDValueRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "newIDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "newIDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "oldIDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "sellerCode"));
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
