/**
 * CreditInfoInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class CreditInfoInvoiceRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.Long accountId;

    private java.lang.String month;

    private java.lang.Integer maxRecords;

    private java.lang.Integer rowCount;

    private java.lang.String charityActivityId;

    private java.lang.String roamingActivityId;

    private java.lang.String airtimeActivityId;

    public CreditInfoInvoiceRequest() {
    }

    public CreditInfoInvoiceRequest(
           java.lang.String msisdn,
           java.lang.Long accountId,
           java.lang.String month,
           java.lang.Integer maxRecords,
           java.lang.Integer rowCount,
           java.lang.String charityActivityId,
           java.lang.String roamingActivityId,
           java.lang.String airtimeActivityId) {
           this.msisdn = msisdn;
           this.accountId = accountId;
           this.month = month;
           this.maxRecords = maxRecords;
           this.rowCount = rowCount;
           this.charityActivityId = charityActivityId;
           this.roamingActivityId = roamingActivityId;
           this.airtimeActivityId = airtimeActivityId;
    }


    /**
     * Gets the msisdn value for this CreditInfoInvoiceRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this CreditInfoInvoiceRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the accountId value for this CreditInfoInvoiceRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CreditInfoInvoiceRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the month value for this CreditInfoInvoiceRequest.
     * 
     * @return month
     */
    public java.lang.String getMonth() {
        return month;
    }


    /**
     * Sets the month value for this CreditInfoInvoiceRequest.
     * 
     * @param month
     */
    public void setMonth(java.lang.String month) {
        this.month = month;
    }


    /**
     * Gets the maxRecords value for this CreditInfoInvoiceRequest.
     * 
     * @return maxRecords
     */
    public java.lang.Integer getMaxRecords() {
        return maxRecords;
    }


    /**
     * Sets the maxRecords value for this CreditInfoInvoiceRequest.
     * 
     * @param maxRecords
     */
    public void setMaxRecords(java.lang.Integer maxRecords) {
        this.maxRecords = maxRecords;
    }


    /**
     * Gets the rowCount value for this CreditInfoInvoiceRequest.
     * 
     * @return rowCount
     */
    public java.lang.Integer getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this CreditInfoInvoiceRequest.
     * 
     * @param rowCount
     */
    public void setRowCount(java.lang.Integer rowCount) {
        this.rowCount = rowCount;
    }


    /**
     * Gets the charityActivityId value for this CreditInfoInvoiceRequest.
     * 
     * @return charityActivityId
     */
    public java.lang.String getCharityActivityId() {
        return charityActivityId;
    }


    /**
     * Sets the charityActivityId value for this CreditInfoInvoiceRequest.
     * 
     * @param charityActivityId
     */
    public void setCharityActivityId(java.lang.String charityActivityId) {
        this.charityActivityId = charityActivityId;
    }


    /**
     * Gets the roamingActivityId value for this CreditInfoInvoiceRequest.
     * 
     * @return roamingActivityId
     */
    public java.lang.String getRoamingActivityId() {
        return roamingActivityId;
    }


    /**
     * Sets the roamingActivityId value for this CreditInfoInvoiceRequest.
     * 
     * @param roamingActivityId
     */
    public void setRoamingActivityId(java.lang.String roamingActivityId) {
        this.roamingActivityId = roamingActivityId;
    }


    /**
     * Gets the airtimeActivityId value for this CreditInfoInvoiceRequest.
     * 
     * @return airtimeActivityId
     */
    public java.lang.String getAirtimeActivityId() {
        return airtimeActivityId;
    }


    /**
     * Sets the airtimeActivityId value for this CreditInfoInvoiceRequest.
     * 
     * @param airtimeActivityId
     */
    public void setAirtimeActivityId(java.lang.String airtimeActivityId) {
        this.airtimeActivityId = airtimeActivityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditInfoInvoiceRequest)) return false;
        CreditInfoInvoiceRequest other = (CreditInfoInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.maxRecords==null && other.getMaxRecords()==null) || 
             (this.maxRecords!=null &&
              this.maxRecords.equals(other.getMaxRecords()))) &&
            ((this.rowCount==null && other.getRowCount()==null) || 
             (this.rowCount!=null &&
              this.rowCount.equals(other.getRowCount()))) &&
            ((this.charityActivityId==null && other.getCharityActivityId()==null) || 
             (this.charityActivityId!=null &&
              this.charityActivityId.equals(other.getCharityActivityId()))) &&
            ((this.roamingActivityId==null && other.getRoamingActivityId()==null) || 
             (this.roamingActivityId!=null &&
              this.roamingActivityId.equals(other.getRoamingActivityId()))) &&
            ((this.airtimeActivityId==null && other.getAirtimeActivityId()==null) || 
             (this.airtimeActivityId!=null &&
              this.airtimeActivityId.equals(other.getAirtimeActivityId())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getMaxRecords() != null) {
            _hashCode += getMaxRecords().hashCode();
        }
        if (getRowCount() != null) {
            _hashCode += getRowCount().hashCode();
        }
        if (getCharityActivityId() != null) {
            _hashCode += getCharityActivityId().hashCode();
        }
        if (getRoamingActivityId() != null) {
            _hashCode += getRoamingActivityId().hashCode();
        }
        if (getAirtimeActivityId() != null) {
            _hashCode += getAirtimeActivityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditInfoInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditInfoInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "month"));
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
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rowCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charityActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "charityActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "roamingActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "airtimeActivityId"));
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
