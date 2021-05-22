package day12_controlFlowStatements6;

public class C2_BranchingStatements {

	public static void main(String[] args) {
		
		int number =0;
		
		while(number<15) {
			
			number++;
			
			if (number<=5) {
				System.out.println("Skipping number " + number); /* Skipping number 1
																	Skipping number 2
																	Skipping number 3
																	Skipping number 4
																	Skipping number 5 */
				dd
				continue;
			}
			System.out.println("number =" +number);
																		/*  number =6
																			number =7
																			number =8
																			number =9
																			number =10 */
																
			if (number>=10) {
				System.out.println("Breaking at "+ number);  // Breaking at 10
				
				break;
			}
		}
				

	}

}
