package com.jalamor.spock.example;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.jalamor.spock.java.FizzBuzz;

/**
 * Example of a JUnit parameterized test
 * 
 * @author Warren Smith
 * @version 1.0
 */
@RunWith(Parameterized.class)
public class FizzBuzzParameterizedTest {

	/** Hold the expected result for the test */
	private transient final String expected;

	/** Hold the input for the test */
	private transient final int input;

	/**
	 * Set up a collection of inputs and expected results
	 * 
	 * @return Collection<Object[]>
	 */
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ 1, "1" }, 
			{ 2, "2" }, 
			{ 3, "Fizz" }, 
			{ 4, "4" }, 
			{ 5, "Buzz" } 
		});
	}

	/**
	 * Construct the test case using input and expected value from the
	 * collection
	 * 
	 * @param input
	 * @param expected
	 */
	public FizzBuzzParameterizedTest(final int input, final String expected) {
		this.input = input;
		this.expected = expected;
	}

	/**
	 * Run the test and make assertion
	 */
	@Test
	public void test() {
		assertEquals(expected, FizzBuzz.fizzBuzz(input));
	}
}
