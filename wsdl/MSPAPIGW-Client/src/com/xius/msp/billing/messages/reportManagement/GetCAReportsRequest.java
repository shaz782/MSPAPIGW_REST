/**
 * GetCAReportsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetCAReportsRequest  implements java.io.Serializable {
    private long acctId;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private int maxRcrds;

    private int rowCount;

    private java.lang.Long noOfCalls;

    private long reportFlag;

    private long reportType;

    private com.xius.msp.billing.messages.reportManagement.ChildMsisdn[] childMsisdnArray;

    public GetCAReportsRequest() {
    }

    public GetCAReportsRequest(
           long acctId,
           java.lang.String startDate,
           java.lang.String endDate,
           int maxRcrds,
           int rowCount,
           java.lang.Long noOfCalls,
           long reportFlag,
           long reportType,
           com.xius.msp.billing.messages.reportManagement.ChildMsisdn[] childMsisdnArray) {
           this.acctId = acctId;
           this.startDate = startDate;
           this.endDate = endDate;
           this.maxRcrds = maxRcrds;
           this.rowCount = rowCount;
           this.noOfCalls = noOfCalls;
           this.reportFlag = reportFlag;
           this.reportType = reportType;
           this.childMsisdnArray = childMsisdnArray;
    }


    /**
     * Gets the acctId value for this GetCAReportsRequest.
     * 
     * @return acctId
     */
    public long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this GetCAReportsRequest.
     * 
     * @param acctId
     */
    public void setAcctId(long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the startDate value for this GetCAReportsRequest.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetCAReportsRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this GetCAReportsRequest.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetCAReportsRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the maxRcrds value for this GetCAReportsRequest.
     * 
     * @return maxRcrds
     */
    public int getMaxRcrds() {
        return maxRcrds;
    }


    /**
     * Sets the maxRcrds value for this GetCAReportsRequest.
     * 
     * @param maxRcrds
     */
    public void setMaxRcrds(int maxRcrds) {
        this.maxRcrds = maxRcrds;
    }


    /**
     * Gets the rowCount value for this GetCAReportsRequest.
     * 
     * @return rowCount
     */
    public int getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this GetCAReportsRequest.
     * 
     * @param rowCount
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }


    /**
     * Gets the noOfCalls value for this GetCAReportsRequest.
     * 
     * @return noOfCalls
     */
    public java.lang.Long getNoOfCalls() {
        return noOfCalls;
    }


    /**
     * Sets the noOfCalls value for this GetCAReportsRequest.
     * 
     * @param noOfCalls
     */
    public void setNoOfCalls(java.lang.Long noOfCalls) {
        this.noOfCalls = noOfCalls;
    }


    /**
     * Gets the reportFlag value for this GetCAReportsRequest.
     * 
     * @return reportFlag
     */
    public long getReportFlag() {
        return reportFlag;
    }


    /**
     * Sets the reportFlag value for this GetCAReportsRequest.
     * 
     * @param reportFlag
     */
    public void setReportFlag(long reportFlag) {
        this.reportFlag = reportFlag;
    }


    /**
     * Gets the reportType value for this GetCAReportsRequest.
     * 
     * @return reportType
     */
    public long getReportType() {
        return reportType;
    }


    /**
     * Sets the reportType value for this GetCAReportsRequest.
     * 
     * @param reportType
     */
    public void setReportType(long reportType) {
        this.reportType = reportType;
    }


    /**
     * Gets the childMsisdnArray value for this GetCAReportsRequest.
     * 
     * @return childMsisdnArray
     */
    public com.xius.msp.billing.messages.reportManagement.ChildMsisdn[] getChildMsisdnArray() {
        return childMsisdnArray;
    }


    /**
     * Sets the childMsisdnArray value for this GetCAReportsRequest.
     * 
     * @param childMsisdnArray
     */
    public void setChildMsisdnArray(com.xius.msp.billing.messages.reportManagement.ChildMsisdn[] childMsisdnArray) {
        this.childMsisdnArray = childMsisdnArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCAReportsRequest)) return false;
        GetCAReportsRequest other = (GetCAReportsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.acctId == other.getAcctId() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.maxRcrds == other.getMaxRcrds() &&
            this.rowCount == other.getRowCount() &&
            ((this.noOfCalls==null && other.getNoOfCalls()==null) || 
             (this.noOfCalls!=null &&
              this.noOfCalls.equals(other.getNoOfCalls()))) &&
            this.reportFlag == other.getReportFlag() &&
            this.reportType == other.getReportType() &&
            ((this.childMsisdnArray==null && other.getChildMsisdnArray()==null) || 
             (this.childMsisdnArray!=null &&
              java.util.Arrays.equals(this.childMsisdnArray, other.getChildMsisdnArray())));
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
        _hashCode += new Long(getAcctId()).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += getMaxRcrds();
        _hashCode += getRowCount();
        if (getNoOfCalls() != null) {
            _hashCode += getNoOfCalls().hashCode();
        }
        _hashCode += new Long(getReportFlag()).hashCode();
        _hashCode += new Long(getReportType()).hashCode();
        if (getChildMsisdnArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildMsisdnArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildMsisdnArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCAReportsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCAReportsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRcrds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "maxRcrds"));
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
        elemField.setFieldName("noOfCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "noOfCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "reportFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "reportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childMsisdnArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "childMsisdnArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChildMsisdn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "childMsisdn"));
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
