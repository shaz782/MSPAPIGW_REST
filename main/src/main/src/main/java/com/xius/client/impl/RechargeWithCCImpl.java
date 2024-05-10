package com.xius.client.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.invoker.XBusDebitOrCreditInvoker;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdRequest;
import com.xius.msp.billing.messages.accountManagement.MDNBasedGetNwIdResponse;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.RechargeWithCCRequest;
import com.xius.rmsp.messages.RechargeWithCCResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;
import com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcRequest;
import com.xius.xbus.messages.billing.debitorcredit.RechargeWithCcResponse;

@Component
public class RechargeWithCCImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(RechargeWithCCImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private XBusDebitOrCreditInvoker invoker;
	
	@Autowired(required = true)
	private AccountManagementInvoker accountManagementInvoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	RechargeWithCCResponse response=null;
	RechargeWithCcRequest xBusRequest=null;
	RechargeWithCcResponse xBusResponse = null;
	
	String  transId=null;
	
	public RechargeWithCCResponse rechargeWithCC(RechargeWithCCRequest rechargeWithCCRequest) throws MSPAPIGWExceptions {
		
		xBusRequest = getAgentRequest(rechargeWithCCRequest, headers);
		if (xBusRequest != null) {
			xBusResponse = invoker.rechargeWithCC(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("RechargeWithCCImpl-rechargeWithCC of xBus RechargeWithCcRequest is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("RechargeWithCCImpl-rechargeWithCC of xBus RechargeWithCcResponse is Null");
		}
		return response;
	}
	
	
	private RechargeWithCCResponse setAgentResponse(RechargeWithCcResponse xBusResponse) throws MSPAPIGWExceptions {
		
		if(xBusResponse != null){
			response = new RechargeWithCCResponse();
			
				if(xBusResponse.getStatusCode()!=null &&( xBusResponse.getStatusCode().getValue().equalsIgnoreCase("success") ||
						xBusResponse.getStatusCode().getValue().equalsIgnoreCase("WARNING"))){
					if (LOGGER.isInfoEnabled())
						LOGGER.info( "xBusDebitOrCreditInvoker  RechargeWithCCResponse Status Code:"+xBusResponse.getStatusCode().getValue());
					if(xBusResponse.getStatusCode().getValue()!=null){
						response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
						response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
						response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					}
					if(xBusResponse.getTransId()!=null){
						response.setTransId(xBusResponse.getTransId());
					}else if(transId!=null){
						response.setTransId(transId);
					}
					if(xBusResponse.getTransRefNum()!=null){
						response.setTransRefNum(xBusResponse.getTransRefNum());	
						
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
							LOGGER.info( "xBusDebitOrCreditInvoker  RechargeWithCCResponse Error Code :"+errorCode);
						if (LOGGER.isInfoEnabled())
							LOGGER.info("xBusDebitOrCreditInvoker  RechargeWithCCResponse Error Msg :"+errorMessage);
			
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

	private RechargeWithCcRequest getAgentRequest(RechargeWithCCRequest request, CommonHeaders headers) throws MSPAPIGWExceptions{
		
		com.xius.xbus.messages.common.AccountType  accountType=null;
		
	if (request != null) {
		
		if (request.getMsisdn() == null) {
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"MSISDN Number Can't be Null");
		}	
		if (request.getAccountId()==null) {
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"AccountID Can't be Null");
		}
		if (mdnVsAccIDValidate(request, headers)) {
			xBusRequest = new RechargeWithCcRequest();
			
				accountType=new com.xius.xbus.messages.common.AccountType();
				accountType.setMsisdn(request.getMsisdn());
				xBusRequest.setAccountType(accountType);
			
			if(request.getRechargeAmount()!=null) {
				xBusRequest.setRcCode(utility.getProperty("rcString")+request.getRechargeAmount());
			}
			if (request.getTransId() != null) {
				xBusRequest.setTransId(request.getTransId());
				transId=request.getTransId();
			}
			if (request.getReason() != null) {
				xBusRequest.setReason(request.getReason());
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
		}else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MDN Vs Account Validation Fail" );
			throw new MSPAPIGWExceptions("00001","Validation Fail");
		}
	}

		return xBusRequest;
	}
	
	private boolean mdnVsAccIDValidate(RechargeWithCCRequest request, CommonHeaders headers) throws MSPAPIGWExceptions {
		
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
					LOGGER.info( "RechargeWithCCImpl  mdnVsAccIDValidate- Request Details: "+agentRequest.getMSISDN());
			}
			
			agentResponse=accountManagementInvoker.mdnBasedGetNwId(agentRequest, headers);
			if (agentResponse != null) {
				if (LOGGER.isInfoEnabled())
					LOGGER.info("RechargeWithCCImpl  mdnVsAccIDValidate- Response Details For : "
							+ agentResponse.getAccountId());
				if (agentResponse.getAccountId() != 0L) {
					return String.valueOf(agentResponse.getAccountId()).equalsIgnoreCase(request.getAccountId());
				}
			} else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("RechargeWithCCImpl  mdnVsAccIDValidate- Response is Null");
				return false;
			}
		
		}
		return true;
	}

}		
					