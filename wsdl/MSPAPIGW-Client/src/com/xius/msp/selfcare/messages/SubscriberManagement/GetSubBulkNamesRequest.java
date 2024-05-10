/**
 * GetSubBulkNamesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetSubBulkNamesRequest  implements java.io.Serializable {
    private java.lang.String[] idNoList;

    public GetSubBulkNamesRequest() {
    }

    public GetSubBulkNamesRequest(
           java.lang.String[] idNoList) {
           this.idNoList = idNoList;
    }


    /**
     * Gets the idNoList value for this GetSubBulkNamesRequest.
     * 
     * @return idNoList
     */
    public java.lang.String[] getIdNoList() {
        return idNoList;
    }


    /**
     * Sets the idNoList value for this GetSubBulkNamesRequest.
     * 
     * @param idNoList
     */
    public void setIdNoList(java.lang.String[] idNoList) {
        this.idNoList = idNoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubBulkNamesRequest)) return false;
        GetSubBulkNamesRequest other = (GetSubBulkNamesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idNoList==null && other.getIdNoList()==null) || 
             (this.idNoList!=null &&
              java.util.Arrays.equals(this.idNoList, other.getIdNoList())));
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
        if (getIdNoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdNoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdNoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetSubBulkNamesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubBulkNamesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "idNoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDNoType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IdNo"));
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
