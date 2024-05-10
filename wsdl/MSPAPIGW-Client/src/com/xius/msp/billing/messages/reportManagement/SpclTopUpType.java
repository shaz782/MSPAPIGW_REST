/**
 * SpclTopUpType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class SpclTopUpType  implements java.io.Serializable {
    private java.lang.String msisdn;

    private java.lang.String accountId;

    private java.lang.String oldData;

    private java.lang.String newData;

    private java.lang.String activityDate;

    private java.lang.String activityTime;

    private java.lang.String userId;

    private java.lang.String networkId;

    private java.lang.String activityId;

    private java.math.BigDecimal amount;

    private java.lang.String firstName;

    private java.lang.String remarks;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public SpclTopUpType() {
    }

    public SpclTopUpType(
           java.lang.String msisdn,
           java.lang.String accountId,
           java.lang.String oldData,
           java.lang.String newData,
           java.lang.String activityDate,
           java.lang.String activityTime,
           java.lang.String userId,
           java.lang.String networkId,
           java.lang.String activityId,
           java.math.BigDecimal amount,
           java.lang.String firstName,
           java.lang.String remarks,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.msisdn = msisdn;
           this.accountId = accountId;
           this.oldData = oldData;
           this.newData = newData;
           this.activityDate = activityDate;
           this.activityTime = activityTime;
           this.userId = userId;
           this.networkId = networkId;
           this.activityId = activityId;
           this.amount = amount;
           this.firstName = firstName;
           this.remarks = remarks;
           this.taxType = taxType;
    }


    /**
     * Gets the msisdn value for this SpclTopUpType.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this SpclTopUpType.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the accountId value for this SpclTopUpType.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SpclTopUpType.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the oldData value for this SpclTopUpType.
     * 
     * @return oldData
     */
    public java.lang.String getOldData() {
        return oldData;
    }


    /**
     * Sets the oldData value for this SpclTopUpType.
     * 
     * @param oldData
     */
    public void setOldData(java.lang.String oldData) {
        this.oldData = oldData;
    }


    /**
     * Gets the newData value for this SpclTopUpType.
     * 
     * @return newData
     */
    public java.lang.String getNewData() {
        return newData;
    }


    /**
     * Sets the newData value for this SpclTopUpType.
     * 
     * @param newData
     */
    public void setNewData(java.lang.String newData) {
        this.newData = newData;
    }


    /**
     * Gets the activityDate value for this SpclTopUpType.
     * 
     * @return activityDate
     */
    public java.lang.String getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this SpclTopUpType.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.lang.String activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the activityTime value for this SpclTopUpType.
     * 
     * @return activityTime
     */
    public java.lang.String getActivityTime() {
        return activityTime;
    }


    /**
     * Sets the activityTime value for this SpclTopUpType.
     * 
     * @param activityTime
     */
    public void setActivityTime(java.lang.String activityTime) {
        this.activityTime = activityTime;
    }


    /**
     * Gets the userId value for this SpclTopUpType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SpclTopUpType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the networkId value for this SpclTopUpType.
     * 
     * @return networkId
     */
    public java.lang.String getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this SpclTopUpType.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.String networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the activityId value for this SpclTopUpType.
     * 
     * @return activityId
     */
    public java.lang.String getActivityId() {
        return activityId;
    }


    /**
     * Sets the activityId value for this SpclTopUpType.
     * 
     * @param activityId
     */
    public void setActivityId(java.lang.String activityId) {
        this.activityId = activityId;
    }


    /**
     * Gets the amount value for this SpclTopUpType.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SpclTopUpType.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the firstName value for this SpclTopUpType.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SpclTopUpType.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the remarks value for this SpclTopUpType.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this SpclTopUpType.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the taxType value for this SpclTopUpType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this SpclTopUpType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpclTopUpType)) return false;
        SpclTopUpType other = (SpclTopUpType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.oldData==null && other.getOldData()==null) || 
             (this.oldData!=null &&
              this.oldData.equals(other.getOldData()))) &&
            ((this.newData==null && other.getNewData()==null) || 
             (this.newData!=null &&
              this.newData.equals(other.getNewData()))) &&
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.activityTime==null && other.getActivityTime()==null) || 
             (this.activityTime!=null &&
              this.activityTime.equals(other.getActivityTime()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.activityId==null && other.getActivityId()==null) || 
             (this.activityId!=null &&
              this.activityId.equals(other.getActivityId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType())));
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
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getOldData() != null) {
            _hashCode += getOldData().hashCode();
        }
        if (getNewData() != null) {
            _hashCode += getNewData().hashCode();
        }
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
        }
        if (getActivityTime() != null) {
            _hashCode += getActivityTime().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getActivityId() != null) {
            _hashCode += getActivityId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpclTopUpType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpclTopUpType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "activityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "activityTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "activityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType"));
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
