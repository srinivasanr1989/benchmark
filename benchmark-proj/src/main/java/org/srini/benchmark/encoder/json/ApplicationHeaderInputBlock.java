package org.srini.benchmark.encoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationHeaderInputBlock {
    private String Indicator;
    private int MessageType;
    private DestinationAddress DestinationAddress;
    private String MessagePriority;
    private int DeliveryMonitoring;
    private int ObsolescencePeriod;

    @JsonProperty("Indicator")
    public String getIndicator() {
        return Indicator;
    }

    @JsonProperty("Indicator")
    public void setIndicator(String Indicator) {
        this.Indicator = Indicator;
    }

    @JsonProperty("MessageType")
    public int getMessageType() {
        return MessageType;
    }

    @JsonProperty("MessageType")
    public void setMessageType(int MessageType) {
        this.MessageType = MessageType;
    }

    @JsonProperty("DestinationAddress")
    public DestinationAddress getDestinationAddress() {
        return DestinationAddress;
    }

    @JsonProperty("DestinationAddress")
    public void setDestinationAddress(DestinationAddress DestinationAddress) {
        this.DestinationAddress = DestinationAddress;
    }

    @JsonProperty("MessagePriority")
    public String getMessagePriority() {
        return MessagePriority;
    }

    @JsonProperty("MessagePriority")
    public void setMessagePriority(String MessagePriority) {
        this.MessagePriority = MessagePriority;
    }

    @JsonProperty("DeliveryMonitoring")
    public int getDeliveryMonitoring() {
        return DeliveryMonitoring;
    }

    @JsonProperty("DeliveryMonitoring")
    public void setDeliveryMonitoring(int DeliveryMonitoring) {
        this.DeliveryMonitoring = DeliveryMonitoring;
    }

    @JsonProperty("ObsolescencePeriod")
    public int getObsolescencePeriod() {
        return ObsolescencePeriod;
    }

    @JsonProperty("ObsolescencePeriod")
    public void setObsolescencePeriod(int ObsolescencePeriod) {
        this.ObsolescencePeriod = ObsolescencePeriod;
    }
}
