/**
 * AddnlServicePlanPreInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class AddnlServicePlanPreInfoRequest  implements java.io.Serializable {
    private java.lang.Long accountId;

    private java.lang.Long msisdn;

    private java.lang.String caSvcpkgFlag;

    private java.lang.String atpCategory;

    public AddnlServicePlanPreInfoRequest() {
    }

    public AddnlServicePlanPreInfoRequest(
           java.lang.Long accountId,
           java.lang.Long msisdn,
           java.lang.String caSvcpkgFlag,
           java.lang.String atpCategory) {
           this.accountId = accountId;
           this.msisdn = msisdn;
           this.caSvcpkgFlag = caSvcpkgFlag;
           this.atpCategory = atpCategory;
    }


    /**
     * Gets the accountId value for this AddnlServicePlanPreInfoRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AddnlServicePlanPreInfoRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the msisdn value for this AddnlServicePlanPreInfoRequest.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this AddnlServicePlanPreInfoRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the caSvcpkgFlag value for this AddnlServicePlanPreInfoRequest.
     * 
     * @return caSvcpkgFlag
     */
    public java.lang.String getCaSvcpkgFlag() {
        return caSvcpkgFlag;
    }


    /**
     * Sets the caSvcpkgFlag value for this AddnlServicePlanPreInfoRequest.
     * 
     * @param caSvcpkgFlag
     */
    public void setCaSvcpkgFlag(java.lang.String caSvcpkgFlag) {
        this.caSvcpkgFlag = caSvcpkgFlag;
    }


    /**
     * Gets the atpCategory value for this AddnlServicePlanPreInfoRequest.
     * 
     * @return atpCategory
     */
    public java.lang.String getAtpCategory() {
        return atpCategory;
    }


    /**
     * Sets the atpCategory value for this AddnlServicePlanPreInfoRequest.
     * 
     * @param atpCategory
     */
    public void setAtpCategory(java.lang.String atpCategory) {
        this.atpCategory = atpCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddnlServicePlanPreInfoRequest)) return false;
        AddnlServicePlanPreInfoRequest other = (AddnlServicePlanPreInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.caSvcpkgFlag==null && other.getCaSvcpkgFlag()==null) || 
             (this.caSvcpkgFlag!=null &&
              this.caSvcpkgFlag.equals(other.getCaSvcpkgFlag()))) &&
            ((this.atpCategory==null && other.getAtpCategory()==null) || 
             (this.atpCategory!=null &&
              this.atpCategory.equals(other.getAtpCategory())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getCaSvcpkgFlag() != null) {
            _hashCode += getCaSvcpkgFlag().hashCode();
        }
        if (getAtpCategory() != null) {
            _hashCode += getAtpCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddnlServicePlanPreInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddnlServicePlanPreInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caSvcpkgFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "caSvcpkgFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpCategory"));
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