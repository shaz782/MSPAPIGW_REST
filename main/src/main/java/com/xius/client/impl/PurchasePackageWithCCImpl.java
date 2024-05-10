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
import com.xius.rmsp.messages.PurchaseATPCCRequest;
import com.xius.rmsp.messages.PurchaseATPCCResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionWithCCResponse;
import com.xius.xbus.messages.billing.tariff.ActivateBulkATPRequest;
import com.xius.xbus.messages.billing.tariff.ActivateBulkATPResponse;

@Component
public class PurchasePackageWithCCImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(PurchasePackageWithCCImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private XBusTariffServiceInvoker invoker;
	
	@Autowired(required = true)
	private AccountManagementInvoker accountManagementInvoker;
	
	PurchaseATPCCResponse response=null;
	ATPSubscriptionWithCCRequest xBusRequest=null;
	ATPSubscriptionWithCCResponse xBusResponse = null;
	
	ActivateBulkATPRequest xBusRequestWithOutCC=null;
	ActivateBulkATPResponse xBusResponseWithOutCC = null;
	
	String  transRefNumber=null;
	
	public PurchaseATPCCResponse purchasePackageWithCc(PurchaseATPCCRequest PurchaseATPCCRequest) throws MSPAPIGWExceptions {
		
		xBusRequest = getAgentRequest(PurchaseATPCCRequest, headers);
		if (xBusRequest != null) {
			xBusResponse = invoker.atpSubscriptionWithCC(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PurchasePackageWithCCImpl-purchasePackageWithCc of xBus ATPSubscriptionRequest is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PurchasePackageWithCCImpl-purchasePackageWithCc of xBus ATPSubscriptionResponse is Null");
		}
		return response;
	}
	
	
	private PurchaseATPCCResponse setAgentResponse(ATPSubscriptionWithCCResponse xBusResponse) throws MSPAPIGWExceptions {
		
		if(xBusResponse != null){
			response = new PurchaseATPCCResponse();
			
				if(xBusResponse.getStatusCode()!=null &&( xBusResponse.getStatusCode().getValue().equalsIgnoreCase("success") ||
						xBusResponse.getStatusCode().getValue().equalsIgnoreCase("WARNING"))){
					if (LOGGER.isInfoEnabled())
						LOGGER.info( "ATPSubscriptionInvoker  ATPSubscriptionWithCCResponse Status Code:"+xBusResponse.getStatusCode().getValue());
					if(xBusResponse.getStatusCode().getValue()!=null){
						response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
						response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
						response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					}
					if(xBusResponse.getTransationId()!=null){
						response.setTransID(xBusResponse.getTransationId());
					}
					if(transRefNumber!=null){
						response.setTransRefNo(transRefNumber);	
					}
				      return response;
				}
				
				if(xBusResponse.getStatusCode().getValue().equalsIgnoreCase("ERROR")){
					
					String errorCode = null;
					String errorMessage = null;
						
						com.xius.xbus.messages.common.ErrorData[] errors=xBusResponse.getErrors();
						for(int i=0;i<errors.length;i++){
							
							errorCode = errors[i].getErrorCode();
							errorMessage = errors[i].getErrorMessage();
						}	
						
						if (LOGGER.isInfoEnabled())
							LOGGER.info( "ATPSubscriptionInvoker  ATPSubscriptionWithCCResponse Error Code :"+errorCode);
						if (LOGGER.isInfoEnabled())
							LOGGER.info("ATPSubscriptionInvoker  ATPSubscriptionWithCCResponse Error Msg :"+errorMessage);
			
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

	private ATPSubscriptionWithCCRequest getAgentRequest(PurchaseATPCCRequest request, CommonHeaders headers)
			throws MSPAPIGWExceptions {

		if (request != null) {
				
			if (request.getMsisdn() == null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"MSISDN Number Can't be Null");
			}	
			if (request.getAccountId()==null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"AccountID Can't be Null");
			}
			
			if (mdnVsAccIDValidate(request, headers)) {
				xBusRequest = new ATPSubscriptionWithCCRequest();
				
					xBusRequest.setMsisdn(request.getMsisdn());
				
				if (request.getPublicityID() != null) {
					xBusRequest.setPublicityId(request.getPublicityID());
				}else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"PublicityID Can't be Null");
				}
				if (request.getTransRefNo() != null) {
					transRefNumber = request.getTransRefNo();
					xBusRequest.setTransationId(request.getTransRefNo());
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
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MDN Vs Account Validation Fail");
				throw new MSPAPIGWExceptions("00001", "Validation Fail");
			}
		}
		return xBusRequest;
	}

	private boolean mdnVsAccIDValidate(PurchaseATPCCRequest request, CommonHeaders headers) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("PurchasePackageWithCCImpl  mdnVsAccIDValidate  matheod called");

		if ((request.getMsisdn() != null && request.getAccountId() != null)) {

			MDNBasedGetNwIdRequest agentRequest = new MDNBasedGetNwIdRequest();
			MDNBasedGetNwIdResponse agentResponse = null;
			
			if (request.getCarrierID() != null) {
				headers.setCarrierID(request.getCarrierID());
			}
			if (request.getUserName() != null) {
				headers.setUserName(request.getUserName());
			}
			if (request.getUserPassword() != null) {
				headers.setUserPassword(request.getUserPassword());
			}
			
			
			if (request.getMsisdn() != null) {
				agentRequest.setMSISDN(request.getMsisdn());
				if (LOGGER.isInfoEnabled())
					LOGGER.info(
							"PurchasePackageWithCCImpl  mdnVsAccIDValidate- Request Details: " + agentRequest.getMSISDN());
			}

			agentResponse = accountManagementInvoker.mdnBasedGetNwId(agentRequest, headers);
			if (agentResponse != null) {
				if (LOGGER.isInfoEnabled())
					LOGGER.info("PurchasePackageWithCCImpl  mdnVsAccIDValidate- Response Details For : "
							+ agentResponse.getAccountId());
				if (agentResponse.getAccountId() != 0L) {
					return String.valueOf(agentResponse.getAccountId()).equalsIgnoreCase(request.getAccountId());
				}
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("PurchasePackageWithCCImpl  mdnVsAccIDValidate- Response is Null");
				return false;
			}

		}
		return true;
	}
	
	
	//Here we adding this to avoid TIA Credit Call
	
	public PurchaseATPCCResponse purchasePackageWithOutCc(PurchaseATPCCRequest PurchaseATPCCRequest) throws MSPAPIGWExceptions {
		
		xBusRequestWithOutCC = getAgentRequestWithOutCC(PurchaseATPCCRequest, headers);
		if (xBusRequestWithOutCC != null) {
			xBusResponseWithOutCC = invoker.activateBulkAtpsub(xBusRequestWithOutCC, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PurchasePackageWithCCImpl-purchasePackageWithOutCc of xBus ATPSubscriptionRequest is Null");
		}
		if (xBusResponseWithOutCC != null) {
			response = setAgentResponseWithOutCC(xBusResponseWithOutCC);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("PurchasePackageWithCCImpl-purchasePackageWithOutCc of xBus ATPSubscriptionResponse is Null");
		}
		return response;
	}
	
	private ActivateBulkATPRequest getAgentRequestWithOutCC(PurchaseATPCCRequest request, CommonHeaders headers)
			throws MSPAPIGWExceptions {

		if (request != null) {
			if (request.getMsisdn() == null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"MSISDN Number Can't be Null");
			}	
			if (request.getAccountId()==null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"AccountID Can't be Null");
			}
			if (mdnVsAccIDValidate(request, headers)) {
				xBusRequestWithOutCC = new ActivateBulkATPRequest();
				if (request.getMsisdn() != null) {
					xBusRequestWithOutCC.setMsisdn(request.getMsisdn());
				}

				if (request.getPublicityID() != null) {
					xBusRequestWithOutCC.setPublicityId(request.getPublicityID());
				}
				if (request.getTransRefNo() != null) {
					transRefNumber = request.getTransRefNo();
					xBusRequestWithOutCC.setTransationId(request.getTransRefNo());
				}
				if (request.getAuthorizationID() != null) {
					xBusRequestWithOutCC.setAuthorizationID(request.getAuthorizationID());
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
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MDN Vs Account Validation Fail");
				throw new MSPAPIGWExceptions("00001", "Validation Fail");
			}
		}
		return xBusRequestWithOutCC;
	}
	
	private PurchaseATPCCResponse setAgentResponseWithOutCC(ActivateBulkATPResponse xBusResponseWithOutCC) throws MSPAPIGWExceptions {
		
		if(xBusResponseWithOutCC != null){
			response = new PurchaseATPCCResponse();
			
				if(xBusResponseWithOutCC.getStatusCode()!=null &&( xBusResponseWithOutCC.getStatusCode().getValue().equalsIgnoreCase("success") ||
						xBusResponseWithOutCC.getStatusCode().getValue().equalsIgnoreCase("WARNING"))){
					if (LOGGER.isInfoEnabled())
						LOGGER.info( "ATPSubscriptionInvoker  ATPSubscriptionWithCCResponse Status Code:"+xBusResponseWithOutCC.getStatusCode().getValue());
					if(xBusResponseWithOutCC.getStatusCode().getValue()!=null){
						response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
						response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
						response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					}
					if(xBusResponseWithOutCC.getTransationId()!=null){
						response.setTransID(xBusResponseWithOutCC.getTransationId());
					}
					if(transRefNumber!=null){
						response.setTransRefNo(transRefNumber);	
					}
				      return response;
				}
				
				if(xBusResponseWithOutCC.getStatusCode().getValue().equalsIgnoreCase("ERROR")){
					
					String errorCode = null;
					String errorMessage = null;
						
						com.xius.xbus.messages.common.ErrorData[] errors=xBusResponseWithOutCC.getErrors();
						for(int i=0;i<errors.length;i++){
							
							errorCode = errors[i].getErrorCode();
							errorMessage = errors[i].getErrorMessage();
						}	
						
						if (LOGGER.isInfoEnabled())
							LOGGER.info( "ATPSubscriptionInvoker  ATPSubscriptionWithCCResponse Error Code :"+errorCode);
						if (LOGGER.isInfoEnabled())
							LOGGER.info("ATPSubscriptionInvoker  ATPSubscriptionWithCCResponse Error Msg :"+errorMessage);
			
						if(xBusResponseWithOutCC.getStatusCode().getValue()!=null){
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
	
}		
					