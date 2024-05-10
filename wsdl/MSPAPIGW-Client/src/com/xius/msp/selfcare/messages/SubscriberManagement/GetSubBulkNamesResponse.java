/**
 * GetSubBulkNamesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class GetSubBulkNamesResponse  implements java.io.Serializable {
    private com.xius.msp.selfcare.messages.SubscriberManagement.SubsNamesListType[] subsNamesList;

    private java.lang.String[] failedsubsNamesList;

    public GetSubBulkNamesResponse() {
    }

    public GetSubBulkNamesResponse(
           com.xius.msp.selfcare.messages.SubscriberManagement.SubsNamesListType[] subsNamesList,
           java.lang.String[] failedsubsNamesList) {
           this.subsNamesList = subsNamesList;
           this.failedsubsNamesList = failedsubsNamesList;
    }


    /**
     * Gets the subsNamesList value for this GetSubBulkNamesResponse.
     * 
     * @return subsNamesList
     */
    public com.xius.msp.selfcare.messages.SubscriberManagement.SubsNamesListType[] getSubsNamesList() {
        return subsNamesList;
    }


    /**
     * Sets the subsNamesList value for this GetSubBulkNamesResponse.
     * 
     * @param subsNamesList
     */
    public void setSubsNamesList(com.xius.msp.selfcare.messages.SubscriberManagement.SubsNamesListType[] subsNamesList) {
        this.subsNamesList = subsNamesList;
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.SubsNamesListType getSubsNamesList(int i) {
        return this.subsNamesList[i];
    }

    public void setSubsNamesList(int i, com.xius.msp.selfcare.messages.SubscriberManagement.SubsNamesListType _value) {
        this.subsNamesList[i] = _value;
    }


    /**
     * Gets the failedsubsNamesList value for this GetSubBulkNamesResponse.
     * 
     * @return failedsubsNamesList
     */
    public java.lang.String[] getFailedsubsNamesList() {
        return failedsubsNamesList;
    }


    /**
     * Sets the failedsubsNamesList value for this GetSubBulkNamesResponse.
     * 
     * @param failedsubsNamesList
     */
    public void setFailedsubsNamesList(java.lang.String[] failedsubsNamesList) {
        this.failedsubsNamesList = failedsubsNamesList;
    }

    public java.lang.String getFailedsubsNamesList(int i) {
        return this.failedsubsNamesList[i];
    }

    public void setFailedsubsNamesList(int i, java.lang.String _value) {
        this.failedsubsNamesList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubBulkNamesResponse)) return false;
        GetSubBulkNamesResponse other = (GetSubBulkNamesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subsNamesList==null && other.getSubsNamesList()==null) || 
             (this.subsNamesList!=null &&
              java.util.Arrays.equals(this.subsNamesList, other.getSubsNamesList()))) &&
            ((this.failedsubsNamesList==null && other.getFailedsubsNamesList()==null) || 
             (this.failedsubsNamesList!=null &&
              java.util.Arrays.equals(this.failedsubsNamesList, other.getFailedsubsNamesList())));
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
        if (getSubsNamesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsNamesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsNamesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedsubsNamesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedsubsNamesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedsubsNamesList(), i);
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
        new org.apache.axis.description.TypeDesc(GetSubBulkNamesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubBulkNamesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsNamesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "subsNamesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SubsNamesListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedsubsNamesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "failedsubsNamesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
