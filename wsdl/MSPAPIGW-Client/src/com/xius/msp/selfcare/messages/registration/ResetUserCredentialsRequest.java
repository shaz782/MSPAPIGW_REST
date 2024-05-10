/**
 * ResetUserCredentialsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class ResetUserCredentialsRequest  implements java.io.Serializable {
    private java.lang.String userID;

    private com.xius.msp.selfcare.messages.registration.UserType userType;

    private com.xius.msp.selfcare.messages.registration.OperationType operationType;

    private java.lang.String networkName;

    private java.lang.String IDType;

    private java.lang.String IDNo;

    private java.lang.String MSISDN;

    private java.util.Date dateOfBirth;

    private java.lang.String email;

    private java.lang.String oldPassword;

    private java.lang.String newPassword;

    private java.lang.String lastName;

    private java.lang.String officName;

    public ResetUserCredentialsRequest() {
    }

    public ResetUserCredentialsRequest(
           java.lang.String userID,
           com.xius.msp.selfcare.messages.registration.UserType userType,
           com.xius.msp.selfcare.messages.registration.OperationType operationType,
           java.lang.String networkName,
           java.lang.String IDType,
           java.lang.String IDNo,
           java.lang.String MSISDN,
           java.util.Date dateOfBirth,
           java.lang.String email,
           java.lang.String oldPassword,
           java.lang.String newPassword,
           java.lang.String lastName,
           java.lang.String officName) {
           this.userID = userID;
           this.userType = userType;
           this.operationType = operationType;
           this.networkName = networkName;
           this.IDType = IDType;
           this.IDNo = IDNo;
           this.MSISDN = MSISDN;
           this.dateOfBirth = dateOfBirth;
           this.email = email;
           this.oldPassword = oldPassword;
           this.newPassword = newPassword;
           this.lastName = lastName;
           this.officName = officName;
    }


    /**
     * Gets the userID value for this ResetUserCredentialsRequest.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this ResetUserCredentialsRequest.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the userType value for this ResetUserCredentialsRequest.
     * 
     * @return userType
     */
    public com.xius.msp.selfcare.messages.registration.UserType getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this ResetUserCredentialsRequest.
     * 
     * @param userType
     */
    public void setUserType(com.xius.msp.selfcare.messages.registration.UserType userType) {
        this.userType = userType;
    }


    /**
     * Gets the operationType value for this ResetUserCredentialsRequest.
     * 
     * @return operationType
     */
    public com.xius.msp.selfcare.messages.registration.OperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this ResetUserCredentialsRequest.
     * 
     * @param operationType
     */
    public void setOperationType(com.xius.msp.selfcare.messages.registration.OperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the networkName value for this ResetUserCredentialsRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this ResetUserCredentialsRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the IDType value for this ResetUserCredentialsRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this ResetUserCredentialsRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the IDNo value for this ResetUserCredentialsRequest.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this ResetUserCredentialsRequest.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the MSISDN value for this ResetUserCredentialsRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ResetUserCredentialsRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the dateOfBirth value for this ResetUserCredentialsRequest.
     * 
     * @return dateOfBirth
     */
    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this ResetUserCredentialsRequest.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the email value for this ResetUserCredentialsRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ResetUserCredentialsRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the oldPassword value for this ResetUserCredentialsRequest.
     * 
     * @return oldPassword
     */
    public java.lang.String getOldPassword() {
        return oldPassword;
    }


    /**
     * Sets the oldPassword value for this ResetUserCredentialsRequest.
     * 
     * @param oldPassword
     */
    public void setOldPassword(java.lang.String oldPassword) {
        this.oldPassword = oldPassword;
    }


    /**
     * Gets the newPassword value for this ResetUserCredentialsRequest.
     * 
     * @return newPassword
     */
    public java.lang.String getNewPassword() {
        return newPassword;
    }


    /**
     * Sets the newPassword value for this ResetUserCredentialsRequest.
     * 
     * @param newPassword
     */
    public void setNewPassword(java.lang.String newPassword) {
        this.newPassword = newPassword;
    }


    /**
     * Gets the lastName value for this ResetUserCredentialsRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this ResetUserCredentialsRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the officName value for this ResetUserCredentialsRequest.
     * 
     * @return officName
     */
    public java.lang.String getOfficName() {
        return officName;
    }


    /**
     * Sets the officName value for this ResetUserCredentialsRequest.
     * 
     * @param officName
     */
    public void setOfficName(java.lang.String officName) {
        this.officName = officName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetUserCredentialsRequest)) return false;
        ResetUserCredentialsRequest other = (ResetUserCredentialsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.oldPassword==null && other.getOldPassword()==null) || 
             (this.oldPassword!=null &&
              this.oldPassword.equals(other.getOldPassword()))) &&
            ((this.newPassword==null && other.getNewPassword()==null) || 
             (this.newPassword!=null &&
              this.newPassword.equals(other.getNewPassword()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.officName==null && other.getOfficName()==null) || 
             (this.officName!=null &&
              this.officName.equals(other.getOfficName())));
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
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getOldPassword() != null) {
            _hashCode += getOldPassword().hashCode();
        }
        if (getNewPassword() != null) {
            _hashCode += getNewPassword().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getOfficName() != null) {
            _hashCode += getOfficName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetUserCredentialsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "ResetUserCredentialsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "userType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "UserType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "OperationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "oldPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "newPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "officName"));
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
