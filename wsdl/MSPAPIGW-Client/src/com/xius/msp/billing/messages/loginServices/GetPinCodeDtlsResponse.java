/**
 * GetPinCodeDtlsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetPinCodeDtlsResponse  implements java.io.Serializable {
    private java.lang.String[] postalCodes;

    private java.lang.String[] states;

    private java.lang.String[] cities;

    private java.lang.String[] municipalities;

    private java.lang.String[] colonies;

    public GetPinCodeDtlsResponse() {
    }

    public GetPinCodeDtlsResponse(
           java.lang.String[] postalCodes,
           java.lang.String[] states,
           java.lang.String[] cities,
           java.lang.String[] municipalities,
           java.lang.String[] colonies) {
           this.postalCodes = postalCodes;
           this.states = states;
           this.cities = cities;
           this.municipalities = municipalities;
           this.colonies = colonies;
    }


    /**
     * Gets the postalCodes value for this GetPinCodeDtlsResponse.
     * 
     * @return postalCodes
     */
    public java.lang.String[] getPostalCodes() {
        return postalCodes;
    }


    /**
     * Sets the postalCodes value for this GetPinCodeDtlsResponse.
     * 
     * @param postalCodes
     */
    public void setPostalCodes(java.lang.String[] postalCodes) {
        this.postalCodes = postalCodes;
    }


    /**
     * Gets the states value for this GetPinCodeDtlsResponse.
     * 
     * @return states
     */
    public java.lang.String[] getStates() {
        return states;
    }


    /**
     * Sets the states value for this GetPinCodeDtlsResponse.
     * 
     * @param states
     */
    public void setStates(java.lang.String[] states) {
        this.states = states;
    }


    /**
     * Gets the cities value for this GetPinCodeDtlsResponse.
     * 
     * @return cities
     */
    public java.lang.String[] getCities() {
        return cities;
    }


    /**
     * Sets the cities value for this GetPinCodeDtlsResponse.
     * 
     * @param cities
     */
    public void setCities(java.lang.String[] cities) {
        this.cities = cities;
    }


    /**
     * Gets the municipalities value for this GetPinCodeDtlsResponse.
     * 
     * @return municipalities
     */
    public java.lang.String[] getMunicipalities() {
        return municipalities;
    }


    /**
     * Sets the municipalities value for this GetPinCodeDtlsResponse.
     * 
     * @param municipalities
     */
    public void setMunicipalities(java.lang.String[] municipalities) {
        this.municipalities = municipalities;
    }


    /**
     * Gets the colonies value for this GetPinCodeDtlsResponse.
     * 
     * @return colonies
     */
    public java.lang.String[] getColonies() {
        return colonies;
    }


    /**
     * Sets the colonies value for this GetPinCodeDtlsResponse.
     * 
     * @param colonies
     */
    public void setColonies(java.lang.String[] colonies) {
        this.colonies = colonies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPinCodeDtlsResponse)) return false;
        GetPinCodeDtlsResponse other = (GetPinCodeDtlsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postalCodes==null && other.getPostalCodes()==null) || 
             (this.postalCodes!=null &&
              java.util.Arrays.equals(this.postalCodes, other.getPostalCodes()))) &&
            ((this.states==null && other.getStates()==null) || 
             (this.states!=null &&
              java.util.Arrays.equals(this.states, other.getStates()))) &&
            ((this.cities==null && other.getCities()==null) || 
             (this.cities!=null &&
              java.util.Arrays.equals(this.cities, other.getCities()))) &&
            ((this.municipalities==null && other.getMunicipalities()==null) || 
             (this.municipalities!=null &&
              java.util.Arrays.equals(this.municipalities, other.getMunicipalities()))) &&
            ((this.colonies==null && other.getColonies()==null) || 
             (this.colonies!=null &&
              java.util.Arrays.equals(this.colonies, other.getColonies())));
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
        if (getPostalCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostalCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostalCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMunicipalities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMunicipalities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMunicipalities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColonies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColonies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColonies(), i);
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
        new org.apache.axis.description.TypeDesc(GetPinCodeDtlsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPinCodeDtlsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "postalCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "postalcode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("states");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "states"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "state"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "cities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "city"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipalities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "municipalities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "municipality"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colonies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "colonies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "colony"));
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
