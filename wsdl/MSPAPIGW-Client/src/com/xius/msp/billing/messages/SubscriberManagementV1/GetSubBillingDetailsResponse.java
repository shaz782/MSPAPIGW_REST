/**
 * GetSubBillingDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class GetSubBillingDetailsResponse  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.Long acctID;

    private java.lang.String ICCID;

    private java.lang.String idValue;

    private java.math.BigDecimal accountBalance;

    private java.lang.String accountStatus;

    private java.lang.String accountExpDate;

    private java.lang.String accountValidity;

    private java.lang.String tariffPackName;

    private java.lang.String tariffPackValidity;

    public GetSubBillingDetailsResponse() {
    }

    public GetSubBillingDetailsResponse(
           java.lang.String MSISDN,
           java.lang.Long acctID,
           java.lang.String ICCID,
           java.lang.String idValue,
           java.math.BigDecimal accountBalance,
           java.lang.String accountStatus,
           java.lang.String accountExpDate,
           java.lang.String accountValidity,
           java.lang.String tariffPackName,
           java.lang.String tariffPackValidity) {
           this.MSISDN = MSISDN;
           this.acctID = acctID;
           this.ICCID = ICCID;
           this.idValue = idValue;
           this.accountBalance = accountBalance;
           this.accountStatus = accountStatus;
           this.accountExpDate = accountExpDate;
           this.accountValidity = accountValidity;
           this.tariffPackName = tariffPackName;
           this.tariffPackValidity = tariffPackValidity;
    }


    /**
     * Gets the MSISDN value for this GetSubBillingDetailsResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetSubBillingDetailsResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the acctID value for this GetSubBillingDetailsResponse.
     * 
     * @return acctID
     */
    public java.lang.Long getAcctID() {
        return acctID;
    }


    /**
     * Sets the acctID value for this GetSubBillingDetailsResponse.
     * 
     * @param acctID
     */
    public void setAcctID(java.lang.Long acctID) {
        this.acctID = acctID;
    }


    /**
     * Gets the ICCID value for this GetSubBillingDetailsResponse.
     * 
     * @return ICCID
     */
    public java.lang.String getICCID() {
        return ICCID;
    }


    /**
     * Sets the ICCID value for this GetSubBillingDetailsResponse.
     * 
     * @param ICCID
     */
    public void setICCID(java.lang.String ICCID) {
        this.ICCID = ICCID;
    }


    /**
     * Gets the idValue value for this GetSubBillingDetailsResponse.
     * 
     * @return idValue
     */
    public java.lang.String getIdValue() {
        return idValue;
    }


    /**
     * Sets the idValue value for this GetSubBillingDetailsResponse.
     * 
     * @param idValue
     */
    public void setIdValue(java.lang.String idValue) {
        this.idValue = idValue;
    }


    /**
     * Gets the accountBalance value for this GetSubBillingDetailsResponse.
     * 
     * @return accountBalance
     */
    public java.math.BigDecimal getAccountBalance() {
        return accountBalance;
    }


    /**
     * Sets the accountBalance value for this GetSubBillingDetailsResponse.
     * 
     * @param accountBalance
     */
    public void setAccountBalance(java.math.BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }


    /**
     * Gets the accountStatus value for this GetSubBillingDetailsResponse.
     * 
     * @return accountStatus
     */
    public java.lang.String getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this GetSubBillingDetailsResponse.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(java.lang.String accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the accountExpDate value for this GetSubBillingDetailsResponse.
     * 
     * @return accountExpDate
     */
    public java.lang.String getAccountExpDate() {
        return accountExpDate;
    }


    /**
     * Sets the accountExpDate value for this GetSubBillingDetailsResponse.
     * 
     * @param accountExpDate
     */
    public void setAccountExpDate(java.lang.String accountExpDate) {
        this.accountExpDate = accountExpDate;
    }


    /**
     * Gets the accountValidity value for this GetSubBillingDetailsResponse.
     * 
     * @return accountValidity
     */
    public java.lang.String getAccountValidity() {
        return accountValidity;
    }


    /**
     * Sets the accountValidity value for this GetSubBillingDetailsResponse.
     * 
     * @param accountValidity
     */
    public void setAccountValidity(java.lang.String accountValidity) {
        this.accountValidity = accountValidity;
    }


    /**
     * Gets the tariffPackName value for this GetSubBillingDetailsResponse.
     * 
     * @return tariffPackName
     */
    public java.lang.String getTariffPackName() {
        return tariffPackName;
    }


    /**
     * Sets the tariffPackName value for this GetSubBillingDetailsResponse.
     * 
     * @param tariffPackName
     */
    public void setTariffPackName(java.lang.String tariffPackName) {
        this.tariffPackName = tariffPackName;
    }


    /**
     * Gets the tariffPackValidity value for this GetSubBillingDetailsResponse.
     * 
     * @return tariffPackValidity
     */
    public java.lang.String getTariffPackValidity() {
        return tariffPackValidity;
    }


    /**
     * Sets the tariffPackValidity value for this GetSubBillingDetailsResponse.
     * 
     * @param tariffPackValidity
     */
    public void setTariffPackValidity(java.lang.String tariffPackValidity) {
        this.tariffPackValidity = tariffPackValidity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubBillingDetailsResponse)) return false;
        GetSubBillingDetailsResponse other = (GetSubBillingDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.acctID==null && other.getAcctID()==null) || 
             (this.acctID!=null &&
              this.acctID.equals(other.getAcctID()))) &&
            ((this.ICCID==null && other.getICCID()==null) || 
             (this.ICCID!=null &&
              this.ICCID.equals(other.getICCID()))) &&
            ((this.idValue==null && other.getIdValue()==null) || 
             (this.idValue!=null &&
              this.idValue.equals(other.getIdValue()))) &&
            ((this.accountBalance==null && other.getAccountBalance()==null) || 
             (this.accountBalance!=null &&
              this.accountBalance.equals(other.getAccountBalance()))) &&
            ((this.accountStatus==null && other.getAccountStatus()==null) || 
             (this.accountStatus!=null &&
              this.accountStatus.equals(other.getAccountStatus()))) &&
            ((this.accountExpDate==null && other.getAccountExpDate()==null) || 
             (this.accountExpDate!=null &&
              this.accountExpDate.equals(other.getAccountExpDate()))) &&
            ((this.accountValidity==null && other.getAccountValidity()==null) || 
             (this.accountValidity!=null &&
              this.accountValidity.equals(other.getAccountValidity()))) &&
            ((this.tariffPackName==null && other.getTariffPackName()==null) || 
             (this.tariffPackName!=null &&
              this.tariffPackName.equals(other.getTariffPackName()))) &&
            ((this.tariffPackValidity==null && other.getTariffPackValidity()==null) || 
             (this.tariffPackValidity!=null &&
              this.tariffPackValidity.equals(other.getTariffPackValidity())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAcctID() != null) {
            _hashCode += getAcctID().hashCode();
        }
        if (getICCID() != null) {
            _hashCode += getICCID().hashCode();
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
        if (getAccountExpDate() != null) {
            _hashCode += getAccountExpDate().hashCode();
        }
        if (getAccountValidity() != null) {
            _hashCode += getAccountValidity().hashCode();
        }
        if (getTariffPackName() != null) {
            _hashCode += getTariffPackName().hashCode();
        }
        if (getTariffPackValidity() != null) {
            _hashCode += getTariffPackValidity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubBillingDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetSubBillingDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("ICCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "ICCID"));
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
        elemField.setFieldName("accountExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "accountExpDate"));
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
