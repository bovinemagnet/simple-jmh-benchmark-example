/*
 * Simple test.
 */
package org.snow.benchmarks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
	@Test
	void milisecondsTest() {
		Library classUnderTest = new Library();
		assertNotNull(classUnderTest.computeTimeTakenMS());
	}

	@Test
	void dateTest() {
		Library classUnderTest = new Library();
		assertNotNull(classUnderTest.computeTimeTakenDate());
	}

	@Test
	void instantTest() {
		Library classUnderTest = new Library();
		assertNotNull(classUnderTest.computeTimeTakenInstant());
	}

}
