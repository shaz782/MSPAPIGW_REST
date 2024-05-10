/**
 * UpdateBalanceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class UpdateBalanceRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType accountType;

    private java.math.BigDecimal amount;

    private java.lang.String operationType;

    private java.lang.String reason;

    private java.lang.String bucketId;

    private int activityId;

    public UpdateBalanceRequest() {
    }

    public UpdateBalanceRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType accountType,
           java.math.BigDecimal amount,
           java.lang.String operationType,
           java.lang.String reason,
           java.lang.String bucketId,
           int activityId) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.accountType = accountType;
        this.amount = amount;
        this.operationType = operationType;
        this.reason = reason;
        this.bucketId = bucketId;
        this.activityId = activityId;
    }


    /**
     * Gets the accountType value for this UpdateBalanceRequest.
     * 
     * @return accountType
     */
    public com.xius.xbus.messages.common.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this UpdateBalanceRequest.
     * 
     * @param accountType
     */
    public void setAccountType(com.xius.xbus.messages.common.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the amount value for this UpdateBalanceRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this UpdateBalanceRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the operationType value for this UpdateBalanceRequest.
     * 
     * @return operationType
     */
    public java.lang.String getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this UpdateBalanceRequest.
     * 
     * @param operationType
     */
    public void setOperationType(java.lang.String operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the reason value for this UpdateBalanceRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this UpdateBalanceRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the bucketId value for this UpdateBalanceRequest.
     * 
     * @return bucketId
     */
    public java.lang.String getBucketId() {
        return bucketId;
    }


    /**
     * Sets the bucketId value for this UpdateBalanceRequest.
     * 
     * @param bucketId
     */
    public void setBucketId(java.lang.String bucketId) {
        this.bucketId = bucketId;
    }


    /**
     * Gets the activityId value for this UpdateBalanceRequest.
     * 
     * @return activityId
     */
    public int getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this UpdateBalanceRequest.
     * 
     * @param activityId
     */
    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBalanceRequest)) return false;
        UpdateBalanceRequest other = (UpdateBalanceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.bucketId==null && other.getBucketId()==null) || 
             (this.bucketId!=null &&
              this.bucketId.equals(other.getBucketId()))) &&
            this.activityId == other.getActivityId();
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getBucketId() != null) {
            _hashCode += getBucketId().hashCode();
        }
        _hashCode += getActivityId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBalanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateBalanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "OperationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "bucketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "activityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
