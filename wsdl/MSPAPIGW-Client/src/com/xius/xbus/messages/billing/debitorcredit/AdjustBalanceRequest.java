/**
 * AdjustBalanceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class AdjustBalanceRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String accountId;

    private com.xius.xbus.messages.billing.debitorcredit.DebitOrCreditType adjustmentType;

    private java.lang.String operator;

    private com.xius.xbus.messages.common.AmountDetails amount;

    private java.lang.String reason;

    private java.lang.String detailedBill;

    private java.lang.String transactionId;

    private java.lang.Integer transactionMode;

    private java.lang.String creditLevel;

    private java.lang.Double promo;

    public AdjustBalanceRequest() {
    }

    public AdjustBalanceRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           java.lang.String msisdn,
           java.lang.String accountId,
           com.xius.xbus.messages.billing.debitorcredit.DebitOrCreditType adjustmentType,
           java.lang.String operator,
           com.xius.xbus.messages.common.AmountDetails amount,
           java.lang.String reason,
           java.lang.String detailedBill,
           java.lang.String transactionId,
           java.lang.Integer transactionMode,
           java.lang.String creditLevel,
           java.lang.Double promo) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.msisdn = msisdn;
        this.accountId = accountId;
        this.adjustmentType = adjustmentType;
        this.operator = operator;
        this.amount = amount;
        this.reason = reason;
        this.detailedBill = detailedBill;
        this.transactionId = transactionId;
        this.transactionMode = transactionMode;
        this.creditLevel = creditLevel;
        this.promo = promo;
    }


    /**
     * Gets the msisdn value for this AdjustBalanceRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this AdjustBalanceRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the accountId value for this AdjustBalanceRequest.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AdjustBalanceRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the adjustmentType value for this AdjustBalanceRequest.
     * 
     * @return adjustmentType
     */
    public com.xius.xbus.messages.billing.debitorcredit.DebitOrCreditType getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this AdjustBalanceRequest.
     * 
     * @param adjustmentType
     */
    public void setAdjustmentType(com.xius.xbus.messages.billing.debitorcredit.DebitOrCreditType adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the operator value for this AdjustBalanceRequest.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this AdjustBalanceRequest.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the amount value for this AdjustBalanceRequest.
     * 
     * @return amount
     */
    public com.xius.xbus.messages.common.AmountDetails getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AdjustBalanceRequest.
     * 
     * @param amount
     */
    public void setAmount(com.xius.xbus.messages.common.AmountDetails amount) {
        this.amount = amount;
    }


    /**
     * Gets the reason value for this AdjustBalanceRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this AdjustBalanceRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the detailedBill value for this AdjustBalanceRequest.
     * 
     * @return detailedBill
     */
    public java.lang.String getDetailedBill() {
        return detailedBill;
    }


    /**
     * Sets the detailedBill value for this AdjustBalanceRequest.
     * 
     * @param detailedBill
     */
    public void setDetailedBill(java.lang.String detailedBill) {
        this.detailedBill = detailedBill;
    }


    /**
     * Gets the transactionId value for this AdjustBalanceRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this AdjustBalanceRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionMode value for this AdjustBalanceRequest.
     * 
     * @return transactionMode
     */
    public java.lang.Integer getTransactionMode() {
        return transactionMode;
    }


    /**
     * Sets the transactionMode value for this AdjustBalanceRequest.
     * 
     * @param transactionMode
     */
    public void setTransactionMode(java.lang.Integer transactionMode) {
        this.transactionMode = transactionMode;
    }


    /**
     * Gets the creditLevel value for this AdjustBalanceRequest.
     * 
     * @return creditLevel
     */
    public java.lang.String getCreditLevel() {
        return creditLevel;
    }


    /**
     * Sets the creditLevel value for this AdjustBalanceRequest.
     * 
     * @param creditLevel
     */
    public void setCreditLevel(java.lang.String creditLevel) {
        this.creditLevel = creditLevel;
    }


    /**
     * Gets the promo value for this AdjustBalanceRequest.
     * 
     * @return promo
     */
    public java.lang.Double getPromo() {
        return promo;
    }


    /**
     * Sets the promo value for this AdjustBalanceRequest.
     * 
     * @param promo
     */
    public void setPromo(java.lang.Double promo) {
        this.promo = promo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustBalanceRequest)) return false;
        AdjustBalanceRequest other = (AdjustBalanceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.detailedBill==null && other.getDetailedBill()==null) || 
             (this.detailedBill!=null &&
              this.detailedBill.equals(other.getDetailedBill()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionMode==null && other.getTransactionMode()==null) || 
             (this.transactionMode!=null &&
              this.transactionMode.equals(other.getTransactionMode()))) &&
            ((this.creditLevel==null && other.getCreditLevel()==null) || 
             (this.creditLevel!=null &&
              this.creditLevel.equals(other.getCreditLevel()))) &&
            ((this.promo==null && other.getPromo()==null) || 
             (this.promo!=null &&
              this.promo.equals(other.getPromo())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getDetailedBill() != null) {
            _hashCode += getDetailedBill().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionMode() != null) {
            _hashCode += getTransactionMode().hashCode();
        }
        if (getCreditLevel() != null) {
            _hashCode += getCreditLevel().hashCode();
        }
        if (getPromo() != null) {
            _hashCode += getPromo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustBalanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">adjustBalanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "adjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "DebitOrCreditType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AmountDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedBill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "detailedBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "transactionMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "creditLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "promo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
