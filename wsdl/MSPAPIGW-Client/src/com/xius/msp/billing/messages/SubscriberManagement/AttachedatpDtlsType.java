/**
 * AttachedatpDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class AttachedatpDtlsType  implements java.io.Serializable {
    private java.lang.String servicePackageId;

    private java.lang.String publicityId;

    private java.lang.String charge;

    private java.lang.String servicePackageDesc;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String category;

    private com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType[] bktDtls;

    public AttachedatpDtlsType() {
    }

    public AttachedatpDtlsType(
           java.lang.String servicePackageId,
           java.lang.String publicityId,
           java.lang.String charge,
           java.lang.String servicePackageDesc,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String category,
           com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType[] bktDtls) {
           this.servicePackageId = servicePackageId;
           this.publicityId = publicityId;
           this.charge = charge;
           this.servicePackageDesc = servicePackageDesc;
           this.startDate = startDate;
           this.endDate = endDate;
           this.category = category;
           this.bktDtls = bktDtls;
    }


    /**
     * Gets the servicePackageId value for this AttachedatpDtlsType.
     * 
     * @return servicePackageId
     */
    public java.lang.String getServicePackageId() {
        return servicePackageId;
    }


    /**
     * Sets the servicePackageId value for this AttachedatpDtlsType.
     * 
     * @param servicePackageId
     */
    public void setServicePackageId(java.lang.String servicePackageId) {
        this.servicePackageId = servicePackageId;
    }


    /**
     * Gets the publicityId value for this AttachedatpDtlsType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this AttachedatpDtlsType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the charge value for this AttachedatpDtlsType.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this AttachedatpDtlsType.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the servicePackageDesc value for this AttachedatpDtlsType.
     * 
     * @return servicePackageDesc
     */
    public java.lang.String getServicePackageDesc() {
        return servicePackageDesc;
    }


    /**
     * Sets the servicePackageDesc value for this AttachedatpDtlsType.
     * 
     * @param servicePackageDesc
     */
    public void setServicePackageDesc(java.lang.String servicePackageDesc) {
        this.servicePackageDesc = servicePackageDesc;
    }


    /**
     * Gets the startDate value for this AttachedatpDtlsType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AttachedatpDtlsType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this AttachedatpDtlsType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AttachedatpDtlsType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the category value for this AttachedatpDtlsType.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this AttachedatpDtlsType.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the bktDtls value for this AttachedatpDtlsType.
     * 
     * @return bktDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType[] getBktDtls() {
        return bktDtls;
    }


    /**
     * Sets the bktDtls value for this AttachedatpDtlsType.
     * 
     * @param bktDtls
     */
    public void setBktDtls(com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType[] bktDtls) {
        this.bktDtls = bktDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType getBktDtls(int i) {
        return this.bktDtls[i];
    }

    public void setBktDtls(int i, com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType _value) {
        this.bktDtls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachedatpDtlsType)) return false;
        AttachedatpDtlsType other = (AttachedatpDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicePackageId==null && other.getServicePackageId()==null) || 
             (this.servicePackageId!=null &&
              this.servicePackageId.equals(other.getServicePackageId()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.servicePackageDesc==null && other.getServicePackageDesc()==null) || 
             (this.servicePackageDesc!=null &&
              this.servicePackageDesc.equals(other.getServicePackageDesc()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.bktDtls==null && other.getBktDtls()==null) || 
             (this.bktDtls!=null &&
              java.util.Arrays.equals(this.bktDtls, other.getBktDtls())));
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
        if (getServicePackageId() != null) {
            _hashCode += getServicePackageId().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getServicePackageDesc() != null) {
            _hashCode += getServicePackageDesc().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getBktDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBktDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBktDtls(), i);
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
        new org.apache.axis.description.TypeDesc(AttachedatpDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AttachedatpDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackageDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePackageDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bktDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bktDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bktDtlsType"));
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
