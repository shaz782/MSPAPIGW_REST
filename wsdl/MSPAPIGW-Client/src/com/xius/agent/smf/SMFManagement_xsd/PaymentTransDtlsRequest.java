/**
 * PaymentTransDtlsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class PaymentTransDtlsRequest  implements java.io.Serializable {
    private java.lang.String flag;

    private java.lang.String MSISDN;

    private java.lang.String channel;

    private java.lang.String currency;

    private java.lang.String denomination;

    private java.lang.String externalTransId;

    private java.lang.String internalTransId;

    private java.lang.String paymentTransId;

    private java.lang.String status;

    public PaymentTransDtlsRequest() {
    }

    public PaymentTransDtlsRequest(
           java.lang.String flag,
           java.lang.String MSISDN,
           java.lang.String channel,
           java.lang.String currency,
           java.lang.String denomination,
           java.lang.String externalTransId,
           java.lang.String internalTransId,
           java.lang.String paymentTransId,
           java.lang.String status) {
           this.flag = flag;
           this.MSISDN = MSISDN;
           this.channel = channel;
           this.currency = currency;
           this.denomination = denomination;
           this.externalTransId = externalTransId;
           this.internalTransId = internalTransId;
           this.paymentTransId = paymentTransId;
           this.status = status;
    }


    /**
     * Gets the flag value for this PaymentTransDtlsRequest.
     * 
     * @return flag
     */
    public java.lang.String getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this PaymentTransDtlsRequest.
     * 
     * @param flag
     */
    public void setFlag(java.lang.String flag) {
        this.flag = flag;
    }


    /**
     * Gets the MSISDN value for this PaymentTransDtlsRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this PaymentTransDtlsRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the channel value for this PaymentTransDtlsRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this PaymentTransDtlsRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the currency value for this PaymentTransDtlsRequest.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PaymentTransDtlsRequest.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the denomination value for this PaymentTransDtlsRequest.
     * 
     * @return denomination
     */
    public java.lang.String getDenomination() {
        return denomination;
    }


    /**
     * Sets the denomination value for this PaymentTransDtlsRequest.
     * 
     * @param denomination
     */
    public void setDenomination(java.lang.String denomination) {
        this.denomination = denomination;
    }


    /**
     * Gets the externalTransId value for this PaymentTransDtlsRequest.
     * 
     * @return externalTransId
     */
    public java.lang.String getExternalTransId() {
        return externalTransId;
    }


    /**
     * Sets the externalTransId value for this PaymentTransDtlsRequest.
     * 
     * @param externalTransId
     */
    public void setExternalTransId(java.lang.String externalTransId) {
        this.externalTransId = externalTransId;
    }


    /**
     * Gets the internalTransId value for this PaymentTransDtlsRequest.
     * 
     * @return internalTransId
     */
    public java.lang.String getInternalTransId() {
        return internalTransId;
    }


    /**
     * Sets the internalTransId value for this PaymentTransDtlsRequest.
     * 
     * @param internalTransId
     */
    public void setInternalTransId(java.lang.String internalTransId) {
        this.internalTransId = internalTransId;
    }


    /**
     * Gets the paymentTransId value for this PaymentTransDtlsRequest.
     * 
     * @return paymentTransId
     */
    public java.lang.String getPaymentTransId() {
        return paymentTransId;
    }


    /**
     * Sets the paymentTransId value for this PaymentTransDtlsRequest.
     * 
     * @param paymentTransId
     */
    public void setPaymentTransId(java.lang.String paymentTransId) {
        this.paymentTransId = paymentTransId;
    }


    /**
     * Gets the status value for this PaymentTransDtlsRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PaymentTransDtlsRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentTransDtlsRequest)) return false;
        PaymentTransDtlsRequest other = (PaymentTransDtlsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.denomination==null && other.getDenomination()==null) || 
             (this.denomination!=null &&
              this.denomination.equals(other.getDenomination()))) &&
            ((this.externalTransId==null && other.getExternalTransId()==null) || 
             (this.externalTransId!=null &&
              this.externalTransId.equals(other.getExternalTransId()))) &&
            ((this.internalTransId==null && other.getInternalTransId()==null) || 
             (this.internalTransId!=null &&
              this.internalTransId.equals(other.getInternalTransId()))) &&
            ((this.paymentTransId==null && other.getPaymentTransId()==null) || 
             (this.paymentTransId!=null &&
              this.paymentTransId.equals(other.getPaymentTransId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDenomination() != null) {
            _hashCode += getDenomination().hashCode();
        }
        if (getExternalTransId() != null) {
            _hashCode += getExternalTransId().hashCode();
        }
        if (getInternalTransId() != null) {
            _hashCode += getInternalTransId().hashCode();
        }
        if (getPaymentTransId() != null) {
            _hashCode += getPaymentTransId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentTransDtlsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransDtlsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denomination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "denomination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "externalTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "internalTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "status"));
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
