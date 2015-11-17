package com.jalamor.spock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FizzBuzzRandom {

	/**
	 * Loop from 1 to 100 and call the fizzBuzz function for each number,
	 * printing the result to the console
	 * @param args
	 */
	public static void main(String args[]) {
		FizzBuzzRandom fbr = new FizzBuzzRandom();
		System.out.println(fbr.getRandomizedFizzBuzzList(new Random()));
	}

	/**
	 * Method getRandomizedFizzBuzzList.
	 *
	 * @return List<String>
	 */
	public List<String> getRandomizedFizzBuzzList(Random random) {
		List<String> fizzBuzzList = new ArrayList<>();
		int max = random.nextInt(100);
		for (int number = 1; number <= max; number++) {
			fizzBuzzList.add(fizzBuzz(number)); 
		}
		return fizzBuzzList;
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
	public String fizzBuzz(final int number) {
		StringBuilder result = new StringBuilder();
		result.append((number % 3 == 0) ? "Fizz" : "");
		result.append((number % 5 == 0) ? "Buzz" : "");
		result.append((result.length() == 0) ? number : "");
		return result.toString();
	}	

}
