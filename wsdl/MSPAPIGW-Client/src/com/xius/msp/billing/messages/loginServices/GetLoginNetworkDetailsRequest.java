/**
 * GetLoginNetworkDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetLoginNetworkDetailsRequest  implements java.io.Serializable {
    private java.math.BigInteger networkID;

    public GetLoginNetworkDetailsRequest() {
    }

    public GetLoginNetworkDetailsRequest(
           java.math.BigInteger networkID) {
           this.networkID = networkID;
    }


    /**
     * Gets the networkID value for this GetLoginNetworkDetailsRequest.
     * 
     * @return networkID
     */
    public java.math.BigInteger getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this GetLoginNetworkDetailsRequest.
     * 
     * @param networkID
     */
    public void setNetworkID(java.math.BigInteger networkID) {
        this.networkID = networkID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLoginNetworkDetailsRequest)) return false;
        GetLoginNetworkDetailsRequest other = (GetLoginNetworkDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID())));
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
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLoginNetworkDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
