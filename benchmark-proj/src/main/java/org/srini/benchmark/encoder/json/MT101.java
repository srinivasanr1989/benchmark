package org.srini.benchmark.encoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MT101 {
	private BasicHeaderBlock BasicHeaderBlock;
	private ApplicationHeaderInputBlock ApplicationHeaderInputBlock;

	public MT101() {
	}

	public MT101(org.srini.benchmark.encoder.json.BasicHeaderBlock basicHeaderBlock,
			org.srini.benchmark.encoder.json.ApplicationHeaderInputBlock applicationHeaderInputBlock) {
		super();
		BasicHeaderBlock = basicHeaderBlock;
		ApplicationHeaderInputBlock = applicationHeaderInputBlock;
	}

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
