package day20_Lab2;

import java.util.Scanner;


public class Question4 {

	public static void main(String[] args) {
		// Write a program that asks user for the number of males and the number of
		// females registered in a class.
		// The program should display the percentage of males and females in the class.

		Scanner sc = new Scanner(System.in);
		System.out.println("number of males");

		int numMan = sc.nextInt();

		System.out.println("number of males");

		int numWoman = sc.nextInt();
		
		int sum=numMan+numWoman;
		
		double percentageMan=100.0* numMan/sum;
		double percentageWoman=100.0* numWoman/sum;
		
		System.out.println("percentage of males : %" + percentageMan + "; percentage of females: %:" + percentageWoman);
		
		
		

	}

}
