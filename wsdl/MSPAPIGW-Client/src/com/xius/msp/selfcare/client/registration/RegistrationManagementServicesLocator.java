/**
 * RegistrationManagementServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.client.registration;

public class RegistrationManagementServicesLocator extends org.apache.axis.client.Service implements com.xius.msp.selfcare.client.registration.RegistrationManagementServices {

    public RegistrationManagementServicesLocator() {
    }


    public RegistrationManagementServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegistrationManagementServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RegistrationManagementServicesPort
    private java.lang.String RegistrationManagementServicesPort_address = "http://localhost:8080/axis/RegistrationManagementServices/v1";

    public java.lang.String getRegistrationManagementServicesPortAddress() {
        return RegistrationManagementServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RegistrationManagementServicesPortWSDDServiceName = "RegistrationManagementServicesPort";

    public java.lang.String getRegistrationManagementServicesPortWSDDServiceName() {
        return RegistrationManagementServicesPortWSDDServiceName;
    }

    public void setRegistrationManagementServicesPortWSDDServiceName(java.lang.String name) {
        RegistrationManagementServicesPortWSDDServiceName = name;
    }

    public com.xius.msp.selfcare.client.registration.RegistrationManagementPortType getRegistrationManagementServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RegistrationManagementServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegistrationManagementServicesPort(endpoint);
    }

    public com.xius.msp.selfcare.client.registration.RegistrationManagementPortType getRegistrationManagementServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.msp.selfcare.client.registration.RegistrationManagementServicesBindingStub _stub = new com.xius.msp.selfcare.client.registration.RegistrationManagementServicesBindingStub(portAddress, this);
            _stub.setPortName(getRegistrationManagementServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegistrationManagementServicesPortEndpointAddress(java.lang.String address) {
        RegistrationManagementServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.msp.selfcare.client.registration.RegistrationManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.msp.selfcare.client.registration.RegistrationManagementServicesBindingStub _stub = new com.xius.msp.selfcare.client.registration.RegistrationManagementServicesBindingStub(new java.net.URL(RegistrationManagementServicesPort_address), this);
                _stub.setPortName(getRegistrationManagementServicesPortWSDDServiceName());
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
        if ("RegistrationManagementServicesPort".equals(inputPortName)) {
            return getRegistrationManagementServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.wsdl", "RegistrationManagementServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://scare.xbus.xiusbcgi.com/RegistrationManagement.wsdl", "RegistrationManagementServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RegistrationManagementServicesPort".equals(portName)) {
            setRegistrationManagementServicesPortEndpointAddress(address);
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
