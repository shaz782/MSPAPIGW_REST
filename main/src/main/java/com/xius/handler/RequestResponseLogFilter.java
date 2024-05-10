/**
 * @author shashidhar.p
 */

package com.xius.handler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis.AxisFault;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingResponseWrapper;

import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.utilities.Utility;

@Component
public class RequestResponseLogFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		ContentCachingResponseWrapper wrapperResponse = new ContentCachingResponseWrapper(response);

		// pass through filter chain to do the actual request handling
		CachedBodyHttpServletRequest cachedBodyHttpServletRequest = new CachedBodyHttpServletRequest(request);
		HttpServletResponseCopier responseCopier = new HttpServletResponseCopier((HttpServletResponse) response);

		//int validNetwork = checkNetworkId(cachedBodyHttpServletRequest);
		/*
		 * if (validNetwork == 1 || validNetwork == 3) { // authentication Success or
		 * authentication is off if (validNetwork == 3) { logger.
		 * info("RequestResponseLogFilter.doFilterInternal##validNetwork Not Configured"
		 * ); } else {
		 * logger.info("RequestResponseLogFilter.doFilterInternal##validNetwork SUCCESS"
		 * ); } } else if (validNetwork == 2) { // Exception occurred during
		 * authentication process
		 * logger.error("AxisFault Exception Occured During authentication process");
		 * ((HttpServletResponse)
		 * wrapperResponse).sendError(HttpServletResponse.SC_UNAUTHORIZED,
		 * "NetWork Authentication Failed."); }
		 */
		filterChain.doFilter(cachedBodyHttpServletRequest, responseCopier);
		/*
		 * int authResponseflag = authenticate(cachedBodyHttpServletRequest);
		 * 
		 * if (authResponseflag == 0 || authResponseflag == 3) { // authentication
		 * Success or authentication is off if (authResponseflag == 3) { logger.
		 * info("RequestResponseLogFilter.doFilterInternal##Authentcation Not Configured"
		 * ); } else { logger.
		 * info("RequestResponseLogFilter.doFilterInternal##Authentcation SUCCESS"); }
		 * 
		 * } else if (authResponseflag == 2) { // Exception occurred during
		 * authentication process
		 * logger.error("AxisFault Exception Occured During authentication process");
		 * ((HttpServletResponse)
		 * wrapperResponse).sendError(HttpServletResponse.SC_UNAUTHORIZED,
		 * "Authentication Failed."); } else { // authentication Failed
		 * logger.error("Exception Occured During authentication process");
		 * ((HttpServletResponse)
		 * wrapperResponse).sendError(HttpServletResponse.SC_UNAUTHORIZED,
		 * "Authentication Failed."); }
		 */
		// body can only be read after the actual request handling was done!
		log(cachedBodyHttpServletRequest, responseCopier);

	}

	private int checkNetworkId(CachedBodyHttpServletRequest request) {
		return 0;
		/*
		 * int validNw = 1; String payload = null; try { payload =
		 * request.getReader().lines().collect(Collectors.joining());
		 * 
		 * String splitString[] = request.getRequestURI().split("/"); String mspApi =
		 * splitString[splitString.length - 3]; String apiName =
		 * splitString[splitString.length - 1]; logger.info("API NAME:" + apiName);
		 * 
		 * if (mspApi != null && !mspApi.equalsIgnoreCase("MSP")) { return validNw; }
		 * else { JSONObject myResponse = new JSONObject(payload); String nwId =
		 * myResponse.get("carrierID").toString();
		 * 
		 * // getting API name from RequestURI
		 * 
		 * if (mspApi.equalsIgnoreCase("MSP") && apiName.equalsIgnoreCase("logIn")) {
		 * return validNw; } else {
		 * 
		 * Utility utility = null; ServletContext servletContext =
		 * request.getServletContext(); WebApplicationContext webApplicationContext =
		 * WebApplicationContextUtils .getWebApplicationContext(servletContext); utility
		 * = webApplicationContext.getBean(Utility.class);
		 * 
		 * String authSwitch = utility.getProperty("networkId_check");
		 * 
		 * if (authSwitch != null && authSwitch.equalsIgnoreCase(nwId)) { return
		 * validNw; } else if (authSwitch != null && authSwitch.equalsIgnoreCase("-1"))
		 * { return validNw = 3; } else if (authSwitch != null) { return validNw = 2; }
		 * } } } catch (AxisFault e) { logger.error("validNw - AxisFault >>>> " + e);
		 * validNw = 2; } catch (IOException e) {
		 * logger.error("validNw - IOException >>>> " + e); validNw = 2; } catch
		 * (Exception e) { logger.error("validNw - Exception >>>> " + e); validNw = 2; }
		 * return validNw;
		 */}

	private void log(CachedBodyHttpServletRequest wrappedRequest, HttpServletResponseCopier wrapperResponse) {
		logger.info(wrappedRequest.getMethod());
		logger.info(wrappedRequest.getRequestURI());

		logger.info(wrappedRequest.getRemoteAddr());
		getReqBody(wrappedRequest);
		logger.info(wrapperResponse.getStatus());
		getResBody(wrapperResponse);

	}

	private void getReqBody(CachedBodyHttpServletRequest request) {
		try {
			logger.info("Request Payload:: " + request.getReader().lines().collect(Collectors.joining()));
		} catch (IOException e) {
			logger.error("IOException of getReqBody  >>>> " + e);
		}
	}

	private void getResBody(HttpServletResponseCopier responseCopier) {
		byte[] copy = responseCopier.getCopy();
		try {
			logger.info("Response Payload:: " + new String(copy, responseCopier.getCharacterEncoding()));
		} catch (UnsupportedEncodingException e) {
			logger.error("UnsupportedEncodingException of getResBody  >>>> " + e);
		}

	}

	private int authenticate(CachedBodyHttpServletRequest request) {

		int responseValue = 1;

		if (request != null) {

			String payload = null;
			try {
				payload = request.getReader().lines().collect(Collectors.joining());

				// Converting String to Json Objects and retriving
				// userName,userPassword,carrierID
				JSONObject myResponse = new JSONObject(payload);

				// Creating commonHeaders and assigning userName,userPassword,carrierID
				CommonHeaders commonHeaders = new CommonHeaders();
				if (myResponse.get("carrierID") != null) {
					commonHeaders.setCarrierID(myResponse.get("carrierID").toString());
				}
				if (myResponse.get("userName") != null) {
					commonHeaders.setUserName(myResponse.get("userName").toString());
				}
				if (myResponse.get("userPassword") != null) {
					commonHeaders.setUserPassword(myResponse.get("userPassword").toString());
				}

				// getting API name from RequestURI
				String splitString[] = request.getRequestURI().split("/");
				String apiName = splitString[splitString.length - 1];
				//logger.info("API NAME:" + apiName);

				// invoking Authenticate IBA API
				AuthenticationHandler authenticationHandler = null;
				ServletContext servletContext = request.getServletContext();
				WebApplicationContext webApplicationContext = WebApplicationContextUtils
						.getWebApplicationContext(servletContext);
				authenticationHandler = webApplicationContext.getBean(AuthenticationHandler.class);

				responseValue = authenticationHandler.invoke(apiName, commonHeaders);

			} catch (AxisFault e) {
				logger.error("AxisFault >>>> " + e);
				responseValue = 2;
			} catch (IOException e) {
				logger.error("IOException >>>> " + e);
				responseValue = 2;
			} catch (Exception e) {
				logger.error("Exception >>>> " + e);
				responseValue = 2;
			}

		}
		return responseValue;
	}
}
