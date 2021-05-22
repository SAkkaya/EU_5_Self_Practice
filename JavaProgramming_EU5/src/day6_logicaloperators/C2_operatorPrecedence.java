package day6_logicaloperators;

public class C2_operatorPrecedence {

	public static void main(String[] args) {
		
		
		
		int applesCount=20, orangesCount =30, pearsCount =30;
		
		boolean comp = applesCount < orangesCount || orangesCount >= pearsCount;
		
		//               20    < 30          ||  30 >= 30 ==> T  ||   ------- = T
		
		System.out.println(comp);// false
		
		
		System.out.println("************************************");
		
		
		String outsideWeather;
		
		int degree;
		outsideWeather="Shinny";
		
		degree=70;
		
		boolean comp2 = (!( outsideWeather == "Rainy"  || degree == 70));  // (! ( F || T)  => !T => false
		
		System.out.println(comp2);
		
		
		System.out.println("************************************");
		
		int b =2;
		
		boolean res = ++ b == 2 || --b ==2 && --b ==2;
		
		// b in memory: 2  = >  3 = > 2  = > 1
		
		// res        : 3 ==2 ||  2 == 2 &&  1 == 2;   // F || T  && F // F || F // F
		
		System.out.println("************************************");
		
		
		boolean  x = true, z = true;
		
		int y = 20;
		
		// x = ( y !=10) || ( z = false); // T || ----  // T 
		
		x = ( y !=10) && ( z = false); // T || ----  // T  && F // F   ......> ( z = false)   =    assignment not logical sign 
		
		System.out.println(x); 
		
		
	}

}
