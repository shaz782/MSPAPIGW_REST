/**
 * BktDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class BktDtlsType  implements java.io.Serializable {
    private java.lang.String bucket_category;

    private java.lang.String bucket_available_unit;

    private java.lang.String bucket_credited_unit;

    public BktDtlsType() {
    }

    public BktDtlsType(
           java.lang.String bucket_category,
           java.lang.String bucket_available_unit,
           java.lang.String bucket_credited_unit) {
           this.bucket_category = bucket_category;
           this.bucket_available_unit = bucket_available_unit;
           this.bucket_credited_unit = bucket_credited_unit;
    }


    /**
     * Gets the bucket_category value for this BktDtlsType.
     * 
     * @return bucket_category
     */
    public java.lang.String getBucket_category() {
        return bucket_category;
    }


    /**
     * Sets the bucket_category value for this BktDtlsType.
     * 
     * @param bucket_category
     */
    public void setBucket_category(java.lang.String bucket_category) {
        this.bucket_category = bucket_category;
    }


    /**
     * Gets the bucket_available_unit value for this BktDtlsType.
     * 
     * @return bucket_available_unit
     */
    public java.lang.String getBucket_available_unit() {
        return bucket_available_unit;
    }


    /**
     * Sets the bucket_available_unit value for this BktDtlsType.
     * 
     * @param bucket_available_unit
     */
    public void setBucket_available_unit(java.lang.String bucket_available_unit) {
        this.bucket_available_unit = bucket_available_unit;
    }


    /**
     * Gets the bucket_credited_unit value for this BktDtlsType.
     * 
     * @return bucket_credited_unit
     */
    public java.lang.String getBucket_credited_unit() {
        return bucket_credited_unit;
    }


    /**
     * Sets the bucket_credited_unit value for this BktDtlsType.
     * 
     * @param bucket_credited_unit
     */
    public void setBucket_credited_unit(java.lang.String bucket_credited_unit) {
        this.bucket_credited_unit = bucket_credited_unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BktDtlsType)) return false;
        BktDtlsType other = (BktDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bucket_category==null && other.getBucket_category()==null) || 
             (this.bucket_category!=null &&
              this.bucket_category.equals(other.getBucket_category()))) &&
            ((this.bucket_available_unit==null && other.getBucket_available_unit()==null) || 
             (this.bucket_available_unit!=null &&
              this.bucket_available_unit.equals(other.getBucket_available_unit()))) &&
            ((this.bucket_credited_unit==null && other.getBucket_credited_unit()==null) || 
             (this.bucket_credited_unit!=null &&
              this.bucket_credited_unit.equals(other.getBucket_credited_unit())));
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
        if (getBucket_category() != null) {
            _hashCode += getBucket_category().hashCode();
        }
        if (getBucket_available_unit() != null) {
            _hashCode += getBucket_available_unit().hashCode();
        }
        if (getBucket_credited_unit() != null) {
            _hashCode += getBucket_credited_unit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BktDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bktDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucket_category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucket_category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucket_available_unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucket_available_unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucket_credited_unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucket_credited_unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
