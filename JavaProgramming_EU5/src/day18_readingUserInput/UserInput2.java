package day18_readingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);     

		System.out.println("Provide a sentence and I will repeat it:");//benim adim Ozzy

		String str = sc.next();  
		System.out.println(" written sentence is:" + str); //benim

		//System.out.println("Provide a sentence and I will repeat it:")
		String str2 = sc.nextLine();

		System.out.println(" written sentence is:" + str2);//  adim Ozzy

	}

}
