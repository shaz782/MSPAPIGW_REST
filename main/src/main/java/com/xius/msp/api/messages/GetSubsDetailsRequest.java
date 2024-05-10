package com.xius.msp.api.messages;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xius.rmsp.messages.CommonRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSubsDetailsRequest extends CommonRequest {
	
	@Pattern(regexp = "^(\\d{10}|\\d{12})$", message = "invalid MSISDN / MSISDN length should be 10 or 12 digits")
	@JsonProperty(value = "MSISDN", required = true)
	private String msisdn;
	

	@JsonProperty(value ="price",required = true)
	@NotNull(message="Kindly provide price")
    private BigDecimal price;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GetSubsDetailsRequest [msisdn=" + msisdn + ", price=" + price + "]";
	}
	
	
	

}
