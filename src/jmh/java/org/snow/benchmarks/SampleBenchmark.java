package org.snow.benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class SampleBenchmark {

	@Benchmark
	public void miliseconds(Blackhole bh) {
		bh.consume(Library.computeTimeTakenMS());
	}

	@Benchmark
	public void date(Blackhole bh) {
		bh.consume(Library.computeTimeTakenDate());
	}


	@Benchmark
	public void instant(Blackhole bh) {
		bh.consume(Library.computeTimeTakenInstant());
	}

}
