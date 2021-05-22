package day8_controlFlowStatements_Part2;

public class C10_task35_FindGreatestNummersNested {

	public static void main(String[] args) {

		int n1 = 100;
		int n2 = 10000;
		int n3 = 1000000;

		if (n1 > n2 && n1 > n3) {

			System.out.println("nummer 1 is the greatest nummer");
		} else {
			if (n2 > n3) {
				System.out.println("nummer 2 is the greatest nummer");
			} else {
				System.out.println("nummer 3 is the greatest nummer");
			}

		}

	}

}