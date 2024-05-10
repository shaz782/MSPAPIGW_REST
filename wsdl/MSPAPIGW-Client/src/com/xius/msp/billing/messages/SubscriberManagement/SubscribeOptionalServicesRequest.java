/**
 * SubscribeOptionalServicesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class SubscribeOptionalServicesRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.OptionType option;

    private com.xius.msp.billing.messages.SubscriberManagement.ServiceType[] service;

    public SubscribeOptionalServicesRequest() {
    }

    public SubscribeOptionalServicesRequest(
           com.xius.msp.billing.messages.SubscriberManagement.OptionType option,
           com.xius.msp.billing.messages.SubscriberManagement.ServiceType[] service) {
           this.option = option;
           this.service = service;
    }


    /**
     * Gets the option value for this SubscribeOptionalServicesRequest.
     * 
     * @return option
     */
    public com.xius.msp.billing.messages.SubscriberManagement.OptionType getOption() {
        return option;
    }


    /**
     * Sets the option value for this SubscribeOptionalServicesRequest.
     * 
     * @param option
     */
    public void setOption(com.xius.msp.billing.messages.SubscriberManagement.OptionType option) {
        this.option = option;
    }


    /**
     * Gets the service value for this SubscribeOptionalServicesRequest.
     * 
     * @return service
     */
    public com.xius.msp.billing.messages.SubscriberManagement.ServiceType[] getService() {
        return service;
    }


    /**
     * Sets the service value for this SubscribeOptionalServicesRequest.
     * 
     * @param service
     */
    public void setService(com.xius.msp.billing.messages.SubscriberManagement.ServiceType[] service) {
        this.service = service;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ServiceType getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.xius.msp.billing.messages.SubscriberManagement.ServiceType _value) {
        this.service[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribeOptionalServicesRequest)) return false;
        SubscribeOptionalServicesRequest other = (SubscribeOptionalServicesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService())));
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
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
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
        new org.apache.axis.description.TypeDesc(SubscribeOptionalServicesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeOptionalServicesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
