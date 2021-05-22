package day13_methods_partI;

public class C18_Task64_StarPrintPattern {

	public static void main(String[] args) {
		
		printStar(3);
		
		

	}

	public static void printStar(int num) {
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <=i ; j++) {
				
//				for (int i = 0; i < num; i++) {
//					
//					for (int j = 0; j <=i ; j++) {
//				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
