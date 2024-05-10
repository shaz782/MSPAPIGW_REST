/**
 * UpdateDemographicDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagementV1;

public class UpdateDemographicDetailsResponse  implements java.io.Serializable {
    private java.lang.String transID;

    private java.lang.String transRefNo;

    public UpdateDemographicDetailsResponse() {
    }

    public UpdateDemographicDetailsResponse(
           java.lang.String transID,
           java.lang.String transRefNo) {
           this.transID = transID;
           this.transRefNo = transRefNo;
    }


    /**
     * Gets the transID value for this UpdateDemographicDetailsResponse.
     * 
     * @return transID
     */
    public java.lang.String getTransID() {
        return transID;
    }


    /**
     * Sets the transID value for this UpdateDemographicDetailsResponse.
     * 
     * @param transID
     */
    public void setTransID(java.lang.String transID) {
        this.transID = transID;
    }


    /**
     * Gets the transRefNo value for this UpdateDemographicDetailsResponse.
     * 
     * @return transRefNo
     */
    public java.lang.String getTransRefNo() {
        return transRefNo;
    }


    /**
     * Sets the transRefNo value for this UpdateDemographicDetailsResponse.
     * 
     * @param transRefNo
     */
    public void setTransRefNo(java.lang.String transRefNo) {
        this.transRefNo = transRefNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDemographicDetailsResponse)) return false;
        UpdateDemographicDetailsResponse other = (UpdateDemographicDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transID==null && other.getTransID()==null) || 
             (this.transID!=null &&
              this.transID.equals(other.getTransID()))) &&
            ((this.transRefNo==null && other.getTransRefNo()==null) || 
             (this.transRefNo!=null &&
              this.transRefNo.equals(other.getTransRefNo())));
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
        if (getTransID() != null) {
            _hashCode += getTransID().hashCode();
        }
        if (getTransRefNo() != null) {
            _hashCode += getTransRefNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDemographicDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.xsd", "UpdateDemographicDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.xsd", "transID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transRefNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.xsd", "transRefNo"));
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
