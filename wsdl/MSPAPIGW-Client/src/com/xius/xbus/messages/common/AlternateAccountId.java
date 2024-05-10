/**
 * AlternateAccountId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class AlternateAccountId  implements java.io.Serializable {
    private java.lang.Object alternateAccountId1;

    private java.lang.Object alternateAccountId2;

    private java.lang.Object alternateAccountId3;

    private java.lang.Object alternateAccountId4;

    public AlternateAccountId() {
    }

    public AlternateAccountId(
           java.lang.Object alternateAccountId1,
           java.lang.Object alternateAccountId2,
           java.lang.Object alternateAccountId3,
           java.lang.Object alternateAccountId4) {
           this.alternateAccountId1 = alternateAccountId1;
           this.alternateAccountId2 = alternateAccountId2;
           this.alternateAccountId3 = alternateAccountId3;
           this.alternateAccountId4 = alternateAccountId4;
    }


    /**
     * Gets the alternateAccountId1 value for this AlternateAccountId.
     * 
     * @return alternateAccountId1
     */
    public java.lang.Object getAlternateAccountId1() {
        return alternateAccountId1;
    }


    /**
     * Sets the alternateAccountId1 value for this AlternateAccountId.
     * 
     * @param alternateAccountId1
     */
    public void setAlternateAccountId1(java.lang.Object alternateAccountId1) {
        this.alternateAccountId1 = alternateAccountId1;
    }


    /**
     * Gets the alternateAccountId2 value for this AlternateAccountId.
     * 
     * @return alternateAccountId2
     */
    public java.lang.Object getAlternateAccountId2() {
        return alternateAccountId2;
    }


    /**
     * Sets the alternateAccountId2 value for this AlternateAccountId.
     * 
     * @param alternateAccountId2
     */
    public void setAlternateAccountId2(java.lang.Object alternateAccountId2) {
        this.alternateAccountId2 = alternateAccountId2;
    }


    /**
     * Gets the alternateAccountId3 value for this AlternateAccountId.
     * 
     * @return alternateAccountId3
     */
    public java.lang.Object getAlternateAccountId3() {
        return alternateAccountId3;
    }


    /**
     * Sets the alternateAccountId3 value for this AlternateAccountId.
     * 
     * @param alternateAccountId3
     */
    public void setAlternateAccountId3(java.lang.Object alternateAccountId3) {
        this.alternateAccountId3 = alternateAccountId3;
    }


    /**
     * Gets the alternateAccountId4 value for this AlternateAccountId.
     * 
     * @return alternateAccountId4
     */
    public java.lang.Object getAlternateAccountId4() {
        return alternateAccountId4;
    }


    /**
     * Sets the alternateAccountId4 value for this AlternateAccountId.
     * 
     * @param alternateAccountId4
     */
    public void setAlternateAccountId4(java.lang.Object alternateAccountId4) {
        this.alternateAccountId4 = alternateAccountId4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternateAccountId)) return false;
        AlternateAccountId other = (AlternateAccountId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternateAccountId1==null && other.getAlternateAccountId1()==null) || 
             (this.alternateAccountId1!=null &&
              this.alternateAccountId1.equals(other.getAlternateAccountId1()))) &&
            ((this.alternateAccountId2==null && other.getAlternateAccountId2()==null) || 
             (this.alternateAccountId2!=null &&
              this.alternateAccountId2.equals(other.getAlternateAccountId2()))) &&
            ((this.alternateAccountId3==null && other.getAlternateAccountId3()==null) || 
             (this.alternateAccountId3!=null &&
              this.alternateAccountId3.equals(other.getAlternateAccountId3()))) &&
            ((this.alternateAccountId4==null && other.getAlternateAccountId4()==null) || 
             (this.alternateAccountId4!=null &&
              this.alternateAccountId4.equals(other.getAlternateAccountId4())));
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
        if (getAlternateAccountId1() != null) {
            _hashCode += getAlternateAccountId1().hashCode();
        }
        if (getAlternateAccountId2() != null) {
            _hashCode += getAlternateAccountId2().hashCode();
        }
        if (getAlternateAccountId3() != null) {
            _hashCode += getAlternateAccountId3().hashCode();
        }
        if (getAlternateAccountId4() != null) {
            _hashCode += getAlternateAccountId4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternateAccountId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AlternateAccountId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "alternateAccountId1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "alternateAccountId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "alternateAccountId3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAccountId4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "alternateAccountId4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
