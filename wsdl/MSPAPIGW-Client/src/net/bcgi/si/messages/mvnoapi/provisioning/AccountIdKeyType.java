/**
 * AccountIdKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.bcgi.si.messages.mvnoapi.provisioning;

public class AccountIdKeyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountIdKeyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MDN = "MDN";
    public static final java.lang.String _ICCID = "ICCID";
    public static final java.lang.String _IMSI = "IMSI";
    public static final java.lang.String _ACCOUNT_ID = "ACCOUNT_ID";
    public static final java.lang.String _ICC_NO = "ICC_NO";
    public static final java.lang.String _PASSPORT_NO = "PASSPORT_NO";
    public static final java.lang.String _MYKAD_ID = "MYKAD_ID";
    public static final AccountIdKeyType MDN = new AccountIdKeyType(_MDN);
    public static final AccountIdKeyType ICCID = new AccountIdKeyType(_ICCID);
    public static final AccountIdKeyType IMSI = new AccountIdKeyType(_IMSI);
    public static final AccountIdKeyType ACCOUNT_ID = new AccountIdKeyType(_ACCOUNT_ID);
    public static final AccountIdKeyType ICC_NO = new AccountIdKeyType(_ICC_NO);
    public static final AccountIdKeyType PASSPORT_NO = new AccountIdKeyType(_PASSPORT_NO);
    public static final AccountIdKeyType MYKAD_ID = new AccountIdKeyType(_MYKAD_ID);
    public java.lang.String getValue() { return _value_;}
    public static AccountIdKeyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountIdKeyType enumeration = (AccountIdKeyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountIdKeyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountIdKeyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://provisioning.mvnoapi.messages.si.bcgi.net", "AccountIdKeyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
