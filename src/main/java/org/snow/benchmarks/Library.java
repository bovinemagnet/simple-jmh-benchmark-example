/*
 * What I am benchmarking
 */
package org.snow.benchmarks;

import java.time.Instant;
import java.util.Date;

public class Library {

	public static long computeTimeTakenMS() {
		long startTime = System.currentTimeMillis();
		return (System.currentTimeMillis() - startTime);
	}

	public static Long computeTimeTakenDate() {
		Date Start_Date = new Date();
		return (new Date().getTime() - Start_Date.getTime());
	}

	public static Long computeTimeTakenInstant() {
		Instant startTime = Instant.now();
		return (Instant.now().minusMillis(startTime.toEpochMilli()).toEpochMilli());
	}


}
