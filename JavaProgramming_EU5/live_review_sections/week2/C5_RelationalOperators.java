package week2;

public class C5_RelationalOperators {

	public static void main(String[] args) {
		System.out.println(100 > 1000); // false
		System.out.println(10000 < 100000); // true
		System.out.println(10 >= 9); // true
		System.out.println(15 <= 15); // true
		System.out.println("-----------------------------------------");
		// ==

		boolean r1 = true == false;  //false
		System.out.println(r1);
		
//		boolean r2 = 100 == 100.0; // true
//		System.out.println(r2);


		boolean r2 = 100 == 100.1; // false
		System.out.println(r2);

		boolean r3 = "Muhtar" == "Good Guy";//false

		System.out.println(r3);

		// !=
		boolean r4 = "Muhtar" != "Good Guy"; // true
		System.out.println(r4);

		boolean r5 = "Java" == "Cava"; //false
		System.out.println(r5);

		//boolean r6 = "seven" != 7;//compilation error

//		boolean r7 = 'a' != 7; //true
//		System.out.println(r7);
		
		boolean r7 = '7' != 7; //true
		System.out.println(r7);

		System.out.println('A' == 65); //true

	}

}
