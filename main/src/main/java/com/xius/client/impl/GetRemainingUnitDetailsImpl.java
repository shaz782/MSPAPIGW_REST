package com.xius.client.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.BillingSubMgmtV1Invoker;
import com.xius.msp.billing.messages.SubscriberManagementV1.DataDetailsInfoType;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse;
import com.xius.msp.billing.messages.SubscriberManagementV1.GlobalDetailsInfoType;
import com.xius.msp.billing.messages.SubscriberManagementV1.SmsDetailsInfoType;
import com.xius.msp.billing.messages.SubscriberManagementV1.VoiceDetailsInfoType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.BenefitDtlsType;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.DATADetails;
import com.xius.rmsp.messages.GLOBALDetails;
import com.xius.rmsp.messages.GetRemainingUnitDetailsRequest;
import com.xius.rmsp.messages.GetRemainingUnitDetailsResponse;
import com.xius.rmsp.messages.SMSDetails;
import com.xius.rmsp.messages.VoiceDetails;


/**
 * 
 * @author shashidhar.p
 * @since 13th Aug,2019 Description : From Here we will invoke the
 *        InfinetBilling APIs Services.
 */
@Component
public class GetRemainingUnitDetailsImpl {

	private static final Logger LOGGER = LogManager.getLogger(GetRemainingUnitDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BillingSubMgmtV1Invoker invoker;
	
	private List<BenefitDtlsType> benefitDtlsTypeList;

	GetRemainingUnitDetailsResponse response = null;
	GetRemainingUnitDetailRequest agentRequest = null;
	GetRemainingUnitDetailResponse agentResponse = null;

	public GetRemainingUnitDetailsResponse getRemainingUnitDetails(GetRemainingUnitDetailsRequest request)
			throws MSPAPIGWExceptions {

		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getRemainingUnitDetails(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error(
						"GetRemainingUnitDetailsImpl-getRemainingUnitDetails of GetRemainingUnitDetailRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error(
						"GetRemainingUnitDetailsImpl-getRemainingUnitDetails of GetRemainingUnitDetailResponse is Null");
		}
		return response;
	}

	private GetRemainingUnitDetailsResponse setAgentResponse(GetRemainingUnitDetailResponse agentResponse) {

		response = new GetRemainingUnitDetailsResponse();
		BenefitDtlsType benefitDtlsTypeObj=new BenefitDtlsType() ;

		if (agentResponse.getAcctID() != null) {
			response.setAccountId(String.valueOf(agentResponse.getAcctID()));
		}
		
		if (agentResponse.getPackValidity() != null) {
			response.setPackvalidity(agentResponse.getPackValidity());
		}
		if ((agentResponse.getBenefitDtls() != null)|| (agentResponse.getBenefitDtls() ==null)){
			benefitDtlsTypeObj.setVoiceDetails(null);
			benefitDtlsTypeObj.setSmsDetails(null);
			benefitDtlsTypeObj.setDataDetails(null);
			benefitDtlsTypeObj.setGlobalDetails(null);
		}
		if (agentResponse.getBenefitDtls()!=null && agentResponse.getBenefitDtls().length > 0) {
			benefitDtlsTypeList=new ArrayList<BenefitDtlsType>();
			for (com.xius.msp.billing.messages.SubscriberManagementV1.BenefitDtlsType infoType : agentResponse
					.getBenefitDtls()) {
				benefitDtlsTypeObj=new BenefitDtlsType() ;
				if (null != infoType.getPublicityId() && infoType.getPublicityId().length() > 0)
					benefitDtlsTypeObj.setPublicityID(infoType.getPublicityId());

				if (infoType.getVoiceDetailsList() != null) {
					VoiceDetails details = null;
					List<VoiceDetails> dtlList = new ArrayList<>();
					for (VoiceDetailsInfoType voiceInfoType : infoType.getVoiceDetailsList()) {
						details = new VoiceDetails();
						if (voiceInfoType.getBucketName() != null)
							details.setBucketName(voiceInfoType.getBucketName());
						if (voiceInfoType.getUnitsType() != null)
							details.setBucketType(voiceInfoType.getUnitsType());
						if (voiceInfoType.getRemainingUnits() != null)
							details.setBucketRemainingUnits(String.valueOf(voiceInfoType.getRemainingUnits()));
						if (voiceInfoType.getUnitsAllocated() != null)
							details.setUnitsAllocated(String.valueOf(voiceInfoType.getUnitsAllocated()));
						
						dtlList.add(details);
					}
					benefitDtlsTypeObj.setVoiceDetails(dtlList);
				} else {
					if (LOGGER.isInfoEnabled())
						LOGGER.error("GetRemainingUnitDetailsImpl-getRemainingUnitDetails of VoiceDetails is Null");

				}

				if (infoType.getSmsDetailsList() != null) {
					SMSDetails details = null;
					List<SMSDetails> dtlList = new ArrayList<>();
					for (SmsDetailsInfoType smsInfoTypeObj : infoType.getSmsDetailsList()) {
						details = new SMSDetails();
						if (smsInfoTypeObj.getBucketName() != null)
							details.setBucketName(smsInfoTypeObj.getBucketName());
						if (smsInfoTypeObj.getUnitsType() != null)
							details.setBucketType(smsInfoTypeObj.getUnitsType());
						if (smsInfoTypeObj.getRemainingUnits() != null)
							details.setBucketRemainingUnits(String.valueOf(smsInfoTypeObj.getRemainingUnits()));
						if (smsInfoTypeObj.getUnitsAllocated() != null)
							details.setUnitsAllocated((String.valueOf(smsInfoTypeObj.getUnitsAllocated())));
						dtlList.add(details);
					}
					benefitDtlsTypeObj.setSmsDetails(dtlList);
				} else {
					if (LOGGER.isInfoEnabled())
						LOGGER.error("GetRemainingUnitDetailsImpl-getRemainingUnitDetails of SMSDetails is Null");

				}

				if (infoType.getDataDetailsList() != null) {
					DATADetails details = null;
					List<DATADetails> dtlList = new ArrayList<>();
					for (DataDetailsInfoType dataInfoTypeObj : infoType.getDataDetailsList()) {
						details = new DATADetails();
						if (dataInfoTypeObj.getBucketName() != null)
							details.setBucketName(dataInfoTypeObj.getBucketName());
						if (dataInfoTypeObj.getUnitsType() != null)
							details.setBucketType(dataInfoTypeObj.getUnitsType());
						if (dataInfoTypeObj.getRemainingUnits() != null)
							details.setBucketRemainingUnits(String.valueOf(dataInfoTypeObj.getRemainingUnits()));
						if (dataInfoTypeObj.getUnitsAllocated() != null)
							details.setUnitsAllocated((String.valueOf(dataInfoTypeObj.getUnitsAllocated())));
						if (dataInfoTypeObj.getRatingGroup() != null)
							details.setRatingGroup(dataInfoTypeObj.getRatingGroup());
						dtlList.add(details);
					}
					benefitDtlsTypeObj.setDataDetails(dtlList);
				} else {
					if (LOGGER.isInfoEnabled())
						LOGGER.error("GetRemainingUnitDetailsImpl-getRemainingUnitDetails of DATADetails is Null");

				}
				if (infoType.getGlobalDetailsList() != null) {

					GLOBALDetails details = null;
					List<GLOBALDetails> dtlList = new ArrayList<>();
					for (GlobalDetailsInfoType globalDetailsInfoTypeObj : infoType.getGlobalDetailsList()) {
						details = new GLOBALDetails();
						if (globalDetailsInfoTypeObj.getBucketName() != null)
							details.setBucketName(globalDetailsInfoTypeObj.getBucketName());
						if (globalDetailsInfoTypeObj.getUnitsType() != null)
							details.setBucketType(globalDetailsInfoTypeObj.getUnitsType());
						if (globalDetailsInfoTypeObj.getRemainingUnits() != null)
							details.setBucketRemainingUnits(String.valueOf(globalDetailsInfoTypeObj.getRemainingUnits()));
						if (globalDetailsInfoTypeObj.getUnitsAllocated() != null)
							details.setUnitsAllocated(String.valueOf(globalDetailsInfoTypeObj.getUnitsAllocated()));
						dtlList.add(details);
					}
					benefitDtlsTypeObj.setGlobalDetails(dtlList);
				} else {
					if (LOGGER.isInfoEnabled())
						LOGGER.error("GetRemainingUnitDetailsImpl-getRemainingUnitDetails of GLOBALDetails is Null");
				}

				benefitDtlsTypeList.add(benefitDtlsTypeObj);
			}
			response.setBenefitDtlsType(benefitDtlsTypeList);
		} else {
			if (LOGGER.isInfoEnabled())
				LOGGER.error("GetRemainingUnitDetailsImpl-getRemainingUnitDetails of BenefitDtls is Null");

		}
		

		return response;

	}

	private GetRemainingUnitDetailRequest getAgentRequest(GetRemainingUnitDetailsRequest request,
			CommonHeaders headers) {

		if (request != null) {

			agentRequest = new GetRemainingUnitDetailRequest();
			if (request.getMsisdn() != null) {
				agentRequest.setMSISDN(request.getMsisdn());
			}
			if (request.getAccountId() != null) {
				agentRequest.setAcctID(Long.valueOf(request.getAccountId()));
			}
			if (request.getPublicityID() != null) {
				agentRequest.setPublicityId(request.getPublicityID());
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
		}

		return agentRequest;
	}

}
