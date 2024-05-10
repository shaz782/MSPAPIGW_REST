package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.invoker.XBusTariffServiceInvoker;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdRequest;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.PurchaseATPRequest;
import com.xius.rmsp.messages.PurchaseATPResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;

@Component
public class PurchasePackageImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(PurchasePackageImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private XBusTariffServiceInvoker invoker;
	
	@Autowired(required = true)
	private AccountManagementInvoker accountManagementInvoker;
	
	PurchaseATPResponse response=null;
	ATPSubscriptionRequest xBusRequest=null;
	ATPSubscriptionResponse xBusResponse = null;
	
	String  transId=null;
	
	public PurchaseATPResponse purchasePackage(PurchaseATPRequest purchaseATPRequest) throws MSPAPIGWExceptions {
		
		xBusRequest = getAgentRequest(purchaseATPRequest, headers);
		if (xBusRequest != null) {
			xBusResponse = invoker.atpSubscription(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PurchasePackageImpl-purchasePackage of xBus ATPSubscriptionRequest is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PurchasePackageImpl-purchasePackage of xBus ATPSubscriptionResponse is Null");
		}
		return response;
	}
	
	
	private PurchaseATPResponse setAgentResponse(ATPSubscriptionResponse xBusResponse) throws MSPAPIGWExceptions {
		
		if(xBusResponse != null){
			response = new PurchaseATPResponse();
			
				if(xBusResponse.getStatusCode()!=null &&( xBusResponse.getStatusCode().getValue().equalsIgnoreCase("success") ||
						xBusResponse.getStatusCode().getValue().equalsIgnoreCase("WARNING"))){
					if (LOGGER.isInfoEnabled())
						LOGGER.info( "ATPSubscriptionInvoker  ATPSubscriptionResponse Status Code:"+xBusResponse.getStatusCode().getValue());
					if(xBusResponse.getStatusCode().getValue()!=null){
						response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
						response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
						response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					}
					if(transId!=null){
						response.setTransID(transId);
					}
					if(xBusResponse.getTransationId()!=null){
						response.setTransRefNo(xBusResponse.getTransationId());	
					}
				      return response;
				}
				//If ERROR from xbus then transaction id
				
				if(xBusResponse.getStatusCode().getValue().equalsIgnoreCase("ERROR")){
					
					String errorCode = null;
					String errorMessage = null;
						
						com.xius.xbus.messages.common.ErrorData[] errors=xBusResponse.getErrors();
						for(int i=0;i<errors.length;i++){
							
							errorCode = errors[i].getErrorCode();
							errorMessage = errors[i].getErrorMessage();
						}	
						
						if (LOGGER.isInfoEnabled())
							LOGGER.info( "ATPSubscriptionInvoker  ATPSubscriptionResponse Error Code :"+errorCode);
						if (LOGGER.isInfoEnabled())
							LOGGER.info("ATPSubscriptionInvoker  ATPSubscriptionResponse Error Msg :"+errorMessage);
			
						if(xBusResponse.getStatusCode().getValue()!=null){
							if (LOGGER.isErrorEnabled())
								LOGGER.error("Exception ::"+errorCode+"#"+errorMessage);
							
							throw new MSPAPIGWExceptions(errorCode,errorMessage);
							
						}
						if(errorCode!=null && (errorCode.equals("29055") || errorCode.equals("10017"))){
							if (LOGGER.isErrorEnabled())
								LOGGER.error("we get \"29055\" error code when xml engine is down");
							throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
						}
						else{
							if (LOGGER.isErrorEnabled())
								LOGGER.error("Exception ::"+errorCode+"#"+errorMessage);
							throw new MSPAPIGWExceptions(errorCode,errorMessage);
						}
					}
		}
		return response;
	}

	private ATPSubscriptionRequest getAgentRequest(PurchaseATPRequest request, CommonHeaders headers) throws MSPAPIGWExceptions{
		
		if (request != null) {
			if (request.getMsisdn() == null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"MSISDN Number Can't be Null");
			}	
			if (request.getAccountId()==null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"AccountID Can't be Null");
			}
			if (mdnVsAccIDValidate(request, headers)) {
				
				xBusRequest = new ATPSubscriptionRequest();
				if (request.getMsisdn() != null) {
					xBusRequest.setMsisdn(request.getMsisdn());
				} else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "MSISDN Number Can't be Null");
				}

				if (request.getPublicityID() != null) {
					xBusRequest.setPublicityId(request.getPublicityID());
				}else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"PublicityID Can't be Null");
				}
				if (request.getTransRefNo() != null) {
					transId = request.getTransRefNo();
					xBusRequest.setTransationId(request.getTransRefNo());
				}
				xBusRequest.setServiceFlag("SUBSCRIBED");
				if (request.getCarrierID() != null) {
					headers.setCarrierID(request.getCarrierID());
				}
				if (request.getUserName() != null) {
					headers.setUserName(request.getUserName());
				}
				if (request.getUserPassword() != null) {
					headers.setUserPassword(request.getUserPassword());
				}
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MDN Vs Account Validation Fail" );
				throw new MSPAPIGWExceptions("00001","Validation Fail");
			}
		}

		return xBusRequest;
	}


	private boolean mdnVsAccIDValidate(PurchaseATPRequest request, CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info( "PurchasePackageImpl  mdnVsAccIDValidate  matheod called");
		
		if((request.getMsisdn()!=null && request.getAccountId()!=null)) {
			
			MDNBasedGetNwIdRequest agentRequest=new MDNBasedGetNwIdRequest();
			MDNBasedGetNwIdResponse agentResponse =null;
			
			if (request.getCarrierID() != null) {
				headers.setCarrierID(request.getCarrierID());
			}
			if (request.getUserName() != null) {
				headers.setUserName(request.getUserName());
			}
			if (request.getUserPassword() != null) {
				headers.setUserPassword(request.getUserPassword());
			}
			
			if(request.getMsisdn()!=null) {
				agentRequest.setMSISDN(request.getMsisdn());
				if (LOGGER.isInfoEnabled())
					LOGGER.info( "PurchasePackageImpl  mdnVsAccIDValidate- Request Details: "+agentRequest.getMSISDN());
			}
			
			agentResponse=accountManagementInvoker.mdnBasedGetNwId(agentRequest, headers);
			if (agentResponse != null) {
				if (LOGGER.isInfoEnabled())
					LOGGER.info("PurchasePackageImpl  mdnVsAccIDValidate- Response Details For : "
							+ agentResponse.getAccountId());
				if (agentResponse.getAccountId() != 0L) {
					return String.valueOf(agentResponse.getAccountId()).equalsIgnoreCase(request.getAccountId());
				}
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("PurchasePackageImpl  mdnVsAccIDValidate- Response is Null");
				return false;
			}
		
		}
		return true;
	}
}		
					