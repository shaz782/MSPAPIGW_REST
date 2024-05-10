/**
 * CrossPromoTransReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class CrossPromoTransReportRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.String balanceCategory;

    private java.lang.String fromDate;

    private java.lang.String toDate;

    private java.lang.Integer maxRecords;

    private java.lang.Integer nextRecordIndex;

    public CrossPromoTransReportRequest() {
    }

    public CrossPromoTransReportRequest(
           java.lang.Long accountId,
           java.lang.String balanceCategory,
           java.lang.String fromDate,
           java.lang.String toDate,
           java.lang.Integer maxRecords,
           java.lang.Integer nextRecordIndex) {
           this.accountId = accountId;
           this.balanceCategory = balanceCategory;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.maxRecords = maxRecords;
           this.nextRecordIndex = nextRecordIndex;
    }


    /**
     * Gets the accountId value for this CrossPromoTransReportRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CrossPromoTransReportRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the balanceCategory value for this CrossPromoTransReportRequest.
     * 
     * @return balanceCategory
     */
    public java.lang.String getBalanceCategory() {
        return balanceCategory;
    }


    /**
     * Sets the balanceCategory value for this CrossPromoTransReportRequest.
     * 
     * @param balanceCategory
     */
    public void setBalanceCategory(java.lang.String balanceCategory) {
        this.balanceCategory = balanceCategory;
    }


    /**
     * Gets the fromDate value for this CrossPromoTransReportRequest.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CrossPromoTransReportRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this CrossPromoTransReportRequest.
     * 
     * @return toDate
     */
    public java.lang.String getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CrossPromoTransReportRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.String toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the maxRecords value for this CrossPromoTransReportRequest.
     * 
     * @return maxRecords
     */
    public java.lang.Integer getMaxRecords() {
        return maxRecords;
    }


    /**
     * Sets the maxRecords value for this CrossPromoTransReportRequest.
     * 
     * @param maxRecords
     */
    public void setMaxRecords(java.lang.Integer maxRecords) {
        this.maxRecords = maxRecords;
    }


    /**
     * Gets the nextRecordIndex value for this CrossPromoTransReportRequest.
     * 
     * @return nextRecordIndex
     */
    public java.lang.Integer getNextRecordIndex() {
        return nextRecordIndex;
    }


    /**
     * Sets the nextRecordIndex value for this CrossPromoTransReportRequest.
     * 
     * @param nextRecordIndex
     */
    public void setNextRecordIndex(java.lang.Integer nextRecordIndex) {
        this.nextRecordIndex = nextRecordIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrossPromoTransReportRequest)) return false;
        CrossPromoTransReportRequest other = (CrossPromoTransReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.balanceCategory==null && other.getBalanceCategory()==null) || 
             (this.balanceCategory!=null &&
              this.balanceCategory.equals(other.getBalanceCategory()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.maxRecords==null && other.getMaxRecords()==null) || 
             (this.maxRecords!=null &&
              this.maxRecords.equals(other.getMaxRecords()))) &&
            ((this.nextRecordIndex==null && other.getNextRecordIndex()==null) || 
             (this.nextRecordIndex!=null &&
              this.nextRecordIndex.equals(other.getNextRecordIndex())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getBalanceCategory() != null) {
            _hashCode += getBalanceCategory().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getMaxRecords() != null) {
            _hashCode += getMaxRecords().hashCode();
        }
        if (getNextRecordIndex() != null) {
            _hashCode += getNextRecordIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrossPromoTransReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "balanceCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRecordIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "nextRecordIndex"));
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
