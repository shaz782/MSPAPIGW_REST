/**
 * GetSMSHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetSMSHistoryResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.SMSHistoryType[] history;

    private java.lang.Long totalRecords;

    public GetSMSHistoryResponse() {
    }

    public GetSMSHistoryResponse(
           com.xius.msp.billing.messages.reportManagement.SMSHistoryType[] history,
           java.lang.Long totalRecords) {
           this.history = history;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the history value for this GetSMSHistoryResponse.
     * 
     * @return history
     */
    public com.xius.msp.billing.messages.reportManagement.SMSHistoryType[] getHistory() {
        return history;
    }


    /**
     * Sets the history value for this GetSMSHistoryResponse.
     * 
     * @param history
     */
    public void setHistory(com.xius.msp.billing.messages.reportManagement.SMSHistoryType[] history) {
        this.history = history;
    }


    /**
     * Gets the totalRecords value for this GetSMSHistoryResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this GetSMSHistoryResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSMSHistoryResponse)) return false;
        GetSMSHistoryResponse other = (GetSMSHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              java.util.Arrays.equals(this.history, other.getHistory()))) &&
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords())));
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
        if (getHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSMSHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetSMSHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "history"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SMSHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "smsData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
