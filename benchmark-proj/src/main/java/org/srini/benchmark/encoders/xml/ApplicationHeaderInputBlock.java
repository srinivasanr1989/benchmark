package org.srini.benchmark.encoders.xml;

import jakarta.xml.bind.annotation.XmlElement;

public class ApplicationHeaderInputBlock {
	@XmlElement(defaultValue = "Indicator101")
	private String Indicator;
	@XmlElement(defaultValue = "101")
	private int MessageType;
	@XmlElement
	private DestinationAddress DestinationAddress;
	@XmlElement(defaultValue = "Priority101")
	private String MessagePriority;
	@XmlElement(defaultValue = "101")
	private int DeliveryMonitoring;
	@XmlElement(defaultValue = "101")
	private int ObsolescencePeriod;

	public String getIndicator() {
		return Indicator;
	}

	public void setIndicator(String Indicator) {
		this.Indicator = Indicator;
	}

	public int getMessageType() {
		return MessageType;
	}

	public void setMessageType(int MessageType) {
		this.MessageType = MessageType;
	}

	public DestinationAddress getDestinationAddress() {
		return DestinationAddress;
	}

	public void setDestinationAddress(DestinationAddress DestinationAddress) {
		this.DestinationAddress = DestinationAddress;
	}

	public String getMessagePriority() {
		return MessagePriority;
	}

	public void setMessagePriority(String MessagePriority) {
		this.MessagePriority = MessagePriority;
	}

	public int getDeliveryMonitoring() {
		return DeliveryMonitoring;
	}

	public void setDeliveryMonitoring(int DeliveryMonitoring) {
		this.DeliveryMonitoring = DeliveryMonitoring;
	}

	public int getObsolescencePeriod() {
		return ObsolescencePeriod;
	}

	public void setObsolescencePeriod(int ObsolescencePeriod) {
		this.ObsolescencePeriod = ObsolescencePeriod;
	}
}
