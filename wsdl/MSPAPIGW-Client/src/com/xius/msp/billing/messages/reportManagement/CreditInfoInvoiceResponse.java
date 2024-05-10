/**
 * CreditInfoInvoiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class CreditInfoInvoiceResponse  implements java.io.Serializable {
    private java.lang.String message;

    private com.xius.msp.billing.messages.reportManagement.Invoice[] invoiceCursor;

    private com.xius.msp.billing.messages.reportManagement.Invoice[] charityInvoiceCursor;

    private com.xius.msp.billing.messages.reportManagement.Invoice[] roamingInvoiceCursor;

    private com.xius.msp.billing.messages.reportManagement.Invoice[] airtimeTrsfrInvoiceCursor;

    public CreditInfoInvoiceResponse() {
    }

    public CreditInfoInvoiceResponse(
           java.lang.String message,
           com.xius.msp.billing.messages.reportManagement.Invoice[] invoiceCursor,
           com.xius.msp.billing.messages.reportManagement.Invoice[] charityInvoiceCursor,
           com.xius.msp.billing.messages.reportManagement.Invoice[] roamingInvoiceCursor,
           com.xius.msp.billing.messages.reportManagement.Invoice[] airtimeTrsfrInvoiceCursor) {
           this.message = message;
           this.invoiceCursor = invoiceCursor;
           this.charityInvoiceCursor = charityInvoiceCursor;
           this.roamingInvoiceCursor = roamingInvoiceCursor;
           this.airtimeTrsfrInvoiceCursor = airtimeTrsfrInvoiceCursor;
    }


    /**
     * Gets the message value for this CreditInfoInvoiceResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CreditInfoInvoiceResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the invoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @return invoiceCursor
     */
    public com.xius.msp.billing.messages.reportManagement.Invoice[] getInvoiceCursor() {
        return invoiceCursor;
    }


    /**
     * Sets the invoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @param invoiceCursor
     */
    public void setInvoiceCursor(com.xius.msp.billing.messages.reportManagement.Invoice[] invoiceCursor) {
        this.invoiceCursor = invoiceCursor;
    }


    /**
     * Gets the charityInvoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @return charityInvoiceCursor
     */
    public com.xius.msp.billing.messages.reportManagement.Invoice[] getCharityInvoiceCursor() {
        return charityInvoiceCursor;
    }


    /**
     * Sets the charityInvoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @param charityInvoiceCursor
     */
    public void setCharityInvoiceCursor(com.xius.msp.billing.messages.reportManagement.Invoice[] charityInvoiceCursor) {
        this.charityInvoiceCursor = charityInvoiceCursor;
    }


    /**
     * Gets the roamingInvoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @return roamingInvoiceCursor
     */
    public com.xius.msp.billing.messages.reportManagement.Invoice[] getRoamingInvoiceCursor() {
        return roamingInvoiceCursor;
    }


    /**
     * Sets the roamingInvoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @param roamingInvoiceCursor
     */
    public void setRoamingInvoiceCursor(com.xius.msp.billing.messages.reportManagement.Invoice[] roamingInvoiceCursor) {
        this.roamingInvoiceCursor = roamingInvoiceCursor;
    }


    /**
     * Gets the airtimeTrsfrInvoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @return airtimeTrsfrInvoiceCursor
     */
    public com.xius.msp.billing.messages.reportManagement.Invoice[] getAirtimeTrsfrInvoiceCursor() {
        return airtimeTrsfrInvoiceCursor;
    }


    /**
     * Sets the airtimeTrsfrInvoiceCursor value for this CreditInfoInvoiceResponse.
     * 
     * @param airtimeTrsfrInvoiceCursor
     */
    public void setAirtimeTrsfrInvoiceCursor(com.xius.msp.billing.messages.reportManagement.Invoice[] airtimeTrsfrInvoiceCursor) {
        this.airtimeTrsfrInvoiceCursor = airtimeTrsfrInvoiceCursor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditInfoInvoiceResponse)) return false;
        CreditInfoInvoiceResponse other = (CreditInfoInvoiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.invoiceCursor==null && other.getInvoiceCursor()==null) || 
             (this.invoiceCursor!=null &&
              java.util.Arrays.equals(this.invoiceCursor, other.getInvoiceCursor()))) &&
            ((this.charityInvoiceCursor==null && other.getCharityInvoiceCursor()==null) || 
             (this.charityInvoiceCursor!=null &&
              java.util.Arrays.equals(this.charityInvoiceCursor, other.getCharityInvoiceCursor()))) &&
            ((this.roamingInvoiceCursor==null && other.getRoamingInvoiceCursor()==null) || 
             (this.roamingInvoiceCursor!=null &&
              java.util.Arrays.equals(this.roamingInvoiceCursor, other.getRoamingInvoiceCursor()))) &&
            ((this.airtimeTrsfrInvoiceCursor==null && other.getAirtimeTrsfrInvoiceCursor()==null) || 
             (this.airtimeTrsfrInvoiceCursor!=null &&
              java.util.Arrays.equals(this.airtimeTrsfrInvoiceCursor, other.getAirtimeTrsfrInvoiceCursor())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getInvoiceCursor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceCursor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceCursor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCharityInvoiceCursor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharityInvoiceCursor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCharityInvoiceCursor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoamingInvoiceCursor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoamingInvoiceCursor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoamingInvoiceCursor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAirtimeTrsfrInvoiceCursor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAirtimeTrsfrInvoiceCursor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAirtimeTrsfrInvoiceCursor(), i);
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
        new org.apache.axis.description.TypeDesc(CreditInfoInvoiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditInfoInvoiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceCursor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoiceCursor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "Invoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoice"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charityInvoiceCursor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "charityInvoiceCursor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "Invoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoice"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingInvoiceCursor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "roamingInvoiceCursor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "Invoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoice"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeTrsfrInvoiceCursor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "airtimeTrsfrInvoiceCursor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "Invoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoice"));
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
