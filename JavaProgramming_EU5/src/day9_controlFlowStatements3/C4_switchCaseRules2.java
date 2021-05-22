package day9_controlFlowStatements3;


public class C4_switchCaseRules2 {

	public static void main(String[] args) {
		
		
		//final String lastName="Smith";
		final String lastName="Mike";
		String firstName="Mike";
		int id=0;
		
		switch(firstName) {
		case "Test":
			System.out.println("Test");
			break;
		
		case lastName: // last Name = firstName ===> Mike==Mike oldu
			id=5;
			System.out.println(id); //5 yazdirdi Id ==> 5 atadi
			break;	
			
		//case 5:   invariable String integer degil hata verir
			//id=5;
			//break;
			
			
		
		}

	}

}
