package com.xius.client.msp.api.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsRequest;
import com.xius.agent.smf.SMFManagement_xsd.PaymentTransDtlsResponse;
import com.xius.client.invoker.SMFManagementInvoker;
import com.xius.msp.api.messages.PaymentConfirmationRequest;
import com.xius.msp.api.messages.PaymentConfirmationResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.Utility;
import com.xius.msp.billing.messages.balanceManagement.RechargeRequest;
import com.xius.msp.billing.messages.balanceManagement.RechargeResponse;
import com.xius.client.msp.api.invoker.BalanceManagementAgentInvoker;
/**
 * 
 * @author shashidhar.p
 * @since 17th April,2020 Description : From Here we will invoke the
 *        InfinetBilling APIs Services.
 */
@Component
public class PaymentConfirmationImpl {

	private static final Logger LOGGER = LogManager.getLogger(PaymentConfirmationImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private BalanceManagementAgentInvoker balanceManagementAgentInvoker;
	
	@Autowired(required = true)
	private SMFManagementInvoker smfIvoker;

	@Autowired(required = true)
	public Utility utility;

	PaymentConfirmationResponse response = null;

	PaymentTransDtlsRequest smfRequest = null;
	PaymentTransDtlsResponse smfResponse = null;

	String transId = null;

	public PaymentConfirmationResponse paymentTransDtls(PaymentConfirmationRequest request) throws MSPAPIGWExceptions {

		smfRequest = getSmfAgentRequest(request);
		if (smfRequest != null) {
			smfResponse = smfIvoker.paymentTransDtls(smfRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PaymentConfirmationImpl-PaymentConfirmation of TransactionTrackerRequest is Null");
		}
		response = setAgentResponse(smfResponse);
		if (smfResponse != null) {

			if(request.getStatus().equalsIgnoreCase("0")) {//invoking recharge api as got status as 0
				RechargeRequest rechargeRequest=new RechargeRequest();
				rechargeRequest.setMSISDN(request.getMsisdn());
				if(request.getDenomination()!=null) {
					BigDecimal amount=new BigDecimal(request.getDenomination());
					rechargeRequest.setAmount(amount); 
				}
				 rechargeRequest.setChannel("MSPAPIGW"); 
				 rechargeRequest.setTransRefNumber(request.getExternalTransId());
				 
				RechargeResponse rechargeResponse=balanceManagementAgentInvoker.recharge(rechargeRequest, headers);
				
				if(rechargeResponse!=null && rechargeResponse.getRespCode()!=null && rechargeResponse.getRespCode().equalsIgnoreCase("0")) {
					if (LOGGER.isInfoEnabled()) {
						LOGGER.info("PaymentConfirmationImpl-PaymentConfirmation of RechargeResponse RespCode is "+rechargeResponse.getRespCode());
					}
				}
				else {
					if(rechargeResponse!=null && rechargeResponse.getRespCode()!=null) {
						LOGGER.info("PaymentConfirmationImpl-PaymentConfirmation of RechargeResponse RespCode is "+rechargeResponse.getRespCode());
						response.setResponseCode(rechargeResponse.getRespCode());
						response.setResponseMessage(rechargeResponse.getRespDescription());
						response.setResponseStatus("1");
					}
					else {
					response.setResponseCode("45650");
					response.setResponseMessage("Recharge Failed");
					response.setResponseStatus("1");
					}
				}
			}
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PaymentConfirmationImpl-PaymentConfirmation of TransactionTrackerResponse is Null");
		}
		return response;
	}

	private PaymentTransDtlsRequest getSmfAgentRequest(PaymentConfirmationRequest request) {
		if (request != null) {
			smfRequest = new PaymentTransDtlsRequest();

			smfRequest.setMSISDN(request.getMsisdn());
			smfRequest.setExternalTransId(request.getExternalTransId());
			smfRequest.setInternalTransId(request.getInternalTransId());
			smfRequest.setPaymentTransId(request.getPaymentTransId());
			smfRequest.setStatus(request.getStatus());
			smfRequest.setFlag("UPDATE");
			if (request.getCarrierID() != null)
				headers.setCarrierID(request.getCarrierID());

			if (request.getUserName() != null)
				headers.setUserName(request.getUserName());

			if (request.getUserPassword() != null)
				headers.setUserPassword(request.getUserPassword());

		}
		return smfRequest;
	}

	private PaymentConfirmationResponse setAgentResponse(PaymentTransDtlsResponse agentResponse) {

		response = new PaymentConfirmationResponse();

		return response;
	}

}
