package com.jalamor.spock

import spock.lang.Specification

/**
 * Spock test to demonstrate use of the old() method.
 * @author Warren Smith
 */
class DemonstrateOldMethodSpec extends Specification {

	def list = ['1', '2', '3', '4']

	def 'Test that list size is 4'() {
		expect:
		list.size() == 4
	}

	def 'Add two elements to the list and expect that it now has two more than it did originally'() {
		when:
		list << '5'
		list << '6'

		then:
		list.size() == old(list.size()) + 2
	}
}
