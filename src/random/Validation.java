//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie:
		// http://vimeo.com/2485018

		Random randomMaker = new Random();
		for (int i = 10; i < 100; i++) {

			int randomNumber = randomMaker.nextInt(10);

			// 2. On paper, write all the numbers that get printed when you run this class
			// 10 times

			System.out.println(randomNumber);

			// 3. Use each value of randomNumber to give the user a random compliment.
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "Your are a :) person.");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "Your are a :( person.");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "Your are a :l person.");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "Your are a :P person.");
			}
			if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "Your are a :D person.");
			}
			if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "Your are a d: person.");
			}
			if (randomNumber == 6) {
				JOptionPane.showMessageDialog(null, "Your are a :c person.");
			}
			if (randomNumber == 7) {
				JOptionPane.showMessageDialog(null, "Your are a c: person.");
			}
			if (randomNumber == 8) {
				JOptionPane.showMessageDialog(null, "Your are a XD person.");
			}
			if (randomNumber == 9) {
				JOptionPane.showMessageDialog(null, "Your are a :> person.");
			}
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
