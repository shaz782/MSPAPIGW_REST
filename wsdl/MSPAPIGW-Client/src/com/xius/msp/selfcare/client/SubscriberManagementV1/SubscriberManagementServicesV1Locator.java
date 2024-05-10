/**
 * SubscriberManagementServicesV1Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.client.SubscriberManagementV1;

public class SubscriberManagementServicesV1Locator extends org.apache.axis.client.Service implements com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementServicesV1 {

    public SubscriberManagementServicesV1Locator() {
    }


    public SubscriberManagementServicesV1Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SubscriberManagementServicesV1Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SubscriberManagementServicesPortV1
    private java.lang.String SubscriberManagementServicesPortV1_address = "http://localhost:8080/axis/SubscriberManagementServices/v1";

    public java.lang.String getSubscriberManagementServicesPortV1Address() {
        return SubscriberManagementServicesPortV1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SubscriberManagementServicesPortV1WSDDServiceName = "SubscriberManagementServicesPortV1";

    public java.lang.String getSubscriberManagementServicesPortV1WSDDServiceName() {
        return SubscriberManagementServicesPortV1WSDDServiceName;
    }

    public void setSubscriberManagementServicesPortV1WSDDServiceName(java.lang.String name) {
        SubscriberManagementServicesPortV1WSDDServiceName = name;
    }

    public com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementPortTypeV1 getSubscriberManagementServicesPortV1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SubscriberManagementServicesPortV1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSubscriberManagementServicesPortV1(endpoint);
    }

    public com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementPortTypeV1 getSubscriberManagementServicesPortV1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementServicesBindingV1Stub _stub = new com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementServicesBindingV1Stub(portAddress, this);
            _stub.setPortName(getSubscriberManagementServicesPortV1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSubscriberManagementServicesPortV1EndpointAddress(java.lang.String address) {
        SubscriberManagementServicesPortV1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementPortTypeV1.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementServicesBindingV1Stub _stub = new com.xius.msp.selfcare.client.SubscriberManagementV1.SubscriberManagementServicesBindingV1Stub(new java.net.URL(SubscriberManagementServicesPortV1_address), this);
                _stub.setPortName(getSubscriberManagementServicesPortV1WSDDServiceName());
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
        if ("SubscriberManagementServicesPortV1".equals(inputPortName)) {
            return getSubscriberManagementServicesPortV1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.wsdl", "SubscriberManagementServicesV1");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/SubscriberManagementV1.wsdl", "SubscriberManagementServicesPortV1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SubscriberManagementServicesPortV1".equals(portName)) {
            setSubscriberManagementServicesPortV1EndpointAddress(address);
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
