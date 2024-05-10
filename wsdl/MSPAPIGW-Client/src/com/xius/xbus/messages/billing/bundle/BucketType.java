/**
 * BucketType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.messages.billing.bundle;

public class BucketType  implements java.io.Serializable {
    private java.lang.String bucketId;

    private java.lang.String bucketName;

    private java.lang.String buckettype;

    private java.math.BigDecimal currentbalance;

    private java.lang.String expirationdate;

    private java.lang.String assignedDate;

    private java.lang.String balancecategory;

    private java.lang.Long duration;

    private java.lang.String validityDays;

    private java.lang.String iterativeFlag;

    private java.lang.String iterativeCount;

    private java.lang.String rollOverFlag;

    private java.lang.String extendValidityFlag;

    private java.lang.Long deviceGroupId;

    private java.lang.String deviceGroupName;

    private java.lang.Long dataZoneGroupId;

    private java.lang.String dataZoneGroupName;

    private java.lang.String unlimitedYN;

    private java.lang.String accumulatorName;

    private java.lang.String priority;

    private java.lang.String isPromo;

    public BucketType() {
    }

    public BucketType(
           java.lang.String bucketId,
           java.lang.String bucketName,
           java.lang.String buckettype,
           java.math.BigDecimal currentbalance,
           java.lang.String expirationdate,
           java.lang.String assignedDate,
           java.lang.String balancecategory,
           java.lang.Long duration,
           java.lang.String validityDays,
           java.lang.String iterativeFlag,
           java.lang.String iterativeCount,
           java.lang.String rollOverFlag,
           java.lang.String extendValidityFlag,
           java.lang.Long deviceGroupId,
           java.lang.String deviceGroupName,
           java.lang.Long dataZoneGroupId,
           java.lang.String dataZoneGroupName,
           java.lang.String unlimitedYN,
           java.lang.String accumulatorName,
           java.lang.String priority,
           java.lang.String isPromo) {
           this.bucketId = bucketId;
           this.bucketName = bucketName;
           this.buckettype = buckettype;
           this.currentbalance = currentbalance;
           this.expirationdate = expirationdate;
           this.assignedDate = assignedDate;
           this.balancecategory = balancecategory;
           this.duration = duration;
           this.validityDays = validityDays;
           this.iterativeFlag = iterativeFlag;
           this.iterativeCount = iterativeCount;
           this.rollOverFlag = rollOverFlag;
           this.extendValidityFlag = extendValidityFlag;
           this.deviceGroupId = deviceGroupId;
           this.deviceGroupName = deviceGroupName;
           this.dataZoneGroupId = dataZoneGroupId;
           this.dataZoneGroupName = dataZoneGroupName;
           this.unlimitedYN = unlimitedYN;
           this.accumulatorName = accumulatorName;
           this.priority = priority;
           this.isPromo = isPromo;
    }


    /**
     * Gets the bucketId value for this BucketType.
     * 
     * @return bucketId
     */
    public java.lang.String getBucketId() {
        return bucketId;
    }


    /**
     * Sets the bucketId value for this BucketType.
     * 
     * @param bucketId
     */
    public void setBucketId(java.lang.String bucketId) {
        this.bucketId = bucketId;
    }


    /**
     * Gets the bucketName value for this BucketType.
     * 
     * @return bucketName
     */
    public java.lang.String getBucketName() {
        return bucketName;
    }


    /**
     * Sets the bucketName value for this BucketType.
     * 
     * @param bucketName
     */
    public void setBucketName(java.lang.String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * Gets the buckettype value for this BucketType.
     * 
     * @return buckettype
     */
    public java.lang.String getBuckettype() {
        return buckettype;
    }


    /**
     * Sets the buckettype value for this BucketType.
     * 
     * @param buckettype
     */
    public void setBuckettype(java.lang.String buckettype) {
        this.buckettype = buckettype;
    }


    /**
     * Gets the currentbalance value for this BucketType.
     * 
     * @return currentbalance
     */
    public java.math.BigDecimal getCurrentbalance() {
        return currentbalance;
    }


    /**
     * Sets the currentbalance value for this BucketType.
     * 
     * @param currentbalance
     */
    public void setCurrentbalance(java.math.BigDecimal currentbalance) {
        this.currentbalance = currentbalance;
    }


    /**
     * Gets the expirationdate value for this BucketType.
     * 
     * @return expirationdate
     */
    public java.lang.String getExpirationdate() {
        return expirationdate;
    }


    /**
     * Sets the expirationdate value for this BucketType.
     * 
     * @param expirationdate
     */
    public void setExpirationdate(java.lang.String expirationdate) {
        this.expirationdate = expirationdate;
    }


    /**
     * Gets the assignedDate value for this BucketType.
     * 
     * @return assignedDate
     */
    public java.lang.String getAssignedDate() {
        return assignedDate;
    }


    /**
     * Sets the assignedDate value for this BucketType.
     * 
     * @param assignedDate
     */
    public void setAssignedDate(java.lang.String assignedDate) {
        this.assignedDate = assignedDate;
    }


    /**
     * Gets the balancecategory value for this BucketType.
     * 
     * @return balancecategory
     */
    public java.lang.String getBalancecategory() {
        return balancecategory;
    }


    /**
     * Sets the balancecategory value for this BucketType.
     * 
     * @param balancecategory
     */
    public void setBalancecategory(java.lang.String balancecategory) {
        this.balancecategory = balancecategory;
    }


    /**
     * Gets the duration value for this BucketType.
     * 
     * @return duration
     */
    public java.lang.Long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this BucketType.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Long duration) {
        this.duration = duration;
    }


    /**
     * Gets the validityDays value for this BucketType.
     * 
     * @return validityDays
     */
    public java.lang.String getValidityDays() {
        return validityDays;
    }


    /**
     * Sets the validityDays value for this BucketType.
     * 
     * @param validityDays
     */
    public void setValidityDays(java.lang.String validityDays) {
        this.validityDays = validityDays;
    }


    /**
     * Gets the iterativeFlag value for this BucketType.
     * 
     * @return iterativeFlag
     */
    public java.lang.String getIterativeFlag() {
        return iterativeFlag;
    }


    /**
     * Sets the iterativeFlag value for this BucketType.
     * 
     * @param iterativeFlag
     */
    public void setIterativeFlag(java.lang.String iterativeFlag) {
        this.iterativeFlag = iterativeFlag;
    }


    /**
     * Gets the iterativeCount value for this BucketType.
     * 
     * @return iterativeCount
     */
    public java.lang.String getIterativeCount() {
        return iterativeCount;
    }


    /**
     * Sets the iterativeCount value for this BucketType.
     * 
     * @param iterativeCount
     */
    public void setIterativeCount(java.lang.String iterativeCount) {
        this.iterativeCount = iterativeCount;
    }


    /**
     * Gets the rollOverFlag value for this BucketType.
     * 
     * @return rollOverFlag
     */
    public java.lang.String getRollOverFlag() {
        return rollOverFlag;
    }


    /**
     * Sets the rollOverFlag value for this BucketType.
     * 
     * @param rollOverFlag
     */
    public void setRollOverFlag(java.lang.String rollOverFlag) {
        this.rollOverFlag = rollOverFlag;
    }


    /**
     * Gets the extendValidityFlag value for this BucketType.
     * 
     * @return extendValidityFlag
     */
    public java.lang.String getExtendValidityFlag() {
        return extendValidityFlag;
    }


    /**
     * Sets the extendValidityFlag value for this BucketType.
     * 
     * @param extendValidityFlag
     */
    public void setExtendValidityFlag(java.lang.String extendValidityFlag) {
        this.extendValidityFlag = extendValidityFlag;
    }


    /**
     * Gets the deviceGroupId value for this BucketType.
     * 
     * @return deviceGroupId
     */
    public java.lang.Long getDeviceGroupId() {
        return deviceGroupId;
    }


    /**
     * Sets the deviceGroupId value for this BucketType.
     * 
     * @param deviceGroupId
     */
    public void setDeviceGroupId(java.lang.Long deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }


    /**
     * Gets the deviceGroupName value for this BucketType.
     * 
     * @return deviceGroupName
     */
    public java.lang.String getDeviceGroupName() {
        return deviceGroupName;
    }


    /**
     * Sets the deviceGroupName value for this BucketType.
     * 
     * @param deviceGroupName
     */
    public void setDeviceGroupName(java.lang.String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
    }


    /**
     * Gets the dataZoneGroupId value for this BucketType.
     * 
     * @return dataZoneGroupId
     */
    public java.lang.Long getDataZoneGroupId() {
        return dataZoneGroupId;
    }


    /**
     * Sets the dataZoneGroupId value for this BucketType.
     * 
     * @param dataZoneGroupId
     */
    public void setDataZoneGroupId(java.lang.Long dataZoneGroupId) {
        this.dataZoneGroupId = dataZoneGroupId;
    }


    /**
     * Gets the dataZoneGroupName value for this BucketType.
     * 
     * @return dataZoneGroupName
     */
    public java.lang.String getDataZoneGroupName() {
        return dataZoneGroupName;
    }


    /**
     * Sets the dataZoneGroupName value for this BucketType.
     * 
     * @param dataZoneGroupName
     */
    public void setDataZoneGroupName(java.lang.String dataZoneGroupName) {
        this.dataZoneGroupName = dataZoneGroupName;
    }


    /**
     * Gets the unlimitedYN value for this BucketType.
     * 
     * @return unlimitedYN
     */
    public java.lang.String getUnlimitedYN() {
        return unlimitedYN;
    }


    /**
     * Sets the unlimitedYN value for this BucketType.
     * 
     * @param unlimitedYN
     */
    public void setUnlimitedYN(java.lang.String unlimitedYN) {
        this.unlimitedYN = unlimitedYN;
    }


    /**
     * Gets the accumulatorName value for this BucketType.
     * 
     * @return accumulatorName
     */
    public java.lang.String getAccumulatorName() {
        return accumulatorName;
    }


    /**
     * Sets the accumulatorName value for this BucketType.
     * 
     * @param accumulatorName
     */
    public void setAccumulatorName(java.lang.String accumulatorName) {
        this.accumulatorName = accumulatorName;
    }


    /**
     * Gets the priority value for this BucketType.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this BucketType.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the isPromo value for this BucketType.
     * 
     * @return isPromo
     */
    public java.lang.String getIsPromo() {
        return isPromo;
    }


    /**
     * Sets the isPromo value for this BucketType.
     * 
     * @param isPromo
     */
    public void setIsPromo(java.lang.String isPromo) {
        this.isPromo = isPromo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BucketType)) return false;
        BucketType other = (BucketType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bucketId==null && other.getBucketId()==null) || 
             (this.bucketId!=null &&
              this.bucketId.equals(other.getBucketId()))) &&
            ((this.bucketName==null && other.getBucketName()==null) || 
             (this.bucketName!=null &&
              this.bucketName.equals(other.getBucketName()))) &&
            ((this.buckettype==null && other.getBuckettype()==null) || 
             (this.buckettype!=null &&
              this.buckettype.equals(other.getBuckettype()))) &&
            ((this.currentbalance==null && other.getCurrentbalance()==null) || 
             (this.currentbalance!=null &&
              this.currentbalance.equals(other.getCurrentbalance()))) &&
            ((this.expirationdate==null && other.getExpirationdate()==null) || 
             (this.expirationdate!=null &&
              this.expirationdate.equals(other.getExpirationdate()))) &&
            ((this.assignedDate==null && other.getAssignedDate()==null) || 
             (this.assignedDate!=null &&
              this.assignedDate.equals(other.getAssignedDate()))) &&
            ((this.balancecategory==null && other.getBalancecategory()==null) || 
             (this.balancecategory!=null &&
              this.balancecategory.equals(other.getBalancecategory()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.validityDays==null && other.getValidityDays()==null) || 
             (this.validityDays!=null &&
              this.validityDays.equals(other.getValidityDays()))) &&
            ((this.iterativeFlag==null && other.getIterativeFlag()==null) || 
             (this.iterativeFlag!=null &&
              this.iterativeFlag.equals(other.getIterativeFlag()))) &&
            ((this.iterativeCount==null && other.getIterativeCount()==null) || 
             (this.iterativeCount!=null &&
              this.iterativeCount.equals(other.getIterativeCount()))) &&
            ((this.rollOverFlag==null && other.getRollOverFlag()==null) || 
             (this.rollOverFlag!=null &&
              this.rollOverFlag.equals(other.getRollOverFlag()))) &&
            ((this.extendValidityFlag==null && other.getExtendValidityFlag()==null) || 
             (this.extendValidityFlag!=null &&
              this.extendValidityFlag.equals(other.getExtendValidityFlag()))) &&
            ((this.deviceGroupId==null && other.getDeviceGroupId()==null) || 
             (this.deviceGroupId!=null &&
              this.deviceGroupId.equals(other.getDeviceGroupId()))) &&
            ((this.deviceGroupName==null && other.getDeviceGroupName()==null) || 
             (this.deviceGroupName!=null &&
              this.deviceGroupName.equals(other.getDeviceGroupName()))) &&
            ((this.dataZoneGroupId==null && other.getDataZoneGroupId()==null) || 
             (this.dataZoneGroupId!=null &&
              this.dataZoneGroupId.equals(other.getDataZoneGroupId()))) &&
            ((this.dataZoneGroupName==null && other.getDataZoneGroupName()==null) || 
             (this.dataZoneGroupName!=null &&
              this.dataZoneGroupName.equals(other.getDataZoneGroupName()))) &&
            ((this.unlimitedYN==null && other.getUnlimitedYN()==null) || 
             (this.unlimitedYN!=null &&
              this.unlimitedYN.equals(other.getUnlimitedYN()))) &&
            ((this.accumulatorName==null && other.getAccumulatorName()==null) || 
             (this.accumulatorName!=null &&
              this.accumulatorName.equals(other.getAccumulatorName()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.isPromo==null && other.getIsPromo()==null) || 
             (this.isPromo!=null &&
              this.isPromo.equals(other.getIsPromo())));
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
        if (getBucketId() != null) {
            _hashCode += getBucketId().hashCode();
        }
        if (getBucketName() != null) {
            _hashCode += getBucketName().hashCode();
        }
        if (getBuckettype() != null) {
            _hashCode += getBuckettype().hashCode();
        }
        if (getCurrentbalance() != null) {
            _hashCode += getCurrentbalance().hashCode();
        }
        if (getExpirationdate() != null) {
            _hashCode += getExpirationdate().hashCode();
        }
        if (getAssignedDate() != null) {
            _hashCode += getAssignedDate().hashCode();
        }
        if (getBalancecategory() != null) {
            _hashCode += getBalancecategory().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getValidityDays() != null) {
            _hashCode += getValidityDays().hashCode();
        }
        if (getIterativeFlag() != null) {
            _hashCode += getIterativeFlag().hashCode();
        }
        if (getIterativeCount() != null) {
            _hashCode += getIterativeCount().hashCode();
        }
        if (getRollOverFlag() != null) {
            _hashCode += getRollOverFlag().hashCode();
        }
        if (getExtendValidityFlag() != null) {
            _hashCode += getExtendValidityFlag().hashCode();
        }
        if (getDeviceGroupId() != null) {
            _hashCode += getDeviceGroupId().hashCode();
        }
        if (getDeviceGroupName() != null) {
            _hashCode += getDeviceGroupName().hashCode();
        }
        if (getDataZoneGroupId() != null) {
            _hashCode += getDataZoneGroupId().hashCode();
        }
        if (getDataZoneGroupName() != null) {
            _hashCode += getDataZoneGroupName().hashCode();
        }
        if (getUnlimitedYN() != null) {
            _hashCode += getUnlimitedYN().hashCode();
        }
        if (getAccumulatorName() != null) {
            _hashCode += getAccumulatorName().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIsPromo() != null) {
            _hashCode += getIsPromo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BucketType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buckettype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "buckettype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "currentbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "expirationdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "assignedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balancecategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "balancecategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "validityDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterativeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "iterativeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterativeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "iterativeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollOverFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "rollOverFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendValidityFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "extendValidityFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "deviceGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "deviceGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "dataZoneGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataZoneGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "dataZoneGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "unlimitedYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "accumulatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPromo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "isPromo"));
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
