package com.xius.rmsp.messages;

import org.springframework.stereotype.Component;

@Component
public class CommonHeaders {

	private String carrierID;
	private String userName;
	private String userPassword;
	
	public String getCarrierID() {
		return carrierID;
	}
	public void setCarrierID(String carrierID) {
		this.carrierID = carrierID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	@Override
	public String toString() {
		return "CommonHeaders [carrierID=" + carrierID + ", userName=" + userName + ", userPassword=" + userPassword
				+ "]";
	}
	
	
}
