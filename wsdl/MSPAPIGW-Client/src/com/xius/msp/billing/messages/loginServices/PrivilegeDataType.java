/**
 * PrivilegeDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class PrivilegeDataType  implements java.io.Serializable {
    private java.lang.String privilegeId;

    private java.lang.String privilegeName;

    private java.lang.String privilegeDesc;

    private java.lang.String moduleId;

    public PrivilegeDataType() {
    }

    public PrivilegeDataType(
           java.lang.String privilegeId,
           java.lang.String privilegeName,
           java.lang.String privilegeDesc,
           java.lang.String moduleId) {
           this.privilegeId = privilegeId;
           this.privilegeName = privilegeName;
           this.privilegeDesc = privilegeDesc;
           this.moduleId = moduleId;
    }


    /**
     * Gets the privilegeId value for this PrivilegeDataType.
     * 
     * @return privilegeId
     */
    public java.lang.String getPrivilegeId() {
        return privilegeId;
    }


    /**
     * Sets the privilegeId value for this PrivilegeDataType.
     * 
     * @param privilegeId
     */
    public void setPrivilegeId(java.lang.String privilegeId) {
        this.privilegeId = privilegeId;
    }


    /**
     * Gets the privilegeName value for this PrivilegeDataType.
     * 
     * @return privilegeName
     */
    public java.lang.String getPrivilegeName() {
        return privilegeName;
    }


    /**
     * Sets the privilegeName value for this PrivilegeDataType.
     * 
     * @param privilegeName
     */
    public void setPrivilegeName(java.lang.String privilegeName) {
        this.privilegeName = privilegeName;
    }


    /**
     * Gets the privilegeDesc value for this PrivilegeDataType.
     * 
     * @return privilegeDesc
     */
    public java.lang.String getPrivilegeDesc() {
        return privilegeDesc;
    }


    /**
     * Sets the privilegeDesc value for this PrivilegeDataType.
     * 
     * @param privilegeDesc
     */
    public void setPrivilegeDesc(java.lang.String privilegeDesc) {
        this.privilegeDesc = privilegeDesc;
    }


    /**
     * Gets the moduleId value for this PrivilegeDataType.
     * 
     * @return moduleId
     */
    public java.lang.String getModuleId() {
        return moduleId;
    }


    /**
     * Sets the moduleId value for this PrivilegeDataType.
     * 
     * @param moduleId
     */
    public void setModuleId(java.lang.String moduleId) {
        this.moduleId = moduleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrivilegeDataType)) return false;
        PrivilegeDataType other = (PrivilegeDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.privilegeId==null && other.getPrivilegeId()==null) || 
             (this.privilegeId!=null &&
              this.privilegeId.equals(other.getPrivilegeId()))) &&
            ((this.privilegeName==null && other.getPrivilegeName()==null) || 
             (this.privilegeName!=null &&
              this.privilegeName.equals(other.getPrivilegeName()))) &&
            ((this.privilegeDesc==null && other.getPrivilegeDesc()==null) || 
             (this.privilegeDesc!=null &&
              this.privilegeDesc.equals(other.getPrivilegeDesc()))) &&
            ((this.moduleId==null && other.getModuleId()==null) || 
             (this.moduleId!=null &&
              this.moduleId.equals(other.getModuleId())));
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
        if (getPrivilegeId() != null) {
            _hashCode += getPrivilegeId().hashCode();
        }
        if (getPrivilegeName() != null) {
            _hashCode += getPrivilegeName().hashCode();
        }
        if (getPrivilegeDesc() != null) {
            _hashCode += getPrivilegeDesc().hashCode();
        }
        if (getModuleId() != null) {
            _hashCode += getModuleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrivilegeDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PrivilegeDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privilegeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privilegeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privilegeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "moduleId"));
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
