package com.jalamor.groovy

class FizzBuzz2 {
 
    static void main (String... args) {
		(1..100).each{println "${it%3?'':'Fizz'}${it%5?'':'Buzz'}" ?: it }
    }
}
