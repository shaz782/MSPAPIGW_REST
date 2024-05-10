/**
 * UpdateCreditLimitRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class UpdateCreditLimitRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.UpdateResetType operationType;

    private java.lang.Long accountId;

    private java.lang.String msisdn;

    private java.lang.Double creditLimit;

    private java.lang.String billingType;

    private java.util.Calendar billingFrequency;

    private java.lang.String loginId;

    public UpdateCreditLimitRequest() {
    }

    public UpdateCreditLimitRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.UpdateResetType operationType,
           java.lang.Long accountId,
           java.lang.String msisdn,
           java.lang.Double creditLimit,
           java.lang.String billingType,
           java.util.Calendar billingFrequency,
           java.lang.String loginId) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.operationType = operationType;
        this.accountId = accountId;
        this.msisdn = msisdn;
        this.creditLimit = creditLimit;
        this.billingType = billingType;
        this.billingFrequency = billingFrequency;
        this.loginId = loginId;
    }


    /**
     * Gets the operationType value for this UpdateCreditLimitRequest.
     * 
     * @return operationType
     */
    public com.xius.xbus.messages.common.UpdateResetType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this UpdateCreditLimitRequest.
     * 
     * @param operationType
     */
    public void setOperationType(com.xius.xbus.messages.common.UpdateResetType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the accountId value for this UpdateCreditLimitRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this UpdateCreditLimitRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the msisdn value for this UpdateCreditLimitRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this UpdateCreditLimitRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the creditLimit value for this UpdateCreditLimitRequest.
     * 
     * @return creditLimit
     */
    public java.lang.Double getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this UpdateCreditLimitRequest.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Double creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the billingType value for this UpdateCreditLimitRequest.
     * 
     * @return billingType
     */
    public java.lang.String getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this UpdateCreditLimitRequest.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.String billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the billingFrequency value for this UpdateCreditLimitRequest.
     * 
     * @return billingFrequency
     */
    public java.util.Calendar getBillingFrequency() {
        return billingFrequency;
    }


    /**
     * Sets the billingFrequency value for this UpdateCreditLimitRequest.
     * 
     * @param billingFrequency
     */
    public void setBillingFrequency(java.util.Calendar billingFrequency) {
        this.billingFrequency = billingFrequency;
    }


    /**
     * Gets the loginId value for this UpdateCreditLimitRequest.
     * 
     * @return loginId
     */
    public java.lang.String getLoginId() {
        return loginId;
    }


    /**
     * Sets the loginId value for this UpdateCreditLimitRequest.
     * 
     * @param loginId
     */
    public void setLoginId(java.lang.String loginId) {
        this.loginId = loginId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCreditLimitRequest)) return false;
        UpdateCreditLimitRequest other = (UpdateCreditLimitRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.billingFrequency==null && other.getBillingFrequency()==null) || 
             (this.billingFrequency!=null &&
              this.billingFrequency.equals(other.getBillingFrequency()))) &&
            ((this.loginId==null && other.getLoginId()==null) || 
             (this.loginId!=null &&
              this.loginId.equals(other.getLoginId())));
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
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getBillingFrequency() != null) {
            _hashCode += getBillingFrequency().hashCode();
        }
        if (getLoginId() != null) {
            _hashCode += getLoginId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCreditLimitRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateCreditLimitRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UpdateResetType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "billingFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "loginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
