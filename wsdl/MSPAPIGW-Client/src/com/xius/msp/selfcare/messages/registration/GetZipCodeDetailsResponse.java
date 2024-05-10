/**
 * GetZipCodeDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class GetZipCodeDetailsResponse  implements java.io.Serializable {
    private com.xius.msp.selfcare.messages.registration.ZipCodeDetailsType[] zipCodeDetailsList;

    public GetZipCodeDetailsResponse() {
    }

    public GetZipCodeDetailsResponse(
           com.xius.msp.selfcare.messages.registration.ZipCodeDetailsType[] zipCodeDetailsList) {
           this.zipCodeDetailsList = zipCodeDetailsList;
    }


    /**
     * Gets the zipCodeDetailsList value for this GetZipCodeDetailsResponse.
     * 
     * @return zipCodeDetailsList
     */
    public com.xius.msp.selfcare.messages.registration.ZipCodeDetailsType[] getZipCodeDetailsList() {
        return zipCodeDetailsList;
    }


    /**
     * Sets the zipCodeDetailsList value for this GetZipCodeDetailsResponse.
     * 
     * @param zipCodeDetailsList
     */
    public void setZipCodeDetailsList(com.xius.msp.selfcare.messages.registration.ZipCodeDetailsType[] zipCodeDetailsList) {
        this.zipCodeDetailsList = zipCodeDetailsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZipCodeDetailsResponse)) return false;
        GetZipCodeDetailsResponse other = (GetZipCodeDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zipCodeDetailsList==null && other.getZipCodeDetailsList()==null) || 
             (this.zipCodeDetailsList!=null &&
              java.util.Arrays.equals(this.zipCodeDetailsList, other.getZipCodeDetailsList())));
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
        if (getZipCodeDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZipCodeDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZipCodeDetailsList(), i);
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
        new org.apache.axis.description.TypeDesc(GetZipCodeDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "GetZipCodeDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCodeDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "zipCodeDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "ZipCodeDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "zipCodeDetails"));
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
