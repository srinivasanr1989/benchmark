package org.srini.benchmark.encoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SwiftMessageJson {

	public SwiftMessageJson() {
	}

	public SwiftMessageJson(org.srini.benchmark.encoder.json.MT101 mT101) {
		super();
		MT101 = mT101;
	}

	private MT101 MT101;

	@JsonProperty("MT101")
	public MT101 getMT101() {
		return MT101;
	}

	@JsonProperty("MT101")
	public void setMT101(MT101 MT101) {
		this.MT101 = MT101;
	}
}
