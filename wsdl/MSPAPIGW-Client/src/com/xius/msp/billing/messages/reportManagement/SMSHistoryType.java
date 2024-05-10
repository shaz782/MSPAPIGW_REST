/**
 * SMSHistoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class SMSHistoryType  implements java.io.Serializable {
    private java.lang.Long msisdn;

    private java.lang.String dateOfChange;

    private java.lang.String charge;

    private java.lang.String oldNmbr;

    private java.lang.String newNmbr;

    private java.lang.String action;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public SMSHistoryType() {
    }

    public SMSHistoryType(
           java.lang.Long msisdn,
           java.lang.String dateOfChange,
           java.lang.String charge,
           java.lang.String oldNmbr,
           java.lang.String newNmbr,
           java.lang.String action,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.msisdn = msisdn;
           this.dateOfChange = dateOfChange;
           this.charge = charge;
           this.oldNmbr = oldNmbr;
           this.newNmbr = newNmbr;
           this.action = action;
           this.taxType = taxType;
    }


    /**
     * Gets the msisdn value for this SMSHistoryType.
     * 
     * @return msisdn
     */
    public java.lang.Long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SMSHistoryType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.Long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the dateOfChange value for this SMSHistoryType.
     * 
     * @return dateOfChange
     */
    public java.lang.String getDateOfChange() {
        return dateOfChange;
    }


    /**
     * Sets the dateOfChange value for this SMSHistoryType.
     * 
     * @param dateOfChange
     */
    public void setDateOfChange(java.lang.String dateOfChange) {
        this.dateOfChange = dateOfChange;
    }


    /**
     * Gets the charge value for this SMSHistoryType.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this SMSHistoryType.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the oldNmbr value for this SMSHistoryType.
     * 
     * @return oldNmbr
     */
    public java.lang.String getOldNmbr() {
        return oldNmbr;
    }


    /**
     * Sets the oldNmbr value for this SMSHistoryType.
     * 
     * @param oldNmbr
     */
    public void setOldNmbr(java.lang.String oldNmbr) {
        this.oldNmbr = oldNmbr;
    }


    /**
     * Gets the newNmbr value for this SMSHistoryType.
     * 
     * @return newNmbr
     */
    public java.lang.String getNewNmbr() {
        return newNmbr;
    }


    /**
     * Sets the newNmbr value for this SMSHistoryType.
     * 
     * @param newNmbr
     */
    public void setNewNmbr(java.lang.String newNmbr) {
        this.newNmbr = newNmbr;
    }


    /**
     * Gets the action value for this SMSHistoryType.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this SMSHistoryType.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the taxType value for this SMSHistoryType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this SMSHistoryType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMSHistoryType)) return false;
        SMSHistoryType other = (SMSHistoryType) obj;
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
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.dateOfChange==null && other.getDateOfChange()==null) || 
             (this.dateOfChange!=null &&
              this.dateOfChange.equals(other.getDateOfChange()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.oldNmbr==null && other.getOldNmbr()==null) || 
             (this.oldNmbr!=null &&
              this.oldNmbr.equals(other.getOldNmbr()))) &&
            ((this.newNmbr==null && other.getNewNmbr()==null) || 
             (this.newNmbr!=null &&
              this.newNmbr.equals(other.getNewNmbr()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getDateOfChange() != null) {
            _hashCode += getDateOfChange().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getOldNmbr() != null) {
            _hashCode += getOldNmbr().hashCode();
        }
        if (getNewNmbr() != null) {
            _hashCode += getNewNmbr().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMSHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SMSHistoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dateOfChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldNmbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldNmbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNmbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newNmbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "action"));
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
