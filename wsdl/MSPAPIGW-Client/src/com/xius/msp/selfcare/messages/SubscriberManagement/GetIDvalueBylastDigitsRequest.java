/**
 * GetIDvalueBylastDigitsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetIDvalueBylastDigitsRequest  implements java.io.Serializable {
    private java.lang.String IDType;

    private java.lang.String last5DigitsOfIDValue;

    private java.lang.String lastName;

    public GetIDvalueBylastDigitsRequest() {
    }

    public GetIDvalueBylastDigitsRequest(
           java.lang.String IDType,
           java.lang.String last5DigitsOfIDValue,
           java.lang.String lastName) {
           this.IDType = IDType;
           this.last5DigitsOfIDValue = last5DigitsOfIDValue;
           this.lastName = lastName;
    }


    /**
     * Gets the IDType value for this GetIDvalueBylastDigitsRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this GetIDvalueBylastDigitsRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the last5DigitsOfIDValue value for this GetIDvalueBylastDigitsRequest.
     * 
     * @return last5DigitsOfIDValue
     */
    public java.lang.String getLast5DigitsOfIDValue() {
        return last5DigitsOfIDValue;
    }


    /**
     * Sets the last5DigitsOfIDValue value for this GetIDvalueBylastDigitsRequest.
     * 
     * @param last5DigitsOfIDValue
     */
    public void setLast5DigitsOfIDValue(java.lang.String last5DigitsOfIDValue) {
        this.last5DigitsOfIDValue = last5DigitsOfIDValue;
    }


    /**
     * Gets the lastName value for this GetIDvalueBylastDigitsRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this GetIDvalueBylastDigitsRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetIDvalueBylastDigitsRequest)) return false;
        GetIDvalueBylastDigitsRequest other = (GetIDvalueBylastDigitsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.last5DigitsOfIDValue==null && other.getLast5DigitsOfIDValue()==null) || 
             (this.last5DigitsOfIDValue!=null &&
              this.last5DigitsOfIDValue.equals(other.getLast5DigitsOfIDValue()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName())));
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
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getLast5DigitsOfIDValue() != null) {
            _hashCode += getLast5DigitsOfIDValue().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetIDvalueBylastDigitsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last5DigitsOfIDValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "last5DigitsOfIDValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "lastName "));
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
