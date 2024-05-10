/**
 * GetIDvalueBylastDigitsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetIDvalueBylastDigitsResponse  implements java.io.Serializable {
    private java.lang.String IDValue;

    private java.lang.String flag;

    public GetIDvalueBylastDigitsResponse() {
    }

    public GetIDvalueBylastDigitsResponse(
           java.lang.String IDValue,
           java.lang.String flag) {
           this.IDValue = IDValue;
           this.flag = flag;
    }


    /**
     * Gets the IDValue value for this GetIDvalueBylastDigitsResponse.
     * 
     * @return IDValue
     */
    public java.lang.String getIDValue() {
        return IDValue;
    }


    /**
     * Sets the IDValue value for this GetIDvalueBylastDigitsResponse.
     * 
     * @param IDValue
     */
    public void setIDValue(java.lang.String IDValue) {
        this.IDValue = IDValue;
    }


    /**
     * Gets the flag value for this GetIDvalueBylastDigitsResponse.
     * 
     * @return flag
     */
    public java.lang.String getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this GetIDvalueBylastDigitsResponse.
     * 
     * @param flag
     */
    public void setFlag(java.lang.String flag) {
        this.flag = flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIDvalueBylastDigitsResponse)) return false;
        GetIDvalueBylastDigitsResponse other = (GetIDvalueBylastDigitsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDValue==null && other.getIDValue()==null) || 
             (this.IDValue!=null &&
              this.IDValue.equals(other.getIDValue()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag())));
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
        if (getIDValue() != null) {
            _hashCode += getIDValue().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIDvalueBylastDigitsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "flag"));
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
