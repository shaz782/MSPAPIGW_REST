/**
 * NotesListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagement;

public class NotesListType  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagement.NotesType criticalNote;

    private com.xius.msp.billing.messages.SubscriberManagement.NotesType[] notes;

    public NotesListType() {
    }

    public NotesListType(
           com.xius.msp.billing.messages.SubscriberManagement.NotesType criticalNote,
           com.xius.msp.billing.messages.SubscriberManagement.NotesType[] notes) {
           this.criticalNote = criticalNote;
           this.notes = notes;
    }


    /**
     * Gets the criticalNote value for this NotesListType.
     * 
     * @return criticalNote
     */
    public com.xius.msp.billing.messages.SubscriberManagement.NotesType getCriticalNote() {
        return criticalNote;
    }


    /**
     * Sets the criticalNote value for this NotesListType.
     * 
     * @param criticalNote
     */
    public void setCriticalNote(com.xius.msp.billing.messages.SubscriberManagement.NotesType criticalNote) {
        this.criticalNote = criticalNote;
    }


    /**
     * Gets the notes value for this NotesListType.
     * 
     * @return notes
     */
    public com.xius.msp.billing.messages.SubscriberManagement.NotesType[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this NotesListType.
     * 
     * @param notes
     */
    public void setNotes(com.xius.msp.billing.messages.SubscriberManagement.NotesType[] notes) {
        this.notes = notes;
    }

    public com.xius.msp.billing.messages.SubscriberManagement.NotesType getNotes(int i) {
        return this.notes[i];
    }

    public void setNotes(int i, com.xius.msp.billing.messages.SubscriberManagement.NotesType _value) {
        this.notes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotesListType)) return false;
        NotesListType other = (NotesListType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criticalNote==null && other.getCriticalNote()==null) || 
             (this.criticalNote!=null &&
              this.criticalNote.equals(other.getCriticalNote()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes())));
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
        if (getCriticalNote() != null) {
            _hashCode += getCriticalNote().hashCode();
        }
        if (getNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotes(), i);
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
        new org.apache.axis.description.TypeDesc(NotesListType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesListType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criticalNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "criticalNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesType"));
        elemField.setMinOccurs(0);
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
