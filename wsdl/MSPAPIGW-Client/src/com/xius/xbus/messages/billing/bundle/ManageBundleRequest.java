/**
 * ManageBundleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class ManageBundleRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.bundle.Bundle[] bundleList;

    private java.lang.String[] msisdnList;

    private com.xius.xbus.messages.billing.bundle.BundleOpType manageBundleOpType;

    public ManageBundleRequest() {
    }

    public ManageBundleRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           com.xius.xbus.messages.billing.bundle.Bundle[] bundleList,
           java.lang.String[] msisdnList,
           com.xius.xbus.messages.billing.bundle.BundleOpType manageBundleOpType) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.bundleList = bundleList;
        this.msisdnList = msisdnList;
        this.manageBundleOpType = manageBundleOpType;
    }


    /**
     * Gets the bundleList value for this ManageBundleRequest.
     * 
     * @return bundleList
     */
    public com.xius.xbus.messages.billing.bundle.Bundle[] getBundleList() {
        return bundleList;
    }


    /**
     * Sets the bundleList value for this ManageBundleRequest.
     * 
     * @param bundleList
     */
    public void setBundleList(com.xius.xbus.messages.billing.bundle.Bundle[] bundleList) {
        this.bundleList = bundleList;
    }


    /**
     * Gets the msisdnList value for this ManageBundleRequest.
     * 
     * @return msisdnList
     */
    public java.lang.String[] getMsisdnList() {
        return msisdnList;
    }


    /**
     * Sets the msisdnList value for this ManageBundleRequest.
     * 
     * @param msisdnList
     */
    public void setMsisdnList(java.lang.String[] msisdnList) {
        this.msisdnList = msisdnList;
    }


    /**
     * Gets the manageBundleOpType value for this ManageBundleRequest.
     * 
     * @return manageBundleOpType
     */
    public com.xius.xbus.messages.billing.bundle.BundleOpType getManageBundleOpType() {
        return manageBundleOpType;
    }


    /**
     * Sets the manageBundleOpType value for this ManageBundleRequest.
     * 
     * @param manageBundleOpType
     */
    public void setManageBundleOpType(com.xius.xbus.messages.billing.bundle.BundleOpType manageBundleOpType) {
        this.manageBundleOpType = manageBundleOpType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageBundleRequest)) return false;
        ManageBundleRequest other = (ManageBundleRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bundleList==null && other.getBundleList()==null) || 
             (this.bundleList!=null &&
              java.util.Arrays.equals(this.bundleList, other.getBundleList()))) &&
            ((this.msisdnList==null && other.getMsisdnList()==null) || 
             (this.msisdnList!=null &&
              java.util.Arrays.equals(this.msisdnList, other.getMsisdnList()))) &&
            ((this.manageBundleOpType==null && other.getManageBundleOpType()==null) || 
             (this.manageBundleOpType!=null &&
              this.manageBundleOpType.equals(other.getManageBundleOpType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBundleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundleList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMsisdnList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdnList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdnList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManageBundleOpType() != null) {
            _hashCode += getManageBundleOpType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageBundleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">manageBundleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundleList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "Bundle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "msisdnList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "msisdnList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageBundleOpType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "manageBundleOpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "BundleOpType"));
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
