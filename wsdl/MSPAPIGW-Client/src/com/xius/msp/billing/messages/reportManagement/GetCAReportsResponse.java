/**
 * GetCAReportsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class GetCAReportsResponse  implements java.io.Serializable {
    private java.lang.Long totalRcrds;

    private com.xius.msp.billing.messages.reportManagement.CAHistoryType[] historyInfo;

    private com.xius.msp.billing.messages.reportManagement.CallDetailsType[] callDetails;

    public GetCAReportsResponse() {
    }

    public GetCAReportsResponse(
           java.lang.Long totalRcrds,
           com.xius.msp.billing.messages.reportManagement.CAHistoryType[] historyInfo,
           com.xius.msp.billing.messages.reportManagement.CallDetailsType[] callDetails) {
           this.totalRcrds = totalRcrds;
           this.historyInfo = historyInfo;
           this.callDetails = callDetails;
    }


    /**
     * Gets the totalRcrds value for this GetCAReportsResponse.
     * 
     * @return totalRcrds
     */
    public java.lang.Long getTotalRcrds() {
        return totalRcrds;
    }


    /**
     * Sets the totalRcrds value for this GetCAReportsResponse.
     * 
     * @param totalRcrds
     */
    public void setTotalRcrds(java.lang.Long totalRcrds) {
        this.totalRcrds = totalRcrds;
    }


    /**
     * Gets the historyInfo value for this GetCAReportsResponse.
     * 
     * @return historyInfo
     */
    public com.xius.msp.billing.messages.reportManagement.CAHistoryType[] getHistoryInfo() {
        return historyInfo;
    }


    /**
     * Sets the historyInfo value for this GetCAReportsResponse.
     * 
     * @param historyInfo
     */
    public void setHistoryInfo(com.xius.msp.billing.messages.reportManagement.CAHistoryType[] historyInfo) {
        this.historyInfo = historyInfo;
    }

    public com.xius.msp.billing.messages.reportManagement.CAHistoryType getHistoryInfo(int i) {
        return this.historyInfo[i];
    }

    public void setHistoryInfo(int i, com.xius.msp.billing.messages.reportManagement.CAHistoryType _value) {
        this.historyInfo[i] = _value;
    }


    /**
     * Gets the callDetails value for this GetCAReportsResponse.
     * 
     * @return callDetails
     */
    public com.xius.msp.billing.messages.reportManagement.CallDetailsType[] getCallDetails() {
        return callDetails;
    }


    /**
     * Sets the callDetails value for this GetCAReportsResponse.
     * 
     * @param callDetails
     */
    public void setCallDetails(com.xius.msp.billing.messages.reportManagement.CallDetailsType[] callDetails) {
        this.callDetails = callDetails;
    }

    public com.xius.msp.billing.messages.reportManagement.CallDetailsType getCallDetails(int i) {
        return this.callDetails[i];
    }

    public void setCallDetails(int i, com.xius.msp.billing.messages.reportManagement.CallDetailsType _value) {
        this.callDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCAReportsResponse)) return false;
        GetCAReportsResponse other = (GetCAReportsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalRcrds==null && other.getTotalRcrds()==null) || 
             (this.totalRcrds!=null &&
              this.totalRcrds.equals(other.getTotalRcrds()))) &&
            ((this.historyInfo==null && other.getHistoryInfo()==null) || 
             (this.historyInfo!=null &&
              java.util.Arrays.equals(this.historyInfo, other.getHistoryInfo()))) &&
            ((this.callDetails==null && other.getCallDetails()==null) || 
             (this.callDetails!=null &&
              java.util.Arrays.equals(this.callDetails, other.getCallDetails())));
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
        if (getTotalRcrds() != null) {
            _hashCode += getTotalRcrds().hashCode();
        }
        if (getHistoryInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoryInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoryInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCallDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallDetails(), i);
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
        new org.apache.axis.description.TypeDesc(GetCAReportsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCAReportsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRcrds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totalRcrds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "historyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CAHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CallDetailsType"));
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
