package muhtar_only;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		/*Task02. Write a program that can calculate the salary after tax, based on the tax rate.
    1. variables: salary, tax rate
    the program should be able to print the salary after tax.
    ex: salary = 40000, taxRate = 0.3.  then the salary after tax should be: 28000
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("type your salary");
		double salary=scan.nextDouble();
		System.out.println("type taxRate");
		double taxRate=scan.nextDouble(); 
		
		double salaryAfterTax;
		
		salaryAfterTax=salary*(1-taxRate);
		
		System.out.println(salaryAfterTax);
		
		
	}


}
