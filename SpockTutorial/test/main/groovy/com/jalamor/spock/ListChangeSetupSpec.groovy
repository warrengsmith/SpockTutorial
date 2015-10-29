package com.jalamor.spock

import spock.lang.Specification

/**
 * Spock test to demonstrate use of 'setup:' and 'given:' code blocks as well as implicit initialization.
 * @author Warren Smith
 */
class ListChangeSetupSpec extends Specification {
      
	def 'Adding an item to a list changes its size using setup block'() {
		setup: 'an initial list with 4 items' // explicit setup block
        def list  = ['a', 'b', 'c', 'd']
  
        expect:
        list.size() == 4
  
        when: 'an element is added to the list'
        list << 'e' 
      
        then: 'expect list size to be 5'
        list.size() == 5
    }
  
    def 'Adding items to the list changes its size using given alias'() {
        given: 'that we have 4 items in a list' // explicit given alias
        def list  = ['a', 'b', 'c', 'd']
  
        expect:
        list.size() == 4
  
        when: 'an element is added to the list'
        list << 'e' 
     
        then: 'expect list size to be 5'
        list.size() == 5
    }
  
    def 'Adding items to the list changes its size using implicit setup'() {
        def list  = ['a', 'b', 'c', 'd'] // no given or setup block, just implicit setup
  
		expect:
        list.size() == 4
  
        when: 'an element is added to the list'
        list << 'e' 
      
        then: 'expected list size to be 5'
        list.size() == 5
	}
}