/**
 * GetAcctDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class GetAcctDetailsResponse  implements java.io.Serializable {
    private java.lang.String SIMNo;

    private java.lang.String MSISDN;

    private java.lang.Long acctID;

    private java.lang.String IMSINo;

    private java.lang.String idValue;

    private java.math.BigDecimal accountBalance;

    private java.lang.String accountStatus;

    private java.lang.String accountType;

    private java.lang.String accountValidity;

    private java.lang.String activationDate;

    private java.lang.String tariffPackName;

    private java.lang.String tariffPackValidity;

    private java.lang.String sellerCode;

    public GetAcctDetailsResponse() {
    }

    public GetAcctDetailsResponse(
           java.lang.String SIMNo,
           java.lang.String MSISDN,
           java.lang.Long acctID,
           java.lang.String IMSINo,
           java.lang.String idValue,
           java.math.BigDecimal accountBalance,
           java.lang.String accountStatus,
           java.lang.String accountType,
           java.lang.String accountValidity,
           java.lang.String activationDate,
           java.lang.String tariffPackName,
           java.lang.String tariffPackValidity,
           java.lang.String sellerCode) {
           this.SIMNo = SIMNo;
           this.MSISDN = MSISDN;
           this.acctID = acctID;
           this.IMSINo = IMSINo;
           this.idValue = idValue;
           this.accountBalance = accountBalance;
           this.accountStatus = accountStatus;
           this.accountType = accountType;
           this.accountValidity = accountValidity;
           this.activationDate = activationDate;
           this.tariffPackName = tariffPackName;
           this.tariffPackValidity = tariffPackValidity;
           this.sellerCode = sellerCode;
    }


    /**
     * Gets the SIMNo value for this GetAcctDetailsResponse.
     * 
     * @return SIMNo
     */
    public java.lang.String getSIMNo() {
        return SIMNo;
    }


    /**
     * Sets the SIMNo value for this GetAcctDetailsResponse.
     * 
     * @param SIMNo
     */
    public void setSIMNo(java.lang.String SIMNo) {
        this.SIMNo = SIMNo;
    }


    /**
     * Gets the MSISDN value for this GetAcctDetailsResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetAcctDetailsResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the acctID value for this GetAcctDetailsResponse.
     * 
     * @return acctID
     */
    public java.lang.Long getAcctID() {
        return acctID;
    }


    /**
     * Sets the acctID value for this GetAcctDetailsResponse.
     * 
     * @param acctID
     */
    public void setAcctID(java.lang.Long acctID) {
        this.acctID = acctID;
    }


    /**
     * Gets the IMSINo value for this GetAcctDetailsResponse.
     * 
     * @return IMSINo
     */
    public java.lang.String getIMSINo() {
        return IMSINo;
    }


    /**
     * Sets the IMSINo value for this GetAcctDetailsResponse.
     * 
     * @param IMSINo
     */
    public void setIMSINo(java.lang.String IMSINo) {
        this.IMSINo = IMSINo;
    }


    /**
     * Gets the idValue value for this GetAcctDetailsResponse.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this GetAcctDetailsResponse.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the accountBalance value for this GetAcctDetailsResponse.
     * 
     * @return accountBalance
     */
    public java.math.BigDecimal getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this GetAcctDetailsResponse.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(java.math.BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the accountStatus value for this GetAcctDetailsResponse.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this GetAcctDetailsResponse.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the accountType value for this GetAcctDetailsResponse.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this GetAcctDetailsResponse.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the accountValidity value for this GetAcctDetailsResponse.
     * 
     * @return accountValidity
     */
    public java.lang.String getAccountValidity() {
        return accountValidity;
    }


    /**
     * Sets the accountValidity value for this GetAcctDetailsResponse.
     * 
     * @param accountValidity
     */
    public void setAccountValidity(java.lang.String accountValidity) {
        this.accountValidity = accountValidity;
    }


    /**
     * Gets the activationDate value for this GetAcctDetailsResponse.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this GetAcctDetailsResponse.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the tariffPackName value for this GetAcctDetailsResponse.
     * 
     * @return tariffPackName
     */
    public java.lang.String getTariffPackName() {
        return tariffPackName;
    }


    /**
     * Sets the tariffPackName value for this GetAcctDetailsResponse.
     * 
     * @param tariffPackName
     */
    public void setTariffPackName(java.lang.String tariffPackName) {
        this.tariffPackName = tariffPackName;
    }


    /**
     * Gets the tariffPackValidity value for this GetAcctDetailsResponse.
     * 
     * @return tariffPackValidity
     */
    public java.lang.String getTariffPackValidity() {
        return tariffPackValidity;
    }


    /**
     * Sets the tariffPackValidity value for this GetAcctDetailsResponse.
     * 
     * @param tariffPackValidity
     */
    public void setTariffPackValidity(java.lang.String tariffPackValidity) {
        this.tariffPackValidity = tariffPackValidity;
    }


    /**
     * Gets the sellerCode value for this GetAcctDetailsResponse.
     * 
     * @return sellerCode
     */
    public java.lang.String getSellerCode() {
        return sellerCode;
    }


    /**
     * Sets the sellerCode value for this GetAcctDetailsResponse.
     * 
     * @param sellerCode
     */
    public void setSellerCode(java.lang.String sellerCode) {
        this.sellerCode = sellerCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAcctDetailsResponse)) return false;
        GetAcctDetailsResponse other = (GetAcctDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIMNo==null && other.getSIMNo()==null) || 
             (this.SIMNo!=null &&
              this.SIMNo.equals(other.getSIMNo()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.acctID==null && other.getAcctID()==null) || 
             (this.acctID!=null &&
              this.acctID.equals(other.getAcctID()))) &&
            ((this.IMSINo==null && other.getIMSINo()==null) || 
             (this.IMSINo!=null &&
              this.IMSINo.equals(other.getIMSINo()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.accountBalance==null && other.getAccountBalance()==null) || 
             (this.accountBalance!=null &&
              this.accountBalance.equals(other.getAccountBalance()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.accountValidity==null && other.getAccountValidity()==null) || 
             (this.accountValidity!=null &&
              this.accountValidity.equals(other.getAccountValidity()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.tariffPackName==null && other.getTariffPackName()==null) || 
             (this.tariffPackName!=null &&
              this.tariffPackName.equals(other.getTariffPackName()))) &&
            ((this.tariffPackValidity==null && other.getTariffPackValidity()==null) || 
             (this.tariffPackValidity!=null &&
              this.tariffPackValidity.equals(other.getTariffPackValidity()))) &&
            ((this.sellerCode==null && other.getSellerCode()==null) || 
             (this.sellerCode!=null &&
              this.sellerCode.equals(other.getSellerCode())));
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
        if (getSIMNo() != null) {
            _hashCode += getSIMNo().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAcctID() != null) {
            _hashCode += getAcctID().hashCode();
        }
        if (getIMSINo() != null) {
            _hashCode += getIMSINo().hashCode();
        }
        if (getIdValue() != null) {
            _hashCode += getIdValue().hashCode();
        }
        if (getAccountBalance() != null) {
            _hashCode += getAccountBalance().hashCode();
        }
        if (getAccountStatus() != null) {
            _hashCode += getAccountStatus().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAccountValidity() != null) {
            _hashCode += getAccountValidity().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getTariffPackName() != null) {
            _hashCode += getTariffPackName().hashCode();
        }
        if (getTariffPackValidity() != null) {
            _hashCode += getTariffPackValidity().hashCode();
        }
        if (getSellerCode() != null) {
            _hashCode += getSellerCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAcctDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetAcctDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "SIMNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "acctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSINo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "IMSINo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "idValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "accountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "accountStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "accountValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "tariffPackName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "tariffPackValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "sellerCode"));
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
