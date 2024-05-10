/**
 * RcTransactionReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class RcTransactionReportResponse  implements java.io.Serializable {
    private java.lang.Long totalRecords;

    private com.xius.msp.billing.messages.reportManagement.RCTransDetails[] rcTransDetails;

    public RcTransactionReportResponse() {
    }

    public RcTransactionReportResponse(
           java.lang.Long totalRecords,
           com.xius.msp.billing.messages.reportManagement.RCTransDetails[] rcTransDetails) {
           this.totalRecords = totalRecords;
           this.rcTransDetails = rcTransDetails;
    }


    /**
     * Gets the totalRecords value for this RcTransactionReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this RcTransactionReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the rcTransDetails value for this RcTransactionReportResponse.
     * 
     * @return rcTransDetails
     */
    public com.xius.msp.billing.messages.reportManagement.RCTransDetails[] getRcTransDetails() {
        return rcTransDetails;
    }


    /**
     * Sets the rcTransDetails value for this RcTransactionReportResponse.
     * 
     * @param rcTransDetails
     */
    public void setRcTransDetails(com.xius.msp.billing.messages.reportManagement.RCTransDetails[] rcTransDetails) {
        this.rcTransDetails = rcTransDetails;
    }

    public com.xius.msp.billing.messages.reportManagement.RCTransDetails getRcTransDetails(int i) {
        return this.rcTransDetails[i];
    }

    public void setRcTransDetails(int i, com.xius.msp.billing.messages.reportManagement.RCTransDetails _value) {
        this.rcTransDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RcTransactionReportResponse)) return false;
        RcTransactionReportResponse other = (RcTransactionReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords()))) &&
            ((this.rcTransDetails==null && other.getRcTransDetails()==null) || 
             (this.rcTransDetails!=null &&
              java.util.Arrays.equals(this.rcTransDetails, other.getRcTransDetails())));
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
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        if (getRcTransDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRcTransDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRcTransDetails(), i);
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
        new org.apache.axis.description.TypeDesc(RcTransactionReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransactionReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcTransDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RCTransDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
