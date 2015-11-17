package com.jalamor.spock;

import java.util.Random;

/**
 * Class MyRandom
 * @author kahwgs
 * @version 1.0
 */
public class MyRandom {

	/**
	 * Method getRandomNumber
	 * @return int
	 */
	public int getRandomNumber() {
		Random rnd = new Random();
		return rnd.nextInt(100);
	}
}
