package assignment8_methods;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		cube();
		
	}

	public static void cube() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for calculating cubed value");
		
		int num=sc.nextInt();
		
		int result=num*num*num;
		System.out.println("result of the cubed value :"+ result);
		sc.close();
	}

}


/*Create a method called cube. Write all required code inside this method in order to ask the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125 */