package Barisile;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		
		
		// (7-2)!  c7,2      7!/(7-2)!2!   C(7,2)
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter two nummer of Kombination");
		
		int num1= sc.nextInt();
		
		int num2=sc.nextInt();
		
	
		
		int kombinasyon=c(num1, num2);
		System.out.println(kombinasyon);
		

	}

	public static int c(int num1, int num2) {
	
		
		int kombinasyon= factoriyel(num1)/ (factoriyel(num1-num2)*factoriyel(num2));
		
		
		
		return kombinasyon;
	}

	public static int factoriyel(int num1) {
		
		
		
		if (num1==0) {
			return 1;
		} else {
			
			int fac=1;
			
			for (int i=1; i<=num1; i++ ) {
				fac=fac*i;
			}
				
			return fac;	
		}
	
	}

	

}
