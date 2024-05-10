package com.xius.rmsp.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 	
public class GetRemainingUnitDetailsResponse extends CommonResponse{
	
	//private String publicityID;
	private String packvalidity;
	private List<BenefitDtlsType> benefitDtlsType;
	@JsonProperty(value ="accountID")
	private String accountId;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/*public String getPublicityID() {
		return publicityID;
	}
	public void setPublicityID(String publicityID) {
		this.publicityID = publicityID;
	}*/
	public String getPackvalidity() {
		return packvalidity;
	}
	public void setPackvalidity(String packvalidity) {
		this.packvalidity = packvalidity;
	}
	
	/**
	 * @return the benefitDtlsType
	 */
	public List<BenefitDtlsType> getBenefitDtlsType() {
		return benefitDtlsType;
	}
	/**
	 * @param benefitDtlsType the benefitDtlsType to set
	 */
	public void setBenefitDtlsType(List<BenefitDtlsType> benefitDtlsType) {
		this.benefitDtlsType = benefitDtlsType;
	}
	@Override
	public String toString() {
		return "GetRemainingUnitDetailsResponse [packvalidity=" + packvalidity
				+ ", benefitDtlsType=" + benefitDtlsType + ", accountId=" + accountId + "]";
	}
	
	
	
}