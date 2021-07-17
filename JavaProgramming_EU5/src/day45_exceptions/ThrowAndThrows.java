package day45_exceptions;


public class ThrowAndThrows {

	public static void main(String[] args)  {      
		
		System.out.println("Hello world");
		
	   // throw new RuntimeException("This is some exception");
		
		
	//	throw new Exception("Another exception");  //checked exception
		
	//	manually throw              /throw manualy throws an exception  (throws ile ayni yani)
		
//		try{
//			throw new Exception("Another exception");  //checked exception
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
		
		System.out.println("");
		
		
		System.out.println("----------------------------");
		
		
		String username = "";
		
		if(username.isEmpty()) {
			
			throw new RuntimeException("User name can not be empty");
		}else {
			System.out.println("Valid username");
		}
		
		
		
		try {
			sleep3(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
		public static void sleep(int seconds) throws InterruptedException{ // i just declared not handled yet
			
			Thread.sleep(seconds*1000);
			
//			try {
//				Thread.sleep(seconds*1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//			
		}
			
			public static void sleep2(int seconds) throws InterruptedException { // I just declared not handled yet
				sleep(seconds);
			}
			
			
			public static void sleep3(int seconds) throws InterruptedException { //I just declared not handled yet, I will handled with try catch in MAIN method upside
			
					sleep2(seconds);
				
			}
			

	}


