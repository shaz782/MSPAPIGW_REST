/**
 * SlpnPointsTrackerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class SlpnPointsTrackerRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String clientId;

    private java.lang.String slpnPoints;

    private java.lang.String publicityId;

    private java.lang.String operation;

    private java.lang.String revRefTransId;

    private java.lang.String rechargeDenom;

    private java.lang.String channel;

    public SlpnPointsTrackerRequest() {
    }

    public SlpnPointsTrackerRequest(
           java.lang.String msisdn,
           java.lang.String clientId,
           java.lang.String slpnPoints,
           java.lang.String publicityId,
           java.lang.String operation,
           java.lang.String revRefTransId,
           java.lang.String rechargeDenom,
           java.lang.String channel) {
           this.msisdn = msisdn;
           this.clientId = clientId;
           this.slpnPoints = slpnPoints;
           this.publicityId = publicityId;
           this.operation = operation;
           this.revRefTransId = revRefTransId;
           this.rechargeDenom = rechargeDenom;
           this.channel = channel;
    }


    /**
     * Gets the msisdn value for this SlpnPointsTrackerRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SlpnPointsTrackerRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the clientId value for this SlpnPointsTrackerRequest.
     * 
     * @return clientId
     */
    public java.lang.String getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this SlpnPointsTrackerRequest.
     * 
     * @param clientId
     */
    public void setClientId(java.lang.String clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the slpnPoints value for this SlpnPointsTrackerRequest.
     * 
     * @return slpnPoints
     */
    public java.lang.String getSlpnPoints() {
        return slpnPoints;
    }


    /**
     * Sets the slpnPoints value for this SlpnPointsTrackerRequest.
     * 
     * @param slpnPoints
     */
    public void setSlpnPoints(java.lang.String slpnPoints) {
        this.slpnPoints = slpnPoints;
    }


    /**
     * Gets the publicityId value for this SlpnPointsTrackerRequest.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this SlpnPointsTrackerRequest.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the operation value for this SlpnPointsTrackerRequest.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this SlpnPointsTrackerRequest.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the revRefTransId value for this SlpnPointsTrackerRequest.
     * 
     * @return revRefTransId
     */
    public java.lang.String getRevRefTransId() {
        return revRefTransId;
    }


    /**
     * Sets the revRefTransId value for this SlpnPointsTrackerRequest.
     * 
     * @param revRefTransId
     */
    public void setRevRefTransId(java.lang.String revRefTransId) {
        this.revRefTransId = revRefTransId;
    }


    /**
     * Gets the rechargeDenom value for this SlpnPointsTrackerRequest.
     * 
     * @return rechargeDenom
     */
    public java.lang.String getRechargeDenom() {
        return rechargeDenom;
    }


    /**
     * Sets the rechargeDenom value for this SlpnPointsTrackerRequest.
     * 
     * @param rechargeDenom
     */
    public void setRechargeDenom(java.lang.String rechargeDenom) {
        this.rechargeDenom = rechargeDenom;
    }


    /**
     * Gets the channel value for this SlpnPointsTrackerRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this SlpnPointsTrackerRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SlpnPointsTrackerRequest)) return false;
        SlpnPointsTrackerRequest other = (SlpnPointsTrackerRequest) obj;
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
            ((this.clientId==null && other.getClientId()==null) || 
             (this.clientId!=null &&
              this.clientId.equals(other.getClientId()))) &&
            ((this.slpnPoints==null && other.getSlpnPoints()==null) || 
             (this.slpnPoints!=null &&
              this.slpnPoints.equals(other.getSlpnPoints()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.revRefTransId==null && other.getRevRefTransId()==null) || 
             (this.revRefTransId!=null &&
              this.revRefTransId.equals(other.getRevRefTransId()))) &&
            ((this.rechargeDenom==null && other.getRechargeDenom()==null) || 
             (this.rechargeDenom!=null &&
              this.rechargeDenom.equals(other.getRechargeDenom()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        if (getClientId() != null) {
            _hashCode += getClientId().hashCode();
        }
        if (getSlpnPoints() != null) {
            _hashCode += getSlpnPoints().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getRevRefTransId() != null) {
            _hashCode += getRevRefTransId().hashCode();
        }
        if (getRechargeDenom() != null) {
            _hashCode += getRechargeDenom().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SlpnPointsTrackerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "clientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slpnPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "slpnPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRefTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "revRefTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeDenom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "rechargeDenom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channel"));
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
