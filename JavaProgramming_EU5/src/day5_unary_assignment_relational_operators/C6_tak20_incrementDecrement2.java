package day5_unary_assignment_relational_operators;

public class C6_tak20_incrementDecrement2 {

	public static void main(String[] args) {
		
		int a=1;
		
			  int result= -a--  +  a++  / -a-- * --a;
		
		
		// a in memory : 1   - >   0 ->    1 - > 0 - > -1 
		//result       : -1 +    0      /  -1  * -1 => -1 + 0 * -1 = >  -1 +0 = > -1
		
		System.out.println ("a =" + a); // -1
		System.out.println ("result = " + result); // -1
	}

}
