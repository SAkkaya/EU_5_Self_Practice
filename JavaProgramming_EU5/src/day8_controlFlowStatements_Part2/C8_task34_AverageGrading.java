package day8_controlFlowStatements_Part2;

public class C8_task34_AverageGrading {

	public static void main(String[] args) {
		/*The marks obtained by a student in 3 different subjects are input by the user. Your
		program should calculate the average of subjects. The student gets a grade as per the
		following rules:*/
		
		int math=70;
		int chemistry=80;
		int biology=5;
		
		double average=(math+chemistry+biology)/3;
		System.out.println("Average is: " + average);
		
		if (average>=90 && average<=100) {
			System.out.println("Grade is A");
		} else if (average>=80 && average<89) {
			System.out.println("Grade is B");
		}else if (average>=70 && average<79) {
			System.out.println("Grade is C");
		}else if (average>=60 && average<69) {
			System.out.println("Grade is D");
		}else if (average>=0 && average<59) {
			System.out.println("Grade is F");
		}else  {
			System.out.println("invalid input");
		}

	}

}
