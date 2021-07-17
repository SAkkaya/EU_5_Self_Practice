package day45_exceptions;

public class TryCatch2 {
	
	public static void main(String[] args) {
		
		int [] nums = {36,6, 34, 12};
		
		
		//System.out.println(nums{0]); // compile error ==> you need to fix it first to run it 
		
		
		try {
			System.out.println(nums[6]);
		}catch(Exception e) {
			//System.out.println("wrong index");
			
			System.out.println(e.getStackTrace()); //[Ljava.lang.StackTraceElement;@15db9742
			e.printStackTrace(); //java.lang.ArrayIndexOutOfBoundsException: 6
								//at day45_exceptions.TryCatch2.main(TryCatch2.java:14)
			
			System.out.println(e.getMessage()); //6
			
			
		}
		
		
		try {
			
			int j=100;
			int n=j/0;
			
		}catch(ArithmeticException e) {         //catch(Exception e) {    yerine child classini da yazabilriz      
			e.printStackTrace();
			System.out.println(e.getMessage()); //      / by zero
		}
		
		
		
		
		
		
	}
	
	
	
	

}
