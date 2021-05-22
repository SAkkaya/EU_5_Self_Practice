package day25_arrays_part2;

import java.util.Arrays;
import java.util.Scanner;

public class C3_PayArray_Benim {

	public static void main(String[] args) {
		//This program stores in an array the hours worked for by 5 employees who all make the same hourly wage
				//display their gross pay
		
		
		Scanner sc=new Scanner(System.in);
		
		int[] employee=new int[5];
		int[] grosPay=new int[5];
		int hourlyRage=20;
		int hours;
			
		for(int i=0; i<employee.length; i++) {
			System.out.println("Enter working hours of "+ (i+1) + ".employee");
			employee[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<employee.length; i++) {
			grosPay[i]=employee[i]*hourlyRage;
			System.out.println("Gross pay of "+ (i+1)+ ".employee :" +grosPay[i]);
		}
		
		System.out.println("Gross pay of all employees :" + Arrays.toString(grosPay)); //[400, 200, 600, 500, 900]
		
		
	}

}
