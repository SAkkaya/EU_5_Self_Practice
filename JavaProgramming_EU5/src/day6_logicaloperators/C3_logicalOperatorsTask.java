package day6_logicaloperators;

public class C3_logicalOperatorsTask {

	public static void main(String[] args) {
		/*
		 	1. Create a double variable with the value 20
			2. Create a second variable of type double with the value 80
			3. Add both numbers up and multiply by 25
			4. Use the remainder operator to figure out the remainder from the sum of #3 divided
			by 40
			5. Print remaining total (#4) is equal to 20 or less : true/false
		 */
		
		double d1 = 20;
		double d2 = 80;
		
		double res = (d1+d2)*25;  // res==> result
		
		double remainder= res%40;
		
		
		//boolean remainingTotal = (remainder == 20  || remainder < 20);
		
		//System.out.println(remainder); //20.0
		System.out.println("Reamining total is equal to 200 or less?  - " + (remainder<=20)); //Reamining total is equal to 200 or less?  - true
		
	}

}
