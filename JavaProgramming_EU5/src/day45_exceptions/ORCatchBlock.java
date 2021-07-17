package day45_exceptions;

public class ORCatchBlock {

	static String str ;
	
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println(str.toUpperCase());
			
		}catch (IllegalArgumentException | NullPointerException e ) {
			//Exception types cannot be sub-parent types ==> IllegalArgumentException | NullPointerException (parent-child degiller)
			e.printStackTrace();
		}

	}

}
