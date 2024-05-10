package com.xius.rmsp.notify.messages;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageType {
	
		@JsonProperty(value ="eventReferenceCode",required = true)
		@NotNull
	    private java.lang.String eventReferenceCode;
	    private java.math.BigInteger languageId;
	    private java.math.BigInteger idType;
	    private java.lang.String idValue;
	    @JsonProperty(value ="MSISDN1")
	    private java.lang.Long msisdn1;
	    @JsonProperty(value ="MSISDN2")
	    private java.lang.Long msisdn2;
	    private java.math.BigDecimal amount1;
	    private java.math.BigDecimal amount2;
	    private java.lang.String orderNumber;
	    private java.util.Date date1;
	    private java.util.Date date2;
	    @JsonProperty(value ="SIM1")
	    private java.lang.String sim1;
	    @JsonProperty(value ="SIM2")
	    private java.lang.String sim2;
	    private java.lang.String userDefined1;
	    private java.lang.String userDefined2;
	    private java.lang.String userDefined3;
	    private java.lang.String userDefined4;
	    private java.lang.String userDefined5;
	    private java.lang.String userDefined6;
	    private java.lang.String userDefined7;
	    private java.lang.String userDefined8;
	    private java.lang.String destMSISDN;
	    @JsonProperty(value ="IMSI")
	    private java.lang.String imsi;
	    private java.lang.String clientTransId;
		/**
		 * @return the eventReferenceCode
		 */
		public java.lang.String getEventReferenceCode() {
			return eventReferenceCode;
		}
		/**
		 * @param eventReferenceCode the eventReferenceCode to set
		 */
		public void setEventReferenceCode(java.lang.String eventReferenceCode) {
			this.eventReferenceCode = eventReferenceCode;
		}
		/**
		 * @return the languageId
		 */
		public java.math.BigInteger getLanguageId() {
			return languageId;
		}
		/**
		 * @param languageId the languageId to set
		 */
		public void setLanguageId(java.math.BigInteger languageId) {
			this.languageId = languageId;
		}
		/**
		 * @return the idType
		 */
		public java.math.BigInteger getIdType() {
			return idType;
		}
		/**
		 * @param idType the idType to set
		 */
		public void setIdType(java.math.BigInteger idType) {
			this.idType = idType;
		}
		/**
		 * @return the idValue
		 */
		public java.lang.String getIdValue() {
			return idValue;
		}
		/**
		 * @param idValue the idValue to set
		 */
		public void setIdValue(java.lang.String idValue) {
			this.idValue = idValue;
		}
		/**
		 * @return the msisdn1
		 */
		public java.lang.Long getMsisdn1() {
			return msisdn1;
		}
		/**
		 * @param msisdn1 the msisdn1 to set
		 */
		public void setMsisdn1(java.lang.Long msisdn1) {
			this.msisdn1 = msisdn1;
		}
		/**
		 * @return the msisdn2
		 */
		public java.lang.Long getMsisdn2() {
			return msisdn2;
		}
		/**
		 * @param msisdn2 the msisdn2 to set
		 */
		public void setMsisdn2(java.lang.Long msisdn2) {
			this.msisdn2 = msisdn2;
		}
		/**
		 * @return the amount1
		 */
		public java.math.BigDecimal getAmount1() {
			return amount1;
		}
		/**
		 * @param amount1 the amount1 to set
		 */
		public void setAmount1(java.math.BigDecimal amount1) {
			this.amount1 = amount1;
		}
		/**
		 * @return the amount2
		 */
		public java.math.BigDecimal getAmount2() {
			return amount2;
		}
		/**
		 * @param amount2 the amount2 to set
		 */
		public void setAmount2(java.math.BigDecimal amount2) {
			this.amount2 = amount2;
		}
		/**
		 * @return the orderNumber
		 */
		public java.lang.String getOrderNumber() {
			return orderNumber;
		}
		/**
		 * @param orderNumber the orderNumber to set
		 */
		public void setOrderNumber(java.lang.String orderNumber) {
			this.orderNumber = orderNumber;
		}
		/**
		 * @return the date1
		 */
		public java.util.Date getDate1() {
			return date1;
		}
		/**
		 * @param date1 the date1 to set
		 */
		public void setDate1(java.util.Date date1) {
			this.date1 = date1;
		}
		/**
		 * @return the date2
		 */
		public java.util.Date getDate2() {
			return date2;
		}
		/**
		 * @param date2 the date2 to set
		 */
		public void setDate2(java.util.Date date2) {
			this.date2 = date2;
		}
		/**
		 * @return the sim1
		 */
		public java.lang.String getSim1() {
			return sim1;
		}
		/**
		 * @param sim1 the sim1 to set
		 */
		public void setSim1(java.lang.String sim1) {
			this.sim1 = sim1;
		}
		/**
		 * @return the sim2
		 */
		public java.lang.String getSim2() {
			return sim2;
		}
		/**
		 * @param sim2 the sim2 to set
		 */
		public void setSim2(java.lang.String sim2) {
			this.sim2 = sim2;
		}
		/**
		 * @return the userDefined1
		 */
		public java.lang.String getUserDefined1() {
			return userDefined1;
		}
		/**
		 * @param userDefined1 the userDefined1 to set
		 */
		public void setUserDefined1(java.lang.String userDefined1) {
			this.userDefined1 = userDefined1;
		}
		/**
		 * @return the userDefined2
		 */
		public java.lang.String getUserDefined2() {
			return userDefined2;
		}
		/**
		 * @param userDefined2 the userDefined2 to set
		 */
		public void setUserDefined2(java.lang.String userDefined2) {
			this.userDefined2 = userDefined2;
		}
		/**
		 * @return the userDefined3
		 */
		public java.lang.String getUserDefined3() {
			return userDefined3;
		}
		/**
		 * @param userDefined3 the userDefined3 to set
		 */
		public void setUserDefined3(java.lang.String userDefined3) {
			this.userDefined3 = userDefined3;
		}
		/**
		 * @return the userDefined4
		 */
		public java.lang.String getUserDefined4() {
			return userDefined4;
		}
		/**
		 * @param userDefined4 the userDefined4 to set
		 */
		public void setUserDefined4(java.lang.String userDefined4) {
			this.userDefined4 = userDefined4;
		}
		/**
		 * @return the userDefined5
		 */
		public java.lang.String getUserDefined5() {
			return userDefined5;
		}
		/**
		 * @param userDefined5 the userDefined5 to set
		 */
		public void setUserDefined5(java.lang.String userDefined5) {
			this.userDefined5 = userDefined5;
		}
		/**
		 * @return the userDefined6
		 */
		public java.lang.String getUserDefined6() {
			return userDefined6;
		}
		/**
		 * @param userDefined6 the userDefined6 to set
		 */
		public void setUserDefined6(java.lang.String userDefined6) {
			this.userDefined6 = userDefined6;
		}
		/**
		 * @return the userDefined7
		 */
		public java.lang.String getUserDefined7() {
			return userDefined7;
		}
		/**
		 * @param userDefined7 the userDefined7 to set
		 */
		public void setUserDefined7(java.lang.String userDefined7) {
			this.userDefined7 = userDefined7;
		}
		/**
		 * @return the userDefined8
		 */
		public java.lang.String getUserDefined8() {
			return userDefined8;
		}
		/**
		 * @param userDefined8 the userDefined8 to set
		 */
		public void setUserDefined8(java.lang.String userDefined8) {
			this.userDefined8 = userDefined8;
		}
		/**
		 * @return the destMSISDN
		 */
		public java.lang.String getDestMSISDN() {
			return destMSISDN;
		}
		/**
		 * @param destMSISDN the destMSISDN to set
		 */
		public void setDestMSISDN(java.lang.String destMSISDN) {
			this.destMSISDN = destMSISDN;
		}
		/**
		 * @return the imsi
		 */
		public java.lang.String getImsi() {
			return imsi;
		}
		/**
		 * @param imsi the imsi to set
		 */
		public void setImsi(java.lang.String imsi) {
			this.imsi = imsi;
		}
		/**
		 * @return the clientTransId
		 */
		public java.lang.String getClientTransId() {
			return clientTransId;
		}
		/**
		 * @param clientTransId the clientTransId to set
		 */
		public void setClientTransId(java.lang.String clientTransId) {
			this.clientTransId = clientTransId;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "MessageType [eventReferenceCode=" + eventReferenceCode + ", languageId=" + languageId + ", idType="
					+ idType + ", idValue=" + idValue + ", msisdn1=" + msisdn1 + ", msisdn2=" + msisdn2 + ", amount1="
					+ amount1 + ", amount2=" + amount2 + ", orderNumber=" + orderNumber + ", date1=" + date1
					+ ", date2=" + date2 + ", sim1=" + sim1 + ", sim2=" + sim2 + ", userDefined1=" + userDefined1
					+ ", userDefined2=" + userDefined2 + ", userDefined3=" + userDefined3 + ", userDefined4="
					+ userDefined4 + ", userDefined5=" + userDefined5 + ", userDefined6=" + userDefined6
					+ ", userDefined7=" + userDefined7 + ", userDefined8=" + userDefined8 + ", destMSISDN=" + destMSISDN
					+ ", imsi=" + imsi + ", clientTransId=" + clientTransId + "]";
		}
	    
	    
	    
	    
		
}