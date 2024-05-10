/**
 * LoanAcctDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class LoanAcctDetailsType  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.Long acctID;

    private java.lang.String loanAmount;

    private java.lang.String loanCommission;

    private java.lang.String transactionDate;

    public LoanAcctDetailsType() {
    }

    public LoanAcctDetailsType(
           java.lang.String MSISDN,
           java.lang.Long acctID,
           java.lang.String loanAmount,
           java.lang.String loanCommission,
           java.lang.String transactionDate) {
           this.MSISDN = MSISDN;
           this.acctID = acctID;
           this.loanAmount = loanAmount;
           this.loanCommission = loanCommission;
           this.transactionDate = transactionDate;
    }


    /**
     * Gets the MSISDN value for this LoanAcctDetailsType.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this LoanAcctDetailsType.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the acctID value for this LoanAcctDetailsType.
     * 
     * @return acctID
     */
    public java.lang.Long getAcctID() {
        return acctID;
    }


    /**
     * Sets the acctID value for this LoanAcctDetailsType.
     * 
     * @param acctID
     */
    public void setAcctID(java.lang.Long acctID) {
        this.acctID = acctID;
    }


    /**
     * Gets the loanAmount value for this LoanAcctDetailsType.
     * 
     * @return loanAmount
     */
    public java.lang.String getLoanAmount() {
        return loanAmount;
    }


    /**
     * Sets the loanAmount value for this LoanAcctDetailsType.
     * 
     * @param loanAmount
     */
    public void setLoanAmount(java.lang.String loanAmount) {
        this.loanAmount = loanAmount;
    }


    /**
     * Gets the loanCommission value for this LoanAcctDetailsType.
     * 
     * @return loanCommission
     */
    public java.lang.String getLoanCommission() {
        return loanCommission;
    }


    /**
     * Sets the loanCommission value for this LoanAcctDetailsType.
     * 
     * @param loanCommission
     */
    public void setLoanCommission(java.lang.String loanCommission) {
        this.loanCommission = loanCommission;
    }


    /**
     * Gets the transactionDate value for this LoanAcctDetailsType.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this LoanAcctDetailsType.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanAcctDetailsType)) return false;
        LoanAcctDetailsType other = (LoanAcctDetailsType) obj;
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
            ((this.acctID==null && other.getAcctID()==null) || 
             (this.acctID!=null &&
              this.acctID.equals(other.getAcctID()))) &&
            ((this.loanAmount==null && other.getLoanAmount()==null) || 
             (this.loanAmount!=null &&
              this.loanAmount.equals(other.getLoanAmount()))) &&
            ((this.loanCommission==null && other.getLoanCommission()==null) || 
             (this.loanCommission!=null &&
              this.loanCommission.equals(other.getLoanCommission()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate())));
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
        if (getAcctID() != null) {
            _hashCode += getAcctID().hashCode();
        }
        if (getLoanAmount() != null) {
            _hashCode += getLoanAmount().hashCode();
        }
        if (getLoanCommission() != null) {
            _hashCode += getLoanCommission().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanAcctDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "loanAcctDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "acctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "loanAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "loanCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "transactionDate"));
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
