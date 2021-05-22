package day4_aritmetic_operators;

public class C4_additionConcat {

	public static void main(String[] args) {
		
		// Number + Number =Addition
		
		System.out.println(2+2); //4
		
		// Number + String : Concatenation
		
		System.out.println(5+"hello"); //5hello
		
		//String+Boolean : Concatenation
		System.out.println("hello"+ true);  //hellotrue
		
		//String+String : Concatenation
		System.out.println("hello" + "world"); //helloworld
		
		//boolean + Number
		//System.out.println(true+1);   //it does not work  //baska java didindaki dillerde true=1 dir
		
		System.out.println(2+0+3+"Cybertek"); //5Cybertek
		
		System.out.println("Cybertek"+2+0+5);//Cybertek205
		System.out.println(2+0+5+"Cybertek"+2+0+5);//7Cybertek205
		
		System.out.println(2+0+5+"Cybertek"+(2+0+5));//7Cybertek7
		
		
		
		
		
		
	}

}
