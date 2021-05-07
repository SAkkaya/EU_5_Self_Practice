package self;

public class C1_widening_narrowing {

	public static void main(String[] args) {
		
		byte b=10;
		short sh=20;
		
		//b=sh;  // will not compile
		
		sh=b;  // will compile
		
		//System.out.println(sh); will compile
	
		//short total= b + sh; // will not compile
		
		
		
		int total= b + sh;
		
		System.out.println(total);
		
		sh=100+2;
		
		//sh=b+2; will not compile
		
		double d=10.5;
		int i =4;
		
		// int j = d * i; //cannot convert double to int
		
		double j = d * i; 
		System.out.println(j); // 42.0
		
		
		double d2 =3.2;
		
		double d3 = d - d2;    //10.5 - 3.2
		
		System.out.println(d3); //7.3
		
		double d4 = d - i;
		System.out.println(d4); //6.5
		

		double d5 = i - d;
		System.out.println(d5); //-6.5
		
		int d6 = d - i; // will not compile
		
		

	}

}
