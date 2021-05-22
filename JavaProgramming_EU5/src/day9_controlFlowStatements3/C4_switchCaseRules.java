package day9_controlFlowStatements3;


public class C4_switchCaseRules {

	public static void main(String[] args) {
		
		final String lastName="Smith";
		String firstName="Mike";
		int id=0;
		
		switch(firstName) {
		case "Test":
			System.out.println("Test");
			break;
		
		//case "Mike":    --> mike olsa idi yukardaki Test yazdiracakti
		//System.out.println("Test"); //Test
		//break;
			
			
		case lastName:
			id=5;
			break;	
			
		//case 5:   invariable String integer degil hata verir
			//id=5;
			//break;
			
			
		
		}

	}

}
