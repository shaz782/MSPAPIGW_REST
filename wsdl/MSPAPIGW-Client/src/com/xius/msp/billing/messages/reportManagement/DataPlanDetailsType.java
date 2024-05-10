/**
 * DataPlanDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class DataPlanDetailsType  implements java.io.Serializable {
    private java.lang.Long MSISDN;

    private java.lang.String serviceName;

    private java.lang.String subContentName;

    private java.lang.Long duration;

    private java.lang.Long dataVolume;

    private java.lang.String transDate;

    private java.lang.String totalCharge;

    private java.lang.Long promoVolume;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public DataPlanDetailsType() {
    }

    public DataPlanDetailsType(
           java.lang.Long MSISDN,
           java.lang.String serviceName,
           java.lang.String subContentName,
           java.lang.Long duration,
           java.lang.Long dataVolume,
           java.lang.String transDate,
           java.lang.String totalCharge,
           java.lang.Long promoVolume,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.MSISDN = MSISDN;
           this.serviceName = serviceName;
           this.subContentName = subContentName;
           this.duration = duration;
           this.dataVolume = dataVolume;
           this.transDate = transDate;
           this.totalCharge = totalCharge;
           this.promoVolume = promoVolume;
           this.taxType = taxType;
    }


    /**
     * Gets the MSISDN value for this DataPlanDetailsType.
     * 
     * @return MSISDN
     */
    public java.lang.Long getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this DataPlanDetailsType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.Long MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the serviceName value for this DataPlanDetailsType.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this DataPlanDetailsType.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the subContentName value for this DataPlanDetailsType.
     * 
     * @return subContentName
     */
    public java.lang.String getSubContentName() {
        return subContentName;
    }


    /**
     * Sets the subContentName value for this DataPlanDetailsType.
     * 
     * @param subContentName
     */
    public void setSubContentName(java.lang.String subContentName) {
        this.subContentName = subContentName;
    }


    /**
     * Gets the duration value for this DataPlanDetailsType.
     * 
     * @return duration
     */
    public java.lang.Long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this DataPlanDetailsType.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Long duration) {
        this.duration = duration;
    }


    /**
     * Gets the dataVolume value for this DataPlanDetailsType.
     * 
     * @return dataVolume
     */
    public java.lang.Long getDataVolume() {
        return dataVolume;
    }


    /**
     * Sets the dataVolume value for this DataPlanDetailsType.
     * 
     * @param dataVolume
     */
    public void setDataVolume(java.lang.Long dataVolume) {
        this.dataVolume = dataVolume;
    }


    /**
     * Gets the transDate value for this DataPlanDetailsType.
     * 
     * @return transDate
     */
    public java.lang.String getTransDate() {
        return transDate;
    }


    /**
     * Sets the transDate value for this DataPlanDetailsType.
     * 
     * @param transDate
     */
    public void setTransDate(java.lang.String transDate) {
        this.transDate = transDate;
    }


    /**
     * Gets the totalCharge value for this DataPlanDetailsType.
     * 
     * @return totalCharge
     */
    public java.lang.String getTotalCharge() {
        return totalCharge;
    }


    /**
     * Sets the totalCharge value for this DataPlanDetailsType.
     * 
     * @param totalCharge
     */
    public void setTotalCharge(java.lang.String totalCharge) {
        this.totalCharge = totalCharge;
    }


    /**
     * Gets the promoVolume value for this DataPlanDetailsType.
     * 
     * @return promoVolume
     */
    public java.lang.Long getPromoVolume() {
        return promoVolume;
    }


    /**
     * Sets the promoVolume value for this DataPlanDetailsType.
     * 
     * @param promoVolume
     */
    public void setPromoVolume(java.lang.Long promoVolume) {
        this.promoVolume = promoVolume;
    }


    /**
     * Gets the taxType value for this DataPlanDetailsType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this DataPlanDetailsType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataPlanDetailsType)) return false;
        DataPlanDetailsType other = (DataPlanDetailsType) obj;
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
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.subContentName==null && other.getSubContentName()==null) || 
             (this.subContentName!=null &&
              this.subContentName.equals(other.getSubContentName()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.dataVolume==null && other.getDataVolume()==null) || 
             (this.dataVolume!=null &&
              this.dataVolume.equals(other.getDataVolume()))) &&
            ((this.transDate==null && other.getTransDate()==null) || 
             (this.transDate!=null &&
              this.transDate.equals(other.getTransDate()))) &&
            ((this.totalCharge==null && other.getTotalCharge()==null) || 
             (this.totalCharge!=null &&
              this.totalCharge.equals(other.getTotalCharge()))) &&
            ((this.promoVolume==null && other.getPromoVolume()==null) || 
             (this.promoVolume!=null &&
              this.promoVolume.equals(other.getPromoVolume()))) &&
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getSubContentName() != null) {
            _hashCode += getSubContentName().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getDataVolume() != null) {
            _hashCode += getDataVolume().hashCode();
        }
        if (getTransDate() != null) {
            _hashCode += getTransDate().hashCode();
        }
        if (getTotalCharge() != null) {
            _hashCode += getTotalCharge().hashCode();
        }
        if (getPromoVolume() != null) {
            _hashCode += getPromoVolume().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataPlanDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DataPlanDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subContentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "subContentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dataVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "transDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "promoVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
