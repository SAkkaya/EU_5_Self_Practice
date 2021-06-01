package day38_inheritance_part2;

public class FulltimeEmployee extends Employee{
	
	@Override   //--> annotation of Override means --> should be same name and same parameters ==>public void calculatePay2 () yazarsak hata verir
	public void calculatePay( int hours, double rate) {  // overriding yaprik same name but different parameters and calculation of method
		
		double total = ( hours * rate ) *1.05;
		System.out.println("Fulltime employee total pay:" + ( total ));
	}
	

}
