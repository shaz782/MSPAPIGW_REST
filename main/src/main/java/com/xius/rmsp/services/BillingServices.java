package com.xius.rmsp.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xius.client.impl.GetAccountDetailsImpl;
import com.xius.client.impl.GetActivePackDetailsImpl;
import com.xius.client.impl.GetDetailsbyActStateSellerCodeImpl;
import com.xius.client.impl.GetLoanImpl;
import com.xius.client.impl.GetReActDeActReasonsImpl;
import com.xius.client.impl.GetRemainingUnitDetailsImpl;
import com.xius.client.impl.GetSubBillingDetailsImpl;
import com.xius.client.impl.ReActivateAccountImpl;
import com.xius.client.impl.SuspendAccountImpl;
import com.xius.client.impl.UnRecoveredLoanDetailsImpl;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.GetAccountDetailsRequest;
import com.xius.rmsp.messages.GetAccountDetailsResponse;
import com.xius.rmsp.messages.GetActivePackDetailsRequest;
import com.xius.rmsp.messages.GetActivePackDetailsResponse;
import com.xius.rmsp.messages.GetLoanRequest;
import com.xius.rmsp.messages.GetLoanResponse;
import com.xius.rmsp.messages.GetReActDeActReasonsRequest;
import com.xius.rmsp.messages.GetReActDeActReasonsResponse;
import com.xius.rmsp.messages.GetRemainingUnitDetailsRequest;
import com.xius.rmsp.messages.GetRemainingUnitDetailsResponse;
import com.xius.rmsp.messages.GetSubBillingDetailsRequest;
import com.xius.rmsp.messages.GetSubBillingDetailsResponse;
import com.xius.rmsp.messages.GetSubCoreBalanceRequest;
import com.xius.rmsp.messages.GetSubCoreBalanceResponse;
import com.xius.rmsp.messages.GetSubsDetailsbyStateRequest;
import com.xius.rmsp.messages.GetSubsDetailsbyStateResponse;
import com.xius.rmsp.messages.ReActivateAccountRequest;
import com.xius.rmsp.messages.ReActivateAccountResponse;
import com.xius.rmsp.messages.SuspendAccountRequest;
import com.xius.rmsp.messages.SuspendAccountResponse;
import com.xius.rmsp.messages.UnRecoveredLoanDetailsRequest;
import com.xius.rmsp.messages.UnRecoveredLoanDetailsResponse;

@Service
public class BillingServices {

	private static final Logger LOGGER = LogManager.getLogger(BillingServices.class);
	
	@Autowired(required=true)
	private GetAccountDetailsImpl getAccountDetailsImpl;
	
	@Autowired(required=true)
	private GetRemainingUnitDetailsImpl getRemainingUnitDetailsImpl;
	
	@Autowired(required=true)
	private GetSubBillingDetailsImpl getSubBillingDetailsImpl;
	
	@Autowired(required=true)
	private GetDetailsbyActStateSellerCodeImpl getDetailsbyActStateSellerCodeImpl;
	
	@Autowired(required=true)
	private GetActivePackDetailsImpl getActivePackDetailsImpl;
	
	@Autowired(required=true)
	private GetLoanImpl getLoanImpl;
	
	@Autowired(required=true)
	private UnRecoveredLoanDetailsImpl unRecoveredLoanDetailsImpl;
	
	@Autowired(required=true)
	private GetReActDeActReasonsImpl getReActDeActReasonsImpl;

	@Autowired(required=true)
	private SuspendAccountImpl suspendAccountImpl;
	

	@Autowired(required=true)
	private ReActivateAccountImpl reActivateAccountImpl;
	
	public GetAccountDetailsResponse getAccountDetails(GetAccountDetailsRequest getAccountDetailsRequest) throws MSPAPIGWExceptions {
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getAccountDetails called");
		
			GetAccountDetailsResponse getAccountDetailsResponse=null;
		
			getAccountDetailsResponse = getAccountDetailsImpl.getAccountDetails(getAccountDetailsRequest);
			if(getAccountDetailsResponse!=null)
				return getAccountDetailsResponse;
			else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("BillingServices- getAccountDetails of GetAccountDetailsResponse is Null");
				return getAccountDetailsResponse;
			}
	}

	public GetRemainingUnitDetailsResponse getRemainingUnitDetails(GetRemainingUnitDetailsRequest getRemainingUnitDetailsRequest) throws MSPAPIGWExceptions{
		
		GetRemainingUnitDetailsResponse getRemainingUnitDetailsResponse=null;
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getRemainingUnitDetails called");
			
			getRemainingUnitDetailsResponse = getRemainingUnitDetailsImpl.getRemainingUnitDetails(getRemainingUnitDetailsRequest);
			if(getRemainingUnitDetailsResponse!=null)
				return getRemainingUnitDetailsResponse;
			else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("BillingServices- getRemainingUnitDetailsImpl of GetRemainingUnitDetailsResponse is Null");
				return getRemainingUnitDetailsResponse;
			}
	}

	public GetSubBillingDetailsResponse getSubBillingDetails(GetSubBillingDetailsRequest getSubBillingDetailsRequest) throws MSPAPIGWExceptions{
		
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getSubBillingDetails called");
			
		GetSubBillingDetailsResponse getSubBillingDetailsResponse=null;
		
		getSubBillingDetailsResponse = getSubBillingDetailsImpl.getSubBillingDetails(getSubBillingDetailsRequest);
			if(getSubBillingDetailsResponse!=null)
				return getSubBillingDetailsResponse;
			else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("BillingServices- getSubBillingDetailsImpl of GetSubBillingDetailsResponse is Null");
				return getSubBillingDetailsResponse;
			}
	}
	
	public GetSubsDetailsbyStateResponse getSubsDetailsbyState(GetSubsDetailsbyStateRequest getSubsDetailsbyStateRequest) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getSubsDetailsbyState called");

		GetSubsDetailsbyStateResponse getSubsDetailsbyStateResponse = null;

		getSubsDetailsbyStateResponse = getDetailsbyActStateSellerCodeImpl
				.getSubsDetailsbyState(getSubsDetailsbyStateRequest);
		if (getSubsDetailsbyStateResponse != null)
			return getSubsDetailsbyStateResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- getDetailsbyActStateSellerCodeImpl of GetSubsDetailsbyStateResponse is Null");
			return getSubsDetailsbyStateResponse;
		}
	}
	
	public GetActivePackDetailsResponse getActivePacks(GetActivePackDetailsRequest getActivePackDetailsRequest) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getActivePacks called");

		GetActivePackDetailsResponse getActivePackDetailsResponse = null;

		getActivePackDetailsResponse = getActivePackDetailsImpl
				.getActivePacks(getActivePackDetailsRequest);
		if (getActivePackDetailsResponse != null)
			return getActivePackDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- getActivePackDetailsImpl of GetActivePackDetailsResponse is Null");
			return getActivePackDetailsResponse;
		}
	}
	
	public GetSubCoreBalanceResponse getSubCoreBalance(GetSubCoreBalanceRequest getSubCoreBalanceRequest) throws MSPAPIGWExceptions {
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getSubCoreBalance called");
		
		GetSubCoreBalanceResponse getSubCoreBalanceResponse=null;
		
		GetAccountDetailsResponse getAccountDetailsResponse=null;
		GetAccountDetailsRequest getAccountDetailsRequest=new GetAccountDetailsRequest();
		
			if(getSubCoreBalanceRequest.getAccountId()!=null)
				getAccountDetailsRequest.setAccountId(getSubCoreBalanceRequest.getAccountId());
			if(getSubCoreBalanceRequest.getMsisdn()!=null)
				getAccountDetailsRequest.setMsisdn(getSubCoreBalanceRequest.getMsisdn());
			if(LOGGER.isInfoEnabled())
				LOGGER.info("BillingServices-getSubCoreBalance calling getAccountDetails API");
			getAccountDetailsResponse = getAccountDetailsImpl.getAccountDetails(getAccountDetailsRequest);
			
			if(getAccountDetailsResponse!=null) {
				
				getSubCoreBalanceResponse=new GetSubCoreBalanceResponse();
				
				if(getAccountDetailsResponse.getAccountId()!=null)
					getSubCoreBalanceResponse.setAccountId(getAccountDetailsResponse.getAccountId());
				if(getAccountDetailsResponse.getAccountId()!=null)
					getSubCoreBalanceResponse.setMsisdn(getAccountDetailsResponse.getMsisdn());
				if(getAccountDetailsResponse.getAccountStatus()!=null)
					getSubCoreBalanceResponse.setAccountStatus(getAccountDetailsResponse.getAccountStatus());
				if(getAccountDetailsResponse.getAccountBalance()!=null)
					getSubCoreBalanceResponse.setAccountBalance(getAccountDetailsResponse.getAccountBalance());
				if(getAccountDetailsResponse.getAccountValidity()!=null)
					getSubCoreBalanceResponse.setAccountValidity(getAccountDetailsResponse.getAccountValidity());
				
				return getSubCoreBalanceResponse;
			}else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("BillingServices- getAccountDetails of GetAccountDetailsResponse is Null");
				return getSubCoreBalanceResponse;
			}
	}
	
	
	public GetLoanResponse getLoan(GetLoanRequest getLoanRequest) throws MSPAPIGWExceptions {
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-GetLoan called");
		GetLoanResponse getLoanResponse=null;
		getLoanResponse = getLoanImpl.getLoan(getLoanRequest);
		if (getLoanResponse != null)
			return getLoanResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- getLoanResponse of GetLoanResponse is Null");
			return getLoanResponse;
		}
	}

	public UnRecoveredLoanDetailsResponse unRecoveredLoanDetails(UnRecoveredLoanDetailsRequest unRecoveredLoanDetailsRequest) throws MSPAPIGWExceptions {
		
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-unRecoveredLoanDetails called");
		UnRecoveredLoanDetailsResponse unRecoveredLoanDetailsResponse=null;
		unRecoveredLoanDetailsResponse = unRecoveredLoanDetailsImpl.unRecoveredLoanDetails(unRecoveredLoanDetailsRequest);
		if (unRecoveredLoanDetailsResponse != null)
			return unRecoveredLoanDetailsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- UnRecoveredLoanDetailsResponse of Response is Null");
			return unRecoveredLoanDetailsResponse;
		}
	}

	public GetReActDeActReasonsResponse getReActDeActReasons(GetReActDeActReasonsRequest getReActDeActReasonsRequest) throws MSPAPIGWExceptions{
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-getReActDeActReasons called");
		GetReActDeActReasonsResponse getReActDeActReasonsResponse=null;
		getReActDeActReasonsResponse = getReActDeActReasonsImpl.getReActDeActReasons(getReActDeActReasonsRequest);
		if (getReActDeActReasonsResponse != null)
			return getReActDeActReasonsResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- GetReActDeActReasonsResponse of Response is Null");
			return getReActDeActReasonsResponse;
		
		}

	}

	public SuspendAccountResponse suspendAccount(SuspendAccountRequest suspendAccountRequest) throws MSPAPIGWExceptions {
		
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-suspendAccount called");
		SuspendAccountResponse suspendAccountResponse=null;
		suspendAccountResponse = suspendAccountImpl.suspendAccount(suspendAccountRequest);
		if (suspendAccountResponse != null)
			return suspendAccountResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- SuspendAccountResponse of Response is Null");
			return suspendAccountResponse;
		
		}
	}

	public ReActivateAccountResponse reActivateAccount(ReActivateAccountRequest reActivateAccountRequest) throws MSPAPIGWExceptions {
		
		if(LOGGER.isInfoEnabled())
			LOGGER.info("BillingServices-reActivateAccount called");
		ReActivateAccountResponse reActivateAccountResponse=null;
		reActivateAccountResponse = reActivateAccountImpl.reActivateAccount(reActivateAccountRequest);
		if (reActivateAccountResponse != null)
			return reActivateAccountResponse;
		else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingServices- ReActivateAccountResponse of Response is Null");
			return reActivateAccountResponse;
		
		}	}
}
