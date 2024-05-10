/**
 * RetrieveVoucherResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.debitorcredit;

public class RetrieveVoucherResponse  extends com.xius.xbus.messages.common.WSResponse  implements java.io.Serializable {
    private java.lang.String voucherNumber;

    private java.lang.String status;

    private java.math.BigDecimal mrp;

    private java.math.BigDecimal talkTime;

    private java.lang.String expiryDate;

    private java.lang.String brandPartner;

    private java.lang.String msisdn;

    private java.lang.String profileName;

    private java.lang.String officeName;

    public RetrieveVoucherResponse() {
    }

    public RetrieveVoucherResponse(
           com.xius.xbus.messages.common.StatusCode statusCode,
           java.util.Calendar timeStamp,
           java.lang.String correlationID,
           com.xius.xbus.messages.common.ErrorData[] errors,
           java.lang.String version,
           java.lang.String voucherNumber,
           java.lang.String status,
           java.math.BigDecimal mrp,
           java.math.BigDecimal talkTime,
           java.lang.String expiryDate,
           java.lang.String brandPartner,
           java.lang.String msisdn,
           java.lang.String profileName,
           java.lang.String officeName) {
        super(
            statusCode,
            timeStamp,
            correlationID,
            errors,
            version);
        this.voucherNumber = voucherNumber;
        this.status = status;
        this.mrp = mrp;
        this.talkTime = talkTime;
        this.expiryDate = expiryDate;
        this.brandPartner = brandPartner;
        this.msisdn = msisdn;
        this.profileName = profileName;
        this.officeName = officeName;
    }


    /**
     * Gets the voucherNumber value for this RetrieveVoucherResponse.
     * 
     * @return voucherNumber
     */
    public java.lang.String getVoucherNumber() {
        return voucherNumber;
    }


    /**
     * Sets the voucherNumber value for this RetrieveVoucherResponse.
     * 
     * @param voucherNumber
     */
    public void setVoucherNumber(java.lang.String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }


    /**
     * Gets the status value for this RetrieveVoucherResponse.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RetrieveVoucherResponse.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the mrp value for this RetrieveVoucherResponse.
     * 
     * @return mrp
     */
    public java.math.BigDecimal getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this RetrieveVoucherResponse.
     * 
     * @param mrp
     */
    public void setMrp(java.math.BigDecimal mrp) {
        this.mrp = mrp;
    }


    /**
     * Gets the talkTime value for this RetrieveVoucherResponse.
     * 
     * @return talkTime
     */
    public java.math.BigDecimal getTalkTime() {
        return talkTime;
    }


    /**
     * Sets the talkTime value for this RetrieveVoucherResponse.
     * 
     * @param talkTime
     */
    public void setTalkTime(java.math.BigDecimal talkTime) {
        this.talkTime = talkTime;
    }


    /**
     * Gets the expiryDate value for this RetrieveVoucherResponse.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this RetrieveVoucherResponse.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the brandPartner value for this RetrieveVoucherResponse.
     * 
     * @return brandPartner
     */
    public java.lang.String getBrandPartner() {
        return brandPartner;
    }


    /**
     * Sets the brandPartner value for this RetrieveVoucherResponse.
     * 
     * @param brandPartner
     */
    public void setBrandPartner(java.lang.String brandPartner) {
        this.brandPartner = brandPartner;
    }


    /**
     * Gets the msisdn value for this RetrieveVoucherResponse.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this RetrieveVoucherResponse.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the profileName value for this RetrieveVoucherResponse.
     * 
     * @return profileName
     */
    public java.lang.String getProfileName() {
        return profileName;
    }


    /**
     * Sets the profileName value for this RetrieveVoucherResponse.
     * 
     * @param profileName
     */
    public void setProfileName(java.lang.String profileName) {
        this.profileName = profileName;
    }


    /**
     * Gets the officeName value for this RetrieveVoucherResponse.
     * 
     * @return officeName
     */
    public java.lang.String getOfficeName() {
        return officeName;
    }


    /**
     * Sets the officeName value for this RetrieveVoucherResponse.
     * 
     * @param officeName
     */
    public void setOfficeName(java.lang.String officeName) {
        this.officeName = officeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveVoucherResponse)) return false;
        RetrieveVoucherResponse other = (RetrieveVoucherResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.voucherNumber==null && other.getVoucherNumber()==null) || 
             (this.voucherNumber!=null &&
              this.voucherNumber.equals(other.getVoucherNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              this.mrp.equals(other.getMrp()))) &&
            ((this.talkTime==null && other.getTalkTime()==null) || 
             (this.talkTime!=null &&
              this.talkTime.equals(other.getTalkTime()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.brandPartner==null && other.getBrandPartner()==null) || 
             (this.brandPartner!=null &&
              this.brandPartner.equals(other.getBrandPartner()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.profileName==null && other.getProfileName()==null) || 
             (this.profileName!=null &&
              this.profileName.equals(other.getProfileName()))) &&
            ((this.officeName==null && other.getOfficeName()==null) || 
             (this.officeName!=null &&
              this.officeName.equals(other.getOfficeName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getVoucherNumber() != null) {
            _hashCode += getVoucherNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMrp() != null) {
            _hashCode += getMrp().hashCode();
        }
        if (getTalkTime() != null) {
            _hashCode += getTalkTime().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getBrandPartner() != null) {
            _hashCode += getBrandPartner().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getProfileName() != null) {
            _hashCode += getProfileName().hashCode();
        }
        if (getOfficeName() != null) {
            _hashCode += getOfficeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveVoucherResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">retrieveVoucherResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "voucherNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "mrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talkTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "talkTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "expiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "brandPartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "profileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "officeName"));
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
