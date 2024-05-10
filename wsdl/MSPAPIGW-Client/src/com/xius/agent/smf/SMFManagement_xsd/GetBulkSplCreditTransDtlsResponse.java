/**
 * GetBulkSplCreditTransDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class GetBulkSplCreditTransDtlsResponse  implements java.io.Serializable {
    private com.xius.agent.smf.SMFManagement_xsd.BulkSplcreditDtlsType[] bulkCreditDetails;

    private java.lang.String message;

    public GetBulkSplCreditTransDtlsResponse() {
    }

    public GetBulkSplCreditTransDtlsResponse(
           com.xius.agent.smf.SMFManagement_xsd.BulkSplcreditDtlsType[] bulkCreditDetails,
           java.lang.String message) {
           this.bulkCreditDetails = bulkCreditDetails;
           this.message = message;
    }


    /**
     * Gets the bulkCreditDetails value for this GetBulkSplCreditTransDtlsResponse.
     * 
     * @return bulkCreditDetails
     */
    public com.xius.agent.smf.SMFManagement_xsd.BulkSplcreditDtlsType[] getBulkCreditDetails() {
        return bulkCreditDetails;
    }


    /**
     * Sets the bulkCreditDetails value for this GetBulkSplCreditTransDtlsResponse.
     * 
     * @param bulkCreditDetails
     */
    public void setBulkCreditDetails(com.xius.agent.smf.SMFManagement_xsd.BulkSplcreditDtlsType[] bulkCreditDetails) {
        this.bulkCreditDetails = bulkCreditDetails;
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkSplcreditDtlsType getBulkCreditDetails(int i) {
        return this.bulkCreditDetails[i];
    }

    public void setBulkCreditDetails(int i, com.xius.agent.smf.SMFManagement_xsd.BulkSplcreditDtlsType _value) {
        this.bulkCreditDetails[i] = _value;
    }


    /**
     * Gets the message value for this GetBulkSplCreditTransDtlsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetBulkSplCreditTransDtlsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBulkSplCreditTransDtlsResponse)) return false;
        GetBulkSplCreditTransDtlsResponse other = (GetBulkSplCreditTransDtlsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bulkCreditDetails==null && other.getBulkCreditDetails()==null) || 
             (this.bulkCreditDetails!=null &&
              java.util.Arrays.equals(this.bulkCreditDetails, other.getBulkCreditDetails()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getBulkCreditDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBulkCreditDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBulkCreditDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBulkSplCreditTransDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkSplCreditTransDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkCreditDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkCreditDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSplcreditDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "message"));
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
