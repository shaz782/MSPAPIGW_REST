/**
 * GetMsisdnbasedATPDtlsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class GetMsisdnbasedATPDtlsRequest  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String[] categoryList;

    public GetMsisdnbasedATPDtlsRequest() {
    }

    public GetMsisdnbasedATPDtlsRequest(
           java.lang.String msisdn,
           java.lang.String[] categoryList) {
           this.msisdn = msisdn;
           this.categoryList = categoryList;
    }


    /**
     * Gets the msisdn value for this GetMsisdnbasedATPDtlsRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this GetMsisdnbasedATPDtlsRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the categoryList value for this GetMsisdnbasedATPDtlsRequest.
     * 
     * @return categoryList
     */
    public java.lang.String[] getCategoryList() {
        return categoryList;
    }


    /**
     * Sets the categoryList value for this GetMsisdnbasedATPDtlsRequest.
     * 
     * @param categoryList
     */
    public void setCategoryList(java.lang.String[] categoryList) {
        this.categoryList = categoryList;
    }

    public java.lang.String getCategoryList(int i) {
        return this.categoryList[i];
    }

    public void setCategoryList(int i, java.lang.String _value) {
        this.categoryList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMsisdnbasedATPDtlsRequest)) return false;
        GetMsisdnbasedATPDtlsRequest other = (GetMsisdnbasedATPDtlsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.categoryList==null && other.getCategoryList()==null) || 
             (this.categoryList!=null &&
              java.util.Arrays.equals(this.categoryList, other.getCategoryList())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getCategoryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryList(), i);
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
        new org.apache.axis.description.TypeDesc(GetMsisdnbasedATPDtlsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnbasedATPDtlsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "CategoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
