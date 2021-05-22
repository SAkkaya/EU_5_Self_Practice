package day27_arrays_part4;

public class C1_teams {

	public static void main(String[] args) {
		
		/*String [][] team1 = new String[2][4];
		
		team1 [0][0] = "Mike";
		team1 [0][1] = "Tonny";
		team1 [0][2] = "Smith";
		team1 [0][3] = "Evan";
		
		team1 [1][0] = "David";
		team1 [1][1] = "Emmy";
		team1 [1][2] = "John";
		team1 [1][3] = "Ryan";
		*/
		
	
		
		String [][] team1 = 
			{ 
				{ "Mike","Tonny", "Smith","Evan" },  //row 0
				{"David","Emmy","John","Ryan"}       //row 1
			};
		
		System.out.println("First player of first team");
		System.out.println(team1[0][0]);
		
		System.out.println("number of rows = numbers of team : " + team1.length); //2
		System.out.println("# People in first team  : " + team1[0].length);//4
		System.out.println("# People in second team  : " + team1[1].length);//4
		

	}

}
