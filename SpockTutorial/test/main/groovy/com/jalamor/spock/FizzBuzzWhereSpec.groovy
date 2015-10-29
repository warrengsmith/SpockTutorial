package com.jalamor.spock

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzWhereSpec extends Specification {

	@Unroll
    def 'FizzBuzz test for #x expects #y'() {
    
		expect: 'The correct word is returned for number divisible by 3 and 5'
        y == FizzBuzzJava.fizzBuzz(x)
          
        where:
        x  ||  y
        1  || '1'
        2  || '2'
        3  || 'Fizz'
        4  || '4'
        5  || 'Buzz'
        6  || 'Fizz'
        7  || '7'
        8  || '8'
        9  || 'Fizz'
        10 || 'Buzz'
        11 || '11'
        12 || 'Fizz'
        13 || '13'
        14 || '14'
        15 || 'FizzBuzz'
	}
}
