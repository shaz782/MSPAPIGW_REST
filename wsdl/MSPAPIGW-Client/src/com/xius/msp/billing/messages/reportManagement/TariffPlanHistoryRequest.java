/**
 * TariffPlanHistoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class TariffPlanHistoryRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.AccountType account;

    private java.lang.String fromDate;

    private java.lang.String toDate;

    private int maxRecords;

    private int rowCount;

    private java.lang.String reportFlag;

    public TariffPlanHistoryRequest() {
    }

    public TariffPlanHistoryRequest(
           com.xius.msp.billing.messages.reportManagement.AccountType account,
           java.lang.String fromDate,
           java.lang.String toDate,
           int maxRecords,
           int rowCount,
           java.lang.String reportFlag) {
           this.account = account;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.maxRecords = maxRecords;
           this.rowCount = rowCount;
           this.reportFlag = reportFlag;
    }


    /**
     * Gets the account value for this TariffPlanHistoryRequest.
     * 
     * @return account
     */
    public com.xius.msp.billing.messages.reportManagement.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TariffPlanHistoryRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.msp.billing.messages.reportManagement.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the fromDate value for this TariffPlanHistoryRequest.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this TariffPlanHistoryRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this TariffPlanHistoryRequest.
     * 
     * @return toDate
     */
    public java.lang.String getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this TariffPlanHistoryRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.String toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the maxRecords value for this TariffPlanHistoryRequest.
     * 
     * @return maxRecords
     */
    public int getMaxRecords() {
        return maxRecords;
    }


    /**
     * Sets the maxRecords value for this TariffPlanHistoryRequest.
     * 
     * @param maxRecords
     */
    public void setMaxRecords(int maxRecords) {
        this.maxRecords = maxRecords;
    }


    /**
     * Gets the rowCount value for this TariffPlanHistoryRequest.
     * 
     * @return rowCount
     */
    public int getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this TariffPlanHistoryRequest.
     * 
     * @param rowCount
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }


    /**
     * Gets the reportFlag value for this TariffPlanHistoryRequest.
     * 
     * @return reportFlag
     */
    public java.lang.String getReportFlag() {
        return reportFlag;
    }


    /**
     * Sets the reportFlag value for this TariffPlanHistoryRequest.
     * 
     * @param reportFlag
     */
    public void setReportFlag(java.lang.String reportFlag) {
        this.reportFlag = reportFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TariffPlanHistoryRequest)) return false;
        TariffPlanHistoryRequest other = (TariffPlanHistoryRequest) obj;
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
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.maxRecords == other.getMaxRecords() &&
            this.rowCount == other.getRowCount() &&
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
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += getMaxRecords();
        _hashCode += getRowCount();
        if (getReportFlag() != null) {
            _hashCode += getReportFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TariffPlanHistoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "maxRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "reportFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
