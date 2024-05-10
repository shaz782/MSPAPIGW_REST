/**
 * SubscriberServiceV1Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.SubscriberManagementV1;

public class SubscriberServiceV1Locator extends org.apache.axis.client.Service implements com.xius.msp.billing.client.SubscriberManagementV1.SubscriberServiceV1 {

    public SubscriberServiceV1Locator() {
    }


    public SubscriberServiceV1Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SubscriberServiceV1Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SubscriberManagementPortV1
    private java.lang.String SubscriberManagementPortV1_address = "http://localhost:8080/infinet/services/v1/subscriberServices";

    public java.lang.String getSubscriberManagementPortV1Address() {
        return SubscriberManagementPortV1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SubscriberManagementPortV1WSDDServiceName = "SubscriberManagementPortV1";

    public java.lang.String getSubscriberManagementPortV1WSDDServiceName() {
        return SubscriberManagementPortV1WSDDServiceName;
    }

    public void setSubscriberManagementPortV1WSDDServiceName(java.lang.String name) {
        SubscriberManagementPortV1WSDDServiceName = name;
    }

    public com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementPortTypeV1 getSubscriberManagementPortV1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SubscriberManagementPortV1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSubscriberManagementPortV1(endpoint);
    }

    public com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementPortTypeV1 getSubscriberManagementPortV1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementBindingV1Stub _stub = new com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementBindingV1Stub(portAddress, this);
            _stub.setPortName(getSubscriberManagementPortV1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSubscriberManagementPortV1EndpointAddress(java.lang.String address) {
        SubscriberManagementPortV1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementPortTypeV1.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementBindingV1Stub _stub = new com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementBindingV1Stub(new java.net.URL(SubscriberManagementPortV1_address), this);
                _stub.setPortName(getSubscriberManagementPortV1WSDDServiceName());
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
        if ("SubscriberManagementPortV1".equals(inputPortName)) {
            return getSubscriberManagementPortV1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.wsdl", "SubscriberServiceV1");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagementV1.wsdl", "SubscriberManagementPortV1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SubscriberManagementPortV1".equals(portName)) {
            setSubscriberManagementPortV1EndpointAddress(address);
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
