package day8_controlFlowStatements_Part2;

public class C4_task31_TriangleAngles {

	public static void main(String[] args) {
		/*A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
		program that declares three integers as angles and check whether a triangle is valid or
		not.*/
		
		int a=60;
		int b=60;
		int c=90;
		
		if ((a + b + c) ==180) {
			System.out.println("valid triangle");
		} else {
			System.out.println("invalid triangle");
		}

	}

}
