/**
 * GetNotesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class GetNotesRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.AccountType account;

    private com.xius.msp.billing.messages.SubscriberManagement.RetrivalType retrivalType;

    public GetNotesRequest() {
    }

    public GetNotesRequest(
           com.xius.msp.billing.messages.SubscriberManagement.AccountType account,
           com.xius.msp.billing.messages.SubscriberManagement.RetrivalType retrivalType) {
           this.account = account;
           this.retrivalType = retrivalType;
    }


    /**
     * Gets the account value for this GetNotesRequest.
     * 
     * @return account
     */
    public com.xius.msp.billing.messages.SubscriberManagement.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this GetNotesRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.msp.billing.messages.SubscriberManagement.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the retrivalType value for this GetNotesRequest.
     * 
     * @return retrivalType
     */
    public com.xius.msp.billing.messages.SubscriberManagement.RetrivalType getRetrivalType() {
        return retrivalType;
    }


    /**
     * Sets the retrivalType value for this GetNotesRequest.
     * 
     * @param retrivalType
     */
    public void setRetrivalType(com.xius.msp.billing.messages.SubscriberManagement.RetrivalType retrivalType) {
        this.retrivalType = retrivalType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNotesRequest)) return false;
        GetNotesRequest other = (GetNotesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.retrivalType==null && other.getRetrivalType()==null) || 
             (this.retrivalType!=null &&
              this.retrivalType.equals(other.getRetrivalType())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getRetrivalType() != null) {
            _hashCode += getRetrivalType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNotesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrivalType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "retrivalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "RetrivalType"));
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
