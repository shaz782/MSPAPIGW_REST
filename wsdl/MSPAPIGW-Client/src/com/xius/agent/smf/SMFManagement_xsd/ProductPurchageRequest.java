/**
 * ProductPurchageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class ProductPurchageRequest  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String publicityId;

    private java.lang.String refTransId;

    private java.lang.String channel;

    private java.lang.String subUnsubFlag;

    private java.lang.String charge;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    public ProductPurchageRequest() {
    }

    public ProductPurchageRequest(
           java.lang.String MSISDN,
           java.lang.String publicityId,
           java.lang.String refTransId,
           java.lang.String channel,
           java.lang.String subUnsubFlag,
           java.lang.String charge,
           java.lang.String userDefined1,
           java.lang.String userDefined2) {
           this.MSISDN = MSISDN;
           this.publicityId = publicityId;
           this.refTransId = refTransId;
           this.channel = channel;
           this.subUnsubFlag = subUnsubFlag;
           this.charge = charge;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
    }


    /**
     * Gets the MSISDN value for this ProductPurchageRequest.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this ProductPurchageRequest.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the publicityId value for this ProductPurchageRequest.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this ProductPurchageRequest.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the refTransId value for this ProductPurchageRequest.
     * 
     * @return refTransId
     */
    public java.lang.String getRefTransId() {
        return refTransId;
    }


    /**
     * Sets the refTransId value for this ProductPurchageRequest.
     * 
     * @param refTransId
     */
    public void setRefTransId(java.lang.String refTransId) {
        this.refTransId = refTransId;
    }


    /**
     * Gets the channel value for this ProductPurchageRequest.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ProductPurchageRequest.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the subUnsubFlag value for this ProductPurchageRequest.
     * 
     * @return subUnsubFlag
     */
    public java.lang.String getSubUnsubFlag() {
        return subUnsubFlag;
    }


    /**
     * Sets the subUnsubFlag value for this ProductPurchageRequest.
     * 
     * @param subUnsubFlag
     */
    public void setSubUnsubFlag(java.lang.String subUnsubFlag) {
        this.subUnsubFlag = subUnsubFlag;
    }


    /**
     * Gets the charge value for this ProductPurchageRequest.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this ProductPurchageRequest.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the userDefined1 value for this ProductPurchageRequest.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this ProductPurchageRequest.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this ProductPurchageRequest.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this ProductPurchageRequest.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPurchageRequest)) return false;
        ProductPurchageRequest other = (ProductPurchageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.refTransId==null && other.getRefTransId()==null) || 
             (this.refTransId!=null &&
              this.refTransId.equals(other.getRefTransId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.subUnsubFlag==null && other.getSubUnsubFlag()==null) || 
             (this.subUnsubFlag!=null &&
              this.subUnsubFlag.equals(other.getSubUnsubFlag()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getRefTransId() != null) {
            _hashCode += getRefTransId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getSubUnsubFlag() != null) {
            _hashCode += getSubUnsubFlag().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProductPurchageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "refTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subUnsubFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "subUnsubFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "userDefined2"));
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
