package com.xius.rmsp.controler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.notify.messages.NotifyMessageRequest;
import com.xius.rmsp.notify.messages.NotifyMessageResponse;
import com.xius.rmsp.services.NotificationServices;
import com.xius.rmsp.utilities.MSPAPIGWConstants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@ApiIgnore
@RequestMapping("/Notification")
@EnableSwagger2
@Api(value="/Notification",description="XIUS Provided Notification APIs",produces ="application/json")
public class NotificationController {
	private static final Logger LOGGER = LogManager.getLogger(NotificationController.class);
	
	@Autowired(required=true)
	public NotificationServices notificationServices;
	
	@ApiOperation(value="notify",response=NotifyMessageResponse.class )
	@ApiResponses(value={
		    @ApiResponse(code=200,message="Customer Details Retrieved",response=NotifyMessageResponse.class),
		    @ApiResponse(code=500,message="Internal Server Error"),
		    @ApiResponse(code=404,message="Customer not found")
		    })
	@PostMapping(path="/notify",produces = "application/json", consumes = "application/json")
	public NotifyMessageResponse notify(@RequestBody NotifyMessageRequest request ) {
		if(LOGGER.isDebugEnabled())
			LOGGER.info("API-notify called");
		long startTime= System.currentTimeMillis();
		long endTime= 0;
		NotifyMessageResponse response=null;
		
		if(request==null) {
			if(LOGGER.isErrorEnabled())
				LOGGER.error("NotificationController - NotifyMessageRequest is Null");
			response=new NotifyMessageResponse();
			response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
			response.setResponseMessage(MSPAPIGWConstants.REQUEST_CAN_NOT_BE_NULL);
		}
		else {
			try {
				response = notificationServices.notify(request);
				response.setResponseCode(MSPAPIGWConstants.SUCCESS_RESPONSE_CODE);
				response.setResponseStatus(MSPAPIGWConstants.SUCCESS_RESPONSE_STATUS_CODE);
				response.setResponseMessage(MSPAPIGWConstants.SUCCESS);

				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("Notification-notify Success Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);

			} catch (MSPAPIGWExceptions e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("NotificationController - notify() - (MSPAPIGWExceptions is " + e.getErrorCode()
							+ "#" + e.getErrorMessage());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("notify MSPAPIGWExceptions Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new NotifyMessageResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(e.getErrorCode());
				response.setResponseMessage(e.getErrorMessage());
			} catch (Exception e) {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("NotificationController - notify() - Exception is " + e.getStackTrace());
				endTime = System.currentTimeMillis();
				if (LOGGER.isDebugEnabled())
					LOGGER.info("notify Exception Time >>> " + (int) ((endTime - startTime)/1000) + MSPAPIGWConstants.IN_SEC);
				response = new NotifyMessageResponse();
				response.setResponseStatus(MSPAPIGWConstants.ERROR_RESPONSE_STATUS_CODE);
				response.setResponseCode(MSPAPIGWConstants.OTHER_EXCEPTION_CODE);
				response.setResponseMessage(e.getMessage());
			}
		}
		return response; 
		
	}
	}
