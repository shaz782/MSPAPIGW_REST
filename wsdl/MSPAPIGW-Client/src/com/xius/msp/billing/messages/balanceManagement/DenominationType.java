/**
 * DenominationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.balanceManagement;

public class DenominationType  implements java.io.Serializable {
    private java.lang.String denomination;

    private java.lang.String validityPeriod;

    private java.lang.String gracePeriod1;

    private java.lang.String gracePeriod2;

    private java.lang.String talkValue;

    private java.lang.String seqId;

    private java.lang.String publicityId;

    private java.lang.String tariffPackageId;

    private java.lang.String denominationDesc;

    public DenominationType() {
    }

    public DenominationType(
           java.lang.String denomination,
           java.lang.String validityPeriod,
           java.lang.String gracePeriod1,
           java.lang.String gracePeriod2,
           java.lang.String talkValue,
           java.lang.String seqId,
           java.lang.String publicityId,
           java.lang.String tariffPackageId,
           java.lang.String denominationDesc) {
           this.denomination = denomination;
           this.validityPeriod = validityPeriod;
           this.gracePeriod1 = gracePeriod1;
           this.gracePeriod2 = gracePeriod2;
           this.talkValue = talkValue;
           this.seqId = seqId;
           this.publicityId = publicityId;
           this.tariffPackageId = tariffPackageId;
           this.denominationDesc = denominationDesc;
    }


    /**
     * Gets the denomination value for this DenominationType.
     * 
     * @return denomination
     */
    public java.lang.String getDenomination() {
        return denomination;
    }


    /**
     * Sets the denomination value for this DenominationType.
     * 
     * @param denomination
     */
    public void setDenomination(java.lang.String denomination) {
        this.denomination = denomination;
    }


    /**
     * Gets the validityPeriod value for this DenominationType.
     * 
     * @return validityPeriod
     */
    public java.lang.String getValidityPeriod() {
        return validityPeriod;
    }


    /**
     * Sets the validityPeriod value for this DenominationType.
     * 
     * @param validityPeriod
     */
    public void setValidityPeriod(java.lang.String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    /**
     * Gets the gracePeriod1 value for this DenominationType.
     * 
     * @return gracePeriod1
     */
    public java.lang.String getGracePeriod1() {
        return gracePeriod1;
    }


    /**
     * Sets the gracePeriod1 value for this DenominationType.
     * 
     * @param gracePeriod1
     */
    public void setGracePeriod1(java.lang.String gracePeriod1) {
        this.gracePeriod1 = gracePeriod1;
    }


    /**
     * Gets the gracePeriod2 value for this DenominationType.
     * 
     * @return gracePeriod2
     */
    public java.lang.String getGracePeriod2() {
        return gracePeriod2;
    }


    /**
     * Sets the gracePeriod2 value for this DenominationType.
     * 
     * @param gracePeriod2
     */
    public void setGracePeriod2(java.lang.String gracePeriod2) {
        this.gracePeriod2 = gracePeriod2;
    }


    /**
     * Gets the talkValue value for this DenominationType.
     * 
     * @return talkValue
     */
    public java.lang.String getTalkValue() {
        return talkValue;
    }


    /**
     * Sets the talkValue value for this DenominationType.
     * 
     * @param talkValue
     */
    public void setTalkValue(java.lang.String talkValue) {
        this.talkValue = talkValue;
    }


    /**
     * Gets the seqId value for this DenominationType.
     * 
     * @return seqId
     */
    public java.lang.String getSeqId() {
        return seqId;
    }


    /**
     * Sets the seqId value for this DenominationType.
     * 
     * @param seqId
     */
    public void setSeqId(java.lang.String seqId) {
        this.seqId = seqId;
    }


    /**
     * Gets the publicityId value for this DenominationType.
     * 
     * @return publicityId
     */
    public java.lang.String getPublicityId() {
        return publicityId;
    }


    /**
     * Sets the publicityId value for this DenominationType.
     * 
     * @param publicityId
     */
    public void setPublicityId(java.lang.String publicityId) {
        this.publicityId = publicityId;
    }


    /**
     * Gets the tariffPackageId value for this DenominationType.
     * 
     * @return tariffPackageId
     */
    public java.lang.String getTariffPackageId() {
        return tariffPackageId;
    }


    /**
     * Sets the tariffPackageId value for this DenominationType.
     * 
     * @param tariffPackageId
     */
    public void setTariffPackageId(java.lang.String tariffPackageId) {
        this.tariffPackageId = tariffPackageId;
    }


    /**
     * Gets the denominationDesc value for this DenominationType.
     * 
     * @return denominationDesc
     */
    public java.lang.String getDenominationDesc() {
        return denominationDesc;
    }


    /**
     * Sets the denominationDesc value for this DenominationType.
     * 
     * @param denominationDesc
     */
    public void setDenominationDesc(java.lang.String denominationDesc) {
        this.denominationDesc = denominationDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DenominationType)) return false;
        DenominationType other = (DenominationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.denomination==null && other.getDenomination()==null) || 
             (this.denomination!=null &&
              this.denomination.equals(other.getDenomination()))) &&
            ((this.validityPeriod==null && other.getValidityPeriod()==null) || 
             (this.validityPeriod!=null &&
              this.validityPeriod.equals(other.getValidityPeriod()))) &&
            ((this.gracePeriod1==null && other.getGracePeriod1()==null) || 
             (this.gracePeriod1!=null &&
              this.gracePeriod1.equals(other.getGracePeriod1()))) &&
            ((this.gracePeriod2==null && other.getGracePeriod2()==null) || 
             (this.gracePeriod2!=null &&
              this.gracePeriod2.equals(other.getGracePeriod2()))) &&
            ((this.talkValue==null && other.getTalkValue()==null) || 
             (this.talkValue!=null &&
              this.talkValue.equals(other.getTalkValue()))) &&
            ((this.seqId==null && other.getSeqId()==null) || 
             (this.seqId!=null &&
              this.seqId.equals(other.getSeqId()))) &&
            ((this.publicityId==null && other.getPublicityId()==null) || 
             (this.publicityId!=null &&
              this.publicityId.equals(other.getPublicityId()))) &&
            ((this.tariffPackageId==null && other.getTariffPackageId()==null) || 
             (this.tariffPackageId!=null &&
              this.tariffPackageId.equals(other.getTariffPackageId()))) &&
            ((this.denominationDesc==null && other.getDenominationDesc()==null) || 
             (this.denominationDesc!=null &&
              this.denominationDesc.equals(other.getDenominationDesc())));
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
        if (getDenomination() != null) {
            _hashCode += getDenomination().hashCode();
        }
        if (getValidityPeriod() != null) {
            _hashCode += getValidityPeriod().hashCode();
        }
        if (getGracePeriod1() != null) {
            _hashCode += getGracePeriod1().hashCode();
        }
        if (getGracePeriod2() != null) {
            _hashCode += getGracePeriod2().hashCode();
        }
        if (getTalkValue() != null) {
            _hashCode += getTalkValue().hashCode();
        }
        if (getSeqId() != null) {
            _hashCode += getSeqId().hashCode();
        }
        if (getPublicityId() != null) {
            _hashCode += getPublicityId().hashCode();
        }
        if (getTariffPackageId() != null) {
            _hashCode += getTariffPackageId().hashCode();
        }
        if (getDenominationDesc() != null) {
            _hashCode += getDenominationDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DenominationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "denominationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denomination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "denomination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "validityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "gracePeriod1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gracePeriod2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "gracePeriod2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talkValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "talkValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "seqId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "publicityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "tariffPackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denominationDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "denominationDesc"));
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
