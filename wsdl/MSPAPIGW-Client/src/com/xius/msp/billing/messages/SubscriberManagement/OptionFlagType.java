/**
 * OptionFlagType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class OptionFlagType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OptionFlagType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INSERT = "INSERT";
    public static final java.lang.String _UPDATE = "UPDATE";
    public static final java.lang.String _DELETE = "DELETE";
    public static final java.lang.String _ACTIVATE = "ACTIVATE";
    public static final java.lang.String _DEACTIVATE = "DEACTIVATE";
    public static final OptionFlagType INSERT = new OptionFlagType(_INSERT);
    public static final OptionFlagType UPDATE = new OptionFlagType(_UPDATE);
    public static final OptionFlagType DELETE = new OptionFlagType(_DELETE);
    public static final OptionFlagType ACTIVATE = new OptionFlagType(_ACTIVATE);
    public static final OptionFlagType DEACTIVATE = new OptionFlagType(_DEACTIVATE);
    public java.lang.String getValue() { return _value_;}
    public static OptionFlagType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OptionFlagType enumeration = (OptionFlagType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OptionFlagType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OptionFlagType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OptionFlagType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
