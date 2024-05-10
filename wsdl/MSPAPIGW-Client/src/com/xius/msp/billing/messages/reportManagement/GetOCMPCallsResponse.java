/**
 * GetOCMPCallsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetOCMPCallsResponse  implements java.io.Serializable {
    private java.lang.String maxCount;

    private com.xius.msp.billing.messages.reportManagement.IVRReportDtlsType[] IVRReportDtls;

    public GetOCMPCallsResponse() {
    }

    public GetOCMPCallsResponse(
           java.lang.String maxCount,
           com.xius.msp.billing.messages.reportManagement.IVRReportDtlsType[] IVRReportDtls) {
           this.maxCount = maxCount;
           this.IVRReportDtls = IVRReportDtls;
    }


    /**
     * Gets the maxCount value for this GetOCMPCallsResponse.
     * 
     * @return maxCount
     */
    public java.lang.String getMaxCount() {
        return maxCount;
    }


    /**
     * Sets the maxCount value for this GetOCMPCallsResponse.
     * 
     * @param maxCount
     */
    public void setMaxCount(java.lang.String maxCount) {
        this.maxCount = maxCount;
    }


    /**
     * Gets the IVRReportDtls value for this GetOCMPCallsResponse.
     * 
     * @return IVRReportDtls
     */
    public com.xius.msp.billing.messages.reportManagement.IVRReportDtlsType[] getIVRReportDtls() {
        return IVRReportDtls;
    }


    /**
     * Sets the IVRReportDtls value for this GetOCMPCallsResponse.
     * 
     * @param IVRReportDtls
     */
    public void setIVRReportDtls(com.xius.msp.billing.messages.reportManagement.IVRReportDtlsType[] IVRReportDtls) {
        this.IVRReportDtls = IVRReportDtls;
    }

    public com.xius.msp.billing.messages.reportManagement.IVRReportDtlsType getIVRReportDtls(int i) {
        return this.IVRReportDtls[i];
    }

    public void setIVRReportDtls(int i, com.xius.msp.billing.messages.reportManagement.IVRReportDtlsType _value) {
        this.IVRReportDtls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOCMPCallsResponse)) return false;
        GetOCMPCallsResponse other = (GetOCMPCallsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxCount==null && other.getMaxCount()==null) || 
             (this.maxCount!=null &&
              this.maxCount.equals(other.getMaxCount()))) &&
            ((this.IVRReportDtls==null && other.getIVRReportDtls()==null) || 
             (this.IVRReportDtls!=null &&
              java.util.Arrays.equals(this.IVRReportDtls, other.getIVRReportDtls())));
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
        if (getMaxCount() != null) {
            _hashCode += getMaxCount().hashCode();
        }
        if (getIVRReportDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIVRReportDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIVRReportDtls(), i);
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
        new org.apache.axis.description.TypeDesc(GetOCMPCallsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getOCMPCallsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "maxCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVRReportDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "IVRReportDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "IVRReportDtlsType"));
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
