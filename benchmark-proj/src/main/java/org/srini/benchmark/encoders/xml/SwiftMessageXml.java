package org.srini.benchmark.encoders.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MT101")
@XmlAccessorType(XmlAccessType.FIELD) 
public class SwiftMessageXml {
	@XmlElement
	private BasicHeaderBlock BasicHeaderBlock;
	@XmlElement
	private ApplicationHeaderInputBlock ApplicationHeaderInputBlock;

	public BasicHeaderBlock getBasicHeaderBlock() {
		return BasicHeaderBlock;
	}

	public void setBasicHeaderBlock(BasicHeaderBlock BasicHeaderBlock) {
		this.BasicHeaderBlock = BasicHeaderBlock;
	}

	public ApplicationHeaderInputBlock getApplicationHeaderInputBlock() {
		return ApplicationHeaderInputBlock;
	}

	public void setApplicationHeaderInputBlock(ApplicationHeaderInputBlock ApplicationHeaderInputBlock) {
		this.ApplicationHeaderInputBlock = ApplicationHeaderInputBlock;
	}
}
