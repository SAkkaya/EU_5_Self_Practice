package muhtar_only;

public class C2_Remainder {

	public static void main(String[] args) {
		
	
	        int a=15;
	        int b=5;
	        int result=remainder(a,b);
	        System.out.println(result);
	    }

	    private static int remainder(int a, int b) {
	  int num1=a;
	 int num2=b;


	        while(num1>=num2){
	            num1=num1-num2;
	        }

	     return num1;
	    }
	}
