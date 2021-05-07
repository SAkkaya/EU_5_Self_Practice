package Barisile;

import java.util.Scanner;

public class C2_Faktoriyel {

	public static void main(String[] args) {
		// 10 faktorial
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter a natural whole number");
		
		int num=scan.nextInt();
		
		int faktorial=1;
		
		
		if (num <00 ) {
			System.out.println(" please enter a natural whole number");
		} else if (num==0){
			
			System.out.println(num + "!=1");
			
		}else {
			for (int i = 1; i <= num; i++) {
				
				faktorial=i*faktorial;
	
			} System.out.println(num + "!=" + faktorial);

		}
		
	}

}
