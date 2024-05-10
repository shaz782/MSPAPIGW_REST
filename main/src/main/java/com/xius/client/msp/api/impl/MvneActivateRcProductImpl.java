package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.XBusDebitOrCreditInvoker;
import com.xius.client.msp.api.invoker.BalanceManagementAgentInvoker;
import com.xius.msp.api.messages.DoRechargeRequest;
import com.xius.msp.api.messages.DoRechargeResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.common.ETopUpDetailsType;

@Component
public class MvneActivateRcProductImpl {
	private static final Logger logger = LogManager.getLogger(MvneActivateRcProductImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private XBusDebitOrCreditInvoker invoker;

	@Autowired(required = true)
	public Utility utility;
	
	
	@Autowired(required = true)
	private BalanceManagementAgentInvoker ibaIinvoker;

	DoRechargeResponse response = null;
	com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest xbusRequest = null;
	com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse xbusResponse = null;

	public DoRechargeResponse activateRcProduct(
			com.xius.msp.billing.messages.balanceManagement.DoRechargeResponse ibaResponse,
			DoRechargeRequest mspApiReq, CommonHeaders ibaHeaders) {

		long startTime = System.currentTimeMillis();
		long endTime = 0;
		String errorCode = null;
		String errorMessage = null;

		try {
			if (logger.isInfoEnabled()) {
				logger.info(" MvneActivateRcProductImpl --->Invoking - XBusDebitOrCreditInvoker");
			}
			response = new DoRechargeResponse();

			xbusRequest = new com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest();

			xbusRequest = setxBusRequest(ibaResponse, mspApiReq, headers);

			xbusResponse = callingxBusApi(xbusRequest, headers);

			if (xbusResponse != null) {
				response = new DoRechargeResponse();
				endTime = System.currentTimeMillis();

				if (logger.isInfoEnabled()) {
					logger.info("XBusDebitOrCreditInvoker.ActivateRcProduct request Success..."
							+ (int) (endTime - startTime) + "ms");
				}

				// If success from xbus then transaction id
				if (xbusResponse.getStatusCode() != null
						&& xbusResponse.getStatusCode().getValue().equalsIgnoreCase(MSPAPIGWConstants.SUCCESS)) {

					if (xbusResponse.getStatusCode().getValue() != null) {
						response.setTransStatus(MSPAPIGWConstants.SUCCESS);
					}
					response.setResponseCode("0");
					response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
					response.setResponseStatus(MSPAPIGWConstants.SUCCESS);
					response.setTransStatus(MSPAPIGWConstants.SUCCESS);
					response.setTransactionID(xbusResponse.getTransRefNum());
					
					
					com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest ibaReq= new com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest();
				
					ibaReq.setFlag("U");
					ibaReq.setRemarks(MSPAPIGWConstants.SUCCESS);
					ibaReq.setTransId(mspApiReq.getTransId());
					ibaReq.setMSISDN(mspApiReq.getMsisdn());
					logger.info("MvneActivateRcProductImpl -- doRecharge IBA status Updating...");
					ibaIinvoker.doRecharge(ibaReq, ibaHeaders);
				}

				if (xbusResponse.getStatusCode().getValue().equalsIgnoreCase("ERROR")) {

					com.xius.xbus.messages.common.ErrorData[] errors = xbusResponse.getErrors();
					for (int i = 0; i < errors.length; i++) {

						errorCode = errors[i].getErrorCode();
						errorMessage = errors[i].getErrorMessage();
					}
					
					com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest ibaReq= new com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest();
					
					ibaReq.setFlag("U");
					ibaReq.setRemarks(errorMessage);
					ibaReq.setTransId(mspApiReq.getTransId());
					ibaReq.setMSISDN(mspApiReq.getMsisdn());
					logger.info("MvneActivateRcProductImpl -- doRecharge IBA status Updating...");
					ibaIinvoker.doRecharge(ibaReq, ibaHeaders);
					

					if (logger.isInfoEnabled())
						logger.info(
								"XBusDebitOrCreditInvoker  ActivateTPtoSubscriberResponse Error Code :" + errorCode);
					if (logger.isInfoEnabled())
						logger.info(
								"XBusDebitOrCreditInvoker  ActivateTPtoSubscriberResponse Error Msg :" + errorMessage);

					if (xbusResponse.getStatusCode().getValue() != null) {
						if (logger.isErrorEnabled())
							logger.error("Exception ::" + errorCode + "#" + errorMessage);

						throw new MSPAPIGWExceptions(errorCode, null);

					}

				}

			}
		} catch (Exception e) {
			
			
			
			if (e instanceof MSPAPIGWExceptions) {
				MSPAPIGWExceptions e1 = (MSPAPIGWExceptions) e;
				if (logger.isErrorEnabled())
					e1.printStackTrace();
				logger.error("MvneActivateRcProductImpl - activateRcProduct() - MSPAPIGWExceptions is " + e1);
				endTime = System.currentTimeMillis();
				if (logger.isDebugEnabled())
					logger.info("activateRcProduct MSPAPIGWExceptions Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);

				response = new DoRechargeResponse();
				response.setResponseStatus(MSPAPIGWConstants.FAILURE);
				response.setResponseCode(e1.getErrorCode());
				response.setResponseMessage(e1.getErrorMessage());
				response.setTransStatus(MSPAPIGWConstants.FAILURE);
			} else {
				if (logger.isErrorEnabled())
					e.printStackTrace();
				logger.error("MvneActivateRcProductImpl - activateRcProduct() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (logger.isDebugEnabled())
					logger.info("activateRcProduct Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new DoRechargeResponse();
				response.setResponseStatus(MSPAPIGWConstants.FAILURE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
				response.setTransStatus(MSPAPIGWConstants.FAILURE);

			}
		}
		return response;

	}

	private com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductResponse callingxBusApi(
			com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest xbusRequest,
			CommonHeaders headerDetails) throws MSPAPIGWExceptions {

		if (logger.isInfoEnabled()) {
			logger.info(" ActivateRcProductImpl --->Invoking - XBusDebitOrCreditInvoker");
		}
		xbusResponse = invoker.activateRcProduct(xbusRequest, headers);

		// xbusResponse = invoker.ActivateRcProduct(xbusRequest,headerDetails);
		return xbusResponse;
	}

	private com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest setxBusRequest(
			com.xius.msp.billing.messages.balanceManagement.DoRechargeResponse ibaResp, DoRechargeRequest request,
			CommonHeaders headerDetails) {
		if (logger.isInfoEnabled()) {
			logger.info(" ActivateRcProductImpl ---> setxBusRequest()");
		}
		xbusRequest = new com.xius.xbus.messages.billing.debitorcredit.ActivateRcProductRequest();
		AccountType type = new AccountType();

		if (request.getCarrierID() != null)
			headers.setCarrierID(ibaResp.getOperatorID());

		if (request.getUserName() != null)
			headers.setUserName("chief");

		if (request.getUserPassword() != null)
			headers.setUserPassword("11111111");

		if (request.getMsisdn() != null)
			type.setMsisdn(request.getMsisdn());

		xbusRequest.setAccountType(type);

		ETopUpDetailsType eTopUpType = new ETopUpDetailsType();
		if (ibaResp != null && ibaResp.getRcCode() != null) {
			eTopUpType.setReChargeId(ibaResp.getRcCode());

			xbusRequest.setETopUp(eTopUpType);
		}

		if (request.getRemarks() != null)
			xbusRequest.setReason(request.getRemarks());
		if (request.getTransId() != null)
			xbusRequest.setTransId(request.getTransId());

		xbusRequest.setChannel("MSPAPIGW");

		return xbusRequest;
	}

}
