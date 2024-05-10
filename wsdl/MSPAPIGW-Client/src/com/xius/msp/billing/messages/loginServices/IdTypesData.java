/**
 * IdTypesData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class IdTypesData  implements java.io.Serializable {
    private java.lang.Long networkId;

    private java.lang.Long idCode;

    private java.lang.String idName;

    private java.lang.String portInYorN;

    private java.lang.String networkDesc;

    public IdTypesData() {
    }

    public IdTypesData(
           java.lang.Long networkId,
           java.lang.Long idCode,
           java.lang.String idName,
           java.lang.String portInYorN,
           java.lang.String networkDesc) {
           this.networkId = networkId;
           this.idCode = idCode;
           this.idName = idName;
           this.portInYorN = portInYorN;
           this.networkDesc = networkDesc;
    }


    /**
     * Gets the networkId value for this IdTypesData.
     * 
     * @return networkId
     */
    public java.lang.Long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this IdTypesData.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.Long networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the idCode value for this IdTypesData.
     * 
     * @return idCode
     */
    public java.lang.Long getIdCode() {
        return idCode;
    }


    /**
     * Sets the idCode value for this IdTypesData.
     * 
     * @param idCode
     */
    public void setIdCode(java.lang.Long idCode) {
        this.idCode = idCode;
    }


    /**
     * Gets the idName value for this IdTypesData.
     * 
     * @return idName
     */
    public java.lang.String getIdName() {
        return idName;
    }


    /**
     * Sets the idName value for this IdTypesData.
     * 
     * @param idName
     */
    public void setIdName(java.lang.String idName) {
        this.idName = idName;
    }


    /**
     * Gets the portInYorN value for this IdTypesData.
     * 
     * @return portInYorN
     */
    public java.lang.String getPortInYorN() {
        return portInYorN;
    }


    /**
     * Sets the portInYorN value for this IdTypesData.
     * 
     * @param portInYorN
     */
    public void setPortInYorN(java.lang.String portInYorN) {
        this.portInYorN = portInYorN;
    }


    /**
     * Gets the networkDesc value for this IdTypesData.
     * 
     * @return networkDesc
     */
    public java.lang.String getNetworkDesc() {
        return networkDesc;
    }


    /**
     * Sets the networkDesc value for this IdTypesData.
     * 
     * @param networkDesc
     */
    public void setNetworkDesc(java.lang.String networkDesc) {
        this.networkDesc = networkDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdTypesData)) return false;
        IdTypesData other = (IdTypesData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.idCode==null && other.getIdCode()==null) || 
             (this.idCode!=null &&
              this.idCode.equals(other.getIdCode()))) &&
            ((this.idName==null && other.getIdName()==null) || 
             (this.idName!=null &&
              this.idName.equals(other.getIdName()))) &&
            ((this.portInYorN==null && other.getPortInYorN()==null) || 
             (this.portInYorN!=null &&
              this.portInYorN.equals(other.getPortInYorN()))) &&
            ((this.networkDesc==null && other.getNetworkDesc()==null) || 
             (this.networkDesc!=null &&
              this.networkDesc.equals(other.getNetworkDesc())));
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
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getIdCode() != null) {
            _hashCode += getIdCode().hashCode();
        }
        if (getIdName() != null) {
            _hashCode += getIdName().hashCode();
        }
        if (getPortInYorN() != null) {
            _hashCode += getPortInYorN().hashCode();
        }
        if (getNetworkDesc() != null) {
            _hashCode += getNetworkDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdTypesData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IdTypesData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "idCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "idName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portInYorN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "portInYorN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkDesc"));
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
