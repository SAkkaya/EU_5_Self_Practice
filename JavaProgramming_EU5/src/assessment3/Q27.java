package assessment3;

public class Q27 {

	public static void main(String[] args) {    
		long z=10;       //compile error verir==> long, float, double switch kabul etmiyor!!!!
		
		switch (z) {
		case 10:
			System.out.println("Monday");
		case 11:
			System.out.println("Tuesday");
		case 11:
			System.out.println("Tuesday");

		default:
			System.out.println("Friday");
		}

	}

}
