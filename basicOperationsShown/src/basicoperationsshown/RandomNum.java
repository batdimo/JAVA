/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperationsshown;

import java.util.Random;

/**
 *
 * @author DIMO
 */
public class RandomNum {
    

	public static void main(String[] args) {
		System.out.println("This program generates and prints 10 random values in given range(in the example: 100-200)");
		for (int i = 0; i < 10; i++) {
			System.out.println(getRandomNumberInRange(100, 200));
		}

	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}

