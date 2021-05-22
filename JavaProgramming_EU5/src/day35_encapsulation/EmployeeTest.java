package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		Employee  e2 = new Employee ("Mark", 392119);
		Employee e3 = new Employee ("Tedd ", 817283, "Sales",  "Sales Person");
		
		System.out.println(e1.getName()+ "|" + e1.getIdNumber() + "|" + e1.getDepartment()+
				"|"+ e1.getPosition());  //|0||
		
		System.out.println(e2.getName()+ "|" + e2.getIdNumber() + "|" + e2.getDepartment()+
				"|"+ e2.getPosition());  //Mark|392119||
		
		System.out.println(e3.getName()+ "|" + e3.getIdNumber() + "|" + e3.getDepartment()+
				"|"+ e3.getPosition());  //Tedd |817283|Sales|Sales Person

		
		//Encapsulation as below ==>setting and getting 
		
		e1.setName("Mike");
		e1.setIdNumber(89778);
		e1.setDepartment("Accounting");
		e1.setPosition("VP");
		
		System.out.println(e1.getName()+ "|" + e1.getIdNumber() + "|" + e1.getDepartment()+
				"|"+ e1.getPosition());  //Mike|89778|Accounting|VP
		
		System.out.println(e1.toString()); // call the method  ==> public String toString() 
		//Employee [name=Mike, idNumber=89778, department=Accounting, position=VP]
		
	}

}
