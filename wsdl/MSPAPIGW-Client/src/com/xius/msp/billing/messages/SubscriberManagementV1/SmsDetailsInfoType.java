/**
 * SmsDetailsInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class SmsDetailsInfoType  implements java.io.Serializable {
    private java.lang.String bucketName;

    private java.lang.Long unitsAllocated;

    private java.lang.Long remainingUnits;

    private java.lang.String unitsType;

    public SmsDetailsInfoType() {
    }

    public SmsDetailsInfoType(
           java.lang.String bucketName,
           java.lang.Long unitsAllocated,
           java.lang.Long remainingUnits,
           java.lang.String unitsType) {
           this.bucketName = bucketName;
           this.unitsAllocated = unitsAllocated;
           this.remainingUnits = remainingUnits;
           this.unitsType = unitsType;
    }


    /**
     * Gets the bucketName value for this SmsDetailsInfoType.
     * 
     * @return bucketName
     */
    public java.lang.String getBucketName() {
        return bucketName;
    }


    /**
     * Sets the bucketName value for this SmsDetailsInfoType.
     * 
     * @param bucketName
     */
    public void setBucketName(java.lang.String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * Gets the unitsAllocated value for this SmsDetailsInfoType.
     * 
     * @return unitsAllocated
     */
    public java.lang.Long getUnitsAllocated() {
        return unitsAllocated;
    }


    /**
     * Sets the unitsAllocated value for this SmsDetailsInfoType.
     * 
     * @param unitsAllocated
     */
    public void setUnitsAllocated(java.lang.Long unitsAllocated) {
        this.unitsAllocated = unitsAllocated;
    }


    /**
     * Gets the remainingUnits value for this SmsDetailsInfoType.
     * 
     * @return remainingUnits
     */
    public java.lang.Long getRemainingUnits() {
        return remainingUnits;
    }


    /**
     * Sets the remainingUnits value for this SmsDetailsInfoType.
     * 
     * @param remainingUnits
     */
    public void setRemainingUnits(java.lang.Long remainingUnits) {
        this.remainingUnits = remainingUnits;
    }


    /**
     * Gets the unitsType value for this SmsDetailsInfoType.
     * 
     * @return unitsType
     */
    public java.lang.String getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this SmsDetailsInfoType.
     * 
     * @param unitsType
     */
    public void setUnitsType(java.lang.String unitsType) {
        this.unitsType = unitsType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SmsDetailsInfoType)) return false;
        SmsDetailsInfoType other = (SmsDetailsInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bucketName==null && other.getBucketName()==null) || 
             (this.bucketName!=null &&
              this.bucketName.equals(other.getBucketName()))) &&
            ((this.unitsAllocated==null && other.getUnitsAllocated()==null) || 
             (this.unitsAllocated!=null &&
              this.unitsAllocated.equals(other.getUnitsAllocated()))) &&
            ((this.remainingUnits==null && other.getRemainingUnits()==null) || 
             (this.remainingUnits!=null &&
              this.remainingUnits.equals(other.getRemainingUnits()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType())));
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
        if (getBucketName() != null) {
            _hashCode += getBucketName().hashCode();
        }
        if (getUnitsAllocated() != null) {
            _hashCode += getUnitsAllocated().hashCode();
        }
        if (getRemainingUnits() != null) {
            _hashCode += getRemainingUnits().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmsDetailsInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "smsDetailsInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "bucketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsAllocated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "unitsAllocated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "remainingUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "unitsType"));
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
