package Barisile;

import java.util.Scanner;

public class C3_DaireYaricap_Method {

	public static void daireYaricap(double r) {
	//public static double daireYaricap(double r) {
		final double PI = 3.14;

		double a = r;

		double area = PI * a * a;
		/*
		 * double area=PI*r*r;
		 */
		//return area;
		System.out.println(area);
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yaricap giriniz");
		
		double a=scan.nextDouble();
	
		daireYaricap(a);
		
		//double alan = daireYaricap(a);
		
		//System.out.println(alan);
	}	

}
