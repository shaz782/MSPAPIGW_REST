/**
 * BalanceInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.common;


/**
 * This will hold customer's device balance and
 * 				currency information
 */
public class BalanceInfoType  implements java.io.Serializable {
    private java.lang.Double prepaidAccountBalance;

    private java.lang.String currency;

    private java.lang.Double bucketAccountBalance;

    private java.lang.Double thresholdBalance;

    private java.lang.Double promoBalance;

    private java.lang.Double totalBalance;

    private java.math.BigInteger airtimeMinutes;

    private java.math.BigInteger freeSMSMessages;

    private java.lang.Double freeSMSRuppes;

    private java.math.BigInteger freeMMSMessages;

    private java.lang.String data;

    private java.lang.String calls;

    private java.lang.Double postPaidBalace;

    private java.lang.String airTimeUnlimitedYN;

    private java.lang.String smsUnlimitedYN;

    private java.lang.String mmsUnlimitedYN;

    private java.lang.String dataUnlimitedYN;

    public BalanceInfoType() {
    }

    public BalanceInfoType(
           java.lang.Double prepaidAccountBalance,
           java.lang.String currency,
           java.lang.Double bucketAccountBalance,
           java.lang.Double thresholdBalance,
           java.lang.Double promoBalance,
           java.lang.Double totalBalance,
           java.math.BigInteger airtimeMinutes,
           java.math.BigInteger freeSMSMessages,
           java.lang.Double freeSMSRuppes,
           java.math.BigInteger freeMMSMessages,
           java.lang.String data,
           java.lang.String calls,
           java.lang.Double postPaidBalace,
           java.lang.String airTimeUnlimitedYN,
           java.lang.String smsUnlimitedYN,
           java.lang.String mmsUnlimitedYN,
           java.lang.String dataUnlimitedYN) {
           this.prepaidAccountBalance = prepaidAccountBalance;
           this.currency = currency;
           this.bucketAccountBalance = bucketAccountBalance;
           this.thresholdBalance = thresholdBalance;
           this.promoBalance = promoBalance;
           this.totalBalance = totalBalance;
           this.airtimeMinutes = airtimeMinutes;
           this.freeSMSMessages = freeSMSMessages;
           this.freeSMSRuppes = freeSMSRuppes;
           this.freeMMSMessages = freeMMSMessages;
           this.data = data;
           this.calls = calls;
           this.postPaidBalace = postPaidBalace;
           this.airTimeUnlimitedYN = airTimeUnlimitedYN;
           this.smsUnlimitedYN = smsUnlimitedYN;
           this.mmsUnlimitedYN = mmsUnlimitedYN;
           this.dataUnlimitedYN = dataUnlimitedYN;
    }


    /**
     * Gets the prepaidAccountBalance value for this BalanceInfoType.
     * 
     * @return prepaidAccountBalance
     */
    public java.lang.Double getPrepaidAccountBalance() {
        return prepaidAccountBalance;
    }


    /**
     * Sets the prepaidAccountBalance value for this BalanceInfoType.
     * 
     * @param prepaidAccountBalance
     */
    public void setPrepaidAccountBalance(java.lang.Double prepaidAccountBalance) {
        this.prepaidAccountBalance = prepaidAccountBalance;
    }


    /**
     * Gets the currency value for this BalanceInfoType.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BalanceInfoType.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the bucketAccountBalance value for this BalanceInfoType.
     * 
     * @return bucketAccountBalance
     */
    public java.lang.Double getBucketAccountBalance() {
        return bucketAccountBalance;
    }


    /**
     * Sets the bucketAccountBalance value for this BalanceInfoType.
     * 
     * @param bucketAccountBalance
     */
    public void setBucketAccountBalance(java.lang.Double bucketAccountBalance) {
        this.bucketAccountBalance = bucketAccountBalance;
    }


    /**
     * Gets the thresholdBalance value for this BalanceInfoType.
     * 
     * @return thresholdBalance
     */
    public java.lang.Double getThresholdBalance() {
        return thresholdBalance;
    }


    /**
     * Sets the thresholdBalance value for this BalanceInfoType.
     * 
     * @param thresholdBalance
     */
    public void setThresholdBalance(java.lang.Double thresholdBalance) {
        this.thresholdBalance = thresholdBalance;
    }


    /**
     * Gets the promoBalance value for this BalanceInfoType.
     * 
     * @return promoBalance
     */
    public java.lang.Double getPromoBalance() {
        return promoBalance;
    }


    /**
     * Sets the promoBalance value for this BalanceInfoType.
     * 
     * @param promoBalance
     */
    public void setPromoBalance(java.lang.Double promoBalance) {
        this.promoBalance = promoBalance;
    }


    /**
     * Gets the totalBalance value for this BalanceInfoType.
     * 
     * @return totalBalance
     */
    public java.lang.Double getTotalBalance() {
        return totalBalance;
    }


    /**
     * Sets the totalBalance value for this BalanceInfoType.
     * 
     * @param totalBalance
     */
    public void setTotalBalance(java.lang.Double totalBalance) {
        this.totalBalance = totalBalance;
    }


    /**
     * Gets the airtimeMinutes value for this BalanceInfoType.
     * 
     * @return airtimeMinutes
     */
    public java.math.BigInteger getAirtimeMinutes() {
        return airtimeMinutes;
    }


    /**
     * Sets the airtimeMinutes value for this BalanceInfoType.
     * 
     * @param airtimeMinutes
     */
    public void setAirtimeMinutes(java.math.BigInteger airtimeMinutes) {
        this.airtimeMinutes = airtimeMinutes;
    }


    /**
     * Gets the freeSMSMessages value for this BalanceInfoType.
     * 
     * @return freeSMSMessages
     */
    public java.math.BigInteger getFreeSMSMessages() {
        return freeSMSMessages;
    }


    /**
     * Sets the freeSMSMessages value for this BalanceInfoType.
     * 
     * @param freeSMSMessages
     */
    public void setFreeSMSMessages(java.math.BigInteger freeSMSMessages) {
        this.freeSMSMessages = freeSMSMessages;
    }


    /**
     * Gets the freeSMSRuppes value for this BalanceInfoType.
     * 
     * @return freeSMSRuppes
     */
    public java.lang.Double getFreeSMSRuppes() {
        return freeSMSRuppes;
    }


    /**
     * Sets the freeSMSRuppes value for this BalanceInfoType.
     * 
     * @param freeSMSRuppes
     */
    public void setFreeSMSRuppes(java.lang.Double freeSMSRuppes) {
        this.freeSMSRuppes = freeSMSRuppes;
    }


    /**
     * Gets the freeMMSMessages value for this BalanceInfoType.
     * 
     * @return freeMMSMessages
     */
    public java.math.BigInteger getFreeMMSMessages() {
        return freeMMSMessages;
    }


    /**
     * Sets the freeMMSMessages value for this BalanceInfoType.
     * 
     * @param freeMMSMessages
     */
    public void setFreeMMSMessages(java.math.BigInteger freeMMSMessages) {
        this.freeMMSMessages = freeMMSMessages;
    }


    /**
     * Gets the data value for this BalanceInfoType.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this BalanceInfoType.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the calls value for this BalanceInfoType.
     * 
     * @return calls
     */
    public java.lang.String getCalls() {
        return calls;
    }


    /**
     * Sets the calls value for this BalanceInfoType.
     * 
     * @param calls
     */
    public void setCalls(java.lang.String calls) {
        this.calls = calls;
    }


    /**
     * Gets the postPaidBalace value for this BalanceInfoType.
     * 
     * @return postPaidBalace
     */
    public java.lang.Double getPostPaidBalace() {
        return postPaidBalace;
    }


    /**
     * Sets the postPaidBalace value for this BalanceInfoType.
     * 
     * @param postPaidBalace
     */
    public void setPostPaidBalace(java.lang.Double postPaidBalace) {
        this.postPaidBalace = postPaidBalace;
    }


    /**
     * Gets the airTimeUnlimitedYN value for this BalanceInfoType.
     * 
     * @return airTimeUnlimitedYN
     */
    public java.lang.String getAirTimeUnlimitedYN() {
        return airTimeUnlimitedYN;
    }


    /**
     * Sets the airTimeUnlimitedYN value for this BalanceInfoType.
     * 
     * @param airTimeUnlimitedYN
     */
    public void setAirTimeUnlimitedYN(java.lang.String airTimeUnlimitedYN) {
        this.airTimeUnlimitedYN = airTimeUnlimitedYN;
    }


    /**
     * Gets the smsUnlimitedYN value for this BalanceInfoType.
     * 
     * @return smsUnlimitedYN
     */
    public java.lang.String getSmsUnlimitedYN() {
        return smsUnlimitedYN;
    }


    /**
     * Sets the smsUnlimitedYN value for this BalanceInfoType.
     * 
     * @param smsUnlimitedYN
     */
    public void setSmsUnlimitedYN(java.lang.String smsUnlimitedYN) {
        this.smsUnlimitedYN = smsUnlimitedYN;
    }


    /**
     * Gets the mmsUnlimitedYN value for this BalanceInfoType.
     * 
     * @return mmsUnlimitedYN
     */
    public java.lang.String getMmsUnlimitedYN() {
        return mmsUnlimitedYN;
    }


    /**
     * Sets the mmsUnlimitedYN value for this BalanceInfoType.
     * 
     * @param mmsUnlimitedYN
     */
    public void setMmsUnlimitedYN(java.lang.String mmsUnlimitedYN) {
        this.mmsUnlimitedYN = mmsUnlimitedYN;
    }


    /**
     * Gets the dataUnlimitedYN value for this BalanceInfoType.
     * 
     * @return dataUnlimitedYN
     */
    public java.lang.String getDataUnlimitedYN() {
        return dataUnlimitedYN;
    }


    /**
     * Sets the dataUnlimitedYN value for this BalanceInfoType.
     * 
     * @param dataUnlimitedYN
     */
    public void setDataUnlimitedYN(java.lang.String dataUnlimitedYN) {
        this.dataUnlimitedYN = dataUnlimitedYN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceInfoType)) return false;
        BalanceInfoType other = (BalanceInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prepaidAccountBalance==null && other.getPrepaidAccountBalance()==null) || 
             (this.prepaidAccountBalance!=null &&
              this.prepaidAccountBalance.equals(other.getPrepaidAccountBalance()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.bucketAccountBalance==null && other.getBucketAccountBalance()==null) || 
             (this.bucketAccountBalance!=null &&
              this.bucketAccountBalance.equals(other.getBucketAccountBalance()))) &&
            ((this.thresholdBalance==null && other.getThresholdBalance()==null) || 
             (this.thresholdBalance!=null &&
              this.thresholdBalance.equals(other.getThresholdBalance()))) &&
            ((this.promoBalance==null && other.getPromoBalance()==null) || 
             (this.promoBalance!=null &&
              this.promoBalance.equals(other.getPromoBalance()))) &&
            ((this.totalBalance==null && other.getTotalBalance()==null) || 
             (this.totalBalance!=null &&
              this.totalBalance.equals(other.getTotalBalance()))) &&
            ((this.airtimeMinutes==null && other.getAirtimeMinutes()==null) || 
             (this.airtimeMinutes!=null &&
              this.airtimeMinutes.equals(other.getAirtimeMinutes()))) &&
            ((this.freeSMSMessages==null && other.getFreeSMSMessages()==null) || 
             (this.freeSMSMessages!=null &&
              this.freeSMSMessages.equals(other.getFreeSMSMessages()))) &&
            ((this.freeSMSRuppes==null && other.getFreeSMSRuppes()==null) || 
             (this.freeSMSRuppes!=null &&
              this.freeSMSRuppes.equals(other.getFreeSMSRuppes()))) &&
            ((this.freeMMSMessages==null && other.getFreeMMSMessages()==null) || 
             (this.freeMMSMessages!=null &&
              this.freeMMSMessages.equals(other.getFreeMMSMessages()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.calls==null && other.getCalls()==null) || 
             (this.calls!=null &&
              this.calls.equals(other.getCalls()))) &&
            ((this.postPaidBalace==null && other.getPostPaidBalace()==null) || 
             (this.postPaidBalace!=null &&
              this.postPaidBalace.equals(other.getPostPaidBalace()))) &&
            ((this.airTimeUnlimitedYN==null && other.getAirTimeUnlimitedYN()==null) || 
             (this.airTimeUnlimitedYN!=null &&
              this.airTimeUnlimitedYN.equals(other.getAirTimeUnlimitedYN()))) &&
            ((this.smsUnlimitedYN==null && other.getSmsUnlimitedYN()==null) || 
             (this.smsUnlimitedYN!=null &&
              this.smsUnlimitedYN.equals(other.getSmsUnlimitedYN()))) &&
            ((this.mmsUnlimitedYN==null && other.getMmsUnlimitedYN()==null) || 
             (this.mmsUnlimitedYN!=null &&
              this.mmsUnlimitedYN.equals(other.getMmsUnlimitedYN()))) &&
            ((this.dataUnlimitedYN==null && other.getDataUnlimitedYN()==null) || 
             (this.dataUnlimitedYN!=null &&
              this.dataUnlimitedYN.equals(other.getDataUnlimitedYN())));
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
        if (getPrepaidAccountBalance() != null) {
            _hashCode += getPrepaidAccountBalance().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getBucketAccountBalance() != null) {
            _hashCode += getBucketAccountBalance().hashCode();
        }
        if (getThresholdBalance() != null) {
            _hashCode += getThresholdBalance().hashCode();
        }
        if (getPromoBalance() != null) {
            _hashCode += getPromoBalance().hashCode();
        }
        if (getTotalBalance() != null) {
            _hashCode += getTotalBalance().hashCode();
        }
        if (getAirtimeMinutes() != null) {
            _hashCode += getAirtimeMinutes().hashCode();
        }
        if (getFreeSMSMessages() != null) {
            _hashCode += getFreeSMSMessages().hashCode();
        }
        if (getFreeSMSRuppes() != null) {
            _hashCode += getFreeSMSRuppes().hashCode();
        }
        if (getFreeMMSMessages() != null) {
            _hashCode += getFreeMMSMessages().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getCalls() != null) {
            _hashCode += getCalls().hashCode();
        }
        if (getPostPaidBalace() != null) {
            _hashCode += getPostPaidBalace().hashCode();
        }
        if (getAirTimeUnlimitedYN() != null) {
            _hashCode += getAirTimeUnlimitedYN().hashCode();
        }
        if (getSmsUnlimitedYN() != null) {
            _hashCode += getSmsUnlimitedYN().hashCode();
        }
        if (getMmsUnlimitedYN() != null) {
            _hashCode += getMmsUnlimitedYN().hashCode();
        }
        if (getDataUnlimitedYN() != null) {
            _hashCode += getDataUnlimitedYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BalanceInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "prepaidAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketAccountBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "bucketAccountBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "thresholdBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "promoBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "totalBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airtimeMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "airtimeMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSMSMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "freeSMSMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeSMSRuppes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "freeSMSRuppes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeMMSMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "freeMMSMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "calls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postPaidBalace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "postPaidBalace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTimeUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "airTimeUnlimitedYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "smsUnlimitedYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mmsUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "mmsUnlimitedYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUnlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "dataUnlimitedYN"));
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
