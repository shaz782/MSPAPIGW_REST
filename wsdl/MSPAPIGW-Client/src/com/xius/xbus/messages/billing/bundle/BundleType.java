/**
 * BundleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class BundleType  implements java.io.Serializable {
    private java.math.BigInteger bundleId;

    private java.lang.String bundleName;

    private java.math.BigDecimal currentbalance;

    private java.lang.String expirationdate;

    private java.lang.String assignedDate;

    private java.lang.String balancecategory;

    private java.lang.String bundleCategoryId;

    private java.lang.String bundleCategoryName;

    private java.math.BigDecimal bundleCharge;

    private java.math.BigDecimal activationFee;

    public BundleType() {
    }

    public BundleType(
           java.math.BigInteger bundleId,
           java.lang.String bundleName,
           java.math.BigDecimal currentbalance,
           java.lang.String expirationdate,
           java.lang.String assignedDate,
           java.lang.String balancecategory,
           java.lang.String bundleCategoryId,
           java.lang.String bundleCategoryName,
           java.math.BigDecimal bundleCharge,
           java.math.BigDecimal activationFee) {
           this.bundleId = bundleId;
           this.bundleName = bundleName;
           this.currentbalance = currentbalance;
           this.expirationdate = expirationdate;
           this.assignedDate = assignedDate;
           this.balancecategory = balancecategory;
           this.bundleCategoryId = bundleCategoryId;
           this.bundleCategoryName = bundleCategoryName;
           this.bundleCharge = bundleCharge;
           this.activationFee = activationFee;
    }


    /**
     * Gets the bundleId value for this BundleType.
     * 
     * @return bundleId
     */
    public java.math.BigInteger getBundleId() {
        return bundleId;
    }


    /**
     * Sets the bundleId value for this BundleType.
     * 
     * @param bundleId
     */
    public void setBundleId(java.math.BigInteger bundleId) {
        this.bundleId = bundleId;
    }


    /**
     * Gets the bundleName value for this BundleType.
     * 
     * @return bundleName
     */
    public java.lang.String getBundleName() {
        return bundleName;
    }


    /**
     * Sets the bundleName value for this BundleType.
     * 
     * @param bundleName
     */
    public void setBundleName(java.lang.String bundleName) {
        this.bundleName = bundleName;
    }


    /**
     * Gets the currentbalance value for this BundleType.
     * 
     * @return currentbalance
     */
    public java.math.BigDecimal getCurrentbalance() {
        return currentbalance;
    }


    /**
     * Sets the currentbalance value for this BundleType.
     * 
     * @param currentbalance
     */
    public void setCurrentbalance(java.math.BigDecimal currentbalance) {
        this.currentbalance = currentbalance;
    }


    /**
     * Gets the expirationdate value for this BundleType.
     * 
     * @return expirationdate
     */
    public java.lang.String getExpirationdate() {
        return expirationdate;
    }


    /**
     * Sets the expirationdate value for this BundleType.
     * 
     * @param expirationdate
     */
    public void setExpirationdate(java.lang.String expirationdate) {
        this.expirationdate = expirationdate;
    }


    /**
     * Gets the assignedDate value for this BundleType.
     * 
     * @return assignedDate
     */
    public java.lang.String getAssignedDate() {
        return assignedDate;
    }


    /**
     * Sets the assignedDate value for this BundleType.
     * 
     * @param assignedDate
     */
    public void setAssignedDate(java.lang.String assignedDate) {
        this.assignedDate = assignedDate;
    }


    /**
     * Gets the balancecategory value for this BundleType.
     * 
     * @return balancecategory
     */
    public java.lang.String getBalancecategory() {
        return balancecategory;
    }


    /**
     * Sets the balancecategory value for this BundleType.
     * 
     * @param balancecategory
     */
    public void setBalancecategory(java.lang.String balancecategory) {
        this.balancecategory = balancecategory;
    }


    /**
     * Gets the bundleCategoryId value for this BundleType.
     * 
     * @return bundleCategoryId
     */
    public java.lang.String getBundleCategoryId() {
        return bundleCategoryId;
    }


    /**
     * Sets the bundleCategoryId value for this BundleType.
     * 
     * @param bundleCategoryId
     */
    public void setBundleCategoryId(java.lang.String bundleCategoryId) {
        this.bundleCategoryId = bundleCategoryId;
    }


    /**
     * Gets the bundleCategoryName value for this BundleType.
     * 
     * @return bundleCategoryName
     */
    public java.lang.String getBundleCategoryName() {
        return bundleCategoryName;
    }


    /**
     * Sets the bundleCategoryName value for this BundleType.
     * 
     * @param bundleCategoryName
     */
    public void setBundleCategoryName(java.lang.String bundleCategoryName) {
        this.bundleCategoryName = bundleCategoryName;
    }


    /**
     * Gets the bundleCharge value for this BundleType.
     * 
     * @return bundleCharge
     */
    public java.math.BigDecimal getBundleCharge() {
        return bundleCharge;
    }


    /**
     * Sets the bundleCharge value for this BundleType.
     * 
     * @param bundleCharge
     */
    public void setBundleCharge(java.math.BigDecimal bundleCharge) {
        this.bundleCharge = bundleCharge;
    }


    /**
     * Gets the activationFee value for this BundleType.
     * 
     * @return activationFee
     */
    public java.math.BigDecimal getActivationFee() {
        return activationFee;
    }


    /**
     * Sets the activationFee value for this BundleType.
     * 
     * @param activationFee
     */
    public void setActivationFee(java.math.BigDecimal activationFee) {
        this.activationFee = activationFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BundleType)) return false;
        BundleType other = (BundleType) obj;
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
              this.bundleName.equals(other.getBundleName()))) &&
            ((this.currentbalance==null && other.getCurrentbalance()==null) || 
             (this.currentbalance!=null &&
              this.currentbalance.equals(other.getCurrentbalance()))) &&
            ((this.expirationdate==null && other.getExpirationdate()==null) || 
             (this.expirationdate!=null &&
              this.expirationdate.equals(other.getExpirationdate()))) &&
            ((this.assignedDate==null && other.getAssignedDate()==null) || 
             (this.assignedDate!=null &&
              this.assignedDate.equals(other.getAssignedDate()))) &&
            ((this.balancecategory==null && other.getBalancecategory()==null) || 
             (this.balancecategory!=null &&
              this.balancecategory.equals(other.getBalancecategory()))) &&
            ((this.bundleCategoryId==null && other.getBundleCategoryId()==null) || 
             (this.bundleCategoryId!=null &&
              this.bundleCategoryId.equals(other.getBundleCategoryId()))) &&
            ((this.bundleCategoryName==null && other.getBundleCategoryName()==null) || 
             (this.bundleCategoryName!=null &&
              this.bundleCategoryName.equals(other.getBundleCategoryName()))) &&
            ((this.bundleCharge==null && other.getBundleCharge()==null) || 
             (this.bundleCharge!=null &&
              this.bundleCharge.equals(other.getBundleCharge()))) &&
            ((this.activationFee==null && other.getActivationFee()==null) || 
             (this.activationFee!=null &&
              this.activationFee.equals(other.getActivationFee())));
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
        if (getCurrentbalance() != null) {
            _hashCode += getCurrentbalance().hashCode();
        }
        if (getExpirationdate() != null) {
            _hashCode += getExpirationdate().hashCode();
        }
        if (getAssignedDate() != null) {
            _hashCode += getAssignedDate().hashCode();
        }
        if (getBalancecategory() != null) {
            _hashCode += getBalancecategory().hashCode();
        }
        if (getBundleCategoryId() != null) {
            _hashCode += getBundleCategoryId().hashCode();
        }
        if (getBundleCategoryName() != null) {
            _hashCode += getBundleCategoryName().hashCode();
        }
        if (getBundleCharge() != null) {
            _hashCode += getBundleCharge().hashCode();
        }
        if (getActivationFee() != null) {
            _hashCode += getActivationFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BundleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "currentbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "expirationdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "assignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancecategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "balancecategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleCategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "activationFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
