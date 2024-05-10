/**
 * GetCorpSimStatusReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetCorpSimStatusReportResponse  implements java.io.Serializable {
    private java.lang.Long errorCode;

    private java.lang.String errorDesc;

    private com.xius.msp.billing.messages.reportManagement.SimStockDtls[] simStockDtls;

    public GetCorpSimStatusReportResponse() {
    }

    public GetCorpSimStatusReportResponse(
           java.lang.Long errorCode,
           java.lang.String errorDesc,
           com.xius.msp.billing.messages.reportManagement.SimStockDtls[] simStockDtls) {
           this.errorCode = errorCode;
           this.errorDesc = errorDesc;
           this.simStockDtls = simStockDtls;
    }


    /**
     * Gets the errorCode value for this GetCorpSimStatusReportResponse.
     * 
     * @return errorCode
     */
    public java.lang.Long getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetCorpSimStatusReportResponse.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.Long errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorDesc value for this GetCorpSimStatusReportResponse.
     * 
     * @return errorDesc
     */
    public java.lang.String getErrorDesc() {
        return errorDesc;
    }


    /**
     * Sets the errorDesc value for this GetCorpSimStatusReportResponse.
     * 
     * @param errorDesc
     */
    public void setErrorDesc(java.lang.String errorDesc) {
        this.errorDesc = errorDesc;
    }


    /**
     * Gets the simStockDtls value for this GetCorpSimStatusReportResponse.
     * 
     * @return simStockDtls
     */
    public com.xius.msp.billing.messages.reportManagement.SimStockDtls[] getSimStockDtls() {
        return simStockDtls;
    }


    /**
     * Sets the simStockDtls value for this GetCorpSimStatusReportResponse.
     * 
     * @param simStockDtls
     */
    public void setSimStockDtls(com.xius.msp.billing.messages.reportManagement.SimStockDtls[] simStockDtls) {
        this.simStockDtls = simStockDtls;
    }

    public com.xius.msp.billing.messages.reportManagement.SimStockDtls getSimStockDtls(int i) {
        return this.simStockDtls[i];
    }

    public void setSimStockDtls(int i, com.xius.msp.billing.messages.reportManagement.SimStockDtls _value) {
        this.simStockDtls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCorpSimStatusReportResponse)) return false;
        GetCorpSimStatusReportResponse other = (GetCorpSimStatusReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorDesc==null && other.getErrorDesc()==null) || 
             (this.errorDesc!=null &&
              this.errorDesc.equals(other.getErrorDesc()))) &&
            ((this.simStockDtls==null && other.getSimStockDtls()==null) || 
             (this.simStockDtls!=null &&
              java.util.Arrays.equals(this.simStockDtls, other.getSimStockDtls())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorDesc() != null) {
            _hashCode += getErrorDesc().hashCode();
        }
        if (getSimStockDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimStockDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimStockDtls(), i);
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
        new org.apache.axis.description.TypeDesc(GetCorpSimStatusReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimStatusReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "errorDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simStockDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simStockDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimStockDtls"));
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
