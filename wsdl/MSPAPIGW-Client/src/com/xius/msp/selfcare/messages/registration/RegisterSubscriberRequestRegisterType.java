/**
 * RegisterSubscriberRequestRegisterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.messages.registration;

public class RegisterSubscriberRequestRegisterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RegisterSubscriberRequestRegisterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REG_BLOCK_MDN = "REG_BLOCK_MDN";
    public static final java.lang.String _REG_SUB_ONLY = "REG_SUB_ONLY";
    public static final java.lang.String _REG_WITHOUT_MDN = "REG_WITHOUT_MDN";
    public static final java.lang.String _REG_NEW_MDN = "REG_NEW_MDN";
    public static final java.lang.String _REG_BARE_BONE = "REG_BARE_BONE";
    public static final RegisterSubscriberRequestRegisterType REG_BLOCK_MDN = new RegisterSubscriberRequestRegisterType(_REG_BLOCK_MDN);
    public static final RegisterSubscriberRequestRegisterType REG_SUB_ONLY = new RegisterSubscriberRequestRegisterType(_REG_SUB_ONLY);
    public static final RegisterSubscriberRequestRegisterType REG_WITHOUT_MDN = new RegisterSubscriberRequestRegisterType(_REG_WITHOUT_MDN);
    public static final RegisterSubscriberRequestRegisterType REG_NEW_MDN = new RegisterSubscriberRequestRegisterType(_REG_NEW_MDN);
    public static final RegisterSubscriberRequestRegisterType REG_BARE_BONE = new RegisterSubscriberRequestRegisterType(_REG_BARE_BONE);
    public java.lang.String getValue() { return _value_;}
    public static RegisterSubscriberRequestRegisterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RegisterSubscriberRequestRegisterType enumeration = (RegisterSubscriberRequestRegisterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RegisterSubscriberRequestRegisterType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RegisterSubscriberRequestRegisterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.xsd", ">RegisterSubscriberRequest>registerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
