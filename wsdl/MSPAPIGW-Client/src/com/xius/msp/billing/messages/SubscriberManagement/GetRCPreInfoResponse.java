/**
 * GetRCPreInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class GetRCPreInfoResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.TariffPackDtlsType[] tariffPackDtls;

    private com.xius.msp.billing.messages.SubscriberManagement.SubsCategoryDtlsType[] subsCategoryDtls;

    private com.xius.msp.billing.messages.SubscriberManagement.RcCategoryDtlsType[] rcCategoryDtls;

    private com.xius.msp.billing.messages.SubscriberManagement.BalanceIdDtlsType[] balanceIdDtls;

    private com.xius.msp.billing.messages.SubscriberManagement.AtpDtlsType[] atpDtls;

    private com.xius.msp.billing.messages.SubscriberManagement.ChannelDtlsType[] channelDtls;

    public GetRCPreInfoResponse() {
    }

    public GetRCPreInfoResponse(
           com.xius.msp.billing.messages.SubscriberManagement.TariffPackDtlsType[] tariffPackDtls,
           com.xius.msp.billing.messages.SubscriberManagement.SubsCategoryDtlsType[] subsCategoryDtls,
           com.xius.msp.billing.messages.SubscriberManagement.RcCategoryDtlsType[] rcCategoryDtls,
           com.xius.msp.billing.messages.SubscriberManagement.BalanceIdDtlsType[] balanceIdDtls,
           com.xius.msp.billing.messages.SubscriberManagement.AtpDtlsType[] atpDtls,
           com.xius.msp.billing.messages.SubscriberManagement.ChannelDtlsType[] channelDtls) {
           this.tariffPackDtls = tariffPackDtls;
           this.subsCategoryDtls = subsCategoryDtls;
           this.rcCategoryDtls = rcCategoryDtls;
           this.balanceIdDtls = balanceIdDtls;
           this.atpDtls = atpDtls;
           this.channelDtls = channelDtls;
    }


    /**
     * Gets the tariffPackDtls value for this GetRCPreInfoResponse.
     * 
     * @return tariffPackDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.TariffPackDtlsType[] getTariffPackDtls() {
        return tariffPackDtls;
    }


    /**
     * Sets the tariffPackDtls value for this GetRCPreInfoResponse.
     * 
     * @param tariffPackDtls
     */
    public void setTariffPackDtls(com.xius.msp.billing.messages.SubscriberManagement.TariffPackDtlsType[] tariffPackDtls) {
        this.tariffPackDtls = tariffPackDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.TariffPackDtlsType getTariffPackDtls(int i) {
        return this.tariffPackDtls[i];
    }

    public void setTariffPackDtls(int i, com.xius.msp.billing.messages.SubscriberManagement.TariffPackDtlsType _value) {
        this.tariffPackDtls[i] = _value;
    }


    /**
     * Gets the subsCategoryDtls value for this GetRCPreInfoResponse.
     * 
     * @return subsCategoryDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.SubsCategoryDtlsType[] getSubsCategoryDtls() {
        return subsCategoryDtls;
    }


    /**
     * Sets the subsCategoryDtls value for this GetRCPreInfoResponse.
     * 
     * @param subsCategoryDtls
     */
    public void setSubsCategoryDtls(com.xius.msp.billing.messages.SubscriberManagement.SubsCategoryDtlsType[] subsCategoryDtls) {
        this.subsCategoryDtls = subsCategoryDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.SubsCategoryDtlsType getSubsCategoryDtls(int i) {
        return this.subsCategoryDtls[i];
    }

    public void setSubsCategoryDtls(int i, com.xius.msp.billing.messages.SubscriberManagement.SubsCategoryDtlsType _value) {
        this.subsCategoryDtls[i] = _value;
    }


    /**
     * Gets the rcCategoryDtls value for this GetRCPreInfoResponse.
     * 
     * @return rcCategoryDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.RcCategoryDtlsType[] getRcCategoryDtls() {
        return rcCategoryDtls;
    }


    /**
     * Sets the rcCategoryDtls value for this GetRCPreInfoResponse.
     * 
     * @param rcCategoryDtls
     */
    public void setRcCategoryDtls(com.xius.msp.billing.messages.SubscriberManagement.RcCategoryDtlsType[] rcCategoryDtls) {
        this.rcCategoryDtls = rcCategoryDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.RcCategoryDtlsType getRcCategoryDtls(int i) {
        return this.rcCategoryDtls[i];
    }

    public void setRcCategoryDtls(int i, com.xius.msp.billing.messages.SubscriberManagement.RcCategoryDtlsType _value) {
        this.rcCategoryDtls[i] = _value;
    }


    /**
     * Gets the balanceIdDtls value for this GetRCPreInfoResponse.
     * 
     * @return balanceIdDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.BalanceIdDtlsType[] getBalanceIdDtls() {
        return balanceIdDtls;
    }


    /**
     * Sets the balanceIdDtls value for this GetRCPreInfoResponse.
     * 
     * @param balanceIdDtls
     */
    public void setBalanceIdDtls(com.xius.msp.billing.messages.SubscriberManagement.BalanceIdDtlsType[] balanceIdDtls) {
        this.balanceIdDtls = balanceIdDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.BalanceIdDtlsType getBalanceIdDtls(int i) {
        return this.balanceIdDtls[i];
    }

    public void setBalanceIdDtls(int i, com.xius.msp.billing.messages.SubscriberManagement.BalanceIdDtlsType _value) {
        this.balanceIdDtls[i] = _value;
    }


    /**
     * Gets the atpDtls value for this GetRCPreInfoResponse.
     * 
     * @return atpDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.AtpDtlsType[] getAtpDtls() {
        return atpDtls;
    }


    /**
     * Sets the atpDtls value for this GetRCPreInfoResponse.
     * 
     * @param atpDtls
     */
    public void setAtpDtls(com.xius.msp.billing.messages.SubscriberManagement.AtpDtlsType[] atpDtls) {
        this.atpDtls = atpDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.AtpDtlsType getAtpDtls(int i) {
        return this.atpDtls[i];
    }

    public void setAtpDtls(int i, com.xius.msp.billing.messages.SubscriberManagement.AtpDtlsType _value) {
        this.atpDtls[i] = _value;
    }


    /**
     * Gets the channelDtls value for this GetRCPreInfoResponse.
     * 
     * @return channelDtls
     */
    public com.xius.msp.billing.messages.SubscriberManagement.ChannelDtlsType[] getChannelDtls() {
        return channelDtls;
    }


    /**
     * Sets the channelDtls value for this GetRCPreInfoResponse.
     * 
     * @param channelDtls
     */
    public void setChannelDtls(com.xius.msp.billing.messages.SubscriberManagement.ChannelDtlsType[] channelDtls) {
        this.channelDtls = channelDtls;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ChannelDtlsType getChannelDtls(int i) {
        return this.channelDtls[i];
    }

    public void setChannelDtls(int i, com.xius.msp.billing.messages.SubscriberManagement.ChannelDtlsType _value) {
        this.channelDtls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRCPreInfoResponse)) return false;
        GetRCPreInfoResponse other = (GetRCPreInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tariffPackDtls==null && other.getTariffPackDtls()==null) || 
             (this.tariffPackDtls!=null &&
              java.util.Arrays.equals(this.tariffPackDtls, other.getTariffPackDtls()))) &&
            ((this.subsCategoryDtls==null && other.getSubsCategoryDtls()==null) || 
             (this.subsCategoryDtls!=null &&
              java.util.Arrays.equals(this.subsCategoryDtls, other.getSubsCategoryDtls()))) &&
            ((this.rcCategoryDtls==null && other.getRcCategoryDtls()==null) || 
             (this.rcCategoryDtls!=null &&
              java.util.Arrays.equals(this.rcCategoryDtls, other.getRcCategoryDtls()))) &&
            ((this.balanceIdDtls==null && other.getBalanceIdDtls()==null) || 
             (this.balanceIdDtls!=null &&
              java.util.Arrays.equals(this.balanceIdDtls, other.getBalanceIdDtls()))) &&
            ((this.atpDtls==null && other.getAtpDtls()==null) || 
             (this.atpDtls!=null &&
              java.util.Arrays.equals(this.atpDtls, other.getAtpDtls()))) &&
            ((this.channelDtls==null && other.getChannelDtls()==null) || 
             (this.channelDtls!=null &&
              java.util.Arrays.equals(this.channelDtls, other.getChannelDtls())));
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
        if (getTariffPackDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTariffPackDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTariffPackDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsCategoryDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsCategoryDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsCategoryDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRcCategoryDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRcCategoryDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRcCategoryDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalanceIdDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceIdDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceIdDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAtpDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtpDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtpDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannelDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRCPreInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetRCPreInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffPackDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsCategoryDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subsCategoryDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subsCategoryDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCategoryDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "rcCategoryDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "rcCategoryDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceIdDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "balanceIdDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "balanceIdDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "channelDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "channelDtlsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
