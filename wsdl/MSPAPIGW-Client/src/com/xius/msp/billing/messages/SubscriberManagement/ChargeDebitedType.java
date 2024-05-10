/**
 * ChargeDebitedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class ChargeDebitedType implements java.io.Serializable {
    private int _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChargeDebitedType(int value) {
        _value_ = value;
        _table_.put(new java.lang.Integer(_value_),this);
    }

    public static final int _value1 = 0;
    public static final int _value2 = 1;
    public static final ChargeDebitedType value1 = new ChargeDebitedType(_value1);
    public static final ChargeDebitedType value2 = new ChargeDebitedType(_value2);
    public int getValue() { return _value_;}
    public static ChargeDebitedType fromValue(int value)
          throws java.lang.IllegalArgumentException {
        ChargeDebitedType enumeration = (ChargeDebitedType)
            _table_.get(new java.lang.Integer(value));
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChargeDebitedType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(java.lang.Integer.parseInt(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return java.lang.String.valueOf(_value_);}
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
        new org.apache.axis.description.TypeDesc(ChargeDebitedType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChargeDebitedType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
