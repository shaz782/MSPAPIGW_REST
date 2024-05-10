/**
 * RetrieveVoucherRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class RetrieveVoucherRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String vchrNumber;

    private java.lang.String vchrPin;

    public RetrieveVoucherRequest() {
    }

    public RetrieveVoucherRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String vchrNumber,
           java.lang.String vchrPin) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.vchrNumber = vchrNumber;
        this.vchrPin = vchrPin;
    }


    /**
     * Gets the vchrNumber value for this RetrieveVoucherRequest.
     * 
     * @return vchrNumber
     */
    public java.lang.String getVchrNumber() {
        return vchrNumber;
    }


    /**
     * Sets the vchrNumber value for this RetrieveVoucherRequest.
     * 
     * @param vchrNumber
     */
    public void setVchrNumber(java.lang.String vchrNumber) {
        this.vchrNumber = vchrNumber;
    }


    /**
     * Gets the vchrPin value for this RetrieveVoucherRequest.
     * 
     * @return vchrPin
     */
    public java.lang.String getVchrPin() {
        return vchrPin;
    }


    /**
     * Sets the vchrPin value for this RetrieveVoucherRequest.
     * 
     * @param vchrPin
     */
    public void setVchrPin(java.lang.String vchrPin) {
        this.vchrPin = vchrPin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveVoucherRequest)) return false;
        RetrieveVoucherRequest other = (RetrieveVoucherRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vchrNumber==null && other.getVchrNumber()==null) || 
             (this.vchrNumber!=null &&
              this.vchrNumber.equals(other.getVchrNumber()))) &&
            ((this.vchrPin==null && other.getVchrPin()==null) || 
             (this.vchrPin!=null &&
              this.vchrPin.equals(other.getVchrPin())));
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
        if (getVchrNumber() != null) {
            _hashCode += getVchrNumber().hashCode();
        }
        if (getVchrPin() != null) {
            _hashCode += getVchrPin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveVoucherRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">retrieveVoucherRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vchrNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "vchrNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vchrPin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "vchrPin"));
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
