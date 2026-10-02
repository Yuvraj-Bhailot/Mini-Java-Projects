package basic;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double randomNumber = Math.random() * 100;
		int number = (int) randomNumber;

		System.out.println("Guess the number between 1 to 100: ");

		while (true) {
			System.out.println("Make a guess: ");
			int guess = scanner.nextInt();

			if (guess == number) {
				System.err.println("Congrats! You Won.");
				break;
			} else if (guess > number) {
				System.out.println(guess + " is greater than number.");
			} else {
				System.out.println(guess + " is lower than number.");
			}
		}

		scanner.close();
	}
}
