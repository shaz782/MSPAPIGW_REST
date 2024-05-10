/**
 * SubscriberManagementPortTypeV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.client.SubscriberManagementV1;

public interface SubscriberManagementPortTypeV1 extends java.rmi.Remote {
    public com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsResponse getdemographicdtls(com.xius.msp.selfcare.messages.SubscriberManagementV1.GetdemographicdtlsRequest body) throws java.rmi.RemoteException, com.xius.msp.selfcare.messages.common.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsResponse updateDemographicDetails(com.xius.msp.selfcare.messages.SubscriberManagementV1.UpdateDemographicDetailsRequest body) throws java.rmi.RemoteException, com.xius.msp.selfcare.messages.common.ErrorDetailsType;
}
