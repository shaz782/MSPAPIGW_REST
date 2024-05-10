/**
 * BulkTPSubscriptionUploadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class BulkTPSubscriptionUploadRequest  implements java.io.Serializable {
    private java.lang.String[] MSISDN;

    private java.lang.String[] newTariffPlanID;

    private java.lang.String[] charge;

    private java.lang.String fileName;

    private java.lang.String[] reason;

    private java.lang.String channelID;

    private java.lang.String officeCode;

    public BulkTPSubscriptionUploadRequest() {
    }

    public BulkTPSubscriptionUploadRequest(
           java.lang.String[] MSISDN,
           java.lang.String[] newTariffPlanID,
           java.lang.String[] charge,
           java.lang.String fileName,
           java.lang.String[] reason,
           java.lang.String channelID,
           java.lang.String officeCode) {
           this.MSISDN = MSISDN;
           this.newTariffPlanID = newTariffPlanID;
           this.charge = charge;
           this.fileName = fileName;
           this.reason = reason;
           this.channelID = channelID;
           this.officeCode = officeCode;
    }


    /**
     * Gets the MSISDN value for this BulkTPSubscriptionUploadRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String[] getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this BulkTPSubscriptionUploadRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String[] MSISDN) {
        this.MSISDN = MSISDN;
    }

    public java.lang.String getMSISDN(int i) {
        return this.MSISDN[i];
    }

    public void setMSISDN(int i, java.lang.String _value) {
        this.MSISDN[i] = _value;
    }


    /**
     * Gets the newTariffPlanID value for this BulkTPSubscriptionUploadRequest.
     * 
     * @return newTariffPlanID
     */
    public java.lang.String[] getNewTariffPlanID() {
        return newTariffPlanID;
    }


    /**
     * Sets the newTariffPlanID value for this BulkTPSubscriptionUploadRequest.
     * 
     * @param newTariffPlanID
     */
    public void setNewTariffPlanID(java.lang.String[] newTariffPlanID) {
        this.newTariffPlanID = newTariffPlanID;
    }

    public java.lang.String getNewTariffPlanID(int i) {
        return this.newTariffPlanID[i];
    }

    public void setNewTariffPlanID(int i, java.lang.String _value) {
        this.newTariffPlanID[i] = _value;
    }


    /**
     * Gets the charge value for this BulkTPSubscriptionUploadRequest.
     * 
     * @return charge
     */
    public java.lang.String[] getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this BulkTPSubscriptionUploadRequest.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String[] charge) {
        this.charge = charge;
    }

    public java.lang.String getCharge(int i) {
        return this.charge[i];
    }

    public void setCharge(int i, java.lang.String _value) {
        this.charge[i] = _value;
    }


    /**
     * Gets the fileName value for this BulkTPSubscriptionUploadRequest.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BulkTPSubscriptionUploadRequest.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the reason value for this BulkTPSubscriptionUploadRequest.
     * 
     * @return reason
     */
    public java.lang.String[] getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this BulkTPSubscriptionUploadRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String[] reason) {
        this.reason = reason;
    }

    public java.lang.String getReason(int i) {
        return this.reason[i];
    }

    public void setReason(int i, java.lang.String _value) {
        this.reason[i] = _value;
    }


    /**
     * Gets the channelID value for this BulkTPSubscriptionUploadRequest.
     * 
     * @return channelID
     */
    public java.lang.String getChannelID() {
        return channelID;
    }


    /**
     * Sets the channelID value for this BulkTPSubscriptionUploadRequest.
     * 
     * @param channelID
     */
    public void setChannelID(java.lang.String channelID) {
        this.channelID = channelID;
    }


    /**
     * Gets the officeCode value for this BulkTPSubscriptionUploadRequest.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this BulkTPSubscriptionUploadRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkTPSubscriptionUploadRequest)) return false;
        BulkTPSubscriptionUploadRequest other = (BulkTPSubscriptionUploadRequest) obj;
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
              java.util.Arrays.equals(this.MSISDN, other.getMSISDN()))) &&
            ((this.newTariffPlanID==null && other.getNewTariffPlanID()==null) || 
             (this.newTariffPlanID!=null &&
              java.util.Arrays.equals(this.newTariffPlanID, other.getNewTariffPlanID()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              java.util.Arrays.equals(this.charge, other.getCharge()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              java.util.Arrays.equals(this.reason, other.getReason()))) &&
            ((this.channelID==null && other.getChannelID()==null) || 
             (this.channelID!=null &&
              this.channelID.equals(other.getChannelID()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMSISDN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMSISDN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewTariffPlanID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewTariffPlanID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewTariffPlanID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCharge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannelID() != null) {
            _hashCode += getChannelID().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkTPSubscriptionUploadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkTPSubscriptionUploadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDNType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTariffPlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newTariffPlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "officeCode"));
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
