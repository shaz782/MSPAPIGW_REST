/**
 * AuthenticateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.messages.loginServices;

public class AuthenticateResponse  implements java.io.Serializable {
    private java.lang.String forceChangePassword;

    private java.lang.String managerId;

    private com.xius.msp.billing.messages.loginServices.RoleDataType[] roleList;

    private com.xius.msp.billing.messages.loginServices.PrivilegeDataType[] privList;

    private com.xius.msp.billing.messages.loginServices.ModuleDataType[] modList;

    private java.math.BigInteger networkID;

    private java.lang.String voucherTopUpAllowed;

    private java.lang.String currency;

    private java.lang.String creditDebitMaxLmt;

    private java.lang.String pwdExpWarningYN;

    private java.lang.Long pwdExpWarningDays;

    public AuthenticateResponse() {
    }

    public AuthenticateResponse(
           java.lang.String forceChangePassword,
           java.lang.String managerId,
           com.xius.msp.billing.messages.loginServices.RoleDataType[] roleList,
           com.xius.msp.billing.messages.loginServices.PrivilegeDataType[] privList,
           com.xius.msp.billing.messages.loginServices.ModuleDataType[] modList,
           java.math.BigInteger networkID,
           java.lang.String voucherTopUpAllowed,
           java.lang.String currency,
           java.lang.String creditDebitMaxLmt,
           java.lang.String pwdExpWarningYN,
           java.lang.Long pwdExpWarningDays) {
           this.forceChangePassword = forceChangePassword;
           this.managerId = managerId;
           this.roleList = roleList;
           this.privList = privList;
           this.modList = modList;
           this.networkID = networkID;
           this.voucherTopUpAllowed = voucherTopUpAllowed;
           this.currency = currency;
           this.creditDebitMaxLmt = creditDebitMaxLmt;
           this.pwdExpWarningYN = pwdExpWarningYN;
           this.pwdExpWarningDays = pwdExpWarningDays;
    }


    /**
     * Gets the forceChangePassword value for this AuthenticateResponse.
     * 
     * @return forceChangePassword
     */
    public java.lang.String getForceChangePassword() {
        return forceChangePassword;
    }


    /**
     * Sets the forceChangePassword value for this AuthenticateResponse.
     * 
     * @param forceChangePassword
     */
    public void setForceChangePassword(java.lang.String forceChangePassword) {
        this.forceChangePassword = forceChangePassword;
    }


    /**
     * Gets the managerId value for this AuthenticateResponse.
     * 
     * @return managerId
     */
    public java.lang.String getManagerId() {
        return managerId;
    }


    /**
     * Sets the managerId value for this AuthenticateResponse.
     * 
     * @param managerId
     */
    public void setManagerId(java.lang.String managerId) {
        this.managerId = managerId;
    }


    /**
     * Gets the roleList value for this AuthenticateResponse.
     * 
     * @return roleList
     */
    public com.xius.msp.billing.messages.loginServices.RoleDataType[] getRoleList() {
        return roleList;
    }


    /**
     * Sets the roleList value for this AuthenticateResponse.
     * 
     * @param roleList
     */
    public void setRoleList(com.xius.msp.billing.messages.loginServices.RoleDataType[] roleList) {
        this.roleList = roleList;
    }


    /**
     * Gets the privList value for this AuthenticateResponse.
     * 
     * @return privList
     */
    public com.xius.msp.billing.messages.loginServices.PrivilegeDataType[] getPrivList() {
        return privList;
    }


    /**
     * Sets the privList value for this AuthenticateResponse.
     * 
     * @param privList
     */
    public void setPrivList(com.xius.msp.billing.messages.loginServices.PrivilegeDataType[] privList) {
        this.privList = privList;
    }


    /**
     * Gets the modList value for this AuthenticateResponse.
     * 
     * @return modList
     */
    public com.xius.msp.billing.messages.loginServices.ModuleDataType[] getModList() {
        return modList;
    }


    /**
     * Sets the modList value for this AuthenticateResponse.
     * 
     * @param modList
     */
    public void setModList(com.xius.msp.billing.messages.loginServices.ModuleDataType[] modList) {
        this.modList = modList;
    }


    /**
     * Gets the networkID value for this AuthenticateResponse.
     * 
     * @return networkID
     */
    public java.math.BigInteger getNetworkID() {
        return networkID;
    }


    /**
     * Sets the networkID value for this AuthenticateResponse.
     * 
     * @param networkID
     */
    public void setNetworkID(java.math.BigInteger networkID) {
        this.networkID = networkID;
    }


    /**
     * Gets the voucherTopUpAllowed value for this AuthenticateResponse.
     * 
     * @return voucherTopUpAllowed
     */
    public java.lang.String getVoucherTopUpAllowed() {
        return voucherTopUpAllowed;
    }


    /**
     * Sets the voucherTopUpAllowed value for this AuthenticateResponse.
     * 
     * @param voucherTopUpAllowed
     */
    public void setVoucherTopUpAllowed(java.lang.String voucherTopUpAllowed) {
        this.voucherTopUpAllowed = voucherTopUpAllowed;
    }


    /**
     * Gets the currency value for this AuthenticateResponse.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AuthenticateResponse.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the creditDebitMaxLmt value for this AuthenticateResponse.
     * 
     * @return creditDebitMaxLmt
     */
    public java.lang.String getCreditDebitMaxLmt() {
        return creditDebitMaxLmt;
    }


    /**
     * Sets the creditDebitMaxLmt value for this AuthenticateResponse.
     * 
     * @param creditDebitMaxLmt
     */
    public void setCreditDebitMaxLmt(java.lang.String creditDebitMaxLmt) {
        this.creditDebitMaxLmt = creditDebitMaxLmt;
    }


    /**
     * Gets the pwdExpWarningYN value for this AuthenticateResponse.
     * 
     * @return pwdExpWarningYN
     */
    public java.lang.String getPwdExpWarningYN() {
        return pwdExpWarningYN;
    }


    /**
     * Sets the pwdExpWarningYN value for this AuthenticateResponse.
     * 
     * @param pwdExpWarningYN
     */
    public void setPwdExpWarningYN(java.lang.String pwdExpWarningYN) {
        this.pwdExpWarningYN = pwdExpWarningYN;
    }


    /**
     * Gets the pwdExpWarningDays value for this AuthenticateResponse.
     * 
     * @return pwdExpWarningDays
     */
    public java.lang.Long getPwdExpWarningDays() {
        return pwdExpWarningDays;
    }


    /**
     * Sets the pwdExpWarningDays value for this AuthenticateResponse.
     * 
     * @param pwdExpWarningDays
     */
    public void setPwdExpWarningDays(java.lang.Long pwdExpWarningDays) {
        this.pwdExpWarningDays = pwdExpWarningDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthenticateResponse)) return false;
        AuthenticateResponse other = (AuthenticateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forceChangePassword==null && other.getForceChangePassword()==null) || 
             (this.forceChangePassword!=null &&
              this.forceChangePassword.equals(other.getForceChangePassword()))) &&
            ((this.managerId==null && other.getManagerId()==null) || 
             (this.managerId!=null &&
              this.managerId.equals(other.getManagerId()))) &&
            ((this.roleList==null && other.getRoleList()==null) || 
             (this.roleList!=null &&
              java.util.Arrays.equals(this.roleList, other.getRoleList()))) &&
            ((this.privList==null && other.getPrivList()==null) || 
             (this.privList!=null &&
              java.util.Arrays.equals(this.privList, other.getPrivList()))) &&
            ((this.modList==null && other.getModList()==null) || 
             (this.modList!=null &&
              java.util.Arrays.equals(this.modList, other.getModList()))) &&
            ((this.networkID==null && other.getNetworkID()==null) || 
             (this.networkID!=null &&
              this.networkID.equals(other.getNetworkID()))) &&
            ((this.voucherTopUpAllowed==null && other.getVoucherTopUpAllowed()==null) || 
             (this.voucherTopUpAllowed!=null &&
              this.voucherTopUpAllowed.equals(other.getVoucherTopUpAllowed()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.creditDebitMaxLmt==null && other.getCreditDebitMaxLmt()==null) || 
             (this.creditDebitMaxLmt!=null &&
              this.creditDebitMaxLmt.equals(other.getCreditDebitMaxLmt()))) &&
            ((this.pwdExpWarningYN==null && other.getPwdExpWarningYN()==null) || 
             (this.pwdExpWarningYN!=null &&
              this.pwdExpWarningYN.equals(other.getPwdExpWarningYN()))) &&
            ((this.pwdExpWarningDays==null && other.getPwdExpWarningDays()==null) || 
             (this.pwdExpWarningDays!=null &&
              this.pwdExpWarningDays.equals(other.getPwdExpWarningDays())));
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
        if (getForceChangePassword() != null) {
            _hashCode += getForceChangePassword().hashCode();
        }
        if (getManagerId() != null) {
            _hashCode += getManagerId().hashCode();
        }
        if (getRoleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrivList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrivList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrivList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkID() != null) {
            _hashCode += getNetworkID().hashCode();
        }
        if (getVoucherTopUpAllowed() != null) {
            _hashCode += getVoucherTopUpAllowed().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCreditDebitMaxLmt() != null) {
            _hashCode += getCreditDebitMaxLmt().hashCode();
        }
        if (getPwdExpWarningYN() != null) {
            _hashCode += getPwdExpWarningYN().hashCode();
        }
        if (getPwdExpWarningDays() != null) {
            _hashCode += getPwdExpWarningDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthenticateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "AuthenticateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceChangePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "forceChangePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "managerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "roleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "RoleDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "roleData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PrivilegeDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privilegeData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "modList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ModuleDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "moduleData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherTopUpAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "voucherTopUpAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditDebitMaxLmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "creditDebitMaxLmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdExpWarningYN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "pwdExpWarningYN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdExpWarningDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "pwdExpWarningDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
