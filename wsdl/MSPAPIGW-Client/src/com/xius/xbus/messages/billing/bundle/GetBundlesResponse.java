/**
 * GetBundlesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class GetBundlesResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.bundle.BundleType[] unAssignedBundles;

    private com.xius.xbus.messages.billing.bundle.BundleType[] assignedBundles;

    private com.xius.xbus.messages.billing.bundle.BundleType[] immAvbleBundlesList;

    private com.xius.xbus.messages.billing.bundle.BundleType[] immAsgndBundlesList;

    public GetBundlesResponse() {
    }

    public GetBundlesResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.billing.bundle.BundleType[] unAssignedBundles,
           com.xius.xbus.messages.billing.bundle.BundleType[] assignedBundles,
           com.xius.xbus.messages.billing.bundle.BundleType[] immAvbleBundlesList,
           com.xius.xbus.messages.billing.bundle.BundleType[] immAsgndBundlesList) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.unAssignedBundles = unAssignedBundles;
        this.assignedBundles = assignedBundles;
        this.immAvbleBundlesList = immAvbleBundlesList;
        this.immAsgndBundlesList = immAsgndBundlesList;
    }


    /**
     * Gets the unAssignedBundles value for this GetBundlesResponse.
     * 
     * @return unAssignedBundles
     */
    public com.xius.xbus.messages.billing.bundle.BundleType[] getUnAssignedBundles() {
        return unAssignedBundles;
    }


    /**
     * Sets the unAssignedBundles value for this GetBundlesResponse.
     * 
     * @param unAssignedBundles
     */
    public void setUnAssignedBundles(com.xius.xbus.messages.billing.bundle.BundleType[] unAssignedBundles) {
        this.unAssignedBundles = unAssignedBundles;
    }


    /**
     * Gets the assignedBundles value for this GetBundlesResponse.
     * 
     * @return assignedBundles
     */
    public com.xius.xbus.messages.billing.bundle.BundleType[] getAssignedBundles() {
        return assignedBundles;
    }


    /**
     * Sets the assignedBundles value for this GetBundlesResponse.
     * 
     * @param assignedBundles
     */
    public void setAssignedBundles(com.xius.xbus.messages.billing.bundle.BundleType[] assignedBundles) {
        this.assignedBundles = assignedBundles;
    }


    /**
     * Gets the immAvbleBundlesList value for this GetBundlesResponse.
     * 
     * @return immAvbleBundlesList
     */
    public com.xius.xbus.messages.billing.bundle.BundleType[] getImmAvbleBundlesList() {
        return immAvbleBundlesList;
    }


    /**
     * Sets the immAvbleBundlesList value for this GetBundlesResponse.
     * 
     * @param immAvbleBundlesList
     */
    public void setImmAvbleBundlesList(com.xius.xbus.messages.billing.bundle.BundleType[] immAvbleBundlesList) {
        this.immAvbleBundlesList = immAvbleBundlesList;
    }


    /**
     * Gets the immAsgndBundlesList value for this GetBundlesResponse.
     * 
     * @return immAsgndBundlesList
     */
    public com.xius.xbus.messages.billing.bundle.BundleType[] getImmAsgndBundlesList() {
        return immAsgndBundlesList;
    }


    /**
     * Sets the immAsgndBundlesList value for this GetBundlesResponse.
     * 
     * @param immAsgndBundlesList
     */
    public void setImmAsgndBundlesList(com.xius.xbus.messages.billing.bundle.BundleType[] immAsgndBundlesList) {
        this.immAsgndBundlesList = immAsgndBundlesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBundlesResponse)) return false;
        GetBundlesResponse other = (GetBundlesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.unAssignedBundles==null && other.getUnAssignedBundles()==null) || 
             (this.unAssignedBundles!=null &&
              java.util.Arrays.equals(this.unAssignedBundles, other.getUnAssignedBundles()))) &&
            ((this.assignedBundles==null && other.getAssignedBundles()==null) || 
             (this.assignedBundles!=null &&
              java.util.Arrays.equals(this.assignedBundles, other.getAssignedBundles()))) &&
            ((this.immAvbleBundlesList==null && other.getImmAvbleBundlesList()==null) || 
             (this.immAvbleBundlesList!=null &&
              java.util.Arrays.equals(this.immAvbleBundlesList, other.getImmAvbleBundlesList()))) &&
            ((this.immAsgndBundlesList==null && other.getImmAsgndBundlesList()==null) || 
             (this.immAsgndBundlesList!=null &&
              java.util.Arrays.equals(this.immAsgndBundlesList, other.getImmAsgndBundlesList())));
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
        if (getUnAssignedBundles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnAssignedBundles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnAssignedBundles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignedBundles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedBundles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedBundles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImmAvbleBundlesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImmAvbleBundlesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImmAvbleBundlesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImmAsgndBundlesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImmAsgndBundlesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImmAsgndBundlesList(), i);
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
        new org.apache.axis.description.TypeDesc(GetBundlesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundlesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unAssignedBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "unAssignedBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "assignedBundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immAvbleBundlesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "immAvbleBundlesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundle"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immAsgndBundlesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "immAsgndBundlesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundle"));
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
