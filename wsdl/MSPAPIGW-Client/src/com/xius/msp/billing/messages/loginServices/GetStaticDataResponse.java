/**
 * GetStaticDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetStaticDataResponse  implements java.io.Serializable {
    private java.lang.String[] MSISDNSPrefixList;

    private java.lang.String[] IDTypeList;

    public GetStaticDataResponse() {
    }

    public GetStaticDataResponse(
           java.lang.String[] MSISDNSPrefixList,
           java.lang.String[] IDTypeList) {
           this.MSISDNSPrefixList = MSISDNSPrefixList;
           this.IDTypeList = IDTypeList;
    }


    /**
     * Gets the MSISDNSPrefixList value for this GetStaticDataResponse.
     * 
     * @return MSISDNSPrefixList
     */
    public java.lang.String[] getMSISDNSPrefixList() {
        return MSISDNSPrefixList;
    }


    /**
     * Sets the MSISDNSPrefixList value for this GetStaticDataResponse.
     * 
     * @param MSISDNSPrefixList
     */
    public void setMSISDNSPrefixList(java.lang.String[] MSISDNSPrefixList) {
        this.MSISDNSPrefixList = MSISDNSPrefixList;
    }


    /**
     * Gets the IDTypeList value for this GetStaticDataResponse.
     * 
     * @return IDTypeList
     */
    public java.lang.String[] getIDTypeList() {
        return IDTypeList;
    }


    /**
     * Sets the IDTypeList value for this GetStaticDataResponse.
     * 
     * @param IDTypeList
     */
    public void setIDTypeList(java.lang.String[] IDTypeList) {
        this.IDTypeList = IDTypeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaticDataResponse)) return false;
        GetStaticDataResponse other = (GetStaticDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDNSPrefixList==null && other.getMSISDNSPrefixList()==null) || 
             (this.MSISDNSPrefixList!=null &&
              java.util.Arrays.equals(this.MSISDNSPrefixList, other.getMSISDNSPrefixList()))) &&
            ((this.IDTypeList==null && other.getIDTypeList()==null) || 
             (this.IDTypeList!=null &&
              java.util.Arrays.equals(this.IDTypeList, other.getIDTypeList())));
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
        if (getMSISDNSPrefixList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSISDNSPrefixList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSISDNSPrefixList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIDTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIDTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIDTypeList(), i);
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
        new org.apache.axis.description.TypeDesc(GetStaticDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetStaticDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDNSPrefixList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNSPrefixList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNSPrefix"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDType"));
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
