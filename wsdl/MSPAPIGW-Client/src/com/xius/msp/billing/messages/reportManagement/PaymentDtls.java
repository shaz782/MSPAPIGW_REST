/**
 * PaymentDtls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class PaymentDtls  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.String referenceTransId;

    private java.lang.String creditCardToken;

    private java.math.BigDecimal amount;

    private java.lang.String replyCode;

    private java.lang.String numberofAuthorization;

    private java.lang.Long msisdn;

    private java.lang.String transactionDate;

    private java.lang.String tariffPackNextRentDate;

    private java.lang.String tariffPackName;

    private java.lang.String renewalMode;

    private java.lang.Long rowCount;

    public PaymentDtls() {
    }

    public PaymentDtls(
           java.lang.Long accountId,
           java.lang.String referenceTransId,
           java.lang.String creditCardToken,
           java.math.BigDecimal amount,
           java.lang.String replyCode,
           java.lang.String numberofAuthorization,
           java.lang.Long msisdn,
           java.lang.String transactionDate,
           java.lang.String tariffPackNextRentDate,
           java.lang.String tariffPackName,
           java.lang.String renewalMode,
           java.lang.Long rowCount) {
           this.accountId = accountId;
           this.referenceTransId = referenceTransId;
           this.creditCardToken = creditCardToken;
           this.amount = amount;
           this.replyCode = replyCode;
           this.numberofAuthorization = numberofAuthorization;
           this.msisdn = msisdn;
           this.transactionDate = transactionDate;
           this.tariffPackNextRentDate = tariffPackNextRentDate;
           this.tariffPackName = tariffPackName;
           this.renewalMode = renewalMode;
           this.rowCount = rowCount;
    }


    /**
     * Gets the accountId value for this PaymentDtls.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PaymentDtls.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the referenceTransId value for this PaymentDtls.
     * 
     * @return referenceTransId
     */
    public java.lang.String getReferenceTransId() {
        return referenceTransId;
    }


    /**
     * Sets the referenceTransId value for this PaymentDtls.
     * 
     * @param referenceTransId
     */
    public void setReferenceTransId(java.lang.String referenceTransId) {
        this.referenceTransId = referenceTransId;
    }


    /**
     * Gets the creditCardToken value for this PaymentDtls.
     * 
     * @return creditCardToken
     */
    public java.lang.String getCreditCardToken() {
        return creditCardToken;
    }


    /**
     * Sets the creditCardToken value for this PaymentDtls.
     * 
     * @param creditCardToken
     */
    public void setCreditCardToken(java.lang.String creditCardToken) {
        this.creditCardToken = creditCardToken;
    }


    /**
     * Gets the amount value for this PaymentDtls.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentDtls.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the replyCode value for this PaymentDtls.
     * 
     * @return replyCode
     */
    public java.lang.String getReplyCode() {
        return replyCode;
    }


    /**
     * Sets the replyCode value for this PaymentDtls.
     * 
     * @param replyCode
     */
    public void setReplyCode(java.lang.String replyCode) {
        this.replyCode = replyCode;
    }


    /**
     * Gets the numberofAuthorization value for this PaymentDtls.
     * 
     * @return numberofAuthorization
     */
    public java.lang.String getNumberofAuthorization() {
        return numberofAuthorization;
    }


    /**
     * Sets the numberofAuthorization value for this PaymentDtls.
     * 
     * @param numberofAuthorization
     */
    public void setNumberofAuthorization(java.lang.String numberofAuthorization) {
        this.numberofAuthorization = numberofAuthorization;
    }


    /**
     * Gets the msisdn value for this PaymentDtls.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PaymentDtls.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the transactionDate value for this PaymentDtls.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this PaymentDtls.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the tariffPackNextRentDate value for this PaymentDtls.
     * 
     * @return tariffPackNextRentDate
     */
    public java.lang.String getTariffPackNextRentDate() {
        return tariffPackNextRentDate;
    }


    /**
     * Sets the tariffPackNextRentDate value for this PaymentDtls.
     * 
     * @param tariffPackNextRentDate
     */
    public void setTariffPackNextRentDate(java.lang.String tariffPackNextRentDate) {
        this.tariffPackNextRentDate = tariffPackNextRentDate;
    }


    /**
     * Gets the tariffPackName value for this PaymentDtls.
     * 
     * @return tariffPackName
     */
    public java.lang.String getTariffPackName() {
        return tariffPackName;
    }


    /**
     * Sets the tariffPackName value for this PaymentDtls.
     * 
     * @param tariffPackName
     */
    public void setTariffPackName(java.lang.String tariffPackName) {
        this.tariffPackName = tariffPackName;
    }


    /**
     * Gets the renewalMode value for this PaymentDtls.
     * 
     * @return renewalMode
     */
    public java.lang.String getRenewalMode() {
        return renewalMode;
    }


    /**
     * Sets the renewalMode value for this PaymentDtls.
     * 
     * @param renewalMode
     */
    public void setRenewalMode(java.lang.String renewalMode) {
        this.renewalMode = renewalMode;
    }


    /**
     * Gets the rowCount value for this PaymentDtls.
     * 
     * @return rowCount
     */
    public java.lang.Long getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this PaymentDtls.
     * 
     * @param rowCount
     */
    public void setRowCount(java.lang.Long rowCount) {
        this.rowCount = rowCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDtls)) return false;
        PaymentDtls other = (PaymentDtls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.referenceTransId==null && other.getReferenceTransId()==null) || 
             (this.referenceTransId!=null &&
              this.referenceTransId.equals(other.getReferenceTransId()))) &&
            ((this.creditCardToken==null && other.getCreditCardToken()==null) || 
             (this.creditCardToken!=null &&
              this.creditCardToken.equals(other.getCreditCardToken()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.replyCode==null && other.getReplyCode()==null) || 
             (this.replyCode!=null &&
              this.replyCode.equals(other.getReplyCode()))) &&
            ((this.numberofAuthorization==null && other.getNumberofAuthorization()==null) || 
             (this.numberofAuthorization!=null &&
              this.numberofAuthorization.equals(other.getNumberofAuthorization()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.tariffPackNextRentDate==null && other.getTariffPackNextRentDate()==null) || 
             (this.tariffPackNextRentDate!=null &&
              this.tariffPackNextRentDate.equals(other.getTariffPackNextRentDate()))) &&
            ((this.tariffPackName==null && other.getTariffPackName()==null) || 
             (this.tariffPackName!=null &&
              this.tariffPackName.equals(other.getTariffPackName()))) &&
            ((this.renewalMode==null && other.getRenewalMode()==null) || 
             (this.renewalMode!=null &&
              this.renewalMode.equals(other.getRenewalMode()))) &&
            ((this.rowCount==null && other.getRowCount()==null) || 
             (this.rowCount!=null &&
              this.rowCount.equals(other.getRowCount())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getReferenceTransId() != null) {
            _hashCode += getReferenceTransId().hashCode();
        }
        if (getCreditCardToken() != null) {
            _hashCode += getCreditCardToken().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getReplyCode() != null) {
            _hashCode += getReplyCode().hashCode();
        }
        if (getNumberofAuthorization() != null) {
            _hashCode += getNumberofAuthorization().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTariffPackNextRentDate() != null) {
            _hashCode += getTariffPackNextRentDate().hashCode();
        }
        if (getTariffPackName() != null) {
            _hashCode += getTariffPackName().hashCode();
        }
        if (getRenewalMode() != null) {
            _hashCode += getRenewalMode().hashCode();
        }
        if (getRowCount() != null) {
            _hashCode += getRowCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentDtls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentDtls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "referenceTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditCardToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "replyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberofAuthorization");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "numberofAuthorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackNextRentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tariffPackNextRentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tariffPackName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renewalMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "renewalMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
