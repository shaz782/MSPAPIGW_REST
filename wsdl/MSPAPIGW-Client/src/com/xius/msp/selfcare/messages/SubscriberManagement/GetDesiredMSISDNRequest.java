/**
 * GetDesiredMSISDNRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetDesiredMSISDNRequest  implements java.io.Serializable {
    private java.lang.String netWorkName;

    private java.lang.String lastFourDigits;

    public GetDesiredMSISDNRequest() {
    }

    public GetDesiredMSISDNRequest(
           java.lang.String netWorkName,
           java.lang.String lastFourDigits) {
           this.netWorkName = netWorkName;
           this.lastFourDigits = lastFourDigits;
    }


    /**
     * Gets the netWorkName value for this GetDesiredMSISDNRequest.
     * 
     * @return netWorkName
     */
    public java.lang.String getNetWorkName() {
        return netWorkName;
    }


    /**
     * Sets the netWorkName value for this GetDesiredMSISDNRequest.
     * 
     * @param netWorkName
     */
    public void setNetWorkName(java.lang.String netWorkName) {
        this.netWorkName = netWorkName;
    }


    /**
     * Gets the lastFourDigits value for this GetDesiredMSISDNRequest.
     * 
     * @return lastFourDigits
     */
    public java.lang.String getLastFourDigits() {
        return lastFourDigits;
    }


    /**
     * Sets the lastFourDigits value for this GetDesiredMSISDNRequest.
     * 
     * @param lastFourDigits
     */
    public void setLastFourDigits(java.lang.String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDesiredMSISDNRequest)) return false;
        GetDesiredMSISDNRequest other = (GetDesiredMSISDNRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.netWorkName==null && other.getNetWorkName()==null) || 
             (this.netWorkName!=null &&
              this.netWorkName.equals(other.getNetWorkName()))) &&
            ((this.lastFourDigits==null && other.getLastFourDigits()==null) || 
             (this.lastFourDigits!=null &&
              this.lastFourDigits.equals(other.getLastFourDigits())));
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
        if (getNetWorkName() != null) {
            _hashCode += getNetWorkName().hashCode();
        }
        if (getLastFourDigits() != null) {
            _hashCode += getLastFourDigits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDesiredMSISDNRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetDesiredMSISDNRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netWorkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "netWorkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFourDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "lastFourDigits"));
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
