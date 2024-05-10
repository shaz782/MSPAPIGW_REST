/**
 * PersistenceManageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class PersistenceManageRequest  implements java.io.Serializable {
    private com.xius.agent.smf.SMFManagement_xsd.PersistenceManage persistenceManageType;

    public PersistenceManageRequest() {
    }

    public PersistenceManageRequest(
           com.xius.agent.smf.SMFManagement_xsd.PersistenceManage persistenceManageType) {
           this.persistenceManageType = persistenceManageType;
    }


    /**
     * Gets the persistenceManageType value for this PersistenceManageRequest.
     * 
     * @return persistenceManageType
     */
    public com.xius.agent.smf.SMFManagement_xsd.PersistenceManage getPersistenceManageType() {
        return persistenceManageType;
    }


    /**
     * Sets the persistenceManageType value for this PersistenceManageRequest.
     * 
     * @param persistenceManageType
     */
    public void setPersistenceManageType(com.xius.agent.smf.SMFManagement_xsd.PersistenceManage persistenceManageType) {
        this.persistenceManageType = persistenceManageType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersistenceManageRequest)) return false;
        PersistenceManageRequest other = (PersistenceManageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.persistenceManageType==null && other.getPersistenceManageType()==null) || 
             (this.persistenceManageType!=null &&
              this.persistenceManageType.equals(other.getPersistenceManageType())));
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
        if (getPersistenceManageType() != null) {
            _hashCode += getPersistenceManageType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersistenceManageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersistenceManageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistenceManageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "persistenceManageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersistenceManage"));
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
