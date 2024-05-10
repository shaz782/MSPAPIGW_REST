/**
 * GetSubscriberProfileInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetSubscriberProfileInfoResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType[] subscriberDetails;

    public GetSubscriberProfileInfoResponse() {
    }

    public GetSubscriberProfileInfoResponse(
           java.lang.String message,
           com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType[] subscriberDetails) {
           this.message = message;
           this.subscriberDetails = subscriberDetails;
    }


    /**
     * Gets the message value for this GetSubscriberProfileInfoResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetSubscriberProfileInfoResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the subscriberDetails value for this GetSubscriberProfileInfoResponse.
     * 
     * @return subscriberDetails
     */
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType[] getSubscriberDetails() {
        return subscriberDetails;
    }


    /**
     * Sets the subscriberDetails value for this GetSubscriberProfileInfoResponse.
     * 
     * @param subscriberDetails
     */
    public void setSubscriberDetails(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType[] subscriberDetails) {
        this.subscriberDetails = subscriberDetails;
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType getSubscriberDetails(int i) {
        return this.subscriberDetails[i];
    }

    public void setSubscriberDetails(int i, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType _value) {
        this.subscriberDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriberProfileInfoResponse)) return false;
        GetSubscriberProfileInfoResponse other = (GetSubscriberProfileInfoResponse) obj;
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
              java.util.Arrays.equals(this.subscriberDetails, other.getSubscriberDetails())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberDetails(), i);
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
        new org.apache.axis.description.TypeDesc(GetSubscriberProfileInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberProfileInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "subscriberDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetCursorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
