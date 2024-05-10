package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.SubscriberManagementAgentInvoker;
import com.xius.msp.api.messages.GetMsisdnDetailsRequest;
import com.xius.msp.api.messages.GetMsisdnDetailsResponse;
import com.xius.msp.billing.messages.SubscriberManagement.AccountType;
import com.xius.msp.billing.messages.SubscriberManagement.GetSubDataRequest;
import com.xius.msp.billing.messages.SubscriberManagement.GetSubDataResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;

@Component
public class GetMsisdnDetailsImpl {
	private static final Logger LOGGER = LogManager.getLogger(GetMsisdnDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	SubscriberManagementAgentInvoker subscriberManagementAgentInvoker;
	GetMsisdnDetailsResponse response = null;

	public GetMsisdnDetailsResponse getMsisdnDetails(GetMsisdnDetailsRequest request) throws MSPAPIGWExceptions {
		if (LOGGER.isInfoEnabled())
			LOGGER.info("GetMsisdnDetailsImpl-getMsisdnDetails called");
		setHeader(request);
		GetSubDataRequest ibaRequest = new GetSubDataRequest();
		if (request.getMsisdn() != null) {
			AccountType actType = new AccountType();
			actType.setMSISDN(request.getMsisdn());
			ibaRequest.setAccount(actType);

			GetSubDataResponse ibaResponse = subscriberManagementAgentInvoker.getMsisdnDetails(ibaRequest, headers);
			if (ibaResponse != null) {
				response = new GetMsisdnDetailsResponse();

				if (ibaResponse.getAccountStatus() != null)
					response.setAccountStatus(ibaResponse.getAccountStatus());
				if (ibaResponse.getNetworkId() != null)
					response.setNetworkId(ibaResponse.getNetworkId());
				if (ibaResponse.getMSISDN() != null)
					response.setMSISDN(ibaResponse.getMSISDN());
			} else {
				response = new GetMsisdnDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.FAILURE);
				response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
			}
		}

		return response;
	}

	private void setHeader(GetMsisdnDetailsRequest request) {
		if (request.getCarrierID() != null)
			headers.setCarrierID(request.getCarrierID());

		if (request.getUserName() != null)
			headers.setUserName(request.getUserName());

		if (request.getUserPassword() != null)
			headers.setUserPassword(request.getUserPassword());

	}
}