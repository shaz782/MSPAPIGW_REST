/**
 * ReportManagementBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.reportManagement;

public class ReportManagementBindingStub extends org.apache.axis.client.Stub implements com.xius.msp.billing.client.reportManagement.ReportManagementPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[28];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("actvdMSISDNsReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "actvdMSISDNsReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsReportRequest"), com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "actvdMSISDNsReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("specialTopUpReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "specialTopUpReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialTopUpReportRequest"), com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialTopUpReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "specialTopUpReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("vchrPINStatusReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "vchrPINStatusReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VchrPINStatusReportRequest"), com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VchrPINStatusReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "vchrPINStatusReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("excessUsageReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "excessUsageReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcessUsageReportRequest"), com.xius.msp.billing.messages.reportManagement.ExcessUsageReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcessUsageReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.ExcessUsageReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "excessUsageReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("voucherDeactReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherDeactReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherDeactReportRequest"), com.xius.msp.billing.messages.reportManagement.VoucherDeactReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherDeactReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.VoucherDeactReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "voucherDeactReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSMSHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getSMSHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetSMSHistoryRequest"), com.xius.msp.billing.messages.reportManagement.GetSMSHistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetSMSHistoryResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetSMSHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getSMSHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCallHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCallHistoryRequest"), com.xius.msp.billing.messages.reportManagement.GetCallHistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCallHistoryResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetCallHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCallHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rechargeHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rechargeHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryRequest"), com.xius.msp.billing.messages.reportManagement.RechargeHistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.RechargeHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rechargeHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tariffPlanHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tariffPlanHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryRequest"), com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tariffPlanHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActUsageReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getActUsageReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetActUsageReportRequest"), com.xius.msp.billing.messages.reportManagement.GetActUsageReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetActUsageReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetActUsageReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getActUsageReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeIMSIReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "changeIMSIReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeIMSIReportRequest"), com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeIMSIReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "changeIMSIReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeMSISDNReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "changeMSISDNReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeMSISDNReportRequest"), com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeMSISDNReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "changeMSISDNReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simSwapReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simSwapReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapReportRequest"), com.xius.msp.billing.messages.reportManagement.SimSwapReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.SimSwapReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simSwapReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("debitReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "debitReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitReportRequest"), com.xius.msp.billing.messages.reportManagement.DebitReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.DebitReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "debitReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("specialDebitReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "specialDebitReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialDebitReportRequest"), com.xius.msp.billing.messages.reportManagement.SpecialDebitReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialDebitReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.SpecialDebitReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "specialDebitReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("creditReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditReportRequest"), com.xius.msp.billing.messages.reportManagement.CreditReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.CreditReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCAReports");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCAReportsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCAReportsRequest"), com.xius.msp.billing.messages.reportManagement.GetCAReportsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCAReportsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetCAReportsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCAReportsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("accountReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountReportRequest"), com.xius.msp.billing.messages.reportManagement.AccountReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.AccountReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("creditInfoInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditInfoInvoiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditInfoInvoiceRequest"), com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditInfoInvoiceResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditInfoInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("attachDettachBndlReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "attachDettachBndlReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AttachDettachBndlReportRequest"), com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AttachDettachBndlReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "attachDettachBndlReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("paymentReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "paymentReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentReportRequest"), com.xius.msp.billing.messages.reportManagement.PaymentReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.PaymentReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "paymentReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("crossPromoTransReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "crossPromoTransReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransReportRequest"), com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "crossPromoTransReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("usageReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageReportRequest"), com.xius.msp.billing.messages.reportManagement.UsageReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.UsageReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeactiveReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getDeactiveReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getDeactiveReasonsRequest"), com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getDeactiveReasonsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getDeactiveReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rcTransactionReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransactionReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransactionReportRequest"), com.xius.msp.billing.messages.reportManagement.RcTransactionReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransactionReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.RcTransactionReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransactionReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("corpSimStatusReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimStatusReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimStatusReportRequest"), com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimStatusReportResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimStatusReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCorpSimVoucherAct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimVoucherActRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimVoucherActRequest"), com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimVoucherActResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimVoucherActResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOCMPCalls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getOCMPCallsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getOCMPCallsRequest"), com.xius.msp.billing.messages.reportManagement.GetOCMPCallsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getOCMPCallsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.reportManagement.GetOCMPCallsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getOCMPCallsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[27] = oper;

    }

    public ReportManagementBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ReportManagementBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ReportManagementBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.common.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AccountDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "accountDetailsList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AccountDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AccountReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AccountReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AccountType1");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AccountType1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsReportListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "actvdMSISDNsData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ActvdMSISDNsReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AttachDettachBndlReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "AttachDettachBndlReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "BndlRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.BndlRprtType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "BndlRprtType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "bndlInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "BndlRprtType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.BndlRprtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CAHistoryType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CAHistoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CallDetailListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CallDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CallDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "callDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CallDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CallDetailsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CallDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CallDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeIMSIReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeIMSIReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeMSISDNReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChangeMSISDNReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChildMsisdn");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChildMsisdn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChildMsisdnArray");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChildMsisdn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChildMsisdn");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "childMsisdn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChngIMSIRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChngIMSIRprtType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChngIMSIRprtType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "imsiInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChngIMSIRprtType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChngIMSIRprtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChngMSISDNRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChngMSISDNRprtType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChngMSISDNRprtType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "msisdnInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ChngMSISDNRprtType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ChngMSISDNRprtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrdtRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CrdtRprtType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrdtRprtType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "creditInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrdtRprtType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CrdtRprtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditInfoInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditInfoInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CreditReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CreditReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CreditReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransDtls");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CrossPromoTransDtls.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "CrossPromoTransReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DataPlanDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.DataPlanDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DataPlanRental");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.DataPlanDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DataPlanDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "dataPlanDetailsList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DateTypeMMDD");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.DebitReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.DebitReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.DebitRprtType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitRprtType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "debitInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DebitRprtType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.DebitRprtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "DurationType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.DurationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcesDataUsageListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ExcessUsageDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcessUsageDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcessUsageData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcessUsageDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ExcessUsageDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcessUsageReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ExcessUsageReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ExcessUsageReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ExcessUsageReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetActUsageReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetActUsageReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetActUsageReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetActUsageReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCallHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCallHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCallHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCallHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCAReportsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCAReportsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetCAReportsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCAReportsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimStatusReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimStatusReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimVoucherActRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getCorpSimVoucherActResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getDeactiveReasonsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getDeactiveReasonsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getOCMPCallsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetOCMPCallsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "getOCMPCallsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetOCMPCallsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetSMSHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetSMSHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "GetSMSHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.GetSMSHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "Invoice");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.Invoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "InvoiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.Invoice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "Invoice");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "invoice");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "IVRReportDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.IVRReportDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MSISDNLongType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "NumberType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentDtls");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.PaymentDtls.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.PaymentReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "PaymentReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.PaymentReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransactionReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.RcTransactionReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "rcTransactionReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.RcTransactionReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RCTransDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.RCTransDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "reasonDtls");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "reason");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryRecord");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.RechargeHistoryRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.RechargeHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "RechargeHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.RechargeHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ReportFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ReportFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimStockDtls");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SimStockDtls.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SimSwapReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SimSwapReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SimSwapRprtType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapRprtType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simSwapInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SimSwapRprtType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SimSwapRprtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "simVoucherDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SimVoucherDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SMSHistoryListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SMSHistoryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SMSHistoryType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "smsData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SMSHistoryType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SMSHistoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpclDebitRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpclDebitRprtType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpclDebitRprtType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "spclDebitInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpclDebitRprtType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpclDebitRprtType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpclTopUpRprtListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpclTopUpType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpclTopUpType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "spclTopUpData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpclTopUpType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpclTopUpType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialDebitReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpecialDebitReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialDebitReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpecialDebitReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialTopUpReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "SpecialTopUpReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "tariffPlanHistory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "TariffPlanHistoryType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "taxType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.UsageDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageDetailsList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.UsageDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.UsageReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "usageReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.UsageReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "UserType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VchrPINStatusReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VchrPINStatusReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VchrReportListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.VoucherDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.VoucherDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherDeactReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.VoucherDeactReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/ReportManagement.xsd", "VoucherDeactReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.reportManagement.VoucherDeactReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

    public com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportResponse actvdMSISDNsReport(com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("actvdMSISDNsReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "actvdMSISDNsReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportResponse specialTopUpReport(com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("specialTopUpReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "specialTopUpReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportResponse vchrPINStatusReport(com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("vchrPINStatusReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "vchrPINStatusReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.ExcessUsageReportResponse excessUsageReport(com.xius.msp.billing.messages.reportManagement.ExcessUsageReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("excessUsageReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "excessUsageReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.ExcessUsageReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.ExcessUsageReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.ExcessUsageReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.VoucherDeactReportResponse voucherDeactReport(com.xius.msp.billing.messages.reportManagement.VoucherDeactReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("voucherDeactReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "voucherDeactReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.VoucherDeactReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.VoucherDeactReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.VoucherDeactReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetSMSHistoryResponse getSMSHistory(com.xius.msp.billing.messages.reportManagement.GetSMSHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSMSHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSMSHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetSMSHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetSMSHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetSMSHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetCallHistoryResponse getCallHistory(com.xius.msp.billing.messages.reportManagement.GetCallHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCallHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetCallHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetCallHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetCallHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.RechargeHistoryResponse rechargeHistory(com.xius.msp.billing.messages.reportManagement.RechargeHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("rechargeHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rechargeHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.RechargeHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.RechargeHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.RechargeHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryResponse tariffPlanHistory(com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("tariffPlanHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "tariffPlanHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetActUsageReportResponse getActUsageReport(com.xius.msp.billing.messages.reportManagement.GetActUsageReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getActUsageReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getActUsageReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetActUsageReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetActUsageReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetActUsageReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportResponse changeIMSIReport(com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeIMSIReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeIMSIReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportResponse changeMSISDNReport(com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeMSISDNReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeMSISDNReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.SimSwapReportResponse simSwapReport(com.xius.msp.billing.messages.reportManagement.SimSwapReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("simSwapReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "simSwapReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.SimSwapReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.SimSwapReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.SimSwapReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.DebitReportResponse debitReport(com.xius.msp.billing.messages.reportManagement.DebitReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("debitReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "debitReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.DebitReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.DebitReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.DebitReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.SpecialDebitReportResponse specialDebitReport(com.xius.msp.billing.messages.reportManagement.SpecialDebitReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("specialDebitReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "specialDebitReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.SpecialDebitReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.SpecialDebitReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.SpecialDebitReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.CreditReportResponse creditReport(com.xius.msp.billing.messages.reportManagement.CreditReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("creditReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "creditReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.CreditReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.CreditReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.CreditReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetCAReportsResponse getCAReports(com.xius.msp.billing.messages.reportManagement.GetCAReportsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCAReports");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCAReports"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetCAReportsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetCAReportsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetCAReportsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.AccountReportResponse accountReport(com.xius.msp.billing.messages.reportManagement.AccountReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("accountReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "accountReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.AccountReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.AccountReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.AccountReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceResponse creditInfoInvoice(com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("creditInfoInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "creditInfoInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportResponse attachDettachBndlReport(com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("attachDettachBndlReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "attachDettachBndlReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.PaymentReportResponse paymentReport(com.xius.msp.billing.messages.reportManagement.PaymentReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("paymentReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "paymentReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.PaymentReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.PaymentReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.PaymentReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportResponse crossPromoTransReport(com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("crossPromoTransReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "crossPromoTransReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.UsageReportResponse usageReport(com.xius.msp.billing.messages.reportManagement.UsageReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("usageReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "usageReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.UsageReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.UsageReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.UsageReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse getDeactiveReasons(com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDeactiveReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDeactiveReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.RcTransactionReportResponse rcTransactionReport(com.xius.msp.billing.messages.reportManagement.RcTransactionReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("rcTransactionReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "rcTransactionReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.RcTransactionReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.RcTransactionReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.RcTransactionReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportResponse corpSimStatusReport(com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("corpSimStatusReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "corpSimStatusReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActResponse getCorpSimVoucherAct(com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCorpSimVoucherAct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCorpSimVoucherAct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.reportManagement.GetOCMPCallsResponse getOCMPCalls(com.xius.msp.billing.messages.reportManagement.GetOCMPCallsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getOCMPCalls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOCMPCalls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.reportManagement.GetOCMPCallsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.reportManagement.GetOCMPCallsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.reportManagement.GetOCMPCallsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.msp.billing.messages.common.ErrorDetailsType) {
              throw (com.xius.msp.billing.messages.common.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
