/**
 * GetTariffServicePackDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class GetTariffServicePackDtlsResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.ServicePlanType[] servicePlansList;

    private com.xius.msp.billing.messages.SubscriberManagement.BucketDataType[] bucketDtls;

    private com.xius.msp.billing.messages.SubscriberManagement.DiscountDataType[] discountDtls;

    private com.xius.msp.billing.messages.SubscriberManagement.CADataType[] caDtls;

    public GetTariffServicePackDtlsResponse() {
    }

    public GetTariffServicePackDtlsResponse(
           com.xius.msp.billing.messages.SubscriberManagement.ServicePlanType[] servicePlansList,
           com.xius.msp.billing.messages.SubscriberManagement.BucketDataType[] bucketDtls,
           com.xius.msp.billing.messages.SubscriberManagement.DiscountDataType[] discountDtls,
           com.xius.msp.billing.messages.SubscriberManagement.CADataType[] caDtls) {
           this.servicePlansList = servicePlansList;
           this.bucketDtls = bucketDtls;
           this.discountDtls = discountDtls;
           this.caDtls = caDtls;
    }


    /**
     * Gets the servicePlansList value for this GetTariffServicePackDtlsResponse.
     * 
     * @return servicePlansList
     */
    public com.xius.msp.billing.messages.SubscriberManagement.ServicePlanType[] getServicePlansList() {
        return servicePlansList;
    }


    /**
     * Sets the servicePlansList value for this GetTariffServicePackDtlsResponse.
     * 
     * @param servicePlansList
     */
    public void setServicePlansList(com.xius.msp.billing.messages.SubscriberManagement.ServicePlanType[] servicePlansList) {
        this.servicePlansList = servicePlansList;
    }


    /**
     * Gets the bucketDtls value for this GetTariffServicePackDtlsResponse.
     * 
     * @return bucketDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.BucketDataType[] getBucketDtls() {
        return bucketDtls;
    }


    /**
     * Sets the bucketDtls value for this GetTariffServicePackDtlsResponse.
     * 
     * @param bucketDtls
     */
    public void setBucketDtls(com.xius.msp.billing.messages.SubscriberManagement.BucketDataType[] bucketDtls) {
        this.bucketDtls = bucketDtls;
    }


    /**
     * Gets the discountDtls value for this GetTariffServicePackDtlsResponse.
     * 
     * @return discountDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.DiscountDataType[] getDiscountDtls() {
        return discountDtls;
    }


    /**
     * Sets the discountDtls value for this GetTariffServicePackDtlsResponse.
     * 
     * @param discountDtls
     */
    public void setDiscountDtls(com.xius.msp.billing.messages.SubscriberManagement.DiscountDataType[] discountDtls) {
        this.discountDtls = discountDtls;
    }


    /**
     * Gets the caDtls value for this GetTariffServicePackDtlsResponse.
     * 
     * @return caDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.CADataType[] getCaDtls() {
        return caDtls;
    }


    /**
     * Sets the caDtls value for this GetTariffServicePackDtlsResponse.
     * 
     * @param caDtls
     */
    public void setCaDtls(com.xius.msp.billing.messages.SubscriberManagement.CADataType[] caDtls) {
        this.caDtls = caDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTariffServicePackDtlsResponse)) return false;
        GetTariffServicePackDtlsResponse other = (GetTariffServicePackDtlsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicePlansList==null && other.getServicePlansList()==null) || 
             (this.servicePlansList!=null &&
              java.util.Arrays.equals(this.servicePlansList, other.getServicePlansList()))) &&
            ((this.bucketDtls==null && other.getBucketDtls()==null) || 
             (this.bucketDtls!=null &&
              java.util.Arrays.equals(this.bucketDtls, other.getBucketDtls()))) &&
            ((this.discountDtls==null && other.getDiscountDtls()==null) || 
             (this.discountDtls!=null &&
              java.util.Arrays.equals(this.discountDtls, other.getDiscountDtls()))) &&
            ((this.caDtls==null && other.getCaDtls()==null) || 
             (this.caDtls!=null &&
              java.util.Arrays.equals(this.caDtls, other.getCaDtls())));
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
        if (getServicePlansList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicePlansList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicePlansList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getDiscountDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaDtls(), i);
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
        new org.apache.axis.description.TypeDesc(GetTariffServicePackDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffServicePackDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePlansList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePlansList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicePlanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePlan"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucketDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucket"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "discountDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DiscountDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "discount"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "caDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "CADataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ca"));
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
