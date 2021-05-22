package day7_controlFlowStatements;

public class C6_task27_GreetingHours {

	public static void main(String[] args) {
		/* Write a Java program to implement following logic using if statement
		1. if hour is less than 12 noon, greet with Good Morning
		2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
		3. if hour is greater than or equal to 3 pm, greet with Good Evening */
		
		int hours=15;
		String greetings1="Good Morning";
		String greetings2="Good Afternoon";
		String greetings3="Good Evening";
		
		if (hours<12) {
			System.out.println(greetings1);
		}
		if (hours>=12 && hours<15) {
			System.out.println(greetings2);
		}
		if (hours>=15) {
			System.out.println(greetings3);
		}
	}

}
