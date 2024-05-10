/**
 * GetLoanDetailsByDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.SubscriberManagementV1;

public class GetLoanDetailsByDateResponse  implements java.io.Serializable {
    private com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType[] loanAcctDetails;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    public GetLoanDetailsByDateResponse() {
    }

    public GetLoanDetailsByDateResponse(
           com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType[] loanAcctDetails,
           java.lang.String userDefined1,
           java.lang.String userDefined2) {
           this.loanAcctDetails = loanAcctDetails;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
    }


    /**
     * Gets the loanAcctDetails value for this GetLoanDetailsByDateResponse.
     * 
     * @return loanAcctDetails
     */
    public com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType[] getLoanAcctDetails() {
        return loanAcctDetails;
    }


    /**
     * Sets the loanAcctDetails value for this GetLoanDetailsByDateResponse.
     * 
     * @param loanAcctDetails
     */
    public void setLoanAcctDetails(com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType[] loanAcctDetails) {
        this.loanAcctDetails = loanAcctDetails;
    }

    public com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType getLoanAcctDetails(int i) {
        return this.loanAcctDetails[i];
    }

    public void setLoanAcctDetails(int i, com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType _value) {
        this.loanAcctDetails[i] = _value;
    }


    /**
     * Gets the userDefined1 value for this GetLoanDetailsByDateResponse.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this GetLoanDetailsByDateResponse.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this GetLoanDetailsByDateResponse.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this GetLoanDetailsByDateResponse.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLoanDetailsByDateResponse)) return false;
        GetLoanDetailsByDateResponse other = (GetLoanDetailsByDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loanAcctDetails==null && other.getLoanAcctDetails()==null) || 
             (this.loanAcctDetails!=null &&
              java.util.Arrays.equals(this.loanAcctDetails, other.getLoanAcctDetails()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2())));
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
        if (getLoanAcctDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoanAcctDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoanAcctDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDefined1() != null) {
            _hashCode += getUserDefined1().hashCode();
        }
        if (getUserDefined2() != null) {
            _hashCode += getUserDefined2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLoanDetailsByDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetLoanDetailsByDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanAcctDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "loanAcctDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "loanAcctDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "userDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
