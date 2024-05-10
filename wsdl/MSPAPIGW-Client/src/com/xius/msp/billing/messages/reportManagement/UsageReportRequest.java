/**
 * UsageReportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class UsageReportRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String fromDate;

    private java.lang.String toDate;

    private java.lang.String usageType;

    private java.lang.String userDefinedOne;

    private java.lang.String userDefinedTwo;

    public UsageReportRequest() {
    }

    public UsageReportRequest(
           java.lang.String MSISDN,
           java.lang.String fromDate,
           java.lang.String toDate,
           java.lang.String usageType,
           java.lang.String userDefinedOne,
           java.lang.String userDefinedTwo) {
           this.MSISDN = MSISDN;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.usageType = usageType;
           this.userDefinedOne = userDefinedOne;
           this.userDefinedTwo = userDefinedTwo;
    }


    /**
     * Gets the MSISDN value for this UsageReportRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this UsageReportRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the fromDate value for this UsageReportRequest.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this UsageReportRequest.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this UsageReportRequest.
     * 
     * @return toDate
     */
    public java.lang.String getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this UsageReportRequest.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.String toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the usageType value for this UsageReportRequest.
     * 
     * @return usageType
     */
    public java.lang.String getUsageType() {
        return usageType;
    }


    /**
     * Sets the usageType value for this UsageReportRequest.
     * 
     * @param usageType
     */
    public void setUsageType(java.lang.String usageType) {
        this.usageType = usageType;
    }


    /**
     * Gets the userDefinedOne value for this UsageReportRequest.
     * 
     * @return userDefinedOne
     */
    public java.lang.String getUserDefinedOne() {
        return userDefinedOne;
    }


    /**
     * Sets the userDefinedOne value for this UsageReportRequest.
     * 
     * @param userDefinedOne
     */
    public void setUserDefinedOne(java.lang.String userDefinedOne) {
        this.userDefinedOne = userDefinedOne;
    }


    /**
     * Gets the userDefinedTwo value for this UsageReportRequest.
     * 
     * @return userDefinedTwo
     */
    public java.lang.String getUserDefinedTwo() {
        return userDefinedTwo;
    }


    /**
     * Sets the userDefinedTwo value for this UsageReportRequest.
     * 
     * @param userDefinedTwo
     */
    public void setUserDefinedTwo(java.lang.String userDefinedTwo) {
        this.userDefinedTwo = userDefinedTwo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageReportRequest)) return false;
        UsageReportRequest other = (UsageReportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.usageType==null && other.getUsageType()==null) || 
             (this.usageType!=null &&
              this.usageType.equals(other.getUsageType()))) &&
            ((this.userDefinedOne==null && other.getUserDefinedOne()==null) || 
             (this.userDefinedOne!=null &&
              this.userDefinedOne.equals(other.getUserDefinedOne()))) &&
            ((this.userDefinedTwo==null && other.getUserDefinedTwo()==null) || 
             (this.userDefinedTwo!=null &&
              this.userDefinedTwo.equals(other.getUserDefinedTwo())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getUsageType() != null) {
            _hashCode += getUsageType().hashCode();
        }
        if (getUserDefinedOne() != null) {
            _hashCode += getUserDefinedOne().hashCode();
        }
        if (getUserDefinedTwo() != null) {
            _hashCode += getUserDefinedTwo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageReportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageReportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("usageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userDefinedOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userDefinedTwo"));
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
