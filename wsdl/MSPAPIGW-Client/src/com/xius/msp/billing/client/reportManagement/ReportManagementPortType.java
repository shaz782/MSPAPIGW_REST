/**
 * ReportManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.msp.billing.client.reportManagement;

public interface ReportManagementPortType extends java.rmi.Remote {
    public com.xius.msp.billing.messages.reportManagement.CreditReportResponse creditReport(com.xius.msp.billing.messages.reportManagement.CreditReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportResponse actvdMSISDNsReport(com.xius.msp.billing.messages.reportManagement.ActvdMSISDNsReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportResponse specialTopUpReport(com.xius.msp.billing.messages.reportManagement.SpecialTopUpReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportResponse vchrPINStatusReport(com.xius.msp.billing.messages.reportManagement.VchrPINStatusReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.ExcessUsageReportResponse excessUsageReport(com.xius.msp.billing.messages.reportManagement.ExcessUsageReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.VoucherDeactReportResponse voucherDeactReport(com.xius.msp.billing.messages.reportManagement.VoucherDeactReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetSMSHistoryResponse getSMSHistory(com.xius.msp.billing.messages.reportManagement.GetSMSHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetCallHistoryResponse getCallHistory(com.xius.msp.billing.messages.reportManagement.GetCallHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.RechargeHistoryResponse rechargeHistory(com.xius.msp.billing.messages.reportManagement.RechargeHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetActUsageReportResponse getActUsageReport(com.xius.msp.billing.messages.reportManagement.GetActUsageReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryResponse tariffPlanHistory(com.xius.msp.billing.messages.reportManagement.TariffPlanHistoryRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportResponse changeIMSIReport(com.xius.msp.billing.messages.reportManagement.ChangeIMSIReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportResponse changeMSISDNReport(com.xius.msp.billing.messages.reportManagement.ChangeMSISDNReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.SimSwapReportResponse simSwapReport(com.xius.msp.billing.messages.reportManagement.SimSwapReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.DebitReportResponse debitReport(com.xius.msp.billing.messages.reportManagement.DebitReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.SpecialDebitReportResponse specialDebitReport(com.xius.msp.billing.messages.reportManagement.SpecialDebitReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetCAReportsResponse getCAReports(com.xius.msp.billing.messages.reportManagement.GetCAReportsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.AccountReportResponse accountReport(com.xius.msp.billing.messages.reportManagement.AccountReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceResponse creditInfoInvoice(com.xius.msp.billing.messages.reportManagement.CreditInfoInvoiceRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportResponse attachDettachBndlReport(com.xius.msp.billing.messages.reportManagement.AttachDettachBndlReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.PaymentReportResponse paymentReport(com.xius.msp.billing.messages.reportManagement.PaymentReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportResponse crossPromoTransReport(com.xius.msp.billing.messages.reportManagement.CrossPromoTransReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.UsageReportResponse usageReport(com.xius.msp.billing.messages.reportManagement.UsageReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsResponse getDeactiveReasons(com.xius.msp.billing.messages.reportManagement.GetDeactiveReasonsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.RcTransactionReportResponse rcTransactionReport(com.xius.msp.billing.messages.reportManagement.RcTransactionReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportResponse corpSimStatusReport(com.xius.msp.billing.messages.reportManagement.GetCorpSimStatusReportRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActResponse getCorpSimVoucherAct(com.xius.msp.billing.messages.reportManagement.GetCorpSimVoucherActRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
    public com.xius.msp.billing.messages.reportManagement.GetOCMPCallsResponse getOCMPCalls(com.xius.msp.billing.messages.reportManagement.GetOCMPCallsRequest body) throws java.rmi.RemoteException, com.xius.msp.billing.messages.common.ErrorDetailsType;
}
