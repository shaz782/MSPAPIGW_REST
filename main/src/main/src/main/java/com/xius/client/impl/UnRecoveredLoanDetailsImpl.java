package com.xius.client.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.BillingSubMgmtV1Invoker;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse;
import com.xius.msp.billing.messages.SubscriberManagementV1.LoanAcctDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.messages.LoanDetails;
import com.xius.rmsp.messages.UnRecoveredLoanDetailsRequest;
import com.xius.rmsp.messages.UnRecoveredLoanDetailsResponse;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 3rd FEB,2020 Description : From Here we will invoke the InfinetBilling APIs
 *        Services.
 */
@Component
public class UnRecoveredLoanDetailsImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(UnRecoveredLoanDetailsImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;

	@Autowired(required = true)
	private BillingSubMgmtV1Invoker invoker;
	
	@Autowired(required = true)
	public Utility utility;
	
	String formate="yyyy-MM-dd";
	String res_formate="yyyy-mm-dd";
	String destFormate="MM/dd/yyyy";

	UnRecoveredLoanDetailsResponse response = null;
	GetLoanDetailsByDateRequest agentRequest = null;
	GetLoanDetailsByDateResponse agentResponse = null;

	public UnRecoveredLoanDetailsResponse unRecoveredLoanDetails(UnRecoveredLoanDetailsRequest request) throws MSPAPIGWExceptions  {

		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.getLoanDetailsByDate(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("UnRecoveredLoanDetailsImpl-unRecoveredLoanDetails of GetLoanDetailsByDateRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("UnRecoveredLoanDetailsImpl-unRecoveredLoanDetails of GetLoanDetailsByDateResponse is Null");
		}
		return response;
	}

	private UnRecoveredLoanDetailsResponse setAgentResponse(GetLoanDetailsByDateResponse agentResponse) {
		
		response = new UnRecoveredLoanDetailsResponse();
		
		if (agentResponse.getLoanAcctDetails() != null && agentResponse.getLoanAcctDetails().length>0) {
			LoanAcctDetailsType[] loanActDtTypeArry=agentResponse.getLoanAcctDetails();
			List<LoanDetails> loanDetailsList=new ArrayList<LoanDetails>(loanActDtTypeArry.length); 
			LoanDetails loanDetails=null;
			for (int i = 0; i < loanActDtTypeArry.length; i++) {
				loanDetails=new LoanDetails();
				loanDetails.setMsisdn(loanActDtTypeArry[i].getMSISDN());
				loanDetails.setLoanAmount(loanActDtTypeArry[i].getLoanAmount());
				loanDetails.setIssueDate(utility.DateToString(utility.stringToDate(loanActDtTypeArry[i].getTransactionDate(),res_formate), res_formate));
				loanDetails.setAccountID(String.valueOf(loanActDtTypeArry[i].getAcctID()));
				loanDetailsList.add(loanDetails);
			}
			response.setLoanDetails(loanDetailsList);
		}
		return response;
	}

	private GetLoanDetailsByDateRequest getAgentRequest(UnRecoveredLoanDetailsRequest request, CommonHeaders headers) throws  MSPAPIGWExceptions {
		
		if (request != null) {
			agentRequest = new GetLoanDetailsByDateRequest();
			
			String betweenDays=utility.getProperty("Display_Days");
			
			Date fromDate=utility.stringToDate(request.getFromDate(),formate);
			Date toDate=utility.stringToDate(request.getToDate(),formate);
			
			if(request.getFromDate() != null && request.getToDate()!=null ) {
				utility.dateComparision(request.getFromDate(), request.getToDate(),formate);
			}
			
			String days=String.valueOf(utility.getDifferenceDays(fromDate, toDate));
			
			if(betweenDays !=null && Integer.parseInt(betweenDays)>0 && days !=null && Integer.parseInt(betweenDays) <= Integer.parseInt(days)) {
				throw new MSPAPIGWExceptions("96411", "please provide duration as LessThen or Equal of "+betweenDays+" days");
			}
			
			agentRequest.setStartDate(utility.stringFromateChng(request.getFromDate(),formate,destFormate));
			agentRequest.setEndDate(utility.stringFromateChng(request.getToDate(),formate,destFormate));
			
			if (request.getCarrierID() != null) 
				headers.setCarrierID(request.getCarrierID());
			
			if (request.getUserName() != null) 
				headers.setUserName(request.getUserName());
			
			if (request.getUserPassword() != null) 
				headers.setUserPassword(request.getUserPassword());
			
		}

		return agentRequest;
	}

}
