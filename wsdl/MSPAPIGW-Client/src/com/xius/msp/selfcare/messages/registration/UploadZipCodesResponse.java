/**
 * UploadZipCodesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class UploadZipCodesResponse  implements java.io.Serializable {
    private java.lang.String transactionNo;

    private java.lang.Long failureCount;

    private com.xius.msp.selfcare.messages.registration.FailureZipCodeDtlsType[] failureZipCodesList;

    public UploadZipCodesResponse() {
    }

    public UploadZipCodesResponse(
           java.lang.String transactionNo,
           java.lang.Long failureCount,
           com.xius.msp.selfcare.messages.registration.FailureZipCodeDtlsType[] failureZipCodesList) {
           this.transactionNo = transactionNo;
           this.failureCount = failureCount;
           this.failureZipCodesList = failureZipCodesList;
    }


    /**
     * Gets the transactionNo value for this UploadZipCodesResponse.
     * 
     * @return transactionNo
     */
    public java.lang.String getTransactionNo() {
        return transactionNo;
    }


    /**
     * Sets the transactionNo value for this UploadZipCodesResponse.
     * 
     * @param transactionNo
     */
    public void setTransactionNo(java.lang.String transactionNo) {
        this.transactionNo = transactionNo;
    }


    /**
     * Gets the failureCount value for this UploadZipCodesResponse.
     * 
     * @return failureCount
     */
    public java.lang.Long getFailureCount() {
        return failureCount;
    }


    /**
     * Sets the failureCount value for this UploadZipCodesResponse.
     * 
     * @param failureCount
     */
    public void setFailureCount(java.lang.Long failureCount) {
        this.failureCount = failureCount;
    }


    /**
     * Gets the failureZipCodesList value for this UploadZipCodesResponse.
     * 
     * @return failureZipCodesList
     */
    public com.xius.msp.selfcare.messages.registration.FailureZipCodeDtlsType[] getFailureZipCodesList() {
        return failureZipCodesList;
    }


    /**
     * Sets the failureZipCodesList value for this UploadZipCodesResponse.
     * 
     * @param failureZipCodesList
     */
    public void setFailureZipCodesList(com.xius.msp.selfcare.messages.registration.FailureZipCodeDtlsType[] failureZipCodesList) {
        this.failureZipCodesList = failureZipCodesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadZipCodesResponse)) return false;
        UploadZipCodesResponse other = (UploadZipCodesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionNo==null && other.getTransactionNo()==null) || 
             (this.transactionNo!=null &&
              this.transactionNo.equals(other.getTransactionNo()))) &&
            ((this.failureCount==null && other.getFailureCount()==null) || 
             (this.failureCount!=null &&
              this.failureCount.equals(other.getFailureCount()))) &&
            ((this.failureZipCodesList==null && other.getFailureZipCodesList()==null) || 
             (this.failureZipCodesList!=null &&
              java.util.Arrays.equals(this.failureZipCodesList, other.getFailureZipCodesList())));
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
        if (getTransactionNo() != null) {
            _hashCode += getTransactionNo().hashCode();
        }
        if (getFailureCount() != null) {
            _hashCode += getFailureCount().hashCode();
        }
        if (getFailureZipCodesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailureZipCodesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailureZipCodesList(), i);
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
        new org.apache.axis.description.TypeDesc(UploadZipCodesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "UploadZipCodesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "transactionNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "failureCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureZipCodesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "failureZipCodesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "FailureZipCodeDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "failureZipCodeDtls"));
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
