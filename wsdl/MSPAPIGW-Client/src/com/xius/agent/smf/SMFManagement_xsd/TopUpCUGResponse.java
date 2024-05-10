/**
 * TopUpCUGResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class TopUpCUGResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String[] successMSISDNs;

    private java.lang.String[] failedMSISDN;

    public TopUpCUGResponse() {
    }

    public TopUpCUGResponse(
           java.lang.String message,
           java.lang.String[] successMSISDNs,
           java.lang.String[] failedMSISDN) {
           this.message = message;
           this.successMSISDNs = successMSISDNs;
           this.failedMSISDN = failedMSISDN;
    }


    /**
     * Gets the message value for this TopUpCUGResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TopUpCUGResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the successMSISDNs value for this TopUpCUGResponse.
     * 
     * @return successMSISDNs
     */
    public java.lang.String[] getSuccessMSISDNs() {
        return successMSISDNs;
    }


    /**
     * Sets the successMSISDNs value for this TopUpCUGResponse.
     * 
     * @param successMSISDNs
     */
    public void setSuccessMSISDNs(java.lang.String[] successMSISDNs) {
        this.successMSISDNs = successMSISDNs;
    }

    public java.lang.String getSuccessMSISDNs(int i) {
        return this.successMSISDNs[i];
    }

    public void setSuccessMSISDNs(int i, java.lang.String _value) {
        this.successMSISDNs[i] = _value;
    }


    /**
     * Gets the failedMSISDN value for this TopUpCUGResponse.
     * 
     * @return failedMSISDN
     */
    public java.lang.String[] getFailedMSISDN() {
        return failedMSISDN;
    }


    /**
     * Sets the failedMSISDN value for this TopUpCUGResponse.
     * 
     * @param failedMSISDN
     */
    public void setFailedMSISDN(java.lang.String[] failedMSISDN) {
        this.failedMSISDN = failedMSISDN;
    }

    public java.lang.String getFailedMSISDN(int i) {
        return this.failedMSISDN[i];
    }

    public void setFailedMSISDN(int i, java.lang.String _value) {
        this.failedMSISDN[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopUpCUGResponse)) return false;
        TopUpCUGResponse other = (TopUpCUGResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.successMSISDNs==null && other.getSuccessMSISDNs()==null) || 
             (this.successMSISDNs!=null &&
              java.util.Arrays.equals(this.successMSISDNs, other.getSuccessMSISDNs()))) &&
            ((this.failedMSISDN==null && other.getFailedMSISDN()==null) || 
             (this.failedMSISDN!=null &&
              java.util.Arrays.equals(this.failedMSISDN, other.getFailedMSISDN())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getSuccessMSISDNs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessMSISDNs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessMSISDNs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedMSISDN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedMSISDN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedMSISDN(), i);
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
        new org.apache.axis.description.TypeDesc(TopUpCUGResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successMSISDNs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "successMSISDNs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDNType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "failedMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDNType"));
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
