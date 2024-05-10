/**
 * UploadSubTransDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.SubscriberManagement;

public class UploadSubTransDetailsRequest  implements java.io.Serializable {
    private java.lang.String[] subTransDetails;

    private java.lang.String networkName;

    private java.lang.String userType;

    public UploadSubTransDetailsRequest() {
    }

    public UploadSubTransDetailsRequest(
           java.lang.String[] subTransDetails,
           java.lang.String networkName,
           java.lang.String userType) {
           this.subTransDetails = subTransDetails;
           this.networkName = networkName;
           this.userType = userType;
    }


    /**
     * Gets the subTransDetails value for this UploadSubTransDetailsRequest.
     * 
     * @return subTransDetails
     */
    public java.lang.String[] getSubTransDetails() {
        return subTransDetails;
    }


    /**
     * Sets the subTransDetails value for this UploadSubTransDetailsRequest.
     * 
     * @param subTransDetails
     */
    public void setSubTransDetails(java.lang.String[] subTransDetails) {
        this.subTransDetails = subTransDetails;
    }


    /**
     * Gets the networkName value for this UploadSubTransDetailsRequest.
     * 
     * @return networkName
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this UploadSubTransDetailsRequest.
     * 
     * @param networkName
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }


    /**
     * Gets the userType value for this UploadSubTransDetailsRequest.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this UploadSubTransDetailsRequest.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadSubTransDetailsRequest)) return false;
        UploadSubTransDetailsRequest other = (UploadSubTransDetailsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subTransDetails==null && other.getSubTransDetails()==null) || 
             (this.subTransDetails!=null &&
              java.util.Arrays.equals(this.subTransDetails, other.getSubTransDetails()))) &&
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType())));
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
        if (getSubTransDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubTransDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubTransDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadSubTransDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UploadSubTransDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTransDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "subTransDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "CommaSeparatedSubTransList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "userType"));
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
