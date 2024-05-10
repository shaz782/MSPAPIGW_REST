/**
 * GetAtpWalletAmountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.balanceManagement;

public class GetAtpWalletAmountResponse  implements java.io.Serializable {
    private java.lang.String walletUnits;

    private java.lang.String accountId;

    private java.lang.String responseCode;

    private java.lang.String responseDesc;

    public GetAtpWalletAmountResponse() {
    }

    public GetAtpWalletAmountResponse(
           java.lang.String walletUnits,
           java.lang.String accountId,
           java.lang.String responseCode,
           java.lang.String responseDesc) {
           this.walletUnits = walletUnits;
           this.accountId = accountId;
           this.responseCode = responseCode;
           this.responseDesc = responseDesc;
    }


    /**
     * Gets the walletUnits value for this GetAtpWalletAmountResponse.
     * 
     * @return walletUnits
     */
    public java.lang.String getWalletUnits() {
        return walletUnits;
    }


    /**
     * Sets the walletUnits value for this GetAtpWalletAmountResponse.
     * 
     * @param walletUnits
     */
    public void setWalletUnits(java.lang.String walletUnits) {
        this.walletUnits = walletUnits;
    }


    /**
     * Gets the accountId value for this GetAtpWalletAmountResponse.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetAtpWalletAmountResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the responseCode value for this GetAtpWalletAmountResponse.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this GetAtpWalletAmountResponse.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseDesc value for this GetAtpWalletAmountResponse.
     * 
     * @return responseDesc
     */
    public java.lang.String getResponseDesc() {
        return responseDesc;
    }


    /**
     * Sets the responseDesc value for this GetAtpWalletAmountResponse.
     * 
     * @param responseDesc
     */
    public void setResponseDesc(java.lang.String responseDesc) {
        this.responseDesc = responseDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAtpWalletAmountResponse)) return false;
        GetAtpWalletAmountResponse other = (GetAtpWalletAmountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.walletUnits==null && other.getWalletUnits()==null) || 
             (this.walletUnits!=null &&
              this.walletUnits.equals(other.getWalletUnits()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseDesc==null && other.getResponseDesc()==null) || 
             (this.responseDesc!=null &&
              this.responseDesc.equals(other.getResponseDesc())));
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
        if (getWalletUnits() != null) {
            _hashCode += getWalletUnits().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseDesc() != null) {
            _hashCode += getResponseDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAtpWalletAmountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "getAtpWalletAmountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "walletUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "responseDesc"));
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
