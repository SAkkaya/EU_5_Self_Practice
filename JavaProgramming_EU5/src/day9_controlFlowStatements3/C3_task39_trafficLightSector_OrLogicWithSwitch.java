package day9_controlFlowStatements3;

public class C3_task39_trafficLightSector_OrLogicWithSwitch {

	public static void main(String[] args) {
		/*
		 Write a program to display traffic light colors using following logic:
			if code (R/r)-->"Red"
			if code (O/o)-->"Orange"
			if code (G/g)-->"Green"
		 */
		
		char code ='o';
		
		switch (code) { 
			
		case 'R':
		case 'r':
			System.out.println("Red");
		break;
		
		case 'O' :
		case 'o':
			System.out.println("Orange");
		break;
		
		case 'G':
		case 'g':
			System.out.println("Green");
		break;
		
		default:
			System.out.println("invalid code");
			//break;
		
		}
	}

}
