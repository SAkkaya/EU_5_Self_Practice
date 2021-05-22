package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class C4_task88_CarPrice_benim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] cars = new String[7];

		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";

		System.out.println("Select your car, pls enter an index number");
		int index = sc.nextInt();

		//System.out.println(cars[index]);
		
		sc.close();
		

		if (cars[index] == cars[0] || cars[index] == cars[1] || cars[index] == cars[2]) {
			int priceRandom = rd.nextInt(20001) + 20000;
			System.out.println("price of the " + cars[index] + " is " + priceRandom);
		} else if (cars[index] == cars[3] || cars[index] == cars[4]) {
			int priceRandom = rd.nextInt(30001) + 50000;
			System.out.println("price of the " + cars[index] + " is " + priceRandom);
		} else {
			int priceRandom = rd.nextInt(50001) + 100000;
			System.out.println("price of the " + cars[index] + " is " + priceRandom);
		}

	}

}

/*
 * • Create an array that holds cars (Honda, Toyota, Nissan, Nissan, Mercedes,
 * Porsche, Ferrari) • Ask user to enter an index number to choose his dream
 * car. • Print the price for selected car. Car prices : Honda – Toyota – Nissan
 * (Random price between 20000 and 40000) BMW-Mercedes(Random price between
 * 50000 and 80000) Porsche - Ferrari(Random price between 100000 and 150000) •
 * Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min
 */