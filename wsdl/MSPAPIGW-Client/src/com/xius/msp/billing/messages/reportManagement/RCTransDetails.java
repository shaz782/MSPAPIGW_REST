/**
 * RCTransDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class RCTransDetails  implements java.io.Serializable {
    private java.lang.String rcCode;

    private java.lang.String mrp;

    private java.lang.String rcDesc;

    private java.lang.String transactionDate;

    private java.lang.String status;

    private java.lang.String channel;

    private java.lang.Long rowNum;

    private java.lang.String userDefined1;

    private java.lang.String userDefined2;

    public RCTransDetails() {
    }

    public RCTransDetails(
           java.lang.String rcCode,
           java.lang.String mrp,
           java.lang.String rcDesc,
           java.lang.String transactionDate,
           java.lang.String status,
           java.lang.String channel,
           java.lang.Long rowNum,
           java.lang.String userDefined1,
           java.lang.String userDefined2) {
           this.rcCode = rcCode;
           this.mrp = mrp;
           this.rcDesc = rcDesc;
           this.transactionDate = transactionDate;
           this.status = status;
           this.channel = channel;
           this.rowNum = rowNum;
           this.userDefined1 = userDefined1;
           this.userDefined2 = userDefined2;
    }


    /**
     * Gets the rcCode value for this RCTransDetails.
     * 
     * @return rcCode
     */
    public java.lang.String getRcCode() {
        return rcCode;
    }


    /**
     * Sets the rcCode value for this RCTransDetails.
     * 
     * @param rcCode
     */
    public void setRcCode(java.lang.String rcCode) {
        this.rcCode = rcCode;
    }


    /**
     * Gets the mrp value for this RCTransDetails.
     * 
     * @return mrp
     */
    public java.lang.String getMrp() {
        return mrp;
    }


    /**
     * Sets the mrp value for this RCTransDetails.
     * 
     * @param mrp
     */
    public void setMrp(java.lang.String mrp) {
        this.mrp = mrp;
    }


    /**
     * Gets the rcDesc value for this RCTransDetails.
     * 
     * @return rcDesc
     */
    public java.lang.String getRcDesc() {
        return rcDesc;
    }


    /**
     * Sets the rcDesc value for this RCTransDetails.
     * 
     * @param rcDesc
     */
    public void setRcDesc(java.lang.String rcDesc) {
        this.rcDesc = rcDesc;
    }


    /**
     * Gets the transactionDate value for this RCTransDetails.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this RCTransDetails.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the status value for this RCTransDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RCTransDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the channel value for this RCTransDetails.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this RCTransDetails.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the rowNum value for this RCTransDetails.
     * 
     * @return rowNum
     */
    public java.lang.Long getRowNum() {
        return rowNum;
    }


    /**
     * Sets the rowNum value for this RCTransDetails.
     * 
     * @param rowNum
     */
    public void setRowNum(java.lang.Long rowNum) {
        this.rowNum = rowNum;
    }


    /**
     * Gets the userDefined1 value for this RCTransDetails.
     * 
     * @return userDefined1
     */
    public java.lang.String getUserDefined1() {
        return userDefined1;
    }


    /**
     * Sets the userDefined1 value for this RCTransDetails.
     * 
     * @param userDefined1
     */
    public void setUserDefined1(java.lang.String userDefined1) {
        this.userDefined1 = userDefined1;
    }


    /**
     * Gets the userDefined2 value for this RCTransDetails.
     * 
     * @return userDefined2
     */
    public java.lang.String getUserDefined2() {
        return userDefined2;
    }


    /**
     * Sets the userDefined2 value for this RCTransDetails.
     * 
     * @param userDefined2
     */
    public void setUserDefined2(java.lang.String userDefined2) {
        this.userDefined2 = userDefined2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RCTransDetails)) return false;
        RCTransDetails other = (RCTransDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rcCode==null && other.getRcCode()==null) || 
             (this.rcCode!=null &&
              this.rcCode.equals(other.getRcCode()))) &&
            ((this.mrp==null && other.getMrp()==null) || 
             (this.mrp!=null &&
              this.mrp.equals(other.getMrp()))) &&
            ((this.rcDesc==null && other.getRcDesc()==null) || 
             (this.rcDesc!=null &&
              this.rcDesc.equals(other.getRcDesc()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.rowNum==null && other.getRowNum()==null) || 
             (this.rowNum!=null &&
              this.rowNum.equals(other.getRowNum()))) &&
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
        if (getRcCode() != null) {
            _hashCode += getRcCode().hashCode();
        }
        if (getMrp() != null) {
            _hashCode += getMrp().hashCode();
        }
        if (getRcDesc() != null) {
            _hashCode += getRcDesc().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getRowNum() != null) {
            _hashCode += getRowNum().hashCode();
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
        new org.apache.axis.description.TypeDesc(RCTransDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RCTransDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "mrp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userDefined1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefined2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "userDefined2"));
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
