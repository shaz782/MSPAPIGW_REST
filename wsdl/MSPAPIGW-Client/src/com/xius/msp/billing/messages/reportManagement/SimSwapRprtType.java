/**
 * SimSwapRprtType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.reportManagement;

public class SimSwapRprtType  implements java.io.Serializable {
    private java.lang.String loginId;

    private java.math.BigDecimal oldMSISDNBal;

    private java.math.BigDecimal newMSISDNBal;

    private java.math.BigDecimal finalBal;

    private java.lang.Long oldMSISDN;

    private java.lang.Long newMSISDN;

    private java.lang.String oldSim;

    private java.lang.String newSim;

    private java.lang.Long oldIMSI;

    private java.lang.Long newIMSI;

    private java.lang.Long oldAcctId;

    private java.lang.Long newAcctId;

    private java.lang.String date;

    private java.lang.String time;

    private java.lang.String userId;

    private java.lang.Integer charge;

    private com.xius.msp.billing.messages.reportManagement.TaxType taxType;

    public SimSwapRprtType() {
    }

    public SimSwapRprtType(
           java.lang.String loginId,
           java.math.BigDecimal oldMSISDNBal,
           java.math.BigDecimal newMSISDNBal,
           java.math.BigDecimal finalBal,
           java.lang.Long oldMSISDN,
           java.lang.Long newMSISDN,
           java.lang.String oldSim,
           java.lang.String newSim,
           java.lang.Long oldIMSI,
           java.lang.Long newIMSI,
           java.lang.Long oldAcctId,
           java.lang.Long newAcctId,
           java.lang.String date,
           java.lang.String time,
           java.lang.String userId,
           java.lang.Integer charge,
           com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
           this.loginId = loginId;
           this.oldMSISDNBal = oldMSISDNBal;
           this.newMSISDNBal = newMSISDNBal;
           this.finalBal = finalBal;
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.oldSim = oldSim;
           this.newSim = newSim;
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.oldAcctId = oldAcctId;
           this.newAcctId = newAcctId;
           this.date = date;
           this.time = time;
           this.userId = userId;
           this.charge = charge;
           this.taxType = taxType;
    }


    /**
     * Gets the loginId value for this SimSwapRprtType.
     * 
     * @return loginId
     */
    public java.lang.String getLoginId() {
        return loginId;
    }


    /**
     * Sets the loginId value for this SimSwapRprtType.
     * 
     * @param loginId
     */
    public void setLoginId(java.lang.String loginId) {
        this.loginId = loginId;
    }


    /**
     * Gets the oldMSISDNBal value for this SimSwapRprtType.
     * 
     * @return oldMSISDNBal
     */
    public java.math.BigDecimal getOldMSISDNBal() {
        return oldMSISDNBal;
    }


    /**
     * Sets the oldMSISDNBal value for this SimSwapRprtType.
     * 
     * @param oldMSISDNBal
     */
    public void setOldMSISDNBal(java.math.BigDecimal oldMSISDNBal) {
        this.oldMSISDNBal = oldMSISDNBal;
    }


    /**
     * Gets the newMSISDNBal value for this SimSwapRprtType.
     * 
     * @return newMSISDNBal
     */
    public java.math.BigDecimal getNewMSISDNBal() {
        return newMSISDNBal;
    }


    /**
     * Sets the newMSISDNBal value for this SimSwapRprtType.
     * 
     * @param newMSISDNBal
     */
    public void setNewMSISDNBal(java.math.BigDecimal newMSISDNBal) {
        this.newMSISDNBal = newMSISDNBal;
    }


    /**
     * Gets the finalBal value for this SimSwapRprtType.
     * 
     * @return finalBal
     */
    public java.math.BigDecimal getFinalBal() {
        return finalBal;
    }


    /**
     * Sets the finalBal value for this SimSwapRprtType.
     * 
     * @param finalBal
     */
    public void setFinalBal(java.math.BigDecimal finalBal) {
        this.finalBal = finalBal;
    }


    /**
     * Gets the oldMSISDN value for this SimSwapRprtType.
     * 
     * @return oldMSISDN
     */
    public java.lang.Long getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this SimSwapRprtType.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.Long oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this SimSwapRprtType.
     * 
     * @return newMSISDN
     */
    public java.lang.Long getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this SimSwapRprtType.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.Long newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the oldSim value for this SimSwapRprtType.
     * 
     * @return oldSim
     */
    public java.lang.String getOldSim() {
        return oldSim;
    }


    /**
     * Sets the oldSim value for this SimSwapRprtType.
     * 
     * @param oldSim
     */
    public void setOldSim(java.lang.String oldSim) {
        this.oldSim = oldSim;
    }


    /**
     * Gets the newSim value for this SimSwapRprtType.
     * 
     * @return newSim
     */
    public java.lang.String getNewSim() {
        return newSim;
    }


    /**
     * Sets the newSim value for this SimSwapRprtType.
     * 
     * @param newSim
     */
    public void setNewSim(java.lang.String newSim) {
        this.newSim = newSim;
    }


    /**
     * Gets the oldIMSI value for this SimSwapRprtType.
     * 
     * @return oldIMSI
     */
    public java.lang.Long getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this SimSwapRprtType.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.Long oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this SimSwapRprtType.
     * 
     * @return newIMSI
     */
    public java.lang.Long getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this SimSwapRprtType.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.Long newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the oldAcctId value for this SimSwapRprtType.
     * 
     * @return oldAcctId
     */
    public java.lang.Long getOldAcctId() {
        return oldAcctId;
    }


    /**
     * Sets the oldAcctId value for this SimSwapRprtType.
     * 
     * @param oldAcctId
     */
    public void setOldAcctId(java.lang.Long oldAcctId) {
        this.oldAcctId = oldAcctId;
    }


    /**
     * Gets the newAcctId value for this SimSwapRprtType.
     * 
     * @return newAcctId
     */
    public java.lang.Long getNewAcctId() {
        return newAcctId;
    }


    /**
     * Sets the newAcctId value for this SimSwapRprtType.
     * 
     * @param newAcctId
     */
    public void setNewAcctId(java.lang.Long newAcctId) {
        this.newAcctId = newAcctId;
    }


    /**
     * Gets the date value for this SimSwapRprtType.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this SimSwapRprtType.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the time value for this SimSwapRprtType.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this SimSwapRprtType.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the userId value for this SimSwapRprtType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SimSwapRprtType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the charge value for this SimSwapRprtType.
     * 
     * @return charge
     */
    public java.lang.Integer getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this SimSwapRprtType.
     * 
     * @param charge
     */
    public void setCharge(java.lang.Integer charge) {
        this.charge = charge;
    }


    /**
     * Gets the taxType value for this SimSwapRprtType.
     * 
     * @return taxType
     */
    public com.xius.msp.billing.messages.reportManagement.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this SimSwapRprtType.
     * 
     * @param taxType
     */
    public void setTaxType(com.xius.msp.billing.messages.reportManagement.TaxType taxType) {
        this.taxType = taxType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimSwapRprtType)) return false;
        SimSwapRprtType other = (SimSwapRprtType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginId==null && other.getLoginId()==null) || 
             (this.loginId!=null &&
              this.loginId.equals(other.getLoginId()))) &&
            ((this.oldMSISDNBal==null && other.getOldMSISDNBal()==null) || 
             (this.oldMSISDNBal!=null &&
              this.oldMSISDNBal.equals(other.getOldMSISDNBal()))) &&
            ((this.newMSISDNBal==null && other.getNewMSISDNBal()==null) || 
             (this.newMSISDNBal!=null &&
              this.newMSISDNBal.equals(other.getNewMSISDNBal()))) &&
            ((this.finalBal==null && other.getFinalBal()==null) || 
             (this.finalBal!=null &&
              this.finalBal.equals(other.getFinalBal()))) &&
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.oldSim==null && other.getOldSim()==null) || 
             (this.oldSim!=null &&
              this.oldSim.equals(other.getOldSim()))) &&
            ((this.newSim==null && other.getNewSim()==null) || 
             (this.newSim!=null &&
              this.newSim.equals(other.getNewSim()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.oldAcctId==null && other.getOldAcctId()==null) || 
             (this.oldAcctId!=null &&
              this.oldAcctId.equals(other.getOldAcctId()))) &&
            ((this.newAcctId==null && other.getNewAcctId()==null) || 
             (this.newAcctId!=null &&
              this.newAcctId.equals(other.getNewAcctId()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
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
        if (getLoginId() != null) {
            _hashCode += getLoginId().hashCode();
        }
        if (getOldMSISDNBal() != null) {
            _hashCode += getOldMSISDNBal().hashCode();
        }
        if (getNewMSISDNBal() != null) {
            _hashCode += getNewMSISDNBal().hashCode();
        }
        if (getFinalBal() != null) {
            _hashCode += getFinalBal().hashCode();
        }
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getOldSim() != null) {
            _hashCode += getOldSim().hashCode();
        }
        if (getNewSim() != null) {
            _hashCode += getNewSim().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getOldAcctId() != null) {
            _hashCode += getOldAcctId().hashCode();
        }
        if (getNewAcctId() != null) {
            _hashCode += getNewAcctId().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimSwapRprtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapRprtType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "loginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDNBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldMSISDNBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDNBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newMSISDNBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalBal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "finalBal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldSim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newSim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "oldAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "newAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "time"));
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
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
