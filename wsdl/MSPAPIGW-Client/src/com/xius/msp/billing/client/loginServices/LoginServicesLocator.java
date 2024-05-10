/**
 * LoginServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.loginServices;

public class LoginServicesLocator extends org.apache.axis.client.Service implements com.xius.msp.billing.client.loginServices.LoginServices {

    public LoginServicesLocator() {
    }


    public LoginServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginServicesPort
    private java.lang.String LoginServicesPort_address = "http://localhost:8080/axis/SMSGProvisioningServices/v1";

    public java.lang.String getLoginServicesPortAddress() {
        return LoginServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginServicesPortWSDDServiceName = "LoginServicesPort";

    public java.lang.String getLoginServicesPortWSDDServiceName() {
        return LoginServicesPortWSDDServiceName;
    }

    public void setLoginServicesPortWSDDServiceName(java.lang.String name) {
        LoginServicesPortWSDDServiceName = name;
    }

    public com.xius.msp.billing.client.loginServices.LoginServicesPortType getLoginServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginServicesPort(endpoint);
    }

    public com.xius.msp.billing.client.loginServices.LoginServicesPortType getLoginServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.msp.billing.client.loginServices.LoginServicesBindingStub _stub = new com.xius.msp.billing.client.loginServices.LoginServicesBindingStub(portAddress, this);
            _stub.setPortName(getLoginServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginServicesPortEndpointAddress(java.lang.String address) {
        LoginServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.msp.billing.client.loginServices.LoginServicesPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.msp.billing.client.loginServices.LoginServicesBindingStub _stub = new com.xius.msp.billing.client.loginServices.LoginServicesBindingStub(new java.net.URL(LoginServicesPort_address), this);
                _stub.setPortName(getLoginServicesPortWSDDServiceName());
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
        if ("LoginServicesPort".equals(inputPortName)) {
            return getLoginServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.wsdl", "LoginServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://billing.xius.com/LoginServices.wsdl", "LoginServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginServicesPort".equals(portName)) {
            setLoginServicesPortEndpointAddress(address);
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
