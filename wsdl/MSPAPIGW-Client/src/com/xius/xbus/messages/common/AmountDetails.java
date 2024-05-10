/**
 * AmountDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class AmountDetails  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private com.xius.xbus.messages.common.CurrencyKeyType currencyTypeKey;

    public AmountDetails() {
    }

    public AmountDetails(
           java.math.BigDecimal amount,
           com.xius.xbus.messages.common.CurrencyKeyType currencyTypeKey) {
           this.amount = amount;
           this.currencyTypeKey = currencyTypeKey;
    }


    /**
     * Gets the amount value for this AmountDetails.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AmountDetails.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyTypeKey value for this AmountDetails.
     * 
     * @return currencyTypeKey
     */
    public com.xius.xbus.messages.common.CurrencyKeyType getCurrencyTypeKey() {
        return currencyTypeKey;
    }


    /**
     * Sets the currencyTypeKey value for this AmountDetails.
     * 
     * @param currencyTypeKey
     */
    public void setCurrencyTypeKey(com.xius.xbus.messages.common.CurrencyKeyType currencyTypeKey) {
        this.currencyTypeKey = currencyTypeKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AmountDetails)) return false;
        AmountDetails other = (AmountDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyTypeKey==null && other.getCurrencyTypeKey()==null) || 
             (this.currencyTypeKey!=null &&
              this.currencyTypeKey.equals(other.getCurrencyTypeKey())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrencyTypeKey() != null) {
            _hashCode += getCurrencyTypeKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AmountDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AmountDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyTypeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "currencyTypeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "CurrencyKeyType"));
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
