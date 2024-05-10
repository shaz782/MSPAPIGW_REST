/**
 * UpdateSubscriberStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class UpdateSubscriberStatusRequest  implements java.io.Serializable {
    private java.lang.String IDType;

    private java.lang.String IDNo;

    private java.lang.String subscriberStatus;

    private java.lang.String createdBy;

    private java.lang.String MSISDN;

    private java.lang.String ICCNo;

    private com.xius.msp.selfcare.messages.SubscriberManagement.ICCStatusType ICCStatus;

    public UpdateSubscriberStatusRequest() {
    }

    public UpdateSubscriberStatusRequest(
           java.lang.String IDType,
           java.lang.String IDNo,
           java.lang.String subscriberStatus,
           java.lang.String createdBy,
           java.lang.String MSISDN,
           java.lang.String ICCNo,
           com.xius.msp.selfcare.messages.SubscriberManagement.ICCStatusType ICCStatus) {
           this.IDType = IDType;
           this.IDNo = IDNo;
           this.subscriberStatus = subscriberStatus;
           this.createdBy = createdBy;
           this.MSISDN = MSISDN;
           this.ICCNo = ICCNo;
           this.ICCStatus = ICCStatus;
    }


    /**
     * Gets the IDType value for this UpdateSubscriberStatusRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this UpdateSubscriberStatusRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the IDNo value for this UpdateSubscriberStatusRequest.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this UpdateSubscriberStatusRequest.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the subscriberStatus value for this UpdateSubscriberStatusRequest.
     * 
     * @return subscriberStatus
     */
    public java.lang.String getSubscriberStatus() {
        return subscriberStatus;
    }


    /**
     * Sets the subscriberStatus value for this UpdateSubscriberStatusRequest.
     * 
     * @param subscriberStatus
     */
    public void setSubscriberStatus(java.lang.String subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }


    /**
     * Gets the createdBy value for this UpdateSubscriberStatusRequest.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this UpdateSubscriberStatusRequest.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the MSISDN value for this UpdateSubscriberStatusRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this UpdateSubscriberStatusRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the ICCNo value for this UpdateSubscriberStatusRequest.
     * 
     * @return ICCNo
     */
    public java.lang.String getICCNo() {
        return ICCNo;
    }


    /**
     * Sets the ICCNo value for this UpdateSubscriberStatusRequest.
     * 
     * @param ICCNo
     */
    public void setICCNo(java.lang.String ICCNo) {
        this.ICCNo = ICCNo;
    }


    /**
     * Gets the ICCStatus value for this UpdateSubscriberStatusRequest.
     * 
     * @return ICCStatus
     */
    public com.xius.msp.selfcare.messages.SubscriberManagement.ICCStatusType getICCStatus() {
        return ICCStatus;
    }


    /**
     * Sets the ICCStatus value for this UpdateSubscriberStatusRequest.
     * 
     * @param ICCStatus
     */
    public void setICCStatus(com.xius.msp.selfcare.messages.SubscriberManagement.ICCStatusType ICCStatus) {
        this.ICCStatus = ICCStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSubscriberStatusRequest)) return false;
        UpdateSubscriberStatusRequest other = (UpdateSubscriberStatusRequest) obj;
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
            ((this.subscriberStatus==null && other.getSubscriberStatus()==null) || 
             (this.subscriberStatus!=null &&
              this.subscriberStatus.equals(other.getSubscriberStatus()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.ICCNo==null && other.getICCNo()==null) || 
             (this.ICCNo!=null &&
              this.ICCNo.equals(other.getICCNo()))) &&
            ((this.ICCStatus==null && other.getICCStatus()==null) || 
             (this.ICCStatus!=null &&
              this.ICCStatus.equals(other.getICCStatus())));
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
        if (getSubscriberStatus() != null) {
            _hashCode += getSubscriberStatus().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getICCNo() != null) {
            _hashCode += getICCNo().hashCode();
        }
        if (getICCStatus() != null) {
            _hashCode += getICCStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSubscriberStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubscriberStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "subscriberStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "ICCNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "ICCStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "ICCStatusType"));
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
