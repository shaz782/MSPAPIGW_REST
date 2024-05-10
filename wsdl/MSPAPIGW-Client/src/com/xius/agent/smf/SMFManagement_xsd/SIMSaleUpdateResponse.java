/**
 * SIMSaleUpdateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_xsd;

public class SIMSaleUpdateResponse  implements java.io.Serializable {
    private java.lang.String oldMSISDN;

    private java.lang.String newMSISDN;

    private java.lang.String activityType;

    private java.lang.String message;

    private java.lang.String oldSIM;

    private java.lang.String newSIM;

    private java.lang.String oldIMSI;

    private java.lang.String newIMSI;

    private java.lang.Long networkId;

    private java.lang.String userId;

    private com.xius.agent.smf.SMFManagement_xsd.Roamingdtlstype[] roamingdtls;

    private java.lang.String atpUnSubsFlag;

    public SIMSaleUpdateResponse() {
    }

    public SIMSaleUpdateResponse(
           java.lang.String oldMSISDN,
           java.lang.String newMSISDN,
           java.lang.String activityType,
           java.lang.String message,
           java.lang.String oldSIM,
           java.lang.String newSIM,
           java.lang.String oldIMSI,
           java.lang.String newIMSI,
           java.lang.Long networkId,
           java.lang.String userId,
           com.xius.agent.smf.SMFManagement_xsd.Roamingdtlstype[] roamingdtls,
           java.lang.String atpUnSubsFlag) {
           this.oldMSISDN = oldMSISDN;
           this.newMSISDN = newMSISDN;
           this.activityType = activityType;
           this.message = message;
           this.oldSIM = oldSIM;
           this.newSIM = newSIM;
           this.oldIMSI = oldIMSI;
           this.newIMSI = newIMSI;
           this.networkId = networkId;
           this.userId = userId;
           this.roamingdtls = roamingdtls;
           this.atpUnSubsFlag = atpUnSubsFlag;
    }


    /**
     * Gets the oldMSISDN value for this SIMSaleUpdateResponse.
     * 
     * @return oldMSISDN
     */
    public java.lang.String getOldMSISDN() {
        return oldMSISDN;
    }


    /**
     * Sets the oldMSISDN value for this SIMSaleUpdateResponse.
     * 
     * @param oldMSISDN
     */
    public void setOldMSISDN(java.lang.String oldMSISDN) {
        this.oldMSISDN = oldMSISDN;
    }


    /**
     * Gets the newMSISDN value for this SIMSaleUpdateResponse.
     * 
     * @return newMSISDN
     */
    public java.lang.String getNewMSISDN() {
        return newMSISDN;
    }


    /**
     * Sets the newMSISDN value for this SIMSaleUpdateResponse.
     * 
     * @param newMSISDN
     */
    public void setNewMSISDN(java.lang.String newMSISDN) {
        this.newMSISDN = newMSISDN;
    }


    /**
     * Gets the activityType value for this SIMSaleUpdateResponse.
     * 
     * @return activityType
     */
    public java.lang.String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this SIMSaleUpdateResponse.
     * 
     * @param activityType
     */
    public void setActivityType(java.lang.String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the message value for this SIMSaleUpdateResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SIMSaleUpdateResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the oldSIM value for this SIMSaleUpdateResponse.
     * 
     * @return oldSIM
     */
    public java.lang.String getOldSIM() {
        return oldSIM;
    }


    /**
     * Sets the oldSIM value for this SIMSaleUpdateResponse.
     * 
     * @param oldSIM
     */
    public void setOldSIM(java.lang.String oldSIM) {
        this.oldSIM = oldSIM;
    }


    /**
     * Gets the newSIM value for this SIMSaleUpdateResponse.
     * 
     * @return newSIM
     */
    public java.lang.String getNewSIM() {
        return newSIM;
    }


    /**
     * Sets the newSIM value for this SIMSaleUpdateResponse.
     * 
     * @param newSIM
     */
    public void setNewSIM(java.lang.String newSIM) {
        this.newSIM = newSIM;
    }


    /**
     * Gets the oldIMSI value for this SIMSaleUpdateResponse.
     * 
     * @return oldIMSI
     */
    public java.lang.String getOldIMSI() {
        return oldIMSI;
    }


    /**
     * Sets the oldIMSI value for this SIMSaleUpdateResponse.
     * 
     * @param oldIMSI
     */
    public void setOldIMSI(java.lang.String oldIMSI) {
        this.oldIMSI = oldIMSI;
    }


    /**
     * Gets the newIMSI value for this SIMSaleUpdateResponse.
     * 
     * @return newIMSI
     */
    public java.lang.String getNewIMSI() {
        return newIMSI;
    }


    /**
     * Sets the newIMSI value for this SIMSaleUpdateResponse.
     * 
     * @param newIMSI
     */
    public void setNewIMSI(java.lang.String newIMSI) {
        this.newIMSI = newIMSI;
    }


    /**
     * Gets the networkId value for this SIMSaleUpdateResponse.
     * 
     * @return networkId
     */
    public java.lang.Long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this SIMSaleUpdateResponse.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.Long networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the userId value for this SIMSaleUpdateResponse.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SIMSaleUpdateResponse.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the roamingdtls value for this SIMSaleUpdateResponse.
     * 
     * @return roamingdtls
     */
    public com.xius.agent.smf.SMFManagement_xsd.Roamingdtlstype[] getRoamingdtls() {
        return roamingdtls;
    }


    /**
     * Sets the roamingdtls value for this SIMSaleUpdateResponse.
     * 
     * @param roamingdtls
     */
    public void setRoamingdtls(com.xius.agent.smf.SMFManagement_xsd.Roamingdtlstype[] roamingdtls) {
        this.roamingdtls = roamingdtls;
    }

    public com.xius.agent.smf.SMFManagement_xsd.Roamingdtlstype getRoamingdtls(int i) {
        return this.roamingdtls[i];
    }

    public void setRoamingdtls(int i, com.xius.agent.smf.SMFManagement_xsd.Roamingdtlstype _value) {
        this.roamingdtls[i] = _value;
    }


    /**
     * Gets the atpUnSubsFlag value for this SIMSaleUpdateResponse.
     * 
     * @return atpUnSubsFlag
     */
    public java.lang.String getAtpUnSubsFlag() {
        return atpUnSubsFlag;
    }


    /**
     * Sets the atpUnSubsFlag value for this SIMSaleUpdateResponse.
     * 
     * @param atpUnSubsFlag
     */
    public void setAtpUnSubsFlag(java.lang.String atpUnSubsFlag) {
        this.atpUnSubsFlag = atpUnSubsFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIMSaleUpdateResponse)) return false;
        SIMSaleUpdateResponse other = (SIMSaleUpdateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oldMSISDN==null && other.getOldMSISDN()==null) || 
             (this.oldMSISDN!=null &&
              this.oldMSISDN.equals(other.getOldMSISDN()))) &&
            ((this.newMSISDN==null && other.getNewMSISDN()==null) || 
             (this.newMSISDN!=null &&
              this.newMSISDN.equals(other.getNewMSISDN()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.oldSIM==null && other.getOldSIM()==null) || 
             (this.oldSIM!=null &&
              this.oldSIM.equals(other.getOldSIM()))) &&
            ((this.newSIM==null && other.getNewSIM()==null) || 
             (this.newSIM!=null &&
              this.newSIM.equals(other.getNewSIM()))) &&
            ((this.oldIMSI==null && other.getOldIMSI()==null) || 
             (this.oldIMSI!=null &&
              this.oldIMSI.equals(other.getOldIMSI()))) &&
            ((this.newIMSI==null && other.getNewIMSI()==null) || 
             (this.newIMSI!=null &&
              this.newIMSI.equals(other.getNewIMSI()))) &&
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.roamingdtls==null && other.getRoamingdtls()==null) || 
             (this.roamingdtls!=null &&
              java.util.Arrays.equals(this.roamingdtls, other.getRoamingdtls()))) &&
            ((this.atpUnSubsFlag==null && other.getAtpUnSubsFlag()==null) || 
             (this.atpUnSubsFlag!=null &&
              this.atpUnSubsFlag.equals(other.getAtpUnSubsFlag())));
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
        if (getOldMSISDN() != null) {
            _hashCode += getOldMSISDN().hashCode();
        }
        if (getNewMSISDN() != null) {
            _hashCode += getNewMSISDN().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getOldSIM() != null) {
            _hashCode += getOldSIM().hashCode();
        }
        if (getNewSIM() != null) {
            _hashCode += getNewSIM().hashCode();
        }
        if (getOldIMSI() != null) {
            _hashCode += getOldIMSI().hashCode();
        }
        if (getNewIMSI() != null) {
            _hashCode += getNewIMSI().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getRoamingdtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoamingdtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoamingdtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAtpUnSubsFlag() != null) {
            _hashCode += getAtpUnSubsFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIMSaleUpdateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newMSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newMSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ActivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "oldIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "newIMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingdtls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "roamingdtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "roamingdtlstype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atpUnSubsFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "atpUnSubsFlag"));
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
