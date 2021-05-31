package week10_review;

public class Employee {
	
	public String name,gender, jobTitle;
	public int employeeId;
	public double salary;
	

	

	public Employee(String name, String gender, String jobTitle, int employeeId, double salary) {
	
		this.name = name;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.employeeId = employeeId;
		this.salary = salary;
	}


	public void eat(String food) {
		System.out.println(this.name + " is eating "+ food);
	}
	
	
	public void sleep(int hours) {
		System.out.println(this.name  +  " is sleeping for " + hours + " hours ");
	}
	
	public void work(int hours) {
		System.out.println(this.name + "is working for "+ hours + " hours ");
	}

	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", jobTitle=" + jobTitle + ", employeeId=" + employeeId
				+ ", salary=" + salary + "]";
	}



	
	
	
	

}



/*1. create a class called Employee
name, employeeID, JobTitle, Salary
eat(), sleep(), work(), toString()

2. create a class called Tester
            Attributes:
                name, employeeID, JobTitle, Salary
               
            Actions:
                setInfo(), smokeTesting(),  creatingTicket(), toString()

3. create a class called Developer
            Attributes:
                name, employeeID, JobTitle, Salary

            Actions:
                   coding(),  fixingBug(), toString()

4. create a class called ScrumTeam
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




