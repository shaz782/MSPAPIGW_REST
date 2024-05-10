/**
 * BlkCorpActDeActInsertRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class BlkCorpActDeActInsertRequest  implements java.io.Serializable {
    private long[] msisdn;

    private long[] accountId;

    private java.lang.String channel;

    private java.lang.String[] reason;

    private java.lang.String[] activityType;

    private java.lang.String[] officecode;

    public BlkCorpActDeActInsertRequest() {
    }

    public BlkCorpActDeActInsertRequest(
           long[] msisdn,
           long[] accountId,
           java.lang.String channel,
           java.lang.String[] reason,
           java.lang.String[] activityType,
           java.lang.String[] officecode) {
           this.msisdn = msisdn;
           this.accountId = accountId;
           this.channel = channel;
           this.reason = reason;
           this.activityType = activityType;
           this.officecode = officecode;
    }


    /**
     * Gets the msisdn value for this BlkCorpActDeActInsertRequest.
     * 
     * @return msisdn
     */
    public long[] getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this BlkCorpActDeActInsertRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(long[] msisdn) {
        this.msisdn = msisdn;
    }

    public long getMsisdn(int i) {
        return this.msisdn[i];
    }

    public void setMsisdn(int i, long _value) {
        this.msisdn[i] = _value;
    }


    /**
     * Gets the accountId value for this BlkCorpActDeActInsertRequest.
     * 
     * @return accountId
     */
    public long[] getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this BlkCorpActDeActInsertRequest.
     * 
     * @param accountId
     */
    public void setAccountId(long[] accountId) {
        this.accountId = accountId;
    }

    public long getAccountId(int i) {
        return this.accountId[i];
    }

    public void setAccountId(int i, long _value) {
        this.accountId[i] = _value;
    }


    /**
     * Gets the channel value for this BlkCorpActDeActInsertRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this BlkCorpActDeActInsertRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the reason value for this BlkCorpActDeActInsertRequest.
     * 
     * @return reason
     */
    public java.lang.String[] getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this BlkCorpActDeActInsertRequest.
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
     * Gets the activityType value for this BlkCorpActDeActInsertRequest.
     * 
     * @return activityType
     */
    public java.lang.String[] getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this BlkCorpActDeActInsertRequest.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.String[] activityType) {
        this.activityType = activityType;
    }

    public java.lang.String getActivityType(int i) {
        return this.activityType[i];
    }

    public void setActivityType(int i, java.lang.String _value) {
        this.activityType[i] = _value;
    }


    /**
     * Gets the officecode value for this BlkCorpActDeActInsertRequest.
     * 
     * @return officecode
     */
    public java.lang.String[] getOfficecode() {
        return officecode;
    }


    /**
     * Sets the officecode value for this BlkCorpActDeActInsertRequest.
     * 
     * @param officecode
     */
    public void setOfficecode(java.lang.String[] officecode) {
        this.officecode = officecode;
    }

    public java.lang.String getOfficecode(int i) {
        return this.officecode[i];
    }

    public void setOfficecode(int i, java.lang.String _value) {
        this.officecode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlkCorpActDeActInsertRequest)) return false;
        BlkCorpActDeActInsertRequest other = (BlkCorpActDeActInsertRequest) obj;
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
              java.util.Arrays.equals(this.msisdn, other.getMsisdn()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              java.util.Arrays.equals(this.accountId, other.getAccountId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              java.util.Arrays.equals(this.reason, other.getReason()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              java.util.Arrays.equals(this.activityType, other.getActivityType()))) &&
            ((this.officecode==null && other.getOfficecode()==null) || 
             (this.officecode!=null &&
              java.util.Arrays.equals(this.officecode, other.getOfficecode())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMsisdn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMsisdn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
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
        if (getActivityType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivityType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivityType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfficecode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfficecode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfficecode(), i);
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
        new org.apache.axis.description.TypeDesc(BlkCorpActDeActInsertRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpActDeActInsertRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channel"));
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
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "officecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
