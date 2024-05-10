package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.impl.ActivatePackageImpl;
import com.xius.client.msp.api.impl.MvneActivateRcProductImpl;
import com.xius.client.msp.api.invoker.BalanceManagementAgentInvoker;
import com.xius.msp.api.messages.DoRechargeRequest;
import com.xius.msp.api.messages.DoRechargeResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;

@Component
public class DoRechargeImpl {

	private static final Logger LOGGER = LogManager.getLogger(DoRechargeImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BalanceManagementAgentInvoker invoker;
	
	@Autowired(required = true)
	private MvneActivateRcProductImpl mvneActRc;
	
	@Autowired(required = true)
	private ActivatePackageImpl activatePackageImpl;
	
	

	DoRechargeResponse response = null;

	com.xius.msp.billing.messages.balanceManagement.DoRechargeResponse agentResponse = null;
	com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest agentRequest = null;

	public DoRechargeResponse recharge(DoRechargeRequest doRechargeRequest) throws MSPAPIGWExceptions {

		agentRequest = new com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest();

		agentRequest = getAgentRequest(doRechargeRequest, headers);

		if (agentRequest != null) {
			agentResponse = invoker.doRecharge(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("DoRechargeCheckImpl-doRecharge of DoRechargeRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse,doRechargeRequest);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("DoRechargeCheckImpl-doRecharge of DoRechargeResponse is Null");
		}

		return response;

	}

	public DoRechargeResponse setAgentResponse(
			com.xius.msp.billing.messages.balanceManagement.DoRechargeResponse agentResponse, DoRechargeRequest doRechargeRequest)
			throws MSPAPIGWExceptions {

		response = new DoRechargeResponse();

	
		if (agentResponse.getCategory() != null&&agentResponse.getCategory().trim().equalsIgnoreCase("RC_ACT")) {
			LOGGER.info("DoRechargeCheckImpl-doRecharge Category is RC_ACT");
			response=mvneActRc.activateRcProduct(agentResponse, doRechargeRequest,headers);
		}
		else if(agentResponse.getCategory() != null&&agentResponse.getCategory().trim().equalsIgnoreCase("PLAN_ACT")) {
			LOGGER.info("DoRechargeCheckImpl-doRecharge Category is PLAN_ACT");
			response=activatePackageImpl.activatePackage(agentResponse, doRechargeRequest,headers);
			
		}else {
			LOGGER.error("DoRechargeCheckImpl-doRecharge Category is Null");
		}
		return response;

	}

	public com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest getAgentRequest(DoRechargeRequest request,
			CommonHeaders headers) {

		agentRequest = new com.xius.msp.billing.messages.balanceManagement.DoRechargeRequest();

		if (request.getCarrierID() != null)
			headers.setCarrierID(request.getCarrierID());

		if (request.getUserName() != null)
			headers.setUserName(request.getUserName());

		if (request.getUserPassword() != null)
			headers.setUserPassword(request.getUserPassword());

		if (request.getMsisdn() != null) {
			agentRequest.setMSISDN(request.getMsisdn());
		}

		if (request.getRemarks() != null) {
			agentRequest.setRemarks(request.getRemarks());
		}

		if (request.getTransId() != null) {
			agentRequest.setTransId(request.getTransId());
		}
		
		
			agentRequest.setFlag("I");
		

		return agentRequest;
	}

}
