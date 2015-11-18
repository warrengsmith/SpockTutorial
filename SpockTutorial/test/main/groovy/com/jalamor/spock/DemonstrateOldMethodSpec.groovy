package com.jalamor.spock

import spock.lang.Specification

/**
 * Spock test to demonstrate use of the old() method.
 * @author Warren Smith
 */
class DemonstrateOldMethodSpec extends Specification {

	def 'Add two elements to the list and expect that it now has two more than it did originally'() {
		
		setup: 'Create initial list with 4 elements'
		def list = ['1', '2', '3', '4']
		
		expect: 'expect list size is 4'
		list.size() == 4
		
		when: 'we add two elements to the list'
		list << '5'
		list << '6'

		then: 'list size is 2 more than it was before'
		list.size() == old(list.size()) + 2
	}
}
