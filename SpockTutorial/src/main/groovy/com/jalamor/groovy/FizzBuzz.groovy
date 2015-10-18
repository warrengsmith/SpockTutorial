package com.jalamor.groovy

public class FizzBuzzGroovy {

   static void main (String... args) {
	   (1..100).collect {  // Loop from 1 to 100 and for each number, collect the
		   fizzBuzz(it)    // result of calling the fizzBuzz function using a closure
	   }.each {println it} // then for each element in the collection, print it 
   }

   static String fizzBuzz(num) {
	   String result = num % 3 == 0 ? 'Fizz' : ''
	   result += num % 5 == 0 ? 'Buzz' : ''
	   result == '' ? num : result
   }
}
