package com.jalamor.spock

import spock.lang.Specification

/**
 * Spock test to demonstrate use of 'when:' and 'then:' code blocks as well as defining
 * and adding items to a Groovy list.
 * @author Warren
 */
class ListChangeWhenThenSpec extends Specification {

	def list = ['a', 'b', 'c', 'd']
      
    def 'Initial list size should be 4'() {
		expect:
        list.size() == 4
	}

	def'Adding items to the list changes its size'() {
		when: 'Four elements are added to the list'
        list.add('e') // Java like syntax
        list.add 'f' // dropping unnecessary parentheses
        list.add "g" // using double quotes
        list << 'h' // using Groovy overloaded left shift operator 
      
		then: 'expected size is 8'
        list.size() == 8
    }
}
