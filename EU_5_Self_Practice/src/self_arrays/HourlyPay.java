package self_arrays;

import java.util.Scanner;

public class HourlyPay {

	public static void main(String[] args) {
		// This program stores in an array the hours worked for by 5 employees who all
		// make the same hourly wage
		// display their gross pay
		
		
		double[] workedhours = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < workedhours.length; i++) {
			System.out.println("enter worked hours of employee # :" + (i+1));
			workedhours[i]= sc.nextInt();
		}
		
		System.out.print("Enter the hourly rate for each employee:");
		
		double hourlypayRate = sc.nextDouble();
		
		double[] grossPay=new double[5];
		
		for (int i = 0; i < grossPay.length; i++) {
			grossPay[i]=workedhours[i]*hourlypayRate;
			
			System.out.println("grosspay of the employee # " + (i+1) + " is : " + grossPay[i]);
		
		}
		
		
		


	}

}
