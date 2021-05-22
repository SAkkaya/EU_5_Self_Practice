package day30_rehearsal;

public class Boxing{

	public static void main(String[] args) {
		// AutoBoxing --> primitive to object
		
		Integer num1 = 1234; //AutoBoxing --> primitive to object
		
		int n =5;
		Integer num2 =n;
		
		//Unboxing --> object to primitive
		
		Double d1 = new Double (34.2); //creating just a object 
		double d2 =d1;  //unboxing   /primitive
		
		System.out.println("d1: " + d1); //d1: 34.2
		System.out.println("d2: " + d2);//d2: 34.2
		
		
		long l1= new Long(6000000L); // unboxing    // objecti primitive dataya atiyoruz ve unboxing yapiyiruz
		//long l1= new Long(6000000); //L siz de kabul ediyor   
		
		Long l2 = new Long (345699459);// no boxing    //object    --> burda wrapper class ile sifirdan object yaratiyoruz
		 
		long l3 =l2;  // unboxing  ==> objecten primitive a conversion var
		
		
//		Integer num12= 4; 
//		Integer num123 =num12;
//		System.out.println(num12); //4
//		System.out.println(num123);//4
		
		int x=345;
		double y = x;  // casting implicit-small to big one
		 
		Integer num3 = Integer.valueOf(345);
		//Double d3=num3;   // casting not possible with wrapper classes  !!!!!!!IMPORTANT INTERVIEW PERSPECTIVE !!!!
		
		
		
		Integer num =new Integer(1234); 	  //aynisi value.of ile eski versiyonu 
		System.out.println(num+1);  //1235
		
		
		Integer num5 = new Integer(345);
		System.out.println(num5+1);//346
		Integer num6 = new Integer("345");
		System.out.println(num5+1);//346


		int count2 = Integer.valueOf("56565");
		System.out.println(count2);//56565
		System.out.println(count2+1);//56566
		
		
		int count = Integer.parseInt("345356");
		System.out.println(count);//345356
		System.out.println(count+1);//345357

	}

}
