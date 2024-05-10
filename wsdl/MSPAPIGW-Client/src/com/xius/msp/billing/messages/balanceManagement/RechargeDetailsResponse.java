/**
 * RechargeDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.balanceManagement;

public class RechargeDetailsResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.balanceManagement.RechargeDetailsType[] rechargeDetails;

    private java.lang.String message;

    public RechargeDetailsResponse() {
    }

    public RechargeDetailsResponse(
           com.xius.msp.billing.messages.balanceManagement.RechargeDetailsType[] rechargeDetails,
           java.lang.String message) {
           this.rechargeDetails = rechargeDetails;
           this.message = message;
    }


    /**
     * Gets the rechargeDetails value for this RechargeDetailsResponse.
     * 
     * @return rechargeDetails
     */
    public com.xius.msp.billing.messages.balanceManagement.RechargeDetailsType[] getRechargeDetails() {
        return rechargeDetails;
    }


    /**
     * Sets the rechargeDetails value for this RechargeDetailsResponse.
     * 
     * @param rechargeDetails
     */
    public void setRechargeDetails(com.xius.msp.billing.messages.balanceManagement.RechargeDetailsType[] rechargeDetails) {
        this.rechargeDetails = rechargeDetails;
    }

    public com.xius.msp.billing.messages.balanceManagement.RechargeDetailsType getRechargeDetails(int i) {
        return this.rechargeDetails[i];
    }

    public void setRechargeDetails(int i, com.xius.msp.billing.messages.balanceManagement.RechargeDetailsType _value) {
        this.rechargeDetails[i] = _value;
    }


    /**
     * Gets the message value for this RechargeDetailsResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this RechargeDetailsResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeDetailsResponse)) return false;
        RechargeDetailsResponse other = (RechargeDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rechargeDetails==null && other.getRechargeDetails()==null) || 
             (this.rechargeDetails!=null &&
              java.util.Arrays.equals(this.rechargeDetails, other.getRechargeDetails()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getRechargeDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRechargeDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRechargeDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", ">rechargeDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "rechargeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "RechargeDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "message"));
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
