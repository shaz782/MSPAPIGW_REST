package com.xius.client.impl;

import java.math.BigInteger;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xius.client.invoker.NotifyInvoker;
import com.xius.rmsp.exceptions.MSPAPIGWExceptions;
import com.xius.rmsp.messages.CommonHeaders;
import com.xius.rmsp.notify.messages.NotifyMessageResponse;
import com.xius.rmsp.utilities.Utility;

/**
 * 
 * @author shashidhar.p
 * @since 4th oct,2019 Description : From Here we will invoke the Notification APIs
 *        Services.
 */
@Component
public class NotifyImpl {
	
	private static final Logger LOGGER = LogManager.getLogger(NotifyImpl.class);

	@Autowired(required = true)
	private CommonHeaders headers;
	
	@Autowired(required = true)
	public Utility utility;

	@Autowired(required = true)
	private NotifyInvoker invoker;

	NotifyMessageResponse response=null;
	
	com.xius.msp.mq.messages.notification.NotifyMessageResponse agentResponse=null;
	com.xius.msp.mq.messages.notification.NotifyMessageRequest agentRequest=new com.xius.msp.mq.messages.notification.NotifyMessageRequest();
	com.xius.msp.mq.messages.notification.MessageType messageType=new com.xius.msp.mq.messages.notification.MessageType();
	
	
	public NotifyMessageResponse notify(com.xius.rmsp.notify.messages.NotifyMessageRequest request) throws MSPAPIGWExceptions {
		agentRequest = getAgentRequest(request, headers);
		if (agentRequest != null) {
			agentResponse = invoker.notify(agentRequest, headers);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("NotifyImpl-notify of notifyRequest is Null");
		}
		if (agentResponse != null) {
			response = setAgentResponse(agentResponse);
		} else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("NotifyImpl-notify of Agent notifyResponse is Null");
		}
		return response;
	}

	private NotifyMessageResponse setAgentResponse(com.xius.msp.mq.messages.notification.NotifyMessageResponse agentResponse) {

		response = new NotifyMessageResponse();
		
		if(agentResponse!=null) {
			if(agentResponse.getTransID()!=null && agentResponse.getTransID()>0L)
				response.setTransID(agentResponse.getTransID());
			return response;
			
		}else {
			if (LOGGER.isErrorEnabled())
				LOGGER.error("NotificationServices- notify of Agent NotifyMessageResponse is Null");
			return response;
		}
		
	}

	private com.xius.msp.mq.messages.notification.NotifyMessageRequest getAgentRequest(com.xius.rmsp.notify.messages.NotifyMessageRequest request, CommonHeaders headers) {
		
		if (request != null) {
			if(request.getCarrierID()!=null) {
				messageType.setNetworkId(new BigInteger(request.getCarrierID()));
				headers.setCarrierID(request.getCarrierID());
			}
			if(request.getUserName()!=null) {
				headers.setUserName(request.getUserName());
			}
			
			String syncFlag = utility.getProperty("notify.SyncFlag");
			List<String> loginDetails=utility.getCredintials(request.getCarrierID());
			
			if(loginDetails!=null) {
				if (loginDetails.get(1) == null || loginDetails.get(1).equals("")) {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("NotificationServices-LoginID is Null");
				} else {
					if (LOGGER.isDebugEnabled())
						LOGGER.info("NotificationServices-notify.loginID ::" + loginDetails.get(1));
					messageType.setLoginId(loginDetails.get(1));
				}
			
				if (loginDetails.get(2) == null || loginDetails.get(2).equals("")) {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("NotificationServices-LoginPassword is Null");
				} else {
					if (LOGGER.isDebugEnabled())
						LOGGER.info("NotificationServices-LoginPassword ::" + loginDetails.get(2));
					messageType.setLoginPassword(loginDetails.get(2));
				}
			}else {
				if (LOGGER.isErrorEnabled())
					LOGGER.error("NotificationServices-LoginDetails are Null");
			}
			
			if(syncFlag!=null) {
				if (syncFlag == null || syncFlag.equals("")) {
					if (LOGGER.isErrorEnabled())
						LOGGER.error("NotificationServices-notify.SyncFlag is Null,So setting the value to A ");
					messageType.setSyncFlag("A");
				} else {
					if (LOGGER.isDebugEnabled())
						LOGGER.info("NotificationServices-notify.SyncFlag ::" + syncFlag);
					messageType.setSyncFlag(syncFlag);
				}
			}
				
			if(request.getMessageType()!=null) {
				if(request.getMessageType().getEventReferenceCode()!=null)
					messageType.setEventReferenceCode(request.getMessageType().getEventReferenceCode());
				if(request.getMessageType().getLanguageId()!=null)
					messageType.setLanguageId(request.getMessageType().getLanguageId());
				if(request.getMessageType().getIdType()!=null)
					messageType.setIdtype(request.getMessageType().getIdType());
				if(request.getMessageType().getIdValue()!=null)
					messageType.setIdvalue(request.getMessageType().getIdValue());
				if(request.getMessageType().getMsisdn1()!=null)
					messageType.setMsisdn1(request.getMessageType().getMsisdn1());
				if(request.getMessageType().getMsisdn2()!=null)
					messageType.setMsisdn2(request.getMessageType().getMsisdn2());
				if(request.getMessageType().getAmount1()!=null)
					messageType.setAmount1(request.getMessageType().getAmount1());
				if(request.getMessageType().getAmount2()!=null)
					messageType.setAmount2(request.getMessageType().getAmount2());
				if(request.getMessageType().getDate1()!=null)
					messageType.setDate1(request.getMessageType().getDate1());
				if(request.getMessageType().getDate2()!=null)
					messageType.setDate2(request.getMessageType().getDate2());
				if(request.getMessageType().getSim1()!=null)
					messageType.setSim1(request.getMessageType().getSim1());
				if(request.getMessageType().getSim2()!=null)
					messageType.setSim2(request.getMessageType().getSim2());
				if(request.getMessageType().getUserDefined1()!=null)
					messageType.setUserDefined1(request.getMessageType().getUserDefined1());
				if(request.getMessageType().getUserDefined2()!=null)
					messageType.setUserDefined2(request.getMessageType().getUserDefined2());
				if(request.getMessageType().getUserDefined3()!=null)
					messageType.setUserDefined3(request.getMessageType().getUserDefined3());
				if(request.getMessageType().getUserDefined4()!=null)
					messageType.setUserDefined4(request.getMessageType().getUserDefined4());
				if(request.getMessageType().getUserDefined5()!=null)
					messageType.setUserDefined5(request.getMessageType().getUserDefined5());
				if(request.getMessageType().getUserDefined6()!=null)
					messageType.setUserDefined6(request.getMessageType().getUserDefined6());
				if(request.getMessageType().getUserDefined7()!=null)
					messageType.setUserDefined7(request.getMessageType().getUserDefined7());
				if(request.getMessageType().getUserDefined8()!=null)
					messageType.setUserDefined8(request.getMessageType().getUserDefined8());
				if(request.getMessageType().getDestMSISDN()!=null)
					messageType.setDestMSISDNs(request.getMessageType().getDestMSISDN());
				if(request.getMessageType().getImsi()!=null)
					messageType.setIMSIs(request.getMessageType().getImsi());
				if(request.getMessageType().getClientTransId()!=null)
					messageType.setClientTransId(request.getMessageType().getClientTransId());
				
			   agentRequest.setMessageType(messageType);
			}else {
				if(LOGGER.isErrorEnabled())
					LOGGER.error("NotificationServices-notify NotifyMessageRequest MessageType is Null");
			}
		}

		return agentRequest;
	}

}
