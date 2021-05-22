package week1;

import jdk.tools.jaotc.collect.directory.DirectorySource;

public class C4_PrimitivesReview {
	
	/*
	 *primitives: byte, short, int, long, float, ouble
	 *			char, boolean
	 *
	 *	byte < short < int < long < float < double
	 *  smaller primitive can be assigned 
	 *
	 */
	
	public static void main(String[] args) {
		/*
		 *print salary in 4 different lines
		 */
		
		System.out.println(70000);
		System.out.println(70000);
		System.out.println(70000);
		System.out.println(70000);
		
		System.out.println("----------------------------------");
		
		/*
		 Variable: 
		 		DataType name=Value;
		 		
		 */
		
		int salary=70000;
		
		System.out.println(salary);
		System.out.println(salary);
		System.out.println(salary);
		System.out.println(salary);
		
		
		System.out.println("---------------------");
		double rate=0.5;
		double d1=(double)123;  //123.0,    --> implicit casting
		//		(double)int  ==> decimal
		
		
		System.out.println(d1);
		
		System.out.println("-----------------------------");
		
		char ch1 = 40000;
		System.out.println(ch1); //鱀
		
		char ch2 = 10000;
		System.out.println(ch2); //✐
		
		char ch3 = 65;  //A
		System.out.println(ch3); //A
		
		char ch4 ='%';
		char ch5 = 'Z';
		
		System.out.println(ch4); //%
		System.out.println(ch5); //Z
		
		char ch6 ='$'; //36
		System.out.println(ch3 + ch6);//65+36=101  
		
		System.out.println("-----------------------------");
		
		boolean isEmployed = false;
		boolean isMarried = true;
		
		boolean r1=10<8;
		boolean r2=11>10;
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("---------------------------------");
		
		String name = "Muhtar";
		
		
		/*
		float salary =70000;  //implicit casting  //(float)70000; otomatik olarak backgrounda yapiyor
		
		long number =9999999999L;
		
		float f=number;
		
		long l=(long)f; //explicit casting
		*/
		
		
		
		
	}
	
}
