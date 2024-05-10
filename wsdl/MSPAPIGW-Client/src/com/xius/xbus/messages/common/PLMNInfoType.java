/**
 * PLMNInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class PLMNInfoType  implements java.io.Serializable {
    private java.lang.String PLMNId;

    private java.lang.String PLMNName;

    public PLMNInfoType() {
    }

    public PLMNInfoType(
           java.lang.String PLMNId,
           java.lang.String PLMNName) {
           this.PLMNId = PLMNId;
           this.PLMNName = PLMNName;
    }


    /**
     * Gets the PLMNId value for this PLMNInfoType.
     * 
     * @return PLMNId
     */
    public java.lang.String getPLMNId() {
        return PLMNId;
    }


    /**
     * Sets the PLMNId value for this PLMNInfoType.
     * 
     * @param PLMNId
     */
    public void setPLMNId(java.lang.String PLMNId) {
        this.PLMNId = PLMNId;
    }


    /**
     * Gets the PLMNName value for this PLMNInfoType.
     * 
     * @return PLMNName
     */
    public java.lang.String getPLMNName() {
        return PLMNName;
    }


    /**
     * Sets the PLMNName value for this PLMNInfoType.
     * 
     * @param PLMNName
     */
    public void setPLMNName(java.lang.String PLMNName) {
        this.PLMNName = PLMNName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PLMNInfoType)) return false;
        PLMNInfoType other = (PLMNInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PLMNId==null && other.getPLMNId()==null) || 
             (this.PLMNId!=null &&
              this.PLMNId.equals(other.getPLMNId()))) &&
            ((this.PLMNName==null && other.getPLMNName()==null) || 
             (this.PLMNName!=null &&
              this.PLMNName.equals(other.getPLMNName())));
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
        if (getPLMNId() != null) {
            _hashCode += getPLMNId().hashCode();
        }
        if (getPLMNName() != null) {
            _hashCode += getPLMNName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PLMNInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PLMNInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLMNId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PLMNId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLMNName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PLMNName"));
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
