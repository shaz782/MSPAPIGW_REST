/**
 * TaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class TaxType  implements java.io.Serializable {
    private java.lang.String tax1;

    private java.lang.String tax2;

    public TaxType() {
    }

    public TaxType(
           java.lang.String tax1,
           java.lang.String tax2) {
           this.tax1 = tax1;
           this.tax2 = tax2;
    }


    /**
     * Gets the tax1 value for this TaxType.
     * 
     * @return tax1
     */
    public java.lang.String getTax1() {
        return tax1;
    }


    /**
     * Sets the tax1 value for this TaxType.
     * 
     * @param tax1
     */
    public void setTax1(java.lang.String tax1) {
        this.tax1 = tax1;
    }


    /**
     * Gets the tax2 value for this TaxType.
     * 
     * @return tax2
     */
    public java.lang.String getTax2() {
        return tax2;
    }


    /**
     * Sets the tax2 value for this TaxType.
     * 
     * @param tax2
     */
    public void setTax2(java.lang.String tax2) {
        this.tax2 = tax2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxType)) return false;
        TaxType other = (TaxType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tax1==null && other.getTax1()==null) || 
             (this.tax1!=null &&
              this.tax1.equals(other.getTax1()))) &&
            ((this.tax2==null && other.getTax2()==null) || 
             (this.tax2!=null &&
              this.tax2.equals(other.getTax2())));
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
        if (getTax1() != null) {
            _hashCode += getTax1().hashCode();
        }
        if (getTax2() != null) {
            _hashCode += getTax2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tax1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tax2"));
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
