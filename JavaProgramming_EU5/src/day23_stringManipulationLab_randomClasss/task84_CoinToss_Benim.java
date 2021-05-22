package day23_stringManipulationLab_randomClasss;

import java.util.Random;

public class task84_CoinToss_Benim {

	public static void main(String[] args) {

		Random rn = new Random();

		

		
		for (int i = 1; i <= 10; i++) {
			
			int headsTails = rn.nextInt(2);
			if (headsTails == 1) {
				System.out.println("Heads");

			} else {
				System.out.println("Tails");
			}
		}

	}

}

/*
 * 
 * Dr. Kimuta was so happy with the dice rolling simulator that you wrote for
 * him, he has asked you to write one more program. He would like a program that
 * he can use to simulate ten coin tosses, one after the after. Each time the
 * program simulates a coin toss, it should randomly display either “Heads” or
 * “Tails”
 */