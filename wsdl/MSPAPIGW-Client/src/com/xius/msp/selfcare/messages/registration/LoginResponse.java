/**
 * LoginResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class LoginResponse  implements java.io.Serializable {
    private java.lang.String IDNo;

    private java.lang.String IDType;

    private java.lang.Boolean reqPwdChng;

    private java.math.BigInteger netWorkID;

    private java.lang.Boolean isAdmin;

    private java.lang.String firstName;

    private java.util.Calendar lastLoginTime;

    private java.lang.Boolean bareBoneFlag;

    public LoginResponse() {
    }

    public LoginResponse(
           java.lang.String IDNo,
           java.lang.String IDType,
           java.lang.Boolean reqPwdChng,
           java.math.BigInteger netWorkID,
           java.lang.Boolean isAdmin,
           java.lang.String firstName,
           java.util.Calendar lastLoginTime,
           java.lang.Boolean bareBoneFlag) {
           this.IDNo = IDNo;
           this.IDType = IDType;
           this.reqPwdChng = reqPwdChng;
           this.netWorkID = netWorkID;
           this.isAdmin = isAdmin;
           this.firstName = firstName;
           this.lastLoginTime = lastLoginTime;
           this.bareBoneFlag = bareBoneFlag;
    }


    /**
     * Gets the IDNo value for this LoginResponse.
     * 
     * @return IDNo
     */
    public java.lang.String getIDNo() {
        return IDNo;
    }


    /**
     * Sets the IDNo value for this LoginResponse.
     * 
     * @param IDNo
     */
    public void setIDNo(java.lang.String IDNo) {
        this.IDNo = IDNo;
    }


    /**
     * Gets the IDType value for this LoginResponse.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this LoginResponse.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the reqPwdChng value for this LoginResponse.
     * 
     * @return reqPwdChng
     */
    public java.lang.Boolean getReqPwdChng() {
        return reqPwdChng;
    }


    /**
     * Sets the reqPwdChng value for this LoginResponse.
     * 
     * @param reqPwdChng
     */
    public void setReqPwdChng(java.lang.Boolean reqPwdChng) {
        this.reqPwdChng = reqPwdChng;
    }


    /**
     * Gets the netWorkID value for this LoginResponse.
     * 
     * @return netWorkID
     */
    public java.math.BigInteger getNetWorkID() {
        return netWorkID;
    }


    /**
     * Sets the netWorkID value for this LoginResponse.
     * 
     * @param netWorkID
     */
    public void setNetWorkID(java.math.BigInteger netWorkID) {
        this.netWorkID = netWorkID;
    }


    /**
     * Gets the isAdmin value for this LoginResponse.
     * 
     * @return isAdmin
     */
    public java.lang.Boolean getIsAdmin() {
        return isAdmin;
    }


    /**
     * Sets the isAdmin value for this LoginResponse.
     * 
     * @param isAdmin
     */
    public void setIsAdmin(java.lang.Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    /**
     * Gets the firstName value for this LoginResponse.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this LoginResponse.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastLoginTime value for this LoginResponse.
     * 
     * @return lastLoginTime
     */
    public java.util.Calendar getLastLoginTime() {
        return lastLoginTime;
    }


    /**
     * Sets the lastLoginTime value for this LoginResponse.
     * 
     * @param lastLoginTime
     */
    public void setLastLoginTime(java.util.Calendar lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }


    /**
     * Gets the bareBoneFlag value for this LoginResponse.
     * 
     * @return bareBoneFlag
     */
    public java.lang.Boolean getBareBoneFlag() {
        return bareBoneFlag;
    }


    /**
     * Sets the bareBoneFlag value for this LoginResponse.
     * 
     * @param bareBoneFlag
     */
    public void setBareBoneFlag(java.lang.Boolean bareBoneFlag) {
        this.bareBoneFlag = bareBoneFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginResponse)) return false;
        LoginResponse other = (LoginResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDNo==null && other.getIDNo()==null) || 
             (this.IDNo!=null &&
              this.IDNo.equals(other.getIDNo()))) &&
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.reqPwdChng==null && other.getReqPwdChng()==null) || 
             (this.reqPwdChng!=null &&
              this.reqPwdChng.equals(other.getReqPwdChng()))) &&
            ((this.netWorkID==null && other.getNetWorkID()==null) || 
             (this.netWorkID!=null &&
              this.netWorkID.equals(other.getNetWorkID()))) &&
            ((this.isAdmin==null && other.getIsAdmin()==null) || 
             (this.isAdmin!=null &&
              this.isAdmin.equals(other.getIsAdmin()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastLoginTime==null && other.getLastLoginTime()==null) || 
             (this.lastLoginTime!=null &&
              this.lastLoginTime.equals(other.getLastLoginTime()))) &&
            ((this.bareBoneFlag==null && other.getBareBoneFlag()==null) || 
             (this.bareBoneFlag!=null &&
              this.bareBoneFlag.equals(other.getBareBoneFlag())));
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
        if (getIDNo() != null) {
            _hashCode += getIDNo().hashCode();
        }
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getReqPwdChng() != null) {
            _hashCode += getReqPwdChng().hashCode();
        }
        if (getNetWorkID() != null) {
            _hashCode += getNetWorkID().hashCode();
        }
        if (getIsAdmin() != null) {
            _hashCode += getIsAdmin().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastLoginTime() != null) {
            _hashCode += getLastLoginTime().hashCode();
        }
        if (getBareBoneFlag() != null) {
            _hashCode += getBareBoneFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "LoginResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("reqPwdChng");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "reqPwdChng"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netWorkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "netWorkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdmin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "isAdmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "lastLoginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bareBoneFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "bareBoneFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
