package com.xius.rmsp.messages;

public class PackDetails {
	
	private String packName;
	private String publicityID;
	private String packType;
	private String packExpDate;
	/**
	 * @return the packName
	 */
	public String getPackName() {
		return packName;
	}
	/**
	 * @param packName the packName to set
	 */
	public void setPackName(String packName) {
		this.packName = packName;
	}
	/**
	 * @return the publicityID
	 */
	public String getPublicityID() {
		return publicityID;
	}
	/**
	 * @param publicityID the publicityID to set
	 */
	public void setPublicityID(String publicityID) {
		this.publicityID = publicityID;
	}
	/**
	 * @return the packType
	 */
	public String getPackType() {
		return packType;
	}
	/**
	 * @param packType the packType to set
	 */
	public void setPackType(String packType) {
		this.packType = packType;
	}
	/**
	 * @return the packExpDate
	 */
	public String getPackExpDate() {
		return packExpDate;
	}
	/**
	 * @param packExpDate the packExpDate to set
	 */
	public void setPackExpDate(String packExpDate) {
		this.packExpDate = packExpDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PackDetails [packName=" + packName + ", publicityID=" + publicityID + ", packType=" + packType
				+ ", packExpDate=" + packExpDate + "]";
	}
		
	
}