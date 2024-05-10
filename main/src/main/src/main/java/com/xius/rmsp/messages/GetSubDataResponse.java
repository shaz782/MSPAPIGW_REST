package com.xius.rmsp.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetSubDataResponse extends CommonResponse{
	
	private java.lang.String activationDate;

    private java.lang.String accountStatus;

    private java.lang.String prepaidAccountBalance;

    private java.lang.String SIM;

    private java.lang.Long IMSI;

    private java.lang.String MSISDN;

    private java.lang.String expirationDate;

    private java.lang.String cancelationDate;

    private java.lang.String graceperiod1;

    private java.lang.String graceperiod2;

    private java.lang.String USSDLangId;

    private java.lang.String USSDLangName;

    private java.lang.String IVRLangId;

    private java.lang.String IVRLangName;

    private java.lang.String validityDate;

    private java.lang.String isPorted;

    private java.lang.String postpaidAccountBalance;

    private java.lang.String idValue;

    private java.lang.String networkId;

    private java.lang.String lowBalThreshold1;

    private java.lang.String lowBalThreshold2;

    private java.lang.String lowBalThreshold3;

    private java.lang.String lowBalThreshold4;

    private java.lang.String accountType;

    private java.lang.String creditLimit;

    private java.lang.String availableCredit;

    private java.lang.Long accountID;

    private java.lang.String tpName;


	/**
	 * @return the activationDate
	 */
	public java.lang.String getActivationDate() {
		return activationDate;
	}

	/**
	 * @param activationDate the activationDate to set
	 */
	public void setActivationDate(java.lang.String activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * @return the accountStatus
	 */
	public java.lang.String getAccountStatus() {
		return accountStatus;
	}

	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(java.lang.String accountStatus) {
		this.accountStatus = accountStatus;
	}

	/**
	 * @return the prepaidAccountBalance
	 */
	public java.lang.String getPrepaidAccountBalance() {
		return prepaidAccountBalance;
	}

	/**
	 * @param prepaidAccountBalance the prepaidAccountBalance to set
	 */
	public void setPrepaidAccountBalance(java.lang.String prepaidAccountBalance) {
		this.prepaidAccountBalance = prepaidAccountBalance;
	}

	/**
	 * @return the sIM
	 */
	public java.lang.String getSIM() {
		return SIM;
	}

	/**
	 * @param sIM the sIM to set
	 */
	public void setSIM(java.lang.String sIM) {
		SIM = sIM;
	}

	/**
	 * @return the iMSI
	 */
	public java.lang.Long getIMSI() {
		return IMSI;
	}

	/**
	 * @param iMSI the iMSI to set
	 */
	public void setIMSI(java.lang.Long iMSI) {
		IMSI = iMSI;
	}

	/**
	 * @return the mSISDN
	 */
	public java.lang.String getMSISDN() {
		return MSISDN;
	}

	/**
	 * @param mSISDN the mSISDN to set
	 */
	public void setMSISDN(java.lang.String mSISDN) {
		MSISDN = mSISDN;
	}

	/**
	 * @return the expirationDate
	 */
	public java.lang.String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(java.lang.String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the cancelationDate
	 */
	public java.lang.String getCancelationDate() {
		return cancelationDate;
	}

	/**
	 * @param cancelationDate the cancelationDate to set
	 */
	public void setCancelationDate(java.lang.String cancelationDate) {
		this.cancelationDate = cancelationDate;
	}

	/**
	 * @return the graceperiod1
	 */
	public java.lang.String getGraceperiod1() {
		return graceperiod1;
	}

	/**
	 * @param graceperiod1 the graceperiod1 to set
	 */
	public void setGraceperiod1(java.lang.String graceperiod1) {
		this.graceperiod1 = graceperiod1;
	}

	/**
	 * @return the graceperiod2
	 */
	public java.lang.String getGraceperiod2() {
		return graceperiod2;
	}

	/**
	 * @param graceperiod2 the graceperiod2 to set
	 */
	public void setGraceperiod2(java.lang.String graceperiod2) {
		this.graceperiod2 = graceperiod2;
	}

	/**
	 * @return the uSSDLangId
	 */
	public java.lang.String getUSSDLangId() {
		return USSDLangId;
	}

	/**
	 * @param uSSDLangId the uSSDLangId to set
	 */
	public void setUSSDLangId(java.lang.String uSSDLangId) {
		USSDLangId = uSSDLangId;
	}

	/**
	 * @return the uSSDLangName
	 */
	public java.lang.String getUSSDLangName() {
		return USSDLangName;
	}

	/**
	 * @param uSSDLangName the uSSDLangName to set
	 */
	public void setUSSDLangName(java.lang.String uSSDLangName) {
		USSDLangName = uSSDLangName;
	}

	/**
	 * @return the iVRLangId
	 */
	public java.lang.String getIVRLangId() {
		return IVRLangId;
	}

	/**
	 * @param iVRLangId the iVRLangId to set
	 */
	public void setIVRLangId(java.lang.String iVRLangId) {
		IVRLangId = iVRLangId;
	}

	/**
	 * @return the iVRLangName
	 */
	public java.lang.String getIVRLangName() {
		return IVRLangName;
	}

	/**
	 * @param iVRLangName the iVRLangName to set
	 */
	public void setIVRLangName(java.lang.String iVRLangName) {
		IVRLangName = iVRLangName;
	}

	/**
	 * @return the validityDate
	 */
	public java.lang.String getValidityDate() {
		return validityDate;
	}

	/**
	 * @param validityDate the validityDate to set
	 */
	public void setValidityDate(java.lang.String validityDate) {
		this.validityDate = validityDate;
	}

	/**
	 * @return the isPorted
	 */
	public java.lang.String getIsPorted() {
		return isPorted;
	}

	/**
	 * @param isPorted the isPorted to set
	 */
	public void setIsPorted(java.lang.String isPorted) {
		this.isPorted = isPorted;
	}

	/**
	 * @return the postpaidAccountBalance
	 */
	public java.lang.String getPostpaidAccountBalance() {
		return postpaidAccountBalance;
	}

	/**
	 * @param postpaidAccountBalance the postpaidAccountBalance to set
	 */
	public void setPostpaidAccountBalance(java.lang.String postpaidAccountBalance) {
		this.postpaidAccountBalance = postpaidAccountBalance;
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
	 * @return the networkId
	 */
	public java.lang.String getNetworkId() {
		return networkId;
	}

	/**
	 * @param networkId the networkId to set
	 */
	public void setNetworkId(java.lang.String networkId) {
		this.networkId = networkId;
	}

	/**
	 * @return the lowBalThreshold1
	 */
	public java.lang.String getLowBalThreshold1() {
		return lowBalThreshold1;
	}

	/**
	 * @param lowBalThreshold1 the lowBalThreshold1 to set
	 */
	public void setLowBalThreshold1(java.lang.String lowBalThreshold1) {
		this.lowBalThreshold1 = lowBalThreshold1;
	}

	/**
	 * @return the lowBalThreshold2
	 */
	public java.lang.String getLowBalThreshold2() {
		return lowBalThreshold2;
	}

	/**
	 * @param lowBalThreshold2 the lowBalThreshold2 to set
	 */
	public void setLowBalThreshold2(java.lang.String lowBalThreshold2) {
		this.lowBalThreshold2 = lowBalThreshold2;
	}

	/**
	 * @return the lowBalThreshold3
	 */
	public java.lang.String getLowBalThreshold3() {
		return lowBalThreshold3;
	}

	/**
	 * @param lowBalThreshold3 the lowBalThreshold3 to set
	 */
	public void setLowBalThreshold3(java.lang.String lowBalThreshold3) {
		this.lowBalThreshold3 = lowBalThreshold3;
	}

	/**
	 * @return the lowBalThreshold4
	 */
	public java.lang.String getLowBalThreshold4() {
		return lowBalThreshold4;
	}

	/**
	 * @param lowBalThreshold4 the lowBalThreshold4 to set
	 */
	public void setLowBalThreshold4(java.lang.String lowBalThreshold4) {
		this.lowBalThreshold4 = lowBalThreshold4;
	}

	/**
	 * @return the accountType
	 */
	public java.lang.String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(java.lang.String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the creditLimit
	 */
	public java.lang.String getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(java.lang.String creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * @return the availableCredit
	 */
	public java.lang.String getAvailableCredit() {
		return availableCredit;
	}

	/**
	 * @param availableCredit the availableCredit to set
	 */
	public void setAvailableCredit(java.lang.String availableCredit) {
		this.availableCredit = availableCredit;
	}

	/**
	 * @return the accountID
	 */
	public java.lang.Long getAccountID() {
		return accountID;
	}

	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(java.lang.Long accountID) {
		this.accountID = accountID;
	}

	/**
	 * @return the tpName
	 */
	public java.lang.String getTpName() {
		return tpName;
	}

	/**
	 * @param tpName the tpName to set
	 */
	public void setTpName(java.lang.String tpName) {
		this.tpName = tpName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetSubData [activationDate=" + activationDate + ", accountStatus="
				+ accountStatus + ", prepaidAccountBalance=" + prepaidAccountBalance + ", SIM=" + SIM + ", IMSI=" + IMSI
				+ ", MSISDN=" + MSISDN + ", expirationDate=" + expirationDate + ", cancelationDate=" + cancelationDate
				+ ", graceperiod1=" + graceperiod1 + ", graceperiod2=" + graceperiod2 + ", USSDLangId=" + USSDLangId
				+ ", USSDLangName=" + USSDLangName + ", IVRLangId=" + IVRLangId + ", IVRLangName=" + IVRLangName
				+ ", validityDate=" + validityDate + ", isPorted=" + isPorted + ", postpaidAccountBalance="
				+ postpaidAccountBalance + ", idValue=" + idValue + ", networkId=" + networkId + ", lowBalThreshold1="
				+ lowBalThreshold1 + ", lowBalThreshold2=" + lowBalThreshold2 + ", lowBalThreshold3=" + lowBalThreshold3
				+ ", lowBalThreshold4=" + lowBalThreshold4 + ", accountType=" + accountType + ", creditLimit="
				+ creditLimit + ", availableCredit=" + availableCredit + ", accountID=" + accountID + ", tpName="
				+ tpName + "]";
	}
	
	
}
