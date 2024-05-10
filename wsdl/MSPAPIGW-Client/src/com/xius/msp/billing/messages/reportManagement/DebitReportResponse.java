/**
 * DebitReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class DebitReportResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.billing.messages.reportManagement.DebitRprtType[] report;

    private java.lang.Long totalRecords;

    public DebitReportResponse() {
    }

    public DebitReportResponse(
           java.lang.String message,
           com.xius.msp.billing.messages.reportManagement.DebitRprtType[] report,
           java.lang.Long totalRecords) {
           this.message = message;
           this.report = report;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the message value for this DebitReportResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DebitReportResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the report value for this DebitReportResponse.
     * 
     * @return report
     */
    public com.xius.msp.billing.messages.reportManagement.DebitRprtType[] getReport() {
        return report;
    }


    /**
     * Sets the report value for this DebitReportResponse.
     * 
     * @param report
     */
    public void setReport(com.xius.msp.billing.messages.reportManagement.DebitRprtType[] report) {
        this.report = report;
    }


    /**
     * Gets the totalRecords value for this DebitReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this DebitReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitReportResponse)) return false;
        DebitReportResponse other = (DebitReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              java.util.Arrays.equals(this.report, other.getReport()))) &&
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getReport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitRprtType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "debitInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
