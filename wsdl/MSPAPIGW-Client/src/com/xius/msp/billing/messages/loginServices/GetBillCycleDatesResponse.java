/**
 * GetBillCycleDatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class GetBillCycleDatesResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.loginServices.BillCycleDatesType[] billCycleDatesData;

    public GetBillCycleDatesResponse() {
    }

    public GetBillCycleDatesResponse(
           com.xius.msp.billing.messages.loginServices.BillCycleDatesType[] billCycleDatesData) {
           this.billCycleDatesData = billCycleDatesData;
    }


    /**
     * Gets the billCycleDatesData value for this GetBillCycleDatesResponse.
     * 
     * @return billCycleDatesData
     */
    public com.xius.msp.billing.messages.loginServices.BillCycleDatesType[] getBillCycleDatesData() {
        return billCycleDatesData;
    }


    /**
     * Sets the billCycleDatesData value for this GetBillCycleDatesResponse.
     * 
     * @param billCycleDatesData
     */
    public void setBillCycleDatesData(com.xius.msp.billing.messages.loginServices.BillCycleDatesType[] billCycleDatesData) {
        this.billCycleDatesData = billCycleDatesData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBillCycleDatesResponse)) return false;
        GetBillCycleDatesResponse other = (GetBillCycleDatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billCycleDatesData==null && other.getBillCycleDatesData()==null) || 
             (this.billCycleDatesData!=null &&
              java.util.Arrays.equals(this.billCycleDatesData, other.getBillCycleDatesData())));
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
        if (getBillCycleDatesData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillCycleDatesData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillCycleDatesData(), i);
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
        new org.apache.axis.description.TypeDesc(GetBillCycleDatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetBillCycleDatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycleDatesData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "billCycleDatesData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "BillCycleDatesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "billCycleDatesList"));
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
