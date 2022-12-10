package org.srini.benchmark.encoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MT101 {
    private BasicHeaderBlock BasicHeaderBlock;
    private ApplicationHeaderInputBlock ApplicationHeaderInputBlock;

    @JsonProperty("BasicHeaderBlock")
    public BasicHeaderBlock getBasicHeaderBlock() {
        return BasicHeaderBlock;
    }

    @JsonProperty("BasicHeaderBlock")
    public void setBasicHeaderBlock(BasicHeaderBlock BasicHeaderBlock) {
        this.BasicHeaderBlock = BasicHeaderBlock;
    }

    @JsonProperty("ApplicationHeaderInputBlock")
    public ApplicationHeaderInputBlock getApplicationHeaderInputBlock() {
        return ApplicationHeaderInputBlock;
    }

    @JsonProperty("ApplicationHeaderInputBlock")
    public void setApplicationHeaderInputBlock(ApplicationHeaderInputBlock ApplicationHeaderInputBlock) {
        this.ApplicationHeaderInputBlock = ApplicationHeaderInputBlock;
    }
}
