package day20_Lab2;

import java.util.Scanner;

public class Qestion2 {

	public static void main(String[] args) {
		//Question-2

		//A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 serving 
		//in the bag and that a serving equals 300 calories. write a program that lets the user enter
		//the number of cookies he or she actually ate and then reports the number of total calories consumed.
		
		
		
		int  calloriesPerCookies = 300/(40/10);
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the number of cookies you ate ");
		
		int numco=sc.nextInt();
		
		int sumcalories=calloriesPerCookies*numco;
		
		System.out.println("total calories consumed is: "+sumcalories);
		 
		
		
		
	}

}
