/**
 * ReportFlagType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class ReportFlagType implements java.io.Serializable {
    private int _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportFlagType(int value) {
        _value_ = value;
        _table_.put(new java.lang.Integer(_value_),this);
    }

    public static final int _value1 = 0;
    public static final int _value2 = 1;
    public static final int _value3 = 2;
    public static final int _value4 = 3;
    public static final int _value5 = 4;
    public static final int _value6 = 5;
    public static final int _value7 = 6;
    public static final int _value8 = 7;
    public static final int _value9 = 8;
    public static final int _value10 = 9;
    public static final int _value11 = 10;
    public static final int _value12 = 11;
    public static final int _value13 = 12;
    public static final int _value14 = 13;
    public static final int _value15 = 14;
    public static final int _value16 = 15;
    public static final int _value17 = 16;
    public static final ReportFlagType value1 = new ReportFlagType(_value1);
    public static final ReportFlagType value2 = new ReportFlagType(_value2);
    public static final ReportFlagType value3 = new ReportFlagType(_value3);
    public static final ReportFlagType value4 = new ReportFlagType(_value4);
    public static final ReportFlagType value5 = new ReportFlagType(_value5);
    public static final ReportFlagType value6 = new ReportFlagType(_value6);
    public static final ReportFlagType value7 = new ReportFlagType(_value7);
    public static final ReportFlagType value8 = new ReportFlagType(_value8);
    public static final ReportFlagType value9 = new ReportFlagType(_value9);
    public static final ReportFlagType value10 = new ReportFlagType(_value10);
    public static final ReportFlagType value11 = new ReportFlagType(_value11);
    public static final ReportFlagType value12 = new ReportFlagType(_value12);
    public static final ReportFlagType value13 = new ReportFlagType(_value13);
    public static final ReportFlagType value14 = new ReportFlagType(_value14);
    public static final ReportFlagType value15 = new ReportFlagType(_value15);
    public static final ReportFlagType value16 = new ReportFlagType(_value16);
    public static final ReportFlagType value17 = new ReportFlagType(_value17);
    public int getValue() { return _value_;}
    public static ReportFlagType fromValue(int value)
          throws java.lang.IllegalArgumentException {
        ReportFlagType enumeration = (ReportFlagType)
            _table_.get(new java.lang.Integer(value));
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportFlagType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportFlagType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ReportFlagType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
