package assignment8_methods;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		//int x =sign1(5);
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(sign(num));
		sc.close();

	}

	

	public static int sign(int num) {
	
		if(num>0) {
			return 1;
		}else if(num<0) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}


/*Create a method called sign.  It gets a number and tells you if its positive, negative or zero.

for example :
sign(5) => 1
sign(-30)=> -1
sign(0) => 0

sign gets an int parameter.

print out 1,-1 or 0 depending on the input

the parameter should be entered by user (create a scanner object)*/