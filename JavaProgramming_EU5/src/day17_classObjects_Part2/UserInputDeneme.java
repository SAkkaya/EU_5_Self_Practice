package day17_classObjects_Part2;

import java.util.Scanner;

public class UserInputDeneme {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a  byte value : ");
		
		byte b1=sc.nextByte();
		
		System.out.println(b1); //129 girersek ->Value out of range. Value:"129"  hatasi error verir.
		

		System.out.println(b1*4);
		
	
		
		System.out.println("Enter another  byte value : ");
		
		byte b2=sc.nextByte();
		
		System.out.println(b2*3);
		
		
		
	}

}
