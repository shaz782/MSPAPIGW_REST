package com.xius.client.impl;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.XBusDebitOrCreditInvoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.DebitAccountRequest;
import com.xius.rmsp.messages.DebitAccountResponse;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;
import com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceRequest;
import com.xius.xbus.messages.billing.debitorcredit.AdjustBalanceResponse;
import com.xius.xbus.messages.billing.debitorcredit.DebitOrCreditType;
import com.xius.xbus.messages.common.AmountDetails;
import com.xius.xbus.messages.common.CurrencyKeyType;

@Component
public class AdjustBalanceImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(AdjustBalanceImpl.class);
	
	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	private XBusDebitOrCreditInvoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	DebitAccountResponse response=null;
	AdjustBalanceRequest xBusRequest=null;
	AdjustBalanceResponse xBusResponse = null;
	
	String  transId=null;
	
	public DebitAccountResponse adjustBalance(DebitAccountRequest debitAccountRequest) throws MSPAPIGWExceptions {
		
		xBusRequest = getAgentRequest(debitAccountRequest, headers);
		if (xBusRequest != null) {
			xBusResponse = invoker.adjustBalance(xBusRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("AdjustBalanceImpl-adjustBalance of xBus RechargeWithCcRequest is Null");
		}
		if (xBusResponse != null) {
			response = setAgentResponse(xBusResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("AdjustBalanceImpl-adjustBalance of xBus RechargeWithCcResponse is Null");
		}
		return response;
	}
	
	
	private DebitAccountResponse setAgentResponse(AdjustBalanceResponse xBusResponse) throws MSPAPIGWExceptions {
		
		if(xBusResponse != null){
			response = new DebitAccountResponse();
			
				if(xBusResponse.getStatusCode()!=null &&( xBusResponse.getStatusCode().getValue().equalsIgnoreCase("success") ||
						xBusResponse.getStatusCode().getValue().equalsIgnoreCase("WARNING"))){
					if (LOGGER.isInfoEnabled())
						LOGGER.info( "xBusDebitOrCreditInvoker  AdjustBalanceResponse Status Code:"+xBusResponse.getStatusCode().getValue());
					if(xBusResponse.getStatusCode().getValue()!=null){
						response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
						response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
						response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					}
					if(transId!=null){
						response.setTransRefNo(transId);	
						
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
							LOGGER.info( "xBusDebitOrCreditInvoker  AdjustBalanceResponse Error Code :"+errorCode);
						if (LOGGER.isInfoEnabled())
							LOGGER.info("xBusDebitOrCreditInvoker  AdjustBalanceResponse Error Msg :"+errorMessage);
			
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

	private AdjustBalanceRequest getAgentRequest(DebitAccountRequest debitAccountRequest, CommonHeaders headers) throws MSPAPIGWExceptions{
		
		if (debitAccountRequest != null) {
			xBusRequest = new AdjustBalanceRequest();
			
			if (debitAccountRequest.getMsisdn() != null) {
				xBusRequest.setMsisdn(debitAccountRequest.getMsisdn());
			}else {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"MSISDN Number Can't be Null");
			}
			if (debitAccountRequest.getAmount() != null && (new Double(debitAccountRequest.getAmount()).floatValue()>0f)) {
				AmountDetails amountDetails=new AmountDetails();
				amountDetails.setAmount(new BigDecimal(debitAccountRequest.getAmount()));
				amountDetails.setCurrencyTypeKey(CurrencyKeyType.INR);
				xBusRequest.setAmount(amountDetails);
			}else {
				throw new MSPAPIGWExceptions(MSPAPIGWConstants.OTHER_EXCEPTION_CODE,"Amount con't be zero/negative");
			}
			
			xBusRequest.setAdjustmentType(DebitOrCreditType.DEBIT);
			
			if (debitAccountRequest.getReason() != null) 
				xBusRequest.setReason(debitAccountRequest.getReason() );
			
			if (debitAccountRequest.getTransRefNo() != null) {
				xBusRequest.setTransactionId(debitAccountRequest.getTransRefNo());
				transId=debitAccountRequest.getTransRefNo();
			}
			if (debitAccountRequest.getCarrierID() != null) {
				headers.setCarrierID(debitAccountRequest.getCarrierID());
			}
			if (debitAccountRequest.getUserName() != null) {
				headers.setUserName(debitAccountRequest.getUserName());
				xBusRequest.setOperator(debitAccountRequest.getUserName());
			}
			if (debitAccountRequest.getUserPassword() != null) {
				headers.setUserPassword(debitAccountRequest.getUserPassword());
			}
		}

		return xBusRequest;
	}

}		
					