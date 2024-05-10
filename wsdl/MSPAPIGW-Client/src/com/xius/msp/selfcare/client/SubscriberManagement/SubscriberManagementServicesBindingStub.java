/**
 * SubscriberManagementServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.client.SubscriberManagement;

public class SubscriberManagementServicesBindingStub extends org.apache.axis.client.Stub implements com.xius.msp.selfcare.client.SubscriberManagement.SubscriberManagementPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[18];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIDvalueBylastDigits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubDetailsRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubDetailsResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubscriberStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubscriberStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubscriberStatusRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubscriberStatusResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubscriberStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEmailId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getEmailIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetEmailIdRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetEmailIdResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getEmailIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDesiredMSISDN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getDesiredMSISDNRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetDesiredMSISDNRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetDesiredMSISDNResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getDesiredMSISDNResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubscriberIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberIDRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberIDResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubscriberIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscriberProfileInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubscriberProfileInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberProfileInfoRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberProfileInfoResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubscriberProfileInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubDetailsByOffice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubDetailsByOfficeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsByOfficeRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsByOfficeResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubDetailsByOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadSubTransDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "uploadSubTransDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UploadSubTransDetailsRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UploadSubTransDetailsResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "uploadSubTransDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubTransDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubTransDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubTransDetailsRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubTransDetailsResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubTransDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDemographicDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateDemographicDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateDemographicDetailsRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateDemographicDetailsResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateDemographicDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubByNameID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubByNameIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubByNameIDRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubByNameIDResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubByNameIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubBulkNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubBulkNamesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubBulkNamesRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubBulkNamesResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubBulkNamesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSubLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "setSubLanguageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SetSubLanguageRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SetSubLanguageResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "setSubLanguageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubLanguageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubLanguageRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubLanguageResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getSubLanguageResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSubIDValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubIDValueRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubIDValueRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubIDValueResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "updateSubIDValueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTaxIDBasedSubIDValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getTaxIDBasedSubIDValueRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetTaxIDBasedSubIDValueRequest"), com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetTaxIDBasedSubIDValueResponse"));
        oper.setReturnClass(com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getTaxIDBasedSubIDValueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[17] = oper;

    }

    public SubscriberManagementServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SubscriberManagementServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SubscriberManagementServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/common/error/ErrorDetails.xsd", "ErrorMessageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "Address1Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "Address2Type");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "AnnualIncomeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "AnnualIncomType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "CityType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "CountryType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "CreatedByType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "DateOfBirthType");
            cachedSerQNames.add(qName);
            cls = java.util.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "DesiredMSISDNsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "DesiredMSISDNs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "EmailType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "EthnicType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "FirstNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GenderType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetDesiredMSISDNRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetDesiredMSISDNResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetEmailIdRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetEmailIdResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "getIDvalueBylastDigitsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubBulkNamesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubBulkNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubByNameIDRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubByNameIDResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsByOfficeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsByOfficeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubDetCursorType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetCursorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubLanguageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubLanguageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberIDRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberIDResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberProfileInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetSubscriberProfileInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetTaxIDBasedSubIDValueRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "GetTaxIDBasedSubIDValueResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "gmpcType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "HomePhoneType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "ICCNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "ICCStatusType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.ICCStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.IDInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IdNoListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDNoType");
            qName2 = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IdNo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IMSIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "IndustryType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "LanguageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "LastFourDigitsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "LastNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "MSISDNInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.MSISDNInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "MSISDNListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.MSISDNInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "MSISDNInfoType");
            qName2 = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "msisdnInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "NetWorkNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "OccupationType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "OfficeCodeType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "OfficePhoneType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "oldICType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "OrderBookingType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "OrderDateType");
            cachedSerQNames.add(qName);
            cls = java.util.Calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "OrderExpiryDateType");
            cachedSerQNames.add(qName);
            cls = java.util.Calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "OrderStatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "PasswordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "PostalCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SetSubLanguageRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SetSubLanguageResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SourceOfInfoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "StateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "StatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SubscriberInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.SubscriberInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SubscriberListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.SubscriberInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SubscriberInfoType");
            qName2 = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "subscriberInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "subscriberStatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SubsNamesListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.SubsNamesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "SubTransDetailsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "CommaSeparatedSubTransList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "TransactionIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "TransactionStatusType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateDemographicDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateDemographicDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubIDValueRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubIDValueResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubscriberStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubscriberStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubTransDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UpdateSubTransDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UploadSubTransDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UploadSubTransDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UserIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagement.xsd", "UserType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.selfcare.messages.SubscriberManagement.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse getIDvalueBylastDigits(com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getIDvalueBylastDigits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getIDvalueBylastDigits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse getSubDetails(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse updateSubDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSubDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusResponse updateSubscriberStatus(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateSubscriberStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSubscriberStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdResponse getEmailId(com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getEmailId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEmailId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNResponse getDesiredMSISDN(com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDesiredMSISDN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDesiredMSISDN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDResponse getSubscriberID(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubscriberID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubscriberID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse getSubscriberProfileInfo(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubscriberProfileInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubscriberProfileInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeResponse getSubDetailsByOffice(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubDetailsByOffice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubDetailsByOffice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsResponse uploadSubTransDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("uploadSubTransDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "uploadSubTransDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsResponse updateSubTransDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateSubTransDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSubTransDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsResponse updateDemographicDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateDemographicDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateDemographicDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDResponse getSubByNameID(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubByNameID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubByNameID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesResponse getSubBulkNames(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubBulkNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubBulkNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageResponse setSubLanguage(com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("setSubLanguage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setSubLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageResponse getSubLanguage(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubLanguage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueResponse updateSubIDValue(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("updateSubIDValue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateSubIDValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueResponse getTaxIDBasedSubIDValue(com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTaxIDBasedSubIDValue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTaxIDBasedSubIDValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) {
              throw (com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
