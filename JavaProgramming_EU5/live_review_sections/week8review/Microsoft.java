package week8review;

public class Microsoft {

	public static void main(String[] args) {

		//Employee emp1=new Employee("Ahmed","SDET",123, 100000);
		Employee [] testers= {new Employee("Kunduz","SDET",321, 150000),
				new Employee("Zeli","QE",321, 950000),
				new Employee("Murat","QA",789, 105000),
				new Employee("Bunyamin","SDET",853, 110000),
		};
		
		
//		emp1.ID=123;
//		emp1.jobTitle="SDET";
//		emp1.name="Ahmed";
//		emp1.salary=100000;
		
		double maxSalary =0;//150000
		//double maxSalary =Double.MIN_VALUE;
		double minSalary=Double.MAX_VALUE;
		
		//System.out.println(Arrays.toString(testers));
		
		
		String nameOfMaxSalary ="";
		String nameOfMinSalary = "";
		
		for (Employee  each  : testers) {
			
			if (each.salary >maxSalary) {
				maxSalary = each.salary;
				nameOfMaxSalary=each.name;
			}
			
			if (each.salary < minSalary) {
				minSalary = each.salary;
				nameOfMinSalary= each.name;
				
			}
			
		}
		
		System.out.println("max: " + maxSalary);
		System.out.println("min: " + minSalary);
		
		System.out.println(nameOfMaxSalary + "has max salary");
		System.out.println(nameOfMinSalary + "has min salary");
		

		
	}

}
