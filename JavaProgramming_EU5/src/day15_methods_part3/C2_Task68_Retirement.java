package day15_methods_part3;

public class C2_Task68_Retirement {

	public static void main(String[] args) {
		
		//Write two methods:
//		1-calculateAge(yearBirth); and returns the age
//		2-yearsUntilRetirement(name,year); and displays in the console following: “Mike retires
//		in 36 years”
//		Example: yearsUntilRetirement(“Mike”,1990);
		
		
		//calculateAge(1990);  yazilmasa da oluyor
		
		yearsUntilRetirement("Mike", 1978);
		
	

	}

	public static void yearsUntilRetirement(String name, int year) {
		
		int retirementAge=65-calculateAge(year);
		
		System.out.println(name + " retires in " +  retirementAge + " years");
		
		
	}

	public static int calculateAge(int year) {    //int year ya da alttaki gibi yearBirth farkli isimler olabilir onemli 
													//	olan ayni method icinde isimlerin ayni olmasi
		
		return 2021 - year;  //year
		
		
//	public static int calculateAge(int yearBirth) {
			
//	return 2021 - yearBirth;  //year
		
		
		
	}

}
