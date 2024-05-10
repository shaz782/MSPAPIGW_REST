/**
 * LoginServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.loginServices;

public class LoginServicesBindingStub extends org.apache.axis.client.Stub implements com.xius.msp.billing.client.loginServices.LoginServicesPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreditProfileDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getCreditProfileDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetCreditProfileDtlsRequest"), com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetCreditProfileDtlsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getCreditProfileDtlsResponse"));
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
        oper.setName("getPinCodeDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getPinCodeDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPinCodeDtlsRequest"), com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPinCodeDtlsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getPinCodeDtlsResponse"));
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
        oper.setName("getSubscriberCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getSubscriberCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetSubscriberCategoryRequest"), com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetSubscriberCategoryResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getSubscriberCategoryResponse"));
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
        oper.setName("getDenoms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getDenomsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetDenomsRequest"), com.xius.msp.billing.messages.loginServices.GetDenomsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetDenomsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetDenomsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getDenomsResponse"));
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
        oper.setName("getNoteTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getNoteTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNoteTypesRequest"), com.xius.msp.billing.messages.loginServices.GetNoteTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNoteTypesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetNoteTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getNoteTypesResponse"));
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
        oper.setName("getLoginNetworkDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginNetworkDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkDetailsRequest"), com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginNetworkDetailsResponse"));
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
        oper.setName("getLoginRoles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginRolesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginRolesRequest"), com.xius.msp.billing.messages.loginServices.GetLoginRolesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginRolesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetLoginRolesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginRolesResponse"));
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
        oper.setName("getLoginNetworkRoles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginNetworkRolesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkRolesRequest"), com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkRolesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginNetworkRolesResponse"));
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
        oper.setName("getLoginPrivileges");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginPrivilegesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginPrivilegesRequest"), com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginPrivilegesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getLoginPrivilegesResponse"));
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
        oper.setName("validateAdminLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "validateAdminLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ValidateAdminLoginRequest"), com.xius.msp.billing.messages.loginServices.ValidateAdminLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ValidateAdminLoginResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.ValidateAdminLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "validateAdminLoginResponse"));
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
        oper.setName("insertActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "insertActivityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "InsertActivityRequest"), com.xius.msp.billing.messages.loginServices.InsertActivityRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "InsertActivityResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.InsertActivityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "insertActivityResponse"));
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
        oper.setName("getStaticData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getStaticDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetStaticDataRequest"), com.xius.msp.billing.messages.loginServices.GetStaticDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetStaticDataResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetStaticDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getStaticDataResponse"));
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
        oper.setName("getNetworkConfigData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getNetworkConfigDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNetworkConfigDataRequest"), com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNetworkConfigDataResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getNetworkConfigDataResponse"));
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
        oper.setName("authenticate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "AuthenticateRequest"), com.xius.msp.billing.messages.loginServices.AuthenticateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "AuthenticateResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.AuthenticateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateResponse"));
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
        oper.setName("getBillCycleDates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getBillCycleDatesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetBillCycleDatesRequest"), com.xius.msp.billing.messages.loginServices.GetBillCycleDatesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetBillCycleDatesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetBillCycleDatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getBillCycleDatesResponse"));
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
        oper.setName("getPasswordRules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getPasswordRulesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPasswordRulesRequest"), com.xius.msp.billing.messages.loginServices.GetPasswordRulesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPasswordRulesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetPasswordRulesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getPasswordRulesResponse"));
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
        oper.setName("getIdTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getIdTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetIdTypesRequest"), com.xius.msp.billing.messages.loginServices.GetIdTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetIdTypesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetIdTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getIdTypesResponse"));
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
        oper.setName("authenticateApi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateApiRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateApiRequest"), com.xius.msp.billing.messages.loginServices.AuthenticateApiRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateApiResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateApiResponse"));
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
        oper.setName("getTotAccntCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getTotAccntCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetTotAccntCountRequest"), com.xius.msp.billing.messages.loginServices.GetTotAccntCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetTotAccntCountResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetTotAccntCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getTotAccntCountResponse"));
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
        oper.setName("getMsidnToImei");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getMsidnToImeiRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetMsidnToImeiRequest"), com.xius.msp.billing.messages.loginServices.GetMsidnToImeiRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetMsidnToImeiResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.loginServices.GetMsidnToImeiResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "getMsidnToImeiResponse"));
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

    public LoginServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LoginServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LoginServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateApiRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.AuthenticateApiRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "authenticateApiResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "AuthenticateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.AuthenticateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "AuthenticateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.AuthenticateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "BillCycleDatesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.BillCycleDatesType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "BillCycleDatesType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "billCycleDatesList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "BillCycleDatesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.BillCycleDatesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "citiesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "city");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "coloniesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "colony");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ConfigDataListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.ConfigDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ConfigDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "configData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ConfigDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.ConfigDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "creditProfileDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.CreditProfileDtlType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "creditProfileDtlType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "creditProfileDtl");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "creditProfileDtlType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.CreditProfileDtlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "DenominationsListType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "denomination");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetBillCycleDatesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetBillCycleDatesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetBillCycleDatesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetBillCycleDatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetCreditProfileDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetCreditProfileDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetDenomsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetDenomsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetDenomsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetDenomsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetIdTypesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetIdTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetIdTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetIdTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkRolesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginNetworkRolesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginPrivilegesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginPrivilegesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginRolesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginRolesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetLoginRolesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetLoginRolesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetMsidnToImeiRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetMsidnToImeiRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetMsidnToImeiResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetMsidnToImeiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNetworkConfigDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNetworkConfigDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNoteTypesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetNoteTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetNoteTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetNoteTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPasswordRulesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetPasswordRulesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPasswordRulesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetPasswordRulesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPinCodeDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetPinCodeDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetStaticDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetStaticDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetStaticDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetStaticDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetSubscriberCategoryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetSubscriberCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetTotAccntCountRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetTotAccntCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "GetTotAccntCountResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.GetTotAccntCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "id");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDNameDescListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.IDNameDescType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDNameDescType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkRoles");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDNameDescType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.IDNameDescType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDTypeListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IDType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IdTypesData");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.IdTypesData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IdTypesDataListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.IdTypesData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IdTypesData");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "idTypesData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "imeiDtylType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.ImeiDtylType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IMSIListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "imsi");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "InputParamsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "InsertActivityRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.InsertActivityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "InsertActivityResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.InsertActivityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "IPListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ip");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "LoginPasswordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "LoginUserNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ModListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.ModuleDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ModuleDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "moduleData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ModuleDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.ModuleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNSPrefixListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNSPrefix");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "municipalitiesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "municipality");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NameValuesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.NameValuesType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NameValuesType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "nameValues");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NameValuesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.NameValuesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.NetworkDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.NetworkDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkIdType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkRolesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.NetworkRolesType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkRolesType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "networkRoles");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NetworkRolesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.NetworkRolesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "NoteTypesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "noteType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PasswordRulesDataListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.PasswordRulesType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PasswordRulesType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "passwordRulesType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PasswordRulesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.PasswordRulesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "postalCodeListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "postalcode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PrivilegeDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.PrivilegeDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PrivListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.PrivilegeDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "PrivilegeDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "privilegeData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "RoleDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.RoleDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "RoleListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.RoleDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "RoleDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "roleData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ServicesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "service");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "statesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "state");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "subcategoryDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.SubcategoryDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "subsCategoryDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.SubcategoryDtlsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "subcategoryDtlsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "subcategoryDtls");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "UserType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ValidateAdminLoginRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.ValidateAdminLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.xsd", "ValidateAdminLoginResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.loginServices.ValidateAdminLoginResponse.class;
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

    public com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsResponse getCreditProfileDtls(com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCreditProfileDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCreditProfileDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsResponse getPinCodeDtls(com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPinCodeDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPinCodeDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryResponse getSubscriberCategory(com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubscriberCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubscriberCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetDenomsResponse getDenoms(com.xius.msp.billing.messages.loginServices.GetDenomsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDenoms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDenoms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetDenomsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetDenomsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetDenomsResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetNoteTypesResponse getNoteTypes(com.xius.msp.billing.messages.loginServices.GetNoteTypesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNoteTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNoteTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetNoteTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetNoteTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetNoteTypesResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsResponse getLoginNetworkDetails(com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLoginNetworkDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLoginNetworkDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetLoginRolesResponse getLoginRoles(com.xius.msp.billing.messages.loginServices.GetLoginRolesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLoginRoles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLoginRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetLoginRolesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetLoginRolesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetLoginRolesResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesResponse getLoginNetworkRoles(com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLoginRoles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLoginNetworkRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesResponse getLoginPrivileges(com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLoginPrivileges");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLoginPrivileges"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.ValidateAdminLoginResponse validateAdminLogin(com.xius.msp.billing.messages.loginServices.ValidateAdminLoginRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateAdminLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateAdminLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.ValidateAdminLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.ValidateAdminLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.ValidateAdminLoginResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.InsertActivityResponse insertActivity(com.xius.msp.billing.messages.loginServices.InsertActivityRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("insertActivity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.InsertActivityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.InsertActivityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.InsertActivityResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetStaticDataResponse getStaticData(com.xius.msp.billing.messages.loginServices.GetStaticDataRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getStaticData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getStaticData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetStaticDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetStaticDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetStaticDataResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataResponse getNetworkConfigData(com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNetworkConfigData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNetworkConfigData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.AuthenticateResponse authenticate(com.xius.msp.billing.messages.loginServices.AuthenticateRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("authenticate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "authenticate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.AuthenticateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.AuthenticateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.AuthenticateResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetBillCycleDatesResponse getBillCycleDates(com.xius.msp.billing.messages.loginServices.GetBillCycleDatesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBillCycleDates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBillCycleDates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetBillCycleDatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetBillCycleDatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetBillCycleDatesResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetPasswordRulesResponse getPasswordRules(com.xius.msp.billing.messages.loginServices.GetPasswordRulesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPasswordRules");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPasswordRules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetPasswordRulesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetPasswordRulesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetPasswordRulesResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetIdTypesResponse getIdTypes(com.xius.msp.billing.messages.loginServices.GetIdTypesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getIdTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getIdTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetIdTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetIdTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetIdTypesResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse authenticateApi(com.xius.msp.billing.messages.loginServices.AuthenticateApiRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("authenticateApi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "authenticateApi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetTotAccntCountResponse getTotAccntCount(com.xius.msp.billing.messages.loginServices.GetTotAccntCountRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTotAccntCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTotAccntCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetTotAccntCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetTotAccntCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetTotAccntCountResponse.class);
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

    public com.xius.msp.billing.messages.loginServices.GetMsidnToImeiResponse getMsidnToImei(com.xius.msp.billing.messages.loginServices.GetMsidnToImeiRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMsidnToImei");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMsidnToImei"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.loginServices.GetMsidnToImeiResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.loginServices.GetMsidnToImeiResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.loginServices.GetMsidnToImeiResponse.class);
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
