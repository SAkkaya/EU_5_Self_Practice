package week10_review;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Ali", "Male", "SDET", 112, 120000, "manual");
		Tester tester2 = new Tester( "Yasin", "male", "SDET", 126, 110000, "manual");
		Tester tester3 = new Tester("Zina", "female", "SDET", 456, 110000, "automation");
		
		Tester[] testers = {tester2, tester3};
		
		
		Developer developer1 = new Developer("Akhtam", "Male", "Java Developer", 126, 120000, 4);
        Developer developer2 = new Developer("Atilla", "Male", "C++ Developer", 127, 170000, 2);
        Developer developer3 = new Developer("Erhan", "Male", "Java Developer", 128, 195000, 1);
        Developer developer4 = new Developer("Ozzy", "Male", "Phyton Developer", 129, 115000, 4);

        
        Developer[] developers = { developer2, developer3, developer4};
        ArrayList <Developer> developers1 = new ArrayList<Developer>();
        
        developers1.add(developer4);
        
        
        
//        System.out.println(tester1);
//        System.out.println(developer1);
        
//        tester2.creatingTicket();
//        developer1.coding();
//        tester3.eat("banana");
        
        ScrumTeam scrumTeam= new ScrumTeam("Ali", "Veli", "Mehmet", developer3);
        System.out.println(scrumTeam);
        scrumTeam.addDeveloper(developer4);
        System.out.println(scrumTeam);
        scrumTeam.addTester(tester1);
        System.out.println(scrumTeam);
        
	}

}


/*Actions:
	addTester(Tester tester): adds the given tester to the testers arraylist

	addTesters(Tester[] testers): adds the given testers to the testers arraylist

	addDeveloper(Developer developer): adds the given developer to the developers arraylist

	addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

	removeTester(long employeeID): removes the given tester from the testers arraylist

	removeDeveloper(long employeeID): removes the developer from the developers arraylist

	toString(): prints number of tester,& developers,  PO name, SM name, BA name   */