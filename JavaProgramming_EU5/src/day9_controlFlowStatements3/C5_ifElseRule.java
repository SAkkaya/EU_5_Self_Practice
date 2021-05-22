package day9_controlFlowStatements3;

public class C5_ifElseRule {

	public static void main(String[] args) {
		
		if(false)                           //tek stament varsa {} gerek yok ama tercih edilmez!!! 
			System.out.println("Hello");  // ilk statement false kabul eder yazdirmaz
		else  //complain etmez tek line var yukarda
			System.out.println("Bye");  // ikinci stament true oldugu icin bunu yazdirir
		
		System.out.println("****************************");

		
		if (false)           //tek stament varsa {} gerek yok ama tercih edilmez!!!
			System.out.println("Hello");           // ilk statement false kabul eder yazdirmaz
			System.out.println("Running");  //Running             //ikinci stament true oldugu icin bunu yazdirir //alttaki else olmazsa yanliz
			
		//else            ==>complain eder yukarda iki line var. comment yapsakta ikinci satira yine komlain eder
			
			System.out.println("****************************");
	
		//	if (true)           //true olursa iki satirida yazdirir
		//	System.out.println("Hello");           // Hello
		//	System.out.println("Running");  //Running  	
			
	}

}
