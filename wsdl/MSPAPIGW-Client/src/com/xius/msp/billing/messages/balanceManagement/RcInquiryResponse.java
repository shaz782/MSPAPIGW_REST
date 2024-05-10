/**
 * RcInquiryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.balanceManagement;

public class RcInquiryResponse  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String internalTransID;

    private java.lang.String externalTransID;

    private java.lang.String accountId;

    private java.lang.String mrp;

    private java.lang.String RCID;

    private java.lang.String RCStatus;

    private java.lang.String RCDate;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    private java.lang.String userDefined3;

    public RcInquiryResponse() {
    }

    public RcInquiryResponse(
           java.lang.String message,
           java.lang.String internalTransID,
           java.lang.String externalTransID,
           java.lang.String accountId,
           java.lang.String mrp,
           java.lang.String RCID,
           java.lang.String RCStatus,
           java.lang.String RCDate,
           java.lang.String userDefined1,
           java.lang.String userDefined2,
           java.lang.String userDefined3) {
           this.message = message;
           this.internalTransID = internalTransID;
           this.externalTransID = externalTransID;
           this.accountId = accountId;
           this.mrp = mrp;
           this.RCID = RCID;
           this.RCStatus = RCStatus;
           this.RCDate = RCDate;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
           this.userDefined3 = userDefined3;
    }


    /**
     * Gets the message value for this RcInquiryResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this RcInquiryResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the internalTransID value for this RcInquiryResponse.
     * 
     * @return internalTransID
     */
    public java.lang.String getInternalTransID() {
        return internalTransID;
    }


    /**
     * Sets the internalTransID value for this RcInquiryResponse.
     * 
     * @param internalTransID
     */
    public void setInternalTransID(java.lang.String internalTransID) {
        this.internalTransID = internalTransID;
    }


    /**
     * Gets the externalTransID value for this RcInquiryResponse.
     * 
     * @return externalTransID
     */
    public java.lang.String getExternalTransID() {
        return externalTransID;
    }


    /**
     * Sets the externalTransID value for this RcInquiryResponse.
     * 
     * @param externalTransID
     */
    public void setExternalTransID(java.lang.String externalTransID) {
        this.externalTransID = externalTransID;
    }


    /**
     * Gets the accountId value for this RcInquiryResponse.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this RcInquiryResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the mrp value for this RcInquiryResponse.
     * 
     * @return mrp
     */
    public java.lang.String getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this RcInquiryResponse.
     * 
     * @param mrp
     */
    public void setMrp(java.lang.String mrp) {
        this.mrp = mrp;
    }


    /**
     * Gets the RCID value for this RcInquiryResponse.
     * 
     * @return RCID
     */
    public java.lang.String getRCID() {
        return RCID;
    }


    /**
     * Sets the RCID value for this RcInquiryResponse.
     * 
     * @param RCID
     */
    public void setRCID(java.lang.String RCID) {
        this.RCID = RCID;
    }


    /**
     * Gets the RCStatus value for this RcInquiryResponse.
     * 
     * @return RCStatus
     */
    public java.lang.String getRCStatus() {
        return RCStatus;
    }


    /**
     * Sets the RCStatus value for this RcInquiryResponse.
     * 
     * @param RCStatus
     */
    public void setRCStatus(java.lang.String RCStatus) {
        this.RCStatus = RCStatus;
    }


    /**
     * Gets the RCDate value for this RcInquiryResponse.
     * 
     * @return RCDate
     */
    public java.lang.String getRCDate() {
        return RCDate;
    }


    /**
     * Sets the RCDate value for this RcInquiryResponse.
     * 
     * @param RCDate
     */
    public void setRCDate(java.lang.String RCDate) {
        this.RCDate = RCDate;
    }


    /**
     * Gets the userDefined1 value for this RcInquiryResponse.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this RcInquiryResponse.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this RcInquiryResponse.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this RcInquiryResponse.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }


    /**
     * Gets the userDefined3 value for this RcInquiryResponse.
     * 
     * @return userDefined3
     */
    public java.lang.String getUserDefined3() {
        return userDefined3;
    }


    /**
     * Sets the userDefined3 value for this RcInquiryResponse.
     * 
     * @param userDefined3
     */
    public void setUserDefined3(java.lang.String userDefined3) {
        this.userDefined3 = userDefined3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RcInquiryResponse)) return false;
        RcInquiryResponse other = (RcInquiryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.internalTransID==null && other.getInternalTransID()==null) || 
             (this.internalTransID!=null &&
              this.internalTransID.equals(other.getInternalTransID()))) &&
            ((this.externalTransID==null && other.getExternalTransID()==null) || 
             (this.externalTransID!=null &&
              this.externalTransID.equals(other.getExternalTransID()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              this.mrp.equals(other.getMrp()))) &&
            ((this.RCID==null && other.getRCID()==null) || 
             (this.RCID!=null &&
              this.RCID.equals(other.getRCID()))) &&
            ((this.RCStatus==null && other.getRCStatus()==null) || 
             (this.RCStatus!=null &&
              this.RCStatus.equals(other.getRCStatus()))) &&
            ((this.RCDate==null && other.getRCDate()==null) || 
             (this.RCDate!=null &&
              this.RCDate.equals(other.getRCDate()))) &&
            ((this.userDefined1==null && other.getUserDefined1()==null) || 
             (this.userDefined1!=null &&
              this.userDefined1.equals(other.getUserDefined1()))) &&
            ((this.userDefined2==null && other.getUserDefined2()==null) || 
             (this.userDefined2!=null &&
              this.userDefined2.equals(other.getUserDefined2()))) &&
            ((this.userDefined3==null && other.getUserDefined3()==null) || 
             (this.userDefined3!=null &&
              this.userDefined3.equals(other.getUserDefined3())));
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getInternalTransID() != null) {
            _hashCode += getInternalTransID().hashCode();
        }
        if (getExternalTransID() != null) {
            _hashCode += getExternalTransID().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getMrp() != null) {
            _hashCode += getMrp().hashCode();
        }
        if (getRCID() != null) {
            _hashCode += getRCID().hashCode();
        }
        if (getRCStatus() != null) {
            _hashCode += getRCStatus().hashCode();
        }
        if (getRCDate() != null) {
            _hashCode += getRCDate().hashCode();
        }
        if (getUserDefined1() != null) {
            _hashCode += getUserDefined1().hashCode();
        }
        if (getUserDefined2() != null) {
            _hashCode += getUserDefined2().hashCode();
        }
        if (getUserDefined3() != null) {
            _hashCode += getUserDefined3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RcInquiryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "rcInquiryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "internalTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalTransID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "externalTransID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "mrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "RCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "RCStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RCDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "RCDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "userDefined2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/BalanceManagement.xsd", "userDefined3"));
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
