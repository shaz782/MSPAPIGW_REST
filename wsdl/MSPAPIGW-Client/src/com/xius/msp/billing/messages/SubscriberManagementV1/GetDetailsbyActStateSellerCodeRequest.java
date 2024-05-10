/**
 * GetDetailsbyActStateSellerCodeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class GetDetailsbyActStateSellerCodeRequest  implements java.io.Serializable {
    private java.lang.String expEndDate;

    private java.lang.String expStartDate;

    private java.lang.String sellerCode;

    private java.lang.String subStatus;

    public GetDetailsbyActStateSellerCodeRequest() {
    }

    public GetDetailsbyActStateSellerCodeRequest(
           java.lang.String expEndDate,
           java.lang.String expStartDate,
           java.lang.String sellerCode,
           java.lang.String subStatus) {
           this.expEndDate = expEndDate;
           this.expStartDate = expStartDate;
           this.sellerCode = sellerCode;
           this.subStatus = subStatus;
    }


    /**
     * Gets the expEndDate value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @return expEndDate
     */
    public java.lang.String getExpEndDate() {
        return expEndDate;
    }


    /**
     * Sets the expEndDate value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @param expEndDate
     */
    public void setExpEndDate(java.lang.String expEndDate) {
        this.expEndDate = expEndDate;
    }


    /**
     * Gets the expStartDate value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @return expStartDate
     */
    public java.lang.String getExpStartDate() {
        return expStartDate;
    }


    /**
     * Sets the expStartDate value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @param expStartDate
     */
    public void setExpStartDate(java.lang.String expStartDate) {
        this.expStartDate = expStartDate;
    }


    /**
     * Gets the sellerCode value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @return sellerCode
     */
    public java.lang.String getSellerCode() {
        return sellerCode;
    }


    /**
     * Sets the sellerCode value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @param sellerCode
     */
    public void setSellerCode(java.lang.String sellerCode) {
        this.sellerCode = sellerCode;
    }


    /**
     * Gets the subStatus value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @return subStatus
     */
    public java.lang.String getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this GetDetailsbyActStateSellerCodeRequest.
     * 
     * @param subStatus
     */
    public void setSubStatus(java.lang.String subStatus) {
        this.subStatus = subStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDetailsbyActStateSellerCodeRequest)) return false;
        GetDetailsbyActStateSellerCodeRequest other = (GetDetailsbyActStateSellerCodeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expEndDate==null && other.getExpEndDate()==null) || 
             (this.expEndDate!=null &&
              this.expEndDate.equals(other.getExpEndDate()))) &&
            ((this.expStartDate==null && other.getExpStartDate()==null) || 
             (this.expStartDate!=null &&
              this.expStartDate.equals(other.getExpStartDate()))) &&
            ((this.sellerCode==null && other.getSellerCode()==null) || 
             (this.sellerCode!=null &&
              this.sellerCode.equals(other.getSellerCode()))) &&
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus())));
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
        if (getExpEndDate() != null) {
            _hashCode += getExpEndDate().hashCode();
        }
        if (getExpStartDate() != null) {
            _hashCode += getExpStartDate().hashCode();
        }
        if (getSellerCode() != null) {
            _hashCode += getSellerCode().hashCode();
        }
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDetailsbyActStateSellerCodeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetDetailsbyActStateSellerCodeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "expEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "expStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "sellerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "subStatus"));
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
