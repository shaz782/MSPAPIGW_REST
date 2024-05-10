/**
 * VoucherTopUpRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class VoucherTopUpRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.common.AccountType accountType;

    private java.lang.String voucherPIN;

    private java.lang.String IVR;

    private java.lang.String idNo;

    public VoucherTopUpRequest() {
    }

    public VoucherTopUpRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.common.AccountType accountType,
           java.lang.String voucherPIN,
           java.lang.String IVR,
           java.lang.String idNo) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.accountType = accountType;
        this.voucherPIN = voucherPIN;
        this.IVR = IVR;
        this.idNo = idNo;
    }


    /**
     * Gets the accountType value for this VoucherTopUpRequest.
     * 
     * @return accountType
     */
    public com.xius.xbus.messages.common.AccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this VoucherTopUpRequest.
     * 
     * @param accountType
     */
    public void setAccountType(com.xius.xbus.messages.common.AccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the voucherPIN value for this VoucherTopUpRequest.
     * 
     * @return voucherPIN
     */
    public java.lang.String getVoucherPIN() {
        return voucherPIN;
    }


    /**
     * Sets the voucherPIN value for this VoucherTopUpRequest.
     * 
     * @param voucherPIN
     */
    public void setVoucherPIN(java.lang.String voucherPIN) {
        this.voucherPIN = voucherPIN;
    }


    /**
     * Gets the IVR value for this VoucherTopUpRequest.
     * 
     * @return IVR
     */
    public java.lang.String getIVR() {
        return IVR;
    }


    /**
     * Sets the IVR value for this VoucherTopUpRequest.
     * 
     * @param IVR
     */
    public void setIVR(java.lang.String IVR) {
        this.IVR = IVR;
    }


    /**
     * Gets the idNo value for this VoucherTopUpRequest.
     * 
     * @return idNo
     */
    public java.lang.String getIdNo() {
        return idNo;
    }


    /**
     * Sets the idNo value for this VoucherTopUpRequest.
     * 
     * @param idNo
     */
    public void setIdNo(java.lang.String idNo) {
        this.idNo = idNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherTopUpRequest)) return false;
        VoucherTopUpRequest other = (VoucherTopUpRequest) obj;
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
            ((this.voucherPIN==null && other.getVoucherPIN()==null) || 
             (this.voucherPIN!=null &&
              this.voucherPIN.equals(other.getVoucherPIN()))) &&
            ((this.IVR==null && other.getIVR()==null) || 
             (this.IVR!=null &&
              this.IVR.equals(other.getIVR()))) &&
            ((this.idNo==null && other.getIdNo()==null) || 
             (this.idNo!=null &&
              this.idNo.equals(other.getIdNo())));
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
        if (getVoucherPIN() != null) {
            _hashCode += getVoucherPIN().hashCode();
        }
        if (getIVR() != null) {
            _hashCode += getIVR().hashCode();
        }
        if (getIdNo() != null) {
            _hashCode += getIdNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherTopUpRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">voucherTopUpRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherPIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "voucherPIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "IVR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "idNo"));
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
