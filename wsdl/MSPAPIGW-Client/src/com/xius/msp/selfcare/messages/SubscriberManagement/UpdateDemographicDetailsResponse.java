/**
 * UpdateDemographicDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class UpdateDemographicDetailsResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String userId;

    private java.lang.String password;

    private java.lang.String subStatus;

    private java.lang.String emailId;

    public UpdateDemographicDetailsResponse() {
    }

    public UpdateDemographicDetailsResponse(
           java.lang.String message,
           java.lang.String userId,
           java.lang.String password,
           java.lang.String subStatus,
           java.lang.String emailId) {
           this.message = message;
           this.userId = userId;
           this.password = password;
           this.subStatus = subStatus;
           this.emailId = emailId;
    }


    /**
     * Gets the message value for this UpdateDemographicDetailsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this UpdateDemographicDetailsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the userId value for this UpdateDemographicDetailsResponse.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UpdateDemographicDetailsResponse.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the password value for this UpdateDemographicDetailsResponse.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UpdateDemographicDetailsResponse.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the subStatus value for this UpdateDemographicDetailsResponse.
     * 
     * @return subStatus
     */
    public java.lang.String getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this UpdateDemographicDetailsResponse.
     * 
     * @param subStatus
     */
    public void setSubStatus(java.lang.String subStatus) {
        this.subStatus = subStatus;
    }


    /**
     * Gets the emailId value for this UpdateDemographicDetailsResponse.
     * 
     * @return emailId
     */
    public java.lang.String getEmailId() {
        return emailId;
    }


    /**
     * Sets the emailId value for this UpdateDemographicDetailsResponse.
     * 
     * @param emailId
     */
    public void setEmailId(java.lang.String emailId) {
        this.emailId = emailId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateDemographicDetailsResponse)) return false;
        UpdateDemographicDetailsResponse other = (UpdateDemographicDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus()))) &&
            ((this.emailId==null && other.getEmailId()==null) || 
             (this.emailId!=null &&
              this.emailId.equals(other.getEmailId())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        if (getEmailId() != null) {
            _hashCode += getEmailId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateDemographicDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateDemographicDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "subStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "emailId"));
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
