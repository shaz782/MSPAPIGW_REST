/**
 * SubcategoryDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class SubcategoryDtlsType  implements java.io.Serializable {
    private java.math.BigInteger categoryId;

    private java.lang.String categoryName;

    private java.lang.String categoryDesc;

    public SubcategoryDtlsType() {
    }

    public SubcategoryDtlsType(
           java.math.BigInteger categoryId,
           java.lang.String categoryName,
           java.lang.String categoryDesc) {
           this.categoryId = categoryId;
           this.categoryName = categoryName;
           this.categoryDesc = categoryDesc;
    }


    /**
     * Gets the categoryId value for this SubcategoryDtlsType.
     * 
     * @return categoryId
     */
    public java.math.BigInteger getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this SubcategoryDtlsType.
     * 
     * @param categoryId
     */
    public void setCategoryId(java.math.BigInteger categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the categoryName value for this SubcategoryDtlsType.
     * 
     * @return categoryName
     */
    public java.lang.String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this SubcategoryDtlsType.
     * 
     * @param categoryName
     */
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * Gets the categoryDesc value for this SubcategoryDtlsType.
     * 
     * @return categoryDesc
     */
    public java.lang.String getCategoryDesc() {
        return categoryDesc;
    }


    /**
     * Sets the categoryDesc value for this SubcategoryDtlsType.
     * 
     * @param categoryDesc
     */
    public void setCategoryDesc(java.lang.String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubcategoryDtlsType)) return false;
        SubcategoryDtlsType other = (SubcategoryDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryId==null && other.getCategoryId()==null) || 
             (this.categoryId!=null &&
              this.categoryId.equals(other.getCategoryId()))) &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName()))) &&
            ((this.categoryDesc==null && other.getCategoryDesc()==null) || 
             (this.categoryDesc!=null &&
              this.categoryDesc.equals(other.getCategoryDesc())));
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
        if (getCategoryId() != null) {
            _hashCode += getCategoryId().hashCode();
        }
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        if (getCategoryDesc() != null) {
            _hashCode += getCategoryDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubcategoryDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "subcategoryDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "CategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "CategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "CategoryDesc"));
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
