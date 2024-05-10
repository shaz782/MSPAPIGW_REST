package com.xius.rmsp.messages;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"carrierID","userName","userPassword"})
public class CommonRequest {
	@Pattern(regexp = "[0-9]{1,10}+", message = "invalid carrierID")
	@JsonProperty(value ="carrierID",required = true)
	@NotNull(message="Kindly provide carrierID")
	private String carrierID;
	@JsonProperty(value ="userName",required = true)
	@NotNull(message="Kindly provide userName")
	private String userName;
	@JsonProperty(value ="userPassword",required = true)
	@NotNull(message="Kindly provide userPassword")
	private String userPassword;
	/**
	 * @return the carrierID
	 */
	public String getCarrierID() {
		return carrierID;
	}
	/**
	 * @param carrierID the carrierID to set
	 */
	public void setCarrierID(String carrierID) {
		this.carrierID = carrierID;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommonRequest [carrierID=" + carrierID + ", userName=" + userName + ", userPassword=" + userPassword
				+ "]";
	}
	
	
	
	
	
}
