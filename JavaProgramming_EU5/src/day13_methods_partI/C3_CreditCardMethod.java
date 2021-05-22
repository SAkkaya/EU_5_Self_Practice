package day13_methods_partI;

public class C3_CreditCardMethod {

	public static void main(String[] args) {

		double salary = 50000;
		int creditRating = 5;

		if (salary >= 20000 && creditRating >= 7) {

			qualify();

		} else {
			noQualify();
		}

	}

	public static void noQualify() {
		System.out.println("I am sorry, you are not qualified for the CC ");
	}

	public static void qualify() {
		System.out.println("Congrats, you are qualified for the CC ");
	}

}
