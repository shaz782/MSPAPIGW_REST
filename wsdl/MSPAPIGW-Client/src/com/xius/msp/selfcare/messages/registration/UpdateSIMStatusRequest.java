/**
 * UpdateSIMStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class UpdateSIMStatusRequest  implements java.io.Serializable {
    private java.lang.String sim;

    private java.lang.String IDType;

    private java.lang.String dummyID;

    private java.lang.String actualID;

    private java.lang.String transStatus;

    private java.lang.String SIMStatus;

    private java.lang.String transNO;

    private java.lang.String msisdn;

    public UpdateSIMStatusRequest() {
    }

    public UpdateSIMStatusRequest(
           java.lang.String sim,
           java.lang.String IDType,
           java.lang.String dummyID,
           java.lang.String actualID,
           java.lang.String transStatus,
           java.lang.String SIMStatus,
           java.lang.String transNO,
           java.lang.String msisdn) {
           this.sim = sim;
           this.IDType = IDType;
           this.dummyID = dummyID;
           this.actualID = actualID;
           this.transStatus = transStatus;
           this.SIMStatus = SIMStatus;
           this.transNO = transNO;
           this.msisdn = msisdn;
    }


    /**
     * Gets the sim value for this UpdateSIMStatusRequest.
     * 
     * @return sim
     */
    public java.lang.String getSim() {
        return sim;
    }


    /**
     * Sets the sim value for this UpdateSIMStatusRequest.
     * 
     * @param sim
     */
    public void setSim(java.lang.String sim) {
        this.sim = sim;
    }


    /**
     * Gets the IDType value for this UpdateSIMStatusRequest.
     * 
     * @return IDType
     */
    public java.lang.String getIDType() {
        return IDType;
    }


    /**
     * Sets the IDType value for this UpdateSIMStatusRequest.
     * 
     * @param IDType
     */
    public void setIDType(java.lang.String IDType) {
        this.IDType = IDType;
    }


    /**
     * Gets the dummyID value for this UpdateSIMStatusRequest.
     * 
     * @return dummyID
     */
    public java.lang.String getDummyID() {
        return dummyID;
    }


    /**
     * Sets the dummyID value for this UpdateSIMStatusRequest.
     * 
     * @param dummyID
     */
    public void setDummyID(java.lang.String dummyID) {
        this.dummyID = dummyID;
    }


    /**
     * Gets the actualID value for this UpdateSIMStatusRequest.
     * 
     * @return actualID
     */
    public java.lang.String getActualID() {
        return actualID;
    }


    /**
     * Sets the actualID value for this UpdateSIMStatusRequest.
     * 
     * @param actualID
     */
    public void setActualID(java.lang.String actualID) {
        this.actualID = actualID;
    }


    /**
     * Gets the transStatus value for this UpdateSIMStatusRequest.
     * 
     * @return transStatus
     */
    public java.lang.String getTransStatus() {
        return transStatus;
    }


    /**
     * Sets the transStatus value for this UpdateSIMStatusRequest.
     * 
     * @param transStatus
     */
    public void setTransStatus(java.lang.String transStatus) {
        this.transStatus = transStatus;
    }


    /**
     * Gets the SIMStatus value for this UpdateSIMStatusRequest.
     * 
     * @return SIMStatus
     */
    public java.lang.String getSIMStatus() {
        return SIMStatus;
    }


    /**
     * Sets the SIMStatus value for this UpdateSIMStatusRequest.
     * 
     * @param SIMStatus
     */
    public void setSIMStatus(java.lang.String SIMStatus) {
        this.SIMStatus = SIMStatus;
    }


    /**
     * Gets the transNO value for this UpdateSIMStatusRequest.
     * 
     * @return transNO
     */
    public java.lang.String getTransNO() {
        return transNO;
    }


    /**
     * Sets the transNO value for this UpdateSIMStatusRequest.
     * 
     * @param transNO
     */
    public void setTransNO(java.lang.String transNO) {
        this.transNO = transNO;
    }


    /**
     * Gets the msisdn value for this UpdateSIMStatusRequest.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this UpdateSIMStatusRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSIMStatusRequest)) return false;
        UpdateSIMStatusRequest other = (UpdateSIMStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sim==null && other.getSim()==null) || 
             (this.sim!=null &&
              this.sim.equals(other.getSim()))) &&
            ((this.IDType==null && other.getIDType()==null) || 
             (this.IDType!=null &&
              this.IDType.equals(other.getIDType()))) &&
            ((this.dummyID==null && other.getDummyID()==null) || 
             (this.dummyID!=null &&
              this.dummyID.equals(other.getDummyID()))) &&
            ((this.actualID==null && other.getActualID()==null) || 
             (this.actualID!=null &&
              this.actualID.equals(other.getActualID()))) &&
            ((this.transStatus==null && other.getTransStatus()==null) || 
             (this.transStatus!=null &&
              this.transStatus.equals(other.getTransStatus()))) &&
            ((this.SIMStatus==null && other.getSIMStatus()==null) || 
             (this.SIMStatus!=null &&
              this.SIMStatus.equals(other.getSIMStatus()))) &&
            ((this.transNO==null && other.getTransNO()==null) || 
             (this.transNO!=null &&
              this.transNO.equals(other.getTransNO()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn())));
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
        if (getSim() != null) {
            _hashCode += getSim().hashCode();
        }
        if (getIDType() != null) {
            _hashCode += getIDType().hashCode();
        }
        if (getDummyID() != null) {
            _hashCode += getDummyID().hashCode();
        }
        if (getActualID() != null) {
            _hashCode += getActualID().hashCode();
        }
        if (getTransStatus() != null) {
            _hashCode += getTransStatus().hashCode();
        }
        if (getSIMStatus() != null) {
            _hashCode += getSIMStatus().hashCode();
        }
        if (getTransNO() != null) {
            _hashCode += getTransNO().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSIMStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "UpdateSIMStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "sim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "IDType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dummyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "dummyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "actualID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "transStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "SIMStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "transNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", "msisdn"));
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
