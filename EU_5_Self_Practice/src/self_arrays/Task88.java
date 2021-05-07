package self_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task88 {

	public static void main(String[] args) {
		
		String[] carArray = new String[7];
		
		carArray[0]="Honda";
		carArray[1]="Toyota";
		carArray[2]="Nissan";
		carArray[3]="BMW";
		carArray[4]="Mercedes";
		carArray[5]="Porsche";
		carArray[6]="Ferrari";
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter index num of car");
		
		int index=sc.nextInt();
		
		System.out.println("selected car " + carArray[index]);
		
		Random rd= new Random();
		
	
		switch (carArray[index]) {
		
		case "Honda": case "Toyota" : case "Nissan" :
			int price = rd.nextInt(20001)+20000;
			System.out.println("price of " + carArray[index]+ " : " + price);
			break;
		case "BMW": case "Mercedes":
			int price2 = rd.nextInt(30001)+50000;
			System.out.println("price of " + carArray[index]+ " : " + price2);
			break;
		case "Porsche": case "Ferrari":
			int price3 = rd.nextInt(50001)+100000;
			System.out.println("price of " + carArray[index]+ " : " + price3);	
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
