/**
 * DebitRprtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class DebitRprtType  implements java.io.Serializable {
    private java.lang.Long MSISDN;

    private java.lang.String date;

    private java.lang.String oldBalance;

    private java.lang.String newBalance;

    private java.lang.String acctId;

    private java.lang.String status;

    private java.lang.String oldData;

    private java.lang.String newData;

    private java.lang.String loginId;

    private java.lang.String amount;

    private java.lang.String remarks;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public DebitRprtType() {
    }

    public DebitRprtType(
           java.lang.Long MSISDN,
           java.lang.String date,
           java.lang.String oldBalance,
           java.lang.String newBalance,
           java.lang.String acctId,
           java.lang.String status,
           java.lang.String oldData,
           java.lang.String newData,
           java.lang.String loginId,
           java.lang.String amount,
           java.lang.String remarks,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.MSISDN = MSISDN;
           this.date = date;
           this.oldBalance = oldBalance;
           this.newBalance = newBalance;
           this.acctId = acctId;
           this.status = status;
           this.oldData = oldData;
           this.newData = newData;
           this.loginId = loginId;
           this.amount = amount;
           this.remarks = remarks;
           this.taxType = taxType;
    }


    /**
     * Gets the MSISDN value for this DebitRprtType.
     * 
     * @return MSISDN
     */
    public java.lang.Long getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this DebitRprtType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.Long MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the date value for this DebitRprtType.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this DebitRprtType.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the oldBalance value for this DebitRprtType.
     * 
     * @return oldBalance
     */
    public java.lang.String getOldBalance() {
        return oldBalance;
    }


    /**
     * Sets the oldBalance value for this DebitRprtType.
     * 
     * @param oldBalance
     */
    public void setOldBalance(java.lang.String oldBalance) {
        this.oldBalance = oldBalance;
    }


    /**
     * Gets the newBalance value for this DebitRprtType.
     * 
     * @return newBalance
     */
    public java.lang.String getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this DebitRprtType.
     * 
     * @param newBalance
     */
    public void setNewBalance(java.lang.String newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the acctId value for this DebitRprtType.
     * 
     * @return acctId
     */
    public java.lang.String getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DebitRprtType.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.String acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the status value for this DebitRprtType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DebitRprtType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the oldData value for this DebitRprtType.
     * 
     * @return oldData
     */
    public java.lang.String getOldData() {
        return oldData;
    }


    /**
     * Sets the oldData value for this DebitRprtType.
     * 
     * @param oldData
     */
    public void setOldData(java.lang.String oldData) {
        this.oldData = oldData;
    }


    /**
     * Gets the newData value for this DebitRprtType.
     * 
     * @return newData
     */
    public java.lang.String getNewData() {
        return newData;
    }


    /**
     * Sets the newData value for this DebitRprtType.
     * 
     * @param newData
     */
    public void setNewData(java.lang.String newData) {
        this.newData = newData;
    }


    /**
     * Gets the loginId value for this DebitRprtType.
     * 
     * @return loginId
     */
    public java.lang.String getLoginId() {
        return loginId;
    }


    /**
     * Sets the loginId value for this DebitRprtType.
     * 
     * @param loginId
     */
    public void setLoginId(java.lang.String loginId) {
        this.loginId = loginId;
    }


    /**
     * Gets the amount value for this DebitRprtType.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DebitRprtType.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the remarks value for this DebitRprtType.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this DebitRprtType.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the taxType value for this DebitRprtType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this DebitRprtType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitRprtType)) return false;
        DebitRprtType other = (DebitRprtType) obj;
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
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.oldBalance==null && other.getOldBalance()==null) || 
             (this.oldBalance!=null &&
              this.oldBalance.equals(other.getOldBalance()))) &&
            ((this.newBalance==null && other.getNewBalance()==null) || 
             (this.newBalance!=null &&
              this.newBalance.equals(other.getNewBalance()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.oldData==null && other.getOldData()==null) || 
             (this.oldData!=null &&
              this.oldData.equals(other.getOldData()))) &&
            ((this.newData==null && other.getNewData()==null) || 
             (this.newData!=null &&
              this.newData.equals(other.getNewData()))) &&
            ((this.loginId==null && other.getLoginId()==null) || 
             (this.loginId!=null &&
              this.loginId.equals(other.getLoginId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getOldBalance() != null) {
            _hashCode += getOldBalance().hashCode();
        }
        if (getNewBalance() != null) {
            _hashCode += getNewBalance().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOldData() != null) {
            _hashCode += getOldData().hashCode();
        }
        if (getNewData() != null) {
            _hashCode += getNewData().hashCode();
        }
        if (getLoginId() != null) {
            _hashCode += getLoginId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitRprtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitRprtType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("oldBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "loginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "amount"));
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
