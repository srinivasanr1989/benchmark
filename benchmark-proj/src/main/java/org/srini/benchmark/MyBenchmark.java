/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.srini.benchmark;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.stream.StreamResult;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.srini.benchmark.encoders.xml.SwiftMessageXml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MINUTES)
@State(Scope.Thread)
@Warmup(iterations = 2)
public class MyBenchmark {

	private JAXBContext jaxbContext;

	private Marshaller compiledMarshaller;

	private Unmarshaller compiledUnMarshaller;

	private SwiftMessageXml messageXml = new SwiftMessageXml();

	private String swiftXmlString;

	@Setup
	public void init() throws JAXBException, IOException {
		jaxbContext = JAXBContext.newInstance(SwiftMessageXml.class);
		compiledMarshaller = jaxbContext.createMarshaller();
		swiftXmlString = Files.readString(
				new File("C:\\Users\\Srinivasan\\git\\benchmark\\benchmark-proj\\src\\main\\resources\\swift.xml")
						.toPath());
		assert swiftXmlString != null;
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 5)
	public void xmlMarshall() throws JAXBException {
		StringWriter stringWriter = new StringWriter();
		StreamResult resultStream = new StreamResult(stringWriter);
		compiledMarshaller.marshal(messageXml, resultStream);
	}

	@Benchmark
	@Measurement(time = 20, timeUnit = TimeUnit.SECONDS, iterations = 5)
	public void xmlUnMarshall() throws JAXBException {
		compiledUnMarshaller.unmarshal(new StringReader(swiftXmlString));
	}

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder().include(MyBenchmark.class.getSimpleName()).forks(1).build();
		new Runner(opt).run();
	}

}
