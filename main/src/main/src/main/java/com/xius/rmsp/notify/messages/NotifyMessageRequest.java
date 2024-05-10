package com.xius.rmsp.notify.messages;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class NotifyMessageRequest extends CommonRequest {
	
	@JsonProperty(value ="messageType",required = true)
	@NotNull
	private MessageType messageType;
	

	/**
	 * @return the messageType
	 */
	public MessageType getMessageType() {
		return messageType;
	}

	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
}
