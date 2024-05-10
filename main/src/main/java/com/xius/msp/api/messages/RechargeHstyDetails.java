package com.xius.msp.api.messages;

public class RechargeHstyDetails {

	private String Date;
	private String amount;
	private String userName;
	private String remarks;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return Date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		Date = date;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
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
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RechargeHstyDetails [Date=" + Date + ", amount=" + amount + ", userName=" + userName + ", remarks="
				+ remarks + ", status=" + status + ", getStatus()=" + getStatus() + ", getDate()=" + getDate()
				+ ", getAmount()=" + getAmount() + ", getUserName()=" + getUserName() + ", getRemarks()=" + getRemarks()
				+ "]";
	}
	 
	
	
}
