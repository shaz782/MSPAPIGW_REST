/**
 * VchrPINStatusReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class VchrPINStatusReportResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.billing.messages.reportManagement.VoucherDataType[] vchrPINStatusList;

    private java.lang.Long totalRecords;

    public VchrPINStatusReportResponse() {
    }

    public VchrPINStatusReportResponse(
           java.lang.String message,
           com.xius.msp.billing.messages.reportManagement.VoucherDataType[] vchrPINStatusList,
           java.lang.Long totalRecords) {
           this.message = message;
           this.vchrPINStatusList = vchrPINStatusList;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the message value for this VchrPINStatusReportResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this VchrPINStatusReportResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the vchrPINStatusList value for this VchrPINStatusReportResponse.
     * 
     * @return vchrPINStatusList
     */
    public com.xius.msp.billing.messages.reportManagement.VoucherDataType[] getVchrPINStatusList() {
        return vchrPINStatusList;
    }


    /**
     * Sets the vchrPINStatusList value for this VchrPINStatusReportResponse.
     * 
     * @param vchrPINStatusList
     */
    public void setVchrPINStatusList(com.xius.msp.billing.messages.reportManagement.VoucherDataType[] vchrPINStatusList) {
        this.vchrPINStatusList = vchrPINStatusList;
    }


    /**
     * Gets the totalRecords value for this VchrPINStatusReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this VchrPINStatusReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VchrPINStatusReportResponse)) return false;
        VchrPINStatusReportResponse other = (VchrPINStatusReportResponse) obj;
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
            ((this.vchrPINStatusList==null && other.getVchrPINStatusList()==null) || 
             (this.vchrPINStatusList!=null &&
              java.util.Arrays.equals(this.vchrPINStatusList, other.getVchrPINStatusList()))) &&
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
        if (getVchrPINStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVchrPINStatusList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVchrPINStatusList(), i);
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
        new org.apache.axis.description.TypeDesc(VchrPINStatusReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VchrPINStatusReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vchrPINStatusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "vchrPINStatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherData"));
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
