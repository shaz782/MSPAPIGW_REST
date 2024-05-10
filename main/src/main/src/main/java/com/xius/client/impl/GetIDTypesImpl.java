package com.xius.client.impl;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.LoginServicesInvoker;
import com.xius.msp.api.messages.GetIDTypesRequest;
import com.xius.msp.api.messages.GetIDTypesResponse;
import com.xius.msp.api.messages.IDTypes;
import com.xius.msp.billing.messages.loginServices.GetIdTypesRequest;
import com.xius.msp.billing.messages.loginServices.GetIdTypesResponse;
import com.xius.msp.billing.messages.loginServices.IdTypesData;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shabbeer.shaik
 * @since 7th Mar,2024 Description : From Here we will invoke the InfinetBilling
 *        Services.
 */

@Component
public class GetIDTypesImpl {
	private static final Logger LOGGER = LogManager.getLogger(GetIDTypesImpl.class);
	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private LoginServicesInvoker invoker;

	@Autowired(required = true)
	public Utility utility;

	public GetIDTypesResponse getIDTypes(GetIDTypesRequest getIDTypesRequest) throws MSPAPIGWExceptions {

		com.xius.msp.billing.messages.loginServices.GetIdTypesResponse agentResponse = null;

		com.xius.msp.api.messages.GetIDTypesResponse jsonResponse = null;

		com.xius.msp.billing.messages.loginServices.GetIdTypesRequest agentRequest = getAgentRequest(getIDTypesRequest,
				headers);
		if (agentRequest != null) {
			agentResponse = invoker.getIdTypes(agentRequest, headers);
		} else {
			jsonResponse = new GetIDTypesResponse();
			jsonResponse.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			jsonResponse.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			jsonResponse.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetIDTypesImpl-getIDTypes of GetIDTypesRequest is Null");
		}
		if (agentResponse != null) {
			jsonResponse = setAgentResponse(agentResponse);
		} else {
			jsonResponse = new GetIDTypesResponse();
			jsonResponse.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			jsonResponse.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			jsonResponse.setResponseMessage("NULL RESPONSE");
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetIDTypesImpl-getIDTypes of GetIDTypesResponse is Null");
		}
		return jsonResponse;
	}

	private GetIDTypesResponse setAgentResponse(GetIdTypesResponse agentResponse) {

		com.xius.msp.api.messages.GetIDTypesResponse jsonResponse = new GetIDTypesResponse();
		if (agentResponse != null) {
			if (agentResponse.getIdTypesList() != null) {

				IdTypesData[] idTypeData = agentResponse.getIdTypesList();
				ArrayList<IDTypes> idTypes = new ArrayList<IDTypes>();
				for (IdTypesData idType : idTypeData) {
					IDTypes idValues = new IDTypes();
					if (idType != null && idType.getIdCode() != null) {
						idValues.setIdCode(idType.getIdCode() + "".trim());
					}
					if (idType != null && idType.getIdName() != null) {
						idValues.setIdName(idType.getIdName());
					}
					idTypes.add(idValues);
				}
				if (idTypes != null) {
					jsonResponse.setIdTypes(idTypes);
				}

			}
			jsonResponse.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
			jsonResponse.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
			jsonResponse.setResponseMessage(MSPAPIGWConstants.SUCCESS);
		}
		return jsonResponse;
	}

	private GetIdTypesRequest getAgentRequest(GetIDTypesRequest getIDTypesRequest, CommonHeaders headers) {
		com.xius.msp.billing.messages.loginServices.GetIdTypesRequest agentRequest = new GetIdTypesRequest();

		if (getIDTypesRequest != null) {
			if (getIDTypesRequest.getCarrierID() != null) {
				headers.setCarrierID(getIDTypesRequest.getCarrierID());
			}
			if (getIDTypesRequest.getUserName() != null) {
				headers.setUserName(getIDTypesRequest.getUserName());
			}

			if (getIDTypesRequest.getUserPassword() != null) {
				headers.setUserPassword(getIDTypesRequest.getUserPassword());
			}
			

			String networkName = utility.getProperty("iba.NetworkName");
			LOGGER.info("GetIDTypesImpl-getIDTypes of iba.NetworkName is :"+networkName);
			if ( networkName!= null) {
				agentRequest.setNetworkName(networkName);
			}else {
				LOGGER.error("GetIDTypesImpl-getIDTypes of iba.NetworkName is NULL");
			}
		}

		return agentRequest;
	}

}
