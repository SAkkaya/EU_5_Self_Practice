package week2;

public class C7_Task {

	public static void main(String[] args) {
		/*Task2:
		     write a program that can check if number is positive negative or equals to zero.
		        for example:
		            num  = 1
		            prints:
		                1 is positive number
		            num = -6
		            print:
		                6 is negative number
		            num = 0
		            print:
		                zero */
		
		
		int num=10;
		
		String output;
		
		output = (num!=0)? (num>0) ? "positiv number": "negativ number":"zero";
		

		System.out.println(num + " is " + output);
		
		
	

		/*Task3:
		    write a program that can calculate the grade. 

		        1. if grade is bigger then 90 output "Excellent" 
		        2. if the grade is bigger then 70 and smaller then 90 output "Good"
		        3. if grade is bigger then 60 and smaller then 70 output "Pass"
		        4. if grade is smaller then 60 output "Fail"

		        ex: score = 75
		            output:
		                Good

		        HINT: you will need && logic */

	
		int grade=176;
		
		String status;
		
		status=grade>=0 && grade<=100 ? (grade>=90 ? "Excellent" : grade>=70 ? "Good" : grade>=60 ? "Pass" : "fail") : "invalid";
		
		System.out.println(status);

	}

}
