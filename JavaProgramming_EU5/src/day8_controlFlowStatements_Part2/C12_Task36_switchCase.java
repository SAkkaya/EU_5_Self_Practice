package day8_controlFlowStatements_Part2;

public class C12_Task36_switchCase {

	public static void main(String[] args) {
		// Write a program that creates a calculator by using switch statements
		
		int num1=10;
		int num2=5;
		String operator="*";
		int result=0;
		
		
		switch (operator) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
		
		System.out.println("Result is =  "+ result);
	}

}
