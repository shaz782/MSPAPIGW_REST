/**
 * TransactionTrackerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class TransactionTrackerRequest  implements java.io.Serializable {
    private java.lang.String loginId;

    private java.lang.String IDvalue;

    private java.lang.String channelId;

    private java.lang.String transRefNumber;

    private java.lang.String activityType;

    private java.lang.String userId;

    private java.lang.String accountId;

    private java.lang.String actualAmount;

    private java.lang.String debitAmount;

    private java.lang.String MSISDN;

    private java.lang.String reason;

    public TransactionTrackerRequest() {
    }

    public TransactionTrackerRequest(
           java.lang.String loginId,
           java.lang.String IDvalue,
           java.lang.String channelId,
           java.lang.String transRefNumber,
           java.lang.String activityType,
           java.lang.String userId,
           java.lang.String accountId,
           java.lang.String actualAmount,
           java.lang.String debitAmount,
           java.lang.String MSISDN,
           java.lang.String reason) {
           this.loginId = loginId;
           this.IDvalue = IDvalue;
           this.channelId = channelId;
           this.transRefNumber = transRefNumber;
           this.activityType = activityType;
           this.userId = userId;
           this.accountId = accountId;
           this.actualAmount = actualAmount;
           this.debitAmount = debitAmount;
           this.MSISDN = MSISDN;
           this.reason = reason;
    }


    /**
     * Gets the loginId value for this TransactionTrackerRequest.
     * 
     * @return loginId
     */
    public java.lang.String getLoginId() {
        return loginId;
    }


    /**
     * Sets the loginId value for this TransactionTrackerRequest.
     * 
     * @param loginId
     */
    public void setLoginId(java.lang.String loginId) {
        this.loginId = loginId;
    }


    /**
     * Gets the IDvalue value for this TransactionTrackerRequest.
     * 
     * @return IDvalue
     */
    public java.lang.String getIDvalue() {
        return IDvalue;
    }


    /**
     * Sets the IDvalue value for this TransactionTrackerRequest.
     * 
     * @param IDvalue
     */
    public void setIDvalue(java.lang.String IDvalue) {
        this.IDvalue = IDvalue;
    }


    /**
     * Gets the channelId value for this TransactionTrackerRequest.
     * 
     * @return channelId
     */
    public java.lang.String getChannelId() {
        return channelId;
    }


    /**
     * Sets the channelId value for this TransactionTrackerRequest.
     * 
     * @param channelId
     */
    public void setChannelId(java.lang.String channelId) {
        this.channelId = channelId;
    }


    /**
     * Gets the transRefNumber value for this TransactionTrackerRequest.
     * 
     * @return transRefNumber
     */
    public java.lang.String getTransRefNumber() {
        return transRefNumber;
    }


    /**
     * Sets the transRefNumber value for this TransactionTrackerRequest.
     * 
     * @param transRefNumber
     */
    public void setTransRefNumber(java.lang.String transRefNumber) {
        this.transRefNumber = transRefNumber;
    }


    /**
     * Gets the activityType value for this TransactionTrackerRequest.
     * 
     * @return activityType
     */
    public java.lang.String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this TransactionTrackerRequest.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the userId value for this TransactionTrackerRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this TransactionTrackerRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the accountId value for this TransactionTrackerRequest.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this TransactionTrackerRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the actualAmount value for this TransactionTrackerRequest.
     * 
     * @return actualAmount
     */
    public java.lang.String getActualAmount() {
        return actualAmount;
    }


    /**
     * Sets the actualAmount value for this TransactionTrackerRequest.
     * 
     * @param actualAmount
     */
    public void setActualAmount(java.lang.String actualAmount) {
        this.actualAmount = actualAmount;
    }


    /**
     * Gets the debitAmount value for this TransactionTrackerRequest.
     * 
     * @return debitAmount
     */
    public java.lang.String getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this TransactionTrackerRequest.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(java.lang.String debitAmount) {
        this.debitAmount = debitAmount;
    }


    /**
     * Gets the MSISDN value for this TransactionTrackerRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this TransactionTrackerRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the reason value for this TransactionTrackerRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this TransactionTrackerRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionTrackerRequest)) return false;
        TransactionTrackerRequest other = (TransactionTrackerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginId==null && other.getLoginId()==null) || 
             (this.loginId!=null &&
              this.loginId.equals(other.getLoginId()))) &&
            ((this.IDvalue==null && other.getIDvalue()==null) || 
             (this.IDvalue!=null &&
              this.IDvalue.equals(other.getIDvalue()))) &&
            ((this.channelId==null && other.getChannelId()==null) || 
             (this.channelId!=null &&
              this.channelId.equals(other.getChannelId()))) &&
            ((this.transRefNumber==null && other.getTransRefNumber()==null) || 
             (this.transRefNumber!=null &&
              this.transRefNumber.equals(other.getTransRefNumber()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.actualAmount==null && other.getActualAmount()==null) || 
             (this.actualAmount!=null &&
              this.actualAmount.equals(other.getActualAmount()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              this.debitAmount.equals(other.getDebitAmount()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
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
        int _hashCode = 1;
        if (getLoginId() != null) {
            _hashCode += getLoginId().hashCode();
        }
        if (getIDvalue() != null) {
            _hashCode += getIDvalue().hashCode();
        }
        if (getChannelId() != null) {
            _hashCode += getChannelId().hashCode();
        }
        if (getTransRefNumber() != null) {
            _hashCode += getTransRefNumber().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getActualAmount() != null) {
            _hashCode += getActualAmount().hashCode();
        }
        if (getDebitAmount() != null) {
            _hashCode += getDebitAmount().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionTrackerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "loginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "IDvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "transRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "actualAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "reason"));
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
