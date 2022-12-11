package org.srini.benchmark.encoders;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.xml.transform.stream.StreamResult;

import org.srini.benchmark.encoders.xml.SwiftMessageXml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class EncodeUtility {

	private JAXBContext jaxbContext;

	private Marshaller compiledMarshaller;

	private Unmarshaller compiledUnMarshaller;

	private SwiftMessageXml messageXml = new SwiftMessageXml();

	private InputStream swiftXmlStream;

	public EncodeUtility() throws IOException, JAXBException, URISyntaxException {
		jaxbContext = JAXBContext.newInstance(SwiftMessageXml.class);
		compiledMarshaller = jaxbContext.createMarshaller();
		compiledUnMarshaller = jaxbContext.createUnmarshaller();
		swiftXmlStream = this.getClass().getResourceAsStream("/swift.xml");
		assert swiftXmlStream != null;
	}

	public void xmlMarshall() throws JAXBException {
		StringWriter stringWriter = new StringWriter();
		StreamResult resultStream = new StreamResult(stringWriter);
		compiledMarshaller.marshal(messageXml, resultStream);
	}

	public void xmlUnMarshall() throws JAXBException {
		compiledUnMarshaller.unmarshal(new InputStreamReader(swiftXmlStream));
	}

	public static void main(String[] args) throws IOException, JAXBException, URISyntaxException {
		EncodeUtility encodeUtility = new EncodeUtility();
	}

}
