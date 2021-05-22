package day12_controlFlowStatements6;

public class C1_BreakContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			if (i == 4) {

				break; // break the loop and exit the loop
			}

			System.out.print(i); // 1, 2, 3
		}

		System.out.println("---------------------------------");

		for (int i = 1; i <= 5; i++) {

			if (i == 4) {

				continue; // break the loop and exit the loop
			}

			System.out.print(i); //1 2 3 5   ==> 4  u yazdirmaz
		}
	}

}
