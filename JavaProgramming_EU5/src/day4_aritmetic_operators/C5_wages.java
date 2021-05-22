package day4_aritmetic_operators;

public class C5_wages {

	public static void main(String[] args) {
		
		double regularWage;  // The calculated regular wage
		double basePay =25; //The base pay
		double regularHours=40;  //The hours worked less overtime
		double overTimeWages;     // Overtime wages
		double overTimePay=37.5; //OverTime Pay rate
		double overTimeHours=10;
		double totalWage; //Total Wage
	
		regularWage=basePay * regularHours;
		overTimeWages=overTimePay*overTimeHours;
		
		totalWage=regularWage+overTimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		

	}

}
