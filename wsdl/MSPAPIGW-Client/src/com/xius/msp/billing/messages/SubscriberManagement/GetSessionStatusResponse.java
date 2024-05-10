/**
 * GetSessionStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class GetSessionStatusResponse  implements java.io.Serializable {
    private java.lang.Integer dataSessionStatus;

    private java.lang.Integer voiceSessionStatus;

    public GetSessionStatusResponse() {
    }

    public GetSessionStatusResponse(
           java.lang.Integer dataSessionStatus,
           java.lang.Integer voiceSessionStatus) {
           this.dataSessionStatus = dataSessionStatus;
           this.voiceSessionStatus = voiceSessionStatus;
    }


    /**
     * Gets the dataSessionStatus value for this GetSessionStatusResponse.
     * 
     * @return dataSessionStatus
     */
    public java.lang.Integer getDataSessionStatus() {
        return dataSessionStatus;
    }


    /**
     * Sets the dataSessionStatus value for this GetSessionStatusResponse.
     * 
     * @param dataSessionStatus
     */
    public void setDataSessionStatus(java.lang.Integer dataSessionStatus) {
        this.dataSessionStatus = dataSessionStatus;
    }


    /**
     * Gets the voiceSessionStatus value for this GetSessionStatusResponse.
     * 
     * @return voiceSessionStatus
     */
    public java.lang.Integer getVoiceSessionStatus() {
        return voiceSessionStatus;
    }


    /**
     * Sets the voiceSessionStatus value for this GetSessionStatusResponse.
     * 
     * @param voiceSessionStatus
     */
    public void setVoiceSessionStatus(java.lang.Integer voiceSessionStatus) {
        this.voiceSessionStatus = voiceSessionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSessionStatusResponse)) return false;
        GetSessionStatusResponse other = (GetSessionStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataSessionStatus==null && other.getDataSessionStatus()==null) || 
             (this.dataSessionStatus!=null &&
              this.dataSessionStatus.equals(other.getDataSessionStatus()))) &&
            ((this.voiceSessionStatus==null && other.getVoiceSessionStatus()==null) || 
             (this.voiceSessionStatus!=null &&
              this.voiceSessionStatus.equals(other.getVoiceSessionStatus())));
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
        if (getDataSessionStatus() != null) {
            _hashCode += getDataSessionStatus().hashCode();
        }
        if (getVoiceSessionStatus() != null) {
            _hashCode += getVoiceSessionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSessionStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSessionStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSessionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "dataSessionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceSessionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "voiceSessionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
