/**
 * ReplenishmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class ReplenishmentType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReplenishmentType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CREDITCARD = "CREDITCARD";
    public static final java.lang.String _DEBITCARD = "DEBITCARD";
    public static final java.lang.String _VOUCHERCARD = "VOUCHERCARD";
    public static final java.lang.String _CASH = "CASH";
    public static final ReplenishmentType CREDITCARD = new ReplenishmentType(_CREDITCARD);
    public static final ReplenishmentType DEBITCARD = new ReplenishmentType(_DEBITCARD);
    public static final ReplenishmentType VOUCHERCARD = new ReplenishmentType(_VOUCHERCARD);
    public static final ReplenishmentType CASH = new ReplenishmentType(_CASH);
    public java.lang.String getValue() { return _value_;}
    public static ReplenishmentType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReplenishmentType enumeration = (ReplenishmentType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReplenishmentType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplenishmentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ReplenishmentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
