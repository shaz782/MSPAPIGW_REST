package com.xius.client.msp.api.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xius.client.impl.GetAccountDetailsImpl;
import com.xius.client.msp.api.invoker.SubscriberManagementAgentInvoker;
import com.xius.msp.api.messages.ValidateTPRequest;
import com.xius.msp.api.messages.ValidateTPResponse;
import com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPRequest;
import com.xius.msp.billing.messages.SubscriberManagement.CheckCommercialTPResponse;
import com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagRequest;
import com.xius.msp.billing.messages.SubscriberManagement.GetCommercialSimFlagResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GetAccountDetailsRequest;
import com.xius.rmsp.messages.GetAccountDetailsResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

@Component
public class ValidateTPImpl {
	private static final Logger LOGGER = LogManager.getLogger(ValidateTPImpl.class);

	@Autowired(required = true)
	GetAccountDetailsImpl gettAcctDetailsImpl;

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SubscriberManagementAgentInvoker invoker;

	@Autowired(required = true)
	public Utility utility;

	GetAccountDetailsResponse getAccntResponse = null;
	GetCommercialSimFlagResponse commercialSimResponse = null;
	GetCommercialSimFlagRequest getCommercialSimFlagRequest = null;
	CheckCommercialTPResponse checkCommercialagentResponse = null;
	ValidateTPResponse validateTPResponse = null;

	public ValidateTPResponse validateTP(ValidateTPRequest request) throws MSPAPIGWExceptions {

		/**
		 * @Get_AccountDetails_Of_MSISDN
		 */
		getAccntResponse = getAccountDetails(request);
		if (getAccntResponse != null && getAccntResponse.getIccid() != null) {
			Boolean checkCommSim = checkIsCommercialSim(getAccntResponse, request);
			if (checkCommSim) {
				Boolean commTP = checkIsCommTP(request);
				if (commTP) {
					validateTPResponse= new ValidateTPResponse();
					validateTPResponse.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					validateTPResponse.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					validateTPResponse.setResponseMessage(MSPAPIGWConstants.SUCCESS);
					validateTPResponse.setValidate(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);// 0
				} else {
					validateTPResponse= new ValidateTPResponse();
					validateTPResponse.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					validateTPResponse.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					validateTPResponse.setResponseMessage("Is Not Commercial_TP");
					validateTPResponse.setValidate(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);// 1
				}
				
			} else {//non commercial
				validateTPResponse= new ValidateTPResponse();
				validateTPResponse.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				validateTPResponse.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				validateTPResponse.setResponseMessage("NON COMMERCIAL SIM");
				validateTPResponse.setValidate(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);// 0
			}

		} else {
			validateTPResponse= new ValidateTPResponse();
			validateTPResponse.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			validateTPResponse.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			validateTPResponse.setResponseMessage(MSPAPIGWConstants.IN_VALID_REQUEST_MSG);
			LOGGER.error("ValidateTPImpl- validateTP of GetAccountDetailsResponse / Iccid  is Null");
		}
		return validateTPResponse;
	}

	private Boolean checkIsCommTP(ValidateTPRequest request) throws MSPAPIGWExceptions {
		Boolean commTP = false;
		CheckCommercialTPRequest aRequest = new CheckCommercialTPRequest();

		if (request.getMsisdn() != null) {
			aRequest.setMSISDN(request.getMsisdn());
		}

		checkCommercialagentResponse = invoker.checkCommercialTP(aRequest, headers);

		if (checkCommercialagentResponse != null) {
			if (checkCommercialagentResponse.getTpCategory().equalsIgnoreCase("Y")) {
				commTP = true;
				LOGGER.info("ValidateTPImpl- validateTP --  Given TP Is Commercial");
			}else {
				LOGGER.info("ValidateTPImpl- validateTP --  Given TP Is Not Commercial");
			}
		} else {
			LOGGER.error("ValidateTPImpl- validateTP of CheckCommercialTPResponse  is Null");
		}
		return commTP;

	}

	/**
	 * 
	 * @param getAccntResponse2
	 * @param request
	 * @return
	 * @throws MSPAPIGWExceptions
	 */
	private Boolean checkIsCommercialSim(GetAccountDetailsResponse getAccntResponse2, ValidateTPRequest request)
			throws MSPAPIGWExceptions {
		Boolean checkCommSim = false;

		getCommercialSimFlagRequest = new GetCommercialSimFlagRequest();

		getCommercialSimFlagRequest.setSimNo(getAccntResponse2.getIccid());

		commercialSimResponse = invoker.checkCommercialSIM(getCommercialSimFlagRequest, headers);
		if (commercialSimResponse != null && commercialSimResponse.getFlag() != null) {
			if (commercialSimResponse.getFlag().equalsIgnoreCase("Y")) {
				checkCommSim = true;
				LOGGER.info("ValidateTPImpl- validateTP --  Given SIM Is  Commercial");
			} else {
				LOGGER.info("ValidateTPImpl- validateTP --  Given SIM Is Not Commercial");
			}

		} else {
			LOGGER.error("ValidateTPImpl- validateTP of GetCommercialSimFlagResponse   is Null");
		}

		return checkCommSim;
	}

	/**
	 * 
	 * @param request
	 * @return
	 * @throws MSPAPIGWExceptions
	 */
	private GetAccountDetailsResponse getAccountDetails(ValidateTPRequest request) throws MSPAPIGWExceptions {

		GetAccountDetailsRequest accntrequest = new GetAccountDetailsRequest();

		if (request.getMsisdn() != null) {
			accntrequest.setMsisdn(request.getMsisdn());

		}
		if (request.getCarrierID() != null) {
			accntrequest.setCarrierID(request.getCarrierID());
			headers.setCarrierID(request.getCarrierID());
		}

		if (request.getUserName() != null) {
			accntrequest.setUserName(request.getUserName());
			headers.setUserName(request.getUserName());
		}

		if (request.getUserPassword() != null) {
			accntrequest.setUserPassword(request.getUserPassword());
			headers.setUserPassword(request.getUserPassword());
		}

		GetAccountDetailsResponse acctResponse = gettAcctDetailsImpl.getAccountDetails(accntrequest);
		return acctResponse;
	}

}
