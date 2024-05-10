/**
 * ActvdMSISDNsReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class ActvdMSISDNsReportResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsDataType[] actvdMSISDNsReportList;

    private java.lang.Long totalRecords;

    public ActvdMSISDNsReportResponse() {
    }

    public ActvdMSISDNsReportResponse(
           java.lang.String message,
           com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsDataType[] actvdMSISDNsReportList,
           java.lang.Long totalRecords) {
           this.message = message;
           this.actvdMSISDNsReportList = actvdMSISDNsReportList;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the message value for this ActvdMSISDNsReportResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ActvdMSISDNsReportResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the actvdMSISDNsReportList value for this ActvdMSISDNsReportResponse.
     * 
     * @return actvdMSISDNsReportList
     */
    public com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsDataType[] getActvdMSISDNsReportList() {
        return actvdMSISDNsReportList;
    }


    /**
     * Sets the actvdMSISDNsReportList value for this ActvdMSISDNsReportResponse.
     * 
     * @param actvdMSISDNsReportList
     */
    public void setActvdMSISDNsReportList(com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsDataType[] actvdMSISDNsReportList) {
        this.actvdMSISDNsReportList = actvdMSISDNsReportList;
    }


    /**
     * Gets the totalRecords value for this ActvdMSISDNsReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this ActvdMSISDNsReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActvdMSISDNsReportResponse)) return false;
        ActvdMSISDNsReportResponse other = (ActvdMSISDNsReportResponse) obj;
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
            ((this.actvdMSISDNsReportList==null && other.getActvdMSISDNsReportList()==null) || 
             (this.actvdMSISDNsReportList!=null &&
              java.util.Arrays.equals(this.actvdMSISDNsReportList, other.getActvdMSISDNsReportList()))) &&
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
        if (getActvdMSISDNsReportList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActvdMSISDNsReportList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActvdMSISDNsReportList(), i);
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
        new org.apache.axis.description.TypeDesc(ActvdMSISDNsReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actvdMSISDNsReportList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "actvdMSISDNsReportList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "actvdMSISDNsData"));
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
