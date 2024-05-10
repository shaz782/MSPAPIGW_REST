/**
 * DebitOrCreditBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.debitorcredit;

public class DebitOrCreditBindingStub extends org.apache.axis.client.Stub implements com.xius.xbus.services.billing.debitorcredit.DebitOrCreditPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[15];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPrepaidAccBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "getPrepaidAccBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getPrepaidAccBalanceRequest"), com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getPrepaidAccBalanceResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "getPrepaidAccBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("specialTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "specialTopUpRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">specialTopUpRequest"), com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">specialTopUpResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "specialTopUpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("voucherTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "voucherTopUpRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">voucherTopUpRequest"), com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">voucherTopUpResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "voucherTopUpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTariffAndBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "getTariffAndBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getTariffAndBalanceRequest"), com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getTariffAndBalanceResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "getTariffAndBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("debitSpecial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "debitSpecialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">debitSpecialRequest"), com.xius.xbus.messages.billing.debitorcredit.DebitSpecialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">debitSpecialResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.DebitSpecialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "debitSpecialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditLimitInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "getCreditLimitInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getCreditLimitInfoRequest"), com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getCreditLimitInfoResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "getCreditLimitInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCreditLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "updateCreditLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateCreditLimitRequest"), com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateCreditLimitResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "updateCreditLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCreditLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "deleteCreditLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">deleteCreditLimitRequest"), com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">deleteCreditLimitResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "deleteCreditLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("adjustBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "adjustBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">adjustBalanceRequest"), com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">adjustBalanceResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "adjustBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "retrieveVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">retrieveVoucherRequest"), com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">retrieveVoucherResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "retrieveVoucherResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BulkTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "bulkTopUpRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">bulkTopUpRequest"), com.xius.xbus.messages.billing.debitorcredit.BulkTopUpRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">bulkTopUpResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.BulkTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "bulkTopUpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "updateBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateBalanceRequest"), com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateBalanceResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "updateBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateRcProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "activateRcProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">activateRcProductRequest"), com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">activateRcProductResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "activateRcProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("purchaseRcProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "purchaseRcProductRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">purchaseRcProductRequest"), com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">purchaseRcProductResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "purchaseRcProductResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rechargeWithCc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "rechargeWithCcRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">rechargeWithCcRequest"), com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">rechargeWithCcResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "rechargeWithCcResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "errorDetailItem"),
                      "com.xius.xbus.messages.common.errordetails.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

    }

    public DebitOrCreditBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DebitOrCreditBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DebitOrCreditBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">>updateCreditLimitRequest>billingType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">>voucherTopUpRequest>IVR");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">activateRcProductRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">activateRcProductResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">adjustBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">adjustBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">bulkTopUpRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.BulkTopUpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">bulkTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.BulkTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">debitSpecialRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.DebitSpecialRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">debitSpecialResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.DebitSpecialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">deleteCreditLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">deleteCreditLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getCreditLimitInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getCreditLimitInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getPrepaidAccBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getPrepaidAccBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getTariffAndBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">getTariffAndBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">purchaseRcProductRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">purchaseRcProductResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">rechargeWithCcRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">rechargeWithCcResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">retrieveVoucherRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">retrieveVoucherResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">specialTopUpRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">specialTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateCreditLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">updateCreditLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">voucherTopUpRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", ">voucherTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/debitorcredit", "DebitOrCreditType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.debitorcredit.DebitOrCreditType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.errordetails.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common/errordetails", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountDetailType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountIdKeyType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRentalDetailType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountRentalDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRetrievalIdType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountRetrievalIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountRetrievalType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountRetrievalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountSharingType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountSharingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountStatusType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountUsageType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AcctRetrievalType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AcctRetrievalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ActionFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ActionFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ActionType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ActivationCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ActivationType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ActivationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AddressType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AlternateAccountId");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AlternateAccountId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AmountDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AmountDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AmountType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ApprovalType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ApprovalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "atpsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AtpsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AttDetType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AttDetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BalanceInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.BalanceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAccountIdKey");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.BillingAccountIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.BillingAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "BillingAddressData");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.BillingAddressData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "CarrierIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ContactDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ContactDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "CurrencyKeyType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.CurrencyKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "DataFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.DataFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "DeviceIdKey");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.DeviceIdKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "DurationType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.DurationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ErrorCategory");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ErrorCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ErrorData");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ErrorData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "eTopUpDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ETopUpDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "GenderType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "GetType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.GetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "GroupActionType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.GroupActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "IdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "IdValueType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ImeiType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ImsiType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "KeyValueListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.KeyValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "KeyValueType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "keyValueList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "KeyValueType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.KeyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "LocationIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "LoginIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "LSAConfFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.LSAConfFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "mainBalanceType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.MainBalanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ManageType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ManageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MessageIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "NetworkIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "NetworkNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "NPANXXType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "OptionFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.OptionFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PasswordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PersonalIdentityType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.PersonalIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PLMNIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PLMNInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.PLMNInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PLMNNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PostPaidDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.PostPaidDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "PostpaidInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.PostpaidInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ProvisionType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ProvisionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ReasonType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "RegistrationType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.RegistrationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ReplenishmentType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ReplenishmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "RequestIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "RetrievalType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.RetrievalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SecurityId");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SecurityId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SelfcareAccountStatusType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SelfcareAccountStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ServiceContext");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ServiceContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SeverityCode");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SeverityCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SimType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SpecificTimeZoneType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "StateListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.StateListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SubscriberIdKeyType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SubscriberIdKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SubscriberIdType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SubscriberIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SubscriberIdTypeRes");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SubscriberIdTypeRes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SubscriberType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SubscriberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "TypeOfServiceType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UpdatedByUserType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UpdateResetType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.UpdateResetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UpdateType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.UpdateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserAccountNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserAccountPasswordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserDefinedInfo");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.UserDefinedInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ViewlType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ViewlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "voucherDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.VoucherDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletListType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.WalletType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "wallets");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "walletType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.WalletType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "WSRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.WSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "WSResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.WSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ZipCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceResponse getPrepaidAccBalance(com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPrepaidAccBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPrepaidAccBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpResponse specialTopUp(com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SpecialTopUp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "specialTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpResponse voucherTopUp(com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("voucherTopUp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "voucherTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceResponse getTariffAndBalance(com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTariffAndBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTariffAndBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.DebitSpecialResponse debitSpecial(com.xius.xbus.messages.billing.debitorcredit.DebitSpecialRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DebitSpecial");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "debitSpecial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.DebitSpecialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.DebitSpecialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.DebitSpecialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoResponse getCreditLimitInfo(com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetCreditLimitInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCreditLimitInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitResponse updateCreditLimit(com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UpdateCreditLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateCreditLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitResponse deleteCreditLimit(com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DeleteCreditLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteCreditLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse adjustBalance(com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("adjustBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "adjustBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherResponse retrieveVoucher(com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("retrieveVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.BulkTopUpResponse bulkTopUp(com.xius.xbus.messages.billing.debitorcredit.BulkTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BulkTopUp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BulkTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.BulkTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.BulkTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.BulkTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceResponse updateBalance(com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse activateRcProduct(com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("activateRcProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activateRcProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductResponse purchaseRcProduct(com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("purchaseRcProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "purchaseRcProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse rechargeWithCc(com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("rechargeWithCc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rechargeWithCc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.messages.common.errordetails.ErrorDetailsType) {
              throw (com.xius.xbus.messages.common.errordetails.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
