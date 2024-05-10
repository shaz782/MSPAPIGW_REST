package com.xius.rmsp.utilities;

public class MSPAPIGWConstants {
	static MSPAPIGWConstants constObj = new MSPAPIGWConstants();

	private MSPAPIGWConstants() {
	};

	public static Object classObject() {
		return constObj;
	}

	public static final String INTERNAL_SERVER_ERROR = "40000";
	public static final String OTHER_EXCEPTION_CODE = "40001";
	public static final String CONNECTION_TIME_OUT_MSG = "CONNECTION TIME OUT";
	public static final String INTERNAL_SERVER_ERROR_MSG = "INTERNAL SERVER ERROR";

	public static final String REQUEST_CAN_NOT_BE_NULL = "REQUEST CAN NOT BE NULL";
	public static final String SUCCESS_RESPONSE_CODE = "0";
	public static final String SUCCESS_RESPONSE_STATUS_CODE = "0";
	public static final String SUCCESS = "SUCCESS";
	public static final String FAILURE = "FAILURE";

	public static final String ERROR_RESPONSE_STATUS_CODE = "1";
	public static final String ERROR = "ERROR";

	public static final String IN_SEC = " in Sec";

	// PRIVILEGES ID'S FOR THE APIS ARE AS FOLLOWS
	public static final String getAccountDetails = "P9000";
	public static final String getRemainingUnitDetails = "P9001";
	public static final String getSubBillingDetails = "P9002";
	public static final String getSubDetailsbyActStatus = "P9003";
	public static final String getSubDemographicDetails = "P9004";
	public static final String getSubCoreBalance = "P9005";
	public static final String purchasePack = "P9006";
	public static final String updateDemographicDetails = "P9007";
	public static final String getActivePacks = "P9008";
	public static final String rechargeWithCC = "P9009";
	public static final String purchasePackWithCC = "P9010";
	public static final String debitAccount = "P9011";
	public static final String deactivatePack = "P9012";
	public static final String getLoan = "P9013";
	public static final String giftPack = "P9014";
	public static final String unRecoveredLoanDetails = "P9015";
	public static final String simSwap = "P9016";
	public static final String getReActDeActReasons = "P9017";
	public static final String suspendAccount = "P9018";
	public static final String reActivateAccount = "P9019";
	public static final String notification = "P9020";
	public static final String notify = "P9021";

	public static final String IN_VALID_PASSWORD_CODE = "40002";
	public static final String IN_VALID_PASSWORD_MSG = "In Valid Password,Provide Base64 Value";
	public static final String IN_VALID_NETWORK_CODE = "40003";
	public static final String IN_VALID_NETWORK_MSG = "In Valid NetworkName,Provide Base64 Value";
	public static final String IN_VALID_REQUEST = "40004";
	public static final String IN_VALID_REQUEST_MSG = "In Valid Request Provided";
}
