package day5_unary_assignment_relational_operators;

public class C2_mixedInteger {

	public static void main(String[] args) {
		 
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 =20.5;
		
		int res1 = i1+ i2;   
		//double res5=i1 + i2;  //integer ya da daha buyuk
		//float res2 = i1 + f1; // always is the bigger comming
		double res3 = i2 + d1;
		
	
		short firstNumber=10;
		short secondNumber=20;
		
		//1. method
		int thirdNumber=firstNumber+secondNumber;
		//2. method
		//short thirdNumber= (short)firstNumber + secondNumber; // any aritmetic calculation islemi varsa ==toplama yapiyorsan short ve byte 
																//rakamlari herzaman integer a donusur sonuc da integer olur short degil
		
																//o yuzden casting yapmaliyiz
		//byte b1=20;
		//byte b2=2;
		//int b3 =b1*b2;  //	byte b3 =b1*b2;  --> hata verir
		//byte b4 =(byte)(b1*b2);
		
		
		int b1=126;
		int b2=1;
		
		byte res= (byte) (b1+b2); // Casting is required  -->variable oldugu icin b1 ve b2
		
		byte res2 =126 +1; // Casting is not required  --> byte icin de oldugu icin within the byte border oldugu icin ve variable olmadigi icin 
		
		
		
	}

}
