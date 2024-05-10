/**
 * PasswordRulesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class PasswordRulesType  implements java.io.Serializable {
    private java.lang.Long networkID;

    private java.lang.String networkDesc;

    private java.lang.Long minLength;

    private java.lang.Long maxLength;

    private java.lang.Long reuseRestrictDays;

    private java.lang.Long minUpperChars;

    private java.lang.Long minLowerChars;

    private java.lang.Long minSpecialChars;

    private java.lang.Long minDigits;

    private java.lang.String userNameCanMatchPassword;

    public PasswordRulesType() {
    }

    public PasswordRulesType(
           java.lang.Long networkID,
           java.lang.String networkDesc,
           java.lang.Long minLength,
           java.lang.Long maxLength,
           java.lang.Long reuseRestrictDays,
           java.lang.Long minUpperChars,
           java.lang.Long minLowerChars,
           java.lang.Long minSpecialChars,
           java.lang.Long minDigits,
           java.lang.String userNameCanMatchPassword) {
           this.networkID = networkID;
           this.networkDesc = networkDesc;
           this.minLength = minLength;
           this.maxLength = maxLength;
           this.reuseRestrictDays = reuseRestrictDays;
           this.minUpperChars = minUpperChars;
           this.minLowerChars = minLowerChars;
           this.minSpecialChars = minSpecialChars;
           this.minDigits = minDigits;
           this.userNameCanMatchPassword = userNameCanMatchPassword;
    }


    /**
     * Gets the networkID value for this PasswordRulesType.
     * 
     * @return networkID
     */
    public java.lang.Long getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this PasswordRulesType.
     * 
     * @param networkID
     */
    public void setNetworkID(java.lang.Long networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the networkDesc value for this PasswordRulesType.
     * 
     * @return networkDesc
     */
    public java.lang.String getNetworkDesc() {
        return networkDesc;
    }


    /**
     * Sets the networkDesc value for this PasswordRulesType.
     * 
     * @param networkDesc
     */
    public void setNetworkDesc(java.lang.String networkDesc) {
        this.networkDesc = networkDesc;
    }


    /**
     * Gets the minLength value for this PasswordRulesType.
     * 
     * @return minLength
     */
    public java.lang.Long getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this PasswordRulesType.
     * 
     * @param minLength
     */
    public void setMinLength(java.lang.Long minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the maxLength value for this PasswordRulesType.
     * 
     * @return maxLength
     */
    public java.lang.Long getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this PasswordRulesType.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.Long maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the reuseRestrictDays value for this PasswordRulesType.
     * 
     * @return reuseRestrictDays
     */
    public java.lang.Long getReuseRestrictDays() {
        return reuseRestrictDays;
    }


    /**
     * Sets the reuseRestrictDays value for this PasswordRulesType.
     * 
     * @param reuseRestrictDays
     */
    public void setReuseRestrictDays(java.lang.Long reuseRestrictDays) {
        this.reuseRestrictDays = reuseRestrictDays;
    }


    /**
     * Gets the minUpperChars value for this PasswordRulesType.
     * 
     * @return minUpperChars
     */
    public java.lang.Long getMinUpperChars() {
        return minUpperChars;
    }


    /**
     * Sets the minUpperChars value for this PasswordRulesType.
     * 
     * @param minUpperChars
     */
    public void setMinUpperChars(java.lang.Long minUpperChars) {
        this.minUpperChars = minUpperChars;
    }


    /**
     * Gets the minLowerChars value for this PasswordRulesType.
     * 
     * @return minLowerChars
     */
    public java.lang.Long getMinLowerChars() {
        return minLowerChars;
    }


    /**
     * Sets the minLowerChars value for this PasswordRulesType.
     * 
     * @param minLowerChars
     */
    public void setMinLowerChars(java.lang.Long minLowerChars) {
        this.minLowerChars = minLowerChars;
    }


    /**
     * Gets the minSpecialChars value for this PasswordRulesType.
     * 
     * @return minSpecialChars
     */
    public java.lang.Long getMinSpecialChars() {
        return minSpecialChars;
    }


    /**
     * Sets the minSpecialChars value for this PasswordRulesType.
     * 
     * @param minSpecialChars
     */
    public void setMinSpecialChars(java.lang.Long minSpecialChars) {
        this.minSpecialChars = minSpecialChars;
    }


    /**
     * Gets the minDigits value for this PasswordRulesType.
     * 
     * @return minDigits
     */
    public java.lang.Long getMinDigits() {
        return minDigits;
    }


    /**
     * Sets the minDigits value for this PasswordRulesType.
     * 
     * @param minDigits
     */
    public void setMinDigits(java.lang.Long minDigits) {
        this.minDigits = minDigits;
    }


    /**
     * Gets the userNameCanMatchPassword value for this PasswordRulesType.
     * 
     * @return userNameCanMatchPassword
     */
    public java.lang.String getUserNameCanMatchPassword() {
        return userNameCanMatchPassword;
    }


    /**
     * Sets the userNameCanMatchPassword value for this PasswordRulesType.
     * 
     * @param userNameCanMatchPassword
     */
    public void setUserNameCanMatchPassword(java.lang.String userNameCanMatchPassword) {
        this.userNameCanMatchPassword = userNameCanMatchPassword;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordRulesType)) return false;
        PasswordRulesType other = (PasswordRulesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.networkDesc==null && other.getNetworkDesc()==null) || 
             (this.networkDesc!=null &&
              this.networkDesc.equals(other.getNetworkDesc()))) &&
            ((this.minLength==null && other.getMinLength()==null) || 
             (this.minLength!=null &&
              this.minLength.equals(other.getMinLength()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.reuseRestrictDays==null && other.getReuseRestrictDays()==null) || 
             (this.reuseRestrictDays!=null &&
              this.reuseRestrictDays.equals(other.getReuseRestrictDays()))) &&
            ((this.minUpperChars==null && other.getMinUpperChars()==null) || 
             (this.minUpperChars!=null &&
              this.minUpperChars.equals(other.getMinUpperChars()))) &&
            ((this.minLowerChars==null && other.getMinLowerChars()==null) || 
             (this.minLowerChars!=null &&
              this.minLowerChars.equals(other.getMinLowerChars()))) &&
            ((this.minSpecialChars==null && other.getMinSpecialChars()==null) || 
             (this.minSpecialChars!=null &&
              this.minSpecialChars.equals(other.getMinSpecialChars()))) &&
            ((this.minDigits==null && other.getMinDigits()==null) || 
             (this.minDigits!=null &&
              this.minDigits.equals(other.getMinDigits()))) &&
            ((this.userNameCanMatchPassword==null && other.getUserNameCanMatchPassword()==null) || 
             (this.userNameCanMatchPassword!=null &&
              this.userNameCanMatchPassword.equals(other.getUserNameCanMatchPassword())));
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
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getNetworkDesc() != null) {
            _hashCode += getNetworkDesc().hashCode();
        }
        if (getMinLength() != null) {
            _hashCode += getMinLength().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getReuseRestrictDays() != null) {
            _hashCode += getReuseRestrictDays().hashCode();
        }
        if (getMinUpperChars() != null) {
            _hashCode += getMinUpperChars().hashCode();
        }
        if (getMinLowerChars() != null) {
            _hashCode += getMinLowerChars().hashCode();
        }
        if (getMinSpecialChars() != null) {
            _hashCode += getMinSpecialChars().hashCode();
        }
        if (getMinDigits() != null) {
            _hashCode += getMinDigits().hashCode();
        }
        if (getUserNameCanMatchPassword() != null) {
            _hashCode += getUserNameCanMatchPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordRulesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PasswordRulesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reuseRestrictDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "reuseRestrictDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minUpperChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "minUpperChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLowerChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "minLowerChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSpecialChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "minSpecialChars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "minDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNameCanMatchPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "userNameCanMatchPassword"));
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
