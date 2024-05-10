package com.xius.rmsp.controler;
/**
 * @author shashidhar.p
 * @Date : 13July,2019
 * @description From here we will expose/consume the services.
 */
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.DeactivatePackRequest;
import com.xius.rmsp.messages.DeactivatePackResponse;
import com.xius.rmsp.messages.DebitAccountRequest;
import com.xius.rmsp.messages.DebitAccountResponse;
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
import com.xius.rmsp.messages.GetSubDemographicDetailsRequest;
import com.xius.rmsp.messages.GetSubDemographicDetailsResponse;
import com.xius.rmsp.messages.GetSubsDetailsbyStateRequest;
import com.xius.rmsp.messages.GetSubsDetailsbyStateResponse;
import com.xius.rmsp.messages.GiftPackRequest;
import com.xius.rmsp.messages.GiftPackResponse;
import com.xius.rmsp.messages.NotificationRequest;
import com.xius.rmsp.messages.NotificationResponse;
import com.xius.rmsp.messages.PurchaseATPCCRequest;
import com.xius.rmsp.messages.PurchaseATPCCResponse;
import com.xius.rmsp.messages.PurchaseATPRequest;
import com.xius.rmsp.messages.PurchaseATPResponse;
import com.xius.rmsp.messages.ReActivateAccountRequest;
import com.xius.rmsp.messages.ReActivateAccountResponse;
import com.xius.rmsp.messages.RechargeWithCCRequest;
import com.xius.rmsp.messages.RechargeWithCCResponse;
import com.xius.rmsp.messages.SIMSwapRequest;
import com.xius.rmsp.messages.SIMSwapResponse;
import com.xius.rmsp.messages.SuspendAccountRequest;
import com.xius.rmsp.messages.SuspendAccountResponse;
import com.xius.rmsp.messages.UnRecoveredLoanDetailsRequest;
import com.xius.rmsp.messages.UnRecoveredLoanDetailsResponse;
import com.xius.rmsp.messages.UpdateDemographicDetailsRequest;
import com.xius.rmsp.messages.UpdateDemographicDetailsResponse;
import com.xius.rmsp.services.BillingServices;
import com.xius.rmsp.services.SelfcareServices;
import com.xius.rmsp.services.XBusBundleServices;
import com.xius.rmsp.services.XBusDebitOrCreditServices;
import com.xius.rmsp.services.XBusDeviceServices;
import com.xius.rmsp.services.XBusTariffServices;
import com.xius.rmsp.utilities.MSPAPIGWConstants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@ApiIgnore
@RequestMapping("/API")
@EnableSwagger2
@Api(value="/API",description="XIUS Provided APIs",produces ="application/json")
public class APIController {
	private static final Logger LOGGER = LogManager.getLogger(APIController.class);
	
	@Autowired(required=true)
	public BillingServices billingServices;
	
	@Autowired(required=true)
	public SelfcareServices selfcareServices;
	
	@Autowired(required=true)
	public XBusTariffServices xBusTariffServices;
	
	@Autowired(required=true)
	public XBusDebitOrCreditServices xBusDebitOrCreditServices;
	
	@Autowired(required=true)
	public XBusBundleServices xBusBundleServices;
	
	@Autowired(required=true)
	public XBusDeviceServices xBusDeviceServices;
	
	
	@ApiOperation(value="getAccountDetails",response=GetAccountDetailsResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=GetAccountDetailsResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/getAccountDetails",produces = "application/json", consumes = "application/json")
	public GetAccountDetailsResponse getAccountDetails(@Valid @RequestBody GetAccountDetailsRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-getAccountDetails called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetAccountDetailsResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - GetAccountDetailsRequest is Null");
			response=new GetAccountDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.getAccountDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getAccountDetails Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getAccountDetails() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getAccountDetails MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetAccountDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getAccountDetails() - Exception is " + e);
				
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getAccountDetails Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetAccountDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
		
	}
	
	@ApiOperation(value="getRemainingUnitDetails",response=GetRemainingUnitDetailsResponse.class )
	@PostMapping(path="/getRemainingUnitDetails",produces = "application/json", consumes = "application/json")
	public GetRemainingUnitDetailsResponse getRemainingUnitDetails(@Valid @RequestBody GetRemainingUnitDetailsRequest request) {
		LOGGER.info("API-getRemainingUnitDetails called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetRemainingUnitDetailsResponse response=null;
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - GetRemainingUnitDetailsRequest is Null");
			response=new GetRemainingUnitDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.getRemainingUnitDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getRemainingUnitDetails Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getRemainingUnitDetails() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getRemainingUnitDetails MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetRemainingUnitDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getRemainingUnitDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getRemainingUnitDetails Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetRemainingUnitDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="getSubBillingDetails",response=GetSubBillingDetailsResponse.class )
	@PostMapping(path="/getSubBillingDetails",  produces = "application/json", consumes = "application/json")
	public GetSubBillingDetailsResponse getSubBillingDetails(@Valid @RequestBody GetSubBillingDetailsRequest request) {
		LOGGER.info("API-getSubBillingDetails called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetSubBillingDetailsResponse response=null;
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - GetSubBillingDetailsRequest is Null");
			response=new GetSubBillingDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.getSubBillingDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubBillingDetails Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubBillingDetails() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isErrorEnabled())
					LOGGER.error("getSubBillingDetails MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubBillingDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubBillingDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubBillingDetails Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubBillingDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	
	@ApiOperation(value="getSubDetailsbyActStatus",response=GetSubsDetailsbyStateResponse.class )
	@PostMapping(path="/getSubDetailsbyActStatus", produces = "application/json", consumes = "application/json")
	public GetSubsDetailsbyStateResponse getSubDetailsbyActStatus(@Valid @RequestBody GetSubsDetailsbyStateRequest request) {
		LOGGER.info("API-getSubDetailsbyActStatus called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetSubsDetailsbyStateResponse response=null;
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - GetSubsDetailsbyStateRequest is Null");
			response=new GetSubsDetailsbyStateResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.getSubsDetailsbyState(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDetailsbyActStatus Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubDetailsbyActStatus() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDetailsbyActStatus MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubsDetailsbyStateResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubDetailsbyActStatus() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDetailsbyActStatus Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubsDetailsbyStateResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		
		return response;
	}
	
	@ApiOperation(value="getSubDemographicDetails",response=GetSubDemographicDetailsResponse.class )
	@PostMapping(path="/getSubDemographicDetails",produces = "application/json", consumes = "application/json")
	public GetSubDemographicDetailsResponse getSubDemographicDetails(@Valid @RequestBody GetSubDemographicDetailsRequest request) {
		LOGGER.info("API-getSubDemographicDetails called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		GetSubDemographicDetailsResponse response=null;
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - GetSubCoreBalanceRequest is Null");
			response=new GetSubDemographicDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = selfcareServices.getSubDemographicDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDemographicDetails Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubDemographicDetails() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDemographicDetails MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubDemographicDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDemographicDetails Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	
	@ApiOperation(value="getSubCoreBalance",response=GetSubCoreBalanceResponse.class ,hidden=true)
	@PostMapping(path="/getSubCoreBalance",produces = "application/json", consumes = "application/json")
	public GetSubCoreBalanceResponse getSubCoreBalance(@Valid @RequestBody GetSubCoreBalanceRequest request) {
		LOGGER.info("API-getSubCoreBalance called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetSubCoreBalanceResponse response=null;
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - GetSubCoreBalanceRequest is Null");
			response=new GetSubCoreBalanceResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				response = billingServices.getSubCoreBalance(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubCoreBalance Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubCoreBalance() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubCoreBalance MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubCoreBalanceResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getSubCoreBalance() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubCoreBalance Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubCoreBalanceResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="purchasePack",response=PurchaseATPResponse.class )
	@PostMapping(path="/purchasePack",produces = "application/json", consumes = "application/json")
	public PurchaseATPResponse purchasePack(@Valid @RequestBody PurchaseATPRequest request) {
		LOGGER.info("API-purchasePack called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		PurchaseATPResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - PurchaseATPRequest is Null");
			response=new PurchaseATPResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = xBusTariffServices.purchasePack(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - purchasePack() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new PurchaseATPResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - purchasePack() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new PurchaseATPResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="updateDemographicDetails",response=UpdateDemographicDetailsResponse.class )
	@PostMapping(path="/updateDemographicDetails", produces = "application/json", consumes = "application/json")
	public UpdateDemographicDetailsResponse updateDemographicDetails(@Valid @RequestBody UpdateDemographicDetailsRequest request) {
		LOGGER.info("API-updateDemographicDetails called");
		
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		UpdateDemographicDetailsResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - UpdateDemographicDetailsRequest is Null");
			response=new UpdateDemographicDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = selfcareServices.updateDemographicDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("updateDemographicDetails Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - updateDemographicDetails() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("updateDemographicDetails MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new UpdateDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - updateDemographicDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("updateDemographicDetails Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new UpdateDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	
	@ApiOperation(value="getActivePacks",response=GetActivePackDetailsResponse.class )
	@PostMapping(path="/getActivePacks", produces = "application/json", consumes = "application/json")
	public GetActivePackDetailsResponse getActivePacks(@Valid @RequestBody GetActivePackDetailsRequest request) {
		LOGGER.info("API-getActivePacks called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetActivePackDetailsResponse response=null;
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - GetActivePackDetailsRequest is Null");
			response=new GetActivePackDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			
		} else {
			try {
				response = billingServices.getActivePacks(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getActivePacks Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getActivePacks() - (MSPAPIGWExceptions is " + e.getErrorCode() + "#"
							+ e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getActivePacks MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetActivePackDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getActivePacks() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getActivePacks Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetActivePackDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
		
	}
	
	@ApiOperation(value="rechargeWithCC",response=RechargeWithCCResponse.class )
	@PostMapping(path="/rechargeWithCC", produces = "application/json", consumes = "application/json")
	public RechargeWithCCResponse rechargeWithCC(@Valid @RequestBody RechargeWithCCRequest request) {
		LOGGER.info("API-rechargeWithCC called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		RechargeWithCCResponse response=null;
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - RechargeWithCCRequest is Null");
			response=new RechargeWithCCResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			
		} else {
			try {
				response = xBusDebitOrCreditServices.activateRcProduct(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("RechargeWithCC Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - rechargeWithCC() - (MSPAPIGWExceptions is " + e.getErrorCode() + "#"
							+ e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("RechargeWithCC MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new RechargeWithCCResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - rechargeWithCC() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("RechargeWithCC Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new RechargeWithCCResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
		
	}
	
	@ApiOperation(value="purchasePackWithCC",response=PurchaseATPCCResponse.class )
	@PostMapping(path="/purchasePackWithCC",produces = "application/json", consumes = "application/json")
	public PurchaseATPCCResponse purchasePackWithCC(@Valid @RequestBody PurchaseATPCCRequest request) {
		LOGGER.info("API-purchasePackWithCC called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		PurchaseATPCCResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - PurchaseATPCCRequest is Null");
			response=new PurchaseATPCCResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = xBusTariffServices.purchasePackWithCc(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - purchasePackWithCC() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new PurchaseATPCCResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - purchasePackWithCC() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePackWithCC Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new PurchaseATPCCResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	
	@ApiOperation(value="debitAccount",response=DebitAccountResponse.class )
	@PostMapping(path="/debitAccount",produces = "application/json", consumes = "application/json")
	public DebitAccountResponse debitAccount(@Valid @RequestBody DebitAccountRequest request) {
		LOGGER.info("API-debitAccount called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		DebitAccountResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - debitAccount is Null");
			response=new DebitAccountResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = xBusDebitOrCreditServices.adjustBalance(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - debitAccount() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("debitAccount MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new DebitAccountResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - debitAccount() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("debitAccount Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new DebitAccountResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="deactivatePack",response=DeactivatePackResponse.class )
	@PostMapping(path="/deactivatePack",produces = "application/json", consumes = "application/json")
	public DeactivatePackResponse deactivatePack(@Valid @RequestBody DeactivatePackRequest request) {
		LOGGER.info("API-deactivatePack called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		
		DeactivatePackResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - DeactivatePackRequest is Null");
			response=new DeactivatePackResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = xBusTariffServices.deactivatePack(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - deactivatePack() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new DeactivatePackResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - deactivatePack() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("deactivatePack Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new DeactivatePackResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="getLoan",response=GetLoanResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=GetLoanResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/getLoan",produces = "application/json", consumes = "application/json")
	public GetLoanResponse getLoan(@Valid @RequestBody GetLoanRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-getLoan called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetLoanResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - getLoan is Null");
			response=new GetLoanResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.getLoan(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getLoan Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getLoan() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getLoan MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetLoanResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getLoan() - Exception is " + e);
				
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getLoan Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetLoanResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
		
	}
	
	
	@ApiOperation(value="giftPack",response=GiftPackResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=GiftPackResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/giftPack",produces = "application/json", consumes = "application/json")
	public GiftPackResponse giftPack(@Valid @RequestBody GiftPackRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-giftPack called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GiftPackResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - giftPack is Null");
			response=new GiftPackResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = xBusBundleServices.giftPack(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("giftPack Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - giftPack() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("giftPack MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GiftPackResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - giftPack() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("giftPack Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GiftPackResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
		
	}
	
	@ApiOperation(value="unRecoveredLoanDetails",response=UnRecoveredLoanDetailsResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=UnRecoveredLoanDetailsResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/unRecoveredLoanDetails",produces = "application/json", consumes = "application/json")
	public UnRecoveredLoanDetailsResponse unRecoveredLoanDetails(@Valid @RequestBody UnRecoveredLoanDetailsRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-unRecoveredLoanDetails called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		UnRecoveredLoanDetailsResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - unRecoveredLoanDetails is Null");
			response=new UnRecoveredLoanDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.unRecoveredLoanDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("unRecoveredLoanDetails Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - unRecoveredLoanDetails() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("unRecoveredLoanDetails MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new UnRecoveredLoanDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - unRecoveredLoanDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("unRecoveredLoanDetails Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new UnRecoveredLoanDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
		
	}

		
	@ApiOperation(value="simSwap",response=SIMSwapResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=SIMSwapResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/simSwap",produces = "application/json", consumes = "application/json")
	public SIMSwapResponse simSwap(@Valid @RequestBody SIMSwapRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-simSwap called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		SIMSwapResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - simSwap is Null");
			response=new SIMSwapResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = xBusDeviceServices.simSwap(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("simSwap Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - simSwap() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("simSwap MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new SIMSwapResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - simSwap() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("simSwap Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new SIMSwapResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
		
	}
	

	@ApiOperation(value="getReActDeActReasons",response=GetReActDeActReasonsResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=GetReActDeActReasonsResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/getReActDeActReasons",produces = "application/json", consumes = "application/json")
	public GetReActDeActReasonsResponse getReActDeActReasons(@Valid @RequestBody GetReActDeActReasonsRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-getReActDeActReasons called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		GetReActDeActReasonsResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - getReActDeActReasons is Null");
			response=new GetReActDeActReasonsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.getReActDeActReasons(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getReActDeActReasons Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getReActDeActReasons() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getReActDeActReasons MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetReActDeActReasonsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - getReActDeActReasons() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("reActivateAccount Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetReActDeActReasonsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="suspendAccount",response=SuspendAccountResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=SuspendAccountResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/suspendAccount",produces = "application/json", consumes = "application/json")
	public SuspendAccountResponse suspendAccount(@Valid @RequestBody SuspendAccountRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-suspendAccount called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		SuspendAccountResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - suspendAccount is Null");
			response=new SuspendAccountResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.suspendAccount(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("suspendAccount Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - suspendAccount() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("suspendAccount MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new SuspendAccountResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - suspendAccount() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("suspendAccount Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new SuspendAccountResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="reActivateAccount",response=ReActivateAccountResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=ReActivateAccountResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/reActivateAccount",produces = "application/json", consumes = "application/json")
	public ReActivateAccountResponse reActivateAccount(@Valid @RequestBody ReActivateAccountRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-reActivateAccount called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		ReActivateAccountResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - reActivateAccount is Null");
			response=new ReActivateAccountResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = billingServices.reActivateAccount(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("reActivateAccount Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - reActivateAccount() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("reActivateAccount MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new ReActivateAccountResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - reActivateAccount() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("reActivateAccount Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new ReActivateAccountResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
	}
	
	@ApiOperation(value="notification",response=ReActivateAccountResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=ReActivateAccountResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/notification",produces = "application/json", consumes = "application/json")
	public NotificationResponse notification(@Valid @RequestBody NotificationRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-Notification called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		NotificationResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("APIController - reActivateAccount is Null");
			response=new NotificationResponse();
			response.setStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			response.setReason(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				System.out.println("Thhe Request Recieved params are"+request.getMessage());
				System.out.println("The Request Recieved params are"+request.getMSISDN());
				System.out.println("The Request Recieved params are"+request.getApikey());
				
				response=new NotificationResponse();
				response.setStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setMessage(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setReason(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("reActivateAccount Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - reActivateAccount() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("reActivateAccount Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response=new NotificationResponse();
				response.setStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
				response.setReason(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			}
		}
		return response; 
	}
	
	
	
	
	
	
	
	
	
	
}
