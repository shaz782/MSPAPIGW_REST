package com.xius.handler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.AccountManagementInvoker;
import com.xius.client.invoker.AuthenticationAPIInvoker;
import com.xius.msp.billing.messages.loginServices.AuthenticateApiRequest;
import com.xius.msp.billing.messages.loginServices.AuthenticateApiResponse;

import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.ApiID;
import com.xius.rmsp.utilities.Utility;

/**
 * This class used to validate the user when request is reached
 * 
 */
@Component
@Configurable
public class AuthenticationHandler {

	@Autowired
	AuthenticationAPIInvoker invoker;

	@Autowired
	public Utility utility;

	private static final Logger logger = LogManager.getLogger(AccountManagementInvoker.class);

	/**
	 * @throws Exception
	 * 
	 */
	boolean call_Y_or_N;

	public int invoke(String APIname, CommonHeaders commonHeaders) throws Exception {
		int returnflag = 1; // initializing
		try {

			if (logger.isInfoEnabled())
				logger.info(" ## in AuthenticationHandler User Authentication ## This is the operation: " + APIname);

			AuthenticateApiRequest request = new AuthenticateApiRequest();
			
			String authSwitch = utility.getProperty("authenticate_switch");
			call_Y_or_N = false;
			if (authSwitch != null && authSwitch.length() > 0) {
				String[] authSwitchs = authSwitch.split("#");
				for (String nwAuthSw : authSwitchs) {
					String[] flgs = nwAuthSw.split(":");
					if ((flgs[0].equalsIgnoreCase(commonHeaders.getCarrierID())) && flgs[1].equalsIgnoreCase("Y")) {
						call_Y_or_N = true;
						break;
					}

				}
				if (call_Y_or_N) {

					String apiId = (String) ApiID.getValueOf(APIname);

					if (logger.isInfoEnabled()) {

						logger.info(" ## in AuthenticationHandler User Authentication ##getCarrierID------------"
								+ commonHeaders.getCarrierID());
						logger.info(" ## in AuthenticationHandler User Authentication ##UserID------------"
								+ commonHeaders.getUserName());
						logger.info(" ## in AuthenticationHandler User Authentication ##ApiName------------" + APIname);
						logger.info(" ## in AuthenticationHandler User Authentication ##ApiID(PrivlegeId)------------"
								+ apiId);
					}
					request = setAuthenticateApiRequest(apiId);
					AuthenticateApiResponse response = invoker.authenticationAPI(request, commonHeaders);

					if (logger.isInfoEnabled()) {
						if (response != null) {
							if (logger.isErrorEnabled())
								logger.info(
										" ## in AuthenticationHandler User Authentication ##AuthenticationAPI return------------##"
												+ response);
							String msg = response.getMessage();
							logger.info("##AuthenticationHandler Response Msg>>" + msg);
							if (msg.equalsIgnoreCase("SUCCESS")) {
								returnflag = 0;// Success
							}

						}

					}
				} else {
					if (logger.isInfoEnabled())
						logger.info(" ## in AuthenticationHandler--Authentication flag is N");

					returnflag = 3;// Authentication flag is false so returning 3
				}
			} else {
				if (logger.isInfoEnabled())
					logger.info(" ## in AuthenticationHandler--Authentication Switch  is Not Configured/null");
				returnflag = 3;// Authentication switch is N so returning 3
			}

		} catch (MSPAPIGWExceptions mspexception) {

			if (logger.isErrorEnabled())
				logger.error(" ## in AuthenticationHandler User Authentication mspexception--##" + mspexception);
			throw mspexception;

		} catch (Exception exception) {

			if (logger.isErrorEnabled())
				logger.error(" ## in AuthenticationHandler User Authentication ##exception--##" + exception);
			throw exception;

		}

		return returnflag;

	}

	public AuthenticateApiRequest setAuthenticateApiRequest(String apiId) {
		AuthenticateApiRequest request = new AuthenticateApiRequest();
		request.setPrivID(apiId);
		return request;
	}

}
