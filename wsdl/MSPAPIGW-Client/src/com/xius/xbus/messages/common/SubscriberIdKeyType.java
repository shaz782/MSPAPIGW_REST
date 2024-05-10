/**
 * SubscriberIdKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;

public class SubscriberIdKeyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SubscriberIdKeyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NRIC = "NRIC";
    public static final java.lang.String _PASSPORT_NO = "PASSPORT_NO";
    public static final java.lang.String _PASSPORT = "PASSPORT";
    public static final java.lang.String _ARMY_IC = "ARMY_IC";
    public static final java.lang.String _POLICE_IC = "POLICE_IC";
    public static final java.lang.String _MYKAD = "MYKAD";
    public static final SubscriberIdKeyType NRIC = new SubscriberIdKeyType(_NRIC);
    public static final SubscriberIdKeyType PASSPORT_NO = new SubscriberIdKeyType(_PASSPORT_NO);
    public static final SubscriberIdKeyType PASSPORT = new SubscriberIdKeyType(_PASSPORT);
    public static final SubscriberIdKeyType ARMY_IC = new SubscriberIdKeyType(_ARMY_IC);
    public static final SubscriberIdKeyType POLICE_IC = new SubscriberIdKeyType(_POLICE_IC);
    public static final SubscriberIdKeyType MYKAD = new SubscriberIdKeyType(_MYKAD);
    public java.lang.String getValue() { return _value_;}
    public static SubscriberIdKeyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SubscriberIdKeyType enumeration = (SubscriberIdKeyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SubscriberIdKeyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SubscriberIdKeyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SubscriberIdKeyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}