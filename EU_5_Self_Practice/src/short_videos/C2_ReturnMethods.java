package short_videos;

public class C2_ReturnMethods {

	public static void main(String[] args) {
		
		int number =40;
		
		
		
		System.out.println("Number practice");
		
		if (number <5) {
			System.out.println("END OF STORY");
			return;
		}
		
		System.out.println("more action 1");
		System.out.println("more action 2");
		System.out.println("more action 3");
		
		
		votingEligibility(10);
		votingEligibility(107);
		votingEligibility(0);
		votingEligibility(18);
		votingEligibility(19);


	}
	
	public static void votingEligibility (int age) {
		
		if (age<0 || age >100) {
			System.out.println("Invalid Age");
			return;
		}
		
		if (age>18) {
			System.out.println("Eligible");
			
		}else {
			System.out.println("NOT ELIGIBLE");
		}
	}
	

}
