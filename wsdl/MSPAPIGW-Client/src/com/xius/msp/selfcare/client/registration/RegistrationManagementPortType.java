/**
 * RegistrationManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.client.registration;

public interface RegistrationManagementPortType extends java.rmi.Remote {
    public com.xius.msp.selfcare.messages.registration.LoginResponse login(com.xius.msp.selfcare.messages.registration.LoginRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.GetPreferredMSISDNSResponse getPreferredMSISDNS(com.xius.msp.selfcare.messages.registration.GetPreferredMSISDNSRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.RegisterSubscriberResponse registerSubscriber(com.xius.msp.selfcare.messages.registration.RegisterSubscriberRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.ResetUserCredentialsResponse resetUserCredentials(com.xius.msp.selfcare.messages.registration.ResetUserCredentialsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.GetNetworkIdResponse getNetworkId(com.xius.msp.selfcare.messages.registration.GetNetworkIdRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.UpdateKadIdResponse updateKadId(com.xius.msp.selfcare.messages.registration.UpdateKadIdRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.UpdateSIMStatusResponse updateSIMStatus(com.xius.msp.selfcare.messages.registration.UpdateSIMStatusRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.GetZipCodeDetailsResponse getZipCodeDetails(com.xius.msp.selfcare.messages.registration.GetZipCodeDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.ManageZipCodeDetailsResponse manageZipCode(com.xius.msp.selfcare.messages.registration.ManageZipCodeDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.GetStateDetailsResponse getStateDetails(com.xius.msp.selfcare.messages.registration.GetStateDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.ManageStateDetailsResponse manageStateDetails(com.xius.msp.selfcare.messages.registration.ManageStateDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.UploadZipCodesResponse uploadZipCodes(com.xius.msp.selfcare.messages.registration.UploadZipCodesRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.CreateUserResponse createUser(com.xius.msp.selfcare.messages.registration.CreateUserRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.AssignUserResponse assignUser(com.xius.msp.selfcare.messages.registration.AssignUserRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.UpdateActualIdResponse updateActualId(com.xius.msp.selfcare.messages.registration.UpdateActualIdRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public void initTransaction(com.xius.msp.selfcare.messages.registration.InitTransactionRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.UpdatePasswordResponse updatePassword(com.xius.msp.selfcare.messages.registration.UpdatePasswordRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.registration.GetSelfcareDtlsOnLoginResponse getSelfcareDtlsOnLogin(com.xius.msp.selfcare.messages.registration.GetSelfcareDtlsOnLoginRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
