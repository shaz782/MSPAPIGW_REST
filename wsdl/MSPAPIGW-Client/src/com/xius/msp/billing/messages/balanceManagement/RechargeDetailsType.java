/**
 * RechargeDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.balanceManagement;

public class RechargeDetailsType  implements java.io.Serializable {
    private java.lang.String transaction_date;

    private java.lang.String denomination;

    private java.lang.String user_id;

    private java.lang.String channel;

    private java.lang.String remarks;

    private java.lang.String status;

    public RechargeDetailsType() {
    }

    public RechargeDetailsType(
           java.lang.String transaction_date,
           java.lang.String denomination,
           java.lang.String user_id,
           java.lang.String channel,
           java.lang.String remarks,
           java.lang.String status) {
           this.transaction_date = transaction_date;
           this.denomination = denomination;
           this.user_id = user_id;
           this.channel = channel;
           this.remarks = remarks;
           this.status = status;
    }


    /**
     * Gets the transaction_date value for this RechargeDetailsType.
     * 
     * @return transaction_date
     */
    public java.lang.String getTransaction_date() {
        return transaction_date;
    }


    /**
     * Sets the transaction_date value for this RechargeDetailsType.
     * 
     * @param transaction_date
     */
    public void setTransaction_date(java.lang.String transaction_date) {
        this.transaction_date = transaction_date;
    }


    /**
     * Gets the denomination value for this RechargeDetailsType.
     * 
     * @return denomination
     */
    public java.lang.String getDenomination() {
        return denomination;
    }


    /**
     * Sets the denomination value for this RechargeDetailsType.
     * 
     * @param denomination
     */
    public void setDenomination(java.lang.String denomination) {
        this.denomination = denomination;
    }


    /**
     * Gets the user_id value for this RechargeDetailsType.
     * 
     * @return user_id
     */
    public java.lang.String getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this RechargeDetailsType.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.String user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the channel value for this RechargeDetailsType.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this RechargeDetailsType.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the remarks value for this RechargeDetailsType.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this RechargeDetailsType.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the status value for this RechargeDetailsType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RechargeDetailsType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeDetailsType)) return false;
        RechargeDetailsType other = (RechargeDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transaction_date==null && other.getTransaction_date()==null) || 
             (this.transaction_date!=null &&
              this.transaction_date.equals(other.getTransaction_date()))) &&
            ((this.denomination==null && other.getDenomination()==null) || 
             (this.denomination!=null &&
              this.denomination.equals(other.getDenomination()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
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
        if (getTransaction_date() != null) {
            _hashCode += getTransaction_date().hashCode();
        }
        if (getDenomination() != null) {
            _hashCode += getDenomination().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "RechargeDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "transaction_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denomination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "denomination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "status"));
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
