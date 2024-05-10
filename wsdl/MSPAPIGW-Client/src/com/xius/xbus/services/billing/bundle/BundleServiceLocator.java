/**
 * BundleServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.bundle;

public class BundleServiceLocator extends org.apache.axis.client.Service implements com.xius.xbus.services.billing.bundle.BundleService {

    public BundleServiceLocator() {
    }


    public BundleServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BundleServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BillingBundlePort
    private java.lang.String BillingBundlePort_address = "http://127.0.0.1:8192/";

    public java.lang.String getBillingBundlePortAddress() {
        return BillingBundlePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BillingBundlePortWSDDServiceName = "BillingBundlePort";

    public java.lang.String getBillingBundlePortWSDDServiceName() {
        return BillingBundlePortWSDDServiceName;
    }

    public void setBillingBundlePortWSDDServiceName(java.lang.String name) {
        BillingBundlePortWSDDServiceName = name;
    }

    public com.xius.xbus.services.billing.bundle.BundlePortType getBillingBundlePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BillingBundlePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBillingBundlePort(endpoint);
    }

    public com.xius.xbus.services.billing.bundle.BundlePortType getBillingBundlePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.xbus.services.billing.bundle.BundleBindingStub _stub = new com.xius.xbus.services.billing.bundle.BundleBindingStub(portAddress, this);
            _stub.setPortName(getBillingBundlePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBillingBundlePortEndpointAddress(java.lang.String address) {
        BillingBundlePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.xbus.services.billing.bundle.BundlePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.xbus.services.billing.bundle.BundleBindingStub _stub = new com.xius.xbus.services.billing.bundle.BundleBindingStub(new java.net.URL(BillingBundlePort_address), this);
                _stub.setPortName(getBillingBundlePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BillingBundlePort".equals(inputPortName)) {
            return getBillingBundlePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xbus.xius.com/services/billing/bundle", "BundleService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xbus.xius.com/services/billing/bundle", "BillingBundlePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BillingBundlePort".equals(portName)) {
            setBillingBundlePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
