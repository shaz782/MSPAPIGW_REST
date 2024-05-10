/**
 * TopUpCUGDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class TopUpCUGDataType  implements java.io.Serializable {
    private java.lang.String parentMSISDN;

    private java.math.BigDecimal topUpAmt;

    private java.lang.Long transId;

    private java.lang.Long groupId;

    public TopUpCUGDataType() {
    }

    public TopUpCUGDataType(
           java.lang.String parentMSISDN,
           java.math.BigDecimal topUpAmt,
           java.lang.Long transId,
           java.lang.Long groupId) {
           this.parentMSISDN = parentMSISDN;
           this.topUpAmt = topUpAmt;
           this.transId = transId;
           this.groupId = groupId;
    }


    /**
     * Gets the parentMSISDN value for this TopUpCUGDataType.
     * 
     * @return parentMSISDN
     */
    public java.lang.String getParentMSISDN() {
        return parentMSISDN;
    }


    /**
     * Sets the parentMSISDN value for this TopUpCUGDataType.
     * 
     * @param parentMSISDN
     */
    public void setParentMSISDN(java.lang.String parentMSISDN) {
        this.parentMSISDN = parentMSISDN;
    }


    /**
     * Gets the topUpAmt value for this TopUpCUGDataType.
     * 
     * @return topUpAmt
     */
    public java.math.BigDecimal getTopUpAmt() {
        return topUpAmt;
    }


    /**
     * Sets the topUpAmt value for this TopUpCUGDataType.
     * 
     * @param topUpAmt
     */
    public void setTopUpAmt(java.math.BigDecimal topUpAmt) {
        this.topUpAmt = topUpAmt;
    }


    /**
     * Gets the transId value for this TopUpCUGDataType.
     * 
     * @return transId
     */
    public java.lang.Long getTransId() {
        return transId;
    }


    /**
     * Sets the transId value for this TopUpCUGDataType.
     * 
     * @param transId
     */
    public void setTransId(java.lang.Long transId) {
        this.transId = transId;
    }


    /**
     * Gets the groupId value for this TopUpCUGDataType.
     * 
     * @return groupId
     */
    public java.lang.Long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this TopUpCUGDataType.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Long groupId) {
        this.groupId = groupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopUpCUGDataType)) return false;
        TopUpCUGDataType other = (TopUpCUGDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentMSISDN==null && other.getParentMSISDN()==null) || 
             (this.parentMSISDN!=null &&
              this.parentMSISDN.equals(other.getParentMSISDN()))) &&
            ((this.topUpAmt==null && other.getTopUpAmt()==null) || 
             (this.topUpAmt!=null &&
              this.topUpAmt.equals(other.getTopUpAmt()))) &&
            ((this.transId==null && other.getTransId()==null) || 
             (this.transId!=null &&
              this.transId.equals(other.getTransId()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId())));
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
        if (getParentMSISDN() != null) {
            _hashCode += getParentMSISDN().hashCode();
        }
        if (getTopUpAmt() != null) {
            _hashCode += getTopUpAmt().hashCode();
        }
        if (getTransId() != null) {
            _hashCode += getTransId().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopUpCUGDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "parentMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUpAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "topUpAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "transId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
