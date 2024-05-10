/**
 * GiftBundlesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class GiftBundlesRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType srcAccount;

    private com.xius.xbus.messages.common.AccountType destAccount;

    private com.xius.xbus.messages.billing.bundle.Bundle[] bundleList;

    private java.lang.String transactionId;

    private java.lang.String channel;

    public GiftBundlesRequest() {
    }

    public GiftBundlesRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType srcAccount,
           com.xius.xbus.messages.common.AccountType destAccount,
           com.xius.xbus.messages.billing.bundle.Bundle[] bundleList,
           java.lang.String transactionId,
           java.lang.String channel) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.srcAccount = srcAccount;
        this.destAccount = destAccount;
        this.bundleList = bundleList;
        this.transactionId = transactionId;
        this.channel = channel;
    }


    /**
     * Gets the srcAccount value for this GiftBundlesRequest.
     * 
     * @return srcAccount
     */
    public com.xius.xbus.messages.common.AccountType getSrcAccount() {
        return srcAccount;
    }


    /**
     * Sets the srcAccount value for this GiftBundlesRequest.
     * 
     * @param srcAccount
     */
    public void setSrcAccount(com.xius.xbus.messages.common.AccountType srcAccount) {
        this.srcAccount = srcAccount;
    }


    /**
     * Gets the destAccount value for this GiftBundlesRequest.
     * 
     * @return destAccount
     */
    public com.xius.xbus.messages.common.AccountType getDestAccount() {
        return destAccount;
    }


    /**
     * Sets the destAccount value for this GiftBundlesRequest.
     * 
     * @param destAccount
     */
    public void setDestAccount(com.xius.xbus.messages.common.AccountType destAccount) {
        this.destAccount = destAccount;
    }


    /**
     * Gets the bundleList value for this GiftBundlesRequest.
     * 
     * @return bundleList
     */
    public com.xius.xbus.messages.billing.bundle.Bundle[] getBundleList() {
        return bundleList;
    }


    /**
     * Sets the bundleList value for this GiftBundlesRequest.
     * 
     * @param bundleList
     */
    public void setBundleList(com.xius.xbus.messages.billing.bundle.Bundle[] bundleList) {
        this.bundleList = bundleList;
    }


    /**
     * Gets the transactionId value for this GiftBundlesRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this GiftBundlesRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the channel value for this GiftBundlesRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this GiftBundlesRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftBundlesRequest)) return false;
        GiftBundlesRequest other = (GiftBundlesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.srcAccount==null && other.getSrcAccount()==null) || 
             (this.srcAccount!=null &&
              this.srcAccount.equals(other.getSrcAccount()))) &&
            ((this.destAccount==null && other.getDestAccount()==null) || 
             (this.destAccount!=null &&
              this.destAccount.equals(other.getDestAccount()))) &&
            ((this.bundleList==null && other.getBundleList()==null) || 
             (this.bundleList!=null &&
              java.util.Arrays.equals(this.bundleList, other.getBundleList()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        if (getSrcAccount() != null) {
            _hashCode += getSrcAccount().hashCode();
        }
        if (getDestAccount() != null) {
            _hashCode += getDestAccount().hashCode();
        }
        if (getBundleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundleList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiftBundlesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">giftBundlesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "srcAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "destAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "Bundle"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "channel"));
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
