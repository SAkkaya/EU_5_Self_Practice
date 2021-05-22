package day19_stringManupulation_part1;

import java.util.Scanner;

public class C2_Task75_TotalCharacters {

	public static void main(String[] args) {
		// Write a program that ask user to enter his/her firstname and lastname. Display in the
		//console total number of characters.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter you firstname:");
		String firstname=sc.next();
		
		System.out.print("Enter your lastname:");
		String lastname=sc.next();
	
		
		System.out.println("total number of character : "+ ((firstname.length()) + (lastname.length()) ));
		
	}

}
