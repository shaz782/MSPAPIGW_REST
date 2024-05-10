/**
 * BillCycleDatesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class BillCycleDatesType  implements java.io.Serializable {
    private java.lang.Long networkID;

    private java.lang.Long billCycleDay;

    private java.lang.String networkDesc;

    public BillCycleDatesType() {
    }

    public BillCycleDatesType(
           java.lang.Long networkID,
           java.lang.Long billCycleDay,
           java.lang.String networkDesc) {
           this.networkID = networkID;
           this.billCycleDay = billCycleDay;
           this.networkDesc = networkDesc;
    }


    /**
     * Gets the networkID value for this BillCycleDatesType.
     * 
     * @return networkID
     */
    public java.lang.Long getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this BillCycleDatesType.
     * 
     * @param networkID
     */
    public void setNetworkID(java.lang.Long networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the billCycleDay value for this BillCycleDatesType.
     * 
     * @return billCycleDay
     */
    public java.lang.Long getBillCycleDay() {
        return billCycleDay;
    }


    /**
     * Sets the billCycleDay value for this BillCycleDatesType.
     * 
     * @param billCycleDay
     */
    public void setBillCycleDay(java.lang.Long billCycleDay) {
        this.billCycleDay = billCycleDay;
    }


    /**
     * Gets the networkDesc value for this BillCycleDatesType.
     * 
     * @return networkDesc
     */
    public java.lang.String getNetworkDesc() {
        return networkDesc;
    }


    /**
     * Sets the networkDesc value for this BillCycleDatesType.
     * 
     * @param networkDesc
     */
    public void setNetworkDesc(java.lang.String networkDesc) {
        this.networkDesc = networkDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillCycleDatesType)) return false;
        BillCycleDatesType other = (BillCycleDatesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.billCycleDay==null && other.getBillCycleDay()==null) || 
             (this.billCycleDay!=null &&
              this.billCycleDay.equals(other.getBillCycleDay()))) &&
            ((this.networkDesc==null && other.getNetworkDesc()==null) || 
             (this.networkDesc!=null &&
              this.networkDesc.equals(other.getNetworkDesc())));
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
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getBillCycleDay() != null) {
            _hashCode += getBillCycleDay().hashCode();
        }
        if (getNetworkDesc() != null) {
            _hashCode += getNetworkDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillCycleDatesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "BillCycleDatesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "billCycleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkDesc"));
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
