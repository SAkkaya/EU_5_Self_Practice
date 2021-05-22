package day13_methods_partI;

public class C15_Task61_AgeCalculater {

	public static void main(String[] args) {
		
		
		calculateAge(2021,2000);
		calculateAge(2021,2012);

	}
	
	public static void calculateAge(int currentYear, int birthYear) {
		
		int age=currentYear-birthYear;
		System.out.println(age);
		
	}
	

}
