package com.xius.rmsp.controler;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xius.client.msp.api.impl.StripeImpl;
import com.xius.msp.api.messages.ActivateTPRequest;
import com.xius.msp.api.messages.ActivateTPResponse;
import com.xius.msp.api.messages.ChangePasswordRequest;
import com.xius.msp.api.messages.ChangePasswordResponse;
import com.xius.msp.api.messages.DoRechargeRequest;
import com.xius.msp.api.messages.DoRechargeResponse;
import com.xius.msp.api.messages.ForgotPasswordRequest;
import com.xius.msp.api.messages.ForgotPasswordResponse;
import com.xius.msp.api.messages.GetAccountDetailsRequest;
import com.xius.msp.api.messages.GetAccountDetailsResponse;
import com.xius.msp.api.messages.GetAvailableServiceDetailsRequest;
import com.xius.msp.api.messages.GetAvailableServiceDetailsResponse;
import com.xius.msp.api.messages.GetDenominationDetailsRequest;
import com.xius.msp.api.messages.GetDenominationDetailsResponse;
import com.xius.msp.api.messages.GetIDTypesRequest;
import com.xius.msp.api.messages.GetIDTypesResponse;
import com.xius.msp.api.messages.GetMsisdnDetailsRequest;
import com.xius.msp.api.messages.GetMsisdnDetailsResponse;
import com.xius.msp.api.messages.GetServiceDetailsRequest;
import com.xius.msp.api.messages.GetServiceDetailsResponse;
import com.xius.msp.api.messages.GetSubDemographicDetailsRequest;
import com.xius.msp.api.messages.GetSubDemographicDetailsResponse;
import com.xius.msp.api.messages.GetSubsDetailsRequest;
import com.xius.msp.api.messages.GetSubsDetailsResponse;
import com.xius.msp.api.messages.InitiatePaymentRequest;
import com.xius.msp.api.messages.InitiatePaymentResponse;
import com.xius.msp.api.messages.LoginRequest;
import com.xius.msp.api.messages.LoginResponse;
import com.xius.msp.api.messages.Loginv1Request;
import com.xius.msp.api.messages.Loginv1Response;
import com.xius.msp.api.messages.PackPurchaseRequest;
import com.xius.msp.api.messages.PackPurchaseResponse;
import com.xius.msp.api.messages.PaymentConfirmationRequest;
import com.xius.msp.api.messages.PaymentConfirmationResponse;
import com.xius.msp.api.messages.PaymentPublishableKeyRequest;
import com.xius.msp.api.messages.PaymentPublishableKeyResponse;
import com.xius.msp.api.messages.RechargeHistoryRequest;
import com.xius.msp.api.messages.RechargeHistoryResponse;
import com.xius.msp.api.messages.UpdateDemographicDetailsRequest;
import com.xius.msp.api.messages.UpdateDemographicDetailsResponse;
import com.xius.msp.api.messages.ValidateTPRequest;
import com.xius.msp.api.messages.ValidateTPResponse;
import com.xius.msp.api.services.BillingAgentServices;
import com.xius.msp.api.services.SelfcareAgentServices;
import com.xius.msp.api.services.SmfAgentServices;
import com.xius.msp.api.services.XBusServices;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.services.LoginServices;
import com.xius.rmsp.utilities.MSPAPIGWConstants;
import com.xius.rmsp.utilities.Utility;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/MSP/API")
@EnableSwagger2
@Api(value = "/MSP/API", description = "XIUS Provided MSP APIs", produces = "application/json")
public class MSPAPIController {
	private static final Logger LOGGER = LogManager.getLogger(MSPAPIController.class);

	@Autowired(required = true)
	public Utility utility;

	@Autowired(required = true)
	public SelfcareAgentServices selfcareAgentServices;

	@Autowired(required = true)
	public BillingAgentServices billingAgentServices;

	@Autowired(required = true)
	public SmfAgentServices smfAgentServices;

	@Autowired(required = true)
	public StripeImpl stripeImpl;

	@Autowired(required = true)
	public XBusServices xBusTariffServices;

	@Autowired(required = true)
	public LoginServices loginServices;

	@ApiIgnore
	@ApiOperation(value = "logIn", response = LoginResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = LoginResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/logIn", produces = "application/json", consumes = "application/json")
	public LoginResponse logIn(@Valid @RequestBody LoginRequest request) {
		if (LOGGER.isDebugEnabled())
			LOGGER.info("MSP-API-logIn called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		LoginResponse response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSPAPIController - LoginRequest is Null");
			response = new LoginResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {

				String pwd = base64Validation(request.getUserPassword());
				String nwname = null;

				String defaultPassword = utility.getProperty("default.password");
				System.out.println("default password>>>" + defaultPassword);
				System.out.println("password>>>" + pwd);
				if (pwd == null || !pwd.equalsIgnoreCase(defaultPassword)) {
					response = new LoginResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);

				nwname = base64Validation(request.getNetworkName());

				if (nwname == null) {
					response = new LoginResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_NETWORK_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
					return response;
				} else {
					if (nwname.equalsIgnoreCase(utility.getProperty("selfcare.networkName"))) {
						request.setNetworkName(nwname);
					} else {
						response = new LoginResponse();
						response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
						response.setResponseCode(MSPAPIGWConstants.IN_VALID_NETWORK_CODE);
						response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
						if (LOGGER.isErrorEnabled())
							LOGGER.error(
									"MSP-API-logIn() - NetworkName Not matching to property file configured value ");

						return response;
					}
				}

				response = selfcareAgentServices.logIn(request);

				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();

				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-logIn() Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);

			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-API-logIn() - Exception is " + e);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-logIn() Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new LoginResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;

	}
	@ApiIgnore
	@ApiOperation(value = "getSubDemographicDetails", response = GetSubDemographicDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetSubDemographicDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getSubDemographicDetails", produces = "application/json", consumes = "application/json")
	public GetSubDemographicDetailsResponse getSubDemographicDetails(
			@Valid @RequestBody GetSubDemographicDetailsRequest request) {
		LOGGER.info("API-getSubDemographicDetails called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		GetSubDemographicDetailsResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - GetSubCoreBalanceRequest is Null");
			response = new GetSubDemographicDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {

				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new GetSubDemographicDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);

				response = selfcareAgentServices.getSubDemographicDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDemographicDetails Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-APIController - getSubDemographicDetails() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDemographicDetails MSPAPIGWExceptions Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);
				response = new GetSubDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-APIController - getSubDemographicDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getSubDemographicDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new GetSubDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}

	private String base64Validation(String value) {
		String decodedString = null;
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(value);
			decodedString = new String(decodedBytes);

		} catch (Exception ex) {
			return decodedString;
		}

		return decodedString;
	}
	@ApiIgnore
	@ApiOperation(value = "updateDemographicDetails", response = UpdateDemographicDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = UpdateDemographicDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/updateDemographicDetails", produces = "application/json", consumes = "application/json")
	public UpdateDemographicDetailsResponse updateDemographicDetails(
			@Valid @RequestBody UpdateDemographicDetailsRequest request) {
		LOGGER.info("API-updateDemographicDetails called");

		long startTime = System.currentTimeMillis();
		long endTime = 0;

		UpdateDemographicDetailsResponse response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - UpdateDemographicDetailsRequest is Null");
			response = new UpdateDemographicDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {

				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new UpdateDemographicDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				if (request.getUserConsent() != null) {
					if (!request.getUserConsent().equalsIgnoreCase("1")
							&& !request.getUserConsent().equalsIgnoreCase("0")) {
						response = new UpdateDemographicDetailsResponse();
						response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
						response.setResponseCode(MSPAPIGWConstants.IN_VALID_REQUEST);
						response.setResponseMessage(MSPAPIGWConstants.IN_VALID_REQUEST_MSG);
						return response;
					}
				}

				request.setUserPassword(pwd);

				response = selfcareAgentServices.updateDemographicDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("updateDemographicDetails Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-APIController - updateDemographicDetails() - (MSPAPIGWExceptions is "
							+ e.getErrorCode() + "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("updateDemographicDetails MSPAPIGWExceptions Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);
				response = new UpdateDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-APIController - updateDemographicDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("updateDemographicDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new UpdateDemographicDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "rechargeHistory", response = RechargeHistoryResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = RechargeHistoryResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/rechargeHistory", produces = "application/json", consumes = "application/json")
	public RechargeHistoryResponse rechargeHistory(@Valid @RequestBody RechargeHistoryRequest request) {
		LOGGER.info("MSP-API-rechargeHistory called");

		long startTime = System.currentTimeMillis();
		long endTime = 0;

		RechargeHistoryResponse response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-API Controller - RechargeHistoryRequest is Null");
			response = new RechargeHistoryResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {

			String pwd = base64Validation(request.getUserPassword());
			if (pwd == null) {
				response = new RechargeHistoryResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
				response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
				return response;
			}
			request.setUserPassword(pwd);

			try {
				response = billingAgentServices.rechargeHistory(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();

				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-rechargeHistory Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-APIController - rechargeHistory() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-APIController - rechargeHistory() MSPAPIGWExceptions Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);
				response = new RechargeHistoryResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSPAPIController - rechargeHistory() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-rechargeHistory Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new RechargeHistoryResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "getServiceDetails", response = GetServiceDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetServiceDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getServiceDetails", produces = "application/json", consumes = "application/json")
	public GetServiceDetailsResponse getServiceDetails(@Valid @RequestBody GetServiceDetailsRequest request) {
		LOGGER.info("MSP-API-getServiceDetails called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		GetServiceDetailsResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - getServiceDetails is Null");
			response = new GetServiceDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new GetServiceDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);
				response = billingAgentServices.getServiceDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-getServiceDetails Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - getServiceDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getServiceDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new GetServiceDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "getAvailableServiceDetails", response = GetAvailableServiceDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetAvailableServiceDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getAvailableServiceDetails", produces = "application/json", consumes = "application/json")
	public GetAvailableServiceDetailsResponse getAvailableServiceDetails(
			@Valid @RequestBody GetAvailableServiceDetailsRequest request) {
		LOGGER.info("MSP-API-GetServiceAvailableDetails called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		GetAvailableServiceDetailsResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - getAvailableServiceDetails is Null");
			response = new GetAvailableServiceDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new GetAvailableServiceDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);
				response = billingAgentServices.getAvailableServiceDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-getAvailableServiceDetails Success Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-APIController - getAvailableServiceDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getAvailableServiceDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new GetAvailableServiceDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "getAccountDetails", response = GetAccountDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetAccountDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getAccountDetails", produces = "application/json", consumes = "application/json")
	public GetAccountDetailsResponse getAccountDetails(@Valid @RequestBody GetAccountDetailsRequest request) {
		LOGGER.info("API-getAccountDetails called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		GetAccountDetailsResponse response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-API Controller - GetAccountDetailsRequest is Null");
			response = new GetAccountDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				response = billingAgentServices.getAccountDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API getAccountDetails Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP - API Controller - getAccountDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP - API getAccountDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new GetAccountDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "purchasePack", response = PackPurchaseResponse.class)
	@PostMapping(path = "/purchasePack", produces = "application/json", consumes = "application/json")
	public PackPurchaseResponse purchasePack(@Valid @RequestBody PackPurchaseRequest request) {
		LOGGER.info("API-purchasePack called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		PackPurchaseResponse response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("APIController - PackPurchaseRequest is Null");
			response = new PackPurchaseResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				response = xBusTariffServices.purchasePack(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - purchasePack() - (MSPAPIGWExceptions is " + e.getErrorCode() + "#"
							+ e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new PackPurchaseResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("APIController - purchasePack() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("purchasePack Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new PackPurchaseResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "changePassword", response = ChangePasswordResponse.class)
	@PostMapping(path = "/changePassword", produces = "application/json", consumes = "application/json")

	public ChangePasswordResponse changePassword(@Valid @RequestBody ChangePasswordRequest request) {
		if (LOGGER.isDebugEnabled())
			LOGGER.info("MSP-API-changePassword called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ChangePasswordResponse response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSPAPIController - changePasswordRequest is Null");
			response = new ChangePasswordResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {

				String basePwd = request.getUserPassword();
				String baseNewPwd = request.getNewPassword();

				String pwd = base64Validation(basePwd);
				String newPwd = base64Validation(baseNewPwd);

				if (pwd == null || newPwd == null) {
					response = new ChangePasswordResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}

				request.setUserPassword(pwd);
				request.setNewPassword(newPwd);

				response = selfcareAgentServices.changePassword(request);

				if (response.getResponseStatus() != null && response.getResponseStatus().equalsIgnoreCase("0")) {
					response.setNewPassword(baseNewPwd);
					response.setOldPassword(basePwd);
				}

				endTime = System.currentTimeMillis();

				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-changePassword() Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);

			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-API-changePassword() - Exception is " + e);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-changePassword() Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new ChangePasswordResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;

	}
	@ApiIgnore
	@ApiOperation(value = "forgotPassword", response = ForgotPasswordResponse.class)
	@PostMapping(path = "/forgotPassword", produces = "application/json", consumes = "application/json")

	public ForgotPasswordResponse forgotPassword(@Valid @RequestBody ForgotPasswordRequest request) {
		if (LOGGER.isDebugEnabled())
			LOGGER.info("MSP-API-forgotPassword called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ForgotPasswordResponse response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSPAPIController - forgotPasswordRequest is Null");
			response = new ForgotPasswordResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {

				String basePwd = request.getUserPassword();

				String pwd = base64Validation(basePwd);

				if (pwd == null) {
					response = new ForgotPasswordResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}

				request.setUserPassword(pwd);

				response = xBusTariffServices.forgotPassword(request);

				endTime = System.currentTimeMillis();

				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-forgotPassword() Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-API-forgotPassword-() - (MSPAPIGWExceptions is " + e.getErrorCode() + "#"
							+ e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-forgotPassword-()  MSPAPIGWExceptions Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);
				response = new ForgotPasswordResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-API-forgotPassword() - Exception is " + e);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-forgotPassword() Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new ForgotPasswordResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;

	}
	@ApiIgnore
	@ApiOperation(value = "logInv1", response = LoginResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = LoginResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/logInv1", produces = "application/json", consumes = "application/json")
	public Loginv1Response logInv1(@Valid @RequestBody Loginv1Request request) {
		if (LOGGER.isDebugEnabled())
			LOGGER.info("MSP-API-logInv1 called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		Loginv1Response response = null;

		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSPAPIController - Loginv1Request is Null");
			response = new Loginv1Response();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {

				String pwd = base64Validation(request.getUserPassword());
				String nwname = null;
				if (pwd == null) {
					response = new Loginv1Response();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);

				nwname = base64Validation(request.getNetworkName());

				if (nwname == null) {
					response = new Loginv1Response();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_NETWORK_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
					return response;
				} else {
					if (nwname.equalsIgnoreCase(utility.getProperty("selfcare.networkName"))) {
						request.setNetworkName(nwname);
					} else {
						response = new Loginv1Response();
						response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
						response.setResponseCode(MSPAPIGWConstants.IN_VALID_NETWORK_CODE);
						response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
						if (LOGGER.isErrorEnabled())
							LOGGER.error(
									"MSP-API-logIn() - NetworkName Not matching to property file configured value ");

						return response;
					}
				}

				response = selfcareAgentServices.logInv1(request);

				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();

				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-logInv1() Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);

			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("MSP-API-logInv1() - Exception is " + e);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-logInv1() Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new Loginv1Response();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;

	}
	@ApiIgnore
	@ApiOperation(value = "getDenominationDetails", response = GetDenominationDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetDenominationDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getDenominationDetails", produces = "application/json", consumes = "application/json")
	public GetDenominationDetailsResponse getDenominationDetails(
			@Valid @RequestBody GetDenominationDetailsRequest request) {
		LOGGER.info("MSP-API-getDenominationDetails called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		GetDenominationDetailsResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - GetDenominationDetails is Null");
			response = new GetDenominationDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new GetDenominationDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);
				response = billingAgentServices.getDenominationDetails(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-GetDenominationDetails Success Time >>> "
							+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - GetDenominationDetails() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("GetDenominationDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new GetDenominationDetailsResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "initiatePayment", response = InitiatePaymentResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = InitiatePaymentResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/initiatePayment", produces = "application/json", consumes = "application/json")
	public InitiatePaymentResponse initiatePayment(@Valid @RequestBody InitiatePaymentRequest request) {
		LOGGER.info("MSP-API-InitiatePayment called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		InitiatePaymentResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - InitiatePayment is Null");
			response = new InitiatePaymentResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new InitiatePaymentResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);
				response = smfAgentServices.initiatePayment(request);
				if (response.getInternalTransId() != null) {
					response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				} else {
					response = new InitiatePaymentResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.INTERNAL_SERVER_ERROR);
					response.setResponseMessage(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
				}
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-InitiatePayment Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - InitiatePayment() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("InitiatePayment Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new InitiatePaymentResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "paymentConfirmation", response = PaymentConfirmationResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = PaymentConfirmationResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/paymentConfirmation", produces = "application/json", consumes = "application/json")
	public PaymentConfirmationResponse paymentConfirmation(@Valid @RequestBody PaymentConfirmationRequest request) {
		LOGGER.info("MSP-API-paymentConfirmation called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		PaymentConfirmationResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - paymentConfirmation is Null");
			response = new PaymentConfirmationResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new PaymentConfirmationResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);
				response = smfAgentServices.paymentConfirmation(request);
				if (response.getResponseStatus() == null) {
					response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				}
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-paymentConfirmation Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - paymentConfirmation() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("paymentConfirmation Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new PaymentConfirmationResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "paymentPublishableKey", response = PaymentPublishableKeyResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = PaymentConfirmationResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/paymentPublishableKey", produces = "application/json", consumes = "application/json")
	public PaymentPublishableKeyResponse paymentPublishableKey(
			@Valid @RequestBody PaymentPublishableKeyRequest request) {
		LOGGER.info("MSP-API-PaymentPublishableKey called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		PaymentPublishableKeyResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - PaymentPublishableKey is Null");
			response = new PaymentPublishableKeyResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new PaymentPublishableKeyResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);
				String publishablekey = stripeImpl.getPublishableKey();
				if (publishablekey != null) {
					response = new PaymentPublishableKeyResponse();
					response.setPublishableKey(publishablekey);
					response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
					response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
					response.setResponseMessage(MSPAPIGWConstants.SUCCESS);
				} else {
					response = new PaymentPublishableKeyResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.INTERNAL_SERVER_ERROR);
					response.setResponseMessage(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
				}

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-PaymentPublishableKey Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - PaymentPublishableKey() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("PaymentPublishableKey Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new PaymentPublishableKeyResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "getIdTypes", response = GetIDTypesResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetIDTypesResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getIdTypes", produces = "application/json", consumes = "application/json")
	public GetIDTypesResponse getIdTypes(@Valid @RequestBody GetIDTypesRequest request) {
		LOGGER.info("MSP-API-getIdTypes called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		GetIDTypesResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - getIdTypes is Null");
			response = new GetIDTypesResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			return response;
		} else {
			try {

				String pswd = base64Validation(request.getUserPassword());
				if (pswd == null) {
					response = new GetIDTypesResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				} else
					request.setUserPassword(pswd);

				response = loginServices.getIDTypes(request);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API getIDTypes Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - getIdTypes() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("getIdTypes Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new GetIDTypesResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}

		return response;

	}
	@ApiIgnore
	@ApiOperation(value = "validateTP", response = ValidateTPResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = ValidateTPResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/validateTP", produces = "application/json", consumes = "application/json")
	public ValidateTPResponse validateTP(@Valid @RequestBody ValidateTPRequest request) {
		LOGGER.info("MSP-API-validateTP called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ValidateTPResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - validateTP is Null");
			response = new ValidateTPResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			return response;
		} else {

			try {
				String nwname = base64Validation(request.getNetworkName());
				String pswd = base64Validation(request.getUserPassword());
				if (pswd == null) {
					response = new ValidateTPResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				} else
					request.setUserPassword(pswd);

				if (nwname == null) {
					response = new ValidateTPResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_NETWORK_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
					return response;
				} else {
					if (nwname.equalsIgnoreCase(utility.getProperty("iba.NetworkName"))) {
						request.setNetworkName(nwname);
					} else {
						response = new ValidateTPResponse();
						response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
						response.setResponseCode(MSPAPIGWConstants.IN_VALID_NETWORK_CODE);
						response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
						if (LOGGER.isErrorEnabled())
							LOGGER.error(
									"MSP-API-logIn() - NetworkName Not matching to property file configured value ");

						return response;
					}
				}

				response = loginServices.validateTP(request);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API validateTP Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - validateTP() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("validateTP Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new ValidateTPResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}

		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "activateTP", response = ActivateTPResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = ActivateTPResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/activateTP", produces = "application/json", consumes = "application/json")
	public ActivateTPResponse activateTP(@Valid @RequestBody ActivateTPRequest request) {
		LOGGER.info("MSP-API-activateTP called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		ActivateTPResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - activateTP is Null");
			response = new ActivateTPResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			return response;
		} else {

			try {

				String pswd = base64Validation(request.getUserPassword());
				if (pswd == null) {
					response = new ActivateTPResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				} else
					request.setUserPassword(pswd);

				response = new ActivateTPResponse();

				response = xBusTariffServices.activateTP(request);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API activateTP Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					e.printStackTrace();
				LOGGER.error("MSP-APIController - activateTP() - Exception is " + e);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("validateTP Exception Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
				response = new ActivateTPResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}

		}
		return response;
	}
	@ApiIgnore
	@ApiOperation(value = "getMsisdnDetails", response = GetMsisdnDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetMsisdnDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getMsisdnDetails", produces = "application/json", consumes = "application/json")
	public GetMsisdnDetailsResponse getMsisdnDetails(@Valid @RequestBody GetMsisdnDetailsRequest request) {
		LOGGER.info("MSP-API-getMsisdnDetails called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;
		GetMsisdnDetailsResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - getMsisdnDetails is Null");
			response = new GetMsisdnDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
			return response;
		} else {
			try {
				String pswd = base64Validation(request.getUserPassword());
				if (pswd == null) {
					response = new GetMsisdnDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				} else
					request.setUserPassword(pswd);

				response = billingAgentServices.getMsisdnDetails(request);
			} catch (Exception e) {
				if (e instanceof MSPAPIGWExceptions) {
					MSPAPIGWExceptions e1 = (MSPAPIGWExceptions) e;
					if (LOGGER.isErrorEnabled())
						e1.printStackTrace();
					LOGGER.error("MSP-APIController - getMsisdnDetails() - MSPAPIGWExceptions is " + e1);
					endTime = System.currentTimeMillis();
					if (LOGGER.isDebugEnabled())
						LOGGER.info("getMsisdnDetails MSPAPIGWExceptions Time >>> "
								+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);

					response = new GetMsisdnDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
					response.setResponseMessage(e1.getErrorMessage());
				} else {
					if (LOGGER.isErrorEnabled())
						e.printStackTrace();
					LOGGER.error("MSP-APIController - getMsisdnDetails() - Exception is " + e);
					endTime = System.currentTimeMillis();
					if (LOGGER.isDebugEnabled())
						LOGGER.info("getMsisdnDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
								+ MSPAPIGWConstants.IN_SEC);
					response = new GetMsisdnDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
					response.setResponseMessage(e.getMessage());

				}
			}
		}
		return response;
	}

	@ApiOperation(value = "getSubsDetails", response = GetSubsDetailsResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = GetSubsDetailsResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/getSubsDetails", produces = "application/json", consumes = "application/json")
	public  GetSubsDetailsResponse getSubsDetails(@Valid @RequestBody GetSubsDetailsRequest request) {
		LOGGER.info("MSP-API-getSubsDetails called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		GetSubsDetailsResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - getSubsDetails is Null");
			response = new GetSubsDetailsResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {
			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new GetSubsDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					return response;
				}
				request.setUserPassword(pwd);
				Boolean allowMVNEForConfNwId = allowMVNEForConfNwId(request.getCarrierID(), request.getUserName(),
						request.getUserPassword());

				if (!allowMVNEForConfNwId) {
					response = new GetSubsDetailsResponse();
					response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
					return response;
				}
				response = billingAgentServices.getSubsDetails(request);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-getSubsDetails Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (e instanceof MSPAPIGWExceptions) {
					MSPAPIGWExceptions e1 = (MSPAPIGWExceptions) e;
					if (LOGGER.isErrorEnabled())
						e1.printStackTrace();
					LOGGER.error("MSP-APIController - getSubsDetails() - MSPAPIGWExceptions is " + e1);
					endTime = System.currentTimeMillis();
					if (LOGGER.isDebugEnabled())
						LOGGER.info("getSubsDetails MSPAPIGWExceptions Time >>> "
								+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);

					response = new GetSubsDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseCode(e1.getErrorCode());
					response.setResponseMessage(e1.getErrorMessage());
					return response;
				} else {
					if (LOGGER.isErrorEnabled())
						e.printStackTrace();
					LOGGER.error("MSP-APIController - getSubsDetails() - Exception is " + e);
					endTime = System.currentTimeMillis();
					if (LOGGER.isDebugEnabled())
						LOGGER.info("getSubsDetails Exception Time >>> " + (int) ((endTime - startTime) / 1000)
								+ MSPAPIGWConstants.IN_SEC);
					response = new GetSubsDetailsResponse();
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
					response.setResponseMessage(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
					return response;

				}
			}
		}

		return response;

	}

	@ApiOperation(value = "doRecharge", response = DoRechargeResponse.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Customer Details Retrieved", response = DoRechargeResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	@PostMapping(path = "/doRecharge", produces = "application/json", consumes = "application/json")
	public DoRechargeResponse doRecharge(@Valid @RequestBody DoRechargeRequest request) {
		LOGGER.info("MSP-API-doRechargeCheck called");
		long startTime = System.currentTimeMillis();
		long endTime = 0;

		DoRechargeResponse response = null;
		if (request == null) {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("MSP-APIController - doRechargeCheck is Null");
			response = new DoRechargeResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		} else {

			try {
				String pwd = base64Validation(request.getUserPassword());
				if (pwd == null) {
					response = new DoRechargeResponse();
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseCode(MSPAPIGWConstants.IN_VALID_PASSWORD_CODE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_PASSWORD_MSG);
					response.setTransStatus(MSPAPIGWConstants.FAILURE);
					return response;
				}
				request.setUserPassword(pwd);
				Boolean allowMVNEForConfNwId = allowMVNEForConfNwId(request.getCarrierID(), request.getUserName(),
						request.getUserPassword());

				if (!allowMVNEForConfNwId) {
					response = new DoRechargeResponse();
					response.setResponseCode(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseMessage(MSPAPIGWConstants.IN_VALID_NETWORK_MSG);
					response.setTransStatus(MSPAPIGWConstants.FAILURE);
					return response;
				}

				response = billingAgentServices.doRechargeCheck(request);
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("MSP-API-doRechargeCheck Success Time >>> " + (int) ((endTime - startTime) / 1000)
							+ MSPAPIGWConstants.IN_SEC);
			} catch (Exception e) {
				if (e instanceof MSPAPIGWExceptions) {
					MSPAPIGWExceptions e1 = (MSPAPIGWExceptions) e;
					if (LOGGER.isErrorEnabled())
						e1.printStackTrace();
					LOGGER.error("MSP-APIController - doRecharge() - MSPAPIGWExceptions is " + e1);
					endTime = System.currentTimeMillis();
					if (LOGGER.isDebugEnabled())
						LOGGER.info("doRecharge MSPAPIGWExceptions Time >>> "
								+ (int) ((endTime - startTime) / 1000) + MSPAPIGWConstants.IN_SEC);

					response = new DoRechargeResponse();
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseCode(e1.getErrorCode());
					response.setResponseMessage(e1.getErrorMessage());
					response.setTransStatus(MSPAPIGWConstants.FAILURE);
				} else {
					if (LOGGER.isErrorEnabled())
						e.printStackTrace();
					LOGGER.error("MSP-APIController - doRecharge() - Exception is " + e);
					endTime = System.currentTimeMillis();
					if (LOGGER.isDebugEnabled())
						LOGGER.info("doRecharge Exception Time >>> " + (int) ((endTime - startTime) / 1000)
								+ MSPAPIGWConstants.IN_SEC);
					response = new DoRechargeResponse();
					response.setResponseStatus(MSPAPIGWConstants.FAILURE);
					response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
					response.setResponseMessage(MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG);
					response.setTransStatus(MSPAPIGWConstants.FAILURE);

				}
			}
		}

		return response;

	}

	private Boolean allowMVNEForConfNwId(String carrierID, String userName, String userPassword) {

		String ALLOW_MVNE_FOR_CONF_NW_ID = utility.getProperty("ALLOW_MVNE_FOR_CONF_NW_ID");// 0:userName:password#1:userName:password
		if (ALLOW_MVNE_FOR_CONF_NW_ID != null) {

			List<String[]> values = Arrays.stream(ALLOW_MVNE_FOR_CONF_NW_ID.split("#")).map(part -> part.split(":"))
					.collect(Collectors.toList());

			for (String[] firstPartValues : values) {
				String nwID = firstPartValues[0];
				String user = firstPartValues[1];
				String password = firstPartValues[2];
				if (carrierID.equalsIgnoreCase(nwID) && user.equalsIgnoreCase(userName)
						&& userPassword.equalsIgnoreCase(password)) {
					return true;

				}
			}

		}
		return false;
	}

}
