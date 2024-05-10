/**
 * PackDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class PackDetailsType  implements java.io.Serializable {
    private java.lang.String packExpDate;

    private java.lang.String packName;

    private java.lang.String packType;

    private java.lang.String publicityId;

    public PackDetailsType() {
    }

    public PackDetailsType(
           java.lang.String packExpDate,
           java.lang.String packName,
           java.lang.String packType,
           java.lang.String publicityId) {
           this.packExpDate = packExpDate;
           this.packName = packName;
           this.packType = packType;
           this.publicityId = publicityId;
    }


    /**
     * Gets the packExpDate value for this PackDetailsType.
     * 
     * @return packExpDate
     */
    public java.lang.String getPackExpDate() {
        return packExpDate;
    }


    /**
     * Sets the packExpDate value for this PackDetailsType.
     * 
     * @param packExpDate
     */
    public void setPackExpDate(java.lang.String packExpDate) {
        this.packExpDate = packExpDate;
    }


    /**
     * Gets the packName value for this PackDetailsType.
     * 
     * @return packName
     */
    public java.lang.String getPackName() {
        return packName;
    }


    /**
     * Sets the packName value for this PackDetailsType.
     * 
     * @param packName
     */
    public void setPackName(java.lang.String packName) {
        this.packName = packName;
    }


    /**
     * Gets the packType value for this PackDetailsType.
     * 
     * @return packType
     */
    public java.lang.String getPackType() {
        return packType;
    }


    /**
     * Sets the packType value for this PackDetailsType.
     * 
     * @param packType
     */
    public void setPackType(java.lang.String packType) {
        this.packType = packType;
    }


    /**
     * Gets the publicityId value for this PackDetailsType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this PackDetailsType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackDetailsType)) return false;
        PackDetailsType other = (PackDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packExpDate==null && other.getPackExpDate()==null) || 
             (this.packExpDate!=null &&
              this.packExpDate.equals(other.getPackExpDate()))) &&
            ((this.packName==null && other.getPackName()==null) || 
             (this.packName!=null &&
              this.packName.equals(other.getPackName()))) &&
            ((this.packType==null && other.getPackType()==null) || 
             (this.packType!=null &&
              this.packType.equals(other.getPackType()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId())));
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
        if (getPackExpDate() != null) {
            _hashCode += getPackExpDate().hashCode();
        }
        if (getPackName() != null) {
            _hashCode += getPackName().hashCode();
        }
        if (getPackType() != null) {
            _hashCode += getPackType().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "publicityId"));
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
