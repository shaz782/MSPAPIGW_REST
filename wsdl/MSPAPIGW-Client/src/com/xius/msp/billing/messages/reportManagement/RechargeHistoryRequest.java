/**
 * RechargeHistoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class RechargeHistoryRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.AccountType account;

    private com.xius.msp.billing.messages.reportManagement.DurationType duration;

    private java.lang.Integer maxRecords;

    public RechargeHistoryRequest() {
    }

    public RechargeHistoryRequest(
           com.xius.msp.billing.messages.reportManagement.AccountType account,
           com.xius.msp.billing.messages.reportManagement.DurationType duration,
           java.lang.Integer maxRecords) {
           this.account = account;
           this.duration = duration;
           this.maxRecords = maxRecords;
    }


    /**
     * Gets the account value for this RechargeHistoryRequest.
     * 
     * @return account
     */
    public com.xius.msp.billing.messages.reportManagement.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this RechargeHistoryRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.msp.billing.messages.reportManagement.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the duration value for this RechargeHistoryRequest.
     * 
     * @return duration
     */
    public com.xius.msp.billing.messages.reportManagement.DurationType getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this RechargeHistoryRequest.
     * 
     * @param duration
     */
    public void setDuration(com.xius.msp.billing.messages.reportManagement.DurationType duration) {
        this.duration = duration;
    }


    /**
     * Gets the maxRecords value for this RechargeHistoryRequest.
     * 
     * @return maxRecords
     */
    public java.lang.Integer getMaxRecords() {
        return maxRecords;
    }


    /**
     * Sets the maxRecords value for this RechargeHistoryRequest.
     * 
     * @param maxRecords
     */
    public void setMaxRecords(java.lang.Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeHistoryRequest)) return false;
        RechargeHistoryRequest other = (RechargeHistoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.maxRecords==null && other.getMaxRecords()==null) || 
             (this.maxRecords!=null &&
              this.maxRecords.equals(other.getMaxRecords())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getMaxRecords() != null) {
            _hashCode += getMaxRecords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeHistoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DurationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "maxRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
