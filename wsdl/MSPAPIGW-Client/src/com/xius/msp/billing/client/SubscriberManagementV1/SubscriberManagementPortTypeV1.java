/**
 * SubscriberManagementPortTypeV1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.SubscriberManagementV1;

public interface SubscriberManagementPortTypeV1 extends java.rmi.Remote {
    public com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse getLoanDetailsByDate(com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse getAccountDetails(com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse getRemainingUnitDetail(com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse getSubBillingDetails(com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse getDetailsbyActStateSellerCode(com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse getActivePacks(com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
}
