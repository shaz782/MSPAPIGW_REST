/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class Invoice  implements java.io.Serializable {
    private java.lang.Long item;

    private java.lang.String product;

    private java.lang.Long quantity;

    private java.math.BigDecimal totval;

    private java.math.BigDecimal gstval;

    private java.math.BigDecimal totpaidval;

    private java.lang.String invoiceId;

    private java.lang.String invoiceDate;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public Invoice() {
    }

    public Invoice(
           java.lang.Long item,
           java.lang.String product,
           java.lang.Long quantity,
           java.math.BigDecimal totval,
           java.math.BigDecimal gstval,
           java.math.BigDecimal totpaidval,
           java.lang.String invoiceId,
           java.lang.String invoiceDate,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.item = item;
           this.product = product;
           this.quantity = quantity;
           this.totval = totval;
           this.gstval = gstval;
           this.totpaidval = totpaidval;
           this.invoiceId = invoiceId;
           this.invoiceDate = invoiceDate;
           this.taxType = taxType;
    }


    /**
     * Gets the item value for this Invoice.
     * 
     * @return item
     */
    public java.lang.Long getItem() {
        return item;
    }


    /**
     * Sets the item value for this Invoice.
     * 
     * @param item
     */
    public void setItem(java.lang.Long item) {
        this.item = item;
    }


    /**
     * Gets the product value for this Invoice.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this Invoice.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the quantity value for this Invoice.
     * 
     * @return quantity
     */
    public java.lang.Long getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Invoice.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Long quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the totval value for this Invoice.
     * 
     * @return totval
     */
    public java.math.BigDecimal getTotval() {
        return totval;
    }


    /**
     * Sets the totval value for this Invoice.
     * 
     * @param totval
     */
    public void setTotval(java.math.BigDecimal totval) {
        this.totval = totval;
    }


    /**
     * Gets the gstval value for this Invoice.
     * 
     * @return gstval
     */
    public java.math.BigDecimal getGstval() {
        return gstval;
    }


    /**
     * Sets the gstval value for this Invoice.
     * 
     * @param gstval
     */
    public void setGstval(java.math.BigDecimal gstval) {
        this.gstval = gstval;
    }


    /**
     * Gets the totpaidval value for this Invoice.
     * 
     * @return totpaidval
     */
    public java.math.BigDecimal getTotpaidval() {
        return totpaidval;
    }


    /**
     * Sets the totpaidval value for this Invoice.
     * 
     * @param totpaidval
     */
    public void setTotpaidval(java.math.BigDecimal totpaidval) {
        this.totpaidval = totpaidval;
    }


    /**
     * Gets the invoiceId value for this Invoice.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this Invoice.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the invoiceDate value for this Invoice.
     * 
     * @return invoiceDate
     */
    public java.lang.String getInvoiceDate() {
        return invoiceDate;
    }


    /**
     * Sets the invoiceDate value for this Invoice.
     * 
     * @param invoiceDate
     */
    public void setInvoiceDate(java.lang.String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }


    /**
     * Gets the taxType value for this Invoice.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this Invoice.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoice)) return false;
        Invoice other = (Invoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.totval==null && other.getTotval()==null) || 
             (this.totval!=null &&
              this.totval.equals(other.getTotval()))) &&
            ((this.gstval==null && other.getGstval()==null) || 
             (this.gstval!=null &&
              this.gstval.equals(other.getGstval()))) &&
            ((this.totpaidval==null && other.getTotpaidval()==null) || 
             (this.totpaidval!=null &&
              this.totpaidval.equals(other.getTotpaidval()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
            ((this.invoiceDate==null && other.getInvoiceDate()==null) || 
             (this.invoiceDate!=null &&
              this.invoiceDate.equals(other.getInvoiceDate()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getTotval() != null) {
            _hashCode += getTotval().hashCode();
        }
        if (getGstval() != null) {
            _hashCode += getGstval().hashCode();
        }
        if (getTotpaidval() != null) {
            _hashCode += getTotpaidval().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInvoiceDate() != null) {
            _hashCode += getInvoiceDate().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Invoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "Invoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gstval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "gstval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totpaidval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "totpaidval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
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
