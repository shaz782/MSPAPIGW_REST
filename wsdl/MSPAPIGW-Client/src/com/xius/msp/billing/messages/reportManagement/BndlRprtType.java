/**
 * BndlRprtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class BndlRprtType  implements java.io.Serializable {
    private java.lang.String acctId;

    private java.lang.String msisdn;

    private java.lang.String bndlId;

    private java.lang.String bndlName;

    private java.lang.String actDeactFlag;

    private java.math.BigDecimal actDeactCharge;

    private java.lang.String userId;

    private java.lang.String date;

    private java.lang.String time;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public BndlRprtType() {
    }

    public BndlRprtType(
           java.lang.String acctId,
           java.lang.String msisdn,
           java.lang.String bndlId,
           java.lang.String bndlName,
           java.lang.String actDeactFlag,
           java.math.BigDecimal actDeactCharge,
           java.lang.String userId,
           java.lang.String date,
           java.lang.String time,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.acctId = acctId;
           this.msisdn = msisdn;
           this.bndlId = bndlId;
           this.bndlName = bndlName;
           this.actDeactFlag = actDeactFlag;
           this.actDeactCharge = actDeactCharge;
           this.userId = userId;
           this.date = date;
           this.time = time;
           this.taxType = taxType;
    }


    /**
     * Gets the acctId value for this BndlRprtType.
     * 
     * @return acctId
     */
    public java.lang.String getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this BndlRprtType.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.String acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the msisdn value for this BndlRprtType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this BndlRprtType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the bndlId value for this BndlRprtType.
     * 
     * @return bndlId
     */
    public java.lang.String getBndlId() {
        return bndlId;
    }


    /**
     * Sets the bndlId value for this BndlRprtType.
     * 
     * @param bndlId
     */
    public void setBndlId(java.lang.String bndlId) {
        this.bndlId = bndlId;
    }


    /**
     * Gets the bndlName value for this BndlRprtType.
     * 
     * @return bndlName
     */
    public java.lang.String getBndlName() {
        return bndlName;
    }


    /**
     * Sets the bndlName value for this BndlRprtType.
     * 
     * @param bndlName
     */
    public void setBndlName(java.lang.String bndlName) {
        this.bndlName = bndlName;
    }


    /**
     * Gets the actDeactFlag value for this BndlRprtType.
     * 
     * @return actDeactFlag
     */
    public java.lang.String getActDeactFlag() {
        return actDeactFlag;
    }


    /**
     * Sets the actDeactFlag value for this BndlRprtType.
     * 
     * @param actDeactFlag
     */
    public void setActDeactFlag(java.lang.String actDeactFlag) {
        this.actDeactFlag = actDeactFlag;
    }


    /**
     * Gets the actDeactCharge value for this BndlRprtType.
     * 
     * @return actDeactCharge
     */
    public java.math.BigDecimal getActDeactCharge() {
        return actDeactCharge;
    }


    /**
     * Sets the actDeactCharge value for this BndlRprtType.
     * 
     * @param actDeactCharge
     */
    public void setActDeactCharge(java.math.BigDecimal actDeactCharge) {
        this.actDeactCharge = actDeactCharge;
    }


    /**
     * Gets the userId value for this BndlRprtType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this BndlRprtType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the date value for this BndlRprtType.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this BndlRprtType.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the time value for this BndlRprtType.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this BndlRprtType.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the taxType value for this BndlRprtType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this BndlRprtType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BndlRprtType)) return false;
        BndlRprtType other = (BndlRprtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.bndlId==null && other.getBndlId()==null) || 
             (this.bndlId!=null &&
              this.bndlId.equals(other.getBndlId()))) &&
            ((this.bndlName==null && other.getBndlName()==null) || 
             (this.bndlName!=null &&
              this.bndlName.equals(other.getBndlName()))) &&
            ((this.actDeactFlag==null && other.getActDeactFlag()==null) || 
             (this.actDeactFlag!=null &&
              this.actDeactFlag.equals(other.getActDeactFlag()))) &&
            ((this.actDeactCharge==null && other.getActDeactCharge()==null) || 
             (this.actDeactCharge!=null &&
              this.actDeactCharge.equals(other.getActDeactCharge()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getBndlId() != null) {
            _hashCode += getBndlId().hashCode();
        }
        if (getBndlName() != null) {
            _hashCode += getBndlName().hashCode();
        }
        if (getActDeactFlag() != null) {
            _hashCode += getActDeactFlag().hashCode();
        }
        if (getActDeactCharge() != null) {
            _hashCode += getActDeactCharge().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BndlRprtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "BndlRprtType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "acctId"));
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
        elemField.setFieldName("bndlId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bndlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bndlName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bndlName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actDeactFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "actDeactFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actDeactCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "actDeactCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "time"));
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
