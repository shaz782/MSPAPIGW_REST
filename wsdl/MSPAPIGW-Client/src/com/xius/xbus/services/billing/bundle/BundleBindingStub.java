/**
 * BundleBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.bundle;

public class BundleBindingStub extends org.apache.axis.client.Stub implements com.xius.xbus.services.billing.bundle.BundlePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("manageBundle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "manageBundleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">manageBundleRequest"), com.xius.xbus.messages.billing.bundle.ManageBundleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">manageBundleResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.bundle.ManageBundleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "manageBundleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBuckets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "getBucketsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBucketsRequest"), com.xius.xbus.messages.billing.bundle.GetBucketsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBucketsResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.bundle.GetBucketsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "getBucketsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBundles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "getBundlesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundlesRequest"), com.xius.xbus.messages.billing.bundle.GetBundlesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundlesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.bundle.GetBundlesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "getBundlesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBundleDtl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "getBundleDtlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundleDtlRequest"), com.xius.xbus.messages.billing.bundle.GetBundleDtlRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundleDtlResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.bundle.GetBundleDtlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "getBundleDtlResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("giftBundles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "giftBundlesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">giftBundlesRequest"), com.xius.xbus.messages.billing.bundle.GiftBundlesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">giftBundlesResponse"));
        oper.setReturnClass(com.xius.xbus.messages.billing.bundle.GiftBundlesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "giftBundlesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public BundleBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BundleBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BundleBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBucketsRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GetBucketsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBucketsResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GetBucketsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundleDtlRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GetBundleDtlRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundleDtlResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GetBundleDtlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundlesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GetBundlesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">getBundlesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GetBundlesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">giftBundlesRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GiftBundlesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">giftBundlesResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.GiftBundlesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">manageBundleRequest");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.ManageBundleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", ">manageBundleResponse");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.ManageBundleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.BucketType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bucketType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.BucketType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "Bundle");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.Bundle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleDataType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.BundleType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundle");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "BundleList");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.Bundle[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "Bundle");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "BundleOpType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.BundleOpType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "bundleType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.billing.bundle.BundleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "MSISDNList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "MsisdnType");
            qName2 = new javax.xml.namespace.QName("http://xbus.xius.com/messages/billing/bundle", "msisdnList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountIdType");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "CarrierIdType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SecurityId");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SecurityId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "ServiceContext");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.ServiceContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "SeverityCode");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.SeverityCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.StatusCode.class;
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

            qName = new javax.xml.namespace.QName("http://xbus.xius.com/messages/common", "UserType");
            cachedSerQNames.add(qName);
            cls = com.xius.xbus.messages.common.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public com.xius.xbus.messages.billing.bundle.ManageBundleResponse manageBundle(com.xius.xbus.messages.billing.bundle.ManageBundleRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("manageBundle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "manageBundle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.bundle.ManageBundleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.bundle.ManageBundleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.bundle.ManageBundleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.services.billing.bundle.FaultName) {
              throw (com.xius.xbus.services.billing.bundle.FaultName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.bundle.GetBucketsResponse getBuckets(com.xius.xbus.messages.billing.bundle.GetBucketsRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBuckets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBuckets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.bundle.GetBucketsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.bundle.GetBucketsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.bundle.GetBucketsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.services.billing.bundle.FaultName) {
              throw (com.xius.xbus.services.billing.bundle.FaultName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.bundle.GetBundlesResponse getBundles(com.xius.xbus.messages.billing.bundle.GetBundlesRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBundles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBundles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.bundle.GetBundlesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.bundle.GetBundlesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.bundle.GetBundlesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.services.billing.bundle.FaultName) {
              throw (com.xius.xbus.services.billing.bundle.FaultName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.bundle.GetBundleDtlResponse getBundleDtl(com.xius.xbus.messages.billing.bundle.GetBundleDtlRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getBundleDtl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBundleDtl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.bundle.GetBundleDtlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.bundle.GetBundleDtlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.bundle.GetBundleDtlResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.services.billing.bundle.FaultName) {
              throw (com.xius.xbus.services.billing.bundle.FaultName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xius.xbus.messages.billing.bundle.GiftBundlesResponse giftBundles(com.xius.xbus.messages.billing.bundle.GiftBundlesRequest request) throws java.rmi.RemoteException, com.xius.xbus.services.billing.bundle.FaultName {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("giftBundles");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "giftBundles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xius.xbus.messages.billing.bundle.GiftBundlesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xius.xbus.messages.billing.bundle.GiftBundlesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xius.xbus.messages.billing.bundle.GiftBundlesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xius.xbus.services.billing.bundle.FaultName) {
              throw (com.xius.xbus.services.billing.bundle.FaultName) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
