/**
 * GetAvailableDenomsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.balanceManagement;

public class GetAvailableDenomsResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.billing.messages.balanceManagement.DenominationType[] denominationList;

    public GetAvailableDenomsResponse() {
    }

    public GetAvailableDenomsResponse(
           java.lang.String message,
           com.xius.msp.billing.messages.balanceManagement.DenominationType[] denominationList) {
           this.message = message;
           this.denominationList = denominationList;
    }


    /**
     * Gets the message value for this GetAvailableDenomsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetAvailableDenomsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the denominationList value for this GetAvailableDenomsResponse.
     * 
     * @return denominationList
     */
    public com.xius.msp.billing.messages.balanceManagement.DenominationType[] getDenominationList() {
        return denominationList;
    }


    /**
     * Sets the denominationList value for this GetAvailableDenomsResponse.
     * 
     * @param denominationList
     */
    public void setDenominationList(com.xius.msp.billing.messages.balanceManagement.DenominationType[] denominationList) {
        this.denominationList = denominationList;
    }

    public com.xius.msp.billing.messages.balanceManagement.DenominationType getDenominationList(int i) {
        return this.denominationList[i];
    }

    public void setDenominationList(int i, com.xius.msp.billing.messages.balanceManagement.DenominationType _value) {
        this.denominationList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableDenomsResponse)) return false;
        GetAvailableDenomsResponse other = (GetAvailableDenomsResponse) obj;
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
            ((this.denominationList==null && other.getDenominationList()==null) || 
             (this.denominationList!=null &&
              java.util.Arrays.equals(this.denominationList, other.getDenominationList())));
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
        if (getDenominationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenominationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenominationList(), i);
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
        new org.apache.axis.description.TypeDesc(GetAvailableDenomsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "getAvailableDenomsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "denominationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "denominationType"));
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
