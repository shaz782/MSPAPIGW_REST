/**
 * IVRReportDtlsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class IVRReportDtlsType  implements java.io.Serializable {
    private java.lang.Long fileId;

    private java.lang.String msisdn;

    private java.lang.String sessionId;

    private java.lang.String serviceId;

    private java.lang.String startTime;

    private java.lang.String stopTime;

    private java.lang.String insertedTime;

    private java.lang.String callDuration;

    public IVRReportDtlsType() {
    }

    public IVRReportDtlsType(
           java.lang.Long fileId,
           java.lang.String msisdn,
           java.lang.String sessionId,
           java.lang.String serviceId,
           java.lang.String startTime,
           java.lang.String stopTime,
           java.lang.String insertedTime,
           java.lang.String callDuration) {
           this.fileId = fileId;
           this.msisdn = msisdn;
           this.sessionId = sessionId;
           this.serviceId = serviceId;
           this.startTime = startTime;
           this.stopTime = stopTime;
           this.insertedTime = insertedTime;
           this.callDuration = callDuration;
    }


    /**
     * Gets the fileId value for this IVRReportDtlsType.
     * 
     * @return fileId
     */
    public java.lang.Long getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this IVRReportDtlsType.
     * 
     * @param fileId
     */
    public void setFileId(java.lang.Long fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the msisdn value for this IVRReportDtlsType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this IVRReportDtlsType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the sessionId value for this IVRReportDtlsType.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this IVRReportDtlsType.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the serviceId value for this IVRReportDtlsType.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this IVRReportDtlsType.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the startTime value for this IVRReportDtlsType.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this IVRReportDtlsType.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the stopTime value for this IVRReportDtlsType.
     * 
     * @return stopTime
     */
    public java.lang.String getStopTime() {
        return stopTime;
    }


    /**
     * Sets the stopTime value for this IVRReportDtlsType.
     * 
     * @param stopTime
     */
    public void setStopTime(java.lang.String stopTime) {
        this.stopTime = stopTime;
    }


    /**
     * Gets the insertedTime value for this IVRReportDtlsType.
     * 
     * @return insertedTime
     */
    public java.lang.String getInsertedTime() {
        return insertedTime;
    }


    /**
     * Sets the insertedTime value for this IVRReportDtlsType.
     * 
     * @param insertedTime
     */
    public void setInsertedTime(java.lang.String insertedTime) {
        this.insertedTime = insertedTime;
    }


    /**
     * Gets the callDuration value for this IVRReportDtlsType.
     * 
     * @return callDuration
     */
    public java.lang.String getCallDuration() {
        return callDuration;
    }


    /**
     * Sets the callDuration value for this IVRReportDtlsType.
     * 
     * @param callDuration
     */
    public void setCallDuration(java.lang.String callDuration) {
        this.callDuration = callDuration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IVRReportDtlsType)) return false;
        IVRReportDtlsType other = (IVRReportDtlsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.stopTime==null && other.getStopTime()==null) || 
             (this.stopTime!=null &&
              this.stopTime.equals(other.getStopTime()))) &&
            ((this.insertedTime==null && other.getInsertedTime()==null) || 
             (this.insertedTime!=null &&
              this.insertedTime.equals(other.getInsertedTime()))) &&
            ((this.callDuration==null && other.getCallDuration()==null) || 
             (this.callDuration!=null &&
              this.callDuration.equals(other.getCallDuration())));
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
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getStopTime() != null) {
            _hashCode += getStopTime().hashCode();
        }
        if (getInsertedTime() != null) {
            _hashCode += getInsertedTime().hashCode();
        }
        if (getCallDuration() != null) {
            _hashCode += getCallDuration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IVRReportDtlsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "IVRReportDtlsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "stopTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "insertedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callDuration"));
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
