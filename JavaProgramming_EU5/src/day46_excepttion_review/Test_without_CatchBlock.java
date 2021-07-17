package day46_excepttion_review;

public class Test_without_CatchBlock {

	public static void main(String [] args) {

		method1();
		System.out.println("Line after exception - Main");
	}

	public static void method1() {
		method2();
		System.out.println("Line after Exception - method1");
	}

	public static void method2() { //withoud Catch block  method

		try {
			Connection connection = new Connection();
			Connection.open();

			String str = null;    // EXECUTION WILL STOP HERE!!!!!
			str.toString();
		
		}finally {            // Only Finally block will be executed !!!!
			Connection.close();
		}
		
		System.out.println("-------------------------------- ");
	}
	
	
}
