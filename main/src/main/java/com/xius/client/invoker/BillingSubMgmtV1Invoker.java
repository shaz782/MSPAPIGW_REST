package com.xius.client.invoker;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.msp.billing.client.SubscriberManagementV1.SubscriberManagementBindingV1Stub;
import com.xius.msp.billing.client.SubscriberManagementV1.SubscriberServiceV1Locator;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetAcctDetailsResponse;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetActivePacksResponse;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetDetailsbyActStateSellerCodeResponse;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetLoanDetailsByDateResponse;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetRemainingUnitDetailResponse;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsRequest;
import com.xius.msp.billing.messages.SubscriberManagementV1.GetSubBillingDetailsResponse;
import com.xius.msp.billing.messages.common.ErrorDetailsType;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 7th Aug,2019 Description : From Here we will invoke the InfinetBilling
 *        Services.
 */
@Component
public class BillingSubMgmtV1Invoker {
	
	private static final Logger LOGGER = LogManager.getLogger(BillingSubMgmtV1Invoker.class);

	@Autowired(required = true)
	public Utility utility;

	public GetAcctDetailsResponse getAccountDetails(GetAcctDetailsRequest agentRequest, CommonHeaders headers)
			throws MSPAPIGWExceptions  {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BillingSubMgmtV1Invoker - getAccountDetails called");
		}
		GetAcctDetailsResponse agentResponse = null;
		SubscriberManagementBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberServiceV1Locator());
			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getAccountDetails(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getAccountDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getAccountDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public GetRemainingUnitDetailResponse getRemainingUnitDetails(GetRemainingUnitDetailRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BillingSubMgmtV1Invoker - getRemainingUnitDetails called");
		}

		GetRemainingUnitDetailResponse agentResponse = null;
		SubscriberManagementBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberServiceV1Locator());

			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getRemainingUnitDetail(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getRemainingUnitDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getRemainingUnitDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public GetSubBillingDetailsResponse getSubBillingDetails(GetSubBillingDetailsRequest agentRequest,
			CommonHeaders headers) throws MSPAPIGWExceptions {

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("BillingSubMgmtV1Invoker - getSubBillingDetails called");
		}

		GetSubBillingDetailsResponse agentResponse = null;
		SubscriberManagementBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberServiceV1Locator());

			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getSubBillingDetails(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getSubBillingDetails-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} 
		catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getSubBillingDetails-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	public GetDetailsbyActStateSellerCodeResponse getDetailsbyActStateSellerCode(
			GetDetailsbyActStateSellerCodeRequest agentRequest, CommonHeaders headers) throws MSPAPIGWExceptions {

		GetDetailsbyActStateSellerCodeResponse agentResponse = null;
		SubscriberManagementBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberServiceV1Locator());

			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getDetailsbyActStateSellerCode(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getDetailsbyActStateSellerCode-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		} catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getDetailsbyActStateSellerCode-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	public GetActivePacksResponse getActivePacks(
			GetActivePacksRequest agentRequest, CommonHeaders headers) throws MSPAPIGWExceptions {

		GetActivePacksResponse agentResponse = null;
		SubscriberManagementBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberServiceV1Locator());

			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getActivePacks(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getActivePacks-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		}  catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getActivePacks-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}
	
	public GetLoanDetailsByDateResponse getLoanDetailsByDate(
			GetLoanDetailsByDateRequest agentRequest, CommonHeaders headers) throws MSPAPIGWExceptions {

		GetLoanDetailsByDateResponse agentResponse = null;
		SubscriberManagementBindingV1Stub bindingStub = null;

		try {
			bindingStub = new SubscriberManagementBindingV1Stub(new URL(getSubMgmtV1URL()),
					new SubscriberServiceV1Locator());

			bindingStub.setHeader(utility.getIBAHeader(headers));
			bindingStub.setTimeout(Integer.parseInt(utility.getIBATimeOut()));
			agentResponse = bindingStub.getLoanDetailsByDate(agentRequest);

		}catch (ErrorDetailsType e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getLoanDetailsByDate-ErrorDetailsType" + e);
			throw new MSPAPIGWExceptions(e.getErrorCode(),
					e.getErrorMessage());
		}  catch (Exception e) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-getLoanDetailsByDate-Exception" + e);
			throw new MSPAPIGWExceptions(MSPAPIGWConstants.INTERNAL_SERVER_ERROR,
					MSPAPIGWConstants.CONNECTION_TIME_OUT_MSG);
		}

		return agentResponse;
	}

	private String getSubMgmtV1URL() {

		String url = utility.getProperty("iba.subscriberManagementV1");
		if (url == null || url.equals("")) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("BillingSubMgmtV1Invoker-iba.subscriberManagementV1-URL is Null");
		} else {
			if (LOGGER.isDebugEnabled())
				LOGGER.info("iba.subscriberManagementV1-URL ::" + url);
		}
		return url;
	}

}
