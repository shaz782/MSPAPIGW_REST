/**
 * CheckCommercialTPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class CheckCommercialTPResponse  implements java.io.Serializable {
    private java.lang.String tpCategory;

    private java.lang.String vaildityDate;

    private java.lang.String gracePeriod1Date;

    private java.lang.String gracePeriod2Date;

    private java.lang.String gracePeriod3Date;

    private java.lang.String expiryDate;

    public CheckCommercialTPResponse() {
    }

    public CheckCommercialTPResponse(
           java.lang.String tpCategory,
           java.lang.String vaildityDate,
           java.lang.String gracePeriod1Date,
           java.lang.String gracePeriod2Date,
           java.lang.String gracePeriod3Date,
           java.lang.String expiryDate) {
           this.tpCategory = tpCategory;
           this.vaildityDate = vaildityDate;
           this.gracePeriod1Date = gracePeriod1Date;
           this.gracePeriod2Date = gracePeriod2Date;
           this.gracePeriod3Date = gracePeriod3Date;
           this.expiryDate = expiryDate;
    }


    /**
     * Gets the tpCategory value for this CheckCommercialTPResponse.
     * 
     * @return tpCategory
     */
    public java.lang.String getTpCategory() {
        return tpCategory;
    }


    /**
     * Sets the tpCategory value for this CheckCommercialTPResponse.
     * 
     * @param tpCategory
     */
    public void setTpCategory(java.lang.String tpCategory) {
        this.tpCategory = tpCategory;
    }


    /**
     * Gets the vaildityDate value for this CheckCommercialTPResponse.
     * 
     * @return vaildityDate
     */
    public java.lang.String getVaildityDate() {
        return vaildityDate;
    }


    /**
     * Sets the vaildityDate value for this CheckCommercialTPResponse.
     * 
     * @param vaildityDate
     */
    public void setVaildityDate(java.lang.String vaildityDate) {
        this.vaildityDate = vaildityDate;
    }


    /**
     * Gets the gracePeriod1Date value for this CheckCommercialTPResponse.
     * 
     * @return gracePeriod1Date
     */
    public java.lang.String getGracePeriod1Date() {
        return gracePeriod1Date;
    }


    /**
     * Sets the gracePeriod1Date value for this CheckCommercialTPResponse.
     * 
     * @param gracePeriod1Date
     */
    public void setGracePeriod1Date(java.lang.String gracePeriod1Date) {
        this.gracePeriod1Date = gracePeriod1Date;
    }


    /**
     * Gets the gracePeriod2Date value for this CheckCommercialTPResponse.
     * 
     * @return gracePeriod2Date
     */
    public java.lang.String getGracePeriod2Date() {
        return gracePeriod2Date;
    }


    /**
     * Sets the gracePeriod2Date value for this CheckCommercialTPResponse.
     * 
     * @param gracePeriod2Date
     */
    public void setGracePeriod2Date(java.lang.String gracePeriod2Date) {
        this.gracePeriod2Date = gracePeriod2Date;
    }


    /**
     * Gets the gracePeriod3Date value for this CheckCommercialTPResponse.
     * 
     * @return gracePeriod3Date
     */
    public java.lang.String getGracePeriod3Date() {
        return gracePeriod3Date;
    }


    /**
     * Sets the gracePeriod3Date value for this CheckCommercialTPResponse.
     * 
     * @param gracePeriod3Date
     */
    public void setGracePeriod3Date(java.lang.String gracePeriod3Date) {
        this.gracePeriod3Date = gracePeriod3Date;
    }


    /**
     * Gets the expiryDate value for this CheckCommercialTPResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this CheckCommercialTPResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCommercialTPResponse)) return false;
        CheckCommercialTPResponse other = (CheckCommercialTPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tpCategory==null && other.getTpCategory()==null) || 
             (this.tpCategory!=null &&
              this.tpCategory.equals(other.getTpCategory()))) &&
            ((this.vaildityDate==null && other.getVaildityDate()==null) || 
             (this.vaildityDate!=null &&
              this.vaildityDate.equals(other.getVaildityDate()))) &&
            ((this.gracePeriod1Date==null && other.getGracePeriod1Date()==null) || 
             (this.gracePeriod1Date!=null &&
              this.gracePeriod1Date.equals(other.getGracePeriod1Date()))) &&
            ((this.gracePeriod2Date==null && other.getGracePeriod2Date()==null) || 
             (this.gracePeriod2Date!=null &&
              this.gracePeriod2Date.equals(other.getGracePeriod2Date()))) &&
            ((this.gracePeriod3Date==null && other.getGracePeriod3Date()==null) || 
             (this.gracePeriod3Date!=null &&
              this.gracePeriod3Date.equals(other.getGracePeriod3Date()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate())));
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
        if (getTpCategory() != null) {
            _hashCode += getTpCategory().hashCode();
        }
        if (getVaildityDate() != null) {
            _hashCode += getVaildityDate().hashCode();
        }
        if (getGracePeriod1Date() != null) {
            _hashCode += getGracePeriod1Date().hashCode();
        }
        if (getGracePeriod2Date() != null) {
            _hashCode += getGracePeriod2Date().hashCode();
        }
        if (getGracePeriod3Date() != null) {
            _hashCode += getGracePeriod3Date().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCommercialTPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "checkCommercialTPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tpCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaildityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "vaildityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod1Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "gracePeriod1Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod2Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "gracePeriod2Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod3Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "gracePeriod3Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "expiryDate"));
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
