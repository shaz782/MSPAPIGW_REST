package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.XBusBundleServiceInvoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.GiftPackRequest;
import com.xius.rmsp.messages.GiftPackResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.xbus.messages.billing.bundle.Bundle;
import com.xius.xbus.messages.billing.bundle.GiftBundlesRequest;
import com.xius.xbus.messages.billing.bundle.GiftBundlesResponse;
import com.xius.xbus.messages.common.AccountType;

@Component
public class GiftPackImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(GiftPackImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private XBusBundleServiceInvoker invoker;
	
	
	GiftPackResponse response=null;
	GiftBundlesRequest xBusRequest=null;
	GiftBundlesResponse xBusResponse = null;
	
	String  transId=null;
	
	public GiftPackResponse giftPack(GiftPackRequest giftPackRequest) throws MSPAPIGWExceptions {
		
		xBusRequest = getAgentRequest(giftPackRequest, headers);
		if (xBusRequest != null) {
			xBusResponse = invoker.giftBundle(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GiftPackImpl-giftPack of xBus ATPSubscriptionRequest is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("GiftPackImpl-giftPack of xBus ATPSubscriptionResponse is Null");
		}
		return response;
	}
	
	
	private GiftPackResponse setAgentResponse(GiftBundlesResponse xBusResponse) throws MSPAPIGWExceptions {
		
		if(xBusResponse != null){
			response = new GiftPackResponse();
			
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
					if(xBusResponse.getTransactionRefId()!=null) {
						response.setTransRefNo(xBusResponse.getTransactionRefId());
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

	private GiftBundlesRequest getAgentRequest(GiftPackRequest request, CommonHeaders headers) throws MSPAPIGWExceptions{
		
		if (request != null) {
			
				xBusRequest = new GiftBundlesRequest();
				
				if (request.getSrcMsisdn() != null) {
					AccountType srcAccType=new AccountType();
					srcAccType.setMsisdn(request.getSrcMsisdn());
					xBusRequest.setSrcAccount(srcAccType);
				} else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "srcMSISDN Number Can't be Null");
				}
				
				if (request.getDestMsisdn() != null) {
					AccountType destAccType=new AccountType();
					destAccType.setMsisdn(request.getDestMsisdn());
					xBusRequest.setDestAccount(destAccType);
				} else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "destMSISDN Number Can't be Null");
				}

				if (request.getPublicityID() != null) {
					Bundle[] bundleList=new Bundle[1];
					Bundle bundle=new Bundle();
					bundle.setBundleName(request.getPublicityID());
					bundleList[0]=bundle;
					xBusRequest.setBundleList(bundleList);
				}
				if (request.getTransRefNo() != null) {
					transId = request.getTransRefNo();
					xBusRequest.setTransactionId(transId);
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

		return xBusRequest;
	}

}		
					