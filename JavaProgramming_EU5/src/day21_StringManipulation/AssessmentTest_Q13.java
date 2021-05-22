package day21_StringManipulation;

public class AssessmentTest_Q13 {

	public static void main(String[] args) {
		
		String str ="JavaScript";
		System.out.println(getMesg(str));  //Input value must be smaller than x

	}

	public static String getMesg(String x) {
		
		String msg ="Input value must be ";
		msg=msg.concat("smaller than x");
		
		msg.replace("X", x);
		//msg=msg.replace("x", x);   //Input value must be smaller than JavaScript

		
		String rest = " and larger than 0";
		
		msg.concat(rest);
		
		return msg;
	}

}
