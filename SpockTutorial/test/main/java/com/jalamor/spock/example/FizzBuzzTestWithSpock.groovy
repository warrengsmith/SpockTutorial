package com.jalamor.spock.example;

import com.jalamor.spock.java.FizzBuzz;

import spock.lang.Specification

public class FizzBuzzTestWithSpock extends Specification {

	def'FizzBuzz test for 1'() {
		expect: '1 when 1 is passed'
		FizzBuzz.fizzBuzz(1) == '1'
	}

	def'FizzBuzz test for 3'() {
		expect: 'Fizz when 3 is passed'
		FizzBuzz.fizzBuzz(3) == 'Fizz'
	}
}
