/**
 * DebitOrCreditServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.debitorcredit;

public class DebitOrCreditServiceLocator extends org.apache.axis.client.Service implements com.xius.xbus.services.billing.debitorcredit.DebitOrCreditService {

    public DebitOrCreditServiceLocator() {
    }


    public DebitOrCreditServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DebitOrCreditServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DebitOrCreditPort
    private java.lang.String DebitOrCreditPort_address = "http://10.10.21.52:8192/mspapi/billing/DebitOrCreditServices/v1";

    public java.lang.String getDebitOrCreditPortAddress() {
        return DebitOrCreditPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DebitOrCreditPortWSDDServiceName = "DebitOrCreditPort";

    public java.lang.String getDebitOrCreditPortWSDDServiceName() {
        return DebitOrCreditPortWSDDServiceName;
    }

    public void setDebitOrCreditPortWSDDServiceName(java.lang.String name) {
        DebitOrCreditPortWSDDServiceName = name;
    }

    public com.xius.xbus.services.billing.debitorcredit.DebitOrCreditPortType getDebitOrCreditPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DebitOrCreditPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDebitOrCreditPort(endpoint);
    }

    public com.xius.xbus.services.billing.debitorcredit.DebitOrCreditPortType getDebitOrCreditPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.xbus.services.billing.debitorcredit.DebitOrCreditBindingStub _stub = new com.xius.xbus.services.billing.debitorcredit.DebitOrCreditBindingStub(portAddress, this);
            _stub.setPortName(getDebitOrCreditPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDebitOrCreditPortEndpointAddress(java.lang.String address) {
        DebitOrCreditPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.xbus.services.billing.debitorcredit.DebitOrCreditPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.xbus.services.billing.debitorcredit.DebitOrCreditBindingStub _stub = new com.xius.xbus.services.billing.debitorcredit.DebitOrCreditBindingStub(new java.net.URL(DebitOrCreditPort_address), this);
                _stub.setPortName(getDebitOrCreditPortWSDDServiceName());
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
        if ("DebitOrCreditPort".equals(inputPortName)) {
            return getDebitOrCreditPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xbus.xius.com/services/billing/debitorcredit", "DebitOrCreditService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xbus.xius.com/services/billing/debitorcredit", "DebitOrCreditPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DebitOrCreditPort".equals(portName)) {
            setDebitOrCreditPortEndpointAddress(address);
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
