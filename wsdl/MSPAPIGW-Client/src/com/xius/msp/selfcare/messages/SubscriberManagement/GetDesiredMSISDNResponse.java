/**
 * GetDesiredMSISDNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetDesiredMSISDNResponse  implements java.io.Serializable {
    private java.lang.String[] desiredMSISDNs;

    public GetDesiredMSISDNResponse() {
    }

    public GetDesiredMSISDNResponse(
           java.lang.String[] desiredMSISDNs) {
           this.desiredMSISDNs = desiredMSISDNs;
    }


    /**
     * Gets the desiredMSISDNs value for this GetDesiredMSISDNResponse.
     * 
     * @return desiredMSISDNs
     */
    public java.lang.String[] getDesiredMSISDNs() {
        return desiredMSISDNs;
    }


    /**
     * Sets the desiredMSISDNs value for this GetDesiredMSISDNResponse.
     * 
     * @param desiredMSISDNs
     */
    public void setDesiredMSISDNs(java.lang.String[] desiredMSISDNs) {
        this.desiredMSISDNs = desiredMSISDNs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDesiredMSISDNResponse)) return false;
        GetDesiredMSISDNResponse other = (GetDesiredMSISDNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.desiredMSISDNs==null && other.getDesiredMSISDNs()==null) || 
             (this.desiredMSISDNs!=null &&
              java.util.Arrays.equals(this.desiredMSISDNs, other.getDesiredMSISDNs())));
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
        if (getDesiredMSISDNs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesiredMSISDNs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDesiredMSISDNs(), i);
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
        new org.apache.axis.description.TypeDesc(GetDesiredMSISDNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetDesiredMSISDNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desiredMSISDNs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "desiredMSISDNs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "DesiredMSISDNs"));
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
