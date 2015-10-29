package com.jalamor.spock;

import com.jalamor.spock.FizzBuzzJava;
import spock.lang.Specification

/**
 * Spock test to demonstrate use of the 'expect:' code block.
 * @author Warren Smith
 */
public class FizzBuzzExpectSpec extends Specification {

	def 'FizzBuzz test for 1'() {
		expect: 'FizzBuzz should return 1 when 1 is passed'
		FizzBuzzJava.fizzBuzz(1) == '1'
	}

	def 'FizzBuzz test for 3'() {
		expect: 'FizzBuzz should return Fizz when 3 is passed'
		FizzBuzzJava.fizzBuzz(3) == 'Fizz'
	}
}
