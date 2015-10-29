package com.jalamor.spock

/**
 * FizzBuzz program prints the numbers from 1 to 100, but for multiples of three
 * it prints “Fizz” and for multiples of five it prints “Buzz”. For numbers
 * which are multiples of both three and five it prints “FizzBuzz”.
 *
 * @author Warren Smith
 */
class FizzBuzzGroovyIdiomatic {

	/**
	 * Loop from 1 to 100 and for each use a closures to print the result of evaluating the G-String, unless it's
	 * null in which case return the number (i.e. implicit it). The G-String uses ternary operators 
	 * to determine if it should append 'Fizz' or 'Buzz' or nothing to the result and String interpolation using 
	 * the ${} notation to build the G-String (the result of this could finally be null (if nothing divides exactly 
	 * by 3 or 5), 'Fizz' (if it divides by 3), 'Buzz' (if it divides by 5), or 'FizzBuzz' (if it divides by both). 
	 * It uses the Elvis operator to figure out if the result of the G-String evaluation was null and if it was it
	 * prints the number (as mentioned earlier).
	 * 
	 * @param args
	 */
    static void main (String... args) {
		(1..100).each{println "${it%3?'':'Fizz'}${it%5?'':'Buzz'}" ?: it }
    }
}
