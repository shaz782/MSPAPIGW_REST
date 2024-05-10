/**
 * GetTroubleTktHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.accountManagement;

public class GetTroubleTktHistoryResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.accountManagement.TktHistoryTypeData[] tktHistoryList;

    private java.lang.String message;

    public GetTroubleTktHistoryResponse() {
    }

    public GetTroubleTktHistoryResponse(
           com.xius.msp.billing.messages.accountManagement.TktHistoryTypeData[] tktHistoryList,
           java.lang.String message) {
           this.tktHistoryList = tktHistoryList;
           this.message = message;
    }


    /**
     * Gets the tktHistoryList value for this GetTroubleTktHistoryResponse.
     * 
     * @return tktHistoryList
     */
    public com.xius.msp.billing.messages.accountManagement.TktHistoryTypeData[] getTktHistoryList() {
        return tktHistoryList;
    }


    /**
     * Sets the tktHistoryList value for this GetTroubleTktHistoryResponse.
     * 
     * @param tktHistoryList
     */
    public void setTktHistoryList(com.xius.msp.billing.messages.accountManagement.TktHistoryTypeData[] tktHistoryList) {
        this.tktHistoryList = tktHistoryList;
    }


    /**
     * Gets the message value for this GetTroubleTktHistoryResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetTroubleTktHistoryResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTroubleTktHistoryResponse)) return false;
        GetTroubleTktHistoryResponse other = (GetTroubleTktHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tktHistoryList==null && other.getTktHistoryList()==null) || 
             (this.tktHistoryList!=null &&
              java.util.Arrays.equals(this.tktHistoryList, other.getTktHistoryList()))) &&
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
        if (getTktHistoryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTktHistoryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTktHistoryList(), i);
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
        new org.apache.axis.description.TypeDesc(GetTroubleTktHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "GetTroubleTktHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tktHistoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "tktHistoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktHistoryTypeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "TktHistoryData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "message"));
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
