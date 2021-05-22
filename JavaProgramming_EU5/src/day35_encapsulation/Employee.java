package day35_encapsulation;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	public Employee() {
		
		name = "";
		idNumber = 0;
		department ="";
		position = "";
	}	
	
	
	public Employee(String name, int idNumber) {
		this.name=name;
		this.idNumber=idNumber;
		this.department="";
		this.position="";
		
	}


	public Employee(String name, int idNumber, String department, String position) {
	
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}



	public String toString() {
		return "Employee [name=" + name + ", idNumber=" + idNumber + ", department=" + department + ", position="
				+ position + "]";
	}
		
		


}


/*Lab - Encapsulation

1-Employee Class

Write a class named Employee that the following fields.

	- name : The name field references a String object that holds the employee's name.
	- idNumber : The idNumber is an int variable that holds the employee's ID number.
	- department : The department field references a String object that holds the name of the department where employee work.
	- position : The position fields references a String object that holds the employee's jpb title

The class should have the following constructors:
	
	- A constructor that accepts the following values as arguments and assigns them to the appropriate fields: employee's name and ID number, department, and position.
	- A constructor that accepts the following values as arguments and assigns them to the appropriate fields: employee's name and ID number. The department and position fields should be assigned an empty string("").
	- A no-arg constructor that assigns empty strings("") to the name, department, and position fields, and 0 to the idNumber field.

Write appropriate mutator methods that store values in these fields and accessor methods that return the values in these fields. Once you have written the class, write a separate program that creates three Employee objects to hold the following data:

Name:           ID Number:       Department:         Position

Mike Smith.     47899            Accounting           VP 
Mark Jones.     39119            IT                   Developer
Tedd Britt.     81774            Sales				  Sales Person
*/