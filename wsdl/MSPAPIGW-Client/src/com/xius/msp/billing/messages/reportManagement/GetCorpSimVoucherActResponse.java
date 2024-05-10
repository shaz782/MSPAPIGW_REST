/**
 * GetCorpSimVoucherActResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetCorpSimVoucherActResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.billing.messages.reportManagement.SimVoucherDtlsType[] simVoucherDtls;

    public GetCorpSimVoucherActResponse() {
    }

    public GetCorpSimVoucherActResponse(
           java.lang.String message,
           com.xius.msp.billing.messages.reportManagement.SimVoucherDtlsType[] simVoucherDtls) {
           this.message = message;
           this.simVoucherDtls = simVoucherDtls;
    }


    /**
     * Gets the message value for this GetCorpSimVoucherActResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetCorpSimVoucherActResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the simVoucherDtls value for this GetCorpSimVoucherActResponse.
     * 
     * @return simVoucherDtls
     */
    public com.xius.msp.billing.messages.reportManagement.SimVoucherDtlsType[] getSimVoucherDtls() {
        return simVoucherDtls;
    }


    /**
     * Sets the simVoucherDtls value for this GetCorpSimVoucherActResponse.
     * 
     * @param simVoucherDtls
     */
    public void setSimVoucherDtls(com.xius.msp.billing.messages.reportManagement.SimVoucherDtlsType[] simVoucherDtls) {
        this.simVoucherDtls = simVoucherDtls;
    }

    public com.xius.msp.billing.messages.reportManagement.SimVoucherDtlsType getSimVoucherDtls(int i) {
        return this.simVoucherDtls[i];
    }

    public void setSimVoucherDtls(int i, com.xius.msp.billing.messages.reportManagement.SimVoucherDtlsType _value) {
        this.simVoucherDtls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCorpSimVoucherActResponse)) return false;
        GetCorpSimVoucherActResponse other = (GetCorpSimVoucherActResponse) obj;
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
            ((this.simVoucherDtls==null && other.getSimVoucherDtls()==null) || 
             (this.simVoucherDtls!=null &&
              java.util.Arrays.equals(this.simVoucherDtls, other.getSimVoucherDtls())));
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
        if (getSimVoucherDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimVoucherDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimVoucherDtls(), i);
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
        new org.apache.axis.description.TypeDesc(GetCorpSimVoucherActResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimVoucherActResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simVoucherDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simVoucherDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simVoucherDtlsType"));
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
