/**
 * SubscriberManagementBindingV1Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.SubscriberManagementV1;

public class SubscriberManagementBindingV1Stub extends org.apache.axis.client.Stub implements com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementPortTypeV1 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLoanDetailsByDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getLoanDetailsByDateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetLoanDetailsByDateRequest"), com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetLoanDetailsByDateResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getLoanDetailsByDateResponse"));
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
        oper.setName("getAccountDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getAcctDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetAcctDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetAcctDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getAcctDetailsResponse"));
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
        oper.setName("getRemainingUnitDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getRemainingUnitDetailRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetRemainingUnitDetailRequest"), com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetRemainingUnitDetailResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getRemainingUnitDetailResponse"));
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
        oper.setName("getSubBillingDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getSubBillingDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetSubBillingDetailsRequest"), com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetSubBillingDetailsResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getSubBillingDetailsResponse"));
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
        oper.setName("getDetailsbyActStateSellerCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getDetailsbyActStateSellerCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetDetailsbyActStateSellerCodeRequest"), com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetDetailsbyActStateSellerCodeResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getDetailsbyActStateSellerCodeResponse"));
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
        oper.setName("getActivePacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getActivePacksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetActivePacksRequest"), com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetActivePacksResponse"));
        oper.setReturnClass(com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "getActivePacksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "errorDetailItem"),
                      "com.xius.msp.billing.messages.common.ErrorDetailsType",
                      new javax.xml.namespace.QName("http://billing.xius.com/common/error/ErrorDetails.xsd", "ErrorDetailsType"), 
                      true
                     ));
        _operations[5] = oper;

    }

    public SubscriberManagementBindingV1Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SubscriberManagementBindingV1Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SubscriberManagementBindingV1Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "BalanceType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "BenefitDtlsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "BucketNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "dataDetailsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.DataDetailsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "DataDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.DataDetailsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "dataDetailsInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "dataDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "DateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "DateTypeMMDDYYYY");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetAcctDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetAcctDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetActivePacksRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetActivePacksResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetDetailsbyActStateSellerCodeRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetDetailsbyActStateSellerCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetLoanDetailsByDateRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetLoanDetailsByDateResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetRemainingUnitDetailRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetRemainingUnitDetailResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetSubBillingDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GetSubBillingDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "globalDetailsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GlobalDetailsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "GlobalDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.GlobalDetailsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "globalDetailsInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "globalDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "IMSIType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "loanAcctDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "msisdnListType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "MSISDNType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "MSISDN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "MSISDNType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.PackDetailsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packDetailsType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "packDetailsType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.PackDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "PublicityIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "SIMType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "smsDetailsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.SmsDetailsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "SmsDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.SmsDetailsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "smsDetailsInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "smsDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "VoiceDetailsInfoType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.VoiceDetailsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "VoiceDetailsListType");
            cachedSerQNames.add(qName);
            cls = com.xius.msp.billing.messages.SubscriberManagementV1.VoiceDetailsInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "VoiceDetailsInfoType");
            qName2 = new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.xsd", "voiceDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse getLoanDetailsByDate(com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getLoanDetailsByDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLoanDetailsByDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse.class);
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

    public com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse getAccountDetails(com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAccountDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAccountDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse.class);
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

    public com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse getRemainingUnitDetail(com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRemainingUnitDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRemainingUnitDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse.class);
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

    public com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse getSubBillingDetails(com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getSubBillingDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubBillingDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse.class);
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

    public com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse getDetailsbyActStateSellerCode(com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getDetailsbyActStateSellerCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDetailsbyActStateSellerCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse.class);
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

    public com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse getActivePacks(com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getActivePacks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getActivePacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse.class);
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
