package com.jalamor.spock

import spock.lang.Specification

/**
 * Spock test class FizzBuzzRandomSpec
 * @author kahwgs
 * @version 1.0
 */
class FizzBuzzRandomInjectedSpec extends Specification {

	/**
	 * FizzBuzz Stub example allows us to have a stubbed (i.e. stand in replacement) for MyRandom class.
	 */
	def 'FizzBuzz Stub Example'() {
	
		given: 'that getRandomNumber expects any number as an argument and returns 5'
		MyRandom myRandom = Stub()
		myRandom.getRandomNumber(_) >> 5 	// the underscore is a wildcard for any single argument (including null)
											// >> 5 denotes that this call will always return 5 for this test
		FizzBuzzRandomInjected fbr = new FizzBuzzRandomInjected(myRandom)
		
		when: 'getRandomizedFizzBuzzList is called'
		def resultList = fbr.getRandomizedFizzBuzzList()
		
		then: 'the final list should have 5 elements'
		resultList.size() == 5
		resultList[0] == '1'
		resultList[1] == '2'
		resultList[2] == 'Fizz' 
		resultList[3] == '4'
		resultList[4] == 'Buzz'
	}
	
	/**
	 * Method FizzBuzz Mock example allows us to have a mock, which is similar to a stub, but allows us to also check cardinality.
	 */
	def 'FizzBuzz Mock Example for 15 elements'() {
		
		given: 'that getRandomNumber expects 100 as an argument and returns 15'
		MyRandom myRandom = Mock()
		1 * myRandom.getRandomNumber(100) >> 15 // 1 * denotes exactly 1 call (i.e. cardinality
												// (100) denotes that it expects 100 as an argument
												// >> 15 denotes that this call will always return 15 for this test
		FizzBuzzRandomInjected fbr = new FizzBuzzRandomInjected(myRandom)
		
		when: 'getRandomizedFizzBuzzList is called'
		def resultList = fbr.getRandomizedFizzBuzzList()
		
		then: 'the final list should have 15 elements'
		resultList.size() == 15
		resultList[0] == '1'
		resultList[1] == '2'
		resultList[2] == 'Fizz'
		resultList[3] == '4'
		resultList[4] == 'Buzz'
		resultList[14] == 'FizzBuzz'
	}
}
