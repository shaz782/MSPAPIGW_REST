/**
 * FirstLUUpdateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class FirstLUUpdateRequest  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String currentStateId;

    private java.lang.String SIM;

    private java.lang.String oldMSISDN;

    private java.lang.String newMSISDN;

    private java.lang.String BAN;

    private java.lang.String linkTransId;

    private java.lang.String status;

    private java.lang.String remarks;

    private java.lang.String extErrorCode;

    public FirstLUUpdateRequest() {
    }

    public FirstLUUpdateRequest(
           java.lang.String transactionId,
           java.lang.String currentStateId,
           java.lang.String SIM,
           java.lang.String oldMSISDN,
           java.lang.String newMSISDN,
           java.lang.String BAN,
           java.lang.String linkTransId,
           java.lang.String status,
           java.lang.String remarks,
           java.lang.String extErrorCode) {
           this.transactionId = transactionId;
           this.currentStateId = currentStateId;
           this.SIM = SIM;
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.BAN = BAN;
           this.linkTransId = linkTransId;
           this.status = status;
           this.remarks = remarks;
           this.extErrorCode = extErrorCode;
    }


    /**
     * Gets the transactionId value for this FirstLUUpdateRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this FirstLUUpdateRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the currentStateId value for this FirstLUUpdateRequest.
     * 
     * @return currentStateId
     */
    public java.lang.String getCurrentStateId() {
        return currentStateId;
    }


    /**
     * Sets the currentStateId value for this FirstLUUpdateRequest.
     * 
     * @param currentStateId
     */
    public void setCurrentStateId(java.lang.String currentStateId) {
        this.currentStateId = currentStateId;
    }


    /**
     * Gets the SIM value for this FirstLUUpdateRequest.
     * 
     * @return SIM
     */
    public java.lang.String getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this FirstLUUpdateRequest.
     * 
     * @param SIM
     */
    public void setSIM(java.lang.String SIM) {
        this.SIM = SIM;
    }


    /**
     * Gets the oldMSISDN value for this FirstLUUpdateRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this FirstLUUpdateRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this FirstLUUpdateRequest.
     * 
     * @return newMSISDN
     */
    public java.lang.String getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this FirstLUUpdateRequest.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.String newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the BAN value for this FirstLUUpdateRequest.
     * 
     * @return BAN
     */
    public java.lang.String getBAN() {
        return BAN;
    }


    /**
     * Sets the BAN value for this FirstLUUpdateRequest.
     * 
     * @param BAN
     */
    public void setBAN(java.lang.String BAN) {
        this.BAN = BAN;
    }


    /**
     * Gets the linkTransId value for this FirstLUUpdateRequest.
     * 
     * @return linkTransId
     */
    public java.lang.String getLinkTransId() {
        return linkTransId;
    }


    /**
     * Sets the linkTransId value for this FirstLUUpdateRequest.
     * 
     * @param linkTransId
     */
    public void setLinkTransId(java.lang.String linkTransId) {
        this.linkTransId = linkTransId;
    }


    /**
     * Gets the status value for this FirstLUUpdateRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FirstLUUpdateRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the remarks value for this FirstLUUpdateRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this FirstLUUpdateRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the extErrorCode value for this FirstLUUpdateRequest.
     * 
     * @return extErrorCode
     */
    public java.lang.String getExtErrorCode() {
        return extErrorCode;
    }


    /**
     * Sets the extErrorCode value for this FirstLUUpdateRequest.
     * 
     * @param extErrorCode
     */
    public void setExtErrorCode(java.lang.String extErrorCode) {
        this.extErrorCode = extErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirstLUUpdateRequest)) return false;
        FirstLUUpdateRequest other = (FirstLUUpdateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.currentStateId==null && other.getCurrentStateId()==null) || 
             (this.currentStateId!=null &&
              this.currentStateId.equals(other.getCurrentStateId()))) &&
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              this.SIM.equals(other.getSIM()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.BAN==null && other.getBAN()==null) || 
             (this.BAN!=null &&
              this.BAN.equals(other.getBAN()))) &&
            ((this.linkTransId==null && other.getLinkTransId()==null) || 
             (this.linkTransId!=null &&
              this.linkTransId.equals(other.getLinkTransId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.extErrorCode==null && other.getExtErrorCode()==null) || 
             (this.extErrorCode!=null &&
              this.extErrorCode.equals(other.getExtErrorCode())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getCurrentStateId() != null) {
            _hashCode += getCurrentStateId().hashCode();
        }
        if (getSIM() != null) {
            _hashCode += getSIM().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getBAN() != null) {
            _hashCode += getBAN().hashCode();
        }
        if (getLinkTransId() != null) {
            _hashCode += getLinkTransId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getExtErrorCode() != null) {
            _hashCode += getExtErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirstLUUpdateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUUpdateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "currentStateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIM"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BAN"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "status"));
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
        elemField.setFieldName("extErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "extErrorCode"));
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
