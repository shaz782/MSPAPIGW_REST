/**
 * UpdateSubTransDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class UpdateSubTransDetailsRequest  implements java.io.Serializable {
    private java.lang.String IDType;

    private java.lang.String IDNo;

    private java.lang.String ICCNo;

    private java.lang.String billingStatus;

    private java.lang.String transactionId;

    private java.lang.String transactionStatus;

    public UpdateSubTransDetailsRequest() {
    }

    public UpdateSubTransDetailsRequest(
           java.lang.String IDType,
           java.lang.String IDNo,
           java.lang.String ICCNo,
           java.lang.String billingStatus,
           java.lang.String transactionId,
           java.lang.String transactionStatus) {
           this.IDType = IDType;
           this.IDNo = IDNo;
           this.ICCNo = ICCNo;
           this.billingStatus = billingStatus;
           this.transactionId = transactionId;
           this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the IDType value for this UpdateSubTransDetailsRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this UpdateSubTransDetailsRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the IDNo value for this UpdateSubTransDetailsRequest.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this UpdateSubTransDetailsRequest.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the ICCNo value for this UpdateSubTransDetailsRequest.
     * 
     * @return ICCNo
     */
    public java.lang.String getICCNo() {
        return ICCNo;
    }


    /**
     * Sets the ICCNo value for this UpdateSubTransDetailsRequest.
     * 
     * @param ICCNo
     */
    public void setICCNo(java.lang.String ICCNo) {
        this.ICCNo = ICCNo;
    }


    /**
     * Gets the billingStatus value for this UpdateSubTransDetailsRequest.
     * 
     * @return billingStatus
     */
    public java.lang.String getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this UpdateSubTransDetailsRequest.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(java.lang.String billingStatus) {
        this.billingStatus = billingStatus;
    }


    /**
     * Gets the transactionId value for this UpdateSubTransDetailsRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this UpdateSubTransDetailsRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionStatus value for this UpdateSubTransDetailsRequest.
     * 
     * @return transactionStatus
     */
    public java.lang.String getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this UpdateSubTransDetailsRequest.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(java.lang.String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSubTransDetailsRequest)) return false;
        UpdateSubTransDetailsRequest other = (UpdateSubTransDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.ICCNo==null && other.getICCNo()==null) || 
             (this.ICCNo!=null &&
              this.ICCNo.equals(other.getICCNo()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus())));
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
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getICCNo() != null) {
            _hashCode += getICCNo().hashCode();
        }
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSubTransDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubTransDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "ICCNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "billingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "transactionStatus"));
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
