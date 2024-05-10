/**
 * PaymentTransReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class PaymentTransReportResponse  implements java.io.Serializable {
    private java.lang.String totalRecords;

    private com.xius.agent.smf.SMFManagement_xsd.PaymentDtlsType[] paymentTransDtls;

    public PaymentTransReportResponse() {
    }

    public PaymentTransReportResponse(
           java.lang.String totalRecords,
           com.xius.agent.smf.SMFManagement_xsd.PaymentDtlsType[] paymentTransDtls) {
           this.totalRecords = totalRecords;
           this.paymentTransDtls = paymentTransDtls;
    }


    /**
     * Gets the totalRecords value for this PaymentTransReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.String getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this PaymentTransReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.String totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the paymentTransDtls value for this PaymentTransReportResponse.
     * 
     * @return paymentTransDtls
     */
    public com.xius.agent.smf.SMFManagement_xsd.PaymentDtlsType[] getPaymentTransDtls() {
        return paymentTransDtls;
    }


    /**
     * Sets the paymentTransDtls value for this PaymentTransReportResponse.
     * 
     * @param paymentTransDtls
     */
    public void setPaymentTransDtls(com.xius.agent.smf.SMFManagement_xsd.PaymentDtlsType[] paymentTransDtls) {
        this.paymentTransDtls = paymentTransDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentTransReportResponse)) return false;
        PaymentTransReportResponse other = (PaymentTransReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords()))) &&
            ((this.paymentTransDtls==null && other.getPaymentTransDtls()==null) || 
             (this.paymentTransDtls!=null &&
              java.util.Arrays.equals(this.paymentTransDtls, other.getPaymentTransDtls())));
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
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        if (getPaymentTransDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentTransDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentTransDtls(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentTransReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTransDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentTransDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentDtls"));
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
