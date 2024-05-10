/**
 * GetLoginRolesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetLoginRolesResponse  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String managerID;

    private java.lang.String[] rolesList;

    private java.math.BigInteger networkID;

    private java.lang.Integer rolesCount;

    public GetLoginRolesResponse() {
    }

    public GetLoginRolesResponse(
           java.lang.String status,
           java.lang.String managerID,
           java.lang.String[] rolesList,
           java.math.BigInteger networkID,
           java.lang.Integer rolesCount) {
           this.status = status;
           this.managerID = managerID;
           this.rolesList = rolesList;
           this.networkID = networkID;
           this.rolesCount = rolesCount;
    }


    /**
     * Gets the status value for this GetLoginRolesResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetLoginRolesResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the managerID value for this GetLoginRolesResponse.
     * 
     * @return managerID
     */
    public java.lang.String getManagerID() {
        return managerID;
    }


    /**
     * Sets the managerID value for this GetLoginRolesResponse.
     * 
     * @param managerID
     */
    public void setManagerID(java.lang.String managerID) {
        this.managerID = managerID;
    }


    /**
     * Gets the rolesList value for this GetLoginRolesResponse.
     * 
     * @return rolesList
     */
    public java.lang.String[] getRolesList() {
        return rolesList;
    }


    /**
     * Sets the rolesList value for this GetLoginRolesResponse.
     * 
     * @param rolesList
     */
    public void setRolesList(java.lang.String[] rolesList) {
        this.rolesList = rolesList;
    }


    /**
     * Gets the networkID value for this GetLoginRolesResponse.
     * 
     * @return networkID
     */
    public java.math.BigInteger getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this GetLoginRolesResponse.
     * 
     * @param networkID
     */
    public void setNetworkID(java.math.BigInteger networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the rolesCount value for this GetLoginRolesResponse.
     * 
     * @return rolesCount
     */
    public java.lang.Integer getRolesCount() {
        return rolesCount;
    }


    /**
     * Sets the rolesCount value for this GetLoginRolesResponse.
     * 
     * @param rolesCount
     */
    public void setRolesCount(java.lang.Integer rolesCount) {
        this.rolesCount = rolesCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLoginRolesResponse)) return false;
        GetLoginRolesResponse other = (GetLoginRolesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.managerID==null && other.getManagerID()==null) || 
             (this.managerID!=null &&
              this.managerID.equals(other.getManagerID()))) &&
            ((this.rolesList==null && other.getRolesList()==null) || 
             (this.rolesList!=null &&
              java.util.Arrays.equals(this.rolesList, other.getRolesList()))) &&
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.rolesCount==null && other.getRolesCount()==null) || 
             (this.rolesCount!=null &&
              this.rolesCount.equals(other.getRolesCount())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getManagerID() != null) {
            _hashCode += getManagerID().hashCode();
        }
        if (getRolesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRolesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRolesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getRolesCount() != null) {
            _hashCode += getRolesCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLoginRolesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginRolesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "managerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "rolesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "id"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "rolesCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
