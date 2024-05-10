/**
 * ContactDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class ContactDetailsType  implements java.io.Serializable {
    private java.lang.String email;

    private java.lang.String homePhone;

    private java.lang.String officePhone;

    private java.lang.String mContactPhoneNumber;

    private java.lang.String alternateContactNo;

    private com.xius.xbus.messages.common.AddressType address;

    public ContactDetailsType() {
    }

    public ContactDetailsType(
           java.lang.String email,
           java.lang.String homePhone,
           java.lang.String officePhone,
           java.lang.String mContactPhoneNumber,
           java.lang.String alternateContactNo,
           com.xius.xbus.messages.common.AddressType address) {
           this.email = email;
           this.homePhone = homePhone;
           this.officePhone = officePhone;
           this.mContactPhoneNumber = mContactPhoneNumber;
           this.alternateContactNo = alternateContactNo;
           this.address = address;
    }


    /**
     * Gets the email value for this ContactDetailsType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ContactDetailsType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the homePhone value for this ContactDetailsType.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this ContactDetailsType.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the officePhone value for this ContactDetailsType.
     * 
     * @return officePhone
     */
    public java.lang.String getOfficePhone() {
        return officePhone;
    }


    /**
     * Sets the officePhone value for this ContactDetailsType.
     * 
     * @param officePhone
     */
    public void setOfficePhone(java.lang.String officePhone) {
        this.officePhone = officePhone;
    }


    /**
     * Gets the mContactPhoneNumber value for this ContactDetailsType.
     * 
     * @return mContactPhoneNumber
     */
    public java.lang.String getMContactPhoneNumber() {
        return mContactPhoneNumber;
    }


    /**
     * Sets the mContactPhoneNumber value for this ContactDetailsType.
     * 
     * @param mContactPhoneNumber
     */
    public void setMContactPhoneNumber(java.lang.String mContactPhoneNumber) {
        this.mContactPhoneNumber = mContactPhoneNumber;
    }


    /**
     * Gets the alternateContactNo value for this ContactDetailsType.
     * 
     * @return alternateContactNo
     */
    public java.lang.String getAlternateContactNo() {
        return alternateContactNo;
    }


    /**
     * Sets the alternateContactNo value for this ContactDetailsType.
     * 
     * @param alternateContactNo
     */
    public void setAlternateContactNo(java.lang.String alternateContactNo) {
        this.alternateContactNo = alternateContactNo;
    }


    /**
     * Gets the address value for this ContactDetailsType.
     * 
     * @return address
     */
    public com.xius.xbus.messages.common.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ContactDetailsType.
     * 
     * @param address
     */
    public void setAddress(com.xius.xbus.messages.common.AddressType address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactDetailsType)) return false;
        ContactDetailsType other = (ContactDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.officePhone==null && other.getOfficePhone()==null) || 
             (this.officePhone!=null &&
              this.officePhone.equals(other.getOfficePhone()))) &&
            ((this.mContactPhoneNumber==null && other.getMContactPhoneNumber()==null) || 
             (this.mContactPhoneNumber!=null &&
              this.mContactPhoneNumber.equals(other.getMContactPhoneNumber()))) &&
            ((this.alternateContactNo==null && other.getAlternateContactNo()==null) || 
             (this.alternateContactNo!=null &&
              this.alternateContactNo.equals(other.getAlternateContactNo()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getOfficePhone() != null) {
            _hashCode += getOfficePhone().hashCode();
        }
        if (getMContactPhoneNumber() != null) {
            _hashCode += getMContactPhoneNumber().hashCode();
        }
        if (getAlternateContactNo() != null) {
            _hashCode += getAlternateContactNo().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ContactDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "officePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MContactPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "mContactPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateContactNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "alternateContactNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AddressType"));
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
