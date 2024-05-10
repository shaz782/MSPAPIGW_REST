/**
 * UpdateNotificationDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class UpdateNotificationDataRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.AccountType account;

    private java.lang.String IDNo;

    private com.xius.msp.billing.messages.SubscriberManagement.NotificationData notificationData;

    public UpdateNotificationDataRequest() {
    }

    public UpdateNotificationDataRequest(
           com.xius.msp.billing.messages.SubscriberManagement.AccountType account,
           java.lang.String IDNo,
           com.xius.msp.billing.messages.SubscriberManagement.NotificationData notificationData) {
           this.account = account;
           this.IDNo = IDNo;
           this.notificationData = notificationData;
    }


    /**
     * Gets the account value for this UpdateNotificationDataRequest.
     * 
     * @return account
     */
    public com.xius.msp.billing.messages.SubscriberManagement.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this UpdateNotificationDataRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.msp.billing.messages.SubscriberManagement.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the IDNo value for this UpdateNotificationDataRequest.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this UpdateNotificationDataRequest.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the notificationData value for this UpdateNotificationDataRequest.
     * 
     * @return notificationData
     */
    public com.xius.msp.billing.messages.SubscriberManagement.NotificationData getNotificationData() {
        return notificationData;
    }


    /**
     * Sets the notificationData value for this UpdateNotificationDataRequest.
     * 
     * @param notificationData
     */
    public void setNotificationData(com.xius.msp.billing.messages.SubscriberManagement.NotificationData notificationData) {
        this.notificationData = notificationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateNotificationDataRequest)) return false;
        UpdateNotificationDataRequest other = (UpdateNotificationDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.notificationData==null && other.getNotificationData()==null) || 
             (this.notificationData!=null &&
              this.notificationData.equals(other.getNotificationData())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getNotificationData() != null) {
            _hashCode += getNotificationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateNotificationDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateNotificationDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "notificationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationData"));
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
