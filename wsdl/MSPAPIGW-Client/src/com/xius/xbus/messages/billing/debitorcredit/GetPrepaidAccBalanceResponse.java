/**
 * GetPrepaidAccBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class GetPrepaidAccBalanceResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String msisdn;

    private java.math.BigDecimal currentBalance;

    private java.lang.String accountStatus;

    private java.util.Calendar currentValidityDate;

    private java.util.Calendar currentGracePeriodOneEndDate;

    private java.util.Calendar currentExpiryDate;

    public GetPrepaidAccBalanceResponse() {
    }

    public GetPrepaidAccBalanceResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String accountId,
           java.lang.String msisdn,
           java.math.BigDecimal currentBalance,
           java.lang.String accountStatus,
           java.util.Calendar currentValidityDate,
           java.util.Calendar currentGracePeriodOneEndDate,
           java.util.Calendar currentExpiryDate) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.accountId = accountId;
        this.msisdn = msisdn;
        this.currentBalance = currentBalance;
        this.accountStatus = accountStatus;
        this.currentValidityDate = currentValidityDate;
        this.currentGracePeriodOneEndDate = currentGracePeriodOneEndDate;
        this.currentExpiryDate = currentExpiryDate;
    }


    /**
     * Gets the accountId value for this GetPrepaidAccBalanceResponse.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetPrepaidAccBalanceResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the msisdn value for this GetPrepaidAccBalanceResponse.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this GetPrepaidAccBalanceResponse.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the currentBalance value for this GetPrepaidAccBalanceResponse.
     * 
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this GetPrepaidAccBalanceResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the accountStatus value for this GetPrepaidAccBalanceResponse.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this GetPrepaidAccBalanceResponse.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the currentValidityDate value for this GetPrepaidAccBalanceResponse.
     * 
     * @return currentValidityDate
     */
    public java.util.Calendar getCurrentValidityDate() {
        return currentValidityDate;
    }


    /**
     * Sets the currentValidityDate value for this GetPrepaidAccBalanceResponse.
     * 
     * @param currentValidityDate
     */
    public void setCurrentValidityDate(java.util.Calendar currentValidityDate) {
        this.currentValidityDate = currentValidityDate;
    }


    /**
     * Gets the currentGracePeriodOneEndDate value for this GetPrepaidAccBalanceResponse.
     * 
     * @return currentGracePeriodOneEndDate
     */
    public java.util.Calendar getCurrentGracePeriodOneEndDate() {
        return currentGracePeriodOneEndDate;
    }


    /**
     * Sets the currentGracePeriodOneEndDate value for this GetPrepaidAccBalanceResponse.
     * 
     * @param currentGracePeriodOneEndDate
     */
    public void setCurrentGracePeriodOneEndDate(java.util.Calendar currentGracePeriodOneEndDate) {
        this.currentGracePeriodOneEndDate = currentGracePeriodOneEndDate;
    }


    /**
     * Gets the currentExpiryDate value for this GetPrepaidAccBalanceResponse.
     * 
     * @return currentExpiryDate
     */
    public java.util.Calendar getCurrentExpiryDate() {
        return currentExpiryDate;
    }


    /**
     * Sets the currentExpiryDate value for this GetPrepaidAccBalanceResponse.
     * 
     * @param currentExpiryDate
     */
    public void setCurrentExpiryDate(java.util.Calendar currentExpiryDate) {
        this.currentExpiryDate = currentExpiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPrepaidAccBalanceResponse)) return false;
        GetPrepaidAccBalanceResponse other = (GetPrepaidAccBalanceResponse) obj;
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
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.currentValidityDate==null && other.getCurrentValidityDate()==null) || 
             (this.currentValidityDate!=null &&
              this.currentValidityDate.equals(other.getCurrentValidityDate()))) &&
            ((this.currentGracePeriodOneEndDate==null && other.getCurrentGracePeriodOneEndDate()==null) || 
             (this.currentGracePeriodOneEndDate!=null &&
              this.currentGracePeriodOneEndDate.equals(other.getCurrentGracePeriodOneEndDate()))) &&
            ((this.currentExpiryDate==null && other.getCurrentExpiryDate()==null) || 
             (this.currentExpiryDate!=null &&
              this.currentExpiryDate.equals(other.getCurrentExpiryDate())));
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
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getCurrentValidityDate() != null) {
            _hashCode += getCurrentValidityDate().hashCode();
        }
        if (getCurrentGracePeriodOneEndDate() != null) {
            _hashCode += getCurrentGracePeriodOneEndDate().hashCode();
        }
        if (getCurrentExpiryDate() != null) {
            _hashCode += getCurrentExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPrepaidAccBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getPrepaidAccBalanceResponse"));
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
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "currentValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentGracePeriodOneEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "currentGracePeriodOneEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "currentExpiryDate"));
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
