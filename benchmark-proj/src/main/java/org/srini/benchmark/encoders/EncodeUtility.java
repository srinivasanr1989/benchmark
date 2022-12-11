package org.srini.benchmark.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.URISyntaxException;

import javax.xml.transform.stream.StreamResult;

import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.srini.benchmark.encoder.json.SwiftMessageJson;
import org.srini.benchmark.encoders.avro.ApplicationHeaderInputBlock;
import org.srini.benchmark.encoders.avro.BasicHeaderBlock;
import org.srini.benchmark.encoders.avro.DestinationAddress;
import org.srini.benchmark.encoders.avro.MT101;
import org.srini.benchmark.encoders.avro.SwiftMessageAvro;
import org.srini.benchmark.encoders.xml.SwiftMessageXml;

import com.fasterxml.jackson.databind.ObjectMapper;

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

	private DatumWriter<SwiftMessageAvro> writer = new SpecificDatumWriter<>(SwiftMessageAvro.class);

	private DatumReader<SwiftMessageAvro> reader = new SpecificDatumReader<>(SwiftMessageAvro.class);

	private ObjectMapper objectMapper = new ObjectMapper();

	SwiftMessageJson jsonRequest;

	SwiftMessageAvro avroRequest;

	public EncodeUtility() throws IOException, JAXBException, URISyntaxException {
		jaxbContext = JAXBContext.newInstance(SwiftMessageXml.class);
		compiledMarshaller = jaxbContext.createMarshaller();
		compiledUnMarshaller = jaxbContext.createUnmarshaller();
		jsonRequest = new SwiftMessageJson(new org.srini.benchmark.encoder.json.MT101(
				new org.srini.benchmark.encoder.json.BasicHeaderBlock("appid101", 101, "ltaddress101", "session101",
						"sequence101"),
				new org.srini.benchmark.encoder.json.ApplicationHeaderInputBlock(
						"indicator101", 1001, new org.srini.benchmark.encoder.json.DestinationAddress("bankcode101",
								"countrycode101", "locationcode101", 101, "branchlocation101"),
						"priority101", 999, 10)));
		avroRequest = new SwiftMessageAvro(
				new MT101(new BasicHeaderBlock("appid101", 101, "ltaddress101", "session101", "sequence101"),
						new ApplicationHeaderInputBlock("indicator101", 1001, new DestinationAddress("bankcode101",
								"countrycode101", "locationcode101", 101, "branchlocation101"), "priority101", 999,
								10)));
	}

	public void xmlMarshall() throws JAXBException {
		StringWriter stringWriter = new StringWriter();
		StreamResult resultStream = new StreamResult(stringWriter);
		compiledMarshaller.marshal(messageXml, resultStream);
	}

	public void xmlUnMarshall() throws JAXBException {
		swiftXmlStream = this.getClass().getResourceAsStream("/swift.xml");
		compiledUnMarshaller.unmarshal(new InputStreamReader(swiftXmlStream));
	}

	public void avroJsonMarshall() throws IOException {
		DatumWriter<SwiftMessageAvro> writer = new SpecificDatumWriter<>(SwiftMessageAvro.class);
		SwiftMessageAvro request = new SwiftMessageAvro(
				new MT101(new BasicHeaderBlock("appid101", 101, "ltaddress101", "session101", "sequence101"),
						new ApplicationHeaderInputBlock("indicator101", 1001, new DestinationAddress("bankcode101",
								"countrycode101", "locationcode101", 101, "branchlocation101"), "priority101", 999,
								10)));
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		Encoder jsonEncoder = null;
		jsonEncoder = EncoderFactory.get().jsonEncoder(SwiftMessageAvro.getClassSchema(), stream);
		writer.write(request, jsonEncoder);
		jsonEncoder.flush();
	}

	public void avroJsonUnMarshall() throws IOException {
		try (InputStream fileInputStream = this.getClass().getResourceAsStream("/swift.json")) {
			Decoder jsonDecoder = null;
			jsonDecoder = DecoderFactory.get().jsonDecoder(SwiftMessageAvro.getClassSchema(), fileInputStream);
			reader.read(null, jsonDecoder);
		}
	}

	public void avroBinaryMarshall() throws IOException {
		try (OutputStream stream = new ByteArrayOutputStream()) {
			Encoder jsonEncoder = null;
			jsonEncoder = EncoderFactory.get().binaryEncoder(stream, null);
			writer.write(avroRequest, jsonEncoder);
			jsonEncoder.flush();
		}
	}

	public void avroBinaryUnMarshall() throws IOException {
		try (InputStream fileInputStream = this.getClass().getResourceAsStream("/swift_avro_binary")) {
			Decoder jsonDecoder = null;
			jsonDecoder = DecoderFactory.get().binaryDecoder(fileInputStream, null);
			SwiftMessageAvro messageAvro = reader.read(null, jsonDecoder);
		}
	}

	public void jacksonJsonUnMarshall() throws IOException {
		try (InputStream fileInputStream = this.getClass().getResourceAsStream("/swift.json")) {
			this.objectMapper.readValue(fileInputStream, SwiftMessageJson.class);
		}
	}

	public void jacksonJsonMarshall() throws IOException {
		this.objectMapper.writeValueAsString(jsonRequest);
	}

	public static void main(String[] args) throws IOException, JAXBException, URISyntaxException {
		EncodeUtility encodeUtility = new EncodeUtility();
		encodeUtility.avroBinaryMarshall();
		encodeUtility.avroBinaryUnMarshall();
		encodeUtility.jacksonJsonMarshall();
		encodeUtility.jacksonJsonUnMarshall();
	}

}
