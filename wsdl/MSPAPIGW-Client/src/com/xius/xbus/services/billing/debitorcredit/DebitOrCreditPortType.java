/**
 * DebitOrCreditPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xius.xbus.services.billing.debitorcredit;

public interface DebitOrCreditPortType extends java.rmi.Remote {

    /**
     * This operation is used to get details accountStatus, currentBalance
     * and validityDates of an account
     */
    public com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceResponse getPrepaidAccBalance(com.xius.xbus.messages.billing.debitorcredit.GetPrepaidAccBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to TopUp the balance with creditcard,
     * cash etc..
     */
    public com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpResponse specialTopUp(com.xius.xbus.messages.billing.debitorcredit.SpecialTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to TopUp the balance with voucher and
     * returns the voucher details and resulting balance details.
     */
    public com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpResponse voucherTopUp(com.xius.xbus.messages.billing.debitorcredit.VoucherTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to get the tariff plan and balance details.
     */
    public com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceResponse getTariffAndBalance(com.xius.xbus.messages.billing.debitorcredit.GetTariffAndBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to do the special debit.
     */
    public com.xius.xbus.messages.billing.debitorcredit.DebitSpecialResponse debitSpecial(com.xius.xbus.messages.billing.debitorcredit.DebitSpecialRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to get the Credit Limit of an Account.
     */
    public com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoResponse getCreditLimitInfo(com.xius.xbus.messages.billing.debitorcredit.GetCreditLimitInfoRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to INSERT or MOPDIFY the Credit Limit
     * of an Account.
     */
    public com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitResponse updateCreditLimit(com.xius.xbus.messages.billing.debitorcredit.UpdateCreditLimitRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to DELETE the Credit Limit of an Account.
     */
    public com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitResponse deleteCreditLimit(com.xius.xbus.messages.billing.debitorcredit.DeleteCreditLimitRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to Debit or Credit from/to an Account.
     */
    public com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse adjustBalance(com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to Debit or Credit from/to an Account.
     */
    public com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherResponse retrieveVoucher(com.xius.xbus.messages.billing.debitorcredit.RetrieveVoucherRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * Which is used to do the Topup for the given bunch of MSISDNs
     * for the corresponding amount which comes under the same Office [code]
     */
    public com.xius.xbus.messages.billing.debitorcredit.BulkTopUpResponse bulkTopUp(com.xius.xbus.messages.billing.debitorcredit.BulkTopUpRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to Debit
     */
    public com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceResponse updateBalance(com.xius.xbus.messages.billing.debitorcredit.UpdateBalanceRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to RC Product activate without debit
     */
    public com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse activateRcProduct(com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to RC Product activate with debit
     */
    public com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductResponse purchaseRcProduct(com.xius.xbus.messages.billing.debitorcredit.PurchaseRcProductRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;

    /**
     * This operation is used to RC Product activate with credit card
     */
    public com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse rechargeWithCc(com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcRequest request) throws java.rmi.RemoteException, com.xius.xbus.messages.common.errordetails.ErrorDetailsType;
}
