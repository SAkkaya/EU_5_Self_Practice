package day20_Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		//Write a program that will ask the user to enter the amount of a purchase. 
		//The program should then compute the state and county tax sales tax. Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		//The program should display the amount of the purchase , the state sales tax, the county sales tax, the total sales tax, 
		//and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)

	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the amount of purchase");
		
		double amount=sc.nextDouble();
		
		double stateTax=2;
		double countryTax=4;
		
		totalsalestax(amount, stateTax, countryTax);
		
		
		
		
	}

	public static void totalsalestax(double amount, double stateTax, double countryTax) {
		
		double statesalestax = amount*stateTax/100;
		double countrysalestax = amount*countryTax/100;
		double totalsalestax=statesalestax+countrysalestax;
		double totalsales=amount+statesalestax+countrysalestax;
		
		System.out.println("amount of the purchase: "+ amount+ ", the state sales tax : "+ statesalestax + ", county sales tax: " + countrysalestax + 
				", the total sales tax :" + totalsalestax + ", total of the sale :" + totalsales);
		
	}

}
