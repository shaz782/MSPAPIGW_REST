/**
 * PaymentReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class PaymentReportResponse  implements java.io.Serializable {
    private java.lang.Long totalRecords;

    private com.xius.msp.billing.messages.reportManagement.PaymentDtls[] paymentDtls;

    public PaymentReportResponse() {
    }

    public PaymentReportResponse(
           java.lang.Long totalRecords,
           com.xius.msp.billing.messages.reportManagement.PaymentDtls[] paymentDtls) {
           this.totalRecords = totalRecords;
           this.paymentDtls = paymentDtls;
    }


    /**
     * Gets the totalRecords value for this PaymentReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this PaymentReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the paymentDtls value for this PaymentReportResponse.
     * 
     * @return paymentDtls
     */
    public com.xius.msp.billing.messages.reportManagement.PaymentDtls[] getPaymentDtls() {
        return paymentDtls;
    }


    /**
     * Sets the paymentDtls value for this PaymentReportResponse.
     * 
     * @param paymentDtls
     */
    public void setPaymentDtls(com.xius.msp.billing.messages.reportManagement.PaymentDtls[] paymentDtls) {
        this.paymentDtls = paymentDtls;
    }

    public com.xius.msp.billing.messages.reportManagement.PaymentDtls getPaymentDtls(int i) {
        return this.paymentDtls[i];
    }

    public void setPaymentDtls(int i, com.xius.msp.billing.messages.reportManagement.PaymentDtls _value) {
        this.paymentDtls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentReportResponse)) return false;
        PaymentReportResponse other = (PaymentReportResponse) obj;
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
            ((this.paymentDtls==null && other.getPaymentDtls()==null) || 
             (this.paymentDtls!=null &&
              java.util.Arrays.equals(this.paymentDtls, other.getPaymentDtls())));
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
        if (getPaymentDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentDtls(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "paymentDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentDtls"));
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
