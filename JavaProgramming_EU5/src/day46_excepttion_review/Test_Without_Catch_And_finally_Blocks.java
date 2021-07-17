package day46_excepttion_review;

public class Test_Without_Catch_And_finally_Blocks {
	
	//withoud Catch and finally block  will give COMPILE ERROR
	
	   //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    //Syntax error, insert "Finally" to complete BlockStatements
	
	public static void main(String [] args) {

		method1();
		System.out.println("Line after exception - Main");
	}

	public static void method1() {
		method2();
		System.out.println("Line after Exception - method1");
	}

	public static void method2() { //withoud Catch and finally block  will give COMPILE ERROR

		try {
			Connection connection = new Connection();
			Connection.open();

			String str = null;    // EXECUTION WILL STOP HERE!!!!!
			str.toString();
		
		}      
		
		System.out.println("-------------------------------- ");
	}
	
	
}
