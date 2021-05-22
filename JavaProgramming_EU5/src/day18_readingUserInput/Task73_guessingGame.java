package day18_readingUserInput;

import java.util.Scanner;

public class Task73_guessingGame  {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between
		 * 1-20. After every guess, the program tells the user whether their number was
		 * too large or too small. The program will keep asking the user to enter the
		 * number until he finds the correct number. When the correct answer is found,
		 * the program will display "Congrat,you got it"
		 */

		int userInput;

		int secretNumber = 8;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number between 1 and 20:");

		do {

			userInput = sc.nextInt();

			if (userInput < secretNumber) {

				System.out.println("Enter a bigger number");

			} else if (userInput > secretNumber) {
				System.out.println("Enter a lower number");
			} else {
				System.out.println("Congrat,you got it...");

			}

		} while (userInput != secretNumber);

	}
}
