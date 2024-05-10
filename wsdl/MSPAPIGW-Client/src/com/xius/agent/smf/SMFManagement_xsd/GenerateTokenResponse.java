/**
 * GenerateTokenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class GenerateTokenResponse  implements java.io.Serializable {
    private java.lang.String token;

    private java.lang.String tokenLife;

    private java.lang.String tokenExpiryDate;

    private java.lang.String tokenExpiryTime;

    public GenerateTokenResponse() {
    }

    public GenerateTokenResponse(
           java.lang.String token,
           java.lang.String tokenLife,
           java.lang.String tokenExpiryDate,
           java.lang.String tokenExpiryTime) {
           this.token = token;
           this.tokenLife = tokenLife;
           this.tokenExpiryDate = tokenExpiryDate;
           this.tokenExpiryTime = tokenExpiryTime;
    }


    /**
     * Gets the token value for this GenerateTokenResponse.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this GenerateTokenResponse.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the tokenLife value for this GenerateTokenResponse.
     * 
     * @return tokenLife
     */
    public java.lang.String getTokenLife() {
        return tokenLife;
    }


    /**
     * Sets the tokenLife value for this GenerateTokenResponse.
     * 
     * @param tokenLife
     */
    public void setTokenLife(java.lang.String tokenLife) {
        this.tokenLife = tokenLife;
    }


    /**
     * Gets the tokenExpiryDate value for this GenerateTokenResponse.
     * 
     * @return tokenExpiryDate
     */
    public java.lang.String getTokenExpiryDate() {
        return tokenExpiryDate;
    }


    /**
     * Sets the tokenExpiryDate value for this GenerateTokenResponse.
     * 
     * @param tokenExpiryDate
     */
    public void setTokenExpiryDate(java.lang.String tokenExpiryDate) {
        this.tokenExpiryDate = tokenExpiryDate;
    }


    /**
     * Gets the tokenExpiryTime value for this GenerateTokenResponse.
     * 
     * @return tokenExpiryTime
     */
    public java.lang.String getTokenExpiryTime() {
        return tokenExpiryTime;
    }


    /**
     * Sets the tokenExpiryTime value for this GenerateTokenResponse.
     * 
     * @param tokenExpiryTime
     */
    public void setTokenExpiryTime(java.lang.String tokenExpiryTime) {
        this.tokenExpiryTime = tokenExpiryTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateTokenResponse)) return false;
        GenerateTokenResponse other = (GenerateTokenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.tokenLife==null && other.getTokenLife()==null) || 
             (this.tokenLife!=null &&
              this.tokenLife.equals(other.getTokenLife()))) &&
            ((this.tokenExpiryDate==null && other.getTokenExpiryDate()==null) || 
             (this.tokenExpiryDate!=null &&
              this.tokenExpiryDate.equals(other.getTokenExpiryDate()))) &&
            ((this.tokenExpiryTime==null && other.getTokenExpiryTime()==null) || 
             (this.tokenExpiryTime!=null &&
              this.tokenExpiryTime.equals(other.getTokenExpiryTime())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getTokenLife() != null) {
            _hashCode += getTokenLife().hashCode();
        }
        if (getTokenExpiryDate() != null) {
            _hashCode += getTokenExpiryDate().hashCode();
        }
        if (getTokenExpiryTime() != null) {
            _hashCode += getTokenExpiryTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateTokenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "generateTokenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenLife");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "tokenLife"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "tokenExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenExpiryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "tokenExpiryTime"));
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
