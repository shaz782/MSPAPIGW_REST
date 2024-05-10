/**
 * ActivateRcProductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class ActivateRcProductResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String transId;

    private java.lang.String transRefNum;

    private com.xius.xbus.messages.common.MainBalanceType balance;

    private com.xius.xbus.messages.common.WalletType[] wallets;

    private com.xius.xbus.messages.common.AtpsType[] attachedATPs;

    public ActivateRcProductResponse() {
    }

    public ActivateRcProductResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String transId,
           java.lang.String transRefNum,
           com.xius.xbus.messages.common.MainBalanceType balance,
           com.xius.xbus.messages.common.WalletType[] wallets,
           com.xius.xbus.messages.common.AtpsType[] attachedATPs) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.transId = transId;
        this.transRefNum = transRefNum;
        this.balance = balance;
        this.wallets = wallets;
        this.attachedATPs = attachedATPs;
    }


    /**
     * Gets the transId value for this ActivateRcProductResponse.
     * 
     * @return transId
     */
    public java.lang.String getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this ActivateRcProductResponse.
     * 
     * @param transId
     */
    public void setTransId(java.lang.String transId) {
        this.transId = transId;
    }


    /**
     * Gets the transRefNum value for this ActivateRcProductResponse.
     * 
     * @return transRefNum
     */
    public java.lang.String getTransRefNum() {
        return transRefNum;
    }


    /**
     * Sets the transRefNum value for this ActivateRcProductResponse.
     * 
     * @param transRefNum
     */
    public void setTransRefNum(java.lang.String transRefNum) {
        this.transRefNum = transRefNum;
    }


    /**
     * Gets the balance value for this ActivateRcProductResponse.
     * 
     * @return balance
     */
    public com.xius.xbus.messages.common.MainBalanceType getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this ActivateRcProductResponse.
     * 
     * @param balance
     */
    public void setBalance(com.xius.xbus.messages.common.MainBalanceType balance) {
        this.balance = balance;
    }


    /**
     * Gets the wallets value for this ActivateRcProductResponse.
     * 
     * @return wallets
     */
    public com.xius.xbus.messages.common.WalletType[] getWallets() {
        return wallets;
    }


    /**
     * Sets the wallets value for this ActivateRcProductResponse.
     * 
     * @param wallets
     */
    public void setWallets(com.xius.xbus.messages.common.WalletType[] wallets) {
        this.wallets = wallets;
    }


    /**
     * Gets the attachedATPs value for this ActivateRcProductResponse.
     * 
     * @return attachedATPs
     */
    public com.xius.xbus.messages.common.AtpsType[] getAttachedATPs() {
        return attachedATPs;
    }


    /**
     * Sets the attachedATPs value for this ActivateRcProductResponse.
     * 
     * @param attachedATPs
     */
    public void setAttachedATPs(com.xius.xbus.messages.common.AtpsType[] attachedATPs) {
        this.attachedATPs = attachedATPs;
    }

    public com.xius.xbus.messages.common.AtpsType getAttachedATPs(int i) {
        return this.attachedATPs[i];
    }

    public void setAttachedATPs(int i, com.xius.xbus.messages.common.AtpsType _value) {
        this.attachedATPs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivateRcProductResponse)) return false;
        ActivateRcProductResponse other = (ActivateRcProductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId()))) &&
            ((this.transRefNum==null && other.getTransRefNum()==null) || 
             (this.transRefNum!=null &&
              this.transRefNum.equals(other.getTransRefNum()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.wallets==null && other.getWallets()==null) || 
             (this.wallets!=null &&
              java.util.Arrays.equals(this.wallets, other.getWallets()))) &&
            ((this.attachedATPs==null && other.getAttachedATPs()==null) || 
             (this.attachedATPs!=null &&
              java.util.Arrays.equals(this.attachedATPs, other.getAttachedATPs())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        if (getTransRefNum() != null) {
            _hashCode += getTransRefNum().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getWallets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWallets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWallets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachedATPs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachedATPs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachedATPs(), i);
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
        new org.apache.axis.description.TypeDesc(ActivateRcProductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">activateRcProductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "transId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "transRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "mainBalanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wallets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "wallets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "wallets"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedATPs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "attachedATPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "atpsType"));
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
