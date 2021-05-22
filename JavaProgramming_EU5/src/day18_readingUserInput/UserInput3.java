package day18_readingUserInput;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter first number:");		
		int num1 =sc.nextInt();
				
		System.out.println("Enter second number:");		
		int num2=sc.nextInt();
		
		sc.nextLine();// Eger nextINt yad anext Double gibi bir primitive data dan sonra STring gelecekse araya bunu yazmazsan, bunu eklemezsen  ==> cikmiyor("Enter a string:");
						// bir sonraki Output a geciyor, nedeni  	String str=sc.nextLine(); nextLinde dan dolayi next olsa gosterecekti ama bosluklu string girersek bosluktan sonra gostermez
		
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		//String str=sc.next();
		System.out.println("Output:"+ num1 + ":" + num2 + ":" +str);
		
		

	}

}
