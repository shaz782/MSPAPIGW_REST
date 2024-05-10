/**
 * MSISDNDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class MSISDNDataType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private com.xius.msp.billing.messages.SubscriberManagement.DataPlanTinyInfoType[] plansList;

    public MSISDNDataType() {
    }

    public MSISDNDataType(
           java.lang.String msisdn,
           com.xius.msp.billing.messages.SubscriberManagement.DataPlanTinyInfoType[] plansList) {
           this.msisdn = msisdn;
           this.plansList = plansList;
    }


    /**
     * Gets the msisdn value for this MSISDNDataType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this MSISDNDataType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the plansList value for this MSISDNDataType.
     * 
     * @return plansList
     */
    public com.xius.msp.billing.messages.SubscriberManagement.DataPlanTinyInfoType[] getPlansList() {
        return plansList;
    }


    /**
     * Sets the plansList value for this MSISDNDataType.
     * 
     * @param plansList
     */
    public void setPlansList(com.xius.msp.billing.messages.SubscriberManagement.DataPlanTinyInfoType[] plansList) {
        this.plansList = plansList;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.DataPlanTinyInfoType getPlansList(int i) {
        return this.plansList[i];
    }

    public void setPlansList(int i, com.xius.msp.billing.messages.SubscriberManagement.DataPlanTinyInfoType _value) {
        this.plansList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MSISDNDataType)) return false;
        MSISDNDataType other = (MSISDNDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.plansList==null && other.getPlansList()==null) || 
             (this.plansList!=null &&
              java.util.Arrays.equals(this.plansList, other.getPlansList())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getPlansList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlansList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlansList(), i);
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
        new org.apache.axis.description.TypeDesc(MSISDNDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plansList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "plansList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanTinyInfoType"));
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
