package com.xius.rmsp.messages;

import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class RechargeWithCCRequest extends CommonRequest{

		@Pattern(regexp = "[0-9]{1,20}+", message = "invalid MSISDN")
		@JsonProperty(value ="MSISDN",required = true)
		private String msisdn;
	    private String rcCode;
	    private String rechargeAmount;
	    private String transId;
	    private String reason;
	    
	    @Pattern(regexp = "[0-9]{1,20}+", message = "invalid accountID")
		@JsonProperty(value ="accountID",required = true)
		private String accountId;
	    
	  //authorizationID added for YF Syeystem CreditCard Payment InvoiceID
		@JsonProperty(value ="authorizationID",required = true)
		private String authorizationID;

		/**
		 * @return the msisdn
		 */
		public String getMsisdn() {
			return msisdn;
		}

		/**
		 * @param msisdn the msisdn to set
		 */
		public void setMsisdn(String msisdn) {
			this.msisdn = msisdn;
		}

		/**
		 * @return the rcCode
		 */
		public String getRcCode() {
			return rcCode;
		}

		/**
		 * @param rcCode the rcCode to set
		 */
		public void setRcCode(String rcCode) {
			this.rcCode = rcCode;
		}

		/**
		 * @return the rechargeAmount
		 */
		public String getRechargeAmount() {
			return rechargeAmount;
		}

		/**
		 * @param rechargeAmount the rechargeAmount to set
		 */
		public void setRechargeAmount(String rechargeAmount) {
			this.rechargeAmount = rechargeAmount;
		}

		/**
		 * @return the transId
		 */
		public String getTransId() {
			return transId;
		}

		/**
		 * @param transId the transId to set
		 */
		public void setTransId(String transId) {
			this.transId = transId;
		}

		/**
		 * @return the reason
		 */
		public String getReason() {
			return reason;
		}

		/**
		 * @param reason the reason to set
		 */
		public void setReason(String reason) {
			this.reason = reason;
		}

		/**
		 * @return the accountId
		 */
		public String getAccountId() {
			return accountId;
		}

		/**
		 * @param accountId the accountId to set
		 */
		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		/**
		 * @return the authorizationID
		 */
		public String getAuthorizationID() {
			return authorizationID;
		}

		/**
		 * @param authorizationID the authorizationID to set
		 */
		public void setAuthorizationID(String authorizationID) {
			this.authorizationID = authorizationID;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "RechargeWithCCRequest [msisdn=" + msisdn + ", rcCode=" + rcCode + ", rechargeAmount="
					+ rechargeAmount + ", transId=" + transId + ", reason=" + reason + ", accountId=" + accountId
					+ ", authorizationID=" + authorizationID + "]";
		}

		   
		
}