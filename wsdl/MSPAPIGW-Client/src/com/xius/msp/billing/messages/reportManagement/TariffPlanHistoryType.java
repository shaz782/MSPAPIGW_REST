/**
 * TariffPlanHistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class TariffPlanHistoryType  implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String oldTariffPlan;

    private java.lang.String newTariffPlan;

    private java.lang.String byWhom;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public TariffPlanHistoryType() {
    }

    public TariffPlanHistoryType(
           java.lang.String date,
           java.lang.String oldTariffPlan,
           java.lang.String newTariffPlan,
           java.lang.String byWhom,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.date = date;
           this.oldTariffPlan = oldTariffPlan;
           this.newTariffPlan = newTariffPlan;
           this.byWhom = byWhom;
           this.taxType = taxType;
    }


    /**
     * Gets the date value for this TariffPlanHistoryType.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this TariffPlanHistoryType.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the oldTariffPlan value for this TariffPlanHistoryType.
     * 
     * @return oldTariffPlan
     */
    public java.lang.String getOldTariffPlan() {
        return oldTariffPlan;
    }


    /**
     * Sets the oldTariffPlan value for this TariffPlanHistoryType.
     * 
     * @param oldTariffPlan
     */
    public void setOldTariffPlan(java.lang.String oldTariffPlan) {
        this.oldTariffPlan = oldTariffPlan;
    }


    /**
     * Gets the newTariffPlan value for this TariffPlanHistoryType.
     * 
     * @return newTariffPlan
     */
    public java.lang.String getNewTariffPlan() {
        return newTariffPlan;
    }


    /**
     * Sets the newTariffPlan value for this TariffPlanHistoryType.
     * 
     * @param newTariffPlan
     */
    public void setNewTariffPlan(java.lang.String newTariffPlan) {
        this.newTariffPlan = newTariffPlan;
    }


    /**
     * Gets the byWhom value for this TariffPlanHistoryType.
     * 
     * @return byWhom
     */
    public java.lang.String getByWhom() {
        return byWhom;
    }


    /**
     * Sets the byWhom value for this TariffPlanHistoryType.
     * 
     * @param byWhom
     */
    public void setByWhom(java.lang.String byWhom) {
        this.byWhom = byWhom;
    }


    /**
     * Gets the taxType value for this TariffPlanHistoryType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this TariffPlanHistoryType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TariffPlanHistoryType)) return false;
        TariffPlanHistoryType other = (TariffPlanHistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.oldTariffPlan==null && other.getOldTariffPlan()==null) || 
             (this.oldTariffPlan!=null &&
              this.oldTariffPlan.equals(other.getOldTariffPlan()))) &&
            ((this.newTariffPlan==null && other.getNewTariffPlan()==null) || 
             (this.newTariffPlan!=null &&
              this.newTariffPlan.equals(other.getNewTariffPlan()))) &&
            ((this.byWhom==null && other.getByWhom()==null) || 
             (this.byWhom!=null &&
              this.byWhom.equals(other.getByWhom()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getOldTariffPlan() != null) {
            _hashCode += getOldTariffPlan().hashCode();
        }
        if (getNewTariffPlan() != null) {
            _hashCode += getNewTariffPlan().hashCode();
        }
        if (getByWhom() != null) {
            _hashCode += getByWhom().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TariffPlanHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldTariffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newTariffPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newTariffPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byWhom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "byWhom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
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
