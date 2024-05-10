/**
 * GetTotAccntCountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetTotAccntCountResponse  implements java.io.Serializable {
    private java.lang.String totAccntConfig;

    private java.lang.String prepaidAccntConfig;

    private java.lang.String postpaidAccntConfig;

    private java.lang.String prepaidAccntCnt;

    private java.lang.String postpaidAccntCnt;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    public GetTotAccntCountResponse() {
    }

    public GetTotAccntCountResponse(
           java.lang.String totAccntConfig,
           java.lang.String prepaidAccntConfig,
           java.lang.String postpaidAccntConfig,
           java.lang.String prepaidAccntCnt,
           java.lang.String postpaidAccntCnt,
           java.lang.String userDefined1,
           java.lang.String userDefined2) {
           this.totAccntConfig = totAccntConfig;
           this.prepaidAccntConfig = prepaidAccntConfig;
           this.postpaidAccntConfig = postpaidAccntConfig;
           this.prepaidAccntCnt = prepaidAccntCnt;
           this.postpaidAccntCnt = postpaidAccntCnt;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
    }


    /**
     * Gets the totAccntConfig value for this GetTotAccntCountResponse.
     * 
     * @return totAccntConfig
     */
    public java.lang.String getTotAccntConfig() {
        return totAccntConfig;
    }


    /**
     * Sets the totAccntConfig value for this GetTotAccntCountResponse.
     * 
     * @param totAccntConfig
     */
    public void setTotAccntConfig(java.lang.String totAccntConfig) {
        this.totAccntConfig = totAccntConfig;
    }


    /**
     * Gets the prepaidAccntConfig value for this GetTotAccntCountResponse.
     * 
     * @return prepaidAccntConfig
     */
    public java.lang.String getPrepaidAccntConfig() {
        return prepaidAccntConfig;
    }


    /**
     * Sets the prepaidAccntConfig value for this GetTotAccntCountResponse.
     * 
     * @param prepaidAccntConfig
     */
    public void setPrepaidAccntConfig(java.lang.String prepaidAccntConfig) {
        this.prepaidAccntConfig = prepaidAccntConfig;
    }


    /**
     * Gets the postpaidAccntConfig value for this GetTotAccntCountResponse.
     * 
     * @return postpaidAccntConfig
     */
    public java.lang.String getPostpaidAccntConfig() {
        return postpaidAccntConfig;
    }


    /**
     * Sets the postpaidAccntConfig value for this GetTotAccntCountResponse.
     * 
     * @param postpaidAccntConfig
     */
    public void setPostpaidAccntConfig(java.lang.String postpaidAccntConfig) {
        this.postpaidAccntConfig = postpaidAccntConfig;
    }


    /**
     * Gets the prepaidAccntCnt value for this GetTotAccntCountResponse.
     * 
     * @return prepaidAccntCnt
     */
    public java.lang.String getPrepaidAccntCnt() {
        return prepaidAccntCnt;
    }


    /**
     * Sets the prepaidAccntCnt value for this GetTotAccntCountResponse.
     * 
     * @param prepaidAccntCnt
     */
    public void setPrepaidAccntCnt(java.lang.String prepaidAccntCnt) {
        this.prepaidAccntCnt = prepaidAccntCnt;
    }


    /**
     * Gets the postpaidAccntCnt value for this GetTotAccntCountResponse.
     * 
     * @return postpaidAccntCnt
     */
    public java.lang.String getPostpaidAccntCnt() {
        return postpaidAccntCnt;
    }


    /**
     * Sets the postpaidAccntCnt value for this GetTotAccntCountResponse.
     * 
     * @param postpaidAccntCnt
     */
    public void setPostpaidAccntCnt(java.lang.String postpaidAccntCnt) {
        this.postpaidAccntCnt = postpaidAccntCnt;
    }


    /**
     * Gets the userDefined1 value for this GetTotAccntCountResponse.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this GetTotAccntCountResponse.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this GetTotAccntCountResponse.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this GetTotAccntCountResponse.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTotAccntCountResponse)) return false;
        GetTotAccntCountResponse other = (GetTotAccntCountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totAccntConfig==null && other.getTotAccntConfig()==null) || 
             (this.totAccntConfig!=null &&
              this.totAccntConfig.equals(other.getTotAccntConfig()))) &&
            ((this.prepaidAccntConfig==null && other.getPrepaidAccntConfig()==null) || 
             (this.prepaidAccntConfig!=null &&
              this.prepaidAccntConfig.equals(other.getPrepaidAccntConfig()))) &&
            ((this.postpaidAccntConfig==null && other.getPostpaidAccntConfig()==null) || 
             (this.postpaidAccntConfig!=null &&
              this.postpaidAccntConfig.equals(other.getPostpaidAccntConfig()))) &&
            ((this.prepaidAccntCnt==null && other.getPrepaidAccntCnt()==null) || 
             (this.prepaidAccntCnt!=null &&
              this.prepaidAccntCnt.equals(other.getPrepaidAccntCnt()))) &&
            ((this.postpaidAccntCnt==null && other.getPostpaidAccntCnt()==null) || 
             (this.postpaidAccntCnt!=null &&
              this.postpaidAccntCnt.equals(other.getPostpaidAccntCnt()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2())));
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
        if (getTotAccntConfig() != null) {
            _hashCode += getTotAccntConfig().hashCode();
        }
        if (getPrepaidAccntConfig() != null) {
            _hashCode += getPrepaidAccntConfig().hashCode();
        }
        if (getPostpaidAccntConfig() != null) {
            _hashCode += getPostpaidAccntConfig().hashCode();
        }
        if (getPrepaidAccntCnt() != null) {
            _hashCode += getPrepaidAccntCnt().hashCode();
        }
        if (getPostpaidAccntCnt() != null) {
            _hashCode += getPostpaidAccntCnt().hashCode();
        }
        if (getUserDefined1() != null) {
            _hashCode += getUserDefined1().hashCode();
        }
        if (getUserDefined2() != null) {
            _hashCode += getUserDefined2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTotAccntCountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetTotAccntCountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totAccntConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "totAccntConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAccntConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "prepaidAccntConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidAccntConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "postpaidAccntConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAccntCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "prepaidAccntCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postpaidAccntCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "postpaidAccntCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "userDefined2"));
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
