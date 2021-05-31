package week10_review;

public class Tester extends Employee{
	
	public String testType;
	
	
	public Tester(String name, String gender, String jobTitle, int employeeId, double salary, String testType) {
		super(name, gender, jobTitle, employeeId, salary);
		this.testType = testType;
	}

	public void smokeTesting() {
		System.out.println(name + " is executing smokeTesting...");
	}
	
	public void creatingTicket() {
		System.out.println(name + " is creating ticket");
	}


	// Bizde test type oldugu icin muhtarin yaptigindan extra birsey oldugu icin override yaptik ve to string koyduk
	public String toString() {
		return "Tester [testType=" + testType + ", name=" + name + ", jobTitle=" + jobTitle + ", employeeId="
				+ employeeId + ", salary=" + salary + "]";
	}


	

}


/*2. create a class called Tester
Attributes:
name, employeeID, JobTitle, Salary

Actions:
 smokeTesting(),  creatingTicket(), toString()*/


