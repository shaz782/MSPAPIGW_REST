/**
 * CrossPromoTransReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class CrossPromoTransReportResponse  implements java.io.Serializable {
    private java.lang.Long totalRecords;

    private com.xius.msp.billing.messages.reportManagement.CrossPromoTransDtls[] crossPromoTransDtls;

    public CrossPromoTransReportResponse() {
    }

    public CrossPromoTransReportResponse(
           java.lang.Long totalRecords,
           com.xius.msp.billing.messages.reportManagement.CrossPromoTransDtls[] crossPromoTransDtls) {
           this.totalRecords = totalRecords;
           this.crossPromoTransDtls = crossPromoTransDtls;
    }


    /**
     * Gets the totalRecords value for this CrossPromoTransReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this CrossPromoTransReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the crossPromoTransDtls value for this CrossPromoTransReportResponse.
     * 
     * @return crossPromoTransDtls
     */
    public com.xius.msp.billing.messages.reportManagement.CrossPromoTransDtls[] getCrossPromoTransDtls() {
        return crossPromoTransDtls;
    }


    /**
     * Sets the crossPromoTransDtls value for this CrossPromoTransReportResponse.
     * 
     * @param crossPromoTransDtls
     */
    public void setCrossPromoTransDtls(com.xius.msp.billing.messages.reportManagement.CrossPromoTransDtls[] crossPromoTransDtls) {
        this.crossPromoTransDtls = crossPromoTransDtls;
    }

    public com.xius.msp.billing.messages.reportManagement.CrossPromoTransDtls getCrossPromoTransDtls(int i) {
        return this.crossPromoTransDtls[i];
    }

    public void setCrossPromoTransDtls(int i, com.xius.msp.billing.messages.reportManagement.CrossPromoTransDtls _value) {
        this.crossPromoTransDtls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrossPromoTransReportResponse)) return false;
        CrossPromoTransReportResponse other = (CrossPromoTransReportResponse) obj;
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
            ((this.crossPromoTransDtls==null && other.getCrossPromoTransDtls()==null) || 
             (this.crossPromoTransDtls!=null &&
              java.util.Arrays.equals(this.crossPromoTransDtls, other.getCrossPromoTransDtls())));
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
        if (getCrossPromoTransDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrossPromoTransDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrossPromoTransDtls(), i);
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
        new org.apache.axis.description.TypeDesc(CrossPromoTransReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossPromoTransDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "crossPromoTransDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransDtls"));
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
