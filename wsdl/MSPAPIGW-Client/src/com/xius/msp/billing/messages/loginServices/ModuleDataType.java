/**
 * ModuleDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class ModuleDataType  implements java.io.Serializable {
    private java.lang.String moduleId;

    private java.lang.String moduleName;

    private java.lang.String moduleDesc;

    public ModuleDataType() {
    }

    public ModuleDataType(
           java.lang.String moduleId,
           java.lang.String moduleName,
           java.lang.String moduleDesc) {
           this.moduleId = moduleId;
           this.moduleName = moduleName;
           this.moduleDesc = moduleDesc;
    }


    /**
     * Gets the moduleId value for this ModuleDataType.
     * 
     * @return moduleId
     */
    public java.lang.String getModuleId() {
        return moduleId;
    }


    /**
     * Sets the moduleId value for this ModuleDataType.
     * 
     * @param moduleId
     */
    public void setModuleId(java.lang.String moduleId) {
        this.moduleId = moduleId;
    }


    /**
     * Gets the moduleName value for this ModuleDataType.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this ModuleDataType.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the moduleDesc value for this ModuleDataType.
     * 
     * @return moduleDesc
     */
    public java.lang.String getModuleDesc() {
        return moduleDesc;
    }


    /**
     * Sets the moduleDesc value for this ModuleDataType.
     * 
     * @param moduleDesc
     */
    public void setModuleDesc(java.lang.String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuleDataType)) return false;
        ModuleDataType other = (ModuleDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moduleId==null && other.getModuleId()==null) || 
             (this.moduleId!=null &&
              this.moduleId.equals(other.getModuleId()))) &&
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.moduleDesc==null && other.getModuleDesc()==null) || 
             (this.moduleDesc!=null &&
              this.moduleDesc.equals(other.getModuleDesc())));
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
        if (getModuleId() != null) {
            _hashCode += getModuleId().hashCode();
        }
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getModuleDesc() != null) {
            _hashCode += getModuleDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModuleDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ModuleDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "moduleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "moduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "moduleDesc"));
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
