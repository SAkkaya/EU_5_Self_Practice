package day35_encapsulation;

import java.util.Scanner;

public class RouletteTest {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Please enter a number within 0 to 36");
		
		int pocketNumber = sc.nextInt();
		
		
		RoulettePocket roulett = new RoulettePocket(pocketNumber);
		
		System.out.println(roulett.getPocketColor());

		
		
	}

}



