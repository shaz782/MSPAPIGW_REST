/**
 * ViewTransDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class ViewTransDetailsRequest  implements java.io.Serializable {
    private com.xius.agent.smf.SMFManagement_xsd.DatesBetweenType transdates;

    private java.lang.String transNumber;

    public ViewTransDetailsRequest() {
    }

    public ViewTransDetailsRequest(
           com.xius.agent.smf.SMFManagement_xsd.DatesBetweenType transdates,
           java.lang.String transNumber) {
           this.transdates = transdates;
           this.transNumber = transNumber;
    }


    /**
     * Gets the transdates value for this ViewTransDetailsRequest.
     * 
     * @return transdates
     */
    public com.xius.agent.smf.SMFManagement_xsd.DatesBetweenType getTransdates() {
        return transdates;
    }


    /**
     * Sets the transdates value for this ViewTransDetailsRequest.
     * 
     * @param transdates
     */
    public void setTransdates(com.xius.agent.smf.SMFManagement_xsd.DatesBetweenType transdates) {
        this.transdates = transdates;
    }


    /**
     * Gets the transNumber value for this ViewTransDetailsRequest.
     * 
     * @return transNumber
     */
    public java.lang.String getTransNumber() {
        return transNumber;
    }


    /**
     * Sets the transNumber value for this ViewTransDetailsRequest.
     * 
     * @param transNumber
     */
    public void setTransNumber(java.lang.String transNumber) {
        this.transNumber = transNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewTransDetailsRequest)) return false;
        ViewTransDetailsRequest other = (ViewTransDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transdates==null && other.getTransdates()==null) || 
             (this.transdates!=null &&
              this.transdates.equals(other.getTransdates()))) &&
            ((this.transNumber==null && other.getTransNumber()==null) || 
             (this.transNumber!=null &&
              this.transNumber.equals(other.getTransNumber())));
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
        if (getTransdates() != null) {
            _hashCode += getTransdates().hashCode();
        }
        if (getTransNumber() != null) {
            _hashCode += getTransNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ViewTransDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transdates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Transdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DatesBetweenType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransNumber"));
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
