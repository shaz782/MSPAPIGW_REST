/**
 * GetDataPlansResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class GetDataPlansResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.DataPlanType volumePlans;

    private com.xius.msp.billing.messages.SubscriberManagement.DataPlanType payAsGoPlans;

    public GetDataPlansResponse() {
    }

    public GetDataPlansResponse(
           com.xius.msp.billing.messages.SubscriberManagement.DataPlanType volumePlans,
           com.xius.msp.billing.messages.SubscriberManagement.DataPlanType payAsGoPlans) {
           this.volumePlans = volumePlans;
           this.payAsGoPlans = payAsGoPlans;
    }


    /**
     * Gets the volumePlans value for this GetDataPlansResponse.
     * 
     * @return volumePlans
     */
    public com.xius.msp.billing.messages.SubscriberManagement.DataPlanType getVolumePlans() {
        return volumePlans;
    }


    /**
     * Sets the volumePlans value for this GetDataPlansResponse.
     * 
     * @param volumePlans
     */
    public void setVolumePlans(com.xius.msp.billing.messages.SubscriberManagement.DataPlanType volumePlans) {
        this.volumePlans = volumePlans;
    }


    /**
     * Gets the payAsGoPlans value for this GetDataPlansResponse.
     * 
     * @return payAsGoPlans
     */
    public com.xius.msp.billing.messages.SubscriberManagement.DataPlanType getPayAsGoPlans() {
        return payAsGoPlans;
    }


    /**
     * Sets the payAsGoPlans value for this GetDataPlansResponse.
     * 
     * @param payAsGoPlans
     */
    public void setPayAsGoPlans(com.xius.msp.billing.messages.SubscriberManagement.DataPlanType payAsGoPlans) {
        this.payAsGoPlans = payAsGoPlans;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDataPlansResponse)) return false;
        GetDataPlansResponse other = (GetDataPlansResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.volumePlans==null && other.getVolumePlans()==null) || 
             (this.volumePlans!=null &&
              this.volumePlans.equals(other.getVolumePlans()))) &&
            ((this.payAsGoPlans==null && other.getPayAsGoPlans()==null) || 
             (this.payAsGoPlans!=null &&
              this.payAsGoPlans.equals(other.getPayAsGoPlans())));
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
        if (getVolumePlans() != null) {
            _hashCode += getVolumePlans().hashCode();
        }
        if (getPayAsGoPlans() != null) {
            _hashCode += getPayAsGoPlans().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDataPlansResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDataPlansResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumePlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "volumePlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAsGoPlans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "payAsGoPlans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanType"));
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
