package day18_readingUserInput;

import java.util.Scanner;

public class Task74_PositiveNumberTotal{

	public static void main(String[] args) {
	
		//Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
		
		int sum=0;
		//int num=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		do {
			
			System.out.println("Enter your numbers");
			
			int num=sc.nextInt();
			
			if(num<0) {
				break;
			}else {
				sum+=num;
				
			}
			
		} while(true);
		
		System.out.println("Total is:"+ sum);
		
		
		
		 
	
		
	}

}
