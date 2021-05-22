package day5_unary_assignment_relational_operators;

public class C5_task19_incrementDecrement {

	public static void main(String[] args) {

		int a= 50;
		int result = --a + a++ + a-- + a++;  //49 + 49 + 49 + 49
		
		
		
		//int result =   --a    +     a++    +    a--    +   a++;   
		// a in memory :5 ---------> 49   ------->50 --->  49  --> 50
		// result :      49     +    49    +      50  +     49   ==> 197

		System.out.println ("a =" + a); // 50
		System.out.println ("result = " + result); //197

	}

}
