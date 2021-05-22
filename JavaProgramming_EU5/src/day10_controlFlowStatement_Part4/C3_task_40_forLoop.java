package day10_controlFlowStatement_Part4;

public class C3_task_40_forLoop {

	public static void main(String[] args) {
		// Write a program that displays all even numbers between 1 and 100 in the same line
	
//		for(int i=2;i<100;i+=2) {
//			System.out.print(i + " ");
//		}
		
		for(int i=1;i<=100;i++) {
			
			if (i%2==0) {
			System.out.print(i + " ");
			}
		}
	}

}
