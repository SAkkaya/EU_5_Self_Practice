package day20_Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Write a program that asks the user for a positive nonzero integer value. 
		//The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter a positive nonzero integer value");
		
		int num=sc.nextInt();
		
		int sum=0;
		
		if(num>0) {
		
		for(int i=1; i<=num;i++) {
			sum+=i;
		}System.out.println("sum of all the integers from 1 up to the "+ num+" is :" + sum);
		
		} else {
			System.out.println("Invalid value - please enter a positive nonzero integer value");
		}
		
			
		} 
		
	}


