/**
 * GetdemographicdtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagementV1;

public class GetdemographicdtlsResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.selfcare.messages.SubscriberManagementV1.GetSubDetType subscriberDetails;

    public GetdemographicdtlsResponse() {
    }

    public GetdemographicdtlsResponse(
           java.lang.String message,
           com.xius.msp.selfcare.messages.SubscriberManagementV1.GetSubDetType subscriberDetails) {
           this.message = message;
           this.subscriberDetails = subscriberDetails;
    }


    /**
     * Gets the message value for this GetdemographicdtlsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetdemographicdtlsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the subscriberDetails value for this GetdemographicdtlsResponse.
     * 
     * @return subscriberDetails
     */
    public com.xius.msp.selfcare.messages.SubscriberManagementV1.GetSubDetType getSubscriberDetails() {
        return subscriberDetails;
    }


    /**
     * Sets the subscriberDetails value for this GetdemographicdtlsResponse.
     * 
     * @param subscriberDetails
     */
    public void setSubscriberDetails(com.xius.msp.selfcare.messages.SubscriberManagementV1.GetSubDetType subscriberDetails) {
        this.subscriberDetails = subscriberDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetdemographicdtlsResponse)) return false;
        GetdemographicdtlsResponse other = (GetdemographicdtlsResponse) obj;
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
            ((this.subscriberDetails==null && other.getSubscriberDetails()==null) || 
             (this.subscriberDetails!=null &&
              this.subscriberDetails.equals(other.getSubscriberDetails())));
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
        if (getSubscriberDetails() != null) {
            _hashCode += getSubscriberDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetdemographicdtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.xsd", "GetdemographicdtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.xsd", "subscriberDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.xsd", "GetSubDetType"));
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
