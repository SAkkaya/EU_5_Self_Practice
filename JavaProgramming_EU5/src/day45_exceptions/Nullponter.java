package day45_exceptions;

public class Nullponter {
	
	static String name; //default value "null"

	public static void main(String[] args) {
		
		
		try {
			System.out.println(name.toUpperCase());    // java.lang.NullPointerException
											//null i upper case yapamazsin , Nullpinterexception alirsin
		
		}catch(NullPointerException e) { // (Exception e) de olabilirdi 
			System.out.println("Nullpointerexception happened");
			System.out.println("Here is the message: " + e.getMessage() );
			System.out.println("Here is the stack trace: " );
			e.printStackTrace();
			
			
			
		}
		
		

	}

}
