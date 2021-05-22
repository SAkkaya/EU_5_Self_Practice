package week8;

public class Employee {
	
	
	public String name, jobTitle;  //instance variable  
	public int ID;
	public double salary;
	
	
	
	public Employee(String name, String jobTitle, int iD, double salary) {  // local variables
		//allows us to initialize all instances of Employee object
		
		
		// soltaraf instance variable     sag taraf local variables
		this.name = name;
		this.jobTitle = jobTitle;
		ID = iD;  // they are two different word so no cevessary to use this
		this.salary = salary;
		
	}



	
	public String toString() {   ////allows us to print the Employee object
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", ID=" + ID + ", salary=" + salary + "]";
	}
	
	/*
	conde snippet:
		```
		codes
		```
	*/

	

}
