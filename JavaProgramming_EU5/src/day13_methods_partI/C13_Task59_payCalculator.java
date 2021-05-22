package day13_methods_partI;

public class C13_Task59_payCalculator {

	public static void main(String[] args) {
	
		payCalculator(40, 50);
		
		payCalculator(50, 62.50);
	}
	
	
	public static void payCalculator( double hours, double hourlyPay) {
	
		double pay=hours*hourlyPay;
		
		System.out.println("Pay is " + pay);
		
	}
	

}
