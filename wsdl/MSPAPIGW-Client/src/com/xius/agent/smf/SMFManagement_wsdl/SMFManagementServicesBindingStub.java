/**
 * SMFManagementServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_wsdl;

public class SMFManagementServicesBindingStub extends org.apache.axis.client.Stub implements com.xius.agent.smf.SMFManagement_wsdl.SMFManagementPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[52];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateTPTracking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ActivateTPTrackingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ActivateTPTrackingRequest"), com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ActivateTPTrackingResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ActivateTPTrackingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("paymentTransDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransDtlsRequest"), com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransDtlsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("topUpCUG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "topUpCUGRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGRequest"), com.xius.agent.smf.SMFManagement_xsd.TopUpCUGRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.TopUpCUGResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "topUpCUGResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("persistenceManage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "persistenceManageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersistenceManageRequest"), com.xius.agent.smf.SMFManagement_xsd.PersistenceManageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersistenceManageResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.PersistenceManageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "persistenceManageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIMActivationInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationRequest"), com.xius.agent.smf.SMFManagement_xsd.SIMActivationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SIMActivationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIMActivationUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIMSale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleRequest"), com.xius.agent.smf.SMFManagement_xsd.SIMSaleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SIMSaleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SIMSaleUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BulkATPSubscriptionUpload");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkATPSubscriptionUploadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkATPSubscriptionUploadRequest"), com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkATPSubscriptionUploadResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkATPSubscriptionUploadResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("productPurchage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchageRequest"), com.xius.agent.smf.SMFManagement_xsd.ProductPurchageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchageResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ProductPurchageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageProvsngRetry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "manageProvsngRetryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ManageProvsngRetryRequest"), com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ManageProvsngRetryResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "manageProvsngRetryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("productPurchaseUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchaseUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchaseUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchaseUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchaseUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadSims");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsRequest"), com.xius.agent.smf.SMFManagement_xsd.UploadSimsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.UploadSimsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viewTransDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsRequest"), com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBulkATPSubsDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkATPSubsDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkATPSubsDtlsRequest"), com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkATPSubsDtlsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkATPSubsDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SlpnPointsTracker");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerRequest"), com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SlpnPointsTrackerUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DebitTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionRequest"), com.xius.agent.smf.SMFManagement_xsd.DebitTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.DebitTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DebitTransactionUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("APITracker");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "APITrackerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "APITrackerRequest"), com.xius.agent.smf.SMFManagement_xsd.APITrackerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "APITrackerResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.APITrackerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "APITrackerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SimRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationRequest"), com.xius.agent.smf.SMFManagement_xsd.SimRegistrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SimRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SimRegistrationUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BulkTPSubscriptionUpload");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkTPSubscriptionUploadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkTPSubscriptionUploadRequest"), com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkTPSubscriptionUploadResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkTPSubscriptionUploadResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBulkTPSubsDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkTPSubsDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkTPSubsDtlsRequest"), com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkTPSubsDtlsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkTPSubsDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransactionTracker");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerRequest"), com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransactionTrackerUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FirstLUUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FirstLUBulkInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLUBulkInsertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUBulkInsertRequest"), com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUBulkInsertResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLUBulkInsertResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BucketsSummaryInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryInsertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryInsertRequest"), com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryInsertResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryInsertResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BucketsSummaryUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("firstLuRtryUpd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLuRtryUpdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLuRtryUpdRequest"), com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLuRtryUpdResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLuRtryUpdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginLogoutTracking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "loginLogoutTrackingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "loginLogoutTrackingRequest"), com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "loginLogoutTrackingResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "loginLogoutTrackingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkTPChangeUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkTPChangeUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkTPChangeUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkTPChangeUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkTPChangeUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkATPSubscriptionUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPSubscriptionUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPSubscriptionUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPSubscriptionUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPSubscriptionUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changeTP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "changeTPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "changeTPRequest"), com.xius.agent.smf.SMFManagement_xsd.ChangeTPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "changeTPResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ChangeTPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "changeTPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ATPSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPSubscriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPSubscriptionRequest"), com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPSubscriptionResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPSubscriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "generateTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "generateTokenRequest"), com.xius.agent.smf.SMFManagement_xsd.GenerateTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "generateTokenResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.GenerateTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "generateTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "validateTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "validateTokenRequest"), com.xius.agent.smf.SMFManagement_xsd.ValidateTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "validateTokenResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.ValidateTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "validateTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("paymentInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentInsertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentInsertRequest"), com.xius.agent.smf.SMFManagement_xsd.PaymentInsertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentInsertResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.PaymentInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentInsertResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("paymentUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("paymentTransReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransReportRequest"), com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransReportResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransReportResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkSpecialCreditUpld");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSpecialCreditUpldRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSpecialCreditUpldRequest"), com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSpecialCreditUpldResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSpecialCreditUpldResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkCreditUpld");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkCreditUpldRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkCreditUpldRequest"), com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkCreditUpldResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkCreditUpldResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bulkDebitUpld");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkDebitUpldRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkDebitUpldRequest"), com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkDebitUpldResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkDebitUpldResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBulkCreditTransDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkCreditTransDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkCreditTransDtlsRequest"), com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkCreditTransDtlsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkCreditTransDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBulkDebitTransDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkDebitTransDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkDebitTransDtlsRequest"), com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkDebitTransDtlsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkDebitTransDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBulkSplCreditTransDtls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkSplCreditTransDtlsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkSplCreditTransDtlsRequest"), com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkSplCreditTransDtlsResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkSplCreditTransDtlsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePersonalDetailsInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updatePersonalDetailsInsertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updatePersonalDetailsInsertRequest"), com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updatePersonalDetailsInsertResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updatePersonalDetailsInsertResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updtPrsnlDtlsUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updtPrsnlDtlsUpdateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updtPrsnlDtlsUpdateRequest"), com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updtPrsnlDtlsUpdateResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updtPrsnlDtlsUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("blkCorpActDeActInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpActDeActInsertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpActDeActInsertRequest"), com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpActDeActInsertResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpActDeActInsertResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("blkCorpRCInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpRCInsertRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpRCInsertRequest"), com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpRCInsertResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpRCInsertResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalanceTransStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBalanceTransStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBalanceTransStatusRequest"), com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBalanceTransStatusResponse"));
        oper.setReturnClass(com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBalanceTransStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[51] = oper;

    }

    public SMFManagementServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SMFManagementServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SMFManagementServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/common/error/ErrorDetails.xsd", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ActivateTPTrackingRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ActivateTPTrackingResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "APITrackerRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.APITrackerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "APITrackerResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.APITrackerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPSubscriptionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ATPSubscriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "balTransStatusType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BalTransStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpActDeActInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpActDeActInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpRCInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "blkCorpRCInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BucketsSummaryUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPDubDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkATPDubDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPSubscriptionUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkATPSubscriptionUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkATPSubscriptionUploadRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkATPSubscriptionUploadResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkCreditUpldRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkCreditUpldResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkDebitUpldRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkDebitUpldResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSpecialCreditUpldRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSpecialCreditUpldResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkSplcreditDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkSplcreditDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkTPChangeUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkTPChangeUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "bulkTPSubDetails");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkTPSubDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkTPSubscriptionUploadRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "BulkTPSubscriptionUploadResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "changeTPRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ChangeTPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "changeTPResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ChangeTPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DatesBetweenType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.DatesBetweenType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.DebitTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.DebitTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "DebitTransactionUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUBulkInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUBulkInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLuRtryUpdRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "firstLuRtryUpdResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "FirstLUUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "generateTokenRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GenerateTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "generateTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GenerateTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBalanceTransStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBalanceTransStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkATPSubsDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkATPSubsDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkCreditTransDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkCreditTransDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkDebitTransDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkDebitTransDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkSplCreditTransDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "getBulkSplCreditTransDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkTPSubsDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "GetBulkTPSubsDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "IDNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "IDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "IMSIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "loginLogoutTrackingRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "loginLogoutTrackingResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ManageProvsngRetry");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ManageProvsngRetryRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ManageProvsngRetryResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransDtlsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransDtlsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentTransDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentDtlsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentDtlsType");
            qName2 = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PaymentDtls");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransReportRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentTransReportResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "paymentUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersistenceManage");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PersistenceManage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersistenceManageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PersistenceManageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "PersistenceManageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.PersistenceManageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ProductPurchageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ProductPurchageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchaseUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "productPurchaseUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "roamingdtlstype");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.Roamingdtlstype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMActivationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMActivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMActivationUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SimRegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SimRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SimRegistrationUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMSaleRequest.class;
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
            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMSaleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMSaleUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SIMType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "SlpnPointsTrackerUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TopUpCUGDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGListType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TopUpCUGDataType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGDataType");
            qName2 = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "topUpCUGData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TopUpCUGRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TopUpCUGResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TopUpCUGResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "TransactionTrackerUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updatePersonalDetailsInsertRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updatePersonalDetailsInsertResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updtPrsnlDtlsUpdateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "updtPrsnlDtlsUpdateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "CommaSeparatedSIMSList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.UploadSimsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "UploadSimsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.UploadSimsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "validateTokenRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ValidateTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "validateTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ValidateTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.xsd", "ViewTransDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsResponse.class;
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

    public com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse activateTPTracking(com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ActivateTPTracking");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ActivateTPTracking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse paymentTransDtls(com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("paymentTransDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "paymentTransDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.TopUpCUGResponse topUpCUG(com.xius.agent.smf.SMFManagement_xsd.TopUpCUGRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("topUpCUG");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "topUpCUG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.TopUpCUGResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.TopUpCUGResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.TopUpCUGResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.PersistenceManageResponse persistenceManage(com.xius.agent.smf.SMFManagement_xsd.PersistenceManageRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("persistenceManage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "persistenceManage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.PersistenceManageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.PersistenceManageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.PersistenceManageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SIMActivationResponse SIMActivationInsert(com.xius.agent.smf.SMFManagement_xsd.SIMActivationRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SIMActivationInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIMActivationInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMActivationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMActivationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SIMActivationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateResponse SIMActivationUpdate(com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SIMActivationUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIMActivationUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SIMActivationUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SIMSaleResponse SIMSale(com.xius.agent.smf.SMFManagement_xsd.SIMSaleRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SIMSale");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIMSale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMSaleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMSaleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SIMSaleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateResponse SIMSaleUpdate(com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SIMSaleUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SIMSaleUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SIMSaleUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadResponse bulkATPSubscriptionUpload(com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BulkATPSubscriptionUpload");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BulkATPSubscriptionUpload"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUploadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.ProductPurchageResponse productPurchage(com.xius.agent.smf.SMFManagement_xsd.ProductPurchageRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("productPurchage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "productPurchage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ProductPurchageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ProductPurchageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ProductPurchageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryResponse manageProvsngRetry(com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageProvsngRetry");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageProvsngRetry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ManageProvsngRetryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateResponse productPurchaseUpdate(com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("productPurchaseUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "productPurchaseUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ProductPurchaseUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.UploadSimsResponse uploadSims(com.xius.agent.smf.SMFManagement_xsd.UploadSimsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("UploadSims");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UploadSims"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.UploadSimsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.UploadSimsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.UploadSimsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsResponse viewTransDetails(com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("viewTransDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "viewTransDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ViewTransDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsResponse getBulkATPSubsDtls(com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBulkATPSubsDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBulkATPSubsDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.GetBulkATPSubsDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerResponse slpnPointsTracker(com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SlpnPointsTracker");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SlpnPointsTracker"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateResponse slpnPointsTrackerUpdate(com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SlpnPointsTrackerUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SlpnPointsTrackerUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SlpnPointsTrackerUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.DebitTransactionResponse debitTransaction(com.xius.agent.smf.SMFManagement_xsd.DebitTransactionRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DebitTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DebitTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.DebitTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.DebitTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.DebitTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateResponse debitTransactionUpdate(com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("DebitTransactionUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DebitTransactionUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.DebitTransactionUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.APITrackerResponse APITracker(com.xius.agent.smf.SMFManagement_xsd.APITrackerRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("APITracker");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "APITracker"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.APITrackerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.APITrackerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.APITrackerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SimRegistrationResponse simRegistration(com.xius.agent.smf.SMFManagement_xsd.SimRegistrationRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SimRegistration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SimRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SimRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SimRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SimRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateResponse simRegistrationUpdate(com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SimRegistrationUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SimRegistrationUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.SimRegistrationUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadResponse bulkTPSubscriptionUpload(com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BulkTPSubscriptionUpload");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BulkTPSubscriptionUpload"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BulkTPSubscriptionUploadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsResponse getBulkTPSubsDtls(com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetBulkTPSubsDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBulkTPSubsDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.GetBulkTPSubsDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse transactionTracker(com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransactionTracker");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransactionTracker"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse transactionTrackerUpdate(com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("TransactionTrackerUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransactionTrackerUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.TransactionTrackerUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateResponse firstLUUpdate(com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FirstLUUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FirstLUUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.FirstLUUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertResponse firstLUBulkInsert(com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("FirstLUBulkInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FirstLUBulkInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.FirstLUBulkInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertResponse bucketsSummaryInsert(com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BucketsSummaryInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BucketsSummaryInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateResponse bucketsSummaryUpdate(com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BucketsSummaryUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BucketsSummaryUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BucketsSummaryUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdResponse firstLuRtryUpd(com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("firstLuRtryUpd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "firstLuRtryUpd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.FirstLuRtryUpdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingResponse loginLogoutTracking(com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("loginLogoutTracking");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "loginLogoutTracking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.LoginLogoutTrackingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateResponse bulkTPChangeUpdate(com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bulkTPChangeUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bulkTPChangeUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BulkTPChangeUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateResponse bulkATPSubscriptionUpdate(com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bulkATPSubscriptionUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bulkATPSubscriptionUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BulkATPSubscriptionUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.ChangeTPResponse changeTP(com.xius.agent.smf.SMFManagement_xsd.ChangeTPRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("changeTP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "changeTP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ChangeTPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ChangeTPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ChangeTPResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionResponse ATPSubscription(com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ATPSubscription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ATPSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ATPSubscriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.GenerateTokenResponse generateToken(com.xius.agent.smf.SMFManagement_xsd.GenerateTokenRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("generateToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "generateToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.GenerateTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.GenerateTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.GenerateTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.ValidateTokenResponse validateToken(com.xius.agent.smf.SMFManagement_xsd.ValidateTokenRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("validateToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.ValidateTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.ValidateTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.ValidateTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.PaymentInsertResponse paymentInsert(com.xius.agent.smf.SMFManagement_xsd.PaymentInsertRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("paymentInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "paymentInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.PaymentInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateResponse paymentUpdate(com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("paymentUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "paymentUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.PaymentUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportResponse paymentTransReport(com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("paymentTransReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "paymentTransReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.PaymentTransReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldResponse bulkSpecialCreditUpld(com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bulkSpecialCreditUpld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bulkSpecialCreditUpld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BulkSpecialCreditUpldResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldResponse bulkCreditUpld(com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bulkCreditUpld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bulkCreditUpld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BulkCreditUpldResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldResponse bulkDebitUpld(com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("bulkDebitUpld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "bulkDebitUpld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BulkDebitUpldResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsResponse getBulkCreditTransDtls(com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBulkCreditDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBulkCreditTransDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.GetBulkCreditTransDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsResponse getBulkDebitTransDtls(com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBulkDebitDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBulkDebitTransDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.GetBulkDebitTransDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsResponse getBulkSplCreditTransDtls(com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBulkSplCreditDtls");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBulkSplCreditTransDtls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.GetBulkSplCreditTransDtlsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertResponse updatePersonalDetailsInsert(com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updatePersonalDetailsInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updatePersonalDetailsInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.UpdatePersonalDetailsInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateResponse updtPrsnlDtlsUpdate(com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updtPrsnlDtlsUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updtPrsnlDtlsUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.UpdtPrsnlDtlsUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertResponse blkCorpActDeActInsert(com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("blkCorpActDeActInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "blkCorpActDeActInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BlkCorpActDeActInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertResponse blkCorpRCInsert(com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("blkCorpRCInsert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "blkCorpRCInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.BlkCorpRCInsertResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusResponse getBalanceTransStatus(com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusRequest body) throws java.rmi.RemoteException, com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBalanceTransStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBalanceTransStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.agent.smf.SMFManagement_xsd.GetBalanceTransStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xius.agent.smf.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
