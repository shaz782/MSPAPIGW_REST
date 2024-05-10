/**
 * SubscriberManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.selfcare.client.SubscriberManagement;

public interface SubscriberManagementPortType extends java.rmi.Remote {
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse getIDvalueBylastDigits(com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsResponse getSubDetails(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsResponse updateSubDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusResponse updateSubscriberStatus(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubscriberStatusRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdResponse getEmailId(com.xius.msp.selfcare.messages.SubscriberManagement.GetEmailIdRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNResponse getDesiredMSISDN(com.xius.msp.selfcare.messages.SubscriberManagement.GetDesiredMSISDNRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDResponse getSubscriberID(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberIDRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoResponse getSubscriberProfileInfo(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubscriberProfileInfoRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeResponse getSubDetailsByOffice(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubDetailsByOfficeRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsResponse uploadSubTransDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UploadSubTransDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsResponse updateSubTransDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubTransDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsResponse updateDemographicDetails(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateDemographicDetailsRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDResponse getSubByNameID(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubByNameIDRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesResponse getSubBulkNames(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubBulkNamesRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageResponse setSubLanguage(com.xius.msp.selfcare.messages.SubscriberManagement.SetSubLanguageRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageResponse getSubLanguage(com.xius.msp.selfcare.messages.SubscriberManagement.GetSubLanguageRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueResponse updateSubIDValue(com.xius.msp.selfcare.messages.SubscriberManagement.UpdateSubIDValueRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
    public com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueResponse getTaxIDBasedSubIDValue(com.xius.msp.selfcare.messages.SubscriberManagement.GetTaxIDBasedSubIDValueRequest body) throws java.rmi.RemoteException, com.xiusbcgi.xbus.scare.common.error.ErrorDetails_xsd.ErrorDetailsType;
}
