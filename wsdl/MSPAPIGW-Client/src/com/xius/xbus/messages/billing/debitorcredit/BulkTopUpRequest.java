/**
 * BulkTopUpRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class BulkTopUpRequest  extends com.xius.xbus.messages.common.WSRequest  implements java.io.Serializable {
    private long officeCode;

    private java.lang.String rcCode;

    private java.lang.String rcCategory;

    private java.math.BigDecimal rcAmount;

    private java.lang.String[] bulkTopUpsData;

    public BulkTopUpRequest() {
    }

    public BulkTopUpRequest(
           com.xius.xbus.messages.common.UserType userType,
           java.lang.String messageID,
           com.xius.xbus.messages.common.SecurityId securityId,
           com.xius.xbus.messages.common.ServiceContext serviceContext,
           java.lang.String version,
           long officeCode,
           java.lang.String rcCode,
           java.lang.String rcCategory,
           java.math.BigDecimal rcAmount,
           java.lang.String[] bulkTopUpsData) {
        super(
            userType,
            messageID,
            securityId,
            serviceContext,
            version);
        this.officeCode = officeCode;
        this.rcCode = rcCode;
        this.rcCategory = rcCategory;
        this.rcAmount = rcAmount;
        this.bulkTopUpsData = bulkTopUpsData;
    }


    /**
     * Gets the officeCode value for this BulkTopUpRequest.
     * 
     * @return officeCode
     */
    public long getOfficeCode() {
        return officeCode;
    }


    /**
     * Sets the officeCode value for this BulkTopUpRequest.
     * 
     * @param officeCode
     */
    public void setOfficeCode(long officeCode) {
        this.officeCode = officeCode;
    }


    /**
     * Gets the rcCode value for this BulkTopUpRequest.
     * 
     * @return rcCode
     */
    public java.lang.String getRcCode() {
        return rcCode;
    }


    /**
     * Sets the rcCode value for this BulkTopUpRequest.
     * 
     * @param rcCode
     */
    public void setRcCode(java.lang.String rcCode) {
        this.rcCode = rcCode;
    }


    /**
     * Gets the rcCategory value for this BulkTopUpRequest.
     * 
     * @return rcCategory
     */
    public java.lang.String getRcCategory() {
        return rcCategory;
    }


    /**
     * Sets the rcCategory value for this BulkTopUpRequest.
     * 
     * @param rcCategory
     */
    public void setRcCategory(java.lang.String rcCategory) {
        this.rcCategory = rcCategory;
    }


    /**
     * Gets the rcAmount value for this BulkTopUpRequest.
     * 
     * @return rcAmount
     */
    public java.math.BigDecimal getRcAmount() {
        return rcAmount;
    }


    /**
     * Sets the rcAmount value for this BulkTopUpRequest.
     * 
     * @param rcAmount
     */
    public void setRcAmount(java.math.BigDecimal rcAmount) {
        this.rcAmount = rcAmount;
    }


    /**
     * Gets the bulkTopUpsData value for this BulkTopUpRequest.
     * 
     * @return bulkTopUpsData
     */
    public java.lang.String[] getBulkTopUpsData() {
        return bulkTopUpsData;
    }


    /**
     * Sets the bulkTopUpsData value for this BulkTopUpRequest.
     * 
     * @param bulkTopUpsData
     */
    public void setBulkTopUpsData(java.lang.String[] bulkTopUpsData) {
        this.bulkTopUpsData = bulkTopUpsData;
    }

    public java.lang.String getBulkTopUpsData(int i) {
        return this.bulkTopUpsData[i];
    }

    public void setBulkTopUpsData(int i, java.lang.String _value) {
        this.bulkTopUpsData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkTopUpRequest)) return false;
        BulkTopUpRequest other = (BulkTopUpRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.officeCode == other.getOfficeCode() &&
            ((this.rcCode==null && other.getRcCode()==null) || 
             (this.rcCode!=null &&
              this.rcCode.equals(other.getRcCode()))) &&
            ((this.rcCategory==null && other.getRcCategory()==null) || 
             (this.rcCategory!=null &&
              this.rcCategory.equals(other.getRcCategory()))) &&
            ((this.rcAmount==null && other.getRcAmount()==null) || 
             (this.rcAmount!=null &&
              this.rcAmount.equals(other.getRcAmount()))) &&
            ((this.bulkTopUpsData==null && other.getBulkTopUpsData()==null) || 
             (this.bulkTopUpsData!=null &&
              java.util.Arrays.equals(this.bulkTopUpsData, other.getBulkTopUpsData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Long(getOfficeCode()).hashCode();
        if (getRcCode() != null) {
            _hashCode += getRcCode().hashCode();
        }
        if (getRcCategory() != null) {
            _hashCode += getRcCategory().hashCode();
        }
        if (getRcAmount() != null) {
            _hashCode += getRcAmount().hashCode();
        }
        if (getBulkTopUpsData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBulkTopUpsData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBulkTopUpsData(), i);
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
        new org.apache.axis.description.TypeDesc(BulkTopUpRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">bulkTopUpRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "officeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "rcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "rcCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "rcAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkTopUpsData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "bulkTopUpsData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
