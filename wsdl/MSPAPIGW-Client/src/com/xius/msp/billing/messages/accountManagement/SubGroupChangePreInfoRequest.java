/**
 * SubGroupChangePreInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.accountManagement;

public class SubGroupChangePreInfoRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.accountManagement.AccountType account;

    public SubGroupChangePreInfoRequest() {
    }

    public SubGroupChangePreInfoRequest(
           com.xius.msp.billing.messages.accountManagement.AccountType account) {
           this.account = account;
    }


    /**
     * Gets the account value for this SubGroupChangePreInfoRequest.
     * 
     * @return account
     */
    public com.xius.msp.billing.messages.accountManagement.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this SubGroupChangePreInfoRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.msp.billing.messages.accountManagement.AccountType account) {
        this.account = account;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubGroupChangePreInfoRequest)) return false;
        SubGroupChangePreInfoRequest other = (SubGroupChangePreInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubGroupChangePreInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "SubGroupChangePreInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/AccountManagement.xsd", "AccountType"));
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
