package org.srini.benchmark.encoders;

import java.io.IOException;
import java.io.InputStream;

import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class EncodeUtility {
	
	private Unmarshaller compiledUnMarshaller;
	
	public void xmlUnMarshall() throws JAXBException {
		try (InputStream swiftXmlFile = this.getClass().getResourceAsStream("/swift.xml")) {
			compiledUnMarshaller.unmarshal(swiftXmlFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new EncodeUtility().xmlUnMarshall();
	}


}
