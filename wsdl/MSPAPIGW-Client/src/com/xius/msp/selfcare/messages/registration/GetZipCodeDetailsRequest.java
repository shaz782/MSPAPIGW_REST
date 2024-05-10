/**
 * GetZipCodeDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class GetZipCodeDetailsRequest  implements java.io.Serializable {
    private java.lang.String countryCode;

    private java.lang.String stateId;

    private java.lang.String stateName;

    private java.lang.String zipCode;

    private java.lang.String cityName;

    public GetZipCodeDetailsRequest() {
    }

    public GetZipCodeDetailsRequest(
           java.lang.String countryCode,
           java.lang.String stateId,
           java.lang.String stateName,
           java.lang.String zipCode,
           java.lang.String cityName) {
           this.countryCode = countryCode;
           this.stateId = stateId;
           this.stateName = stateName;
           this.zipCode = zipCode;
           this.cityName = cityName;
    }


    /**
     * Gets the countryCode value for this GetZipCodeDetailsRequest.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this GetZipCodeDetailsRequest.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the stateId value for this GetZipCodeDetailsRequest.
     * 
     * @return stateId
     */
    public java.lang.String getStateId() {
        return stateId;
    }


    /**
     * Sets the stateId value for this GetZipCodeDetailsRequest.
     * 
     * @param stateId
     */
    public void setStateId(java.lang.String stateId) {
        this.stateId = stateId;
    }


    /**
     * Gets the stateName value for this GetZipCodeDetailsRequest.
     * 
     * @return stateName
     */
    public java.lang.String getStateName() {
        return stateName;
    }


    /**
     * Sets the stateName value for this GetZipCodeDetailsRequest.
     * 
     * @param stateName
     */
    public void setStateName(java.lang.String stateName) {
        this.stateName = stateName;
    }


    /**
     * Gets the zipCode value for this GetZipCodeDetailsRequest.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this GetZipCodeDetailsRequest.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the cityName value for this GetZipCodeDetailsRequest.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this GetZipCodeDetailsRequest.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZipCodeDetailsRequest)) return false;
        GetZipCodeDetailsRequest other = (GetZipCodeDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.stateId==null && other.getStateId()==null) || 
             (this.stateId!=null &&
              this.stateId.equals(other.getStateId()))) &&
            ((this.stateName==null && other.getStateName()==null) || 
             (this.stateName!=null &&
              this.stateName.equals(other.getStateName()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName())));
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getStateId() != null) {
            _hashCode += getStateId().hashCode();
        }
        if (getStateName() != null) {
            _hashCode += getStateName().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZipCodeDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "GetZipCodeDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "stateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "stateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "cityName"));
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
