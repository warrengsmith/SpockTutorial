package com.jalamor.spock

import spock.lang.Specification

/**
 * Spock test class FizzBuzzRandomSpec
 * @author kahwgs
 * @version 1.0
 */
class FizzBuzzRandomSpec extends Specification {

	/**
	 * FizzBuzz Stub Example
	 */
	def 'FizzBuzz Stub Example'() {
	
		given:
		MyRandom myRandom = Stub()
		FizzBuzzRandom fbr = new FizzBuzzRandom(myRandom)
		
		when:
		def resultList = fbr.getRandomizedFizzBuzzList()
		
		then:
		myRandom.getRandomNumber() >> 5
		resultList.size() == 5
		resultList[0] == '1'
		resultList[1] == '2'
		resultList[2] == 'Fizz' 
		resultList[3] == '4'
		resultList[4] == 'Buzz'
	}
	
	/**
	 * Method FizzBuzz Mock Example
	 */
	def 'FizzBuzz Mock Example'() {
		
		given:
		MyRandom myRandom = Mock()
		FizzBuzzRandom fbr = new FizzBuzzRandom(myRandom)
		
		when:
		def resultList = fbr.getRandomizedFizzBuzzList()
		
		then:
		1 * myRandom.getRandomNumber() >> 5
		resultList.size() == 5
		resultList[0] == '1'
		resultList[1] == '2'
		resultList[2] == 'Fizz'
		resultList[3] == '4'
		resultList[4] == 'Buzz'
	}
}
