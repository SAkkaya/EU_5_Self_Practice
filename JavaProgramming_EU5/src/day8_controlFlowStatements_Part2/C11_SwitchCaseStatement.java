package day8_controlFlowStatements_Part2;

public class C11_SwitchCaseStatement {

	public static void main(String[] args) {
		
		String weather ="snow";
		
		switch (weather) {
		case "sunny":
			System.out.println("Go to park");
			System.out.println("code Java");
			break;
		
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("code Java");
			break;
			
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("code Java");
			break;
			
		case "snow":
		System.out.println("Go to snowboarding");
		System.out.println("code Java");
			break;
			
		default:
			System.out.println("code Java in any other weather");
			break;
		}
				
				

	}

}
