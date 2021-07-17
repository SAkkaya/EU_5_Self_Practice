package day45_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		
		try {
			String str = "JAVA";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4)); //i might have problem here
		System.out.println(str.charAt(1)); // WILL NOT BE EXECUTED
		
		
		}catch(Exception e){
			System.out.println("exception happened in try block and was caught");
			//EXCEL 
		}
		
		System.out.println("After try catch block");
	
	}

}
