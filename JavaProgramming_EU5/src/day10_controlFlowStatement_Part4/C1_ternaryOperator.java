package day10_controlFlowStatement_Part4;

public class C1_ternaryOperator {

	public static void main(String[] args) {
		
		String result;
		int score=88;
		
//		if (score>60) {
//			result="pass";
//		}else {
//			result="fail";
//		}
//		System.out.println(result);
		
		result = score>60 ? "pass" : "fail";
		System.out.println(result);
		
		int x=5;
		System.out.println(x>2 ? x<4 ? 10 : 8: 7); //8--> x=8
		
		if (x>2) { // x=8
			if (x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);  //8
			}
		}else {
			System.out.println(7);
		}
		
	}

}
