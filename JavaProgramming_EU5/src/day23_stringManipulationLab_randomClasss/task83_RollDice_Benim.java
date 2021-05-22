package day23_stringManipulationLab_randomClasss;

import java.util.Random;
import java.util.Scanner;

public class task83_RollDice_Benim {

	public static void main(String[] args) {

		String yesNo="y";

		while (yesNo.equalsIgnoreCase("y")) {
			System.out.println("rolling the dice...");

			Random rn = new Random();

			int dice1 = rn.nextInt(6) + 1;//0 - 6   (6 dahil degil)  + 1 yaparsak   1,7 olur 1 den 6 ya kadar 7 dahil degil

			int dice2 = rn.nextInt(6) + 1;

			System.out.println("Their values are: " + dice1 + " " + dice2);

			Scanner sc = new Scanner(System.in);
			System.out.println("Roll them again (y=yes)?");
			yesNo = sc.nextLine();
			sc.close();

		}

	}

}

/*
 * Dr. Kimuta teaches an introductory statics class and has asked you to write a
 * program that he can use in class to simulate the rolling dice. The program
 * should randomly generate two numbers in the range of 1 through 6 and display
 * them. In your interview with Dr. Kimura, you learn that he would like to use
 * the program to simulate several rolls of the dice, one after the other
 */