package day13_methods_partI;

public class C16_Task62 {

	public static void main(String[] args) {
		
		
		int x=15;
		int y=12;
		int z=17;
		
		greatestOne(5,2,3);
		greatestOne(x,y,z);
	}

	public static void greatestOne(int num1, int num2, int num3) {
		
		
		int result= (num1>num2 && num1>num3) ? num1 : (num2>num1 && num2>num3) ? num2 : num3;
		
		if (num1==num2 && num2==num3) {
			System.out.println(" all numbers are equal");
		}else {
			System.out.println(result + " is greatest number");
		}
		
	}
	

}
