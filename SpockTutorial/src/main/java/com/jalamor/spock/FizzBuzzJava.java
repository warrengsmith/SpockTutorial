package com.jalamor.spock;

/**
 * FizzBuzz program prints the numbers from 1 to 100, but for multiples of three
 * it prints “Fizz” and for multiples of five it prints “Buzz”. For numbers
 * which are multiples of both three and five it prints “FizzBuzz”.
 * 
 * @author Warren Smith
 */
public class FizzBuzzJava {

	/**
	 * Loop from 1 to 100 and call the fizzBuzz function for each number,
	 * printing the result to the console
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		for (int number = 1; number <= 100; number++) {
			System.out.println(fizzBuzz(number)); 
		}
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
	public static String fizzBuzz(final int number) {
		StringBuilder result = new StringBuilder();
		result.append((number % 3 == 0) ? "Fizz" : "");
		result.append((number % 5 == 0) ? "Buzz" : "");
		result.append((result.length() == 0) ? number : "");
		return result.toString();
	}
}
