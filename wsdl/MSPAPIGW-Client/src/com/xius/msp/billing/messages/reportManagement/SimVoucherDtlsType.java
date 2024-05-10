/**
 * SimVoucherDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class SimVoucherDtlsType  implements java.io.Serializable {
    private java.lang.String sim;

    private java.lang.String msisdn;

    private java.lang.String activationDate;

    private java.lang.String voucherProfileId;

    private java.lang.String voucherProfileName;

    private java.lang.String voucherNumber;

    private java.lang.String voucherStatusDate;

    public SimVoucherDtlsType() {
    }

    public SimVoucherDtlsType(
           java.lang.String sim,
           java.lang.String msisdn,
           java.lang.String activationDate,
           java.lang.String voucherProfileId,
           java.lang.String voucherProfileName,
           java.lang.String voucherNumber,
           java.lang.String voucherStatusDate) {
           this.sim = sim;
           this.msisdn = msisdn;
           this.activationDate = activationDate;
           this.voucherProfileId = voucherProfileId;
           this.voucherProfileName = voucherProfileName;
           this.voucherNumber = voucherNumber;
           this.voucherStatusDate = voucherStatusDate;
    }


    /**
     * Gets the sim value for this SimVoucherDtlsType.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this SimVoucherDtlsType.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the msisdn value for this SimVoucherDtlsType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SimVoucherDtlsType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the activationDate value for this SimVoucherDtlsType.
     * 
     * @return activationDate
     */
    public java.lang.String getActivationDate() {
        return activationDate;
    }


    /**
     * Sets the activationDate value for this SimVoucherDtlsType.
     * 
     * @param activationDate
     */
    public void setActivationDate(java.lang.String activationDate) {
        this.activationDate = activationDate;
    }


    /**
     * Gets the voucherProfileId value for this SimVoucherDtlsType.
     * 
     * @return voucherProfileId
     */
    public java.lang.String getVoucherProfileId() {
        return voucherProfileId;
    }


    /**
     * Sets the voucherProfileId value for this SimVoucherDtlsType.
     * 
     * @param voucherProfileId
     */
    public void setVoucherProfileId(java.lang.String voucherProfileId) {
        this.voucherProfileId = voucherProfileId;
    }


    /**
     * Gets the voucherProfileName value for this SimVoucherDtlsType.
     * 
     * @return voucherProfileName
     */
    public java.lang.String getVoucherProfileName() {
        return voucherProfileName;
    }


    /**
     * Sets the voucherProfileName value for this SimVoucherDtlsType.
     * 
     * @param voucherProfileName
     */
    public void setVoucherProfileName(java.lang.String voucherProfileName) {
        this.voucherProfileName = voucherProfileName;
    }


    /**
     * Gets the voucherNumber value for this SimVoucherDtlsType.
     * 
     * @return voucherNumber
     */
    public java.lang.String getVoucherNumber() {
        return voucherNumber;
    }


    /**
     * Sets the voucherNumber value for this SimVoucherDtlsType.
     * 
     * @param voucherNumber
     */
    public void setVoucherNumber(java.lang.String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }


    /**
     * Gets the voucherStatusDate value for this SimVoucherDtlsType.
     * 
     * @return voucherStatusDate
     */
    public java.lang.String getVoucherStatusDate() {
        return voucherStatusDate;
    }


    /**
     * Sets the voucherStatusDate value for this SimVoucherDtlsType.
     * 
     * @param voucherStatusDate
     */
    public void setVoucherStatusDate(java.lang.String voucherStatusDate) {
        this.voucherStatusDate = voucherStatusDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimVoucherDtlsType)) return false;
        SimVoucherDtlsType other = (SimVoucherDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.activationDate==null && other.getActivationDate()==null) || 
             (this.activationDate!=null &&
              this.activationDate.equals(other.getActivationDate()))) &&
            ((this.voucherProfileId==null && other.getVoucherProfileId()==null) || 
             (this.voucherProfileId!=null &&
              this.voucherProfileId.equals(other.getVoucherProfileId()))) &&
            ((this.voucherProfileName==null && other.getVoucherProfileName()==null) || 
             (this.voucherProfileName!=null &&
              this.voucherProfileName.equals(other.getVoucherProfileName()))) &&
            ((this.voucherNumber==null && other.getVoucherNumber()==null) || 
             (this.voucherNumber!=null &&
              this.voucherNumber.equals(other.getVoucherNumber()))) &&
            ((this.voucherStatusDate==null && other.getVoucherStatusDate()==null) || 
             (this.voucherStatusDate!=null &&
              this.voucherStatusDate.equals(other.getVoucherStatusDate())));
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
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getActivationDate() != null) {
            _hashCode += getActivationDate().hashCode();
        }
        if (getVoucherProfileId() != null) {
            _hashCode += getVoucherProfileId().hashCode();
        }
        if (getVoucherProfileName() != null) {
            _hashCode += getVoucherProfileName().hashCode();
        }
        if (getVoucherNumber() != null) {
            _hashCode += getVoucherNumber().hashCode();
        }
        if (getVoucherStatusDate() != null) {
            _hashCode += getVoucherStatusDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimVoucherDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simVoucherDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "activationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherProfileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherProfileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherStatusDate"));
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
