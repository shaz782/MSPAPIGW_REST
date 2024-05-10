package com.xius.client.msp.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.msp.api.invoker.SubscriberManagementAgentInvoker;
import com.xius.msp.api.messages.GetServiceDetailsRequest;
import com.xius.msp.api.messages.GetServiceDetailsResponse;
import com.xius.msp.api.messages.ModuleDetails;
import com.xius.msp.billing.messages.SubscriberManagement.CatgeatpDtlsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the
 *        InfinetBilling APIs Services.
 */
@Component
public class GetServiceDetailsImpl {

	private static final Logger LOGGER = LogManager.getLogger(GetServiceDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private SubscriberManagementAgentInvoker invoker;

	@Autowired(required = true)
	public Utility utility;

	GetServiceDetailsResponse response = null;
	com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsRequest agentRequest = null;
	com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse agentResponse = null;

	public GetServiceDetailsResponse getServiceDetails(GetServiceDetailsRequest getServiceDetailsRequest)
			throws MSPAPIGWExceptions {

		agentRequest = getAgentRequest(getServiceDetailsRequest, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getMsisdnbasedATPDtls(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("rechargeDataImpl-getActivePacks of GetActivePacksRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("rechargeDataImpl-getActivePacks of GetActivePacksResponse is Null");
		}
		return response;
	}

	private GetServiceDetailsResponse setAgentResponse(
			com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsResponse agentResponse) {

		// charge#planDescription#publicityId

		if (agentResponse != null) {
			response = new GetServiceDetailsResponse();
			List<ModuleDetails> moduledleDtlsType = new ArrayList<ModuleDetails>();

			if (agentResponse.getAtpDtls() != null) {

				for (int i = 0; i < agentResponse.getAtpDtls().length; i++) {
					CatgeatpDtlsType CatgeatpDtlsType = agentResponse.getAtpDtls()[i];

					ModuleDetails moduleDetails = new ModuleDetails();
					if (CatgeatpDtlsType.getCategory() != null) {
						moduleDetails.setCategory(CatgeatpDtlsType.getCategory());
					}
					if (CatgeatpDtlsType.getCharge() != null) {
						moduleDetails.setCharge(CatgeatpDtlsType.getCharge());
					}
					if (CatgeatpDtlsType.getPublicityId() != null) {
						moduleDetails.setPublicityId(CatgeatpDtlsType.getPublicityId());
					}
					if (CatgeatpDtlsType.getServicePackageDesc() != null) {
						moduleDetails.setPlanDescription(CatgeatpDtlsType.getServicePackageDesc());
					}
					moduledleDtlsType.add(moduleDetails);
				}

			}
			response.setModuledleDtlsType(moduledleDtlsType);

		} else {
			if (LOGGER.isErrorEnabled()) {
				LOGGER.error("getAccountDetails-getActivePacks of agentResponse is Null");
			}
		}
		return response;
	}

	private com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsRequest getAgentRequest(
			GetServiceDetailsRequest request, CommonHeaders headers) {

		if (request != null) {
			agentRequest = new com.xius.msp.billing.messages.SubscriberManagement.GetMsisdnbasedATPDtlsRequest();
			if (request.getMsisdn() != null) {
				agentRequest.setMsisdn(request.getMsisdn());
			}
			if (request.getCarrierID() != null) {
				headers.setCarrierID(request.getCarrierID());
			}
			if (request.getUserName() != null) {
				headers.setUserName(request.getUserName());
			}
			if (request.getUserPassword() != null) {
				headers.setUserPassword(request.getUserPassword());
			}
			String categoryProp = getCategoryList();
			if (categoryProp != null) {
				if (categoryProp.length() > 0) {
					String[] categoryPropArr = categoryProp.split(",");
					agentRequest.setCategoryList(categoryPropArr);
				}
			}

		}

		return agentRequest;
	}

	private String getCategoryList() {

		String prop = utility.getProperty("category_list");
		if (prop == null || prop.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GetServiceDetailsImpl.getCategoryList-category_list is Null so invoking TB details");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("GetServiceDetailsImpl.getCategoryList-category_list ::" + prop);
		}
		return prop;
	}
}
