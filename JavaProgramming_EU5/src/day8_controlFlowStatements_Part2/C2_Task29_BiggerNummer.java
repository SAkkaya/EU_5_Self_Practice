package day8_controlFlowStatements_Part2;

public class C2_Task29_BiggerNummer {

	public static void main(String[] args) {
		/*
		- Declare and initialize 2 variable numbers
		- Program should tell which number is bigger
		ex: “Number1 number is greater than Number2 number” */
		
		int num1=500;
		int num2 =400;
		
		if (num1>num2) {
			System.out.println ("Num1:"+ num1 + " is greater than " + "Num2:"+ num2);
		} else {
			System.out.println("Num2:" + num2 + " is greater than Num1: " + num1);
		}
		
	}

}
