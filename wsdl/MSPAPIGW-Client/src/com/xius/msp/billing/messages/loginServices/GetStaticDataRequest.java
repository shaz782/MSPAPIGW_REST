/**
 * GetStaticDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetStaticDataRequest  implements java.io.Serializable {
    private boolean MSISDNPrefixReqd;

    private boolean idTypeReqd;

    public GetStaticDataRequest() {
    }

    public GetStaticDataRequest(
           boolean MSISDNPrefixReqd,
           boolean idTypeReqd) {
           this.MSISDNPrefixReqd = MSISDNPrefixReqd;
           this.idTypeReqd = idTypeReqd;
    }


    /**
     * Gets the MSISDNPrefixReqd value for this GetStaticDataRequest.
     * 
     * @return MSISDNPrefixReqd
     */
    public boolean isMSISDNPrefixReqd() {
        return MSISDNPrefixReqd;
    }


    /**
     * Sets the MSISDNPrefixReqd value for this GetStaticDataRequest.
     * 
     * @param MSISDNPrefixReqd
     */
    public void setMSISDNPrefixReqd(boolean MSISDNPrefixReqd) {
        this.MSISDNPrefixReqd = MSISDNPrefixReqd;
    }


    /**
     * Gets the idTypeReqd value for this GetStaticDataRequest.
     * 
     * @return idTypeReqd
     */
    public boolean isIdTypeReqd() {
        return idTypeReqd;
    }


    /**
     * Sets the idTypeReqd value for this GetStaticDataRequest.
     * 
     * @param idTypeReqd
     */
    public void setIdTypeReqd(boolean idTypeReqd) {
        this.idTypeReqd = idTypeReqd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaticDataRequest)) return false;
        GetStaticDataRequest other = (GetStaticDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.MSISDNPrefixReqd == other.isMSISDNPrefixReqd() &&
            this.idTypeReqd == other.isIdTypeReqd();
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
        _hashCode += (isMSISDNPrefixReqd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIdTypeReqd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStaticDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetStaticDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDNPrefixReqd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNPrefixReqd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTypeReqd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IdTypeReqd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
