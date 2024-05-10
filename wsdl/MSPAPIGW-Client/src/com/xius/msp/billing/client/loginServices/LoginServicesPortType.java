/**
 * LoginServicesPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.loginServices;

public interface LoginServicesPortType extends java.rmi.Remote {
    public com.xius.msp.billing.messages.loginServices.GetTotAccntCountResponse getTotAccntCount(com.xius.msp.billing.messages.loginServices.GetTotAccntCountRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsResponse getCreditProfileDtls(com.xius.msp.billing.messages.loginServices.GetCreditProfileDtlsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsResponse getPinCodeDtls(com.xius.msp.billing.messages.loginServices.GetPinCodeDtlsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryResponse getSubscriberCategory(com.xius.msp.billing.messages.loginServices.GetSubscriberCategoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetDenomsResponse getDenoms(com.xius.msp.billing.messages.loginServices.GetDenomsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetNoteTypesResponse getNoteTypes(com.xius.msp.billing.messages.loginServices.GetNoteTypesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsResponse getLoginNetworkDetails(com.xius.msp.billing.messages.loginServices.GetLoginNetworkDetailsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetLoginRolesResponse getLoginRoles(com.xius.msp.billing.messages.loginServices.GetLoginRolesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesResponse getLoginNetworkRoles(com.xius.msp.billing.messages.loginServices.GetLoginNetworkRolesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesResponse getLoginPrivileges(com.xius.msp.billing.messages.loginServices.GetLoginPrivilegesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.ValidateAdminLoginResponse validateAdminLogin(com.xius.msp.billing.messages.loginServices.ValidateAdminLoginRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.InsertActivityResponse insertActivity(com.xius.msp.billing.messages.loginServices.InsertActivityRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetStaticDataResponse getStaticData(com.xius.msp.billing.messages.loginServices.GetStaticDataRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataResponse getNetworkConfigData(com.xius.msp.billing.messages.loginServices.GetNetworkConfigDataRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.AuthenticateResponse authenticate(com.xius.msp.billing.messages.loginServices.AuthenticateRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetBillCycleDatesResponse getBillCycleDates(com.xius.msp.billing.messages.loginServices.GetBillCycleDatesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetPasswordRulesResponse getPasswordRules(com.xius.msp.billing.messages.loginServices.GetPasswordRulesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetIdTypesResponse getIdTypes(com.xius.msp.billing.messages.loginServices.GetIdTypesRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse authenticateApi(com.xius.msp.billing.messages.loginServices.AuthenticateApiRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.loginServices.GetMsidnToImeiResponse getMsidnToImei(com.xius.msp.billing.messages.loginServices.GetMsidnToImeiRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
}
