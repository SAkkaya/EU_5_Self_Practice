package assignment3_arithmeticoperator;

public class Question7 {

	public static void main(String[] args) {
		

		int priceInCent=35; 
		
		int oneDollarInCent=100;  // 1 dollar =100 cents
		
		int change=oneDollarInCent-priceInCent;//65
		
		int quarter=change/25; // 2
		
		int dimes=(change%25)/10;//1
		
		int nickles=(change%25%10/5);//5
		
		
		System.out.println("priceInCent:"+priceInCent);
		
		System.out.println("your change is "+quarter+" quarter, "+dimes+" dimes, and  "+nickles+" nickles");
		
	}

}


















//int priceInCents=65;
//int change=100-priceInCents;
//int quarters=(change/25);
//int dimes=(change%25/10);
//int nickles=(change%25%10/5);
//System.out.println("priceInCent:"+priceInCents);
//System.out.println("your change is "+quarters+"quarter ,"+dimes+"dimes, and  "+nickles+"nickles");