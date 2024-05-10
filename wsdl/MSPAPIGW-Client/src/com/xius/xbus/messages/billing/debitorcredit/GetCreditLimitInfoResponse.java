/**
 * GetCreditLimitInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class GetCreditLimitInfoResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String msisdn;

    private java.lang.String status;

    private java.lang.Double creditLimit;

    private java.lang.Double availableCredit;

    private java.lang.String billingType;

    private java.util.Calendar billingFrequency;

    private java.util.Calendar nextBillingDate;

    private java.util.Calendar lastModifiedDate;

    public GetCreditLimitInfoResponse() {
    }

    public GetCreditLimitInfoResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String accountId,
           java.lang.String msisdn,
           java.lang.String status,
           java.lang.Double creditLimit,
           java.lang.Double availableCredit,
           java.lang.String billingType,
           java.util.Calendar billingFrequency,
           java.util.Calendar nextBillingDate,
           java.util.Calendar lastModifiedDate) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.accountId = accountId;
        this.msisdn = msisdn;
        this.status = status;
        this.creditLimit = creditLimit;
        this.availableCredit = availableCredit;
        this.billingType = billingType;
        this.billingFrequency = billingFrequency;
        this.nextBillingDate = nextBillingDate;
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the accountId value for this GetCreditLimitInfoResponse.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetCreditLimitInfoResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the msisdn value for this GetCreditLimitInfoResponse.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this GetCreditLimitInfoResponse.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the status value for this GetCreditLimitInfoResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetCreditLimitInfoResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the creditLimit value for this GetCreditLimitInfoResponse.
     * 
     * @return creditLimit
     */
    public java.lang.Double getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this GetCreditLimitInfoResponse.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Double creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the availableCredit value for this GetCreditLimitInfoResponse.
     * 
     * @return availableCredit
     */
    public java.lang.Double getAvailableCredit() {
        return availableCredit;
    }


    /**
     * Sets the availableCredit value for this GetCreditLimitInfoResponse.
     * 
     * @param availableCredit
     */
    public void setAvailableCredit(java.lang.Double availableCredit) {
        this.availableCredit = availableCredit;
    }


    /**
     * Gets the billingType value for this GetCreditLimitInfoResponse.
     * 
     * @return billingType
     */
    public java.lang.String getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this GetCreditLimitInfoResponse.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.String billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the billingFrequency value for this GetCreditLimitInfoResponse.
     * 
     * @return billingFrequency
     */
    public java.util.Calendar getBillingFrequency() {
        return billingFrequency;
    }


    /**
     * Sets the billingFrequency value for this GetCreditLimitInfoResponse.
     * 
     * @param billingFrequency
     */
    public void setBillingFrequency(java.util.Calendar billingFrequency) {
        this.billingFrequency = billingFrequency;
    }


    /**
     * Gets the nextBillingDate value for this GetCreditLimitInfoResponse.
     * 
     * @return nextBillingDate
     */
    public java.util.Calendar getNextBillingDate() {
        return nextBillingDate;
    }


    /**
     * Sets the nextBillingDate value for this GetCreditLimitInfoResponse.
     * 
     * @param nextBillingDate
     */
    public void setNextBillingDate(java.util.Calendar nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }


    /**
     * Gets the lastModifiedDate value for this GetCreditLimitInfoResponse.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this GetCreditLimitInfoResponse.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCreditLimitInfoResponse)) return false;
        GetCreditLimitInfoResponse other = (GetCreditLimitInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.availableCredit==null && other.getAvailableCredit()==null) || 
             (this.availableCredit!=null &&
              this.availableCredit.equals(other.getAvailableCredit()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.billingFrequency==null && other.getBillingFrequency()==null) || 
             (this.billingFrequency!=null &&
              this.billingFrequency.equals(other.getBillingFrequency()))) &&
            ((this.nextBillingDate==null && other.getNextBillingDate()==null) || 
             (this.nextBillingDate!=null &&
              this.nextBillingDate.equals(other.getNextBillingDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getAvailableCredit() != null) {
            _hashCode += getAvailableCredit().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getBillingFrequency() != null) {
            _hashCode += getBillingFrequency().hashCode();
        }
        if (getNextBillingDate() != null) {
            _hashCode += getNextBillingDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCreditLimitInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getCreditLimitInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "availableCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "billingFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "nextBillingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
