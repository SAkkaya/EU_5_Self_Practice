package week10;


public class Tester extends Employee{

	public Tester(String name, String gender, String jobTitle, int employeeId, double salary) { //  Constructor kendi class adi ile yaratilir
		super(name, gender, jobTitle, employeeId, salary); // parents class constructor a cagirman icin gerekli 
		
	}
	
	public void smokingTesting() {
		System.out.println(name+" is smoke testing");
	}
	
	public void creatingTicket() {
		System.out.println(name+" is creating ticket");
	}
	
	
}

/*
create a class called Tester
Attributes:
    name, gender, employeeID, JobTitle, Salary
   
Actions:
     smokeTesting(),  creatingTicket(), toString()
*/
