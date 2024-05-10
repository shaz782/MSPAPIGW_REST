/**
 * NotificationManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.mq.client.notification;

public interface NotificationManagementPortType extends java.rmi.Remote {
    public com.xius.msp.mq.messages.notification.PingServiceResponse pingService(com.xius.msp.mq.messages.notification.PingServiceRequest body) throws java.rmi.RemoteException, com.xius.msp.mq.messages.common.ErrorDetailsType;
    public com.xius.msp.mq.messages.notification.NotifyMessageResponse notifyMessage(com.xius.msp.mq.messages.notification.NotifyMessageRequest body) throws java.rmi.RemoteException, com.xius.msp.mq.messages.common.ErrorDetailsType;
}
