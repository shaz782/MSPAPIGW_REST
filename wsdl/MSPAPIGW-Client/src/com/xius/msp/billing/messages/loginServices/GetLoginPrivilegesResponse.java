/**
 * GetLoginPrivilegesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetLoginPrivilegesResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.loginServices.IDNameDescType[] modulesList;

    private com.xius.msp.billing.messages.loginServices.IDNameDescType[] privilegesList;

    public GetLoginPrivilegesResponse() {
    }

    public GetLoginPrivilegesResponse(
           com.xius.msp.billing.messages.loginServices.IDNameDescType[] modulesList,
           com.xius.msp.billing.messages.loginServices.IDNameDescType[] privilegesList) {
           this.modulesList = modulesList;
           this.privilegesList = privilegesList;
    }


    /**
     * Gets the modulesList value for this GetLoginPrivilegesResponse.
     * 
     * @return modulesList
     */
    public com.xius.msp.billing.messages.loginServices.IDNameDescType[] getModulesList() {
        return modulesList;
    }


    /**
     * Sets the modulesList value for this GetLoginPrivilegesResponse.
     * 
     * @param modulesList
     */
    public void setModulesList(com.xius.msp.billing.messages.loginServices.IDNameDescType[] modulesList) {
        this.modulesList = modulesList;
    }


    /**
     * Gets the privilegesList value for this GetLoginPrivilegesResponse.
     * 
     * @return privilegesList
     */
    public com.xius.msp.billing.messages.loginServices.IDNameDescType[] getPrivilegesList() {
        return privilegesList;
    }


    /**
     * Sets the privilegesList value for this GetLoginPrivilegesResponse.
     * 
     * @param privilegesList
     */
    public void setPrivilegesList(com.xius.msp.billing.messages.loginServices.IDNameDescType[] privilegesList) {
        this.privilegesList = privilegesList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLoginPrivilegesResponse)) return false;
        GetLoginPrivilegesResponse other = (GetLoginPrivilegesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modulesList==null && other.getModulesList()==null) || 
             (this.modulesList!=null &&
              java.util.Arrays.equals(this.modulesList, other.getModulesList()))) &&
            ((this.privilegesList==null && other.getPrivilegesList()==null) || 
             (this.privilegesList!=null &&
              java.util.Arrays.equals(this.privilegesList, other.getPrivilegesList())));
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
        if (getModulesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModulesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModulesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrivilegesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivilegesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivilegesList(), i);
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
        new org.apache.axis.description.TypeDesc(GetLoginPrivilegesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginPrivilegesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "modulesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDNameDescType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkRoles"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privilegesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDNameDescType"));
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
