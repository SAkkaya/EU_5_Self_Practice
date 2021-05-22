package day4_aritmetic_operators;

public class C12_Task17 {

	public static void main(String[] args) {
		
		// Write a Java program that calculates the average of 3 numbers.
		
		
		double num1, num2, num3, average;
		
		num1=2.5;
		num2=4;
		num3=23.4;
		
		average=(num1+num2+num3)/3;
		
		System.out.println("avarege of the numbers is: "+ average);
		
		System.out.println("----------------------Casting---------");
		
		int x=130;
		//byte b=x;
		
		byte b=(byte)x;
		
		System.out.println(b);   //-126
		
		
		System.out.println("-------------------------------");
		
		int pies=10, people=4;
		double piecesPerson;
		piecesPerson=pies/people;
		System.out.println(piecesPerson);  // 2.0
		
		System.out.println("-------------------------------");
		
		int pies1=10, people1=4;
		double piecesPerson1;
		piecesPerson1=(double)pies1/people1;
		System.out.println(piecesPerson1);  // 2.5
		
		System.out.println("-------------------------------");
		int pies2=10, people2=4;
		double piecesPerson2;
		piecesPerson2=pies2/(double)people2;
		System.out.println(piecesPerson2);  // 2.5          int/double==>double
		
		System.out.println("-------------------------------");
		int pies3=10, people3=4;
		double piecesPerson3;
		piecesPerson3=(double)(pies3/people3);  //(double)(int/int)==> (double)int===>casting to double==double ==2.0
		System.out.println(piecesPerson3);  // 2.0
		
	}

}
