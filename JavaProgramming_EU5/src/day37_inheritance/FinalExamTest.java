package day37_inheritance;

import java.util.Scanner;

import javax.accessibility.AccessibleStreamable;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.println("How many question are on the final exam?");
		
		questions=scanner.nextInt();
		
		System.out.println("How many question did the student miss?");
		
		missed=scanner.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		
		System.out.println("The grade for the exam is exam " + exam.getGrade());

	}

}
