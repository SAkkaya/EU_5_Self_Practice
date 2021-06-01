package week10_review;

import java.util.ArrayList;
import java.util.Arrays;

import week10_review.*;


public class ScrumTeam { //Scrum Team ve Developer ve Tester arasinda 
						//IS aRelation Degil HAs A Relation var o yuzden EXTENDS yapmadik!!!!
	
	public String PO, BA, SM;
	
	ArrayList<Developer> developersList;
	ArrayList<Tester> testersList;
	
//	public Developer developer;
//	public Tester tester;
	
	
public ScrumTeam(String pO, String sM, ArrayList<Developer> developersList) {
		PO = pO;   // BA ve Tester olmak zorunda degil 
		SM = sM;
		
		this.developersList = new ArrayList<Developer>();
	}

public ScrumTeam(String pO, String sM, ArrayList<Tester> testersList,
			ArrayList<Developer> developersList) {  // BA olmak zorunda degil 

		PO = pO;
		SM = sM;
		
		this.testersList = new ArrayList<Tester>();
		this.developersList = new ArrayList<Developer>();
	
	}
	
public ScrumTeam(String pO, String bA, String sM, ArrayList<Tester> testersList,
			ArrayList<Developer> developersList) {
	
		PO = pO;
		BA = bA;
		SM = sM;
		this.testersList = new ArrayList<Tester>();
		this.developersList = new ArrayList<Developer>();
	}


	public ScrumTeam(String pO, String bA, String sM, Developer developer) {
		
		this.developersList = new ArrayList<Developer>();
		PO = pO;
		BA = bA;
		SM = sM;
		this.developersList.add(developer);
}

	public void addTester(Tester tester)	{
		this.testersList = new ArrayList<Tester>();
		this.testersList.add(tester);  // niye return yapmadik ya da syos tazmadik void
	}
	
	public void  addTester(Tester[] testers) {
		this.testersList.addAll(Arrays.asList(testers));
		
	}
	
	public void addDeveloper(Developer developers)	{
		this.developersList.add(developers);  // niye return yapmadik ya da syos tazmadik void
	}
	
	public void  addDeveloper(Developer[] developers) {
		this.developersList.addAll(Arrays.asList(developers));
		
	}
	
	public void removeTester(int testerID) {   //(Tester  testerID) { ??? neden olmadi
		this.testersList.removeIf(p -> p.employeeId==testerID);
	}
	

	public void removeDeveloper(int developerID) {   
		this.testersList.removeIf(p -> p.employeeId==developerID);
	}



	public String toString() {
		return "ScrumTeam [PO=" + PO + ", BA=" + BA + ", SM=" + SM + ", testersList=" + testersList
				+ ", developersList=" + developersList + "]";
	}
	
	

}


/*4. create a class called ScrumTeam
Attributes:
String: PO, BA, SM,
ArrayList<Tester> testersList = new ArrayList<>(),
ArrayList<Developer> devopsList = new ArrayList<>(),


Add a constructor that can set PO, BA, SM

Actions:
addTester(Tester tester): adds the given tester to the testers arraylist

addTesters(Tester[] testers): adds the given testers to the testers arraylist

addDeveloper(Developer developer): adds the given developer to the developers arraylist

addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

removeTester(long employeeID): removes the given tester from the testers arraylist

removeDeveloper(long employeeID): removes the developer from the developers arraylist

toString(): prints number of tester,& developers,  PO name, SM name, BA name   */


