/**
 * BulkATPSubscriptionUpdateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class BulkATPSubscriptionUpdateRequest  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String chargeId;

    private java.lang.String charge;

    private java.lang.String extErrorCode;

    private java.lang.String status;

    private java.lang.String remarks;

    private java.lang.String flag;

    public BulkATPSubscriptionUpdateRequest() {
    }

    public BulkATPSubscriptionUpdateRequest(
           java.lang.String transactionId,
           java.lang.String chargeId,
           java.lang.String charge,
           java.lang.String extErrorCode,
           java.lang.String status,
           java.lang.String remarks,
           java.lang.String flag) {
           this.transactionId = transactionId;
           this.chargeId = chargeId;
           this.charge = charge;
           this.extErrorCode = extErrorCode;
           this.status = status;
           this.remarks = remarks;
           this.flag = flag;
    }


    /**
     * Gets the transactionId value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the chargeId value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @return chargeId
     */
    public java.lang.String getChargeId() {
        return chargeId;
    }


    /**
     * Sets the chargeId value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @param chargeId
     */
    public void setChargeId(java.lang.String chargeId) {
        this.chargeId = chargeId;
    }


    /**
     * Gets the charge value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the extErrorCode value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @return extErrorCode
     */
    public java.lang.String getExtErrorCode() {
        return extErrorCode;
    }


    /**
     * Sets the extErrorCode value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @param extErrorCode
     */
    public void setExtErrorCode(java.lang.String extErrorCode) {
        this.extErrorCode = extErrorCode;
    }


    /**
     * Gets the status value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the remarks value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the flag value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @return flag
     */
    public java.lang.String getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this BulkATPSubscriptionUpdateRequest.
     * 
     * @param flag
     */
    public void setFlag(java.lang.String flag) {
        this.flag = flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkATPSubscriptionUpdateRequest)) return false;
        BulkATPSubscriptionUpdateRequest other = (BulkATPSubscriptionUpdateRequest) obj;
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
            ((this.chargeId==null && other.getChargeId()==null) || 
             (this.chargeId!=null &&
              this.chargeId.equals(other.getChargeId()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.extErrorCode==null && other.getExtErrorCode()==null) || 
             (this.extErrorCode!=null &&
              this.extErrorCode.equals(other.getExtErrorCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag())));
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
        if (getChargeId() != null) {
            _hashCode += getChargeId().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getExtErrorCode() != null) {
            _hashCode += getExtErrorCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkATPSubscriptionUpdateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPSubscriptionUpdateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "chargeId"));
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
        elemField.setFieldName("extErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "extErrorCode"));
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
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "flag"));
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
