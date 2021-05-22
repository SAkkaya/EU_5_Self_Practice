package day20_stringManipulation_part2;

public class C2_String_IndexOf2 {

	public static void main(String[] args) {
		//index of with 2 values
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5);  //13
		//int secondDash = list.indexOf("-", firstDash+1);		 //13
		System.out.println(secondDash);	
		

		int thirdDash = list.indexOf("-", secondDash+1);		 //21
		System.out.println(thirdDash);	
		
		//method 1 -->lastIndexOf()
		int lastDash = list.lastIndexOf("-");	    //29   
		System.out.println(lastDash);	
		
		//method 2 -->indexOf()
	
//		int lastDash = list.indexOf("-", thirdDash+1);		 //29
//		System.out.println(lastDash);	
//		
		  

	}

}
