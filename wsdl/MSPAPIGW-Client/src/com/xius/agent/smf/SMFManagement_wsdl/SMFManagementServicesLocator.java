/**
 * SMFManagementServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.agent.smf.SMFManagement_wsdl;

public class SMFManagementServicesLocator extends org.apache.axis.client.Service implements com.xius.agent.smf.SMFManagement_wsdl.SMFManagementServices {

    public SMFManagementServicesLocator() {
    }


    public SMFManagementServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SMFManagementServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SMFManagementServicesPort
    private java.lang.String SMFManagementServicesPort_address = "http://10.10.21.249:8227/SMFAgent/SMFService";

    public java.lang.String getSMFManagementServicesPortAddress() {
        return SMFManagementServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SMFManagementServicesPortWSDDServiceName = "SMFManagementServicesPort";

    public java.lang.String getSMFManagementServicesPortWSDDServiceName() {
        return SMFManagementServicesPortWSDDServiceName;
    }

    public void setSMFManagementServicesPortWSDDServiceName(java.lang.String name) {
        SMFManagementServicesPortWSDDServiceName = name;
    }

    public com.xius.agent.smf.SMFManagement_wsdl.SMFManagementPortType getSMFManagementServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SMFManagementServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSMFManagementServicesPort(endpoint);
    }

    public com.xius.agent.smf.SMFManagement_wsdl.SMFManagementPortType getSMFManagementServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.agent.smf.SMFManagement_wsdl.SMFManagementServicesBindingStub _stub = new com.xius.agent.smf.SMFManagement_wsdl.SMFManagementServicesBindingStub(portAddress, this);
            _stub.setPortName(getSMFManagementServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSMFManagementServicesPortEndpointAddress(java.lang.String address) {
        SMFManagementServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.agent.smf.SMFManagement_wsdl.SMFManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.agent.smf.SMFManagement_wsdl.SMFManagementServicesBindingStub _stub = new com.xius.agent.smf.SMFManagement_wsdl.SMFManagementServicesBindingStub(new java.net.URL(SMFManagementServicesPort_address), this);
                _stub.setPortName(getSMFManagementServicesPortWSDDServiceName());
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
        if ("SMFManagementServicesPort".equals(inputPortName)) {
            return getSMFManagementServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.wsdl", "SMFManagementServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://smf.agent.xius.com/SMFManagement.wsdl", "SMFManagementServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SMFManagementServicesPort".equals(portName)) {
            setSMFManagementServicesPortEndpointAddress(address);
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
