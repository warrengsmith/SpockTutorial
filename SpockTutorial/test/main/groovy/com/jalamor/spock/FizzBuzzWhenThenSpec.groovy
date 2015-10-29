package com.jalamor.spock

import com.jalamor.spock.FizzBuzzJava;
import spock.lang.Specification

/**
 * Spock test to demonstrate use of 'when:' and 'then:' code blocks.
 * @author Warren Smith
 */
class FizzBuzzWhenThenSpec extends Specification {
             
         def 'FizzBuzz test for 5 expects Buzz'() {
             when: 'When 5 is passed'
             def result = FizzBuzzJava.fizzBuzz(5)
           
             then: 'expect result "Buzz"'
             result == 'Buzz'
         }
          
         def 'FizzBuzz test for 15 expects FizzBuzz'() {
             when: 'When 15 is passed'
             def result = FizzBuzzJava.fizzBuzz(15)
           
             then: 'expect result "FizzBuzz"'
             result == 'FizzBuzz'
         }
     }
