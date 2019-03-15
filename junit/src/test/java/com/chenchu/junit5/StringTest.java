package com.chenchu.junit5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
//@Disabled
class StringTest {

	@Test
	void test() {

	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("before all");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("after all");
	}

	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("before each :" + info.getDisplayName());
	}

	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("after each :" + info.getDisplayName());
	}

	@Test
	void exceptionEexample() {
		String str = null;
		assertThrows(NullPointerException.class, () -> str.length());
	}

	@Test
	@DisplayName("lenght test")
	void lengthTest() {
		String name = "chenchu";
		assertEquals(7, name.length());
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc", "cd", "e", "aaa" })
	void patameterizedTest(String str) {
		assertTrue(str.length() > 0);
	}

	@ParameterizedTest
	@CsvSource(value = { "abc,3", "cd,2", "e,1", "aaa,3" })
	void patameterizedTest_with_CsvSource(String str, int expectedLength) {
		assertEquals(expectedLength, str.length());
	}

	@ParameterizedTest(name = "{0} length is {1}")
	@CsvSource(value = { "abc,3", "cd,2", "e,1", "aaa,3" })
	void patameterizedTest_with_CsvSource_name(String str, int expectedLength) {
		assertEquals(expectedLength, str.length());
	}

	@RepeatedTest(10)
	void repeatTest() {
		System.out.println("repeating");
	}

	@Test
	void arrayTest() {
		String name = "chenchu the star";
		assertArrayEquals(new String[] { "chenchu", "the", "star" }, name.split(" "));
	}
	@Disabled
	@Test
	void performancetest() {
		assertTimeout(Duration.ofSeconds(5), () -> Thread.sleep(1000 * 12));
	}

}
