package day11_controlFlowStatements_Part5;

public class C6_Task49_StairsStepPattern_ForLoops {

	public static void main(String[] args) {
		
		/* Task 49 -Write a Java program to create a stair step pattern
		#
		 #
		  #
		   #
		    #
		     #   */
		
		
		int rows=7; //outerloops
		
		for (int i = 1; i <= rows; i++) {
			
			
			for (int j = 1; j < i; j++) {
				
				System.out.print(" ");
				
			} 
			System.out.println("#");  // bir alt satira geciyor # yazdiktan sonra
			
			
		}

	}

}
