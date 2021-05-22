package day20_stringManipulation_part2;

public class C1_String_IndexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		
		System.out.println(word1.indexOf("g"));  //0
		System.out.println(word1.indexOf("th"));  //2
		System.out.println(word1.indexOf("hub"));  //3

		System.out.println(word1.indexOf("java"));  // -1  false yani

		
		String url ="www.okta.com";
		int i=url.indexOf(".");			
		System.out.println("Position of . " + i); //position of . 3
		
		System.out.println(url.charAt(i+1)); //o
		
		
		//find posiiton of '-' and check if space is on right and left side
		
		String title = "Java - Google Search";
		
		int dash=title.indexOf('-');
		System.out.println(dash);//5
		System.out.println(title.charAt(dash-1));// 5 in altinda space birakti 
		System.out.println(title.charAt(dash+1));//space in altinda bir soace daha birakti 
		System.out.println("Apple"); // sonra apple yazdirdi space in altina
		
		//boolean var =title.contains(" ");
		//System.out.println(var); //  true
		
		String country ="United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of states:" + states);//Position of states:7
		
		
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		
		//1) contains()
		
		if (word2.contains("c++")) {
			System.out.println("c++ is there"); //c++ is there
		}else {
			System.out.println("c++ is not there");
		}
		
		//2.)indexOf()
		 
		if (word2.indexOf("c++")>-1) {    
			System.out.println("c++ is there");  //c++ is there
		}else {
			System.out.println("c++ is not there");  // yokda return -1 veriyor varsa -1 den buyuk 0 dahil index nosunu verecek
		}
	
		
		
	}

}
