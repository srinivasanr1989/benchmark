package org.srini.benchmark.encoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationAddress {
	private String BankCode;
	private String CountryCode;
	private String LocationCode;
	private int LogicalTerminalCode;
	private String BranchCode;

	@JsonProperty("BankCode")
	public String getBankCode() {
		return BankCode;
	}

	@JsonProperty("BankCode")
	public void setBankCode(String BankCode) {
		this.BankCode = BankCode;
	}

	@JsonProperty("CountryCode")
	public String getCountryCode() {
		return CountryCode;
	}

	@JsonProperty("CountryCode")
	public void setCountryCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}

	@JsonProperty("LocationCode")
	public String getLocationCode() {
		return LocationCode;
	}

	@JsonProperty("LocationCode")
	public void setLocationCode(String LocationCode) {
		this.LocationCode = LocationCode;
	}

	@JsonProperty("LogicalTerminalCode")
	public int getLogicalTerminalCode() {
		return LogicalTerminalCode;
	}

	@JsonProperty("LogicalTerminalCode")
	public void setLogicalTerminalCode(int LogicalTerminalCode) {
		this.LogicalTerminalCode = LogicalTerminalCode;
	}

	@JsonProperty("BranchCode")
	public String getBranchCode() {
		return BranchCode;
	}

	@JsonProperty("BranchCode")
	public void setBranchCode(String BranchCode) {
		this.BranchCode = BranchCode;
	}
}
