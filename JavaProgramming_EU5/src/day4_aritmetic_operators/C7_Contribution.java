package day4_aritmetic_operators;

import com.sun.java.swing.plaf.motif.MotifMenuUI.MotifChangeHandler;

public class C7_Contribution {

	public static void main(String[] args) {
		/*
		 this program calculates the amount of pay that will be contributed to 
		 a retirement plan if 5% , 8% or 10% of monthly pay is withheld
		 */
		
		//Variable to hold the monthly pay and the amount of the contribution
		
		
		double monthlySalary=6000;
		double contribution1,contribution2,contribution3;
		
		
		double retirementPlan1=0.05;
		double retirementPlan2=0.08;
		double retirementPlan3=0.10;
		
	
		
		contribution1=monthlySalary*retirementPlan1;
		contribution2=monthlySalary*retirementPlan2;
		contribution3=monthlySalary*retirementPlan3;
		
		System.out.println("5 percent is $" + contribution1 + " per month.");
		System.out.println("8 percent is $" + contribution2 + " per month.");
		System.out.println("10 percent is $" + contribution3 + " per month.");
		
	}

}
