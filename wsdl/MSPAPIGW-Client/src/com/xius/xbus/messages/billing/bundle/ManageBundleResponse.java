/**
 * ManageBundleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class ManageBundleResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String[] successMSISDNList;

    private java.lang.String[] failureMSISDNList;

    public ManageBundleResponse() {
    }

    public ManageBundleResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String[] successMSISDNList,
           java.lang.String[] failureMSISDNList) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.successMSISDNList = successMSISDNList;
        this.failureMSISDNList = failureMSISDNList;
    }


    /**
     * Gets the successMSISDNList value for this ManageBundleResponse.
     * 
     * @return successMSISDNList
     */
    public java.lang.String[] getSuccessMSISDNList() {
        return successMSISDNList;
    }


    /**
     * Sets the successMSISDNList value for this ManageBundleResponse.
     * 
     * @param successMSISDNList
     */
    public void setSuccessMSISDNList(java.lang.String[] successMSISDNList) {
        this.successMSISDNList = successMSISDNList;
    }


    /**
     * Gets the failureMSISDNList value for this ManageBundleResponse.
     * 
     * @return failureMSISDNList
     */
    public java.lang.String[] getFailureMSISDNList() {
        return failureMSISDNList;
    }


    /**
     * Sets the failureMSISDNList value for this ManageBundleResponse.
     * 
     * @param failureMSISDNList
     */
    public void setFailureMSISDNList(java.lang.String[] failureMSISDNList) {
        this.failureMSISDNList = failureMSISDNList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageBundleResponse)) return false;
        ManageBundleResponse other = (ManageBundleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.successMSISDNList==null && other.getSuccessMSISDNList()==null) || 
             (this.successMSISDNList!=null &&
              java.util.Arrays.equals(this.successMSISDNList, other.getSuccessMSISDNList()))) &&
            ((this.failureMSISDNList==null && other.getFailureMSISDNList()==null) || 
             (this.failureMSISDNList!=null &&
              java.util.Arrays.equals(this.failureMSISDNList, other.getFailureMSISDNList())));
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
        if (getSuccessMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessMSISDNList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailureMSISDNList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailureMSISDNList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailureMSISDNList(), i);
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
        new org.apache.axis.description.TypeDesc(ManageBundleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">manageBundleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successMSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "successMSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "msisdnList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureMSISDNList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "failureMSISDNList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "msisdnList"));
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
