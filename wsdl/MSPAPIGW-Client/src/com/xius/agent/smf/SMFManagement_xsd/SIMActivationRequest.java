/**
 * SIMActivationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class SIMActivationRequest  implements java.io.Serializable {
    private java.lang.String SIM;

    private java.lang.String IMSI;

    private java.lang.String MSISDN;

    private java.lang.Long curentStateId;

    private java.lang.String customField;

    private java.lang.String activityId;

    private java.lang.String linkTransId;

    private java.lang.String oldMSISDN;

    public SIMActivationRequest() {
    }

    public SIMActivationRequest(
           java.lang.String SIM,
           java.lang.String IMSI,
           java.lang.String MSISDN,
           java.lang.Long curentStateId,
           java.lang.String customField,
           java.lang.String activityId,
           java.lang.String linkTransId,
           java.lang.String oldMSISDN) {
           this.SIM = SIM;
           this.IMSI = IMSI;
           this.MSISDN = MSISDN;
           this.curentStateId = curentStateId;
           this.customField = customField;
           this.activityId = activityId;
           this.linkTransId = linkTransId;
           this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the SIM value for this SIMActivationRequest.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this SIMActivationRequest.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the IMSI value for this SIMActivationRequest.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this SIMActivationRequest.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the MSISDN value for this SIMActivationRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this SIMActivationRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the curentStateId value for this SIMActivationRequest.
     * 
     * @return curentStateId
     */
    public java.lang.Long getCurentStateId() {
        return curentStateId;
    }


    /**
     * Sets the curentStateId value for this SIMActivationRequest.
     * 
     * @param curentStateId
     */
    public void setCurentStateId(java.lang.Long curentStateId) {
        this.curentStateId = curentStateId;
    }


    /**
     * Gets the customField value for this SIMActivationRequest.
     * 
     * @return customField
     */
    public java.lang.String getCustomField() {
        return customField;
    }


    /**
     * Sets the customField value for this SIMActivationRequest.
     * 
     * @param customField
     */
    public void setCustomField(java.lang.String customField) {
        this.customField = customField;
    }


    /**
     * Gets the activityId value for this SIMActivationRequest.
     * 
     * @return activityId
     */
    public java.lang.String getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this SIMActivationRequest.
     * 
     * @param activityId
     */
    public void setActivityId(java.lang.String activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the linkTransId value for this SIMActivationRequest.
     * 
     * @return linkTransId
     */
    public java.lang.String getLinkTransId() {
        return linkTransId;
    }


    /**
     * Sets the linkTransId value for this SIMActivationRequest.
     * 
     * @param linkTransId
     */
    public void setLinkTransId(java.lang.String linkTransId) {
        this.linkTransId = linkTransId;
    }


    /**
     * Gets the oldMSISDN value for this SIMActivationRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this SIMActivationRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMActivationRequest)) return false;
        SIMActivationRequest other = (SIMActivationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.curentStateId==null && other.getCurentStateId()==null) || 
             (this.curentStateId!=null &&
              this.curentStateId.equals(other.getCurentStateId()))) &&
            ((this.customField==null && other.getCustomField()==null) || 
             (this.customField!=null &&
              this.customField.equals(other.getCustomField()))) &&
            ((this.activityId==null && other.getActivityId()==null) || 
             (this.activityId!=null &&
              this.activityId.equals(other.getActivityId()))) &&
            ((this.linkTransId==null && other.getLinkTransId()==null) || 
             (this.linkTransId!=null &&
              this.linkTransId.equals(other.getLinkTransId()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN())));
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
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getCurentStateId() != null) {
            _hashCode += getCurentStateId().hashCode();
        }
        if (getCustomField() != null) {
            _hashCode += getCustomField().hashCode();
        }
        if (getActivityId() != null) {
            _hashCode += getActivityId().hashCode();
        }
        if (getLinkTransId() != null) {
            _hashCode += getLinkTransId().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIMActivationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curentStateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "CurentStateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "CustomField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "activityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "linkTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldMSISDN"));
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
