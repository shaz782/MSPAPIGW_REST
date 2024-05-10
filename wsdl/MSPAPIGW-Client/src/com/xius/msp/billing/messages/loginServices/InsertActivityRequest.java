/**
 * InsertActivityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class InsertActivityRequest  implements java.io.Serializable {
    private java.lang.String loginID;

    private java.math.BigInteger sessionId;

    private int activityId;

    private java.lang.String inputParams;

    public InsertActivityRequest() {
    }

    public InsertActivityRequest(
           java.lang.String loginID,
           java.math.BigInteger sessionId,
           int activityId,
           java.lang.String inputParams) {
           this.loginID = loginID;
           this.sessionId = sessionId;
           this.activityId = activityId;
           this.inputParams = inputParams;
    }


    /**
     * Gets the loginID value for this InsertActivityRequest.
     * 
     * @return loginID
     */
    public java.lang.String getLoginID() {
        return loginID;
    }


    /**
     * Sets the loginID value for this InsertActivityRequest.
     * 
     * @param loginID
     */
    public void setLoginID(java.lang.String loginID) {
        this.loginID = loginID;
    }


    /**
     * Gets the sessionId value for this InsertActivityRequest.
     * 
     * @return sessionId
     */
    public java.math.BigInteger getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this InsertActivityRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.math.BigInteger sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the activityId value for this InsertActivityRequest.
     * 
     * @return activityId
     */
    public int getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this InsertActivityRequest.
     * 
     * @param activityId
     */
    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the inputParams value for this InsertActivityRequest.
     * 
     * @return inputParams
     */
    public java.lang.String getInputParams() {
        return inputParams;
    }


    /**
     * Sets the inputParams value for this InsertActivityRequest.
     * 
     * @param inputParams
     */
    public void setInputParams(java.lang.String inputParams) {
        this.inputParams = inputParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertActivityRequest)) return false;
        InsertActivityRequest other = (InsertActivityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginID==null && other.getLoginID()==null) || 
             (this.loginID!=null &&
              this.loginID.equals(other.getLoginID()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            this.activityId == other.getActivityId() &&
            ((this.inputParams==null && other.getInputParams()==null) || 
             (this.inputParams!=null &&
              this.inputParams.equals(other.getInputParams())));
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
        if (getLoginID() != null) {
            _hashCode += getLoginID().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += getActivityId();
        if (getInputParams() != null) {
            _hashCode += getInputParams().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertActivityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "InsertActivityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "loginID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "activityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "inputParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
