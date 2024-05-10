/**
 * ServiceDeleteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class ServiceDeleteRequest  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.AccountType account;

    private com.xius.msp.billing.messages.SubscriberManagement.SubscriberServicesItem[] subsSvcs;

    public ServiceDeleteRequest() {
    }

    public ServiceDeleteRequest(
           com.xius.msp.billing.messages.SubscriberManagement.AccountType account,
           com.xius.msp.billing.messages.SubscriberManagement.SubscriberServicesItem[] subsSvcs) {
           this.account = account;
           this.subsSvcs = subsSvcs;
    }


    /**
     * Gets the account value for this ServiceDeleteRequest.
     * 
     * @return account
     */
    public com.xius.msp.billing.messages.SubscriberManagement.AccountType getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ServiceDeleteRequest.
     * 
     * @param account
     */
    public void setAccount(com.xius.msp.billing.messages.SubscriberManagement.AccountType account) {
        this.account = account;
    }


    /**
     * Gets the subsSvcs value for this ServiceDeleteRequest.
     * 
     * @return subsSvcs
     */
    public com.xius.msp.billing.messages.SubscriberManagement.SubscriberServicesItem[] getSubsSvcs() {
        return subsSvcs;
    }


    /**
     * Sets the subsSvcs value for this ServiceDeleteRequest.
     * 
     * @param subsSvcs
     */
    public void setSubsSvcs(com.xius.msp.billing.messages.SubscriberManagement.SubscriberServicesItem[] subsSvcs) {
        this.subsSvcs = subsSvcs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceDeleteRequest)) return false;
        ServiceDeleteRequest other = (ServiceDeleteRequest) obj;
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
            ((this.subsSvcs==null && other.getSubsSvcs()==null) || 
             (this.subsSvcs!=null &&
              java.util.Arrays.equals(this.subsSvcs, other.getSubsSvcs())));
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
        if (getSubsSvcs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsSvcs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsSvcs(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceDeleteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceDeleteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsSvcs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subsSvcs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberServicesItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subsServicesList"));
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
