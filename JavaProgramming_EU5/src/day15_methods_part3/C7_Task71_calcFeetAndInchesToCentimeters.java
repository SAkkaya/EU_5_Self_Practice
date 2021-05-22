package day15_methods_part3;

public class C7_Task71_calcFeetAndInchesToCentimeters {

	public static void main(String[] args) {
		/*
		 Create a method called calcFeetAndInchesToCentimeters . It needs to have two
		 parameters. Feet is the first parameter, inches is the second parameter. 
		 
		 You should validate that the first parameter feet is >=0, and second parameter
		 inches is >=0 and <=12. Return -1 from the method if either of the above is
		 not true. ØIf the parameters are valid, then calculate how many centimeters
		 comprise the feet and inches passed to this method and return that value.
		
		- Create a second method of the same name but with only one parameter inches
		 is the parameter and validate it >=0, return -1 if it is not true. But if it
		 is valid, then calculate how many feet are in the inches. ØCall the other
		 overloaded method passing the correct feet and inches calculated so that it
		 can calculate correctly. ØHints : Use double for your number datatypes 1 inch
		 = 2.54cm and 1 ft =12 inches
		 */

		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(-10, 0);
		calcFeetAndInchesToCentimeters(0, 1);
		
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);

	}

public static double calcFeetAndInchesToCentimeters(double feet,double inches) { //method-1
		
		
		if(feet<0 || (inches<0 || inches>12)) {  //inches 0-12  
			System.out.println("Invalid feet or inches");
			return -1; // return breaking poit method icin eger return -1 ise break yap method dan cik devam etme demek, eger -1 degilse else demek 
			// sira 41 den devam et demek else koymaya gerek yok yani
		}
		
		//double centimeters = (feet * 12) * 2.54 ;
		double centimeters = (feet * 12) * 2.54 + (inches * 2.54);
		
		System.out.println(feet + " feet," + inches + " inches=" + centimeters + " centimeters");
		
		
		return centimeters;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) { //method-2          // 62 inches ==> 5 feet 2 inches
		
		if(inches<0){
			System.out.println("Invalid inches");
			return -1; 
		}
		
		double feet = (int)inches/12;   
		double remainingInches = inches%12;
		
		System.out.println(inches + " inches=" + feet + " feet and " + remainingInches + "inches");
		
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
		
	}
	

}
