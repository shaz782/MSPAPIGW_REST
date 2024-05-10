/**
 * SubscriberServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.SubscriberManagement;

public class SubscriberServiceLocator extends org.apache.axis.client.Service implements com.xius.msp.billing.client.SubscriberManagement.SubscriberService {

    public SubscriberServiceLocator() {
    }


    public SubscriberServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SubscriberServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SubscriberManagementPort
    private java.lang.String SubscriberManagementPort_address = "http://localhost:8080/infinet/services/v1/subscriberServices";

    public java.lang.String getSubscriberManagementPortAddress() {
        return SubscriberManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SubscriberManagementPortWSDDServiceName = "SubscriberManagementPort";

    public java.lang.String getSubscriberManagementPortWSDDServiceName() {
        return SubscriberManagementPortWSDDServiceName;
    }

    public void setSubscriberManagementPortWSDDServiceName(java.lang.String name) {
        SubscriberManagementPortWSDDServiceName = name;
    }

    public com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementPortType getSubscriberManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SubscriberManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSubscriberManagementPort(endpoint);
    }

    public com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementPortType getSubscriberManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementBindingStub _stub = new com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementBindingStub(portAddress, this);
            _stub.setPortName(getSubscriberManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSubscriberManagementPortEndpointAddress(java.lang.String address) {
        SubscriberManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementBindingStub _stub = new com.xius.msp.billing.client.SubscriberManagement.SubscriberManagementBindingStub(new java.net.URL(SubscriberManagementPort_address), this);
                _stub.setPortName(getSubscriberManagementPortWSDDServiceName());
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
        if ("SubscriberManagementPort".equals(inputPortName)) {
            return getSubscriberManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.wsdl", "SubscriberService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://billing.xius.com/SubscriberManagement.wsdl", "SubscriberManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SubscriberManagementPort".equals(portName)) {
            setSubscriberManagementPortEndpointAddress(address);
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
