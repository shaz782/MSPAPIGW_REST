/**
 * BenefitDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class BenefitDtlsType  implements java.io.Serializable {
    private java.lang.String publicityId;

    private com.xius.msp.billing.messages.SubscriberManagementV1.VoiceDetailsInfoType[] voiceDetailsList;

    private com.xius.msp.billing.messages.SubscriberManagementV1.SmsDetailsInfoType[] smsDetailsList;

    private com.xius.msp.billing.messages.SubscriberManagementV1.DataDetailsInfoType[] dataDetailsList;

    private com.xius.msp.billing.messages.SubscriberManagementV1.GlobalDetailsInfoType[] globalDetailsList;

    public BenefitDtlsType() {
    }

    public BenefitDtlsType(
           java.lang.String publicityId,
           com.xius.msp.billing.messages.SubscriberManagementV1.VoiceDetailsInfoType[] voiceDetailsList,
           com.xius.msp.billing.messages.SubscriberManagementV1.SmsDetailsInfoType[] smsDetailsList,
           com.xius.msp.billing.messages.SubscriberManagementV1.DataDetailsInfoType[] dataDetailsList,
           com.xius.msp.billing.messages.SubscriberManagementV1.GlobalDetailsInfoType[] globalDetailsList) {
           this.publicityId = publicityId;
           this.voiceDetailsList = voiceDetailsList;
           this.smsDetailsList = smsDetailsList;
           this.dataDetailsList = dataDetailsList;
           this.globalDetailsList = globalDetailsList;
    }


    /**
     * Gets the publicityId value for this BenefitDtlsType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this BenefitDtlsType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the voiceDetailsList value for this BenefitDtlsType.
     * 
     * @return voiceDetailsList
     */
    public com.xius.msp.billing.messages.SubscriberManagementV1.VoiceDetailsInfoType[] getVoiceDetailsList() {
        return voiceDetailsList;
    }


    /**
     * Sets the voiceDetailsList value for this BenefitDtlsType.
     * 
     * @param voiceDetailsList
     */
    public void setVoiceDetailsList(com.xius.msp.billing.messages.SubscriberManagementV1.VoiceDetailsInfoType[] voiceDetailsList) {
        this.voiceDetailsList = voiceDetailsList;
    }


    /**
     * Gets the smsDetailsList value for this BenefitDtlsType.
     * 
     * @return smsDetailsList
     */
    public com.xius.msp.billing.messages.SubscriberManagementV1.SmsDetailsInfoType[] getSmsDetailsList() {
        return smsDetailsList;
    }


    /**
     * Sets the smsDetailsList value for this BenefitDtlsType.
     * 
     * @param smsDetailsList
     */
    public void setSmsDetailsList(com.xius.msp.billing.messages.SubscriberManagementV1.SmsDetailsInfoType[] smsDetailsList) {
        this.smsDetailsList = smsDetailsList;
    }


    /**
     * Gets the dataDetailsList value for this BenefitDtlsType.
     * 
     * @return dataDetailsList
     */
    public com.xius.msp.billing.messages.SubscriberManagementV1.DataDetailsInfoType[] getDataDetailsList() {
        return dataDetailsList;
    }


    /**
     * Sets the dataDetailsList value for this BenefitDtlsType.
     * 
     * @param dataDetailsList
     */
    public void setDataDetailsList(com.xius.msp.billing.messages.SubscriberManagementV1.DataDetailsInfoType[] dataDetailsList) {
        this.dataDetailsList = dataDetailsList;
    }


    /**
     * Gets the globalDetailsList value for this BenefitDtlsType.
     * 
     * @return globalDetailsList
     */
    public com.xius.msp.billing.messages.SubscriberManagementV1.GlobalDetailsInfoType[] getGlobalDetailsList() {
        return globalDetailsList;
    }


    /**
     * Sets the globalDetailsList value for this BenefitDtlsType.
     * 
     * @param globalDetailsList
     */
    public void setGlobalDetailsList(com.xius.msp.billing.messages.SubscriberManagementV1.GlobalDetailsInfoType[] globalDetailsList) {
        this.globalDetailsList = globalDetailsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BenefitDtlsType)) return false;
        BenefitDtlsType other = (BenefitDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.voiceDetailsList==null && other.getVoiceDetailsList()==null) || 
             (this.voiceDetailsList!=null &&
              java.util.Arrays.equals(this.voiceDetailsList, other.getVoiceDetailsList()))) &&
            ((this.smsDetailsList==null && other.getSmsDetailsList()==null) || 
             (this.smsDetailsList!=null &&
              java.util.Arrays.equals(this.smsDetailsList, other.getSmsDetailsList()))) &&
            ((this.dataDetailsList==null && other.getDataDetailsList()==null) || 
             (this.dataDetailsList!=null &&
              java.util.Arrays.equals(this.dataDetailsList, other.getDataDetailsList()))) &&
            ((this.globalDetailsList==null && other.getGlobalDetailsList()==null) || 
             (this.globalDetailsList!=null &&
              java.util.Arrays.equals(this.globalDetailsList, other.getGlobalDetailsList())));
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
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getVoiceDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoiceDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoiceDetailsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSmsDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmsDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmsDetailsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataDetailsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobalDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalDetailsList(), i);
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
        new org.apache.axis.description.TypeDesc(BenefitDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "BenefitDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voiceDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "voiceDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "VoiceDetailsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "voiceDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "smsDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "smsDetailsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "smsDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "dataDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "dataDetailsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "dataDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "globalDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "globalDetailsInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "globalDetails"));
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
