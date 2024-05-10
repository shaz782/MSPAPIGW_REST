/**
 * GetLoginNetworkDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetLoginNetworkDetailsResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.loginServices.NetworkDetailsType[] networkDetailsList;

    private java.lang.String[] domainDetails;

    private java.lang.String[] imsiList;

    public GetLoginNetworkDetailsResponse() {
    }

    public GetLoginNetworkDetailsResponse(
           com.xius.msp.billing.messages.loginServices.NetworkDetailsType[] networkDetailsList,
           java.lang.String[] domainDetails,
           java.lang.String[] imsiList) {
           this.networkDetailsList = networkDetailsList;
           this.domainDetails = domainDetails;
           this.imsiList = imsiList;
    }


    /**
     * Gets the networkDetailsList value for this GetLoginNetworkDetailsResponse.
     * 
     * @return networkDetailsList
     */
    public com.xius.msp.billing.messages.loginServices.NetworkDetailsType[] getNetworkDetailsList() {
        return networkDetailsList;
    }


    /**
     * Sets the networkDetailsList value for this GetLoginNetworkDetailsResponse.
     * 
     * @param networkDetailsList
     */
    public void setNetworkDetailsList(com.xius.msp.billing.messages.loginServices.NetworkDetailsType[] networkDetailsList) {
        this.networkDetailsList = networkDetailsList;
    }


    /**
     * Gets the domainDetails value for this GetLoginNetworkDetailsResponse.
     * 
     * @return domainDetails
     */
    public java.lang.String[] getDomainDetails() {
        return domainDetails;
    }


    /**
     * Sets the domainDetails value for this GetLoginNetworkDetailsResponse.
     * 
     * @param domainDetails
     */
    public void setDomainDetails(java.lang.String[] domainDetails) {
        this.domainDetails = domainDetails;
    }


    /**
     * Gets the imsiList value for this GetLoginNetworkDetailsResponse.
     * 
     * @return imsiList
     */
    public java.lang.String[] getImsiList() {
        return imsiList;
    }


    /**
     * Sets the imsiList value for this GetLoginNetworkDetailsResponse.
     * 
     * @param imsiList
     */
    public void setImsiList(java.lang.String[] imsiList) {
        this.imsiList = imsiList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLoginNetworkDetailsResponse)) return false;
        GetLoginNetworkDetailsResponse other = (GetLoginNetworkDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkDetailsList==null && other.getNetworkDetailsList()==null) || 
             (this.networkDetailsList!=null &&
              java.util.Arrays.equals(this.networkDetailsList, other.getNetworkDetailsList()))) &&
            ((this.domainDetails==null && other.getDomainDetails()==null) || 
             (this.domainDetails!=null &&
              java.util.Arrays.equals(this.domainDetails, other.getDomainDetails()))) &&
            ((this.imsiList==null && other.getImsiList()==null) || 
             (this.imsiList!=null &&
              java.util.Arrays.equals(this.imsiList, other.getImsiList())));
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
        if (getNetworkDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkDetailsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomainDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImsiList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImsiList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImsiList(), i);
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
        new org.apache.axis.description.TypeDesc(GetLoginNetworkDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "domainDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ip"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsiList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "imsiList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "imsi"));
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
