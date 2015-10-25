package com.jalamor.junit.example;

import org.junit.Assert;
import org.junit.Test;

import com.jalamor.spock.java.FizzBuzz;

public class FizzBuzzTestWithJUnit {

	@Test
	public void testFizzBuzzWith3() {
		String result = FizzBuzz.fizzBuzz(3);
		Assert.assertEquals("Expect the word 'Fizz' to be returned", "Fizz", result);
	}
}
