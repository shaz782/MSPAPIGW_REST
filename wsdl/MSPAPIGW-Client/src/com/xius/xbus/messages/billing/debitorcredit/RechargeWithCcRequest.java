/**
 * RechargeWithCcRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class RechargeWithCcRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType accountType;

    private java.lang.String rcCode;

    private java.lang.String transId;

    private java.lang.String channel;

    private java.lang.String reason;

    public RechargeWithCcRequest() {
    }

    public RechargeWithCcRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType accountType,
           java.lang.String rcCode,
           java.lang.String transId,
           java.lang.String channel,
           java.lang.String reason) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.accountType = accountType;
        this.rcCode = rcCode;
        this.transId = transId;
        this.channel = channel;
        this.reason = reason;
    }


    /**
     * Gets the accountType value for this RechargeWithCcRequest.
     * 
     * @return accountType
     */
    public com.xius.xbus.messages.common.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this RechargeWithCcRequest.
     * 
     * @param accountType
     */
    public void setAccountType(com.xius.xbus.messages.common.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the rcCode value for this RechargeWithCcRequest.
     * 
     * @return rcCode
     */
    public java.lang.String getRcCode() {
        return rcCode;
    }


    /**
     * Sets the rcCode value for this RechargeWithCcRequest.
     * 
     * @param rcCode
     */
    public void setRcCode(java.lang.String rcCode) {
        this.rcCode = rcCode;
    }


    /**
     * Gets the transId value for this RechargeWithCcRequest.
     * 
     * @return transId
     */
    public java.lang.String getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this RechargeWithCcRequest.
     * 
     * @param transId
     */
    public void setTransId(java.lang.String transId) {
        this.transId = transId;
    }


    /**
     * Gets the channel value for this RechargeWithCcRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this RechargeWithCcRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the reason value for this RechargeWithCcRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this RechargeWithCcRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeWithCcRequest)) return false;
        RechargeWithCcRequest other = (RechargeWithCcRequest) obj;
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
            ((this.rcCode==null && other.getRcCode()==null) || 
             (this.rcCode!=null &&
              this.rcCode.equals(other.getRcCode()))) &&
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getRcCode() != null) {
            _hashCode += getRcCode().hashCode();
        }
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeWithCcRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">rechargeWithCcRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "rcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "transId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "channel"));
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
