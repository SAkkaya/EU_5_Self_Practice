package day38_inheritance_part2;

public class CompanyTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();     
		FulltimeEmployee ft = new FulltimeEmployee();   // overriding yaprik same name but different parameters and calculation of method
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40,40);
		ct.calculatePay(40, 40);
		
	}

}
