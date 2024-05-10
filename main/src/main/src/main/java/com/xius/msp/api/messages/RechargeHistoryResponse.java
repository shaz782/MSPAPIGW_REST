package com.xius.msp.api.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.xius.rmsp.messages.CommonResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RechargeHistoryResponse extends CommonResponse {
	
	private String MSISDN;
	private List<RechargeHstyDetails> rechargeDetails;
	
	/**
	 * @return the mSISDN
	 */
	public String getMSISDN() {
		return MSISDN;
	}
	/**
	 * @param mSISDN the mSISDN to set
	 */
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	/**
	 * @return the rechargeDetails
	 */
	public List<RechargeHstyDetails> getRechargeDetails() {
		return rechargeDetails;
	}
	/**
	 * @param rechargeDetails the rechargeDetails to set
	 */
	public void setRechargeDetails(List<RechargeHstyDetails> rechargeDetails) {
		this.rechargeDetails = rechargeDetails;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RechargeHistoryResponse [MSISDN=" + MSISDN + ", rechargeDetails=" + rechargeDetails + "]";
	}
	
	
	
}