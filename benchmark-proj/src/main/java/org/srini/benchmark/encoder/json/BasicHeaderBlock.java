package org.srini.benchmark.encoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicHeaderBlock {
	private String ApplicationIdentifier;
	private int ServiceIdentifier;
	private String LTAddress;
	private String SessionNumber;
	private String SequenceNumber;

	public BasicHeaderBlock() {
	}

	public BasicHeaderBlock(String applicationIdentifier, int serviceIdentifier, String lTAddress, String sessionNumber,
			String sequenceNumber) {
		super();
		ApplicationIdentifier = applicationIdentifier;
		ServiceIdentifier = serviceIdentifier;
		LTAddress = lTAddress;
		SessionNumber = sessionNumber;
		SequenceNumber = sequenceNumber;
	}

	@JsonProperty("ApplicationIdentifier")
	public String getApplicationIdentifier() {
		return ApplicationIdentifier;
	}

	@JsonProperty("ApplicationIdentifier")
	public void setApplicationIdentifier(String ApplicationIdentifier) {
		this.ApplicationIdentifier = ApplicationIdentifier;
	}

	@JsonProperty("ServiceIdentifier")
	public int getServiceIdentifier() {
		return ServiceIdentifier;
	}

	@JsonProperty("ServiceIdentifier")
	public void setServiceIdentifier(int ServiceIdentifier) {
		this.ServiceIdentifier = ServiceIdentifier;
	}

	@JsonProperty("LTAddress")
	public String getLTAddress() {
		return LTAddress;
	}

	@JsonProperty("LTAddress")
	public void setLTAddress(String LTAddress) {
		this.LTAddress = LTAddress;
	}

	@JsonProperty("SessionNumber")
	public String getSessionNumber() {
		return SessionNumber;
	}

	@JsonProperty("SessionNumber")
	public void setSessionNumber(String SessionNumber) {
		this.SessionNumber = SessionNumber;
	}

	@JsonProperty("SequenceNumber")
	public String getSequenceNumber() {
		return SequenceNumber;
	}

	@JsonProperty("SequenceNumber")
	public void setSequenceNumber(String SequenceNumber) {
		this.SequenceNumber = SequenceNumber;
	}
}
