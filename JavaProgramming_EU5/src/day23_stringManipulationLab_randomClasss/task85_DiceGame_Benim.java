package day23_stringManipulationLab_randomClasss;

import java.util.Random;

public class task85_DiceGame_Benim {

	public static void main(String[] args) {

		DiceGame(20);

	}

	public static void DiceGame(int repeatNum) {

		int countCom = 0;
		int countUser = 0;
		int countDraw = 0;

		Random rn = new Random();

		for (int i = 0; i < repeatNum; i++) {

			int DiceComputer = rn.nextInt(6) + 1;// Random(6) --> (0,1,2,3,4,5) 6 haric yapiyor ;Random(6)+1;olunca
													// (1,2,3,4,5,6) yapiyor
			System.out.println("DiceComputer: " + DiceComputer);
			int DiceUser = rn.nextInt(6) + 1;
			System.out.println("DiceUser: " + DiceUser);
			
			if (DiceComputer > DiceUser) {
				countCom++;
			} else if (DiceComputer < DiceUser) {
				countUser++;
			} else {
				countDraw++;
			}
		}
			System.out.println("GAME RESULT");
			System.out.println("============================");
			System.out.println("out of " + repeatNum +" games "+countCom+ " number of times Computer won, " +
									countUser + " number of times User won, "+ countDraw + " number of times Draw ");
			if (countCom > countUser) {
				System.out.println("Computer is the grand winner");
			} else if (countUser > countCom) {
				System.out.println("User is the grand winner");
			} else {
				System.out.println("It is a Draw!");
			}
		
	}
}

/*
 * Write a program that plays a simple dice game between the computer and the
 * user. When the program runs, a loop should repeat 10 times. Each iteration of
 * the loop should do the following: ØGenerate a random integer in the range of
 * 1 thru 6. This is the value of the computer’s dice. ØGenerate another random
 * integer in the range of 1 thru 6. This is the value of the user’s dice. ØThe
 * dice with the highest value wins. (In case of a tie, there is no winner) As
 * the loop iterates , the program should keep count of the number of times the
 * computer wins, and the number of times that the user wins. After the loop
 * performs all of its iterations, the program should display who was the grand
 * winner, the computer or the user.
 */