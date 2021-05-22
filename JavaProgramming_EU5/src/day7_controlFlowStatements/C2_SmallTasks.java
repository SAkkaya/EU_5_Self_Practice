package day7_controlFlowStatements;

public class C2_SmallTasks {

	public static void main(String[] args) {
		/*
		 * Small Tasks 
		 * 1- Write an if statement that assigns 5 to x when y is equal to 20 
		 */

		int x, y;
		
		x=10;
		y=20;
		if (y == 20) {
			x= 5;

		} 
		
		System.out.println("x = " + x + ";  y = " + y);
		
		//2- Write an if statement that multiplies payrate by 1.5 if hours is greater than 40 
		
		double hours=50;
		double payRate=1000;
		
		if(hours>40) {
			payRate=payRate*1.5;
		
		}
		System.out.println("Payrate is = $" + payRate);
		
		// 3- Write an if statement that sets the variable fees to 50 if
		 //the Boolean variable max is true 
		
		boolean max = true;
		int fee=20;// bunu ilk atamamiz lazim 0 yada baska sayiya
		
		
		if(max==true) {    // if (max){   bu da olur max==> true boolean oldugu icin  
		
			fee=50;
			
		}
		System.out.println("fees = " + fee);
		
		//4- Write an if statement that assigns 20 to the variable a
		// if variable b is 50 and c is greater and equal to 100 
		
		int b=50, a=10, c=100;
		
		if (b==50 && c >=100 ) {
		
			a=20;
		
		}
		
		System.out.println("a =" + a);
		
	// 5- Write an if statement that prints Ideal Temp if the temp is between 70 and 80
		
		double temp=85;
		
		if(temp>=70 && temp<=80) { //&& operatorunde ilk kosul false ise ikincisine bakmiyor true ise ilki ilkincisine bakiyor
			
			System.out.println("Ideal Temp");

		} 

	}

}
