package org.srini.benchmark.encoders.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD) 
public class BasicHeaderBlock {
	@XmlElement(defaultValue = "AppID101")
	private String ApplicationIdentifier;
	@XmlElement(defaultValue = "SrvID101")
	private int ServiceIdentifier;
	@XmlElement(defaultValue = "LTAdress101")
	private String LTAddress;
	@XmlElement(defaultValue = "SessionNumber101")
	private String SessionNumber;
	@XmlElement(defaultValue = "SequenceNumber101")
	private String SequenceNumber;

	public String getApplicationIdentifier() {
		return ApplicationIdentifier;
	}

	public void setApplicationIdentifier(String ApplicationIdentifier) {
		this.ApplicationIdentifier = ApplicationIdentifier;
	}

	public int getServiceIdentifier() {
		return ServiceIdentifier;
	}

	public void setServiceIdentifier(int ServiceIdentifier) {
		this.ServiceIdentifier = ServiceIdentifier;
	}

	public String getLTAddress() {
		return LTAddress;
	}

	public void setLTAddress(String LTAddress) {
		this.LTAddress = LTAddress;
	}

	public String getSessionNumber() {
		return SessionNumber;
	}

	public void setSessionNumber(String SessionNumber) {
		this.SessionNumber = SessionNumber;
	}

	public String getSequenceNumber() {
		return SequenceNumber;
	}

	public void setSequenceNumber(String SequenceNumber) {
		this.SequenceNumber = SequenceNumber;
	}
}
