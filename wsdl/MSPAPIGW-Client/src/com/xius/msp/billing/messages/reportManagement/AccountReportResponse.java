/**
 * AccountReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class AccountReportResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.AccountDetailsType[] accountDetails;

    private com.xius.msp.billing.messages.reportManagement.DataPlanDetailsType[] dataPlanDetails;

    private java.lang.Long totalRecords;

    private java.lang.String message;

    public AccountReportResponse() {
    }

    public AccountReportResponse(
           com.xius.msp.billing.messages.reportManagement.AccountDetailsType[] accountDetails,
           com.xius.msp.billing.messages.reportManagement.DataPlanDetailsType[] dataPlanDetails,
           java.lang.Long totalRecords,
           java.lang.String message) {
           this.accountDetails = accountDetails;
           this.dataPlanDetails = dataPlanDetails;
           this.totalRecords = totalRecords;
           this.message = message;
    }


    /**
     * Gets the accountDetails value for this AccountReportResponse.
     * 
     * @return accountDetails
     */
    public com.xius.msp.billing.messages.reportManagement.AccountDetailsType[] getAccountDetails() {
        return accountDetails;
    }


    /**
     * Sets the accountDetails value for this AccountReportResponse.
     * 
     * @param accountDetails
     */
    public void setAccountDetails(com.xius.msp.billing.messages.reportManagement.AccountDetailsType[] accountDetails) {
        this.accountDetails = accountDetails;
    }


    /**
     * Gets the dataPlanDetails value for this AccountReportResponse.
     * 
     * @return dataPlanDetails
     */
    public com.xius.msp.billing.messages.reportManagement.DataPlanDetailsType[] getDataPlanDetails() {
        return dataPlanDetails;
    }


    /**
     * Sets the dataPlanDetails value for this AccountReportResponse.
     * 
     * @param dataPlanDetails
     */
    public void setDataPlanDetails(com.xius.msp.billing.messages.reportManagement.DataPlanDetailsType[] dataPlanDetails) {
        this.dataPlanDetails = dataPlanDetails;
    }


    /**
     * Gets the totalRecords value for this AccountReportResponse.
     * 
     * @return totalRecords
     */
    public java.lang.Long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this AccountReportResponse.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(java.lang.Long totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the message value for this AccountReportResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this AccountReportResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountReportResponse)) return false;
        AccountReportResponse other = (AccountReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountDetails==null && other.getAccountDetails()==null) || 
             (this.accountDetails!=null &&
              java.util.Arrays.equals(this.accountDetails, other.getAccountDetails()))) &&
            ((this.dataPlanDetails==null && other.getDataPlanDetails()==null) || 
             (this.dataPlanDetails!=null &&
              java.util.Arrays.equals(this.dataPlanDetails, other.getDataPlanDetails()))) &&
            ((this.totalRecords==null && other.getTotalRecords()==null) || 
             (this.totalRecords!=null &&
              this.totalRecords.equals(other.getTotalRecords()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getAccountDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataPlanDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataPlanDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataPlanDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalRecords() != null) {
            _hashCode += getTotalRecords().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountDetailsList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPlanDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dataPlanDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DataPlanDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dataPlanDetailsList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "message"));
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
