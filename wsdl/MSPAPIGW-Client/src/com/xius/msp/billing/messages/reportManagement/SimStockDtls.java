/**
 * SimStockDtls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class SimStockDtls  implements java.io.Serializable {
    private java.lang.String officeName;

    private java.lang.Long active;

    private java.lang.Long inactive;

    private java.lang.Long unregistered;

    public SimStockDtls() {
    }

    public SimStockDtls(
           java.lang.String officeName,
           java.lang.Long active,
           java.lang.Long inactive,
           java.lang.Long unregistered) {
           this.officeName = officeName;
           this.active = active;
           this.inactive = inactive;
           this.unregistered = unregistered;
    }


    /**
     * Gets the officeName value for this SimStockDtls.
     * 
     * @return officeName
     */
    public java.lang.String getOfficeName() {
        return officeName;
    }


    /**
     * Sets the officeName value for this SimStockDtls.
     * 
     * @param officeName
     */
    public void setOfficeName(java.lang.String officeName) {
        this.officeName = officeName;
    }


    /**
     * Gets the active value for this SimStockDtls.
     * 
     * @return active
     */
    public java.lang.Long getActive() {
        return active;
    }


    /**
     * Sets the active value for this SimStockDtls.
     * 
     * @param active
     */
    public void setActive(java.lang.Long active) {
        this.active = active;
    }


    /**
     * Gets the inactive value for this SimStockDtls.
     * 
     * @return inactive
     */
    public java.lang.Long getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this SimStockDtls.
     * 
     * @param inactive
     */
    public void setInactive(java.lang.Long inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the unregistered value for this SimStockDtls.
     * 
     * @return unregistered
     */
    public java.lang.Long getUnregistered() {
        return unregistered;
    }


    /**
     * Sets the unregistered value for this SimStockDtls.
     * 
     * @param unregistered
     */
    public void setUnregistered(java.lang.Long unregistered) {
        this.unregistered = unregistered;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimStockDtls)) return false;
        SimStockDtls other = (SimStockDtls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeName==null && other.getOfficeName()==null) || 
             (this.officeName!=null &&
              this.officeName.equals(other.getOfficeName()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.inactive==null && other.getInactive()==null) || 
             (this.inactive!=null &&
              this.inactive.equals(other.getInactive()))) &&
            ((this.unregistered==null && other.getUnregistered()==null) || 
             (this.unregistered!=null &&
              this.unregistered.equals(other.getUnregistered())));
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
        if (getOfficeName() != null) {
            _hashCode += getOfficeName().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getInactive() != null) {
            _hashCode += getInactive().hashCode();
        }
        if (getUnregistered() != null) {
            _hashCode += getUnregistered().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimStockDtls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimStockDtls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "officeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "inactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unregistered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "unregistered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
