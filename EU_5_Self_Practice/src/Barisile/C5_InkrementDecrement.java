package Barisile;

import java.util.Scanner;

public class C5_InkrementDecrement {

	public static void main(String[] args) {
		/*
		 * Soru 9
		 print even numbers from 100 to 0 but do not use decrement(i--).  // even numbers= cift sayilar   // odd number
	
			EXAMPLE:
		     INPUT      : 
		     OUTPUT  : 100 98 96 94 92 …….2 0
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter an even number ");
		
		int num= scan.nextInt();
		
		//1.yontem
		//for (int i = num; i >= 0; i=i-2) {
			
		//System.out.print(i + " ");
		
		//2.yontem
		
		for (int i = num; i >= 0; i--) {
				
		System.out.print(i-- + " ");
			
		}
		
	}
	
}

