/**
 * NotificationManagementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.mq.client.notification;

public class NotificationManagementServiceLocator extends org.apache.axis.client.Service implements com.xius.msp.mq.client.notification.NotificationManagementService {

    public NotificationManagementServiceLocator() {
    }


    public NotificationManagementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NotificationManagementServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NotificationManagementPort
    private java.lang.String NotificationManagementPort_address = "http://192.168.149.179:9480/newebservices/services/NotificationManagementPort?wsdl";

    public java.lang.String getNotificationManagementPortAddress() {
        return NotificationManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NotificationManagementPortWSDDServiceName = "NotificationManagementPort";

    public java.lang.String getNotificationManagementPortWSDDServiceName() {
        return NotificationManagementPortWSDDServiceName;
    }

    public void setNotificationManagementPortWSDDServiceName(java.lang.String name) {
        NotificationManagementPortWSDDServiceName = name;
    }

    public com.xius.msp.mq.client.notification.NotificationManagementPortType getNotificationManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NotificationManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNotificationManagementPort(endpoint);
    }

    public com.xius.msp.mq.client.notification.NotificationManagementPortType getNotificationManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xius.msp.mq.client.notification.NotificationManagementBindingStub _stub = new com.xius.msp.mq.client.notification.NotificationManagementBindingStub(portAddress, this);
            _stub.setPortName(getNotificationManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNotificationManagementPortEndpointAddress(java.lang.String address) {
        NotificationManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xius.msp.mq.client.notification.NotificationManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xius.msp.mq.client.notification.NotificationManagementBindingStub _stub = new com.xius.msp.mq.client.notification.NotificationManagementBindingStub(new java.net.URL(NotificationManagementPort_address), this);
                _stub.setPortName(getNotificationManagementPortWSDDServiceName());
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
        if ("NotificationManagementPort".equals(inputPortName)) {
            return getNotificationManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.wsdl", "NotificationManagementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ne.xius.com/NotificationManagement.wsdl", "NotificationManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NotificationManagementPort".equals(portName)) {
            setNotificationManagementPortEndpointAddress(address);
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
