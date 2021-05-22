package day4_aritmetic_operators;

public class C1_arithmeticOpertors {

	public static void main(String[] args) {
		// Addition Operator +
		
		System.out.println(55+5); //60
		int chairs=140;
		System.out.println(chairs+2); //142
		System.out.println(chairs); //140
		//chairs=chairs+2;
		
		int moreChairs=chairs+5;
		//System.out.println(moreChairs); //147
		
		int tables=130;
		int total=tables+chairs;
		
		System.out.println(total); //270
		
		//Substraction -
		double balance=1200.50;
		double transaction=56.44;
		
		System.out.println(balance-transaction);
		balance=balance-transaction;
		
		System.out.println(balance);
		
		// Create a variable linesOfCode and assign 50 and print "Lines of code 50"
		//delete 2 lines
		// decrease the value of linesOf Codes by 2 and print "Lines of Code 48
		
		int linesOfCode=50;
		System.out.println("lines of Code " + linesOfCode);
		
		linesOfCode=linesOfCode-2;
		System.out.println("lines of Code " + linesOfCode);
		
		//Multiplication *
		System.out.println(22*2);
		System.out.println(11*0); //0
		int classes=5;
		System.out.println(linesOfCode * classes);  //240
		int totalLinesOfCode=linesOfCode * classes;
		System.out.println("Total Lines Of Codes = " + totalLinesOfCode);
		
		// Division /
		System.out.println(10/2); //5
		System.out.println(60/3);//20
		//System.out.println(11/0); // throw error while running the code  /by zero!!!
		
		
		//Remainder %
		
		System.out.println(10%2);  // 0
		System.out.println(9%2);   // 1
	}

}
