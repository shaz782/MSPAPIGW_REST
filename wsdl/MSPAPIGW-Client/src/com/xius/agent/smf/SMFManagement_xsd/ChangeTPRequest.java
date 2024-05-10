/**
 * ChangeTPRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class ChangeTPRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.Long accountId;

    private java.lang.String newTariffPackID;

    private java.lang.String reason;

    private java.lang.String charge;

    private java.lang.String channelID;

    private java.lang.String remarks;

    private java.lang.String oldTariffPackId;

    private java.lang.String externalTransId;

    public ChangeTPRequest() {
    }

    public ChangeTPRequest(
           java.lang.String MSISDN,
           java.lang.Long accountId,
           java.lang.String newTariffPackID,
           java.lang.String reason,
           java.lang.String charge,
           java.lang.String channelID,
           java.lang.String remarks,
           java.lang.String oldTariffPackId,
           java.lang.String externalTransId) {
           this.MSISDN = MSISDN;
           this.accountId = accountId;
           this.newTariffPackID = newTariffPackID;
           this.reason = reason;
           this.charge = charge;
           this.channelID = channelID;
           this.remarks = remarks;
           this.oldTariffPackId = oldTariffPackId;
           this.externalTransId = externalTransId;
    }


    /**
     * Gets the MSISDN value for this ChangeTPRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ChangeTPRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the accountId value for this ChangeTPRequest.
     * 
     * @return accountId
     */
    public java.lang.Long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this ChangeTPRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.Long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the newTariffPackID value for this ChangeTPRequest.
     * 
     * @return newTariffPackID
     */
    public java.lang.String getNewTariffPackID() {
        return newTariffPackID;
    }


    /**
     * Sets the newTariffPackID value for this ChangeTPRequest.
     * 
     * @param newTariffPackID
     */
    public void setNewTariffPackID(java.lang.String newTariffPackID) {
        this.newTariffPackID = newTariffPackID;
    }


    /**
     * Gets the reason value for this ChangeTPRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ChangeTPRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the charge value for this ChangeTPRequest.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this ChangeTPRequest.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the channelID value for this ChangeTPRequest.
     * 
     * @return channelID
     */
    public java.lang.String getChannelID() {
        return channelID;
    }


    /**
     * Sets the channelID value for this ChangeTPRequest.
     * 
     * @param channelID
     */
    public void setChannelID(java.lang.String channelID) {
        this.channelID = channelID;
    }


    /**
     * Gets the remarks value for this ChangeTPRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this ChangeTPRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the oldTariffPackId value for this ChangeTPRequest.
     * 
     * @return oldTariffPackId
     */
    public java.lang.String getOldTariffPackId() {
        return oldTariffPackId;
    }


    /**
     * Sets the oldTariffPackId value for this ChangeTPRequest.
     * 
     * @param oldTariffPackId
     */
    public void setOldTariffPackId(java.lang.String oldTariffPackId) {
        this.oldTariffPackId = oldTariffPackId;
    }


    /**
     * Gets the externalTransId value for this ChangeTPRequest.
     * 
     * @return externalTransId
     */
    public java.lang.String getExternalTransId() {
        return externalTransId;
    }


    /**
     * Sets the externalTransId value for this ChangeTPRequest.
     * 
     * @param externalTransId
     */
    public void setExternalTransId(java.lang.String externalTransId) {
        this.externalTransId = externalTransId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeTPRequest)) return false;
        ChangeTPRequest other = (ChangeTPRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.newTariffPackID==null && other.getNewTariffPackID()==null) || 
             (this.newTariffPackID!=null &&
              this.newTariffPackID.equals(other.getNewTariffPackID()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.channelID==null && other.getChannelID()==null) || 
             (this.channelID!=null &&
              this.channelID.equals(other.getChannelID()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.oldTariffPackId==null && other.getOldTariffPackId()==null) || 
             (this.oldTariffPackId!=null &&
              this.oldTariffPackId.equals(other.getOldTariffPackId()))) &&
            ((this.externalTransId==null && other.getExternalTransId()==null) || 
             (this.externalTransId!=null &&
              this.externalTransId.equals(other.getExternalTransId())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getNewTariffPackID() != null) {
            _hashCode += getNewTariffPackID().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getChannelID() != null) {
            _hashCode += getChannelID().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getOldTariffPackId() != null) {
            _hashCode += getOldTariffPackId().hashCode();
        }
        if (getExternalTransId() != null) {
            _hashCode += getExternalTransId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeTPRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "changeTPRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTariffPackID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newTariffPackID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTariffPackId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldTariffPackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "externalTransId"));
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
