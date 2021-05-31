package week10_review;

public class Developer extends Employee{

	
	public int numOfPrLanguage;
	
	
	

	public Developer(String name, String gender, String jobTitle, int employeeId, double salary, int numOfPrLanguage) {
		super(name, gender, jobTitle, employeeId, salary);
		this.numOfPrLanguage = numOfPrLanguage;
	}

	public void coding() {
		System.out.println(name + " is coding..");
	}
	
	public void fixingBug() {
		System.out.println(name + " is fixing bugs");
	}

	// Bizde test type oldugu icin muhtarin yaptigindan extra birsey oldugu icin override yaptik ve to string koyduk
	public String toString() {
		return "Developer [numOfPrLanguage=" + numOfPrLanguage + ", name=" + name + ", gender=" + gender + ", jobTitle="
				+ jobTitle + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}


	
	
	
	
	

}





/*3. create a class called Developer
Attributes:
name, employeeID, JobTitle, Salary

Actions:
   coding(),  fixingBug(), toString()*/