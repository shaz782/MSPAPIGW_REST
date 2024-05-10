/**
 * GetActUsageReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetActUsageReportRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.AccountType account;

    private java.lang.Integer noOfCalls;

    private com.xius.msp.billing.messages.reportManagement.DurationType duration;

    private com.xius.msp.billing.messages.reportManagement.ReportFlagType reportFlag;

    public GetActUsageReportRequest() {
    }

    public GetActUsageReportRequest(
           com.xius.msp.billing.messages.reportManagement.AccountType account,
           java.lang.Integer noOfCalls,
           com.xius.msp.billing.messages.reportManagement.DurationType duration,
           com.xius.msp.billing.messages.reportManagement.ReportFlagType reportFlag) {
           this.account = account;
           this.noOfCalls = noOfCalls;
           this.duration = duration;
           this.reportFlag = reportFlag;
    }


    /**
     * Gets the account value for this GetActUsageReportRequest.
     * 
     * @return account
     */
    public com.xius.msp.billing.messages.reportManagement.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetActUsageReportRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.msp.billing.messages.reportManagement.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the noOfCalls value for this GetActUsageReportRequest.
     * 
     * @return noOfCalls
     */
    public java.lang.Integer getNoOfCalls() {
        return noOfCalls;
    }


    /**
     * Sets the noOfCalls value for this GetActUsageReportRequest.
     * 
     * @param noOfCalls
     */
    public void setNoOfCalls(java.lang.Integer noOfCalls) {
        this.noOfCalls = noOfCalls;
    }


    /**
     * Gets the duration value for this GetActUsageReportRequest.
     * 
     * @return duration
     */
    public com.xius.msp.billing.messages.reportManagement.DurationType getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this GetActUsageReportRequest.
     * 
     * @param duration
     */
    public void setDuration(com.xius.msp.billing.messages.reportManagement.DurationType duration) {
        this.duration = duration;
    }


    /**
     * Gets the reportFlag value for this GetActUsageReportRequest.
     * 
     * @return reportFlag
     */
    public com.xius.msp.billing.messages.reportManagement.ReportFlagType getReportFlag() {
        return reportFlag;
    }


    /**
     * Sets the reportFlag value for this GetActUsageReportRequest.
     * 
     * @param reportFlag
     */
    public void setReportFlag(com.xius.msp.billing.messages.reportManagement.ReportFlagType reportFlag) {
        this.reportFlag = reportFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetActUsageReportRequest)) return false;
        GetActUsageReportRequest other = (GetActUsageReportRequest) obj;
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
            ((this.noOfCalls==null && other.getNoOfCalls()==null) || 
             (this.noOfCalls!=null &&
              this.noOfCalls.equals(other.getNoOfCalls()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.reportFlag==null && other.getReportFlag()==null) || 
             (this.reportFlag!=null &&
              this.reportFlag.equals(other.getReportFlag())));
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
        if (getNoOfCalls() != null) {
            _hashCode += getNoOfCalls().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getReportFlag() != null) {
            _hashCode += getReportFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetActUsageReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetActUsageReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "noOfCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("reportFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "reportFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ReportFlagType"));
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
