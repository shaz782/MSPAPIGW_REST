/**
 * NetworkRolesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class NetworkRolesType  implements java.io.Serializable {
    private java.math.BigInteger networkID;

    private java.lang.String roleID;

    private java.lang.String moduleID;

    private java.lang.String privilegeID;

    public NetworkRolesType() {
    }

    public NetworkRolesType(
           java.math.BigInteger networkID,
           java.lang.String roleID,
           java.lang.String moduleID,
           java.lang.String privilegeID) {
           this.networkID = networkID;
           this.roleID = roleID;
           this.moduleID = moduleID;
           this.privilegeID = privilegeID;
    }


    /**
     * Gets the networkID value for this NetworkRolesType.
     * 
     * @return networkID
     */
    public java.math.BigInteger getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this NetworkRolesType.
     * 
     * @param networkID
     */
    public void setNetworkID(java.math.BigInteger networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the roleID value for this NetworkRolesType.
     * 
     * @return roleID
     */
    public java.lang.String getRoleID() {
        return roleID;
    }


    /**
     * Sets the roleID value for this NetworkRolesType.
     * 
     * @param roleID
     */
    public void setRoleID(java.lang.String roleID) {
        this.roleID = roleID;
    }


    /**
     * Gets the moduleID value for this NetworkRolesType.
     * 
     * @return moduleID
     */
    public java.lang.String getModuleID() {
        return moduleID;
    }


    /**
     * Sets the moduleID value for this NetworkRolesType.
     * 
     * @param moduleID
     */
    public void setModuleID(java.lang.String moduleID) {
        this.moduleID = moduleID;
    }


    /**
     * Gets the privilegeID value for this NetworkRolesType.
     * 
     * @return privilegeID
     */
    public java.lang.String getPrivilegeID() {
        return privilegeID;
    }


    /**
     * Sets the privilegeID value for this NetworkRolesType.
     * 
     * @param privilegeID
     */
    public void setPrivilegeID(java.lang.String privilegeID) {
        this.privilegeID = privilegeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkRolesType)) return false;
        NetworkRolesType other = (NetworkRolesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.roleID==null && other.getRoleID()==null) || 
             (this.roleID!=null &&
              this.roleID.equals(other.getRoleID()))) &&
            ((this.moduleID==null && other.getModuleID()==null) || 
             (this.moduleID!=null &&
              this.moduleID.equals(other.getModuleID()))) &&
            ((this.privilegeID==null && other.getPrivilegeID()==null) || 
             (this.privilegeID!=null &&
              this.privilegeID.equals(other.getPrivilegeID())));
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
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getRoleID() != null) {
            _hashCode += getRoleID().hashCode();
        }
        if (getModuleID() != null) {
            _hashCode += getModuleID().hashCode();
        }
        if (getPrivilegeID() != null) {
            _hashCode += getPrivilegeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkRolesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkRolesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "roleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "moduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privilegeID"));
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
