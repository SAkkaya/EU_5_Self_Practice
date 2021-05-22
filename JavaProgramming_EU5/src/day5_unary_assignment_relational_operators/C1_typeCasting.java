package day5_unary_assignment_relational_operators;

public class C1_typeCasting {

	public static void main(String[] args) {
		
		byte b;
		int i=81;
		double d=323.142;
		float f=72.38f;
		char c='A';
		
		c=(char)i;
		
		System.out.println("i = " + i + " c = "+ c);  //Q Ascii code 81
		
		i=(int)d;
		System.out.println("d = " + d + " i= " + i);
		
		i =(int) f;
		System.out.println ("f = "+ f + " i = " + i);
		
		b=(byte) d;  // loss of big data    ==> b char degeri ascii de 67
		
		System.out.println ("d = "+ d + " b = " + b);
		
		

	}

}
