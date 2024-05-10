/**
 * GetBundleDtlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class GetBundleDtlResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private com.xius.xbus.messages.billing.bundle.BucketType[] bucketDtls;

    public GetBundleDtlResponse() {
    }

    public GetBundleDtlResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           com.xius.xbus.messages.billing.bundle.BucketType[] bucketDtls) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.bucketDtls = bucketDtls;
    }


    /**
     * Gets the bucketDtls value for this GetBundleDtlResponse.
     * 
     * @return bucketDtls
     */
    public com.xius.xbus.messages.billing.bundle.BucketType[] getBucketDtls() {
        return bucketDtls;
    }


    /**
     * Sets the bucketDtls value for this GetBundleDtlResponse.
     * 
     * @param bucketDtls
     */
    public void setBucketDtls(com.xius.xbus.messages.billing.bundle.BucketType[] bucketDtls) {
        this.bucketDtls = bucketDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBundleDtlResponse)) return false;
        GetBundleDtlResponse other = (GetBundleDtlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bucketDtls==null && other.getBucketDtls()==null) || 
             (this.bucketDtls!=null &&
              java.util.Arrays.equals(this.bucketDtls, other.getBucketDtls())));
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
        if (getBucketDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBucketDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBucketDtls(), i);
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
        new org.apache.axis.description.TypeDesc(GetBundleDtlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundleDtlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucket"));
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
