/**
 * SubscriberManagementBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.SubscriberManagement;

public class SubscriberManagementBindingStub extends org.apache.axis.client.Stub implements com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[75];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCommercialSimFlag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getCommercialSimFlagRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getCommercialSimFlagRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getCommercialSimFlagResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getCommercialSimFlagResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getETNotifInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getETNotifInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetETNotifInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetETNotifInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getETNotifInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageBannerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBannerRequest"), com.xius.msp.billing.messages.SubscriberManagement.ManageBannerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBannerResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ManageBannerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageBannerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPromoDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getPromoDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPromoDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPromoDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getPromoDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFnFSMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getFnFSMSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFnFSMSRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFnFSMSResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getFnFSMSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBundles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundlesRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBundlesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundlesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBundlesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBuckets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBucketsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBucketsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBucketsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBucketsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBucketsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBucketsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubViewData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubViewDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubViewDataRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubViewDataResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubViewDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageFnFSMS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageFnFSMSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageFnFSMSRequest"), com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageFnFSMSResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageFnFSMSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeLanguagePreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeLanguagePreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguagePreInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguagePreInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeLanguagePreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeLanguageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguageRequest"), com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguageResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeLanguageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNPANXX");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNPANXXRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNPANXXResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNPANXXForEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNPANXXForExRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXForExRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXForExResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNPANXXForExResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubscriberInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubscriberInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubscriberInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubscriberInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageBundle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageBundleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBundleRequest"), com.xius.msp.billing.messages.SubscriberManagement.ManageBundleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBundleResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ManageBundleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageBundleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscribeOptionalServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscribeOptionalServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeOptionalServicesRequest"), com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeOptionalServicesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscribeOptionalServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("configureServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "configureServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ConfigureServicesRequest"), com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ConfigureServicesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "configureServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeTariffPlanPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeTariffPlanPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanPreInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanPreInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeTariffPlanPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeTariffPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeTariffPlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanRequest"), com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeTariffPlanResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subOptServicesPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subOptServicesPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptServicesPreInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptServicesPreInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subOptServicesPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PUKDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PUKDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PUKDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PUKDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PUKDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNotesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotesRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetNotesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetNotesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNotesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageNoteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageNoteRequest"), com.xius.msp.billing.messages.SubscriberManagement.ManageNoteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageNoteResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ManageNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageNoteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addNoteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddNoteRequest"), com.xius.msp.billing.messages.SubscriberManagement.AddNoteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddNoteResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.AddNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addNoteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssociatedMSISDNs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAssocMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAssocMSISDNRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAssocMSISDNResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAssocMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccountSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAccountSummaryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccountSummaryRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccountSummaryResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAccountSummaryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeviceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getDeviceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDeviceInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDeviceInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getDeviceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDeviceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updateDeviceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateDeviceInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateDeviceInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updateDeviceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalanceDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBalanceDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBalanceDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBalanceDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBalanceDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("managePromo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "managePromoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManagePromoRequest"), com.xius.msp.billing.messages.SubscriberManagement.ManagePromoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManagePromoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ManagePromoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "managePromoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePromoStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updatePromoStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdatePromoStatusRequest"), com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdatePromoStatusResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updatePromoStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBannerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBannerRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBannerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBannerResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBannerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBannerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getDataPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDataPlansRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDataPlansResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getDataPlansResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageDataPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageDataPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageDataPlansRequest"), com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageDataPlansResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "manageDataPlansResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSessionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSessionStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSessionStatusRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSessionStatusResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSessionStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubDataPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubDataPlansRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataPlansRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataPlansResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubDataPlansResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "insertNotificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "InsertNotificationRequest"), com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "InsertNotificationResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "insertNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeAddnlServicePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeAddnlServicePlanRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeAddnlServicePlanRequest"), com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeAddnlServicePlanResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "changeAddnlServicePlanResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addnlServicePlanPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addnlServicePlanPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddnlServicePlanPreInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddnlServicePlanPreInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addnlServicePlanPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBndlBuckets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBndlBucketsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBndlBucketsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBndlBucketsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBndlBucketsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTariffServicePackDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTariffServicePackDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffServicePackDtlsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffServicePackDtlsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTariffServicePackDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBundleDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundleDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundleDtlsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundleDtlsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundleDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMSISDNType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMSISDNTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMSISDNTypeRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMSISDNTypeResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMSISDNTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBaseSubsServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBaseSubsServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseSubsServicesRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseSubsServicesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBaseSubsServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBaseATPServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBaseATPServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseATPServicesRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseATPServicesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBaseATPServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("serviceDelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "serviceDeleteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceDeleteRequest"), com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceDeleteResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "serviceDeleteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNotificationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNotificationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotificationDataRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotificationDataResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNotificationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateNotificationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updateNotificationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateNotificationDataRequest"), com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateNotificationDataResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updateNotificationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetSubDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getSubDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("appendBulkIMSIs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "appendBulkIMSIsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AppendBulkIMSIsRequest"), com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AppendBulkIMSIsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "appendBulkIMSIsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscriberValidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscriberValidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberValidationRequest"), com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberValidationResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subscriberValidationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTariffPackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTariffPackageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffPackageRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffPackageResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTariffPackageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bundlePurchase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundlePurchaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundlePurchaseRequest"), com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundlePurchaseResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundlePurchaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalanceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBalanceInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetbalanceInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetbalanceInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBalanceInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBundlesDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPublicityIdDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getPublicityIdDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPublicityIdDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPublicityIdDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getPublicityIdDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setInitialBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "setInitialBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SetInitialBalanceRequest"), com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SetInitialBalanceResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "setInitialBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAttachedPackages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAttachedPackagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAttachedPackagesRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAttachedPackagesResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAttachedPackagesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelAccountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelAccountRequest"), com.xius.msp.billing.messages.SubscriberManagement.CancelAccountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelAccountResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.CancelAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelAccountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activeBucketSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activeBucketSummaryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activeBucketSummaryRequest"), com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activeBucketSummaryResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activeBucketSummaryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMultiplePublicityIdDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMultiplePublicityIdDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMultiplePublicityIdDtlsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMultiplePublicityIdDtlsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMultiplePublicityIdDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PostPaidPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTPActivationFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTPActivationFeeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTPActivationFeeRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTPActivationFeeResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTPActivationFeeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFreeMDNS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFreeMDNSRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFreeMDNSRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFreeMDNSResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFreeMDNSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubsID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updateSubsIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateSubsIDRequest"), com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateSubsIDResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "updateSubsIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAccntsCountOfID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAccntsCountOfIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccntsCountOfIDRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccntsCountOfIDResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAccntsCountOfIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMsisdnbasedATPDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnbasedATPDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnbasedATPDtlsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnbasedATPDtlsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnbasedATPDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkCommercialTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "checkCommercialTPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "checkCommercialTPRequest"), com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "checkCommercialTPResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "checkCommercialTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMsisdnAttachedATPDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnAttachedATPDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnAttachedATPDtlsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnAttachedATPDtlsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnAttachedATPDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNIR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNIRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNIRRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetNIRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNIRResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetNIRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNIRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOfficeNIR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getOfficeNIRRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getOfficeNIRRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getOfficeNIRResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getOfficeNIRResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getsubBaseServicestt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getsubBaseServicesttRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getsubBaseServicesttRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getsubBaseServicesttResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getsubBaseServicesttResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMulBndlNameDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRCPreInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getRCPreInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetRCPreInfoRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetRCPreInfoResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getRCPreInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChngeTpRecquired");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getChngeTpRecquiredRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetChngeTpRecquiredRequest"), com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetChngeTpRecquiredResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getChngeTpRecquiredResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[74] = oper;

    }

    public SubscriberManagementBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SubscriberManagementBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SubscriberManagementBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings2();
        addBindings3();
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
            cls = com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "accountDatesList");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AccountDatesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AccountInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ActionFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ActionFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ActionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ActivationCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activeBucketSummaryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "activeBucketSummaryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddnlServicePlanPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddnlServicePlanPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "addnlServiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AddnlServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddNoteRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AddNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AddNoteResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AddNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AppendBulkIMSIsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AppendBulkIMSIsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ApprovedBy30Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ApprovedByType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ATPDetailList");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServicePlanType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicePlanType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpDetailItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "atpDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AtpDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AttachedatpDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AttachedatpDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "attachedPackagesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.AttachedPackagesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AvablLanguagesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.LanguageDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LanguageDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "language");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "AvailableLanguagesListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LanguageType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "availableLanguages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceCategoryType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BalanceCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BalanceDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "balanceIdDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BalanceIdDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BalanceType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BannerDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BannerDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BannerType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BannerDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BannerDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bannerDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bktDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BktDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BucketDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BucketDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bucket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BucketType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BundleDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PlanDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BundleDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleIdType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BundleType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundle");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleNameDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BundleNameDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "bundleNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundlePurchaseRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundlePurchaseResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "BundleType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.BundleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "CADataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.CADataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "CAListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.CADataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "CADataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ca");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelAccountRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.CancelAccountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "cancelAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.CancelAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "CatgeatpDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.CatgeatpDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeAddnlServicePlanRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeAddnlServicePlanResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguagePreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguagePreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeLanguageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChangeTariffPlanResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "channelDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChannelDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ChargeDebitedType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ChargeDebitedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "checkCommercialTPRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "checkCommercialTPResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ConfigureServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ConfigureServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ContentType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataFlagType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.DataPlanInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanTinyInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.DataPlanTinyInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DataPlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.DataPlanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DateTypeMMDD");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DiscountDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.DiscountDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DiscountListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.DiscountDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "DiscountDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "discount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailureDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.FailureDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailureListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.FailureDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailureDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailureData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FailureNumberListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "failureMSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "FeeDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.FeeDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccntsCountOfIDRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccntsCountOfIDResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccountSummaryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAccountSummaryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAssocMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetAssocMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAttachedPackagesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getAttachedPackagesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBalanceDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBalanceDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetbalanceInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetbalanceInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBannerRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBannerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBannerResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBannerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseATPServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesRequest.class;
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
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseATPServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseSubsServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBaseSubsServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBndlBucketsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBndlBucketsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBucketsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBucketsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBucketsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBucketsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundleDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundleDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getBundlesDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundlesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBundlesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetBundlesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetBundlesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetChngeTpRecquiredRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetChngeTpRecquiredResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getCommercialSimFlagRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getCommercialSimFlagResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDataPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDataPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDeviceInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetDeviceInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetETNotifInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetETNotifInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFnFSMSRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFnFSMSResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFreeMDNSRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetFreeMDNSResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnAttachedATPDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnAttachedATPDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnbasedATPDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMsisdnbasedATPDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMSISDNTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMSISDNTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getMulBndlNameDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMultiplePublicityIdDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetMultiplePublicityIdDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNIRRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNIRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getNIRResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNIRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNotesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNotesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotificationDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNotificationDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXForExRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXForExResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetNPANXXResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getOfficeNIRRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getOfficeNIRResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPromoDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPromoDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPublicityIdDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetPublicityIdDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetRCPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetRCPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSessionStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSessionStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getsubBaseServicesttRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getsubBaseServicesttResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubscriberInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubscriberInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubViewDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetSubViewDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffPackageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffPackageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffServicePackDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "GetTariffServicePackDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTPActivationFeeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "getTPActivationFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInfoListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.IDInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInformationListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.IDInformationType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInformationType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInformationType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.IDInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.IDInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IdType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IMEIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IMSIDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.IMSIDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IMSIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "InsertNotificationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "InsertNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "InvalidServicesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.InvalidServicesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "IVRType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LangIdType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LanguageDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.LanguageDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "LanguageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MainBalanceType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.MainBalanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBannerRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageBannerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBannerResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageBannerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBundleRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageBundleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageBundleResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageBundleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageDataPlansRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageDataPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageFnFSMSRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageFnFSMSResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageNoteRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManageNoteResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManageNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManagePromoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManagePromoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ManagePromoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ManagePromoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.MSISDNDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNInfoListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.MSISDNInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.MSISDNInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNRecFlagArrType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnIMSIRecFlag");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetailsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.MsisdnTpDetailsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.MsisdnTpDetailsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetailsInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "msisdnTpDetailsList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NoteDataType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.NotesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.NotesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificatioDataListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.NotificationDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationDataType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "notificationData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationData");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.NotificationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NotificationDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.NotificationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NPANXXListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.NPANXXListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NPANXXType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NumberListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Number");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NumberType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OojbjnameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OperatorType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OptionFlagType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.OptionFlagType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OptionType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.OptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "OptType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.OptType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PlanDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PlanDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PostPaidPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoBalanceType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PromoBalanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PromoDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PromoDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "promos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoRemarksType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoStatType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PromoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PromoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ProvisionType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ProvisionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "publicityIdDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PublicityIdDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PublicityIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PUKDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PUKDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "PUKType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "rcCategoryDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.RcCategoryDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ReasonType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "regionNirDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.RegionNirDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "RentalAmountType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "RequestFromType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "RetrivalType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.RetrivalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "RobjnameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceDeleteRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceDeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceFailureType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServiceFailureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicePlansListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServicePlanType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicePlanType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "servicePlan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicePlanType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServicePlanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServicesInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServicesInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceSuccessType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServiceSuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SetInitialBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SetInitialBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIMDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SIMDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SIMType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SizeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SpecialNumberType");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "NumberType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "number");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "StatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptionalServicesFailureType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubOptionalServicesFailureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptionalServicesSuccessType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubOptionalServicesSuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptServicesPreInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubOptServicesPreInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subsCategoryDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubsCategoryDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribedType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscribedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeOptionalServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeOptionalServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscriberInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberServicesItem");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscriberServicesItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberServicesList");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscriberServicesItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberServicesItem");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subsServicesList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberValidationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscriberValidationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubscribeServiceSuccessType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubscribeServiceSuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "subServicesType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubServicesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SubUnSubType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.SubUnSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "SuccessNumberListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "MSISDNType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "successMSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDetailsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.TariffPackageDetailsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.TariffPackageDetailsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDetailsInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackageDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "tariffPackDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.TariffPackDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TariffPlanDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.TariffPlanDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TariffPlanIdType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TariffPlanType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "TitleType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubOptionalServicesFailureType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UnSubOptionalServicesFailureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubOptionalServicesSuccessType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UnSubOptionalServicesSuccessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UnSubscribedType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UnSubscribedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdatedByType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateDeviceInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateDeviceInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateNotificationDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateNotificationDataResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdatePromoStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdatePromoStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateSubsIDRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "UpdateSubsIDResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "VMSType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.xsd", "ZipCodeType");
            cachedSerQNames.add(qName);
            cls = long.class;
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

    public com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse getCommercialSimFlag(com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCommercialSimFlag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCommercialSimFlag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoResponse getETNotifInfo(com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getETNotifInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getETNotifInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetETNotifInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ManageBannerResponse manageBanner(com.xius.msp.billing.messages.SubscriberManagement.ManageBannerRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageBanner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageBannerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageBannerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ManageBannerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsResponse getPromoDetails(com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPromoDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPromoDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetPromoDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSResponse getFnFSMS(com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getFnFSMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFnFSMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetFnFSMSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBundlesResponse getBundles(com.xius.msp.billing.messages.SubscriberManagement.GetBundlesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBundles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBundles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBundlesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBundlesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBundlesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBucketsResponse getBuckets(com.xius.msp.billing.messages.SubscriberManagement.GetBucketsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBuckets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBuckets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBucketsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBucketsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBucketsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse getSubViewData(com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubViewData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubViewData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetSubViewDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSResponse manageFnFSMS(com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageFnFSMS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageFnFSMS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ManageFnFSMSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoResponse changeLanguagePreInfo(com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeLanguagePreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeLanguagePreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguagePreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageResponse changeLanguage(com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeLanguage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ChangeLanguageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXResponse getNPANXX(com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNPANXX");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNPANXX"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExResponse getNPANXXForEx(com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNPANXXForEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNPANXXForEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetNPANXXForExResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoResponse getSubscriberInfo(com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubscriberInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubscriberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetSubscriberInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ManageBundleResponse manageBundle(com.xius.msp.billing.messages.SubscriberManagement.ManageBundleRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageBundle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageBundle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageBundleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageBundleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ManageBundleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesResponse subscribeOptionalServices(com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("subscribeOptionalServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscribeOptionalServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.SubscribeOptionalServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesResponse configureServices(com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("configureServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "configureServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ConfigureServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoResponse changeTariffPlanPreInfo(com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeTariffPlanPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeTariffPlanPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanResponse changeTariffPlan(com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeTariffPlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeTariffPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ChangeTariffPlanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoResponse subOptServicesPreInfo(com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("subOptServicesPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subOptServicesPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.SubOptServicesPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsResponse PUKDetails(com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PUKDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PUKDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.PUKDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetNotesResponse getNotes(com.xius.msp.billing.messages.SubscriberManagement.GetNotesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNotes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNotesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNotesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetNotesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ManageNoteResponse manageNote(com.xius.msp.billing.messages.SubscriberManagement.ManageNoteRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageNote");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ManageNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.AddNoteResponse addNote(com.xius.msp.billing.messages.SubscriberManagement.AddNoteRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("addNote");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.AddNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.AddNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.AddNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNResponse getAssociatedMSISDNs(com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAssociatedMSISDNs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAssociatedMSISDNs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetAssocMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryResponse getAccountSummary(com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccountSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetAccountSummaryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoResponse getDeviceInfo(com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDeviceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDeviceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetDeviceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoResponse updateDeviceInfo(com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateDeviceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateDeviceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.UpdateDeviceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsResponse getBalanceDetails(com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBalanceDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBalanceDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBalanceDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ManagePromoResponse managePromo(com.xius.msp.billing.messages.SubscriberManagement.ManagePromoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("managePromo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "managePromo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManagePromoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManagePromoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ManagePromoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusResponse updatePromoStatus(com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updatePromoStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updatePromoStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.UpdatePromoStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBannerResponse getBanner(com.xius.msp.billing.messages.SubscriberManagement.GetBannerRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBanner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBannerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBannerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBannerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansResponse getDataPlans(com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDataPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetDataPlansResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansResponse manageDataPlans(com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageDataPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageDataPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ManageDataPlansResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusResponse getSessionStatus(com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSessionStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSessionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetSessionStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansResponse getSubDataPlans(com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubDataPlans");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubDataPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetSubDataPlansResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationResponse insertNotification(com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("insertNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "insertNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.InsertNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanResponse changeAddnlServicePlan(com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeAddnlServicePlan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeAddnlServicePlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ChangeAddnlServicePlanResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoResponse addnlServicePlanPreInfo(com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("addnlServicePlanPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addnlServicePlanPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.AddnlServicePlanPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsResponse getBndlBuckets(com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBndlBuckets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBndlBuckets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBndlBucketsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsResponse getTariffServicePackDtls(com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTariffServicePackDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTariffServicePackDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetTariffServicePackDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsResponse getBundleDtls(com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBundleDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBundleDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBundleDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeResponse getMSISDNType(com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetMSISDNType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMSISDNType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetMSISDNTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesResponse getBaseSubsServices(com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBaseSubsServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBaseSubsServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBaseSubsServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesResponse getBaseATPServices(com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBaseATPServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBaseATPServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBaseATPServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteResponse serviceDelete(com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("serviceDelete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "serviceDelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ServiceDeleteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataResponse getNotificationData(com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNotificationData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNotificationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetNotificationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataResponse updateNotificationData(com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateNotificationData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateNotificationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.UpdateNotificationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse getSubData(com.xius.msp.billing.messages.SubscriberManagement.GetSubDataRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsResponse appendBulkIMSIs(com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("appendBulkIMSIs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "appendBulkIMSIs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.AppendBulkIMSIsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationResponse subscriberValidation(com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("subscriberValidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "subscriberValidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.SubscriberValidationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageResponse getTariffPackage(com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTariffPackage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTariffPackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetTariffPackageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseResponse bundlePurchase(com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bundlePurchase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bundlePurchase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.BundlePurchaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoResponse getBalanceInfo(com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBalanceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBalanceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetbalanceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsResponse getBundlesDetails(com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBundlesDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBundlesDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetBundlesDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsResponse getPublicityIdDetails(com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI(" getPublicityIdDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPublicityIdDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetPublicityIdDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceResponse setInitialBalance(com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("setInitialBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setInitialBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.SetInitialBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesResponse getAttachedPackages(com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAttachedPackages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAttachedPackages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetAttachedPackagesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.CancelAccountResponse cancelAccount(com.xius.msp.billing.messages.SubscriberManagement.CancelAccountRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cancelAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.CancelAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.CancelAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.CancelAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryResponse activeBucketSummary(com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("activeBucketSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "activeBucketSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.ActiveBucketSummaryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsResponse getMultiplePublicityIdDtls(com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetMultiplePublicityIdDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMultiplePublicityIdDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetMultiplePublicityIdDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoResponse postPaidPreInfo(com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("PostPaidPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PostPaidPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.PostPaidPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeResponse getTPActivationFee(com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTPActivationFee");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTPActivationFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetTPActivationFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSResponse getFreeMDNS(com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getFreeMDNS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFreeMDNS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetFreeMDNSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDResponse updateSubsID(com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateSubsID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSubsID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.UpdateSubsIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDResponse getAccntsCountOfID(com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccntsCountOfID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccntsCountOfID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetAccntsCountOfIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse getMsisdnbasedATPDtls(com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMsisdnbasedATPDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMsisdnbasedATPDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse checkCommercialTP(com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("checkCommercialTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkCommercialTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse getMsisdnAttachedATPDtls(com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMsisdnAttachedATPDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMsisdnAttachedATPDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnAttachedATPDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetNIRResponse getNIR(com.xius.msp.billing.messages.SubscriberManagement.GetNIRRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNIR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNIR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNIRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetNIRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetNIRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRResponse getOfficeNIR(com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getOfficeNIR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getOfficeNIR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetOfficeNIRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttResponse getsubBaseServicestt(com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getsubBaseServicestt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getsubBaseServicestt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetsubBaseServicesttResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsResponse getMulBndlNameDetails(com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsRequest body) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getMulBndlNameDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMulBndlNameDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetMulBndlNameDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoResponse getRCPreInfo(com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRCPreInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRCPreInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetRCPreInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredResponse getChngeTpRecquired(com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredRequest request) throws java.rmi.RemoteException, com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getChngeTpRecquired");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getChngeTpRecquired"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagement.GetChngeTpRecquiredResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.billing.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
