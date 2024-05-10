/**
 * Bundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;


/**
 * Bundle
 */
public class Bundle  implements java.io.Serializable {
    private java.lang.String bundleId;

    private java.lang.String bundleName;

    public Bundle() {
    }

    public Bundle(
           java.lang.String bundleId,
           java.lang.String bundleName) {
           this.bundleId = bundleId;
           this.bundleName = bundleName;
    }


    /**
     * Gets the bundleId value for this Bundle.
     * 
     * @return bundleId
     */
    public java.lang.String getBundleId() {
        return bundleId;
    }


    /**
     * Sets the bundleId value for this Bundle.
     * 
     * @param bundleId
     */
    public void setBundleId(java.lang.String bundleId) {
        this.bundleId = bundleId;
    }


    /**
     * Gets the bundleName value for this Bundle.
     * 
     * @return bundleName
     */
    public java.lang.String getBundleName() {
        return bundleName;
    }


    /**
     * Sets the bundleName value for this Bundle.
     * 
     * @param bundleName
     */
    public void setBundleName(java.lang.String bundleName) {
        this.bundleName = bundleName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bundle)) return false;
        Bundle other = (Bundle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bundleId==null && other.getBundleId()==null) || 
             (this.bundleId!=null &&
              this.bundleId.equals(other.getBundleId()))) &&
            ((this.bundleName==null && other.getBundleName()==null) || 
             (this.bundleName!=null &&
              this.bundleName.equals(other.getBundleName())));
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
        if (getBundleId() != null) {
            _hashCode += getBundleId().hashCode();
        }
        if (getBundleName() != null) {
            _hashCode += getBundleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "Bundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
