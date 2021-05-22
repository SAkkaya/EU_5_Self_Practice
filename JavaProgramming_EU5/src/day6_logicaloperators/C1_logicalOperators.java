package day6_logicaloperators;

public class C1_logicalOperators {

	public static void main(String[] args) {
		
		char c1 ='A';
		char c2= 65;
		
		int i1 =5;
		int i2=10;
		
		boolean res1 = (i1==i2) & (c1==c2);  // False & True = False
		
		boolean res2 = (i1==i2) && (c1==c2);   // False & --   second exp I dont care--- = False
		
		
		System.out.println("res1 = " + res1); //f
		System.out.println("res2 = " + res2); // f
		
		
		/*
		 *int i1 =10;
		  int i2=10;
		
			boolean res1 = (i1==i2) && (c1==c2++);
		
			System.out.println("res1 = " + res1 + " " + c2);  //res1 = true B
		
		 */
		
		boolean res3 = (c1==c2) | (i1==i2); // T | F  = T
		boolean res4 = (c1==c2) || (i1==i2); // T ||-----(2. expressiion i kontrol etmeyecek  = T
		
		System.out.println("res3 = " + res3); 
		System.out.println("res4 = " + res4); 
		
		boolean res5 = (c1==c2) ^ (i1==i2); // T ^ F = T 
		boolean res6 = (c1==c2) ^ (i1!=i2); // T ^ T = F
		
		System.out.println("res5 = " + res5);
		System.out.println("res6 = " + res6); 
	}

}
