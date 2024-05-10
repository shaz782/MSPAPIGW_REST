/**
 * BlkCorpRCInsertRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class BlkCorpRCInsertRequest  implements java.io.Serializable {
    private long[] msisdn;

    private long[] accountId;

    private java.lang.String channel;

    private java.lang.String[] reason;

    private java.lang.String[] rcId;

    private java.lang.String[] rcCategory;

    private java.lang.String[] rcAmt;

    private java.lang.String[] mrp;

    private java.lang.String[] officecode;

    public BlkCorpRCInsertRequest() {
    }

    public BlkCorpRCInsertRequest(
           long[] msisdn,
           long[] accountId,
           java.lang.String channel,
           java.lang.String[] reason,
           java.lang.String[] rcId,
           java.lang.String[] rcCategory,
           java.lang.String[] rcAmt,
           java.lang.String[] mrp,
           java.lang.String[] officecode) {
           this.msisdn = msisdn;
           this.accountId = accountId;
           this.channel = channel;
           this.reason = reason;
           this.rcId = rcId;
           this.rcCategory = rcCategory;
           this.rcAmt = rcAmt;
           this.mrp = mrp;
           this.officecode = officecode;
    }


    /**
     * Gets the msisdn value for this BlkCorpRCInsertRequest.
     * 
     * @return msisdn
     */
    public long[] getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this BlkCorpRCInsertRequest.
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
     * Gets the accountId value for this BlkCorpRCInsertRequest.
     * 
     * @return accountId
     */
    public long[] getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this BlkCorpRCInsertRequest.
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
     * Gets the channel value for this BlkCorpRCInsertRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this BlkCorpRCInsertRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the reason value for this BlkCorpRCInsertRequest.
     * 
     * @return reason
     */
    public java.lang.String[] getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this BlkCorpRCInsertRequest.
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
     * Gets the rcId value for this BlkCorpRCInsertRequest.
     * 
     * @return rcId
     */
    public java.lang.String[] getRcId() {
        return rcId;
    }


    /**
     * Sets the rcId value for this BlkCorpRCInsertRequest.
     * 
     * @param rcId
     */
    public void setRcId(java.lang.String[] rcId) {
        this.rcId = rcId;
    }

    public java.lang.String getRcId(int i) {
        return this.rcId[i];
    }

    public void setRcId(int i, java.lang.String _value) {
        this.rcId[i] = _value;
    }


    /**
     * Gets the rcCategory value for this BlkCorpRCInsertRequest.
     * 
     * @return rcCategory
     */
    public java.lang.String[] getRcCategory() {
        return rcCategory;
    }


    /**
     * Sets the rcCategory value for this BlkCorpRCInsertRequest.
     * 
     * @param rcCategory
     */
    public void setRcCategory(java.lang.String[] rcCategory) {
        this.rcCategory = rcCategory;
    }

    public java.lang.String getRcCategory(int i) {
        return this.rcCategory[i];
    }

    public void setRcCategory(int i, java.lang.String _value) {
        this.rcCategory[i] = _value;
    }


    /**
     * Gets the rcAmt value for this BlkCorpRCInsertRequest.
     * 
     * @return rcAmt
     */
    public java.lang.String[] getRcAmt() {
        return rcAmt;
    }


    /**
     * Sets the rcAmt value for this BlkCorpRCInsertRequest.
     * 
     * @param rcAmt
     */
    public void setRcAmt(java.lang.String[] rcAmt) {
        this.rcAmt = rcAmt;
    }

    public java.lang.String getRcAmt(int i) {
        return this.rcAmt[i];
    }

    public void setRcAmt(int i, java.lang.String _value) {
        this.rcAmt[i] = _value;
    }


    /**
     * Gets the mrp value for this BlkCorpRCInsertRequest.
     * 
     * @return mrp
     */
    public java.lang.String[] getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this BlkCorpRCInsertRequest.
     * 
     * @param mrp
     */
    public void setMrp(java.lang.String[] mrp) {
        this.mrp = mrp;
    }

    public java.lang.String getMrp(int i) {
        return this.mrp[i];
    }

    public void setMrp(int i, java.lang.String _value) {
        this.mrp[i] = _value;
    }


    /**
     * Gets the officecode value for this BlkCorpRCInsertRequest.
     * 
     * @return officecode
     */
    public java.lang.String[] getOfficecode() {
        return officecode;
    }


    /**
     * Sets the officecode value for this BlkCorpRCInsertRequest.
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
        if (!(obj instanceof BlkCorpRCInsertRequest)) return false;
        BlkCorpRCInsertRequest other = (BlkCorpRCInsertRequest) obj;
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
            ((this.rcId==null && other.getRcId()==null) || 
             (this.rcId!=null &&
              java.util.Arrays.equals(this.rcId, other.getRcId()))) &&
            ((this.rcCategory==null && other.getRcCategory()==null) || 
             (this.rcCategory!=null &&
              java.util.Arrays.equals(this.rcCategory, other.getRcCategory()))) &&
            ((this.rcAmt==null && other.getRcAmt()==null) || 
             (this.rcAmt!=null &&
              java.util.Arrays.equals(this.rcAmt, other.getRcAmt()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              java.util.Arrays.equals(this.mrp, other.getMrp()))) &&
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
        if (getRcId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRcId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRcId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRcCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRcCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRcCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRcAmt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRcAmt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRcAmt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMrp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMrp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMrp(), i);
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
        new org.apache.axis.description.TypeDesc(BlkCorpRCInsertRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpRCInsertRequest"));
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
        elemField.setFieldName("rcId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "rcId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "rcCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "rcAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "mrp"));
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
