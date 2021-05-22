package day18_readingUserInput;

import java.util.Scanner;

public class Task72_SumNumbers {

	public static void main(String[] args) {
		
		//Write a program that ask user to enter 3 numbers and shows the total of numbers.
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		

		System.out.println("Sum of numbers:"+ total(num1, num2, num3));
		
		

	}

	public static int total(int num1, int num2, int num3) {
		int totalnumber=num1+num2+num3;
		return totalnumber;
	}

}
