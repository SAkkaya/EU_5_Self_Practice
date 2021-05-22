package day13_methods_partI;

public class C19_AvarageGrade {

	public static void main(String[] args) {
		// Task-65
		// Write a method that accepts 3 grades and prints the grade according to the
		// below table
//		Sample Output:
//			calculateGrade(100,100,100) - > A
//			calculateGrade(50,50,50) - >F

		calculateGrade(500, 40, 70);

	}

	private static void calculateGrade(int num1, int num2, int num3) {

		double average = (num1 + num2 + num3) / 3;

		System.out.println(average);

		if (average >= 0 && average <= 100) {

			if (average >= 90)
				System.out.println("A");
			else if (average >= 80)
				System.out.println("B");
			else if (average >= 70)
				System.out.println("C");
			else if (average >= 60)
				System.out.println("D");
			else if (average <= 59 && average >= 0)
				System.out.println("F");
		} else
			System.out.println("invalid note");

	}

}
