package com.xius.client.msp.api.impl;

import java.io.UnsupportedEncodingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingRequest;
import com.xius.agent.smf.SMFManagement_xsd.ActivateTPTrackingResponse;
import com.xius.client.invoker.XBusDeviceServiceInvoker;
import com.xius.client.msp.api.invoker.SelfcareSubMgmtInvoker;
import com.xius.msp.api.messages.ActivateTPRequest;
import com.xius.msp.api.messages.ActivateTPResponse;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsRequest;
import com.xius.msp.selfcare.messages.SubscriberManagement.GetIDvalueBylastDigitsResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.xbus.messages.provisioning.device.ActivateTPtoSubscriberRequest;
import com.xius.xbus.messages.provisioning.device.ActivateTPtoSubscriberResponse;

@Component
public class ActivateTPImpl {
	private static final Logger LOGGER = LogManager.getLogger(ActivateTPImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private XBusDeviceServiceInvoker invoker;

	@Autowired(required = true)
	SelfcareSubMgmtInvoker subMgmtInvoker;

	@Autowired(required = true)
	ActivateTPTrackingImpl tpTracking;

	String transID = null;

	public ActivateTPResponse activateTP(ActivateTPRequest activateTPRequest) throws MSPAPIGWExceptions {
		try {
			transID = setHeader(activateTPRequest);

			GetIDvalueBylastDigitsResponse selfCareRespose = checkIDValue(activateTPRequest);

			ActivateTPtoSubscriberResponse xBusResponse = null;
			ActivateTPResponse response = null;

			if (selfCareRespose != null && selfCareRespose.getFlag() != null
					&& selfCareRespose.getFlag().trim().equalsIgnoreCase("Y")) {
				ActivateTPtoSubscriberRequest xBusRequest = getXbusRequest(activateTPRequest, headers, selfCareRespose);

				if (xBusRequest != null) {
					xBusResponse = invoker.activateTPtoSubscriber(xBusRequest, headers);
				} else {
					smfIinsertUpdateTracker(null, "U", "Null Request", transID);
					response = new ActivateTPResponse();
					response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseMessage(MSPAPIGWConstants.FAILURE);
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					if (LOGGER.isErrorEnabled())
						LOGGER.error("ActivateTPImpl-activateTP of xBus ActivateTPtoSubscriberRequest is Null");
				}
				if (xBusResponse != null) {
					response = setAgentResponse(xBusResponse);
				} else {
					smfIinsertUpdateTracker(null, "U", "Null Response From Xbus ", transID);
					response = new ActivateTPResponse();
					response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseMessage("XBUS RESPONSE NULL");
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					if (LOGGER.isErrorEnabled())
						LOGGER.error("ActivateTPImpl-activateTP of xBus ActivateTPtoSubscriberResponse is Null");
				}
			} else {
				smfIinsertUpdateTracker(null, "U", "Invalid IDValue", transID);
				LOGGER.error("ActivateTPImpl-activateTP of Unable to found IDValue by given IDValue :"
						+ activateTPRequest.getIdValue());
				response = new ActivateTPResponse();
				response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseMessage("NO DATA FOUND FOR GIVEN IDValue");
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			}

			return response;
		} catch (MSPAPIGWExceptions e) {

			ActivateTPResponse response = new ActivateTPResponse();
			if (LOGGER.isErrorEnabled()) {
				e.printStackTrace();
				LOGGER.error("MSP-APIController - activateTP() - Exception is " + e);
			}
			smfIinsertUpdateTracker(null, "U", e.getErrorCode() + "#" + e.getErrorMessage(), transID);
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
			response.setResponseMessage(e.getMessage());
			return response;
		} finally {
			transID = null;
		}
	}

	private String setHeader(ActivateTPRequest activateTPRequest) throws MSPAPIGWExceptions {
		if (activateTPRequest.getCarrierID() != null)
			headers.setCarrierID(activateTPRequest.getCarrierID());

		if (activateTPRequest.getUserName() != null)
			headers.setUserName(activateTPRequest.getUserName());

		if (activateTPRequest.getUserPassword() != null)
			headers.setUserPassword(activateTPRequest.getUserPassword());

		String transID = smfIinsertUpdateTracker(activateTPRequest, "I", null, null);
		return transID;
	}

	private String smfIinsertUpdateTracker(ActivateTPRequest activateTPRequest, String flag, String remarks,
			String transID) throws MSPAPIGWExceptions {
		ActivateTPTrackingRequest smfReq = new ActivateTPTrackingRequest();

		if (activateTPRequest!=null&&activateTPRequest.getIdType() != null)
			smfReq.setIDType(activateTPRequest.getIdType());

		if (activateTPRequest!=null&&activateTPRequest.getIdValue() != null)
			smfReq.setLast5DigitsOfIDValue(activateTPRequest.getIdValue());

		if (activateTPRequest!=null&&activateTPRequest.getLastName() != null)
			smfReq.setLastName(activateTPRequest.getLastName());

		if (activateTPRequest!=null&&activateTPRequest.getMsisdn() != null)
			smfReq.setMSISDN(activateTPRequest.getMsisdn());

		if (flag != null)
			smfReq.setFlag(flag);

		if (remarks != null)
			smfReq.setRemarks(remarks);

		if (transID != null)
			smfReq.setTransRefNumber(transID);

		if (activateTPRequest!=null&&activateTPRequest.getChannel() != null)
			smfReq.setChannel(activateTPRequest.getChannel());

		ActivateTPTrackingResponse smfResponse = tpTracking.activateTPTracking(smfReq, headers);
		if (smfResponse != null && smfResponse.getTransRefNumber() != null) {

			LOGGER.info("ActivateTPImpl-ActivateTPTracking  TransRefNumber :" + smfResponse.getTransRefNumber());
			return smfResponse.getTransRefNumber();
		}

		return null;
	}

	private GetIDvalueBylastDigitsResponse checkIDValue(ActivateTPRequest activateTPRequest) throws MSPAPIGWExceptions {
		GetIDvalueBylastDigitsRequest request = new GetIDvalueBylastDigitsRequest();

		if (activateTPRequest.getIdType() != null)
			request.setIDType(activateTPRequest.getIdType());

		if (activateTPRequest.getIdValue() != null)
			request.setLast5DigitsOfIDValue(activateTPRequest.getIdValue());

		if (activateTPRequest.getLastName() != null) {

			try {

				byte[] utf8Bytes;
				utf8Bytes = activateTPRequest.getLastName().trim().getBytes("UTF-8");
				String lastNmae = new String(utf8Bytes, "UTF-8");
				request.setLastName(lastNmae);

			} catch (UnsupportedEncodingException e) {
				smfIinsertUpdateTracker(null, "U", "-UnsupportedEncodingException -UTF-8 Error for lastName", transID);
				LOGGER.info("ActivateTPImpl -UnsupportedEncodingException -UTF-8 Spanish - lastName ");
				e.printStackTrace();
			}

		}

		GetIDvalueBylastDigitsResponse respose = subMgmtInvoker.getIDvalueBylastDigits(request, headers);
		if (respose != null) {
			if (respose.getIDValue() != null) {
				LOGGER.info("ActivateTPImpl -GetIDvalueBylastDigits - IDVALUE:" + respose.getIDValue());
			} else {
				LOGGER.info("ActivateTPImpl -GetIDvalueBylastDigits - IDVALUE IS  NULL ");
			}

		}
		return respose;
	}

	private ActivateTPResponse setAgentResponse(ActivateTPtoSubscriberResponse xBusResponse) throws MSPAPIGWExceptions {

		ActivateTPResponse response = new ActivateTPResponse();
		// If ERROR from xbus then transaction id

		if (xBusResponse.getStatusCode().getValue().equalsIgnoreCase("ERROR")) {

			String errorCode = null;
			String errorMessage = null;

			com.xius.xbus.messages.common.ErrorData[] errors = xBusResponse.getErrors();
			for (int i = 0; i < errors.length; i++) {

				errorCode = errors[i].getErrorCode();
				errorMessage = errors[i].getErrorMessage();
			}

			if (LOGGER.isInfoEnabled())
				LOGGER.info("XBusDeviceServiceInvoker  ActivateTPtoSubscriberResponse Error Code :" + errorCode);
			if (LOGGER.isInfoEnabled())
				LOGGER.info("XBusDeviceServiceInvoker  ActivateTPtoSubscriberResponse Error Msg :" + errorMessage);

			smfIinsertUpdateTracker(null, "U", errorCode + "#" + errorMessage, transID);

			if (xBusResponse.getStatusCode().getValue() != null) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("Exception ::" + errorCode + "#" + errorMessage);

				throw new MSPAPIGWExceptions(errorCode, errorMessage);

			}
			
		}

		if (xBusResponse != null) {

			if (xBusResponse.getStatusCode() != null
					&& (xBusResponse.getStatusCode().getValue().equalsIgnoreCase("success")
							|| xBusResponse.getStatusCode().getValue().equalsIgnoreCase("WARNING"))) {
				if (LOGGER.isInfoEnabled())
					LOGGER.info("XBusDeviceServiceInvoker  ActivateTPtoSubscriberResponse Status Code:"
							+ xBusResponse.getStatusCode().getValue());
				if (xBusResponse.getStatusCode().getValue() != null) {
					response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
					response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				}
				smfIinsertUpdateTracker(null, "U", MSPAPIGWConstants.SUCCESS, transID);

				return response;
			}

		}
		return response;

	}

	private ActivateTPtoSubscriberRequest getXbusRequest(ActivateTPRequest activateTPRequest, CommonHeaders headers2,
			GetIDvalueBylastDigitsResponse idValue) {
		ActivateTPtoSubscriberRequest xbusReq = new ActivateTPtoSubscriberRequest();
		if (activateTPRequest.getMsisdn() != null)
			xbusReq.setMSISDN(activateTPRequest.getMsisdn());

		if (activateTPRequest.getIdType() != null)
			xbusReq.setIDType(activateTPRequest.getIdType());

		LOGGER.info("ActivateTPImpl  -  IDValue is :" + idValue.getIDValue());

		if (idValue != null && idValue.getIDValue() != null)
			xbusReq.setIDValue(idValue.getIDValue());

		if (activateTPRequest.getChannel() != null)
			xbusReq.setChannel(activateTPRequest.getChannel());

		if (activateTPRequest.getLastName() != null)
			xbusReq.setLastName(activateTPRequest.getLastName());

		return xbusReq;

	}

}
