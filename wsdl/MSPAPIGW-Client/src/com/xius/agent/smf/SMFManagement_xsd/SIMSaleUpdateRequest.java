/**
 * SIMSaleUpdateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class SIMSaleUpdateRequest  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String externalTransId;

    private long curentStateId;

    private java.lang.String newMSISDN;

    private java.lang.String oldMSISDN;

    private java.lang.String oldSIM;

    private java.lang.String newSIM;

    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.String status;

    private java.lang.String remarks;

    private java.lang.String externalstatus;

    private java.lang.String externalremarks;

    private java.lang.String responsecode;

    private java.lang.String responsemsg;

    private java.lang.String extErrorCode;

    public SIMSaleUpdateRequest() {
    }

    public SIMSaleUpdateRequest(
           java.lang.String transactionId,
           java.lang.String externalTransId,
           long curentStateId,
           java.lang.String newMSISDN,
           java.lang.String oldMSISDN,
           java.lang.String oldSIM,
           java.lang.String newSIM,
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.String status,
           java.lang.String remarks,
           java.lang.String externalstatus,
           java.lang.String externalremarks,
           java.lang.String responsecode,
           java.lang.String responsemsg,
           java.lang.String extErrorCode) {
           this.transactionId = transactionId;
           this.externalTransId = externalTransId;
           this.curentStateId = curentStateId;
           this.newMSISDN = newMSISDN;
           this.oldMSISDN = oldMSISDN;
           this.oldSIM = oldSIM;
           this.newSIM = newSIM;
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.status = status;
           this.remarks = remarks;
           this.externalstatus = externalstatus;
           this.externalremarks = externalremarks;
           this.responsecode = responsecode;
           this.responsemsg = responsemsg;
           this.extErrorCode = extErrorCode;
    }


    /**
     * Gets the transactionId value for this SIMSaleUpdateRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this SIMSaleUpdateRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the externalTransId value for this SIMSaleUpdateRequest.
     * 
     * @return externalTransId
     */
    public java.lang.String getExternalTransId() {
        return externalTransId;
    }


    /**
     * Sets the externalTransId value for this SIMSaleUpdateRequest.
     * 
     * @param externalTransId
     */
    public void setExternalTransId(java.lang.String externalTransId) {
        this.externalTransId = externalTransId;
    }


    /**
     * Gets the curentStateId value for this SIMSaleUpdateRequest.
     * 
     * @return curentStateId
     */
    public long getCurentStateId() {
        return curentStateId;
    }


    /**
     * Sets the curentStateId value for this SIMSaleUpdateRequest.
     * 
     * @param curentStateId
     */
    public void setCurentStateId(long curentStateId) {
        this.curentStateId = curentStateId;
    }


    /**
     * Gets the newMSISDN value for this SIMSaleUpdateRequest.
     * 
     * @return newMSISDN
     */
    public java.lang.String getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this SIMSaleUpdateRequest.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.String newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the oldMSISDN value for this SIMSaleUpdateRequest.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this SIMSaleUpdateRequest.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the oldSIM value for this SIMSaleUpdateRequest.
     * 
     * @return oldSIM
     */
    public java.lang.String getOldSIM() {
        return oldSIM;
    }


    /**
     * Sets the oldSIM value for this SIMSaleUpdateRequest.
     * 
     * @param oldSIM
     */
    public void setOldSIM(java.lang.String oldSIM) {
        this.oldSIM = oldSIM;
    }


    /**
     * Gets the newSIM value for this SIMSaleUpdateRequest.
     * 
     * @return newSIM
     */
    public java.lang.String getNewSIM() {
        return newSIM;
    }


    /**
     * Sets the newSIM value for this SIMSaleUpdateRequest.
     * 
     * @param newSIM
     */
    public void setNewSIM(java.lang.String newSIM) {
        this.newSIM = newSIM;
    }


    /**
     * Gets the oldIMSI value for this SIMSaleUpdateRequest.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this SIMSaleUpdateRequest.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this SIMSaleUpdateRequest.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this SIMSaleUpdateRequest.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the status value for this SIMSaleUpdateRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SIMSaleUpdateRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the remarks value for this SIMSaleUpdateRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this SIMSaleUpdateRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the externalstatus value for this SIMSaleUpdateRequest.
     * 
     * @return externalstatus
     */
    public java.lang.String getExternalstatus() {
        return externalstatus;
    }


    /**
     * Sets the externalstatus value for this SIMSaleUpdateRequest.
     * 
     * @param externalstatus
     */
    public void setExternalstatus(java.lang.String externalstatus) {
        this.externalstatus = externalstatus;
    }


    /**
     * Gets the externalremarks value for this SIMSaleUpdateRequest.
     * 
     * @return externalremarks
     */
    public java.lang.String getExternalremarks() {
        return externalremarks;
    }


    /**
     * Sets the externalremarks value for this SIMSaleUpdateRequest.
     * 
     * @param externalremarks
     */
    public void setExternalremarks(java.lang.String externalremarks) {
        this.externalremarks = externalremarks;
    }


    /**
     * Gets the responsecode value for this SIMSaleUpdateRequest.
     * 
     * @return responsecode
     */
    public java.lang.String getResponsecode() {
        return responsecode;
    }


    /**
     * Sets the responsecode value for this SIMSaleUpdateRequest.
     * 
     * @param responsecode
     */
    public void setResponsecode(java.lang.String responsecode) {
        this.responsecode = responsecode;
    }


    /**
     * Gets the responsemsg value for this SIMSaleUpdateRequest.
     * 
     * @return responsemsg
     */
    public java.lang.String getResponsemsg() {
        return responsemsg;
    }


    /**
     * Sets the responsemsg value for this SIMSaleUpdateRequest.
     * 
     * @param responsemsg
     */
    public void setResponsemsg(java.lang.String responsemsg) {
        this.responsemsg = responsemsg;
    }


    /**
     * Gets the extErrorCode value for this SIMSaleUpdateRequest.
     * 
     * @return extErrorCode
     */
    public java.lang.String getExtErrorCode() {
        return extErrorCode;
    }


    /**
     * Sets the extErrorCode value for this SIMSaleUpdateRequest.
     * 
     * @param extErrorCode
     */
    public void setExtErrorCode(java.lang.String extErrorCode) {
        this.extErrorCode = extErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMSaleUpdateRequest)) return false;
        SIMSaleUpdateRequest other = (SIMSaleUpdateRequest) obj;
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
            ((this.externalTransId==null && other.getExternalTransId()==null) || 
             (this.externalTransId!=null &&
              this.externalTransId.equals(other.getExternalTransId()))) &&
            this.curentStateId == other.getCurentStateId() &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.oldSIM==null && other.getOldSIM()==null) || 
             (this.oldSIM!=null &&
              this.oldSIM.equals(other.getOldSIM()))) &&
            ((this.newSIM==null && other.getNewSIM()==null) || 
             (this.newSIM!=null &&
              this.newSIM.equals(other.getNewSIM()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.externalstatus==null && other.getExternalstatus()==null) || 
             (this.externalstatus!=null &&
              this.externalstatus.equals(other.getExternalstatus()))) &&
            ((this.externalremarks==null && other.getExternalremarks()==null) || 
             (this.externalremarks!=null &&
              this.externalremarks.equals(other.getExternalremarks()))) &&
            ((this.responsecode==null && other.getResponsecode()==null) || 
             (this.responsecode!=null &&
              this.responsecode.equals(other.getResponsecode()))) &&
            ((this.responsemsg==null && other.getResponsemsg()==null) || 
             (this.responsemsg!=null &&
              this.responsemsg.equals(other.getResponsemsg()))) &&
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
        if (getExternalTransId() != null) {
            _hashCode += getExternalTransId().hashCode();
        }
        _hashCode += new Long(getCurentStateId()).hashCode();
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getOldSIM() != null) {
            _hashCode += getOldSIM().hashCode();
        }
        if (getNewSIM() != null) {
            _hashCode += getNewSIM().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getExternalstatus() != null) {
            _hashCode += getExternalstatus().hashCode();
        }
        if (getExternalremarks() != null) {
            _hashCode += getExternalremarks().hashCode();
        }
        if (getResponsecode() != null) {
            _hashCode += getResponsecode().hashCode();
        }
        if (getResponsemsg() != null) {
            _hashCode += getResponsemsg().hashCode();
        }
        if (getExtErrorCode() != null) {
            _hashCode += getExtErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIMSaleUpdateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "externalTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curentStateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "CurentStateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newIMSI"));
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
        elemField.setFieldName("externalstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Externalstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalremarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Externalremarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Responsecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsemsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "Responsemsg"));
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
