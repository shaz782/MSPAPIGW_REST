/**
 * BulkSpecialCreditUpldRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class BulkSpecialCreditUpldRequest  implements java.io.Serializable {
    private java.lang.String[] MSISDN;

    private java.lang.String[] amount;

    private java.lang.String[] newValidityDate;

    private java.lang.String[] newGracePeriodIEndDate;

    private java.lang.String[] newExpiryDate;

    private java.lang.String[] reason;

    private java.lang.String channelID;

    private java.lang.String filename;

    public BulkSpecialCreditUpldRequest() {
    }

    public BulkSpecialCreditUpldRequest(
           java.lang.String[] MSISDN,
           java.lang.String[] amount,
           java.lang.String[] newValidityDate,
           java.lang.String[] newGracePeriodIEndDate,
           java.lang.String[] newExpiryDate,
           java.lang.String[] reason,
           java.lang.String channelID,
           java.lang.String filename) {
           this.MSISDN = MSISDN;
           this.amount = amount;
           this.newValidityDate = newValidityDate;
           this.newGracePeriodIEndDate = newGracePeriodIEndDate;
           this.newExpiryDate = newExpiryDate;
           this.reason = reason;
           this.channelID = channelID;
           this.filename = filename;
    }


    /**
     * Gets the MSISDN value for this BulkSpecialCreditUpldRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String[] getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this BulkSpecialCreditUpldRequest.
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
     * Gets the amount value for this BulkSpecialCreditUpldRequest.
     * 
     * @return amount
     */
    public java.lang.String[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BulkSpecialCreditUpldRequest.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String[] amount) {
        this.amount = amount;
    }

    public java.lang.String getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, java.lang.String _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the newValidityDate value for this BulkSpecialCreditUpldRequest.
     * 
     * @return newValidityDate
     */
    public java.lang.String[] getNewValidityDate() {
        return newValidityDate;
    }


    /**
     * Sets the newValidityDate value for this BulkSpecialCreditUpldRequest.
     * 
     * @param newValidityDate
     */
    public void setNewValidityDate(java.lang.String[] newValidityDate) {
        this.newValidityDate = newValidityDate;
    }

    public java.lang.String getNewValidityDate(int i) {
        return this.newValidityDate[i];
    }

    public void setNewValidityDate(int i, java.lang.String _value) {
        this.newValidityDate[i] = _value;
    }


    /**
     * Gets the newGracePeriodIEndDate value for this BulkSpecialCreditUpldRequest.
     * 
     * @return newGracePeriodIEndDate
     */
    public java.lang.String[] getNewGracePeriodIEndDate() {
        return newGracePeriodIEndDate;
    }


    /**
     * Sets the newGracePeriodIEndDate value for this BulkSpecialCreditUpldRequest.
     * 
     * @param newGracePeriodIEndDate
     */
    public void setNewGracePeriodIEndDate(java.lang.String[] newGracePeriodIEndDate) {
        this.newGracePeriodIEndDate = newGracePeriodIEndDate;
    }

    public java.lang.String getNewGracePeriodIEndDate(int i) {
        return this.newGracePeriodIEndDate[i];
    }

    public void setNewGracePeriodIEndDate(int i, java.lang.String _value) {
        this.newGracePeriodIEndDate[i] = _value;
    }


    /**
     * Gets the newExpiryDate value for this BulkSpecialCreditUpldRequest.
     * 
     * @return newExpiryDate
     */
    public java.lang.String[] getNewExpiryDate() {
        return newExpiryDate;
    }


    /**
     * Sets the newExpiryDate value for this BulkSpecialCreditUpldRequest.
     * 
     * @param newExpiryDate
     */
    public void setNewExpiryDate(java.lang.String[] newExpiryDate) {
        this.newExpiryDate = newExpiryDate;
    }

    public java.lang.String getNewExpiryDate(int i) {
        return this.newExpiryDate[i];
    }

    public void setNewExpiryDate(int i, java.lang.String _value) {
        this.newExpiryDate[i] = _value;
    }


    /**
     * Gets the reason value for this BulkSpecialCreditUpldRequest.
     * 
     * @return reason
     */
    public java.lang.String[] getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this BulkSpecialCreditUpldRequest.
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
     * Gets the channelID value for this BulkSpecialCreditUpldRequest.
     * 
     * @return channelID
     */
    public java.lang.String getChannelID() {
        return channelID;
    }


    /**
     * Sets the channelID value for this BulkSpecialCreditUpldRequest.
     * 
     * @param channelID
     */
    public void setChannelID(java.lang.String channelID) {
        this.channelID = channelID;
    }


    /**
     * Gets the filename value for this BulkSpecialCreditUpldRequest.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this BulkSpecialCreditUpldRequest.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkSpecialCreditUpldRequest)) return false;
        BulkSpecialCreditUpldRequest other = (BulkSpecialCreditUpldRequest) obj;
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
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.newValidityDate==null && other.getNewValidityDate()==null) || 
             (this.newValidityDate!=null &&
              java.util.Arrays.equals(this.newValidityDate, other.getNewValidityDate()))) &&
            ((this.newGracePeriodIEndDate==null && other.getNewGracePeriodIEndDate()==null) || 
             (this.newGracePeriodIEndDate!=null &&
              java.util.Arrays.equals(this.newGracePeriodIEndDate, other.getNewGracePeriodIEndDate()))) &&
            ((this.newExpiryDate==null && other.getNewExpiryDate()==null) || 
             (this.newExpiryDate!=null &&
              java.util.Arrays.equals(this.newExpiryDate, other.getNewExpiryDate()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              java.util.Arrays.equals(this.reason, other.getReason()))) &&
            ((this.channelID==null && other.getChannelID()==null) || 
             (this.channelID!=null &&
              this.channelID.equals(other.getChannelID()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename())));
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
        if (getAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewValidityDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewValidityDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewValidityDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewGracePeriodIEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewGracePeriodIEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewGracePeriodIEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewExpiryDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewExpiryDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewExpiryDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkSpecialCreditUpldRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSpecialCreditUpldRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDNType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValidityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newValidityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newGracePeriodIEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newGracePeriodIEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "filename"));
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
