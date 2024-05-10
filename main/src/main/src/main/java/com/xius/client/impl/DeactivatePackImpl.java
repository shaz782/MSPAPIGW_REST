package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.XBusTariffServiceInvoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.DeactivatePackRequest;
import com.xius.rmsp.messages.DeactivatePackResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionRequest;
import com.xius.xbus.messages.billing.tariff.ATPSubscriptionResponse;

@Component
public class DeactivatePackImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(DeactivatePackImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private XBusTariffServiceInvoker invoker;
	
	
	DeactivatePackResponse response=null;
	ATPSubscriptionRequest xBusRequest=null;
	ATPSubscriptionResponse xBusResponse = null;
	
	String  transId=null;
	
	public DeactivatePackResponse deactivatePack(DeactivatePackRequest deactivatePackRequest) throws MSPAPIGWExceptions {
		
		xBusRequest = getAgentRequest(deactivatePackRequest, headers);
		if (xBusRequest != null) {
			xBusResponse = invoker.atpSubscription(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("DeactivatePackImpl-purchasePackage of xBus ATPSubscriptionRequest is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("DeactivatePackImpl-purchasePackage of xBus ATPSubscriptionResponse is Null");
		}
		return response;
	}
	
	
	private DeactivatePackResponse setAgentResponse(ATPSubscriptionResponse xBusResponse) throws MSPAPIGWExceptions {
		
		if(xBusResponse != null){
			response = new DeactivatePackResponse();
			
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

	private ATPSubscriptionRequest getAgentRequest(DeactivatePackRequest request, CommonHeaders headers) throws MSPAPIGWExceptions{
		
		if (request != null) {
			
				xBusRequest = new ATPSubscriptionRequest();
				if (request.getMsisdn() != null) {
					xBusRequest.setMsisdn(request.getMsisdn());
				} else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "MSISDN Number Can't be Null");
				}

				if (request.getPublicityID() != null) {
					xBusRequest.setPublicityId(request.getPublicityID());
				}
				if (request.getTransRefNo() != null) {
					transId = request.getTransRefNo();
					xBusRequest.setTransationId(request.getTransRefNo());
				}
				
				xBusRequest.setServiceFlag("UNSUBSCRIBED");
				
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
					