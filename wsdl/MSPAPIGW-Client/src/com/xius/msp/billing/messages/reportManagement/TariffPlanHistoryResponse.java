/**
 * TariffPlanHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class TariffPlanHistoryResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryType[] tariffPlanHistoryList;

    private java.lang.String message;

    public TariffPlanHistoryResponse() {
    }

    public TariffPlanHistoryResponse(
           com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryType[] tariffPlanHistoryList,
           java.lang.String message) {
           this.tariffPlanHistoryList = tariffPlanHistoryList;
           this.message = message;
    }


    /**
     * Gets the tariffPlanHistoryList value for this TariffPlanHistoryResponse.
     * 
     * @return tariffPlanHistoryList
     */
    public com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryType[] getTariffPlanHistoryList() {
        return tariffPlanHistoryList;
    }


    /**
     * Sets the tariffPlanHistoryList value for this TariffPlanHistoryResponse.
     * 
     * @param tariffPlanHistoryList
     */
    public void setTariffPlanHistoryList(com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryType[] tariffPlanHistoryList) {
        this.tariffPlanHistoryList = tariffPlanHistoryList;
    }


    /**
     * Gets the message value for this TariffPlanHistoryResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TariffPlanHistoryResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TariffPlanHistoryResponse)) return false;
        TariffPlanHistoryResponse other = (TariffPlanHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tariffPlanHistoryList==null && other.getTariffPlanHistoryList()==null) || 
             (this.tariffPlanHistoryList!=null &&
              java.util.Arrays.equals(this.tariffPlanHistoryList, other.getTariffPlanHistoryList()))) &&
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
        if (getTariffPlanHistoryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTariffPlanHistoryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTariffPlanHistoryList(), i);
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
        new org.apache.axis.description.TypeDesc(TariffPlanHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPlanHistoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tariffPlanHistoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tariffPlanHistory"));
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
