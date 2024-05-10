/**
 * GetLoginNetworkRolesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetLoginNetworkRolesResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.loginServices.NetworkRolesType[] networkRolesList;

    public GetLoginNetworkRolesResponse() {
    }

    public GetLoginNetworkRolesResponse(
           com.xius.msp.billing.messages.loginServices.NetworkRolesType[] networkRolesList) {
           this.networkRolesList = networkRolesList;
    }


    /**
     * Gets the networkRolesList value for this GetLoginNetworkRolesResponse.
     * 
     * @return networkRolesList
     */
    public com.xius.msp.billing.messages.loginServices.NetworkRolesType[] getNetworkRolesList() {
        return networkRolesList;
    }


    /**
     * Sets the networkRolesList value for this GetLoginNetworkRolesResponse.
     * 
     * @param networkRolesList
     */
    public void setNetworkRolesList(com.xius.msp.billing.messages.loginServices.NetworkRolesType[] networkRolesList) {
        this.networkRolesList = networkRolesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLoginNetworkRolesResponse)) return false;
        GetLoginNetworkRolesResponse other = (GetLoginNetworkRolesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkRolesList==null && other.getNetworkRolesList()==null) || 
             (this.networkRolesList!=null &&
              java.util.Arrays.equals(this.networkRolesList, other.getNetworkRolesList())));
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
        if (getNetworkRolesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkRolesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkRolesList(), i);
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
        new org.apache.axis.description.TypeDesc(GetLoginNetworkRolesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkRolesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkRolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkRolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkRolesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkRoles"));
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
