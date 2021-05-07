package Barisile;

import java.util.Scanner;

public class C4_Star_Method {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("bir deger girin");

		int a = scan.nextInt();

		starMethod(a);

	}


	public static void starMethod(int a) { // 5

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= (a-i)/2; j++) {

				System.out.print(" ");
			}
			
			for (int k = 1; k <=i; k++) {
				
				System.out.print("*");
			}
			System.out.println(" ");
			
			i++;
		
		}

	}

}


