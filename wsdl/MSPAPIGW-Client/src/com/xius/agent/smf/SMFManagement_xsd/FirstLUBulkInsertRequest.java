/**
 * FirstLUBulkInsertRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class FirstLUBulkInsertRequest  implements java.io.Serializable {
    private java.lang.String ICCIDFrom;

    private java.lang.String ICCIDTo;

    private java.lang.String NIRCode;

    private java.lang.String officeCode;

    private java.lang.String channel;

    public FirstLUBulkInsertRequest() {
    }

    public FirstLUBulkInsertRequest(
           java.lang.String ICCIDFrom,
           java.lang.String ICCIDTo,
           java.lang.String NIRCode,
           java.lang.String officeCode,
           java.lang.String channel) {
           this.ICCIDFrom = ICCIDFrom;
           this.ICCIDTo = ICCIDTo;
           this.NIRCode = NIRCode;
           this.officeCode = officeCode;
           this.channel = channel;
    }


    /**
     * Gets the ICCIDFrom value for this FirstLUBulkInsertRequest.
     * 
     * @return ICCIDFrom
     */
    public java.lang.String getICCIDFrom() {
        return ICCIDFrom;
    }


    /**
     * Sets the ICCIDFrom value for this FirstLUBulkInsertRequest.
     * 
     * @param ICCIDFrom
     */
    public void setICCIDFrom(java.lang.String ICCIDFrom) {
        this.ICCIDFrom = ICCIDFrom;
    }


    /**
     * Gets the ICCIDTo value for this FirstLUBulkInsertRequest.
     * 
     * @return ICCIDTo
     */
    public java.lang.String getICCIDTo() {
        return ICCIDTo;
    }


    /**
     * Sets the ICCIDTo value for this FirstLUBulkInsertRequest.
     * 
     * @param ICCIDTo
     */
    public void setICCIDTo(java.lang.String ICCIDTo) {
        this.ICCIDTo = ICCIDTo;
    }


    /**
     * Gets the NIRCode value for this FirstLUBulkInsertRequest.
     * 
     * @return NIRCode
     */
    public java.lang.String getNIRCode() {
        return NIRCode;
    }


    /**
     * Sets the NIRCode value for this FirstLUBulkInsertRequest.
     * 
     * @param NIRCode
     */
    public void setNIRCode(java.lang.String NIRCode) {
        this.NIRCode = NIRCode;
    }


    /**
     * Gets the officeCode value for this FirstLUBulkInsertRequest.
     * 
     * @return officeCode
     */
    public java.lang.String getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this FirstLUBulkInsertRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(java.lang.String officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the channel value for this FirstLUBulkInsertRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this FirstLUBulkInsertRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirstLUBulkInsertRequest)) return false;
        FirstLUBulkInsertRequest other = (FirstLUBulkInsertRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ICCIDFrom==null && other.getICCIDFrom()==null) || 
             (this.ICCIDFrom!=null &&
              this.ICCIDFrom.equals(other.getICCIDFrom()))) &&
            ((this.ICCIDTo==null && other.getICCIDTo()==null) || 
             (this.ICCIDTo!=null &&
              this.ICCIDTo.equals(other.getICCIDTo()))) &&
            ((this.NIRCode==null && other.getNIRCode()==null) || 
             (this.NIRCode!=null &&
              this.NIRCode.equals(other.getNIRCode()))) &&
            ((this.officeCode==null && other.getOfficeCode()==null) || 
             (this.officeCode!=null &&
              this.officeCode.equals(other.getOfficeCode()))) &&
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
        if (getICCIDFrom() != null) {
            _hashCode += getICCIDFrom().hashCode();
        }
        if (getICCIDTo() != null) {
            _hashCode += getICCIDTo().hashCode();
        }
        if (getNIRCode() != null) {
            _hashCode += getNIRCode().hashCode();
        }
        if (getOfficeCode() != null) {
            _hashCode += getOfficeCode().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirstLUBulkInsertRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUBulkInsertRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCIDFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ICCIDFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCIDTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ICCIDTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIRCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "NIRCode"));
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
