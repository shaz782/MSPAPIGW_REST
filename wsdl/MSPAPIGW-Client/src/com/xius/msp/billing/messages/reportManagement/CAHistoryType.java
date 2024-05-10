/**
 * CAHistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class CAHistoryType  implements java.io.Serializable {
    private java.lang.String grpName;

    private java.lang.Long parntMsisdn;

    private java.lang.Long childMsisdn;

    private java.lang.String srvcName;

    private java.lang.String unitType;

    private java.math.BigDecimal unitValue;

    private java.lang.String trnsfrORRvrsl;

    private java.lang.String txInitdFrom;

    private java.lang.String remarks;

    private java.lang.String date;

    public CAHistoryType() {
    }

    public CAHistoryType(
           java.lang.String grpName,
           java.lang.Long parntMsisdn,
           java.lang.Long childMsisdn,
           java.lang.String srvcName,
           java.lang.String unitType,
           java.math.BigDecimal unitValue,
           java.lang.String trnsfrORRvrsl,
           java.lang.String txInitdFrom,
           java.lang.String remarks,
           java.lang.String date) {
           this.grpName = grpName;
           this.parntMsisdn = parntMsisdn;
           this.childMsisdn = childMsisdn;
           this.srvcName = srvcName;
           this.unitType = unitType;
           this.unitValue = unitValue;
           this.trnsfrORRvrsl = trnsfrORRvrsl;
           this.txInitdFrom = txInitdFrom;
           this.remarks = remarks;
           this.date = date;
    }


    /**
     * Gets the grpName value for this CAHistoryType.
     * 
     * @return grpName
     */
    public java.lang.String getGrpName() {
        return grpName;
    }


    /**
     * Sets the grpName value for this CAHistoryType.
     * 
     * @param grpName
     */
    public void setGrpName(java.lang.String grpName) {
        this.grpName = grpName;
    }


    /**
     * Gets the parntMsisdn value for this CAHistoryType.
     * 
     * @return parntMsisdn
     */
    public java.lang.Long getParntMsisdn() {
        return parntMsisdn;
    }


    /**
     * Sets the parntMsisdn value for this CAHistoryType.
     * 
     * @param parntMsisdn
     */
    public void setParntMsisdn(java.lang.Long parntMsisdn) {
        this.parntMsisdn = parntMsisdn;
    }


    /**
     * Gets the childMsisdn value for this CAHistoryType.
     * 
     * @return childMsisdn
     */
    public java.lang.Long getChildMsisdn() {
        return childMsisdn;
    }


    /**
     * Sets the childMsisdn value for this CAHistoryType.
     * 
     * @param childMsisdn
     */
    public void setChildMsisdn(java.lang.Long childMsisdn) {
        this.childMsisdn = childMsisdn;
    }


    /**
     * Gets the srvcName value for this CAHistoryType.
     * 
     * @return srvcName
     */
    public java.lang.String getSrvcName() {
        return srvcName;
    }


    /**
     * Sets the srvcName value for this CAHistoryType.
     * 
     * @param srvcName
     */
    public void setSrvcName(java.lang.String srvcName) {
        this.srvcName = srvcName;
    }


    /**
     * Gets the unitType value for this CAHistoryType.
     * 
     * @return unitType
     */
    public java.lang.String getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this CAHistoryType.
     * 
     * @param unitType
     */
    public void setUnitType(java.lang.String unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the unitValue value for this CAHistoryType.
     * 
     * @return unitValue
     */
    public java.math.BigDecimal getUnitValue() {
        return unitValue;
    }


    /**
     * Sets the unitValue value for this CAHistoryType.
     * 
     * @param unitValue
     */
    public void setUnitValue(java.math.BigDecimal unitValue) {
        this.unitValue = unitValue;
    }


    /**
     * Gets the trnsfrORRvrsl value for this CAHistoryType.
     * 
     * @return trnsfrORRvrsl
     */
    public java.lang.String getTrnsfrORRvrsl() {
        return trnsfrORRvrsl;
    }


    /**
     * Sets the trnsfrORRvrsl value for this CAHistoryType.
     * 
     * @param trnsfrORRvrsl
     */
    public void setTrnsfrORRvrsl(java.lang.String trnsfrORRvrsl) {
        this.trnsfrORRvrsl = trnsfrORRvrsl;
    }


    /**
     * Gets the txInitdFrom value for this CAHistoryType.
     * 
     * @return txInitdFrom
     */
    public java.lang.String getTxInitdFrom() {
        return txInitdFrom;
    }


    /**
     * Sets the txInitdFrom value for this CAHistoryType.
     * 
     * @param txInitdFrom
     */
    public void setTxInitdFrom(java.lang.String txInitdFrom) {
        this.txInitdFrom = txInitdFrom;
    }


    /**
     * Gets the remarks value for this CAHistoryType.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this CAHistoryType.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the date value for this CAHistoryType.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this CAHistoryType.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CAHistoryType)) return false;
        CAHistoryType other = (CAHistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grpName==null && other.getGrpName()==null) || 
             (this.grpName!=null &&
              this.grpName.equals(other.getGrpName()))) &&
            ((this.parntMsisdn==null && other.getParntMsisdn()==null) || 
             (this.parntMsisdn!=null &&
              this.parntMsisdn.equals(other.getParntMsisdn()))) &&
            ((this.childMsisdn==null && other.getChildMsisdn()==null) || 
             (this.childMsisdn!=null &&
              this.childMsisdn.equals(other.getChildMsisdn()))) &&
            ((this.srvcName==null && other.getSrvcName()==null) || 
             (this.srvcName!=null &&
              this.srvcName.equals(other.getSrvcName()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.unitValue==null && other.getUnitValue()==null) || 
             (this.unitValue!=null &&
              this.unitValue.equals(other.getUnitValue()))) &&
            ((this.trnsfrORRvrsl==null && other.getTrnsfrORRvrsl()==null) || 
             (this.trnsfrORRvrsl!=null &&
              this.trnsfrORRvrsl.equals(other.getTrnsfrORRvrsl()))) &&
            ((this.txInitdFrom==null && other.getTxInitdFrom()==null) || 
             (this.txInitdFrom!=null &&
              this.txInitdFrom.equals(other.getTxInitdFrom()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getGrpName() != null) {
            _hashCode += getGrpName().hashCode();
        }
        if (getParntMsisdn() != null) {
            _hashCode += getParntMsisdn().hashCode();
        }
        if (getChildMsisdn() != null) {
            _hashCode += getChildMsisdn().hashCode();
        }
        if (getSrvcName() != null) {
            _hashCode += getSrvcName().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getUnitValue() != null) {
            _hashCode += getUnitValue().hashCode();
        }
        if (getTrnsfrORRvrsl() != null) {
            _hashCode += getTrnsfrORRvrsl().hashCode();
        }
        if (getTxInitdFrom() != null) {
            _hashCode += getTxInitdFrom().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CAHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CAHistoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "grpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parntMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "parntMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "childMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srvcName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "srvcName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "unitValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trnsfrORRvrsl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "trnsfrORRvrsl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txInitdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "txInitdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "date"));
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
