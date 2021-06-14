package week9;

public class Employee {
	
	public String name, jobTitle;
	public int id;
	public double salary;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, String jobTitle) {
		this(name);       // sadece name ile constructiru cagirabilirsin ya da name ve job title ikisi birden
		this.jobTitle = jobTitle;
		
	}

	public Employee(String name, String jobTitle, int id) {
	//	this(name);  // sadece bir tane constructor cagirabiliriz ikinciye izin vermez, hata verir ikincisi
		this(name, jobTitle); 
		this.id = id;
	}

	public Employee(String name, String jobTitle, int id, double salary) {
		/*
		this.name = name;
		this.jobTitle = jobTitle;
		this.id = id; */             
		this(name, jobTitle, id);     // yukaridaki 3 unun  kisaltilmis hali bu, bu sekilde cagirabiliriz hepsini tek satirda
		this.salary = salary;
	}

	


	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", id=" + id + ", salary=$" + salary + "]";
	}

}


/*
			instance variables: 
					name, jobTitle, ID, salary
			1st constructor: initialize the name of the employee
			2d constructor: initialize the name, jobTitle of the employee
							(MUST apply constructor Call)
			3rd Constructor: initialize the name, jobTitle, ID of the employee
							(MUST apply constructor Call)
			4th Constructor: initialize all the instance of the employee
								(MUST apply constructor Call)
			Instance methods:
				toString()		
*/

