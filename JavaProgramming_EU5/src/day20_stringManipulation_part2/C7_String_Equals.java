package day20_stringManipulation_part2;

public class C7_String_Equals {

	public static void main(String[] args) {
		
		
		String str1="Apple";
		String str2=new String("Apple");
		
		String str3="Apple";
		
		System.out.println(str1==str2); //false   ==> '== '  ayni pool icinde mi yani ayni object mi ona bakiyor 
		
		System.out.println(str1==str3); //true   ==> '== '  ayni pool icinde , ayni object  
		
		System.out.println(str1.equals(str2)); //true  --ayni pool  //equals ise conte ayni mi ona bakiyor
		
		
		

	}

}
