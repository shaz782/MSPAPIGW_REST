package com.xius.rmsp.exceptions;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xius.restmsp.Initializer;
import com.xius.rmsp.utilities.MSPAPIGWConstants;

public class MSPAPIGWExceptions extends Exception{
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LogManager.getLogger(MSPAPIGWExceptions.class);
	
	private Properties errorProps = null;
	private java.lang.String errorCode;
	private java.lang.String errorMessage;
	
	
	public MSPAPIGWExceptions(String errorCode,String errorMessage) {
		errorProps=Initializer.getErrorDetails();
		if(errorProps!=null) {
			LOGGER.info("ErrorCode >>>"+errorCode+" checking from ErrorDetails.Props");
			if((errorCode!=null) && (errorProps.containsKey(errorCode))) {
				errorMessage = errorProps.getProperty(errorCode);
				LOGGER.info("errorMessage >>>"+errorMessage);
			}else if(errorMessage==null){
				LOGGER.info("ErrorCode Details Not Found in ErrorDetails.Props");
				errorMessage = MSPAPIGWConstants.INTERNAL_SERVER_ERROR_MSG;
			}
		}else {
			LOGGER.error("config/ErrorDetails.properties Details Not Found");
		}
        this.setErrorMessage(errorMessage);		
        this.setErrorCode(errorCode);
	}

	public java.lang.String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(java.lang.String errorCode) {
		this.errorCode = errorCode;
	}

	public java.lang.String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(java.lang.String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
