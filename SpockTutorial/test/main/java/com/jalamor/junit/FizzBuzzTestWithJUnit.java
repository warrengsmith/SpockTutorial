package com.jalamor.junit;

import org.junit.Assert;
import org.junit.Test;

import com.jalamor.spock.FizzBuzzJava;

public class FizzBuzzTestWithJUnit {

	@Test
	public void testFizzBuzzWith3() {
		String result = FizzBuzzJava.fizzBuzz(3);
		Assert.assertEquals("Expect the word 'Fizz' to be returned", "Fizz", result);
	}
}
