package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.invoker.XBusDeviceServiceInvoker;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdRequest;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.SIMSwapRequest;
import com.xius.rmsp.messages.SIMSwapResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.xbus.messages.common.AccountType;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceRequest;
import com.xius.xbus.messages.provisioning.device.ChangeDeviceResponse;
import com.xius.xbus.messages.provisioning.device.DeviceType;

@Component
public class ChangeDeviceImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(ChangeDeviceImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private XBusDeviceServiceInvoker invoker;
	
	@Autowired(required = true)
	private AccountManagementInvoker accountManagementInvoker;
	
	SIMSwapResponse response=null;
	ChangeDeviceRequest xBusRequest=null;
	ChangeDeviceResponse xBusResponse = null;
	
	String  OldSimNo=null;
	
	public SIMSwapResponse simSwap(SIMSwapRequest simSwapRequest) throws MSPAPIGWExceptions {
		
		xBusRequest = getAgentRequest(simSwapRequest, headers);
		if (xBusRequest != null) {
			xBusResponse = invoker.simswap(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ChangeDeviceImpl-simSwap of xBus ChangeDeviceRequest is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("ChangeDeviceImpl-simSwap of xBus ChangeDeviceResponse is Null");
		}
		return response;
	}
	
	
	private SIMSwapResponse setAgentResponse(ChangeDeviceResponse xBusResponse) throws MSPAPIGWExceptions {
		
		if(xBusResponse != null){
			response = new SIMSwapResponse();
			
				if(xBusResponse.getStatusCode()!=null &&( xBusResponse.getStatusCode().getValue().equalsIgnoreCase("success") ||
						xBusResponse.getStatusCode().getValue().equalsIgnoreCase("WARNING"))){
					if (LOGGER.isInfoEnabled())
						LOGGER.info( "XBusDeviceServiceInvoker  ChangeDeviceResponse Status Code:"+xBusResponse.getStatusCode().getValue());
					if(xBusResponse.getStatusCode().getValue()!=null){
						response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
						response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
						response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					}
					if(xBusResponse.getOldValue()!=null){
						response.setOldSIM(xBusResponse.getOldValue());	
					}
					if(xBusResponse.getNewValue()!=null){
						response.setNewSIM(xBusResponse.getNewValue());	
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
							LOGGER.info( "XBusDeviceServiceInvoker  ChangeDeviceResponse Error Code :"+errorCode);
						if (LOGGER.isInfoEnabled())
							LOGGER.info("XBusDeviceServiceInvoker  ChangeDeviceResponse Error Msg :"+errorMessage);
			
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

	private ChangeDeviceRequest getAgentRequest(SIMSwapRequest request, CommonHeaders headers) throws MSPAPIGWExceptions{
		
		if (request != null) {
			if (request.getMsisdnNo() == null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"MSISDN Number Can't be Null");
			}	
			if (request.getAccountId()==null) {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"AccountID Can't be Null");
			}
			if (mdnVsAccIDValidate(request, headers)) {
				
				xBusRequest = new ChangeDeviceRequest();
				if (request.getMsisdnNo() != null) {
					AccountType accountType = new AccountType();
					accountType.setMsisdn(request.getMsisdnNo());
					xBusRequest.setAccount(accountType);
				} else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE, "MSISDN Number Can't be Null");
				}

				if (request.getNewSIM() != null) {
					xBusRequest.setNewValue(request.getNewSIM());
				}else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"NewSIM Can't be Null");
				}
				
				if (OldSimNo != null && OldSimNo.length()>0) {
					xBusRequest.setOldValue(OldSimNo);
				}else {
					throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"OldSimNo Can't be Found");
				}
				
				xBusRequest.setDeviceType(DeviceType.SIM);
				
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


	private boolean mdnVsAccIDValidate(SIMSwapRequest request, CommonHeaders headers) throws MSPAPIGWExceptions {
		
		if (LOGGER.isInfoEnabled())
			LOGGER.info( "ChangeDeviceImpl  mdnVsAccIDValidate  matheod called");
		
		if((request.getMsisdnNo()!=null && request.getAccountId()!=null)) {
			
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
			
			if(request.getMsisdnNo()!=null) {
				agentRequest.setMSISDN(request.getMsisdnNo());
				if (LOGGER.isInfoEnabled())
					LOGGER.info( "ChangeDeviceImpl  mdnVsAccIDValidate- Request Details: "+agentRequest.getMSISDN());
			}
			
			agentResponse=accountManagementInvoker.mdnBasedGetNwId(agentRequest, headers);
			if (agentResponse != null) {
				if (LOGGER.isInfoEnabled())
					LOGGER.info("ChangeDeviceImpl  mdnVsAccIDValidate- Response Details For : "
							+ agentResponse.getAccountId());

				if(agentResponse.getSIM()!=null) {
					OldSimNo=agentResponse.getSIM();
					LOGGER.info("ChangeDeviceImpl  mdnVsAccIDValidate- Response Old SIM is  : "+OldSimNo);
				}
				
				if (agentResponse.getAccountId() != 0L) {
					return String.valueOf(agentResponse.getAccountId()).equalsIgnoreCase(request.getAccountId());
				}
				LOGGER.info("ChangeDeviceImpl  mdnVsAccIDValidate- Response Details For : "
						+ agentResponse.getSIM());
				
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("ChangeDeviceImpl  mdnVsAccIDValidate- Response is Null");
				return false;
			}
		
		}
		return true;
	}

}		
					