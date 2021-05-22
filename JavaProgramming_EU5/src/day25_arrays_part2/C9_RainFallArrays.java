package day25_arrays_part2;

import java.util.Scanner;

public class C9_RainFallArrays {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double[] rainfall= new double[12];
		
		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month Rainfall (In inches)");
		
		String[] months= {"January:", "February:", "March:", "Apr:", "May:", "Jun:", "July:", "August:","Sep:","Oct:","Nov:","Dec:"};

		
		for(int i=0; i<rainfall.length;i++) {
			//System.out.print(months[i]);
			rainfall[i]=sc.nextDouble();
			
			System.out.println(months[i]+rainfall[i]); 
		
		}
		
		totalRainfallYear();
		
	}

	public static void totalRainfallYear(double[]total) {
		
		double sum=0;
		for(int i=0; int i< total.length;i++) {
			sum=sum+rainfall[i];
		}
		
	
	}
	
	
	

}



//System.out.println("January:");
//System.out.println("February:");
//System.out.println("March:");
//System.out.println("April:");
//System.out.println("May:");
//System.out.println("June:");
//System.out.println("July:");
//System.out.println("August:");
//System.out.println("Sep:");
//System.out.println("Oct:");
//System.out.println("Nov:");
//System.out.println("Dec:");


/*Write a RainFall class that stores the total rainfall for each of 12 months into an array of
doubles. The program should have methods that return the following:
- total rainfall for the year
- the average monthly rainfall
- the month with the most rain
- the month with the least rain
Input Validation: Do not accept negative numbers
for the monthly rainfall figures.*/