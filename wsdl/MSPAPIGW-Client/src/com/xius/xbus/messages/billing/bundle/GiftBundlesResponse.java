/**
 * GiftBundlesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class GiftBundlesResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String transactionRefId;

    public GiftBundlesResponse() {
    }

    public GiftBundlesResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String message,
           java.lang.String transactionRefId) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.message = message;
        this.transactionRefId = transactionRefId;
    }


    /**
     * Gets the message value for this GiftBundlesResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GiftBundlesResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the transactionRefId value for this GiftBundlesResponse.
     * 
     * @return transactionRefId
     */
    public java.lang.String getTransactionRefId() {
        return transactionRefId;
    }


    /**
     * Sets the transactionRefId value for this GiftBundlesResponse.
     * 
     * @param transactionRefId
     */
    public void setTransactionRefId(java.lang.String transactionRefId) {
        this.transactionRefId = transactionRefId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftBundlesResponse)) return false;
        GiftBundlesResponse other = (GiftBundlesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.transactionRefId==null && other.getTransactionRefId()==null) || 
             (this.transactionRefId!=null &&
              this.transactionRefId.equals(other.getTransactionRefId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getTransactionRefId() != null) {
            _hashCode += getTransactionRefId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiftBundlesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">giftBundlesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionRefId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "transactionRefId"));
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
