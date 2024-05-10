package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.ATPSubscriptionInvoker;
import com.xius.client.msp.api.invoker.BalanceManagementAgentInvoker;
import com.xius.msp.api.messages.DoRechargeRequest;
import com.xius.msp.api.messages.DoRechargeResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;

@Component
public class ActivatePackageImpl {

	private static final Logger logger = LogManager.getLogger(ActivatePackageImpl.class);

	@Autowired(required = true)
	public ATPSubscriptionInvoker atpSubscriptionInvoker;

	@Autowired(required = true)
	private BalanceManagementAgentInvoker ibaIinvoker;

	@Autowired(required = true)
	private CommonHeaders headers;

	public DoRechargeResponse activatePackage(
			com.xius.msp.billing.messages.balanceManagement.DoRechargeResponse agentResponse, DoRechargeRequest request,
			CommonHeaders ibaHeaders) {

		long startTime = System.currentTimeMillis();
		long endTime = 0;

		DoRechargeResponse response = null;
		ATPSubscriptionRequest atpSubscriptionRequest = null;
		ATPSubscriptionResponse atpSubscriptionResponse = null;
		String errorCode = null;
		String errorMessage = null;

		try {
			if (logger.isInfoEnabled()) {
				logger.info(" ActivatePackageImpl --->Invoking - productPurchageInvoker");
			}

			atpSubscriptionRequest = new ATPSubscriptionRequest();
			// set request elements for atp subscription
			if (request.getMsisdn() != null && request.getMsisdn().trim().length() > 0)
				atpSubscriptionRequest.setMsisdn(request.getMsisdn().trim());

			if (agentResponse.getRcCode() != null && agentResponse.getRcCode().trim().length() > 0)
				atpSubscriptionRequest.setPublicityId(agentResponse.getRcCode().trim());

			if (request.getTransId() != null && request.getTransId().trim().length() > 0)
				atpSubscriptionRequest.setTransationId(request.getTransId().trim());

			atpSubscriptionRequest.setServiceFlag("SUBSCRIBED");

			atpSubscriptionRequest.setChannel("MSPGWAPI");

			if (request.getCarrierID() != null)
				headers.setCarrierID(agentResponse.getOperatorID());

			if (request.getUserName() != null)
				headers.setUserName("chief");

			if (request.getUserPassword() != null)
				headers.setUserPassword("11111111");

			// atpSubscriptionRequest.setChannel("MSPGWAPI");
			// invoker class for atp Subscription
			atpSubscriptionResponse = atpSubscriptionInvoker.atpSubscription(atpSubscriptionRequest, headers);

			if (atpSubscriptionResponse != null) {
				response = new DoRechargeResponse();
				endTime = System.currentTimeMillis();

				if (logger.isInfoEnabled()) {
					logger.info("ATPSubscriptionInvoker.ATPSubscription request Success..."
							+ (int) (endTime - startTime) + "ms");
				}
				// If success from xbus then transaction id
				if (atpSubscriptionResponse.getStatusCode() != null
						&& atpSubscriptionResponse.getStatusCode().getValue().equalsIgnoreCase("success")) {

					if (atpSubscriptionResponse.getStatusCode().getValue() != null) {
						response.setTransStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					}
					response.setResponseCode("0");
					response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
					response.setResponseStatus(MSPAPIGWConstants.SUCCESS);
					response.setTransStatus(MSPAPIGWConstants.SUCCESS);
					response.setTransactionID(atpSubscriptionResponse.getTransationId());

					com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest ibaReq = new com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest();

					ibaReq.setFlag("U");
					ibaReq.setRemarks(MSPAPIGWConstants.SUCCESS);
					ibaReq.setTransId(request.getTransId());
					ibaReq.setMSISDN(request.getMsisdn());
					logger.info("ActivatePackageImpl -- doRecharge IBA status Updating...");
					ibaIinvoker.doRecharge(ibaReq, ibaHeaders);

					return response;
				}
				// If ERROR from xbus then transaction id
				if (atpSubscriptionResponse != null
						&& atpSubscriptionResponse.getStatusCode().getValue().equalsIgnoreCase("ERROR")) {

					com.xius.xbus.messages.common.ErrorData[] errors = atpSubscriptionResponse.getErrors();
					for (int i = 0; i < errors.length; i++) {

						errorCode = errors[i].getErrorCode();
						errorMessage = errors[i].getErrorMessage();
					}
					logger.info("ATPSubscriptionInvoker  ATPSubscriptionResponse Error Code :" + errorCode);
					logger.info("ATPSubscriptionInvoker  ATPSubscriptionResponse Error Msg :" + errorMessage);
					endTime = System.currentTimeMillis();
					logger.info("ATPSubscription Failure:" + (int) (endTime - startTime) + "ms");

					
	com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest ibaReq= new com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest();
					
					ibaReq.setFlag("U");
					ibaReq.setRemarks(errorMessage);
					ibaReq.setTransId(request.getTransId());
					ibaReq.setMSISDN(request.getMsisdn());
					logger.info("ActivatePackageImpl -- doRecharge IBA status Updating...");
					ibaIinvoker.doRecharge(ibaReq, ibaHeaders);
					
					
					throw new MSPAPIGWExceptions(errorCode,null);
							
					
					/*
					 * response = new DoRechargeResponse();
					 * response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					 * response.setResponseCode(errorCode); if (errorMessage != null)
					 * response.setResponseMessage(errorMessage); else
					 * response.setResponseMessage(MSPAPIGWConstants.FAILURE);
					 * response.setTransStatus(MSPAPIGWConstants.FAILURE); return response;
					 */
				}
			}
		} catch (Exception e) {
			
			

			if (e instanceof MSPAPIGWExceptions) {
				MSPAPIGWExceptions e1 = (MSPAPIGWExceptions) e;
				if (logger.isErrorEnabled())
					e1.printStackTrace();
				logger.error("ActivatePackageImpl - activatePackage() - MSPAPIGWExceptions is " + e1);
				endTime = System.currentTimeMillis();
				if (logger.isDebugEnabled())
					logger.info("doRecharge MSPAPIGWExceptions Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);

				response = new DoRechargeResponse();
				response.setResponseStatus(MSPAPIGWConstants.FAILURE);
				response.setResponseCode(e1.getErrorCode());
				response.setResponseMessage(e1.getErrorMessage());
				response.setTransStatus(MSPAPIGWConstants.FAILURE);
			} else {
				if (logger.isErrorEnabled())
					e.printStackTrace();
				logger.error("ActivatePackageImpl - activatePackage() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (logger.isDebugEnabled())
					logger.info("doRecharge Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new DoRechargeResponse();
				response.setResponseStatus(MSPAPIGWConstants.FAILURE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
				response.setTransStatus(MSPAPIGWConstants.FAILURE);
				e.printStackTrace();

			}
	
		}
		return response;
	}

}
