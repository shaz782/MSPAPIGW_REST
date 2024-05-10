/**
 * UploadZipCodesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class UploadZipCodesRequest  implements java.io.Serializable {
    private java.lang.String[] zipCodesDetails;

    private com.xius.msp.selfcare.messages.registration.UploadFlagType uploadFlag;

    public UploadZipCodesRequest() {
    }

    public UploadZipCodesRequest(
           java.lang.String[] zipCodesDetails,
           com.xius.msp.selfcare.messages.registration.UploadFlagType uploadFlag) {
           this.zipCodesDetails = zipCodesDetails;
           this.uploadFlag = uploadFlag;
    }


    /**
     * Gets the zipCodesDetails value for this UploadZipCodesRequest.
     * 
     * @return zipCodesDetails
     */
    public java.lang.String[] getZipCodesDetails() {
        return zipCodesDetails;
    }


    /**
     * Sets the zipCodesDetails value for this UploadZipCodesRequest.
     * 
     * @param zipCodesDetails
     */
    public void setZipCodesDetails(java.lang.String[] zipCodesDetails) {
        this.zipCodesDetails = zipCodesDetails;
    }


    /**
     * Gets the uploadFlag value for this UploadZipCodesRequest.
     * 
     * @return uploadFlag
     */
    public com.xius.msp.selfcare.messages.registration.UploadFlagType getUploadFlag() {
        return uploadFlag;
    }


    /**
     * Sets the uploadFlag value for this UploadZipCodesRequest.
     * 
     * @param uploadFlag
     */
    public void setUploadFlag(com.xius.msp.selfcare.messages.registration.UploadFlagType uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadZipCodesRequest)) return false;
        UploadZipCodesRequest other = (UploadZipCodesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zipCodesDetails==null && other.getZipCodesDetails()==null) || 
             (this.zipCodesDetails!=null &&
              java.util.Arrays.equals(this.zipCodesDetails, other.getZipCodesDetails()))) &&
            ((this.uploadFlag==null && other.getUploadFlag()==null) || 
             (this.uploadFlag!=null &&
              this.uploadFlag.equals(other.getUploadFlag())));
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
        if (getZipCodesDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZipCodesDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZipCodesDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUploadFlag() != null) {
            _hashCode += getUploadFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadZipCodesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "UploadZipCodesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCodesDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "zipCodesDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "CommaSeparatedZipCodesList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "uploadFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "UploadFlagType"));
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
