package com.jalamor.spock

import spock.lang.Specification

class FizzBuzzRandomSpec extends Specification {

	/**
	 * FizzBuzz Stub Example
	 */
	def 'FizzBuzz Stub Example'() {
	
		given:
		Random random = Stub()
		FizzBuzzRandom fbr = new FizzBuzzRandom()
		
		when:
		def resultList = fbr.getRandomizedFizzBuzzList(random)
		
		then:
		random.nextInt(100) >> 5
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
		Random random = Mock()
		FizzBuzzRandom fbr = new FizzBuzzRandom()
		
		when:
		def resultList = fbr.getRandomizedFizzBuzzList(random)
		
		then:
		1 * random.nextInt(100) >> 5
		resultList.size() == 5
		resultList[0] == '1'
		resultList[1] == '2'
		resultList[2] == 'Fizz'
		resultList[3] == '4'
		resultList[4] == 'Buzz'
	}
}
