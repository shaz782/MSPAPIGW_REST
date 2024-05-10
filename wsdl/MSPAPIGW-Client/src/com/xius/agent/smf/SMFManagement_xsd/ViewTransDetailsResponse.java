/**
 * ViewTransDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class ViewTransDetailsResponse  implements java.io.Serializable {
    private com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsListType[] viewTransDetailsList;

    private java.lang.String[] dispensedSIMSList;

    public ViewTransDetailsResponse() {
    }

    public ViewTransDetailsResponse(
           com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsListType[] viewTransDetailsList,
           java.lang.String[] dispensedSIMSList) {
           this.viewTransDetailsList = viewTransDetailsList;
           this.dispensedSIMSList = dispensedSIMSList;
    }


    /**
     * Gets the viewTransDetailsList value for this ViewTransDetailsResponse.
     * 
     * @return viewTransDetailsList
     */
    public com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsListType[] getViewTransDetailsList() {
        return viewTransDetailsList;
    }


    /**
     * Sets the viewTransDetailsList value for this ViewTransDetailsResponse.
     * 
     * @param viewTransDetailsList
     */
    public void setViewTransDetailsList(com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsListType[] viewTransDetailsList) {
        this.viewTransDetailsList = viewTransDetailsList;
    }

    public com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsListType getViewTransDetailsList(int i) {
        return this.viewTransDetailsList[i];
    }

    public void setViewTransDetailsList(int i, com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsListType _value) {
        this.viewTransDetailsList[i] = _value;
    }


    /**
     * Gets the dispensedSIMSList value for this ViewTransDetailsResponse.
     * 
     * @return dispensedSIMSList
     */
    public java.lang.String[] getDispensedSIMSList() {
        return dispensedSIMSList;
    }


    /**
     * Sets the dispensedSIMSList value for this ViewTransDetailsResponse.
     * 
     * @param dispensedSIMSList
     */
    public void setDispensedSIMSList(java.lang.String[] dispensedSIMSList) {
        this.dispensedSIMSList = dispensedSIMSList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ViewTransDetailsResponse)) return false;
        ViewTransDetailsResponse other = (ViewTransDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viewTransDetailsList==null && other.getViewTransDetailsList()==null) || 
             (this.viewTransDetailsList!=null &&
              java.util.Arrays.equals(this.viewTransDetailsList, other.getViewTransDetailsList()))) &&
            ((this.dispensedSIMSList==null && other.getDispensedSIMSList()==null) || 
             (this.dispensedSIMSList!=null &&
              java.util.Arrays.equals(this.dispensedSIMSList, other.getDispensedSIMSList())));
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
        if (getViewTransDetailsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViewTransDetailsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViewTransDetailsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDispensedSIMSList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDispensedSIMSList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDispensedSIMSList(), i);
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
        new org.apache.axis.description.TypeDesc(ViewTransDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewTransDetailsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispensedSIMSList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DispensedSIMSList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "CommaSeparatedSIMSList"));
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
