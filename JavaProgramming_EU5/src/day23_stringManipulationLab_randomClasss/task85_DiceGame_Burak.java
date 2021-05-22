package day23_stringManipulationLab_randomClasss;

import java.util.Random;

public class task85_DiceGame_Burak {

	public static void main(String[] args) {
		Random rn = new Random();

		int dice1, dice2, dice3, dice4;

		int human = 0;
		int cpu = 0;

		for (int i = 0; i < 10; i++) {

			dice1 = rn.nextInt(6) + 1;
			dice2 = rn.nextInt(6) + 1;
			dice3 = rn.nextInt(6) + 1;
			dice4 = rn.nextInt(6) + 1;

			if ((dice1 + dice2) > (dice3 + dice4)) {
				cpu++;
			} else {
				human++;
			}

			System.out.println("cpu's dices " + dice1 + " " + dice2);

			System.out.println("human's dices " + dice2 + " " + dice3);

		}

		if (human > cpu) {
			System.out.println("human wins " + human + " " + cpu);
		} else if (human == cpu) {
			System.out.println("draw" + human + " " + cpu);
		} else {
			System.out.println("cpu wins " + cpu + " " + human);
		}

	}

}