package self;

public class C9_MethodOperator {

	public static void main(String[] args) {
		
		operatorCalculate(10, 5, '*');
		operatorCalculate(10, 5, '/');
		operatorCalculate(10, 5, '+');
		operatorCalculate(10, 5, '-');
	}
	
	



	public static void operatorCalculate(double num1, double num2, char operator) {
		
		if (operator=='+') {
			System.out.println(num1+num2);
		}else if (operator=='-') {
			System.out.println(num1-num2);
		}else if(operator=='*'){
			System.out.println(num1*num2);
		}else if(operator=='/') {
			System.out.println(num1/num2);	
		}else {
			System.out.println("invalid operator");
		}
	}

}



