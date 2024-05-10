/**
 * Roamingdtlstype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class Roamingdtlstype  implements java.io.Serializable {
    private java.lang.String service;

    private java.lang.String baseIdsDerivdIds;

    private java.lang.String ATPIDs;

    private java.lang.String chargeIDs;

    private java.lang.String publicityIDs;

    private java.lang.String activationfees;

    private java.lang.String ATPUniqueID;

    public Roamingdtlstype() {
    }

    public Roamingdtlstype(
           java.lang.String service,
           java.lang.String baseIdsDerivdIds,
           java.lang.String ATPIDs,
           java.lang.String chargeIDs,
           java.lang.String publicityIDs,
           java.lang.String activationfees,
           java.lang.String ATPUniqueID) {
           this.service = service;
           this.baseIdsDerivdIds = baseIdsDerivdIds;
           this.ATPIDs = ATPIDs;
           this.chargeIDs = chargeIDs;
           this.publicityIDs = publicityIDs;
           this.activationfees = activationfees;
           this.ATPUniqueID = ATPUniqueID;
    }


    /**
     * Gets the service value for this Roamingdtlstype.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this Roamingdtlstype.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the baseIdsDerivdIds value for this Roamingdtlstype.
     * 
     * @return baseIdsDerivdIds
     */
    public java.lang.String getBaseIdsDerivdIds() {
        return baseIdsDerivdIds;
    }


    /**
     * Sets the baseIdsDerivdIds value for this Roamingdtlstype.
     * 
     * @param baseIdsDerivdIds
     */
    public void setBaseIdsDerivdIds(java.lang.String baseIdsDerivdIds) {
        this.baseIdsDerivdIds = baseIdsDerivdIds;
    }


    /**
     * Gets the ATPIDs value for this Roamingdtlstype.
     * 
     * @return ATPIDs
     */
    public java.lang.String getATPIDs() {
        return ATPIDs;
    }


    /**
     * Sets the ATPIDs value for this Roamingdtlstype.
     * 
     * @param ATPIDs
     */
    public void setATPIDs(java.lang.String ATPIDs) {
        this.ATPIDs = ATPIDs;
    }


    /**
     * Gets the chargeIDs value for this Roamingdtlstype.
     * 
     * @return chargeIDs
     */
    public java.lang.String getChargeIDs() {
        return chargeIDs;
    }


    /**
     * Sets the chargeIDs value for this Roamingdtlstype.
     * 
     * @param chargeIDs
     */
    public void setChargeIDs(java.lang.String chargeIDs) {
        this.chargeIDs = chargeIDs;
    }


    /**
     * Gets the publicityIDs value for this Roamingdtlstype.
     * 
     * @return publicityIDs
     */
    public java.lang.String getPublicityIDs() {
        return publicityIDs;
    }


    /**
     * Sets the publicityIDs value for this Roamingdtlstype.
     * 
     * @param publicityIDs
     */
    public void setPublicityIDs(java.lang.String publicityIDs) {
        this.publicityIDs = publicityIDs;
    }


    /**
     * Gets the activationfees value for this Roamingdtlstype.
     * 
     * @return activationfees
     */
    public java.lang.String getActivationfees() {
        return activationfees;
    }


    /**
     * Sets the activationfees value for this Roamingdtlstype.
     * 
     * @param activationfees
     */
    public void setActivationfees(java.lang.String activationfees) {
        this.activationfees = activationfees;
    }


    /**
     * Gets the ATPUniqueID value for this Roamingdtlstype.
     * 
     * @return ATPUniqueID
     */
    public java.lang.String getATPUniqueID() {
        return ATPUniqueID;
    }


    /**
     * Sets the ATPUniqueID value for this Roamingdtlstype.
     * 
     * @param ATPUniqueID
     */
    public void setATPUniqueID(java.lang.String ATPUniqueID) {
        this.ATPUniqueID = ATPUniqueID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Roamingdtlstype)) return false;
        Roamingdtlstype other = (Roamingdtlstype) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.baseIdsDerivdIds==null && other.getBaseIdsDerivdIds()==null) || 
             (this.baseIdsDerivdIds!=null &&
              this.baseIdsDerivdIds.equals(other.getBaseIdsDerivdIds()))) &&
            ((this.ATPIDs==null && other.getATPIDs()==null) || 
             (this.ATPIDs!=null &&
              this.ATPIDs.equals(other.getATPIDs()))) &&
            ((this.chargeIDs==null && other.getChargeIDs()==null) || 
             (this.chargeIDs!=null &&
              this.chargeIDs.equals(other.getChargeIDs()))) &&
            ((this.publicityIDs==null && other.getPublicityIDs()==null) || 
             (this.publicityIDs!=null &&
              this.publicityIDs.equals(other.getPublicityIDs()))) &&
            ((this.activationfees==null && other.getActivationfees()==null) || 
             (this.activationfees!=null &&
              this.activationfees.equals(other.getActivationfees()))) &&
            ((this.ATPUniqueID==null && other.getATPUniqueID()==null) || 
             (this.ATPUniqueID!=null &&
              this.ATPUniqueID.equals(other.getATPUniqueID())));
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
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getBaseIdsDerivdIds() != null) {
            _hashCode += getBaseIdsDerivdIds().hashCode();
        }
        if (getATPIDs() != null) {
            _hashCode += getATPIDs().hashCode();
        }
        if (getChargeIDs() != null) {
            _hashCode += getChargeIDs().hashCode();
        }
        if (getPublicityIDs() != null) {
            _hashCode += getPublicityIDs().hashCode();
        }
        if (getActivationfees() != null) {
            _hashCode += getActivationfees().hashCode();
        }
        if (getATPUniqueID() != null) {
            _hashCode += getATPUniqueID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Roamingdtlstype.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "roamingdtlstype"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseIdsDerivdIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "baseIdsDerivdIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "chargeIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicityIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "publicityIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationfees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "activationfees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATPUniqueID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPUniqueID"));
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
