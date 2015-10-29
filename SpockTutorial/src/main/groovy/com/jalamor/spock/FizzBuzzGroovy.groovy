package com.jalamor.spock

/**
 * FizzBuzz program prints the numbers from 1 to 100, but for multiples of three
 * it prints “Fizz” and for multiples of five it prints “Buzz”. For numbers
 * which are multiples of both three and five it prints “FizzBuzz”.
 * 
 * @author Warren Smith
 */
public class FizzBuzzGroovy {

	/**
	 * Loop from 1 to 100 and call the fizzBuzz function for each number,
	 * printing the result to the console
	 *
	 * @param args
	 */
	static void main (String... args) {
		(1..100).collect {  // Loop from 1 to 100 and for each number, collect the
			fizzBuzz(it)    // result of calling the fizzBuzz function using a closure
		}.each {println it} // then for each element in the collection, print it
	}

	/**
	 * Method fizzBuzz. 
	 * 1. initialize a place to append our results
	 * 2. if the number divides by 3 exactly, append 'Fizz'
	 * 3. if the number divides by 5 exactly, append 'Buzz'
	 * 4. if it did not divide by 3 or 5, append the number
	 * 5. return the result (either "Fizz", "Buzz", "FizzBuzz", or the number passed in)
	 * 
	 * @param number
	 * @return String
	 */
	static String fizzBuzz(num) {
		String result = num % 3 == 0 ? 'Fizz' : ''
		result += num % 5 == 0 ? 'Buzz' : ''
		result == '' ? num : result
	}
}
