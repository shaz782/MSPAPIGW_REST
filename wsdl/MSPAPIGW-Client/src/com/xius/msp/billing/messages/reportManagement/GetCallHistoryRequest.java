/**
 * GetCallHistoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetCallHistoryRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.reportManagement.UserType userType;

    private com.xius.msp.billing.messages.reportManagement.ServiceType serviceType;

    private java.lang.String dateFrom;

    private java.lang.String dateTo;

    private java.lang.String lastMaxCalls;

    private java.lang.String accountID;

    public GetCallHistoryRequest() {
    }

    public GetCallHistoryRequest(
           com.xius.msp.billing.messages.reportManagement.UserType userType,
           com.xius.msp.billing.messages.reportManagement.ServiceType serviceType,
           java.lang.String dateFrom,
           java.lang.String dateTo,
           java.lang.String lastMaxCalls,
           java.lang.String accountID) {
           this.userType = userType;
           this.serviceType = serviceType;
           this.dateFrom = dateFrom;
           this.dateTo = dateTo;
           this.lastMaxCalls = lastMaxCalls;
           this.accountID = accountID;
    }


    /**
     * Gets the userType value for this GetCallHistoryRequest.
     * 
     * @return userType
     */
    public com.xius.msp.billing.messages.reportManagement.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this GetCallHistoryRequest.
     * 
     * @param userType
     */
    public void setUserType(com.xius.msp.billing.messages.reportManagement.UserType userType) {
        this.userType = userType;
    }


    /**
     * Gets the serviceType value for this GetCallHistoryRequest.
     * 
     * @return serviceType
     */
    public com.xius.msp.billing.messages.reportManagement.ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this GetCallHistoryRequest.
     * 
     * @param serviceType
     */
    public void setServiceType(com.xius.msp.billing.messages.reportManagement.ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the dateFrom value for this GetCallHistoryRequest.
     * 
     * @return dateFrom
     */
    public java.lang.String getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this GetCallHistoryRequest.
     * 
     * @param dateFrom
     */
    public void setDateFrom(java.lang.String dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this GetCallHistoryRequest.
     * 
     * @return dateTo
     */
    public java.lang.String getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this GetCallHistoryRequest.
     * 
     * @param dateTo
     */
    public void setDateTo(java.lang.String dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the lastMaxCalls value for this GetCallHistoryRequest.
     * 
     * @return lastMaxCalls
     */
    public java.lang.String getLastMaxCalls() {
        return lastMaxCalls;
    }


    /**
     * Sets the lastMaxCalls value for this GetCallHistoryRequest.
     * 
     * @param lastMaxCalls
     */
    public void setLastMaxCalls(java.lang.String lastMaxCalls) {
        this.lastMaxCalls = lastMaxCalls;
    }


    /**
     * Gets the accountID value for this GetCallHistoryRequest.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this GetCallHistoryRequest.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCallHistoryRequest)) return false;
        GetCallHistoryRequest other = (GetCallHistoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            ((this.lastMaxCalls==null && other.getLastMaxCalls()==null) || 
             (this.lastMaxCalls!=null &&
              this.lastMaxCalls.equals(other.getLastMaxCalls()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID())));
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
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        if (getLastMaxCalls() != null) {
            _hashCode += getLastMaxCalls().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCallHistoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCallHistoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "UserType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ServiceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMaxCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "lastMaxCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
