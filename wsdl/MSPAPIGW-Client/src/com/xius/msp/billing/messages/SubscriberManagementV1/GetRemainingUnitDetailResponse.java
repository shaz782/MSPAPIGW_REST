/**
 * GetRemainingUnitDetailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class GetRemainingUnitDetailResponse  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.Long acctID;

    private com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType[] benefitDtls;

    private java.lang.String packValidity;

    public GetRemainingUnitDetailResponse() {
    }

    public GetRemainingUnitDetailResponse(
           java.lang.String MSISDN,
           java.lang.Long acctID,
           com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType[] benefitDtls,
           java.lang.String packValidity) {
           this.MSISDN = MSISDN;
           this.acctID = acctID;
           this.benefitDtls = benefitDtls;
           this.packValidity = packValidity;
    }


    /**
     * Gets the MSISDN value for this GetRemainingUnitDetailResponse.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this GetRemainingUnitDetailResponse.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the acctID value for this GetRemainingUnitDetailResponse.
     * 
     * @return acctID
     */
    public java.lang.Long getAcctID() {
        return acctID;
    }


    /**
     * Sets the acctID value for this GetRemainingUnitDetailResponse.
     * 
     * @param acctID
     */
    public void setAcctID(java.lang.Long acctID) {
        this.acctID = acctID;
    }


    /**
     * Gets the benefitDtls value for this GetRemainingUnitDetailResponse.
     * 
     * @return benefitDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType[] getBenefitDtls() {
        return benefitDtls;
    }


    /**
     * Sets the benefitDtls value for this GetRemainingUnitDetailResponse.
     * 
     * @param benefitDtls
     */
    public void setBenefitDtls(com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType[] benefitDtls) {
        this.benefitDtls = benefitDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType getBenefitDtls(int i) {
        return this.benefitDtls[i];
    }

    public void setBenefitDtls(int i, com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType _value) {
        this.benefitDtls[i] = _value;
    }


    /**
     * Gets the packValidity value for this GetRemainingUnitDetailResponse.
     * 
     * @return packValidity
     */
    public java.lang.String getPackValidity() {
        return packValidity;
    }


    /**
     * Sets the packValidity value for this GetRemainingUnitDetailResponse.
     * 
     * @param packValidity
     */
    public void setPackValidity(java.lang.String packValidity) {
        this.packValidity = packValidity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRemainingUnitDetailResponse)) return false;
        GetRemainingUnitDetailResponse other = (GetRemainingUnitDetailResponse) obj;
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
            ((this.acctID==null && other.getAcctID()==null) || 
             (this.acctID!=null &&
              this.acctID.equals(other.getAcctID()))) &&
            ((this.benefitDtls==null && other.getBenefitDtls()==null) || 
             (this.benefitDtls!=null &&
              java.util.Arrays.equals(this.benefitDtls, other.getBenefitDtls()))) &&
            ((this.packValidity==null && other.getPackValidity()==null) || 
             (this.packValidity!=null &&
              this.packValidity.equals(other.getPackValidity())));
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
        if (getAcctID() != null) {
            _hashCode += getAcctID().hashCode();
        }
        if (getBenefitDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBenefitDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBenefitDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackValidity() != null) {
            _hashCode += getPackValidity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRemainingUnitDetailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetRemainingUnitDetailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "acctID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "BenefitDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "BenefitDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packValidity"));
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
