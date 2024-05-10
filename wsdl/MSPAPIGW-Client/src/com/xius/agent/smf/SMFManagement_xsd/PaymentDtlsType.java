/**
 * PaymentDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class PaymentDtlsType  implements java.io.Serializable {
    private java.lang.String transTime;

    private java.lang.String transID;

    private java.lang.String extTransId;

    private java.lang.String finalStatus;

    private java.lang.String errorMsg;

    private java.lang.String rcCode;

    private java.lang.String rcDescription;

    private java.lang.String price;

    private java.lang.String paymentType;

    private java.lang.String remarks;

    private java.lang.String walletType;

    private java.lang.String paymentGateWayType;

    public PaymentDtlsType() {
    }

    public PaymentDtlsType(
           java.lang.String transTime,
           java.lang.String transID,
           java.lang.String extTransId,
           java.lang.String finalStatus,
           java.lang.String errorMsg,
           java.lang.String rcCode,
           java.lang.String rcDescription,
           java.lang.String price,
           java.lang.String paymentType,
           java.lang.String remarks,
           java.lang.String walletType,
           java.lang.String paymentGateWayType) {
           this.transTime = transTime;
           this.transID = transID;
           this.extTransId = extTransId;
           this.finalStatus = finalStatus;
           this.errorMsg = errorMsg;
           this.rcCode = rcCode;
           this.rcDescription = rcDescription;
           this.price = price;
           this.paymentType = paymentType;
           this.remarks = remarks;
           this.walletType = walletType;
           this.paymentGateWayType = paymentGateWayType;
    }


    /**
     * Gets the transTime value for this PaymentDtlsType.
     * 
     * @return transTime
     */
    public java.lang.String getTransTime() {
        return transTime;
    }


    /**
     * Sets the transTime value for this PaymentDtlsType.
     * 
     * @param transTime
     */
    public void setTransTime(java.lang.String transTime) {
        this.transTime = transTime;
    }


    /**
     * Gets the transID value for this PaymentDtlsType.
     * 
     * @return transID
     */
    public java.lang.String getTransID() {
        return transID;
    }


    /**
     * Sets the transID value for this PaymentDtlsType.
     * 
     * @param transID
     */
    public void setTransID(java.lang.String transID) {
        this.transID = transID;
    }


    /**
     * Gets the extTransId value for this PaymentDtlsType.
     * 
     * @return extTransId
     */
    public java.lang.String getExtTransId() {
        return extTransId;
    }


    /**
     * Sets the extTransId value for this PaymentDtlsType.
     * 
     * @param extTransId
     */
    public void setExtTransId(java.lang.String extTransId) {
        this.extTransId = extTransId;
    }


    /**
     * Gets the finalStatus value for this PaymentDtlsType.
     * 
     * @return finalStatus
     */
    public java.lang.String getFinalStatus() {
        return finalStatus;
    }


    /**
     * Sets the finalStatus value for this PaymentDtlsType.
     * 
     * @param finalStatus
     */
    public void setFinalStatus(java.lang.String finalStatus) {
        this.finalStatus = finalStatus;
    }


    /**
     * Gets the errorMsg value for this PaymentDtlsType.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this PaymentDtlsType.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * Gets the rcCode value for this PaymentDtlsType.
     * 
     * @return rcCode
     */
    public java.lang.String getRcCode() {
        return rcCode;
    }


    /**
     * Sets the rcCode value for this PaymentDtlsType.
     * 
     * @param rcCode
     */
    public void setRcCode(java.lang.String rcCode) {
        this.rcCode = rcCode;
    }


    /**
     * Gets the rcDescription value for this PaymentDtlsType.
     * 
     * @return rcDescription
     */
    public java.lang.String getRcDescription() {
        return rcDescription;
    }


    /**
     * Sets the rcDescription value for this PaymentDtlsType.
     * 
     * @param rcDescription
     */
    public void setRcDescription(java.lang.String rcDescription) {
        this.rcDescription = rcDescription;
    }


    /**
     * Gets the price value for this PaymentDtlsType.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PaymentDtlsType.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the paymentType value for this PaymentDtlsType.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this PaymentDtlsType.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the remarks value for this PaymentDtlsType.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this PaymentDtlsType.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the walletType value for this PaymentDtlsType.
     * 
     * @return walletType
     */
    public java.lang.String getWalletType() {
        return walletType;
    }


    /**
     * Sets the walletType value for this PaymentDtlsType.
     * 
     * @param walletType
     */
    public void setWalletType(java.lang.String walletType) {
        this.walletType = walletType;
    }


    /**
     * Gets the paymentGateWayType value for this PaymentDtlsType.
     * 
     * @return paymentGateWayType
     */
    public java.lang.String getPaymentGateWayType() {
        return paymentGateWayType;
    }


    /**
     * Sets the paymentGateWayType value for this PaymentDtlsType.
     * 
     * @param paymentGateWayType
     */
    public void setPaymentGateWayType(java.lang.String paymentGateWayType) {
        this.paymentGateWayType = paymentGateWayType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDtlsType)) return false;
        PaymentDtlsType other = (PaymentDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transTime==null && other.getTransTime()==null) || 
             (this.transTime!=null &&
              this.transTime.equals(other.getTransTime()))) &&
            ((this.transID==null && other.getTransID()==null) || 
             (this.transID!=null &&
              this.transID.equals(other.getTransID()))) &&
            ((this.extTransId==null && other.getExtTransId()==null) || 
             (this.extTransId!=null &&
              this.extTransId.equals(other.getExtTransId()))) &&
            ((this.finalStatus==null && other.getFinalStatus()==null) || 
             (this.finalStatus!=null &&
              this.finalStatus.equals(other.getFinalStatus()))) &&
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg()))) &&
            ((this.rcCode==null && other.getRcCode()==null) || 
             (this.rcCode!=null &&
              this.rcCode.equals(other.getRcCode()))) &&
            ((this.rcDescription==null && other.getRcDescription()==null) || 
             (this.rcDescription!=null &&
              this.rcDescription.equals(other.getRcDescription()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.walletType==null && other.getWalletType()==null) || 
             (this.walletType!=null &&
              this.walletType.equals(other.getWalletType()))) &&
            ((this.paymentGateWayType==null && other.getPaymentGateWayType()==null) || 
             (this.paymentGateWayType!=null &&
              this.paymentGateWayType.equals(other.getPaymentGateWayType())));
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
        if (getTransTime() != null) {
            _hashCode += getTransTime().hashCode();
        }
        if (getTransID() != null) {
            _hashCode += getTransID().hashCode();
        }
        if (getExtTransId() != null) {
            _hashCode += getExtTransId().hashCode();
        }
        if (getFinalStatus() != null) {
            _hashCode += getFinalStatus().hashCode();
        }
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        if (getRcCode() != null) {
            _hashCode += getRcCode().hashCode();
        }
        if (getRcDescription() != null) {
            _hashCode += getRcDescription().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getWalletType() != null) {
            _hashCode += getWalletType().hashCode();
        }
        if (getPaymentGateWayType() != null) {
            _hashCode += getPaymentGateWayType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "transTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "transID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "extTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "finalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "rcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "rcDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "walletType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentGateWayType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentGateWayType"));
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
