package assignment3_arithmeticoperator;

public class Question5 {

	public static void main(String[] args) {
		
		int hours, minutes, seconds;
		
		int inputSeconds=3695;
		
		hours=inputSeconds/3600;
		System.out.println(hours);//1
		
		minutes=(inputSeconds%3600)/60;
		
		System.out.println(minutes); //1
		
		seconds=(inputSeconds%3600)%60;
		
		System.out.println(seconds);//35
		
		

	   System.out.println(hours+" hours"+minutes+" minutes, and "+seconds+" seconds");

	}

}
