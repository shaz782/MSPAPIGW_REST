/**
 * ImeiDtylType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class ImeiDtylType  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String IMEIID;

    private java.lang.String simSerialNO;

    public ImeiDtylType() {
    }

    public ImeiDtylType(
           java.lang.String MSISDN,
           java.lang.String IMEIID,
           java.lang.String simSerialNO) {
           this.MSISDN = MSISDN;
           this.IMEIID = IMEIID;
           this.simSerialNO = simSerialNO;
    }


    /**
     * Gets the MSISDN value for this ImeiDtylType.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ImeiDtylType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the IMEIID value for this ImeiDtylType.
     * 
     * @return IMEIID
     */
    public java.lang.String getIMEIID() {
        return IMEIID;
    }


    /**
     * Sets the IMEIID value for this ImeiDtylType.
     * 
     * @param IMEIID
     */
    public void setIMEIID(java.lang.String IMEIID) {
        this.IMEIID = IMEIID;
    }


    /**
     * Gets the simSerialNO value for this ImeiDtylType.
     * 
     * @return simSerialNO
     */
    public java.lang.String getSimSerialNO() {
        return simSerialNO;
    }


    /**
     * Sets the simSerialNO value for this ImeiDtylType.
     * 
     * @param simSerialNO
     */
    public void setSimSerialNO(java.lang.String simSerialNO) {
        this.simSerialNO = simSerialNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImeiDtylType)) return false;
        ImeiDtylType other = (ImeiDtylType) obj;
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
            ((this.IMEIID==null && other.getIMEIID()==null) || 
             (this.IMEIID!=null &&
              this.IMEIID.equals(other.getIMEIID()))) &&
            ((this.simSerialNO==null && other.getSimSerialNO()==null) || 
             (this.simSerialNO!=null &&
              this.simSerialNO.equals(other.getSimSerialNO())));
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
        if (getIMEIID() != null) {
            _hashCode += getIMEIID().hashCode();
        }
        if (getSimSerialNO() != null) {
            _hashCode += getSimSerialNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImeiDtylType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "imeiDtylType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEIID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IMEIID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simSerialNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "simSerialNO"));
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
