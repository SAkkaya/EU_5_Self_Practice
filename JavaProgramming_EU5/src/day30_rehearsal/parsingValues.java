package day30_rehearsal;

public class parsingValues {

	public static void main(String[] args) {
		
		String numberAsString ="2018";
		System.out.println(numberAsString); //2018  String
		
		int number = Integer.parseInt(numberAsString);
		
		
		System.out.println(number);//2018  int
		
		numberAsString = numberAsString+1;
		number= number +1;
		
		
		System.out.println(numberAsString); //20181
		System.out.println(number); //2019
		
		double number2 = Double.parseDouble(numberAsString);
		System.out.println(number2); //20181.0
		
		int i=10;  //Integer dan String e cevirme 2 yontem var 
		String s= String.valueOf(i);//  1. Yontem   ==>convert int to String
		System.out.println(s); // it will return "10";
		
		String s2 = Integer.toString(i);  // 2. Yontem   ==>convert int to String
		System.out.println(s2); // it will return "10"
		
		
		

	}

}
