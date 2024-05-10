/**
 * RechargeHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class RechargeHistoryResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.RechargeHistoryRecord[] rechargeHistoryRecord;

    private java.lang.String message;

    public RechargeHistoryResponse() {
    }

    public RechargeHistoryResponse(
           com.xius.msp.billing.messages.reportManagement.RechargeHistoryRecord[] rechargeHistoryRecord,
           java.lang.String message) {
           this.rechargeHistoryRecord = rechargeHistoryRecord;
           this.message = message;
    }


    /**
     * Gets the rechargeHistoryRecord value for this RechargeHistoryResponse.
     * 
     * @return rechargeHistoryRecord
     */
    public com.xius.msp.billing.messages.reportManagement.RechargeHistoryRecord[] getRechargeHistoryRecord() {
        return rechargeHistoryRecord;
    }


    /**
     * Sets the rechargeHistoryRecord value for this RechargeHistoryResponse.
     * 
     * @param rechargeHistoryRecord
     */
    public void setRechargeHistoryRecord(com.xius.msp.billing.messages.reportManagement.RechargeHistoryRecord[] rechargeHistoryRecord) {
        this.rechargeHistoryRecord = rechargeHistoryRecord;
    }

    public com.xius.msp.billing.messages.reportManagement.RechargeHistoryRecord getRechargeHistoryRecord(int i) {
        return this.rechargeHistoryRecord[i];
    }

    public void setRechargeHistoryRecord(int i, com.xius.msp.billing.messages.reportManagement.RechargeHistoryRecord _value) {
        this.rechargeHistoryRecord[i] = _value;
    }


    /**
     * Gets the message value for this RechargeHistoryResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this RechargeHistoryResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeHistoryResponse)) return false;
        RechargeHistoryResponse other = (RechargeHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rechargeHistoryRecord==null && other.getRechargeHistoryRecord()==null) || 
             (this.rechargeHistoryRecord!=null &&
              java.util.Arrays.equals(this.rechargeHistoryRecord, other.getRechargeHistoryRecord()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getRechargeHistoryRecord() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechargeHistoryRecord());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRechargeHistoryRecord(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeHistoryRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rechargeHistoryRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "message"));
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
