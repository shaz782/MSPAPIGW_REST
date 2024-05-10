/**
 * GetPreferredMSISDNSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class GetPreferredMSISDNSResponse  implements java.io.Serializable {
    private java.math.BigInteger networkID;

    private java.lang.String[] MSISDNList;

    public GetPreferredMSISDNSResponse() {
    }

    public GetPreferredMSISDNSResponse(
           java.math.BigInteger networkID,
           java.lang.String[] MSISDNList) {
           this.networkID = networkID;
           this.MSISDNList = MSISDNList;
    }


    /**
     * Gets the networkID value for this GetPreferredMSISDNSResponse.
     * 
     * @return networkID
     */
    public java.math.BigInteger getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this GetPreferredMSISDNSResponse.
     * 
     * @param networkID
     */
    public void setNetworkID(java.math.BigInteger networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the MSISDNList value for this GetPreferredMSISDNSResponse.
     * 
     * @return MSISDNList
     */
    public java.lang.String[] getMSISDNList() {
        return MSISDNList;
    }


    /**
     * Sets the MSISDNList value for this GetPreferredMSISDNSResponse.
     * 
     * @param MSISDNList
     */
    public void setMSISDNList(java.lang.String[] MSISDNList) {
        this.MSISDNList = MSISDNList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPreferredMSISDNSResponse)) return false;
        GetPreferredMSISDNSResponse other = (GetPreferredMSISDNSResponse) obj;
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
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.MSISDNList==null && other.getMSISDNList()==null) || 
             (this.MSISDNList!=null &&
              java.util.Arrays.equals(this.MSISDNList, other.getMSISDNList())));
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
        if (getMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSISDNList(), i);
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
        new org.apache.axis.description.TypeDesc(GetPreferredMSISDNSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "GetPreferredMSISDNSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "MSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "MSISDNType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "MSISDN"));
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
