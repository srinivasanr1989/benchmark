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

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.srini.benchmark.encoders.EncodeUtility;

import jakarta.xml.bind.JAXBException;

@BenchmarkMode({ Mode.Throughput })
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Thread)
@Warmup(iterations = 1)
@Fork(value = 3)
public class MyBenchmark {

	private EncodeUtility encodeUtility;

	@Setup
	public void init() throws IOException, JAXBException, URISyntaxException {
		encodeUtility = new EncodeUtility();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void xmlMarshall() throws IOException, JAXBException, URISyntaxException {
		encodeUtility.xmlMarshall();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void xmlUnMarshall() throws JAXBException, IOException, URISyntaxException {
		encodeUtility.xmlUnMarshall();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void avroJsonMarshall() throws IOException {
		encodeUtility.avroJsonMarshall();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void avroBinaryMarshall() throws IOException {
		encodeUtility.avroBinaryMarshall();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void avroJsonUnMarshall() throws IOException {
		encodeUtility.avroJsonUnMarshall();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void avroBinaryUnMarshall() throws IOException {
		encodeUtility.avroBinaryUnMarshall();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void jacksonJsonMarshall() throws IOException {
		encodeUtility.jacksonJsonMarshall();
	}

	@Benchmark
	@Measurement(time = 10, timeUnit = TimeUnit.SECONDS, iterations = 3)
	public void jacksonJsonUnMarshall() throws IOException {
		encodeUtility.jacksonJsonUnMarshall();
	}

	public static void main(String[] args) throws RunnerException {
		Options opt = new OptionsBuilder().include(MyBenchmark.class.getSimpleName()).forks(1).build();
		new Runner(opt).run();
	}

}
